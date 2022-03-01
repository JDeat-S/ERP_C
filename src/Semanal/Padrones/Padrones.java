package Semanal.Padrones;

import Semanal.Vales.*;
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
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author JDeat
 */
public final class Padrones extends javax.swing.JFrame implements Printable {

    int xMouse, yMouse;
    Logica_usuarios usr;
    Logica_permisos LP;
    Calendar fecha_actual = new GregorianCalendar();
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    double BM = 1000, BQ = 500, BD = 200, BC = 100, BCIN = 50, BV = 20,
            MV = 20, MD = 10, MC = 5, MDOS = 2, MU = 1, MCENT = 0.50;

    public Padrones() {
        initComponents();
        EDF zz8 = new EDF();
        DefaultComboBoxModel modelzonas8 = new DefaultComboBoxModel(zz8.mostrarzonas());
        Entr.setModel(modelzonas8);
        Entr1.setModel(modelzonas8);
        Fecha.setCalendar(fecha_actual);
        Fecha1.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        MNV();

    }

    public Padrones(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        EDF zz8 = new EDF();
        DefaultComboBoxModel modelzonas8 = new DefaultComboBoxModel(zz8.mostrarzonas());
        Entr.setModel(modelzonas8);
        Entr1.setModel(modelzonas8);
        Fecha.setCalendar(fecha_actual);
        Fecha1.setCalendar(fecha_actual);
        this.usr = usr;
        this.LP = LP;
        this.setLocationRelativeTo(null);
        MNV();
        Rec.setText(usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());
        Rec1.setText(usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());
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

        String SQL = "INSERT INTO `semanal.vales` (`#vale`, `buenopor`, `Recibi de`, `Concepto`,"
                + " `en`, `fecha`, `BPescrito`, `B1000`, `SB1000`, `B500`, `SB500`, `B200`, `SB200`,"
                + " `B100`, `SB100`, `B50`, `SB50`, `B20`, `SB20`, `M20`, `SM20`, `M10`, `SM10`, `M5`,"
                + " `SM5`, `M2`, `SM2`, `M1`, `SM1`, `M050`, `SM050`, `total real`, `recibe`, `entrega`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NV.getText()));
            pst.setString(2, Importe.getText());
            pst.setString(3, RD.getText());
            pst.setString(4, Concepto.getText());
            pst.setString(5, En.getText());
            pst.setString(6, ((JTextField) Fecha.getDateEditor().getUiComponent()).getText());
            pst.setString(7, ImporteEsc.getText());
            pst.setString(8, B1000.getText());
            pst.setString(9, SB1000.getText());
            pst.setString(10, B500.getText());
            pst.setString(11, SB500.getText());
            pst.setString(12, B200.getText());
            pst.setString(13, SB200.getText());
            pst.setString(14, B100.getText());
            pst.setString(15, SB100.getText());
            pst.setString(16, B50.getText());
            pst.setString(17, SB50.getText());
            pst.setString(18, B20.getText());
            pst.setString(19, SB20.getText());
            pst.setString(20, M20.getText());
            pst.setString(21, SM20.getText());
            pst.setString(22, M10.getText());
            pst.setString(23, SM10.getText());
            pst.setString(24, M5.getText());
            pst.setString(25, SM5.getText());
            pst.setString(26, M2.getText());
            pst.setString(27, SM2.getText());
            pst.setString(28, M1.getText());
            pst.setString(29, SM1.getText());
            pst.setString(30, M050.getText());
            pst.setString(31, SM050.getText());
            pst.setString(32, TR.getText());
            pst.setString(33, Rec.getText());
            pst.setString(34, Entr.getSelectedItem().toString());

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
            B1000.setText("0");
            SB1000.setText("0");
            B500.setText("0");
            SB500.setText("0");
            B200.setText("0");
            SB200.setText("0");
            B100.setText("0");
            SB100.setText("0");
            B50.setText("0");
            SB50.setText("0");
            B20.setText("0");
            SB20.setText("0");
            M20.setText("0");
            SM20.setText("0");
            M10.setText("0");
            SM10.setText("0");
            M5.setText("0");
            SM5.setText("0");
            M2.setText("0");
            SM2.setText("0");
            M1.setText("0");
            SM1.setText("0");
            M050.setText("0");
            SM050.setText("0");
            TR.setText("0");
            MNV();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar vale:" + e);
        }
    }

    @Override
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }
        Graphics2D g2d = (Graphics2D) graphics;
        g2d.translate(pageFormat.getImageableX(),
                pageFormat.getImageableY());
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
        NV = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NV1 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
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
            .addComponent(txtbtngen, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        );

        getContentPane().add(btngen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 610, 940, 70));

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
        Move.setText("Padrones");
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

        NV.setEditable(false);
        NV.setForeground(new java.awt.Color(255, 51, 51));
        NV.setText("0");
        NV.setBorder(null);
        NV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NVKeyReleased(evt);
            }
        });
        jPanel1.add(NV, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 90, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel8.setText("Tehuantepec #20, Colonia Roma Sur, Delegacion Cuautemoc, C.P 06760");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logovale.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 40, 90, 10));

        jLabel22.setBackground(new java.awt.Color(255, 51, 51));
        jLabel22.setForeground(new java.awt.Color(255, 0, 51));
        jLabel22.setText("# Folio:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, -1, 20));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("CONFORT SERVICE PRESTIGE DE MEXICO S.A DE C.V");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(216, 10, 490, -1));

        jLabel46.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel46.setText("RFC: CSP1109158K");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel48.setText("Telefono: 52-64-76-87");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("PADRÒN PARA EL SEGURO DE AUTOMOVILES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel7.setText("$");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 50, -1, -1));

        NV1.setEditable(false);
        NV1.setText("0");
        NV1.setBorder(null);
        NV1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NV1KeyReleased(evt);
            }
        });
        jPanel1.add(NV1, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 50, 90, 20));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 70, 90, 10));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Estimado Usuario.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel11.setText("PARA LA DEBIDA PROTECCIÒN DE SU AUTOMÒVIL, FAVOR DE PROPORCIONAR LOS SIGUIENTES DATOS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Apellido P:");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 7, -1, -1));

        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 7, 150, -1));

        jLabel13.setText("Apellido M:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 7, -1, -1));

        jTextField2.setBorder(null);
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 7, 150, -1));

        jLabel14.setText("Nombre(s):");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 7, -1, -1));

        jTextField3.setBorder(null);
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(678, 7, 150, -1));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 29, 898, -1));

        jLabel15.setText("# Cliente");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 7, -1, -1));

        jTextField4.setBorder(null);
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 7, 100, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel16.setText("Domicilio o despacho:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel17.setText("Calle:");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, -1, -1));

        jTextField5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField5.setBorder(null);
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 720, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel18.setText("Num.");
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jTextField6.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField6.setBorder(null);
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel19.setText("Int.");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, -1, -1));

        jTextField7.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField7.setBorder(null);
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel20.setText("Colonia:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jTextField8.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField8.setBorder(null);
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 100, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, -1, -1));

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel23.setText("C.P.");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 60, -1, -1));

        jTextField9.setBorder(null);
        jPanel2.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 110, -1));

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel24.setText("Delegacion:");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        jTextField10.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField10.setBorder(null);
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, 220, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 910, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel2.setText("Telefono:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel3.setText("Part:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextField11.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField11.setText("jTextField11");
        jTextField11.setBorder(null);
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 150, -1));

        jTextField12.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField12.setText("jTextField12");
        jTextField12.setBorder(null);
        jPanel2.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 150, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel4.setText("Cel:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jTextField13.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField13.setText("jTextField13");
        jTextField13.setBorder(null);
        jPanel2.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jLabel5.setText("R.F.C");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, -1, -1));

        jTextField14.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        jTextField14.setText("jTextField14");
        jTextField14.setBorder(null);
        jPanel2.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 140, -1));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 132, 900, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 290, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 900, 50));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 300, 50));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 310, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 900, 310));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 940, 570));

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

    private void NVKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NVKeyReleased
        NV1.setText(NV.getText());
    }//GEN-LAST:event_NVKeyReleased

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

    private void NV1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NV1KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_NV1KeyReleased

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
            java.util.logging.Logger.getLogger(Padrones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Padrones().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Harder1;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NV;
    private javax.swing.JTextField NV1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JLabel txtbtngen;
    // End of variables declaration//GEN-END:variables
}
