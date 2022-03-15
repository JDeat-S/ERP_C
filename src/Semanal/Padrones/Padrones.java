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
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

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
    ButtonGroup CVeh;
    ButtonGroup TDserv;

    double BM = 1000, BQ = 500, BD = 200, BC = 100, BCIN = 50, BV = 20,
            MV = 20, MD = 10, MC = 5, MDOS = 2, MU = 1, MCENT = 0.50;

    public Padrones() {
        initComponents();
        CVeh = new ButtonGroup();
        CVeh.add(cv1);
        CVeh.add(cv2);
        CVeh.add(cv3);
        CVeh.add(cv4);
        CVeh.add(cv5);
        TDserv = new ButtonGroup();
        TDserv.add(tds12);
        TDserv.add(tds24);

        this.setLocationRelativeTo(null);

    }

    public Padrones(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        CVeh = new ButtonGroup();
        CVeh.add(cv1);
        CVeh.add(cv2);
        CVeh.add(cv3);
        CVeh.add(cv4);
        CVeh.add(cv5);
        TDserv = new ButtonGroup();
        TDserv.add(tds12);
        TDserv.add(tds24);
        this.usr = usr;
        this.LP = LP;
        this.setLocationRelativeTo(null);
    }

    public void OBData() {
        try {
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select `TaPagar`, `Apellido P`, `Apellido M`,"
                    + " `Nombre(s)`, `Direccion`, `Tel Casa`, `Tel Oficina`, `Celular`, "
                    + "`marca 1`, `modelo 1`, `Placas 1`, `Color 1`, `marca 2`, `modelo 2`,"
                    + " `Placas 2`, `Color 2`, `marca 3`, `modelo 3`, `Placas 3`, `Color 3`, "
                    + " `ClaseDA`, `Tdpension` FROM `pensiones." + Est.getSelectedItem().toString() +
                    "." + Mes.getSelectedItem().toString() + "` where `#padron` LIKE '%" + NF.getText() + "%'");
            rs = ps.executeQuery();

            while (rs.next()) {
                COBRO.setText(rs.getString(1));
                Ap.setText(rs.getString(2));
                Am.setText(rs.getString(3));
                Name.setText(rs.getString(4));
                Calle.setText(rs.getString(5));
                tel1.setText(rs.getString(6));
                tel2.setText(rs.getString(7));
                cel.setText(rs.getString(8));
                marca1.setText(rs.getString(9));
                modelo1.setText(rs.getString(10));
                placas1.setText(rs.getString(11));
                color1.setText(rs.getString(12));
                marca2.setText(rs.getString(13));
                modelo2.setText(rs.getString(14));
                placas2.setText(rs.getString(15));
                color2.setText(rs.getString(16));
                marca3.setText(rs.getString(17));
                modelo3.setText(rs.getString(18));
                placas3.setText(rs.getString(19));
                color3.setText(rs.getString(20));
                if (rs.getString(21).equals("Auto")) {
                    cv1.setSelected(true);
                }
                if (rs.getString(21).equals("Camioneta")) {
                    cv2.setSelected(true);
                }
                if (rs.getString(21).equals("Camion")) {
                    cv3.setSelected(true);
                }
                if (rs.getString(21).equals("Comerciante")) {
                    cv4.setSelected(true);
                }
                if (rs.getString(21).equals("Bicicleta/triciclo")){
                    cv5.setSelected(true);
                }
                if (rs.getString(22).equals("12 HRS DIA")) {
                    tds12.setSelected(true);
                }
                if (rs.getString(22).equals("12 HRS NOCHE")) {
                    tds12.setSelected(true);
                }
                if (rs.getString(22).equals("24 HRS")) {
                    tds24.setSelected(true);
                }
                prf.setText(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
            }
            ps.isClosed();
            rs.isClosed();

        } catch (SQLException ex) {
            Logger.getLogger(Rvales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void MNV() {
        String SQL = "SELECT `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'confort2022'"
                + " AND TABLE_NAME = 'semanal.padrones." + Est.getSelectedItem().toString() + ".control'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                NF.setText("" + Integer.parseInt(rs.getString("AUTO_INCREMENT")));

            }
            st.isClosed();
            rs.isClosed();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al obtener el ultimo padron registrado: " + e);

        }
    }

    public void agregarvale() {

        String SQL = "INSERT INTO `semanal.padrones." + Est.getSelectedItem().toString() + ".control` (`#Folio`, `Apellido P`, `Apellido M`, `Nombre(s)`) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NF.getText()));
            pst.setString(2, Ap.getText());
            pst.setString(3, Am.getText());
            pst.setString(4, Name.getText());

            pst.executeUpdate();

            pst.isClosed();
        } catch (SQLException error_AddLDA) {
            JOptionPane.showMessageDialog(null, "Error al registrar pension: " + error_AddLDA);
        }

        String CV = null, fac, tds = null;
        if (cv1.isSelected()) {
            CV = "Clase 1";
        }
        if (cv2.isSelected()) {
            CV = "Clase 2";
        }
        if (cv3.isSelected()) {
            CV = "Clase 3";
        }
        if (cv4.isSelected()) {
            CV = "Clase 4";
        }
        if (cv5.isSelected()) {
            CV = "Clase 5";
        }
        if (factura.isSelected() == true) {
            fac = "si";
        } else {
            fac = "no";
        }
        if (tds12.isSelected()) {
            tds = "12 horas";
        }
        if (tds24.isSelected()) {
            tds = "24 horas";
        }
        SQL = "INSERT INTO `semanal.padrones." + Est.getSelectedItem().toString() + "` (`#Folio`, `monto`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `calle`, `num`, `interior`, `Colonia`,"
                + " `C.P`, `delegacion`, `Telefono 1`, `Telefono 2`, `Telefono 3`,"
                + " `RFC`, `PART`, `celular`, `marca 1`, `modelo 1`, `placas 1`,"
                + " `color 1`, `marca 2`, `modelo 2`, `placas 2`, `color 2`, `Marca 3`,"
                + " `modelo 3`, `palcas 3`, `color 3`, `PRecibepago`, `PRecibefactura`,"
                + " `Factrura`, `clase`, `tipo de servicio`) VALUES (?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NF.getText()));
            pst.setString(2, COBRO.getText());
            pst.setString(3, Ap.getText());
            pst.setString(4, Am.getText());
            pst.setString(5, Name.getText());
            pst.setString(6, Calle.getText());
            pst.setString(7, Num.getText());
            pst.setString(8, interior.getText());
            pst.setString(9, colonia.getText());
            pst.setString(10, cp.getText());
            pst.setString(11, delegacion.getText());
            pst.setString(12, tel1.getText());
            pst.setString(13, tel2.getText());
            pst.setString(14, tel3.getText());
            pst.setString(15, rfc.getText());
            pst.setString(16, part.getText());
            pst.setString(17, cel.getText());
            pst.setString(18, marca1.getText());
            pst.setString(19, modelo1.getText());
            pst.setString(20, placas1.getText());
            pst.setString(21, color1.getText());
            pst.setString(22, marca2.getText());
            pst.setString(23, modelo2.getText());
            pst.setString(24, placas2.getText());
            pst.setString(25, color2.getText());
            pst.setString(26, marca3.getText());
            pst.setString(27, modelo3.getText());
            pst.setString(28, placas3.getText());
            pst.setString(29, color3.getText());
            pst.setString(30, prp.getText());
            pst.setString(31, prf.getText());
            pst.setString(32, fac);
            pst.setString(33, CV);
            pst.setString(34, tds);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "pension en " + Est.getSelectedItem().toString() + " registrada.");

            try {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable((Printable) this);
                job.printDialog();
                job.print();
            } catch (PrinterException ex) {
            }
            NF.setText("0");
            COBRO.setText("");
            Ap.setText("");
            Am.setText("");
            Name.setText("");
            Calle.setText("");
            Num.setText("");
            interior.setText("");
            colonia.setText("");
            cp.setText("");
            delegacion.setText("");
            tel1.setText("");
            tel2.setText("");
            tel3.setText("");
            rfc.setText("");
            part.setText("");
            cel.setText("");
            marca1.setText("");
            modelo1.setText("");
            placas1.setText("");
            color1.setText("");
            marca2.setText("");
            modelo2.setText("");
            placas2.setText("");
            color2.setText("");
            marca3.setText("");
            modelo3.setText("");
            placas3.setText("");
            color3.setText("");
            prp.setText("");
            prf.setText("");

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
        g2d.translate(pageFormat.getImageableX() + 10,
                pageFormat.getImageableY() + 15);
        g2d.scale(0.50, 0.50); //Reducción de la impresión al 50%
        jPanel1.printAll(graphics);
        return PAGE_EXISTS;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngen = new javax.swing.JPanel();
        txtbtngen = new javax.swing.JLabel();
        Est = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Mes = new javax.swing.JComboBox<>();
        Harder1 = new javax.swing.JPanel();
        Move = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        NF = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        COBRO = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Ap = new javax.swing.JTextField();
        Am = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Calle = new javax.swing.JTextField();
        Num = new javax.swing.JTextField();
        interior = new javax.swing.JTextField();
        colonia = new javax.swing.JTextField();
        delegacion = new javax.swing.JTextField();
        tel2 = new javax.swing.JTextField();
        cel = new javax.swing.JTextField();
        rfc = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        marca2 = new javax.swing.JTextField();
        marca1 = new javax.swing.JTextField();
        marca3 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        color3 = new javax.swing.JTextField();
        color2 = new javax.swing.JTextField();
        color1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        modelo3 = new javax.swing.JTextField();
        modelo2 = new javax.swing.JTextField();
        modelo1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        placas3 = new javax.swing.JTextField();
        placas2 = new javax.swing.JTextField();
        placas1 = new javax.swing.JTextField();
        prf = new javax.swing.JTextField();
        part = new javax.swing.JTextField();
        tel3 = new javax.swing.JTextField();
        tel1 = new javax.swing.JTextField();
        prp = new javax.swing.JTextField();
        factura = new javax.swing.JCheckBox();
        cp = new javax.swing.JTextField();
        cv5 = new javax.swing.JRadioButton();
        cv1 = new javax.swing.JRadioButton();
        cv2 = new javax.swing.JRadioButton();
        cv3 = new javax.swing.JRadioButton();
        cv4 = new javax.swing.JRadioButton();
        tds24 = new javax.swing.JRadioButton();
        tds12 = new javax.swing.JRadioButton();
        btnexit = new javax.swing.JPanel();
        txtbtnexit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngen.setBackground(new java.awt.Color(255, 255, 255));
        btngen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtbtngen.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtbtngen.setForeground(new java.awt.Color(0, 0, 0));
        txtbtngen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtngen.setText("Agregar Padron.");
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

        Est.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "tehuantepec", "puente titla", "iturbide" }));
        Est.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EstItemStateChanged(evt);
            }
        });

        jLabel1.setText("Estacionamiento");

        jLabel2.setText("Mes");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        javax.swing.GroupLayout btngenLayout = new javax.swing.GroupLayout(btngen);
        btngen.setLayout(btngenLayout);
        btngenLayout.setHorizontalGroup(
            btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btngenLayout.createSequentialGroup()
                .addComponent(txtbtngen, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btngenLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30))
        );
        btngenLayout.setVerticalGroup(
            btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btngenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btngenLayout.createSequentialGroup()
                        .addComponent(txtbtngen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(btngenLayout.createSequentialGroup()
                        .addGroup(btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(btngenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))))
        );

        getContentPane().add(btngen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 720, 1110, 70));

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
                .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 1064, Short.MAX_VALUE)
                .addContainerGap())
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Harder1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NF.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        NF.setText("0");
        NF.setBorder(null);
        NF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NFKeyReleased(evt);
            }
        });
        jPanel1.add(NF, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 60, 90, 20));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel22.setText("# Folio:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 60, -1, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("$");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, -1, -1));

        COBRO.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        COBRO.setText("0");
        COBRO.setBorder(null);
        jPanel1.add(COBRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, 90, 20));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ap.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Ap.setText("Apellido P:");
        Ap.setBorder(null);
        jPanel2.add(Ap, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 230, -1));

        Am.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Am.setText("Apellido M");
        Am.setBorder(null);
        jPanel2.add(Am, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 260, -1));

        Name.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Name.setText("Nombre(s)");
        Name.setBorder(null);
        jPanel2.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 310, -1));

        Calle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Calle.setText("Calle");
        Calle.setBorder(null);
        jPanel2.add(Calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 800, -1));

        Num.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        Num.setText("Num");
        Num.setBorder(null);
        jPanel2.add(Num, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 150, -1));

        interior.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        interior.setText("Int");
        interior.setBorder(null);
        jPanel2.add(interior, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 120, -1));

        colonia.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        colonia.setText("COLONIA");
        colonia.setBorder(null);
        jPanel2.add(colonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 220, -1));

        delegacion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        delegacion.setText("DELEGACION");
        delegacion.setBorder(null);
        jPanel2.add(delegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 190, -1));

        tel2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tel2.setText("TELEFONO 2");
        tel2.setBorder(null);
        jPanel2.add(tel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 190, -1));

        cel.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cel.setText("CELULAR");
        cel.setBorder(null);
        jPanel2.add(cel, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 220, -1));

        rfc.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        rfc.setText("RFC");
        rfc.setBorder(null);
        jPanel2.add(rfc, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 260, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        marca2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        marca2.setText("MARCA");
        marca2.setBorder(null);
        jPanel3.add(marca2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 180, 30));

        marca1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        marca1.setText("MARCA");
        marca1.setBorder(null);
        jPanel3.add(marca1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 180, -1));

        marca3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        marca3.setText("MARCA");
        marca3.setBorder(null);
        jPanel3.add(marca3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 260, 130));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        color3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        color3.setText("COLOR");
        color3.setBorder(null);
        jPanel5.add(color3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 200, -1));

        color2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        color2.setText("COLOR");
        color2.setBorder(null);
        jPanel5.add(color2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 200, -1));

        color1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        color1.setText("COLOR");
        color1.setBorder(null);
        jPanel5.add(color1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 200, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 210, 270, 130));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modelo3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        modelo3.setText("MODELO");
        modelo3.setBorder(null);
        jPanel6.add(modelo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 190, -1));

        modelo2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        modelo2.setText("MODELO");
        modelo2.setBorder(null);
        jPanel6.add(modelo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, -1));

        modelo1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        modelo1.setText("MODELO");
        modelo1.setBorder(null);
        jPanel6.add(modelo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 190, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 280, 130));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        placas3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        placas3.setText("PLACAS");
        placas3.setBorder(null);
        jPanel7.add(placas3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 190, -1));

        placas2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        placas2.setText("PLACAS");
        placas2.setBorder(null);
        jPanel7.add(placas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 190, -1));

        placas1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        placas1.setText("PLACAS");
        placas1.setBorder(null);
        jPanel7.add(placas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 260, 130));

        prf.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        prf.setText("PERSONA RECIBE FACTURA");
        prf.setBorder(null);
        jPanel2.add(prf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 360, -1));

        part.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        part.setText("PART");
        part.setBorder(null);
        jPanel2.add(part, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 200, -1));

        tel3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tel3.setText("TELEFONO 3");
        tel3.setBorder(null);
        jPanel2.add(tel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 190, -1));

        tel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        tel1.setText("TELEFONO 1");
        tel1.setBorder(null);
        jPanel2.add(tel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 200, -1));

        prp.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        prp.setText("PERSONA RECIBE PAGO");
        prp.setBorder(null);
        jPanel2.add(prp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 360, -1));

        factura.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        factura.setText("Factura.");
        jPanel2.add(factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 350, -1, -1));

        cp.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        cp.setText("C.P");
        cp.setBorder(null);
        jPanel2.add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, 140, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1070, 440));

        cv5.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        cv5.setText("5");
        jPanel1.add(cv5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 620, -1, -1));

        cv1.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        cv1.setText("1");
        jPanel1.add(cv1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 620, -1, -1));

        cv2.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        cv2.setText("2");
        jPanel1.add(cv2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 620, -1, -1));

        cv3.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        cv3.setText("3");
        jPanel1.add(cv3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, -1, -1));

        cv4.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        cv4.setText("4");
        jPanel1.add(cv4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 620, -1, -1));

        tds24.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        tds24.setText("24 HRS");
        jPanel1.add(tds24, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 620, -1, -1));

        tds12.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        tds12.setText("12 HRS");
        jPanel1.add(tds12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 620, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1110, 680));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 0, -1, -1));

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

    private void NFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NFKeyReleased
        COBRO.setText(NF.getText());
    }//GEN-LAST:event_NFKeyReleased

    private void txtbtngenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtngenMouseClicked

        agregarvale();
        MNV();
        OBData();
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

    private void EstItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EstItemStateChanged
        MNV();
        OBData();
    }//GEN-LAST:event_EstItemStateChanged

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
    private javax.swing.JTextField Am;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField COBRO;
    private javax.swing.JTextField Calle;
    private javax.swing.JComboBox<String> Est;
    private javax.swing.JPanel Harder1;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NF;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Num;
    private javax.swing.JPanel btnexit;
    private javax.swing.JPanel btngen;
    private javax.swing.JTextField cel;
    private javax.swing.JTextField colonia;
    private javax.swing.JTextField color1;
    private javax.swing.JTextField color2;
    private javax.swing.JTextField color3;
    private javax.swing.JTextField cp;
    private javax.swing.JRadioButton cv1;
    private javax.swing.JRadioButton cv2;
    private javax.swing.JRadioButton cv3;
    private javax.swing.JRadioButton cv4;
    private javax.swing.JRadioButton cv5;
    private javax.swing.JTextField delegacion;
    private javax.swing.JCheckBox factura;
    private javax.swing.JTextField interior;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField marca1;
    private javax.swing.JTextField marca2;
    private javax.swing.JTextField marca3;
    private javax.swing.JTextField modelo1;
    private javax.swing.JTextField modelo2;
    private javax.swing.JTextField modelo3;
    private javax.swing.JTextField part;
    private javax.swing.JTextField placas1;
    private javax.swing.JTextField placas2;
    private javax.swing.JTextField placas3;
    private javax.swing.JTextField prf;
    private javax.swing.JTextField prp;
    private javax.swing.JTextField rfc;
    private javax.swing.JRadioButton tds12;
    private javax.swing.JRadioButton tds24;
    private javax.swing.JTextField tel1;
    private javax.swing.JTextField tel2;
    private javax.swing.JTextField tel3;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JLabel txtbtngen;
    // End of variables declaration//GEN-END:variables
}
