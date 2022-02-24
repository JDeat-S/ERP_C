package Admin;

import RH.Depositos.DepositosQ_4;
import Nomina.Listas.*;
import Semanal.PT_4;
import Semanal.Tehuantepec_4;
import Semanal.Iturbide_4;
import Nomina.ModulosS.CDAS_5;
import Nomina.ModulosS.PresS_5;
import Nomina.ModulosS.ODTS_5;
import Nomina.ModulosQ.CDAQ_5;
import Nomina.ModulosQ.ODTQ_5;
import Nomina.ModulosQ.PresQ_5;
import RH.*;
import Nomina.*;
import Conexion.ConexionSQL;
import Logicas.*;
import Semanal.Vales.Rvales;
import java.awt.HeadlessException;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 *
 */
public final class VentanaADM_3 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    ButtonGroup VDA;
    Logica_usuarios usr;
    Logica_permisos LP;

    public VentanaADM_3() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(VentanaADM_3.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        Logica_TDU FZS = new Logica_TDU();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        TOUadd.setModel(MODELFZS);
        VDA = new ButtonGroup();
        VDA.add(AAADN);
        VDA.add(AAADRH);
        VDA.add(ADM);
        VDA.add(AADP);
        MDusers();
        MDRoles();
        FillAp.setVisible(false);
        FillAm.setVisible(false);
        Filname.setVisible(false);
        BName.setVisible(false);
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
        Filtro1.setVisible(false);
        Filtro2.setVisible(false);
        BName1.setVisible(false);
        BAPNom1.setVisible(false);
        BAMNom1.setVisible(false);
        shareN();
        MDACT();

    }

    public VentanaADM_3(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usr = usr;
        this.LP = LP;
        setIconImage(new ImageIcon(VentanaADM_3.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        Logica_TDU FZS = new Logica_TDU();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        TOUadd.setModel(MODELFZS);
        VDA = new ButtonGroup();
        VDA.add(AAADN);
        VDA.add(AAADRH);
        VDA.add(ADM);
        VDA.add(AADP);
        MDusers();
        MDRoles();
        FillAp.setVisible(false);
        FillAm.setVisible(false);
        Filname.setVisible(false);
        Filtro1.setVisible(false);
        BName.setVisible(false);
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
        Filtro2.setVisible(false);
        BName1.setVisible(false);
        BAPNom1.setVisible(false);
        BAMNom1.setVisible(false);
        setTitle("Ventana ADM # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
                + " Tipo de ususario: " + usr.getNombre_tipo() + " Usuario: " + usr.getUsuario());
        shareN();
        MDACT();
    }

    public void MDACT() {
        //Buscar empleado
        String Share = BName1.getText();
        String ShareAP = BAPNom1.getText();
        String ShareAM = BAMNom1.getText();
        String where = "SELECT * FROM `admin.reciboefectivo`";

        if (!"".equals(Share)) {
            where = " select * "
                    + "from `admin.reciboefectivo` WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select * "
                    + "from `admin.reciboefectivo` WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * "
                    + "from `admin.reciboefectivo` WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Registro");
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Activo");

//Anchos
            int[] anchos = {50, /*numE*/ 35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 150, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                share1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            ps.isClosed();
            rs.isClosed();
        } catch (SQLException error_sharenom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

        }

    }

    public void shareN() {
        //Buscar empleado
        String Share = BName.getText();
        String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();
        String where = "SELECT `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)` FROM `rh.empleados`"
                + " where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)` "
                    + "from `rh.empleados` WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)` "
                    + "from `rh.empleados` WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)` "
                    + "from `rh.empleados` WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//3

//Anchos
            int[] anchos = {/*numE*/35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 150};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                share.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            ps.isClosed();
            rs.isClosed();
        } catch (SQLException error_sharenom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

        }

    }

    public void MDusers() {
        //Buscar empleado
        String FIllAM = FillAm.getText();
        String filname = Filname.getText();
        String filap = FillAp.getText();

        String SQL = "SELECT `id_user`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Tipo de usuario`, `Usuario`, `Contraseña`, "
                + "`Ultimo inicio de sesion` FROM `admin.usuarios`";

        if (!"".equals(filname)) {
            SQL = "SELECT `id_user`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Tipo de usuario`, `Usuario`, `Contraseña`, "
                    + "`Ultimo inicio de sesion` FROM `admin.usuarios`"
                    + " where `Nombre(s)` LIKE '%" + filname + "%'";
        } else if (!"".equals(filap)) {
            SQL = "SELECT `id_user`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Tipo de usuario`, `Usuario`, `Contraseña`, "
                    + "`Ultimo inicio de sesion` FROM `admin.usuarios`"
                    + " Where `Apellido P` LIKE '%" + filap + "%'";
        } else if (!"".equals(FIllAM)) {
            SQL = "SELECT `id_user`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Tipo de usuario`, `Usuario`, `Contraseña`, "
                    + "`Ultimo inicio de sesion` FROM `admin.usuarios` where `Apellido M` LIKE '%" + FIllAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            TUser.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Usuario");//1
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//4
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Tipo de usuario");
            modelo.addColumn("Usuario");//8
            modelo.addColumn("Contraseña");
            modelo.addColumn("Ultimo Inicio de sesion");

            int[] anchos = {/*idbd*/35, /*ap*/ 70, /*am*/ 70, /*name*/ 100,
                /*TDU*/ 65, /*USER*/ 65, /*PASS*/ 70, /*UISD*/ 100};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TUser.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
                ps.isClosed();
                rs.isClosed();

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla empleados: " + e.getMessage());
        }

    }

    public void MDRoles() {

        String SQL = "SELECT `id_TDO`, `Usuario` FROM `admin.tou`";

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Troles.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID Perfil");//1
            modelo.addColumn("Nombre Perfil");

            int[] anchos = {/*idbd*/35, /*ap*/ 70};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Troles.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
                ps.isClosed();
                rs.isClosed();

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla empleados: " + e.getMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        Filname = new javax.swing.JTextField();
        FillAm = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        TUser = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cbxfillusrs = new javax.swing.JComboBox<>();
        FillAp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TOUadd = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AAS = new javax.swing.JCheckBox();
        Nameadduser = new javax.swing.JTextField();
        Amadduser = new javax.swing.JTextField();
        Apadduser = new javax.swing.JTextField();
        IDuser = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passuserad = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Useradd = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Panebtnmod = new javax.swing.JPanel();
        txtbtnmod = new javax.swing.JLabel();
        btnadd = new javax.swing.JPanel();
        txtbtnadd = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        P1Nom = new javax.swing.JCheckBox();
        P2Nom = new javax.swing.JCheckBox();
        P3Nom = new javax.swing.JCheckBox();
        P4Nom = new javax.swing.JCheckBox();
        P5Nom = new javax.swing.JCheckBox();
        P6Nom = new javax.swing.JCheckBox();
        P7Nom = new javax.swing.JCheckBox();
        P8Nom = new javax.swing.JCheckBox();
        P9Nom = new javax.swing.JCheckBox();
        P10Nom = new javax.swing.JCheckBox();
        AAADN = new javax.swing.JRadioButton();
        P11Nom = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        PDUMod = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Troles = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        P1RH = new javax.swing.JCheckBox();
        P2RH = new javax.swing.JCheckBox();
        P3RH = new javax.swing.JCheckBox();
        P4RH = new javax.swing.JCheckBox();
        AAADRH = new javax.swing.JRadioButton();
        P5RH = new javax.swing.JCheckBox();
        P6RH = new javax.swing.JCheckBox();
        P7RH = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        PDUadd = new javax.swing.JTextField();
        ADM = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        NumP = new javax.swing.JTextField();
        Btnpduadd = new javax.swing.JPanel();
        txtbtnpduadd = new javax.swing.JLabel();
        btnpdumod = new javax.swing.JPanel();
        txtbtnpdumod = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        AADP = new javax.swing.JRadioButton();
        P1PEN = new javax.swing.JCheckBox();
        P2PEN = new javax.swing.JCheckBox();
        P3PEN = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        BName = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        share = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        FiltrosNom = new javax.swing.JComboBox<>();
        BAMNom = new javax.swing.JTextField();
        Filtro1 = new javax.swing.JLabel();
        BAPNom = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        NR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NE = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ApEDE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        AmEDE = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        nameEDE = new javax.swing.JTextField();
        ACT = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        BName1 = new javax.swing.JTextField();
        BAPNom1 = new javax.swing.JTextField();
        Filtro2 = new javax.swing.JLabel();
        BAMNom1 = new javax.swing.JTextField();
        FiltrosNom1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        share1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CNQ = new javax.swing.JMenuItem();
        PRESQ = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        CDA4 = new javax.swing.JMenuItem();
        ODT2 = new javax.swing.JMenuItem();
        LDA = new javax.swing.JMenuItem();
        LDA3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        General = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        Depositos = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Filname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilnameKeyReleased(evt);
            }
        });

        FillAm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillAmKeyReleased(evt);
            }
        });

        TUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TUserMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(TUser);

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel19.setText("Lista de usuarios.");

        jLabel20.setText("Filtro:");

        cbxfillusrs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        cbxfillusrs.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxfillusrsItemStateChanged(evt);
            }
        });

        FillAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillApKeyReleased(evt);
            }
        });

        jLabel6.setText("Tipo de usuario:");

        TOUadd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));

        jLabel4.setText("Usuario:");

        jLabel1.setText("Apellido P:");

        AAS.setSelected(true);
        AAS.setText("Acceso al sistema");

        IDuser.setEditable(false);
        IDuser.setText("0");

        jLabel3.setText("Nombre(s):");

        jLabel16.setText("# Usuario:");

        jLabel2.setText("Apellido M:");

        jLabel5.setText("Contraseña:");

        txtbtnmod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnmod.setText("Modificar");
        txtbtnmod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnmod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtbtnmodMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanebtnmodLayout = new javax.swing.GroupLayout(Panebtnmod);
        Panebtnmod.setLayout(PanebtnmodLayout);
        PanebtnmodLayout.setHorizontalGroup(
            PanebtnmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnmod, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );
        PanebtnmodLayout.setVerticalGroup(
            PanebtnmodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnmod, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
        );

        txtbtnadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnadd.setText("Agregar");
        txtbtnadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtbtnaddMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnaddLayout = new javax.swing.GroupLayout(btnadd);
        btnadd.setLayout(btnaddLayout);
        btnaddLayout.setHorizontalGroup(
            btnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnadd, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        );
        btnaddLayout.setVerticalGroup(
            btnaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Amadduser)
                            .addComponent(Nameadduser)
                            .addComponent(Apadduser)
                            .addComponent(Useradd)
                            .addComponent(passuserad)
                            .addComponent(TOUadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IDuser, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panebtnmod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AAS))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxfillusrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillAp, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillAm, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel19))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(IDuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Apadduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Amadduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Nameadduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Useradd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(passuserad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TOUadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AAS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Panebtnmod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnadd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel19)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FillAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FillAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Filname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(cbxfillusrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(394, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Agregar/Modificar Usuarios", jScrollPane2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel13.setText("Perfil de usuarios:");

        jLabel14.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel14.setText("Area Nomina");

        P1Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P1Nom.setText("Acceso a ordenes de taller");
        P1Nom.setEnabled(false);

        P2Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P2Nom.setText("Acceso Caja de ahorro");
        P2Nom.setEnabled(false);

        P3Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P3Nom.setText("Acceso Listas de asistencia");
        P3Nom.setEnabled(false);

        P4Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P4Nom.setText("Creacion de reportes de nomiana");
        P4Nom.setEnabled(false);

        P5Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P5Nom.setText("Mostrar Nominas detalladas(S Y Q)");
        P5Nom.setEnabled(false);

        P6Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P6Nom.setText("Mostrar pagos(SYQ)");
        P6Nom.setEnabled(false);

        P7Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P7Nom.setText("Acceso a Prestamos");
        P7Nom.setEnabled(false);

        P8Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P8Nom.setText("Acceso a Nomina Semanal");
        P8Nom.setEnabled(false);

        P9Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P9Nom.setText("Acceso a Prestamo Semanales");
        P9Nom.setEnabled(false);

        P10Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P10Nom.setText("Modificacion de Nominas (SYQ)");
        P10Nom.setEnabled(false);

        AAADN.setText("Acceso a Area de Nomina");
        AAADN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAADNActionPerformed(evt);
            }
        });

        P11Nom.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P11Nom.setText("Creacion de nominas (S y Q)");
        P11Nom.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(P6Nom))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P1Nom)
                            .addComponent(P2Nom)
                            .addComponent(P3Nom)
                            .addComponent(P4Nom)
                            .addComponent(P5Nom)
                            .addComponent(AAADN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(P10Nom)
                            .addComponent(P9Nom)
                            .addComponent(P8Nom)
                            .addComponent(P7Nom)
                            .addComponent(P11Nom)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel14)))
                .addContainerGap(191, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P7Nom)
                    .addComponent(AAADN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1Nom)
                    .addComponent(P8Nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2Nom)
                    .addComponent(P9Nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P3Nom)
                    .addComponent(P10Nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P4Nom)
                    .addComponent(P11Nom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P5Nom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P6Nom)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel18.setText("Perfil seleccionado:");

        PDUMod.setText("N/A");

        Troles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Troles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrolesMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(Troles);

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setText("Area Recursos Humanos");

        P1RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P1RH.setText("Acesso a Alumnos de estadia");
        P1RH.setEnabled(false);

        P2RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P2RH.setText("Acceso a Empelados de torteria");
        P2RH.setEnabled(false);

        P3RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P3RH.setText("Acceso a Depositos.");
        P3RH.setEnabled(false);

        P4RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P4RH.setText("Acceso a Semanal");
        P4RH.setEnabled(false);

        AAADRH.setText("Acesso a Area de Recursos humanos");
        AAADRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AAADRHActionPerformed(evt);
            }
        });

        P5RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P5RH.setText("Mostrar datos general y IMSS");
        P5RH.setEnabled(false);

        P6RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P6RH.setText("Agregar empleados y registros de imss.");
        P6RH.setEnabled(false);

        P7RH.setFont(new java.awt.Font("Roboto", 0, 11)); // NOI18N
        P7RH.setText("Modificar empleados y registros de imss.");
        P7RH.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel17))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(P1RH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P5RH))
                            .addComponent(P4RH)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P2RH)
                                    .addComponent(P3RH))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(P7RH)
                                    .addComponent(P6RH)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(AAADRH)))
                .addContainerGap(164, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AAADRH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P1RH)
                    .addComponent(P5RH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P2RH)
                    .addComponent(P6RH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P3RH)
                    .addComponent(P7RH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P4RH)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setText("Nombre de perfil:");

        ADM.setText("Administrador");
        ADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMActionPerformed(evt);
            }
        });

        jLabel8.setText("# perfil:");

        NumP.setEditable(false);
        NumP.setText("0");

        txtbtnpduadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnpduadd.setText("Agregar");
        txtbtnpduadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnpduadd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtbtnpduaddMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BtnpduaddLayout = new javax.swing.GroupLayout(Btnpduadd);
        Btnpduadd.setLayout(BtnpduaddLayout);
        BtnpduaddLayout.setHorizontalGroup(
            BtnpduaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnpduadd, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        BtnpduaddLayout.setVerticalGroup(
            BtnpduaddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnpduadd, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        txtbtnpdumod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnpdumod.setText("Modificar");
        txtbtnpdumod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnpdumod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtbtnpdumodMousePressed(evt);
            }
        });

        javax.swing.GroupLayout btnpdumodLayout = new javax.swing.GroupLayout(btnpdumod);
        btnpdumod.setLayout(btnpdumodLayout);
        btnpdumodLayout.setHorizontalGroup(
            btnpdumodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnpdumodLayout.createSequentialGroup()
                .addComponent(txtbtnpdumod, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnpdumodLayout.setVerticalGroup(
            btnpdumodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtbtnpdumod, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jLabel22.setText("Area Pensiones");

        AADP.setText("Acceso a area de Pensiones");
        AADP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AADPActionPerformed(evt);
            }
        });

        P1PEN.setText("Agregar Pensiones");
        P1PEN.setEnabled(false);

        P2PEN.setText("Modificar Pensiones");
        P2PEN.setEnabled(false);

        P3PEN.setText("Mostrar Pensiones");
        P3PEN.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(jLabel22)
                .addGap(205, 205, 205))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AADP)
                    .addComponent(P1PEN)
                    .addComponent(P2PEN)
                    .addComponent(P3PEN))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AADP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P1PEN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P2PEN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(P3PEN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PDUadd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumP, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PDUMod))
                    .addComponent(Btnpduadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpdumod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ADM))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ADM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(NumP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(PDUadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PDUMod)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Btnpduadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnpdumod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        jTabbedPane1.addTab("Acceso de perfil de usuario", jScrollPane3);

        BName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BNameKeyReleased(evt);
            }
        });

        share.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        share.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shareMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(share);

        jLabel28.setText("Filtrar por:");

        FiltrosNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosNom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosNomItemStateChanged(evt);
            }
        });

        BAMNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAMNomKeyReleased(evt);
            }
        });

        Filtro1.setText("Buscar empleado:");

        BAPNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAPNomKeyReleased(evt);
            }
        });

        jLabel9.setText("# Registro:");

        NR.setEditable(false);
        NR.setText("0");

        jLabel10.setText("# Empleado:");

        jLabel11.setText("Apellido P:");

        jLabel12.setText("Apellido M:");

        jLabel15.setText("Nombres:");

        ACT.setText("Activo.");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel29.setText("Filtrar por:");

        BName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BName1KeyReleased(evt);
            }
        });

        BAPNom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAPNom1KeyReleased(evt);
            }
        });

        Filtro2.setText("Buscar empleado:");

        BAMNom1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAMNom1KeyReleased(evt);
            }
        });

        FiltrosNom1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosNom1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosNom1ItemStateChanged(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Registros de Entrega de efectivo");

        share1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        share1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                share1MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(share1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ApEDE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AmEDE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameEDE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ACT)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 573, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Filtro1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(FiltrosNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Filtro2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BName1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BAPNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(BAMNom1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel21)
                            .addGap(204, 204, 204)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtro1)
                    .addComponent(BName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel9)
                    .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ApEDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(AmEDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(nameEDE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ACT)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1)
                        .addComponent(jButton2))
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Filtro2)
                    .addComponent(BName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAPNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAMNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrosNom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Registro para entrega de efectivo", jScrollPane1);

        Menuadm.setText("Todas las ventanas");

        jMenu2.setText("Area Nomina");

        jMenu3.setText("Nomina quincenal");

        ODT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ODT.setText("Ordenes de taller");
        ODT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODTActionPerformed(evt);
            }
        });
        jMenu3.add(ODT);

        CNQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CNQ.setText("Nomina IMSS");
        CNQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNQActionPerformed(evt);
            }
        });
        jMenu3.add(CNQ);

        PRESQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRESQ.setText("Prestamos");
        PRESQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESQActionPerformed(evt);
            }
        });
        jMenu3.add(PRESQ);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Nomina General");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        CDA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA.setText("Caja de ahorro");
        CDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDAActionPerformed(evt);
            }
        });
        jMenu3.add(CDA);

        jMenu2.add(jMenu3);

        jMenu4.setText("Semanal");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Nomina Semanal IMSS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem3.setText("Prestamos Semanales");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem4.setText("Nomina Semanal General");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        CDA4.setText("Caja de ahorro");
        CDA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDA4ActionPerformed(evt);
            }
        });
        jMenu4.add(CDA4);

        ODT2.setText("Ordenes de taller");
        ODT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODT2ActionPerformed(evt);
            }
        });
        jMenu4.add(ODT2);

        jMenu2.add(jMenu4);

        LDA.setText("Listas de asistencia C/IMSS ");
        LDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LDAActionPerformed(evt);
            }
        });
        jMenu2.add(LDA);

        LDA3.setText("Listas de asistencia S/IMSS");
        LDA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LDA3ActionPerformed(evt);
            }
        });
        jMenu2.add(LDA3);

        Menuadm.add(jMenu2);

        jMenu1.setText("Area RH");

        General.setText("Empleados General");
        General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralActionPerformed(evt);
            }
        });
        jMenu1.add(General);

        Estadias.setText("Alumno de estadia");
        Estadias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadiasActionPerformed(evt);
            }
        });
        jMenu1.add(Estadias);

        Torteria.setText("Empleados Torteria");
        Torteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorteriaActionPerformed(evt);
            }
        });
        jMenu1.add(Torteria);

        jMenu5.setText("Semanales");

        jMenuItem5.setText("Iturbide");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Tehuantepec");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem8.setText("PTE titla");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenu1.add(jMenu5);

        Depositos.setText("Depositos");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem9.setText("Depositos C/ IMSS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        Depositos.add(jMenuItem9);

        jMenu1.add(Depositos);

        Menuadm.add(jMenu1);

        ZYS.setText("Zonas y Servicios");
        ZYS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZYSActionPerformed(evt);
            }
        });
        Menuadm.add(ZYS);

        jMenuItem7.setText("Edicion Pagos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Menuadm.add(jMenuItem7);

        jMenuBar1.add(Menuadm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ODTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODTActionPerformed
        ODTQ_5 regr = new ODTQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODTActionPerformed

    private void CNQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNQActionPerformed
        NominaQ_5 regr = new NominaQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CNQActionPerformed

    private void PRESQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESQActionPerformed
        PresQ_5 regr = new PresQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PRESQActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDAActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDAActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NominaS_5 regr = new NominaS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PresS_5 regr = new PresS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NominaS_simss_5 regr = new NominaS_simss_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralActionPerformed

        Empleados_4 RH = new Empleados_4(usr, LP);
        RH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GeneralActionPerformed

    private void EstadiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadiasActionPerformed
        Estadias_4 regr = new Estadias_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstadiasActionPerformed

    private void TorteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TorteriaActionPerformed
        Tortas_4 regr = new Tortas_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TorteriaActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Iturbide_4 regr = new Iturbide_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Tehuantepec_4 regr = new Tehuantepec_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        PT_4 regr = new PT_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void ZYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZYSActionPerformed
        AltasZyS_3 regr = new AltasZyS_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZYSActionPerformed

    private void AAADNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAADNActionPerformed
        if (AAADN.isSelected() == true) {

            P1PEN.setEnabled(false);
            P2PEN.setEnabled(false);
            P3PEN.setEnabled(false);
            P1PEN.setSelected(false);
            P2PEN.setSelected(false);
            P3PEN.setSelected(false);
            P1Nom.setSelected(true);
            P2Nom.setSelected(true);
            P3Nom.setSelected(true);
            P4Nom.setSelected(true);
            P5Nom.setSelected(true);
            P6Nom.setSelected(true);
            P7Nom.setSelected(true);
            P8Nom.setSelected(true);
            P9Nom.setSelected(true);
            P10Nom.setSelected(true);
            P11Nom.setSelected(true);
            P1RH.setSelected(false);
            P2RH.setSelected(false);
            P3RH.setSelected(false);
            P4RH.setSelected(false);
            P5RH.setSelected(false);
            P6RH.setSelected(false);
            P7RH.setSelected(false);
            P1Nom.setEnabled(true);
            P2Nom.setEnabled(true);
            P3Nom.setEnabled(true);
            P4Nom.setEnabled(true);
            P5Nom.setEnabled(true);
            P6Nom.setEnabled(true);
            P7Nom.setEnabled(true);
            P8Nom.setEnabled(true);
            P9Nom.setEnabled(true);
            P10Nom.setEnabled(true);
            P11Nom.setEnabled(true);
            P1RH.setEnabled(false);
            P2RH.setEnabled(false);
            P3RH.setEnabled(false);
            P4RH.setEnabled(false);
            P5RH.setEnabled(false);
            P6RH.setEnabled(false);
            P7RH.setEnabled(false);
        }
    }//GEN-LAST:event_AAADNActionPerformed

    private void TUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TUserMouseClicked
        try {
            int fila = TUser.getSelectedRow();
            int id = Integer.parseInt(TUser.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select `Activo` from `admin.usuarios` where `id_user` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                switch (rs.getString("Activo")) {
                    case "1" ->
                        AAS.setSelected(true);
                    case "0" ->
                        AAS.setSelected(false);
                    default -> {
                    }
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }

        int fila = TUser.getSelectedRow();
        IDuser.setText(String.valueOf(TUser.getValueAt(fila, 0)));
        Apadduser.setText(String.valueOf(TUser.getValueAt(fila, 1)));
        Amadduser.setText(String.valueOf(TUser.getValueAt(fila, 2)));
        Nameadduser.setText(String.valueOf(TUser.getValueAt(fila, 3)));
        Useradd.setText(String.valueOf(TUser.getValueAt(fila, 5)));
        btnadd.setVisible(false);
    }//GEN-LAST:event_TUserMouseClicked

    private void txtbtnaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnaddMousePressed
        String active = null;
        if (AAS.isSelected() == true) {
            active = "1";
        }
        if (AAS.isSelected() == false) {
            active = "0";
        }
        PreparedStatement ps;
        String SQL2 = "SELECT `Usuario`, `Ventana de acceso` FROM `admin.tou` WHERE `Usuario` Like '%" + TOUadd.getSelectedItem().toString() + "%'";
        String VDAcbx = null;
        try {
            ps = con.prepareStatement(SQL2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VDAcbx = rs.getString(2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error obtener permisos:" + e);

        }

        String SQL = "INSERT INTO `admin.usuarios` (`id_user`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Tipo de usuario`, `Usuario`, `Contraseña`,"
                + " `Ultimo inicio de sesion`, `Activo`, `Ventana de acceso`) VALUES (?, ?, ?, ?, ?, ?, ?, '', ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(IDuser.getText()));
            pst.setString(2, Apadduser.getText());
            pst.setString(3, Amadduser.getText());
            pst.setString(4, Nameadduser.getText());
            pst.setString(5, TOUadd.getSelectedItem().toString());
            pst.setString(6, Useradd.getText());
            pst.setString(7, passuserad.getText());
            pst.setString(8, active);
            pst.setString(9, VDAcbx);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario registrado");

            //limpiar
            IDuser.setText("0");
            Apadduser.setText("");
            Amadduser.setText("");
            Nameadduser.setText("");
            TOUadd.setSelectedIndex(0);
            Useradd.setText("");
            passuserad.setText("");
            AAS.setSelected(false);
            MDusers();

        } catch (HeadlessException | SQLException error_add_usr) {
            JOptionPane.showMessageDialog(null, "Error al agregar usuario: " + error_add_usr.getMessage());
        }
    }//GEN-LAST:event_txtbtnaddMousePressed

    private void txtbtnmodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnmodMousePressed
        String active = null;
        if (AAS.isSelected() == true) {
            active = "1";
        }
        if (AAS.isSelected() == false) {
            active = "0";
        }
        PreparedStatement ps;
        String SQL2 = "SELECT `Usuario`, `Ventana de acceso` FROM `admin.tou` WHERE `Usuario` Like '%" + TOUadd.getSelectedItem().toString() + "%'";
        String VDAcbx = null;
        try {
            ps = con.prepareStatement(SQL2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                VDAcbx = rs.getString(2);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error obtener permisos:" + e);

        }
        String SQL = "UPDATE `admin.usuarios` SET `Apellido P` = ?, `Apellido M` = ?,"
                + " `Nombre(s)` = ?, `Tipo de usuario` = ?, `Usuario` = ?, `Contraseña` = ?, `Activo` = ?,"
                + " `Ventana de acceso` = ? WHERE `admin.usuarios`.`id_user` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, Apadduser.getText());
            pst.setString(2, Amadduser.getText());
            pst.setString(3, Nameadduser.getText());
            pst.setString(4, TOUadd.getSelectedItem().toString());
            pst.setString(5, Useradd.getText());
            pst.setString(6, passuserad.getText());
            pst.setString(7, active);
            pst.setString(8, VDAcbx);
            pst.setInt(9, Integer.parseInt(IDuser.getText()));

            pst.executeUpdate();

            //limpiar
            IDuser.setText("0");
            Apadduser.setText("");
            Amadduser.setText("");
            Nameadduser.setText("");
            TOUadd.setSelectedIndex(0);
            Useradd.setText("");
            passuserad.setText("");
            AAS.setSelected(false);
            VDAcbx = "";
            MDusers();

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Modificado");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en modificar empleado: " + e.getMessage());
        }
        btnadd.setVisible(true);


    }//GEN-LAST:event_txtbtnmodMousePressed

    private void FillApKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillApKeyReleased
        MDusers();

    }//GEN-LAST:event_FillApKeyReleased

    private void FillAmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillAmKeyReleased
        MDusers();

    }//GEN-LAST:event_FillAmKeyReleased

    private void FilnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnameKeyReleased
        MDusers();

    }//GEN-LAST:event_FilnameKeyReleased

    private void cbxfillusrsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxfillusrsItemStateChanged
        if (cbxfillusrs.getSelectedIndex() == 0) {
            FillAp.setVisible(false);
            FillAm.setVisible(false);
            Filname.setVisible(false);
            FillAp.setText("");
            FillAm.setText("");
            Filname.setText("");
        }
        if (cbxfillusrs.getSelectedIndex() == 1) {
            FillAp.setVisible(true);
            FillAm.setVisible(false);
            Filname.setVisible(false);
            FillAp.setText("");
            FillAm.setText("");
            Filname.setText("");
        }
        if (cbxfillusrs.getSelectedIndex() == 2) {
            FillAp.setVisible(false);
            FillAm.setVisible(true);
            Filname.setVisible(false);
            FillAp.setText("");
            FillAm.setText("");
            Filname.setText("");
        }
        if (cbxfillusrs.getSelectedIndex() == 2) {
            FillAp.setVisible(false);
            FillAm.setVisible(false);
            Filname.setVisible(true);
            FillAp.setText("");
            FillAm.setText("");
            Filname.setText("");
        }
    }//GEN-LAST:event_cbxfillusrsItemStateChanged

    private void TrolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrolesMouseClicked
        int fila = Troles.getSelectedRow();
        NumP.setText(String.valueOf(Troles.getValueAt(fila, 0)));
        PDUMod.setText(String.valueOf(Troles.getValueAt(fila, 1)));
        Btnpduadd.setVisible(false);
        txtbtnadd.setVisible(false);
        PDUadd.setText(String.valueOf(Troles.getValueAt(fila, 1)));

        try {
            int id = Integer.parseInt(Troles.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from `admin.tou` where `id_TDO` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                switch (rs.getString("Ventana de acceso")) {

                    case "0" -> {
                        ADM.setSelected(true);
                        P1Nom.setSelected(false);
                        P2Nom.setSelected(false);
                        P3Nom.setSelected(false);
                        P4Nom.setSelected(false);
                        P5Nom.setSelected(false);
                        P6Nom.setSelected(false);
                        P7Nom.setSelected(false);
                        P8Nom.setSelected(false);
                        P9Nom.setSelected(false);
                        P10Nom.setSelected(false);
                        P11Nom.setSelected(false);
                        P1RH.setSelected(false);
                        P2RH.setSelected(false);
                        P3RH.setSelected(false);
                        P4RH.setSelected(false);
                        P1Nom.setEnabled(false);
                        P2Nom.setEnabled(false);
                        P3Nom.setEnabled(false);
                        P4Nom.setEnabled(false);
                        P5Nom.setEnabled(false);
                        P6Nom.setEnabled(false);
                        P7Nom.setEnabled(false);
                        P8Nom.setEnabled(false);
                        P9Nom.setEnabled(false);
                        P10Nom.setEnabled(false);
                        P11Nom.setEnabled(false);
                        P1RH.setEnabled(false);
                        P2RH.setEnabled(false);
                        P3RH.setEnabled(false);
                        P4RH.setEnabled(false);
                        P5RH.setEnabled(false);
                        P6RH.setEnabled(false);
                        P7RH.setEnabled(false);
                    }
                    case "1" -> {
                        AAADRH.setSelected(true);

                        switch (rs.getString("P1")) {
                            case "0" ->
                                P1RH.setSelected(false);
                            case "1" ->
                                P1RH.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P2")) {
                            case "0" ->
                                P2RH.setSelected(false);
                            case "1" ->
                                P2RH.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P3")) {
                            case "0" ->
                                P3RH.setSelected(false);
                            case "1" ->
                                P3RH.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P4")) {
                            case "0" ->
                                P4RH.setSelected(false);
                            case "1" ->
                                P4RH.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P5")) {
                            case "0" ->
                                P5RH.setSelected(false);
                            case "1" ->
                                P5RH.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P6")) {
                            case "0" ->
                                P6RH.setSelected(false);
                            case "1" ->
                                P6RH.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P7")) {
                            case "0" ->
                                P7RH.setSelected(false);
                            case "1" ->
                                P7RH.setSelected(true);
                            default -> {
                            }
                        }
                        P1Nom.setSelected(false);
                        P2Nom.setSelected(false);
                        P3Nom.setSelected(false);
                        P4Nom.setSelected(false);
                        P5Nom.setSelected(false);
                        P6Nom.setSelected(false);
                        P7Nom.setSelected(false);
                        P8Nom.setSelected(false);
                        P9Nom.setSelected(false);
                        P10Nom.setSelected(false);
                        P11Nom.setSelected(false);
                        P1Nom.setEnabled(false);
                        P2Nom.setEnabled(false);
                        P3Nom.setEnabled(false);
                        P4Nom.setEnabled(false);
                        P5Nom.setEnabled(false);
                        P6Nom.setEnabled(false);
                        P7Nom.setEnabled(false);
                        P8Nom.setEnabled(false);
                        P9Nom.setEnabled(false);
                        P10Nom.setEnabled(false);
                        P11Nom.setEnabled(false);
                        P1RH.setEnabled(true);
                        P2RH.setEnabled(true);
                        P3RH.setEnabled(true);
                        P4RH.setEnabled(true);
                        P5RH.setEnabled(true);
                        P6RH.setEnabled(true);
                        P7RH.setEnabled(true);
                        P1PEN.setEnabled(false);
                        P2PEN.setEnabled(false);
                        P3PEN.setEnabled(false);
                        P1PEN.setSelected(false);
                        P2PEN.setSelected(false);
                        P3PEN.setSelected(false);
                    }

                    case "2" -> {
                        AAADN.setSelected(true);
                        switch (rs.getString("P1")) {
                            case "0" ->
                                P1Nom.setSelected(false);
                            case "1" ->
                                P1Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P2")) {
                            case "0" ->
                                P2Nom.setSelected(false);
                            case "1" ->
                                P2Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P3")) {
                            case "0" ->
                                P3Nom.setSelected(false);
                            case "1" ->
                                P3Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P4")) {
                            case "0" ->
                                P4Nom.setSelected(false);
                            case "1" ->
                                P4Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P5")) {
                            case "0" ->
                                P5Nom.setSelected(false);
                            case "1" ->
                                P5Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P6")) {
                            case "0" ->
                                P6Nom.setSelected(false);
                            case "1" ->
                                P6Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P7")) {
                            case "0" ->
                                P7Nom.setSelected(false);
                            case "1" ->
                                P7Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P8")) {
                            case "0" ->
                                P8Nom.setSelected(false);
                            case "1" ->
                                P8Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P9")) {
                            case "0" ->
                                P9Nom.setSelected(false);
                            case "1" ->
                                P9Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P10")) {
                            case "0" ->
                                P10Nom.setSelected(false);
                            case "1" ->
                                P10Nom.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P11")) {
                            case "0" ->
                                P11Nom.setSelected(false);
                            case "1" ->
                                P11Nom.setSelected(true);
                            default -> {
                            }
                        }

                        P1RH.setSelected(false);
                        P2RH.setSelected(false);
                        P3RH.setSelected(false);
                        P4RH.setSelected(false);
                        P5RH.setSelected(false);
                        P6RH.setSelected(false);
                        P7RH.setSelected(false);
                        P1Nom.setEnabled(true);
                        P2Nom.setEnabled(true);
                        P3Nom.setEnabled(true);
                        P4Nom.setEnabled(true);
                        P5Nom.setEnabled(true);
                        P6Nom.setEnabled(true);
                        P7Nom.setEnabled(true);
                        P8Nom.setEnabled(true);
                        P9Nom.setEnabled(true);
                        P10Nom.setEnabled(true);
                        P11Nom.setEnabled(true);
                        P1RH.setEnabled(false);
                        P2RH.setEnabled(false);
                        P3RH.setEnabled(false);
                        P4RH.setEnabled(false);
                        P5RH.setEnabled(false);
                        P6RH.setEnabled(false);
                        P7RH.setEnabled(false);
                        P1PEN.setEnabled(false);
                        P2PEN.setEnabled(false);
                        P3PEN.setEnabled(false);
                        P1PEN.setSelected(false);
                        P2PEN.setSelected(false);
                        P3PEN.setSelected(false);
                    }
                    case "4" -> {
                        AADP.setSelected(true);
                        switch (rs.getString("P1")) {
                            case "0" ->
                                P1PEN.setSelected(false);
                            case "1" ->
                                P1PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P2")) {
                            case "0" ->
                                P2PEN.setSelected(false);
                            case "1" ->
                                P2PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P3")) {
                            case "0" ->
                                P3PEN.setSelected(false);
                            case "1" ->
                                P3PEN.setSelected(true);
                            default -> {
                            }
                        }
                        /* switch (rs.getString("P4")) {
                            case "0" ->
                                P4PEN.setSelected(false);
                            case "1" ->
                                P4PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P5")) {
                            case "0" ->
                                P5PEN.setSelected(false);
                            case "1" ->
                                P5PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P6")) {
                            case "0" ->
                                P6PEN.setSelected(false);
                            case "1" ->
                                P6PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P7")) {
                            case "0" ->
                                P7PEN.setSelected(false);
                            case "1" ->
                                P7PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P8")) {
                            case "0" ->
                                P8PEN.setSelected(false);
                            case "1" ->
                                P8PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P9")) {
                            case "0" ->
                                P9PEN.setSelected(false);
                            case "1" ->
                                P9PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P10")) {
                            case "0" ->
                                P10PEN.setSelected(false);
                            case "1" ->
                                P10PEN.setSelected(true);
                            default -> {
                            }
                        }
                        switch (rs.getString("P11")) {
                            case "0" ->
                                P11PEN.setSelected(false);
                            case "1" ->
                                P11PEN.setSelected(true);
                            default -> {
                        }
                        }*/

                        P1RH.setSelected(false);
                        P2RH.setSelected(false);
                        P3RH.setSelected(false);
                        P4RH.setSelected(false);
                        P5RH.setSelected(false);
                        P6RH.setSelected(false);
                        P7RH.setSelected(false);
                        P1Nom.setEnabled(false);
                        P2Nom.setEnabled(false);
                        P3Nom.setEnabled(false);
                        P4Nom.setEnabled(false);
                        P5Nom.setEnabled(false);
                        P6Nom.setEnabled(false);
                        P7Nom.setEnabled(false);
                        P8Nom.setEnabled(false);
                        P9Nom.setEnabled(false);
                        P10Nom.setEnabled(false);
                        P11Nom.setEnabled(false);
                        P1Nom.setSelected(false);
                        P2Nom.setSelected(false);
                        P3Nom.setSelected(false);
                        P4Nom.setSelected(false);
                        P5Nom.setSelected(false);
                        P6Nom.setSelected(false);
                        P7Nom.setSelected(false);
                        P8Nom.setSelected(false);
                        P9Nom.setSelected(false);
                        P10Nom.setSelected(false);
                        P11Nom.setSelected(false);
                        P1PEN.setEnabled(true);
                        P2PEN.setEnabled(true);
                        P3PEN.setEnabled(true);
                        P1RH.setEnabled(false);
                        P2RH.setEnabled(false);
                        P3RH.setEnabled(false);
                        P4RH.setEnabled(false);
                        P5RH.setEnabled(false);
                        P6RH.setEnabled(false);
                        P7RH.setEnabled(false);
                    }
                    default -> {
                    }

                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(VentanaADM_3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_TrolesMouseClicked

    private void txtbtnpdumodMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnpdumodMousePressed
        int P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, VDAPDU;
        if (ADM.isSelected() == true) {
            VDAPDU = 0;
            P1 = 0;
            P2 = 0;
            P3 = 0;
            P4 = 0;
            P5 = 0;
            P6 = 0;
            P7 = 0;
            P8 = 0;
            P9 = 0;
            P10 = 0;
            P11 = 0;
            String SQLUP = "UPDATE `admin.usuarios` SET `Tipo de usuario` = '" + PDUadd.getText() + "',"
                    + " `Ventana de acceso` = '" + VDAPDU + "' WHERE `admin.usuarios`.`Tipo de usuario` = '" + PDUMod.getText() + "'";
            try {
                PreparedStatement ps = con.prepareStatement(SQLUP);
                ps.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error:" + e);
            }
            String SQL = "UPDATE `admin.tou` SET `id_TDO` = ?, `Usuario` = ?,"
                    + " `Ventana de acceso` = ?, `P1` = ?, `P2` = ?,"
                    + " `P3` = ?, `P4` = ?, `P5` = ?, `P6` = ?,"
                    + " `P7` = ?, `P8` = ?, `P9` = ?, `P10` = ?, `P11` = ?  WHERE `admin.tou`.`id_TDO` = ?";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);
                pst.setInt(15, Integer.parseInt(NumP.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario modificado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al modificar perfi de usuario: " + error_add_usr.getMessage());
            }
        }
        if (AAADN.isSelected() == true) {
            VDAPDU = 2;

            if (P1Nom.isSelected() == true) {
                P1 = 1;
            } else {
                P1 = 0;
            }
            if (P2Nom.isSelected() == true) {
                P2 = 1;
            } else {
                P2 = 0;
            }
            if (P3Nom.isSelected() == true) {
                P3 = 1;
            } else {
                P3 = 0;
            }
            if (P4Nom.isSelected() == true) {
                P4 = 1;
            } else {
                P4 = 0;
            }
            if (P5Nom.isSelected() == true) {
                P5 = 1;
            } else {
                P5 = 0;
            }
            if (P6Nom.isSelected() == true) {
                P6 = 1;
            } else {
                P6 = 0;
            }
            if (P7Nom.isSelected() == true) {
                P7 = 1;
            } else {
                P7 = 0;
            }
            if (P8Nom.isSelected() == true) {
                P8 = 1;
            } else {
                P8 = 0;
            }
            if (P9Nom.isSelected() == true) {
                P9 = 1;
            } else {
                P9 = 0;
            }
            if (P10Nom.isSelected() == true) {
                P10 = 1;
            } else {
                P10 = 0;
            }
            if (P11Nom.isSelected() == true) {
                P11 = 1;
            } else {
                P11 = 0;
            }
            String SQLUP = "UPDATE `admin.usuarios` SET `Tipo de usuario` = '" + PDUadd.getText() + "',"
                    + " `Ventana de acceso` = '" + VDAPDU + "' WHERE `admin.usuarios`.`Tipo de usuario` = '" + PDUMod.getText() + "'";
            try {
                PreparedStatement ps = con.prepareStatement(SQLUP);
                ps.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error:" + e);
            }
            String SQL = "UPDATE `admin.tou` SET `id_TDO` = ?, `Usuario` = ?,"
                    + " `Ventana de acceso` = ?, `P1` = ?, `P2` = ?,"
                    + " `P3` = ?, `P4` = ?, `P5` = ?, `P6` = ?,"
                    + " `P7` = ?, `P8` = ?, `P9` = ?, `P10` = ?, `P11` = ? WHERE `admin.tou`.`id_TDO` = ?";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);
                pst.setInt(15, Integer.parseInt(NumP.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario modificado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al modificar perfi de usuario: " + error_add_usr.getMessage());
            }
        }
        if (AAADRH.isSelected() == true) {
            VDAPDU = 1;
            if (P1RH.isSelected() == true) {
                P1 = 1;
            } else {
                P1 = 0;
            }
            if (P2RH.isSelected() == true) {
                P2 = 1;
            } else {
                P2 = 0;
            }
            if (P3RH.isSelected() == true) {
                P3 = 1;
            } else {
                P3 = 0;
            }
            if (P4RH.isSelected() == true) {
                P4 = 1;
            } else {
                P4 = 0;
            }
            if (P5RH.isSelected() == true) {
                P5 = 1;
            } else {
                P5 = 0;
            }
            if (P6RH.isSelected() == true) {
                P6 = 1;
            } else {
                P6 = 0;
            }
            if (P7RH.isSelected() == true) {
                P7 = 1;
            } else {
                P7 = 0;
            }
            P8 = 0;
            P9 = 0;
            P10 = 0;
            P11 = 0;

            String SQLUP = "UPDATE `admin.usuarios` SET `Tipo de usuario` = '" + PDUadd.getText() + "',"
                    + " `Ventana de acceso` = '" + VDAPDU + "' WHERE `admin.usuarios`.`Tipo de usuario` = '" + PDUMod.getText() + "'";
            try {
                PreparedStatement ps = con.prepareStatement(SQLUP);
                ps.executeUpdate();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "error:" + e);
            }
            String SQL = "UPDATE `admin.tou` SET `id_TDO` = ?, `Usuario` = ?,"
                    + " `Ventana de acceso` = ?, `P1` = ?, `P2` = ?,"
                    + " `P3` = ?, `P4` = ?, `P5` = ?, `P6` = ?,"
                    + " `P7` = ?, `P8` = ?, `P9` = ?, `P10` = ?, `P11` = ? WHERE `admin.tou`.`id_TDO` = ?";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);
                pst.setInt(15, Integer.parseInt(NumP.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario modificado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();
                MDusers();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al modificar perfi de usuario: " + error_add_usr.getMessage());
            }
        }

        if (AADP.isSelected() == true) {
            VDAPDU = 4;

            if (P1PEN.isSelected() == true) {
                P1 = 1;
            } else {
                P1 = 0;
            }
            if (P2PEN.isSelected() == true) {
                P2 = 1;
            } else {
                P2 = 0;
            }
            if (P3PEN.isSelected() == true) {
                P3 = 1;
            } else {
                P3 = 0;
            }
            P4 = 0;
            P5 = 0;
            P6 = 0;
            P7 = 0;
            P8 = 0;
            P9 = 0;
            P10 = 0;
            P11 = 0;

            String SQL = "INSERT INTO `admin.tou` (`id_TDO`, `Usuario`,"
                    + " `Ventana de acceso`, `P1`, `P2`, `P3`, `P4`, `P5`, `P6`, `P7`,"
                    + " `P8`, `P9`, `P10`, `P11`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario registrado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al agregar perfi de usuario: " + error_add_usr.getMessage());
            }
        }
        P1Nom.setSelected(false);
        P2Nom.setSelected(false);
        P3Nom.setSelected(false);
        P4Nom.setSelected(false);
        P5Nom.setSelected(false);
        P6Nom.setSelected(false);
        P7Nom.setSelected(false);
        P8Nom.setSelected(false);
        P9Nom.setSelected(false);
        P10Nom.setSelected(false);
        P11Nom.setSelected(false);
        P1RH.setSelected(false);
        P2RH.setSelected(false);
        P3RH.setSelected(false);
        P4RH.setSelected(false);
        P5RH.setSelected(false);
        P6RH.setSelected(false);
        P7RH.setSelected(false);
        P1Nom.setEnabled(false);
        P2Nom.setEnabled(false);
        P3Nom.setEnabled(false);
        P4Nom.setEnabled(false);
        P5Nom.setEnabled(false);
        P6Nom.setEnabled(false);
        P7Nom.setEnabled(false);
        P8Nom.setEnabled(false);
        P9Nom.setEnabled(false);
        P10Nom.setEnabled(false);
        P11Nom.setEnabled(false);
        P1RH.setEnabled(false);
        P2RH.setEnabled(false);
        P3RH.setEnabled(false);
        P4RH.setEnabled(false);
        P5RH.setEnabled(false);
        P6RH.setEnabled(false);
        P7RH.setEnabled(false);
        P1PEN.setEnabled(false);
        P2PEN.setEnabled(false);
        P3PEN.setEnabled(false);
        P1PEN.setSelected(false);
        P2PEN.setSelected(false);
        P3PEN.setSelected(false);
        Btnpduadd.setVisible(true);
        txtbtnadd.setVisible(true);
        PDUMod.setText("N/A");

    }//GEN-LAST:event_txtbtnpdumodMousePressed

    private void ADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMActionPerformed
        if (ADM.isSelected() == true) {
            P1Nom.setSelected(false);
            P2Nom.setSelected(false);
            P3Nom.setSelected(false);
            P4Nom.setSelected(false);
            P5Nom.setSelected(false);
            P6Nom.setSelected(false);
            P7Nom.setSelected(false);
            P8Nom.setSelected(false);
            P9Nom.setSelected(false);
            P10Nom.setSelected(false);
            P11Nom.setSelected(false);
            P1RH.setSelected(false);
            P2RH.setSelected(false);
            P3RH.setSelected(false);
            P4RH.setSelected(false);
            P5RH.setSelected(false);
            P6RH.setSelected(false);
            P7RH.setSelected(false);
            P1Nom.setEnabled(false);
            P2Nom.setEnabled(false);
            P3Nom.setEnabled(false);
            P4Nom.setEnabled(false);
            P5Nom.setEnabled(false);
            P6Nom.setEnabled(false);
            P7Nom.setEnabled(false);
            P8Nom.setEnabled(false);
            P9Nom.setEnabled(false);
            P10Nom.setEnabled(false);
            P11Nom.setEnabled(false);
            P1RH.setEnabled(false);
            P2RH.setEnabled(false);
            P3RH.setEnabled(false);
            P4RH.setEnabled(false);
            P5RH.setEnabled(false);
            P6RH.setEnabled(false);
            P7RH.setEnabled(false);
            P1PEN.setEnabled(false);
            P2PEN.setEnabled(false);
            P3PEN.setEnabled(false);
            P1PEN.setSelected(false);
            P2PEN.setSelected(false);
            P3PEN.setSelected(false);
        }
    }//GEN-LAST:event_ADMActionPerformed

    private void AAADRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AAADRHActionPerformed
        if (AAADRH.isSelected() == true) {
            P1Nom.setSelected(false);
            P2Nom.setSelected(false);
            P3Nom.setSelected(false);
            P4Nom.setSelected(false);
            P5Nom.setSelected(false);
            P6Nom.setSelected(false);
            P7Nom.setSelected(false);
            P8Nom.setSelected(false);
            P9Nom.setSelected(false);
            P10Nom.setSelected(false);
            P11Nom.setSelected(false);
            P1RH.setSelected(true);
            P2RH.setSelected(true);
            P3RH.setSelected(true);
            P4RH.setSelected(true);
            P5RH.setSelected(true);
            P6RH.setSelected(true);
            P7RH.setSelected(true);
            P1Nom.setEnabled(false);
            P2Nom.setEnabled(false);
            P3Nom.setEnabled(false);
            P4Nom.setEnabled(false);
            P5Nom.setEnabled(false);
            P6Nom.setEnabled(false);
            P7Nom.setEnabled(false);
            P8Nom.setEnabled(false);
            P9Nom.setEnabled(false);
            P10Nom.setEnabled(false);
            P11Nom.setEnabled(false);
            P1RH.setEnabled(true);
            P2RH.setEnabled(true);
            P3RH.setEnabled(true);
            P4RH.setEnabled(true);
            P5RH.setEnabled(true);
            P6RH.setEnabled(true);
            P7RH.setEnabled(true);
            P1PEN.setEnabled(false);
            P2PEN.setEnabled(false);
            P3PEN.setEnabled(false);
            P1PEN.setSelected(false);
            P2PEN.setSelected(false);
            P3PEN.setSelected(false);
        }
    }//GEN-LAST:event_AAADRHActionPerformed

    private void txtbtnpduaddMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnpduaddMousePressed
        int P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, P11, VDAPDU;
        if (ADM.isSelected() == true) {
            VDAPDU = 0;
            P1 = 0;
            P2 = 0;
            P3 = 0;
            P4 = 0;
            P5 = 0;
            P6 = 0;
            P7 = 0;
            P8 = 0;
            P9 = 0;
            P10 = 0;
            P11 = 0;
            String SQL = "INSERT INTO `admin.tou` (`id_TDO`, `Usuario`,"
                    + " `Ventana de acceso`, `P1`, `P2`, `P3`, `P4`, `P5`, `P6`, `P7`,"
                    + " `P8`, `P9`, `P10`, `P11`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario registrado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al agregar perfi de usuario: " + error_add_usr.getMessage());
            }
        }
        if (AAADN.isSelected() == true) {
            VDAPDU = 2;

            if (P1Nom.isSelected() == true) {
                P1 = 1;
            } else {
                P1 = 0;
            }
            if (P2Nom.isSelected() == true) {
                P2 = 1;
            } else {
                P2 = 0;
            }
            if (P3Nom.isSelected() == true) {
                P3 = 1;
            } else {
                P3 = 0;
            }
            if (P4Nom.isSelected() == true) {
                P4 = 1;
            } else {
                P4 = 0;
            }
            if (P5Nom.isSelected() == true) {
                P5 = 1;
            } else {
                P5 = 0;
            }
            if (P6Nom.isSelected() == true) {
                P6 = 1;
            } else {
                P6 = 0;
            }
            if (P7Nom.isSelected() == true) {
                P7 = 1;
            } else {
                P7 = 0;
            }
            if (P8Nom.isSelected() == true) {
                P8 = 1;
            } else {
                P8 = 0;
            }
            if (P9Nom.isSelected() == true) {
                P9 = 1;
            } else {
                P9 = 0;
            }
            if (P10Nom.isSelected() == true) {
                P10 = 1;
            } else {
                P10 = 0;
            }
            if (P11Nom.isSelected() == true) {
                P11 = 1;
            } else {
                P11 = 0;
            }
            String SQL = "INSERT INTO `admin.tou` (`id_TDO`, `Usuario`,"
                    + " `Ventana de acceso`, `P1`, `P2`, `P3`, `P4`, `P5`, `P6`, `P7`,"
                    + " `P8`, `P9`, `P10`, `P11`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario registrado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al agregar perfi de usuario: " + error_add_usr.getMessage());
            }
        }
        if (AAADRH.isSelected() == true) {
            VDAPDU = 1;
            if (P1RH.isSelected() == true) {
                P1 = 1;
            } else {
                P1 = 0;
            }
            if (P2RH.isSelected() == true) {
                P2 = 1;
            } else {
                P2 = 0;
            }
            if (P3RH.isSelected() == true) {
                P3 = 1;
            } else {
                P3 = 0;
            }
            if (P4RH.isSelected() == true) {
                P4 = 1;
            } else {
                P4 = 0;
            }
            if (P5RH.isSelected() == true) {
                P5 = 1;
            } else {
                P5 = 0;
            }
            if (P6RH.isSelected() == true) {
                P6 = 1;
            } else {
                P6 = 0;
            }
            if (P7RH.isSelected() == true) {
                P7 = 1;
            } else {
                P7 = 0;
            }
            P8 = 0;
            P9 = 0;
            P10 = 0;
            P11 = 0;
            String SQL = "INSERT INTO `admin.tou` (`id_TDO`, `Usuario`,"
                    + " `Ventana de acceso`, `P1`, `P2`, `P3`, `P4`, `P5`, `P6`, `P7`,"
                    + " `P8`, `P9`, `P10`, `P11`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario registrado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al agregar perfi de usuario: " + error_add_usr.getMessage());
            }
        }
        if (AADP.isSelected() == true) {
            VDAPDU = 4;

            if (P1PEN.isSelected() == true) {
                P1 = 1;
            } else {
                P1 = 0;
            }
            if (P2PEN.isSelected() == true) {
                P2 = 1;
            } else {
                P2 = 0;
            }
            if (P3PEN.isSelected() == true) {
                P3 = 1;
            } else {
                P3 = 0;
            }
            P4 = 0;
            P5 = 0;
            P6 = 0;
            P7 = 0;
            P8 = 0;
            P9 = 0;
            P10 = 0;
            P11 = 0;

            String SQL = "INSERT INTO `admin.tou` (`id_TDO`, `Usuario`,"
                    + " `Ventana de acceso`, `P1`, `P2`, `P3`, `P4`, `P5`, `P6`, `P7`,"
                    + " `P8`, `P9`, `P10`, `P11`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setInt(1, Integer.parseInt(NumP.getText()));
                pst.setString(2, PDUadd.getText());
                pst.setInt(3, VDAPDU);
                pst.setInt(4, P1);
                pst.setInt(5, P2);
                pst.setInt(6, P3);
                pst.setInt(7, P4);
                pst.setInt(8, P5);
                pst.setInt(9, P6);
                pst.setInt(10, P7);
                pst.setInt(11, P8);
                pst.setInt(12, P9);
                pst.setInt(13, P10);
                pst.setInt(14, P11);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Perfil de usuario registrado");

                //limpiar
                NumP.setText("0");
                PDUadd.setText("");

                MDRoles();

            } catch (HeadlessException | SQLException error_add_usr) {
                JOptionPane.showMessageDialog(null, "Error al agregar perfi de usuario: " + error_add_usr.getMessage());
            }
        }

        P1Nom.setSelected(false);
        P2Nom.setSelected(false);
        P3Nom.setSelected(false);
        P4Nom.setSelected(false);
        P5Nom.setSelected(false);
        P6Nom.setSelected(false);
        P7Nom.setSelected(false);
        P8Nom.setSelected(false);
        P9Nom.setSelected(false);
        P10Nom.setSelected(false);
        P11Nom.setSelected(false);
        P1RH.setSelected(false);
        P2RH.setSelected(false);
        P3RH.setSelected(false);
        P4RH.setSelected(false);
        P5RH.setSelected(false);
        P6RH.setSelected(false);
        P7RH.setSelected(false);
        P1Nom.setEnabled(false);
        P2Nom.setEnabled(false);
        P3Nom.setEnabled(false);
        P4Nom.setEnabled(false);
        P5Nom.setEnabled(false);
        P6Nom.setEnabled(false);
        P7Nom.setEnabled(false);
        P8Nom.setEnabled(false);
        P9Nom.setEnabled(false);
        P10Nom.setEnabled(false);
        P11Nom.setEnabled(false);
        P1RH.setEnabled(false);
        P2RH.setEnabled(false);
        P3RH.setEnabled(false);
        P4RH.setEnabled(false);
        P5RH.setEnabled(false);
        P6RH.setEnabled(false);
        P7RH.setEnabled(false);
        P1PEN.setEnabled(false);
        P2PEN.setEnabled(false);
        P3PEN.setEnabled(false);
        P1PEN.setSelected(false);
        P2PEN.setSelected(false);
        P3PEN.setSelected(false);
        VDA.clearSelection();
    }//GEN-LAST:event_txtbtnpduaddMousePressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DepositosQ_4 regr = new DepositosQ_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void CDA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA4ActionPerformed
        CDAS_5 regr = new CDAS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDA4ActionPerformed

    private void ODT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODT2ActionPerformed
        ODTS_5 regr = new ODTS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODT2ActionPerformed

    private void LDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LDAActionPerformed
        Listas_CI_5 regr = new Listas_CI_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LDAActionPerformed

    private void LDA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LDA3ActionPerformed
        Listas_SI_5 regr = new Listas_SI_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LDA3ActionPerformed

    private void BNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BNameKeyReleased
        shareN();
    }//GEN-LAST:event_BNameKeyReleased

    private void shareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shareMouseClicked

        int seleccionar = share.getSelectedRow();
        NE.setText(String.valueOf(share.getValueAt(seleccionar, 0)));
        ApEDE.setText(String.valueOf(share.getValueAt(seleccionar, 1)));
        AmEDE.setText(String.valueOf(share.getValueAt(seleccionar, 2)));
        nameEDE.setText(String.valueOf(share.getValueAt(seleccionar, 3)));

    }//GEN-LAST:event_shareMouseClicked

    private void FiltrosNomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosNomItemStateChanged

        String dt = (String) FiltrosNom.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Filtro1.setVisible(false);
            Filtro1.setText("");
            BName.setVisible(false);
            BName.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido P")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido P:");
            BName.setVisible(false);
            BName.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(true);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido M")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido M:");
            BName.setVisible(false);
            BName.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(true);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Nombre(s)")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Nombre(s):");
            BName.setVisible(true);
            BName.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
    }//GEN-LAST:event_FiltrosNomItemStateChanged

    private void BAMNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAMNomKeyReleased
        shareN();
    }//GEN-LAST:event_BAMNomKeyReleased

    private void BAPNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAPNomKeyReleased
        shareN();
    }//GEN-LAST:event_BAPNomKeyReleased

    private void BName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BName1KeyReleased
        MDACT();
    }//GEN-LAST:event_BName1KeyReleased

    private void BAPNom1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAPNom1KeyReleased
        MDACT();
    }//GEN-LAST:event_BAPNom1KeyReleased

    private void BAMNom1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAMNom1KeyReleased
        MDACT();

    }//GEN-LAST:event_BAMNom1KeyReleased

    private void FiltrosNom1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosNom1ItemStateChanged
        MDACT();
    }//GEN-LAST:event_FiltrosNom1ItemStateChanged

    private void share1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share1MouseClicked
        try {
            int seleccionar = share1.getSelectedRow();
            NR.setText(String.valueOf(share1.getValueAt(seleccionar, 0)));
            NE.setText(String.valueOf(share1.getValueAt(seleccionar, 1)));
            ApEDE.setText(String.valueOf(share1.getValueAt(seleccionar, 2)));
            AmEDE.setText(String.valueOf(share1.getValueAt(seleccionar, 3)));
            nameEDE.setText(String.valueOf(share1.getValueAt(seleccionar, 4)));
            int id = Integer.parseInt(share1.getValueAt(seleccionar, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select `Activo` from `admin.reciboefectivo` where `#registro` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();

            while (rs.next()) {
                if (rs.getString(1).equals("Si")) {
                    ACT.setSelected(true);
                } else {
                    ACT.setSelected(false);
                }

            }
            ps.isClosed();
            rs.isClosed();

        } catch (SQLException ex) {
            Logger.getLogger(VentanaADM_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_share1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String ACEDE;
        if (ACT.isSelected() == true) {
            ACEDE = "Si";
        } else {
            ACEDE = "No";
        }
        String SQL = "INSERT INTO `admin.reciboefectivo` (`#registro`, `# Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Activo`) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NR.getText()));
            pst.setString(2, NE.getText());
            pst.setString(3, ApEDE.getText());
            pst.setString(4, AmEDE.getText());
            pst.setString(5, nameEDE.getText());
            pst.setString(6, ACEDE);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro agregado.");

            NE.setText("");
            NR.setText("0");
            ApEDE.setText("");
            AmEDE.setText("");
            nameEDE.setText("");
            ACT.setSelected(false);
            MDACT();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar registro: " + e);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String ACEDE;
        if (ACT.isSelected() == true) {
            ACEDE = "Si";
        } else {
            ACEDE = "No";
        }
        String SQL = "UPDATE `admin.reciboefectivo` SET `#registro` = ?, `# Empleado` = ?, "
                + "`Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Activo` = ? WHERE `admin.reciboefectivo`.`#registro` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NR.getText()));
            pst.setString(2, NE.getText());
            pst.setString(3, ApEDE.getText());
            pst.setString(4, AmEDE.getText());
            pst.setString(5, nameEDE.getText());
            pst.setString(6, ACEDE);
            pst.setInt(7, Integer.parseInt(NR.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro modificado.");

            NE.setText("");
            NR.setText("0");
            ApEDE.setText("");
            AmEDE.setText("");
            nameEDE.setText("");
            ACT.setSelected(false);
            MDACT();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar registro: " + e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        EdicionPagos_3 regr = new EdicionPagos_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void AADPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AADPActionPerformed
        if (AADP.isSelected() == true) {
            P1Nom.setSelected(false);
            P2Nom.setSelected(false);
            P3Nom.setSelected(false);
            P4Nom.setSelected(false);
            P5Nom.setSelected(false);
            P6Nom.setSelected(false);
            P7Nom.setSelected(false);
            P8Nom.setSelected(false);
            P9Nom.setSelected(false);
            P10Nom.setSelected(false);
            P11Nom.setSelected(false);
            P1Nom.setEnabled(false);
            P2Nom.setEnabled(false);
            P3Nom.setEnabled(false);
            P4Nom.setEnabled(false);
            P5Nom.setEnabled(false);
            P6Nom.setEnabled(false);
            P7Nom.setEnabled(false);
            P8Nom.setEnabled(false);
            P9Nom.setEnabled(false);
            P10Nom.setEnabled(false);
            P11Nom.setEnabled(false);
            P1PEN.setEnabled(true);
            P2PEN.setEnabled(true);
            P3PEN.setEnabled(true);
            P1PEN.setSelected(true);
            P2PEN.setSelected(true);
            P3PEN.setSelected(true);
        }
    }//GEN-LAST:event_AADPActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaADM_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new VentanaADM_3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AAADN;
    private javax.swing.JRadioButton AAADRH;
    private javax.swing.JRadioButton AADP;
    private javax.swing.JCheckBox AAS;
    private javax.swing.JCheckBox ACT;
    private javax.swing.JRadioButton ADM;
    private javax.swing.JTextField AmEDE;
    private javax.swing.JTextField Amadduser;
    private javax.swing.JTextField ApEDE;
    private javax.swing.JTextField Apadduser;
    private javax.swing.JTextField BAMNom;
    private javax.swing.JTextField BAMNom1;
    private javax.swing.JTextField BAPNom;
    private javax.swing.JTextField BAPNom1;
    private javax.swing.JTextField BName;
    private javax.swing.JTextField BName1;
    private javax.swing.JPanel Btnpduadd;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA4;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JMenu Depositos;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JTextField FillAm;
    private javax.swing.JTextField FillAp;
    private javax.swing.JTextField Filname;
    private javax.swing.JLabel Filtro1;
    private javax.swing.JLabel Filtro2;
    private javax.swing.JComboBox<String> FiltrosNom;
    private javax.swing.JComboBox<String> FiltrosNom1;
    private javax.swing.JMenuItem General;
    private javax.swing.JTextField IDuser;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JMenuItem LDA3;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JTextField NE;
    private javax.swing.JTextField NR;
    private javax.swing.JTextField Nameadduser;
    private javax.swing.JTextField NumP;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JCheckBox P10Nom;
    private javax.swing.JCheckBox P11Nom;
    private javax.swing.JCheckBox P1Nom;
    private javax.swing.JCheckBox P1PEN;
    private javax.swing.JCheckBox P1RH;
    private javax.swing.JCheckBox P2Nom;
    private javax.swing.JCheckBox P2PEN;
    private javax.swing.JCheckBox P2RH;
    private javax.swing.JCheckBox P3Nom;
    private javax.swing.JCheckBox P3PEN;
    private javax.swing.JCheckBox P3RH;
    private javax.swing.JCheckBox P4Nom;
    private javax.swing.JCheckBox P4RH;
    private javax.swing.JCheckBox P5Nom;
    private javax.swing.JCheckBox P5RH;
    private javax.swing.JCheckBox P6Nom;
    private javax.swing.JCheckBox P6RH;
    private javax.swing.JCheckBox P7Nom;
    private javax.swing.JCheckBox P7RH;
    private javax.swing.JCheckBox P8Nom;
    private javax.swing.JCheckBox P9Nom;
    private javax.swing.JLabel PDUMod;
    private javax.swing.JTextField PDUadd;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JPanel Panebtnmod;
    private javax.swing.JComboBox<String> TOUadd;
    private javax.swing.JTable TUser;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JTable Troles;
    private javax.swing.JTextField Useradd;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JPanel btnadd;
    private javax.swing.JPanel btnpdumod;
    private javax.swing.JComboBox<String> cbxfillusrs;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameEDE;
    private javax.swing.JTextField passuserad;
    private javax.swing.JTable share;
    private javax.swing.JTable share1;
    private javax.swing.JLabel txtbtnadd;
    private javax.swing.JLabel txtbtnmod;
    private javax.swing.JLabel txtbtnpduadd;
    private javax.swing.JLabel txtbtnpdumod;
    // End of variables declaration//GEN-END:variables
}
