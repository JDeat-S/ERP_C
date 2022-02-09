package Semanal.Vales;

import Conexion.ConexionSQL;
import Logicas.Logica_permisos;
import Logicas.Logica_usuarios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author JDeat
 */
public final class VDE extends javax.swing.JFrame implements Printable {

    int xMouse, yMouse;
    Logica_usuarios usr;
    Logica_permisos LP;
    Calendar fecha_actual = new GregorianCalendar();
    private final String[] UNIDADES = {"", "un ", "dos ", "tres ", "cuatro ", "cinco ", "seis ", "siete ", "ocho ", "nueve "};
    private final String[] DECENAS = {"diez ", "once ", "doce ", "trece ", "catorce ", "quince ", "dieciseis ",
        "diecisiete ", "dieciocho ", "diecinueve", "veinte ", "treinta ", "cuarenta ",
        "cincuenta ", "sesenta ", "setenta ", "ochenta ", "noventa "};
    private final String[] CENTENAS = {"", "ciento ", "doscientos ", "trecientos ", "cuatrocientos ", "quinientos ", "seiscientos ",
        "setecientos ", "ochocientos ", "novecientos "};
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    double BM = 1000, BQ = 500, BD = 200, BC = 100, BCIN = 50, BV = 20,
            MV = 20, MD = 10, MC = 5, MDOS = 2, MU = 1, MCENT = 0.50, DEN;

    public VDE() {
        initComponents();
        Fecha.setCalendar(fecha_actual);
        Fecha1.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        MNV();

    }

    public VDE(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        Fecha.setCalendar(fecha_actual);
        Fecha1.setCalendar(fecha_actual);
        this.usr = usr;
        this.LP = LP;
        this.setLocationRelativeTo(null);
        MNV();
    }

    public void MNV() {
        String SQL = "SELECT `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'confort2022'"
                + " AND TABLE_NAME = 'semanal.vales'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                NV.setText("" + Integer.parseInt(rs.getString("AUTO_INCREMENT")));
                NV1.setText("" + Integer.parseInt(rs.getString("AUTO_INCREMENT")));

            }
            st.isClosed();
            rs.isClosed();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al obtener utimo vale registrado: " + e);

        }
    }

    public void agregarvale() {

        String SQL = "INSERT INTO `semanal.vales` (`#vale`, `buenopor`, `Recibi de`, `Concepto`, `en`, `fecha`, `BPescrito`) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NV.getText()));
            pst.setString(2, Importe.getText());
            pst.setString(3, RD.getText());
            pst.setString(4, Concepto.getText());
            pst.setString(5, En.getText());
            pst.setString(6, ((JTextField) Fecha.getDateEditor().getUiComponent()).getText());
            pst.setString(7, ImporteEsc.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Vale registrado.");

            try {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable((Printable) this);
                job.printDialog();
                job.print();
            } catch (PrinterException ex) {
            }
            NV.setText("0");
            Importe.setText("");
            RD.setText("");
            Concepto.setText("");
            En.setText("");
            Fecha.setDate(null);
            ImporteEsc.setText("");
            NV1.setText("0");
            Importe1.setText("");
            RD1.setText("");
            Concepto1.setText("");
            En1.setText("");
            Fecha1.setDate(null);
            ImporteEsc1.setText("");
            MNV();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar vale");
        }
    }

    public String Convertir(String numero, boolean mayusculas) {
        String literal = "";
        String parte_decimal;
        //si el numero utiliza (.) en lugar de (,) -> se reemplaza
        numero = numero.replace(".", ",");
        //si el numero no tiene parte decimal, se le agrega ,00
        if (!numero.contains(",")) {
            numero = numero + ",00";
        }
        //se valida formato de entrada -> 0,00 y 999 999 999,00
        if (Pattern.matches("\\d{1,9},\\d{1,2}", numero)) {
            //se divide el numero 0000000,00 -> entero y decimal
            String Num[] = numero.split(",");
            //de da formato al numero decimal
            parte_decimal = ", " + Num[1] + "¢ Pesos";
            //se convierte el numero a literal
            if (Integer.parseInt(Num[0]) == 0) {//si el valor es cero
                literal = "cero ";
            } else if (Integer.parseInt(Num[0]) > 999999) {//si es millon
                literal = getMillones(Num[0]);
            } else if (Integer.parseInt(Num[0]) > 999) {//si es miles
                literal = getMiles(Num[0]);
            } else if (Integer.parseInt(Num[0]) > 99) {//si es centena
                literal = getCentenas(Num[0]);
            } else if (Integer.parseInt(Num[0]) > 9) {//si es decena
                literal = getDecenas(Num[0]);
            } else {//sino unidades -> 9
                literal = getUnidades(Num[0]);
            }
            //devuelve el resultado en mayusculas o minusculas
            if (mayusculas) {
                return (literal + parte_decimal).toUpperCase();
            } else {
                return (literal + parte_decimal);
            }
        } else {//error, no se puede convertir
            return literal = null;
        }
    }

    /* funciones para convertir los numeros a literales */
    private String getUnidades(String numero) {// 1 - 9
        //si tuviera algun 0 antes se lo quita -> 09 = 9 o 009=9
        String num = numero.substring(numero.length() - 1);
        return UNIDADES[Integer.parseInt(num)];
    }

    private String getDecenas(String num) {// 99                        
        int n = Integer.parseInt(num);
        if (n < 10) {//para casos como -> 01 - 09
            return getUnidades(num);
        } else if (n > 19) {//para 20...99
            String u = getUnidades(num);
            if (u.equals("")) { //para 20,30,40,50,60,70,80,90
                return DECENAS[Integer.parseInt(num.substring(0, 1)) + 8];
            } else {
                return DECENAS[Integer.parseInt(num.substring(0, 1)) + 8] + "y " + u;
            }
        } else {//numeros entre 11 y 19
            return DECENAS[n - 10];
        }
    }

    private String getCentenas(String num) {// 999 o 099
        if (Integer.parseInt(num) > 99) {//es centena
            if (Integer.parseInt(num) == 100) {//caso especial
                return " cien ";
            } else {
                return CENTENAS[Integer.parseInt(num.substring(0, 1))] + getDecenas(num.substring(1));
            }
        } else {//por Ej. 099 
            //se quita el 0 antes de convertir a decenas
            return getDecenas(Integer.parseInt(num) + "");
        }
    }

    private String getMiles(String numero) {// 999 999
        //obtiene las centenas
        String c = numero.substring(numero.length() - 3);
        //obtiene los miles
        String m = numero.substring(0, numero.length() - 3);
        String n = "";
        //se comprueba que miles tenga valor entero
        if (Integer.parseInt(m) > 0) {
            n = getCentenas(m);
            return n + "mil " + getCentenas(c);
        } else {
            return "" + getCentenas(c);
        }

    }

    private String getMillones(String numero) { //000 000 000        
        //se obtiene los miles
        String miles = numero.substring(numero.length() - 6);
        //se obtiene los millones
        String millon = numero.substring(0, numero.length() - 6);
        String n = "";
        if (millon.length() > 1) {
            n = getCentenas(millon) + "millones ";
        } else {
            n = getUnidades(millon) + "millon ";
        }
        return n + getMiles(miles);
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        //Punto donde empezará a imprimir dentro la pagina (100, 50)
        g2d.translate(pageFormat.getImageableX() + 100,
                pageFormat.getImageableY() + 50);
        g2d.scale(0.50, 0.50); //Reducción de la impresión al 50%
        jPanel1.printAll(graphics);
        return PAGE_EXISTS;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngen = new javax.swing.JPanel();
        txtbtngen = new javax.swing.JLabel();
        Harder1 = new javax.swing.JPanel();
        Move = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Importe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        RD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Concepto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        En = new javax.swing.JTextField();
        Fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        ImporteEsc = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        NV1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Importe1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        RD1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Concepto1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        En1 = new javax.swing.JTextField();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        ImporteEsc1 = new javax.swing.JTextArea();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        B1000 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        B500 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        B200 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        B100 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        B50 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        B20 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        M1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        M10 = new javax.swing.JTextField();
        M050 = new javax.swing.JTextField();
        M20 = new javax.swing.JTextField();
        M2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        M5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        SB1000 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        SB500 = new javax.swing.JTextField();
        SB200 = new javax.swing.JTextField();
        SB100 = new javax.swing.JTextField();
        SB50 = new javax.swing.JTextField();
        SB20 = new javax.swing.JTextField();
        SM20 = new javax.swing.JTextField();
        SM10 = new javax.swing.JTextField();
        SM5 = new javax.swing.JTextField();
        SM2 = new javax.swing.JTextField();
        SM1 = new javax.swing.JTextField();
        SM050 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        btnexit = new javax.swing.JPanel();
        txtbtnexit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngen.setBackground(new java.awt.Color(255, 255, 255));

        txtbtngen.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtbtngen.setForeground(new java.awt.Color(0, 0, 0));
        txtbtngen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtngen.setText("Agregar vale.");
        txtbtngen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtngen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbtngenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtbtngenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtbtngenMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btngenLayout = new javax.swing.GroupLayout(btngen);
        btngen.setLayout(btngenLayout);
        btngenLayout.setHorizontalGroup(
            btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btngenLayout.createSequentialGroup()
                .addComponent(txtbtngen, javax.swing.GroupLayout.PREFERRED_SIZE, 940, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btngenLayout.setVerticalGroup(
            btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtngen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(btngen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 940, 70));

        Harder1.setBackground(new java.awt.Color(255, 255, 255));
        Harder1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Harder1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Harder1MouseDragged(evt);
            }
        });
        Harder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Harder1MousePressed(evt);
            }
        });

        Move.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Move.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move.setText("Vale de efectivo");
        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
        });
        Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Harder1Layout = new javax.swing.GroupLayout(Harder1);
        Harder1.setLayout(Harder1Layout);
        Harder1Layout.setHorizontalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 894, Short.MAX_VALUE)
                .addContainerGap())
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Harder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("A-22");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, 20));

        NV.setText("0");
        NV.setBorder(null);
        NV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NVKeyReleased(evt);
            }
        });
        jPanel1.add(NV, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 90, 20));

        jLabel2.setText("Bueno por:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        Importe.setText("0");
        Importe.setBorder(null);
        Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImporteKeyReleased(evt);
            }
        });
        jPanel1.add(Importe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 120, 20));

        jLabel3.setText("Recibi de:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        RD.setBorder(null);
        RD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RDKeyReleased(evt);
            }
        });
        jPanel1.add(RD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 160, 20));

        jLabel4.setText("Cantidad de:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel5.setText("Concepto:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        Concepto.setBorder(null);
        Concepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ConceptoKeyReleased(evt);
            }
        });
        jPanel1.add(Concepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 250, 20));

        jLabel6.setText("En:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        En.setBorder(null);
        En.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EnKeyReleased(evt);
            }
        });
        jPanel1.add(En, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 120, 20));

        Fecha.setDateFormatString("'A' d 'de' MMMM 'de' y");
        Fecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FechaMousePressed(evt);
            }
        });
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 200, -1));

        ImporteEsc.setColumns(20);
        ImporteEsc.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ImporteEsc.setLineWrap(true);
        ImporteEsc.setRows(5);
        jScrollPane1.setViewportView(ImporteEsc);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 222, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel7.setText("DE MEXICO S.A DE C.V");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, -1));

        jLabel8.setText("RECIBO DE DINERO.");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logovale.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 10));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 340, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 170, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 90, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 250, 10));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel10.setText("A-22");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 30, 20));

        NV1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        NV1.setText("0");
        NV1.setBorder(null);
        jPanel2.add(NV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 40, 120, 20));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Bueno por:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 57, 20));

        Importe1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        Importe1.setText("0");
        Importe1.setBorder(null);
        Importe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe1KeyReleased(evt);
            }
        });
        jPanel2.add(Importe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 100, 20));

        jLabel12.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Recibi de:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 45, 20));

        RD1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        RD1.setBorder(null);
        jPanel2.add(RD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 165, 20));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel13.setText("Cantidad de:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel14.setText("Concepto:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, -1, -1));

        Concepto1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        Concepto1.setBorder(null);
        jPanel2.add(Concepto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 200, 20));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel15.setText("En:");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 30, -1));

        En1.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        En1.setBorder(null);
        jPanel2.add(En1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, 20));

        Fecha1.setDateFormatString("'A' d 'de' MMMM 'de' y");
        jPanel2.add(Fecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 200, -1));

        ImporteEsc1.setColumns(20);
        ImporteEsc1.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        ImporteEsc1.setLineWrap(true);
        ImporteEsc1.setRows(5);
        jScrollPane2.setViewportView(ImporteEsc1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, -1));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel16.setText("CONFORT SERVICE");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel17.setText("RECIBO DE DINERO.");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logovale.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 100, 10));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 200, 10));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 120, 10));
        jPanel2.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 120, 10));
        jPanel2.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 90, 130, 10));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel19.setText("PRESTIGE DE MEXICO S.A DE C.V");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));
        jPanel2.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 170, 10));

        jLabel20.setText("Recibe");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));
        jPanel2.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 160, 10));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("# Vale");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 50, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 480, 250));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 120, 10));

        jLabel21.setText("Recibe");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel22.setText("# Vale");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, -1, 20));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 120, 10));

        jLabel24.setText("Entrega");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel25.setText("Denominacion.");

        jLabel26.setText("$1000");

        B1000.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                B1000KeyReleased(evt);
            }
        });

        jLabel27.setText("$500");

        jLabel28.setText("$200");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Billete");

        jLabel31.setText("$100");

        jLabel32.setText("$50");

        jLabel33.setText("$20");

        jLabel34.setText("$20");

        jLabel35.setText("$2");

        jLabel38.setText("$10");

        jLabel39.setText("$1");

        jLabel36.setText("$5");

        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("Moneda");

        jLabel37.setText("$0,50");

        jLabel41.setText("Cantidad");

        jLabel42.setText("Cantidad");

        jLabel43.setText("Subtotal");

        jLabel44.setText("Subtotal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(B1000, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SB1000, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel31)
                                                    .addComponent(jLabel32)
                                                    .addComponent(jLabel33))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(B100, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(B200, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(B500, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SB500, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SB200, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SB100, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SB50, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SB20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel43)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel34)
                                        .addComponent(jLabel38))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(M20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(M10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel36)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(M5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel39)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel35)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel37)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(M050, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(1, 1, 1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel44))
                    .addComponent(SM20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SM10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SM5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SM2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SM1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SM050, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel41)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(B1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SB1000, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SB500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(B500, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SB200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(B200, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(SB100, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(B50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32)
                            .addComponent(SB50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(B20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SB20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel40)
                                .addComponent(jLabel42)
                                .addComponent(jLabel44))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel34)
                                .addComponent(M20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(M10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel38))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(M5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel36))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel35)
                                .addComponent(M2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(M1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel39))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(M050, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel37)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(SM20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SM10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SM5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SM2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SM1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(SM050, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 480, 240));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel30.setText("CONFORT SERVICE PRESTIGE ");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 490));

        btnexit.setBackground(new java.awt.Color(255, 255, 255));

        txtbtnexit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtbtnexit.setForeground(new java.awt.Color(0, 0, 0));
        txtbtnexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnexit.setText("x");
        txtbtnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnexitLayout = new javax.swing.GroupLayout(btnexit);
        btnexit.setLayout(btnexitLayout);
        btnexitLayout.setHorizontalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

    private void Harder1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Harder1MouseDragged

    private void Harder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Harder1MousePressed

    private void ImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyReleased
        Importe1.setText(Importe.getText());
        ImporteEsc.setText(Convertir(Importe.getText(), true));
        ImporteEsc1.setText(ImporteEsc.getText());
    }//GEN-LAST:event_ImporteKeyReleased

    private void Importe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe1KeyReleased
        ImporteEsc1.setText(Convertir(Importe1.getText(), true));
    }//GEN-LAST:event_Importe1KeyReleased

    private void NVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NVKeyReleased
        NV1.setText(NV.getText());
    }//GEN-LAST:event_NVKeyReleased

    private void ConceptoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ConceptoKeyReleased
        Concepto1.setText(Concepto.getText());
    }//GEN-LAST:event_ConceptoKeyReleased

    private void EnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnKeyReleased
        En1.setText(En.getText());
    }//GEN-LAST:event_EnKeyReleased

    private void RDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RDKeyReleased
        RD1.setText(RD.getText());
    }//GEN-LAST:event_RDKeyReleased

    private void txtbtngenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtngenMouseClicked
        agregarvale();
    }//GEN-LAST:event_txtbtngenMouseClicked

    private void txtbtngenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtngenMouseEntered
        btngen.setBackground(Color.green);
        txtbtngen.setForeground(Color.black);
    }//GEN-LAST:event_txtbtngenMouseEntered

    private void txtbtngenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtngenMouseExited
        btngen.setBackground(Color.white);
        txtbtngen.setForeground(Color.black);
    }//GEN-LAST:event_txtbtngenMouseExited

    private void txtbtnexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseExited
        btnexit.setBackground(Color.white);
        txtbtnexit.setForeground(Color.black);
    }//GEN-LAST:event_txtbtnexitMouseExited

    private void txtbtnexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseEntered
        btnexit.setBackground(Color.red);
        txtbtnexit.setForeground(Color.white);
    }//GEN-LAST:event_txtbtnexitMouseEntered

    private void txtbtnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtbtnexitMouseClicked

    private void FechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FechaMousePressed
        Fecha1.setDate(Fecha.getDate());
    }//GEN-LAST:event_FechaMousePressed

    private void B1000KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_B1000KeyReleased
       
        SB1000.setText("" + (BM * Double.parseDouble(B1000.getText())));
    }//GEN-LAST:event_B1000KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VDE().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField B100;
    private javax.swing.JTextField B1000;
    private javax.swing.JTextField B20;
    private javax.swing.JTextField B200;
    private javax.swing.JTextField B50;
    private javax.swing.JTextField B500;
    private javax.swing.JTextField Concepto;
    private javax.swing.JTextField Concepto1;
    private javax.swing.JTextField En;
    private javax.swing.JTextField En1;
    private com.toedter.calendar.JDateChooser Fecha;
    private com.toedter.calendar.JDateChooser Fecha1;
    private javax.swing.JPanel Harder1;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Importe1;
    private javax.swing.JTextArea ImporteEsc;
    private javax.swing.JTextArea ImporteEsc1;
    private javax.swing.JTextField M050;
    private javax.swing.JTextField M1;
    private javax.swing.JTextField M10;
    private javax.swing.JTextField M2;
    private javax.swing.JTextField M20;
    private javax.swing.JTextField M5;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NV;
    private javax.swing.JTextField NV1;
    private javax.swing.JTextField RD;
    private javax.swing.JTextField RD1;
    private javax.swing.JTextField SB100;
    private javax.swing.JTextField SB1000;
    private javax.swing.JTextField SB20;
    private javax.swing.JTextField SB200;
    private javax.swing.JTextField SB50;
    private javax.swing.JTextField SB500;
    private javax.swing.JTextField SM050;
    private javax.swing.JTextField SM1;
    private javax.swing.JTextField SM10;
    private javax.swing.JTextField SM2;
    private javax.swing.JTextField SM20;
    private javax.swing.JTextField SM5;
    private javax.swing.JPanel btnexit;
    private javax.swing.JPanel btngen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JLabel txtbtngen;
    // End of variables declaration//GEN-END:variables
}
