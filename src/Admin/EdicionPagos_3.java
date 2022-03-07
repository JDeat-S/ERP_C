package Admin;

import Nomina.Prenomina.*;
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
import Logicas.BDNomQ.Logica_bd_pagosCDAQ;
import Logicas.BDNomQ.Logica_bd_pagosODTQ;
import Logicas.BDNomQ.Logica_bd_pagosPresQ;
import Logicas.BDNomS.Logica_bd_pagosCDAS;
import Logicas.BDNomS.Logica_bd_pagosPresS;
import Pensiones.PensionesVP_7;
import Semanal.Padrones.Padrones;
import Semanal.Vales.Rvales;
import Semanal.Vales.VDE;
import java.awt.HeadlessException;
import RH.Depositos.*;
import RH.Depositos.Santander.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 *
 */
public final class EdicionPagos_3 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Logica_usuarios usr;
    Logica_permisos LP;

    public EdicionPagos_3() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(EdicionPagos_3.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        NL.setVisible(false);
        NODT.setVisible(false);
        LabelfilPODT.setVisible(false);
        FilnamePODT.setVisible(false);
        FilApPODT.setVisible(false);
        FilAmPODT.setVisible(false);
        NL1.setVisible(false);
        NODT1.setVisible(false);
        LabelfilPODT1.setVisible(false);
        FilnamePODT1.setVisible(false);
        FilApPODT1.setVisible(false);
        FilAmPODT1.setVisible(false);
        NL3.setVisible(false);
        NC.setVisible(false);
        labelpcda.setVisible(false);
        FilnamePCDA.setVisible(false);
        FilAPPCDA.setVisible(false);
        FilAMPCDA.setVisible(false);
        NL4.setVisible(false);
        NC1.setVisible(false);
        labelpcda1.setVisible(false);
        FilnamePCDA1.setVisible(false);
        FilAPPCDA1.setVisible(false);
        FilAMPCDA1.setVisible(false);
        NL5.setVisible(false);
        NP.setVisible(false);
        LabelFPDP.setVisible(false);
        FilPDPname.setVisible(false);
        FilPDPAp.setVisible(false);
        FilPDPAm.setVisible(false);
        NL2.setVisible(false);
        NP1.setVisible(false);
        LabelFPDP1.setVisible(false);
        FilPDPname1.setVisible(false);
        FilPDPAp1.setVisible(false);
        FilPDPAm1.setVisible(false);
        MDTPODT();
        MDTPCDA();
        MDTPPres();

    }

    public EdicionPagos_3(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        this.usr = usr;
        this.LP = LP;
        setIconImage(new ImageIcon(EdicionPagos_3.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        NL.setVisible(false);
        NODT.setVisible(false);
        LabelfilPODT.setVisible(false);
        FilnamePODT.setVisible(false);
        FilApPODT.setVisible(false);
        FilAmPODT.setVisible(false);
        NL1.setVisible(false);
        NODT1.setVisible(false);
        LabelfilPODT1.setVisible(false);
        FilnamePODT1.setVisible(false);
        FilApPODT1.setVisible(false);
        FilAmPODT1.setVisible(false);
        NL3.setVisible(false);
        NC.setVisible(false);
        labelpcda.setVisible(false);
        FilnamePCDA.setVisible(false);
        FilAPPCDA.setVisible(false);
        FilAMPCDA.setVisible(false);
        NL4.setVisible(false);
        NC1.setVisible(false);
        labelpcda1.setVisible(false);
        FilnamePCDA1.setVisible(false);
        FilAPPCDA1.setVisible(false);
        FilAMPCDA1.setVisible(false);
        NL5.setVisible(false);
        NP.setVisible(false);
        LabelFPDP.setVisible(false);
        FilPDPname.setVisible(false);
        FilPDPAp.setVisible(false);
        FilPDPAm.setVisible(false);
        NL2.setVisible(false);
        NP1.setVisible(false);
        LabelFPDP1.setVisible(false);
        FilPDPname1.setVisible(false);
        FilPDPAp1.setVisible(false);
        FilPDPAm1.setVisible(false);
        MDTPODT();
        MDTPCDA();
        MDTPPres();
        setTitle("Ventana Pagos # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
                + " Tipo de ususario: " + usr.getNombre_tipo() + " Usuario: " + usr.getUsuario());
    }

    public void MDTPODT() {
        String FiltroN = FilnamePODT.getText();
        String FAP = FilApPODT.getText();
        String FAM = FilAmPODT.getText();
        String where = "SELECT * FROM `nomina.pagos.odt`";

        if (!"".equals(FiltroN)) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(NL.getText())) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " Where `#Lista` LIKE '%" + NL.getText() + "%'";
        } else if (!"".equals(NODT.getText())) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " Where `# de orden` LIKE '%" + NODT.getText() + "%'";
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
            TPODT.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# Lista");
            modelo.addColumn("# de orden");//2
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//8
            modelo.addColumn("Quincena");
            modelo.addColumn("# quincena");//10
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//12
            modelo.addColumn("Pago de orden de taller");

//ANCHOS
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*ZON*/ 50,
                /*SERV*/ 50, /*QUIN*/ 60, /*NQ*/ 50, /*PAG*/ 60, /*PEN*/ 60,/*PDODT*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TPODT.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mpdodt) {
            JOptionPane.showMessageDialog(null, "Error al motrar pagos de ordenes de taller: " + error_mpdodt.getMessage());

        }

    }

    public void MDTPCDA() {
        String FiltroN = FilnamePCDA.getText();
        String FAP = FilAPPCDA.getText();
        String FAM = FilAMPCDA.getText();
        String where = "SELECT * FROM `nomina.pagos.cda`";

        if (!"".equals(FiltroN)) {
            where = "SELECT * FROM `nomina.pagos.cda`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT * FROM `nomina.pagos.cda`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT * FROM `nomina.pagos.cda`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(NL2.getText())) {
            where = "SELECT * FROM `nomina.pagos.cda`"
                    + " Where `#Lista` LIKE '%" + NL2.getText() + "%'";
        } else if (!"".equals(NC.getText())) {
            where = "SELECT * FROM `nomina.pagos.cda`"
                    + " Where `#caja` LIKE '%" + NC.getText() + "%'";
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
            TPCDA.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# Lista");//2
            modelo.addColumn("# caja");//2
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//8
            modelo.addColumn("Quincena");
            modelo.addColumn("Caja de ahorro");//10
            modelo.addColumn("Observaciones");
            modelo.addColumn("Qnas aportadas");//12
            modelo.addColumn("# de recibo de pago");

//ANCHOS
            int[] anchos = {/*ND*/30, /*NL*/ 30, /*NC*/ 30, /*NE*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*ZON*/ 50,
                /*SERV*/ 50, /*QUIN*/ 60, /*cda*/ 50, /*OBS*/ 100, /*QA*/ 60,/*NDRDP*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TPCDA.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos pagos de caja de ahorro: " + error_mostrsr_pcda.getMessage());

        }

    }

    public void MDTPPres() {
        String FiltroN = FilPDPname.getText();
        String FAP = FilPDPAp.getText();
        String FAM = FilPDPAm.getText();
        String where = "SELECT * FROM `nomina.pagos.prestamos`";

        if (!"".equals(FiltroN)) {
            where = "SELECT * FROM `nomina.pagos.prestamos`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT * FROM `nomina.pagos.prestamos`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT * FROM `nomina.pagos.prestamos`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(NL.getText())) {
            where = "SELECT * FROM `nomina.pagos.prestamos`"
                    + " Where `#Lista` LIKE '%" + NL1.getText() + "%'";
        } else if (!"".equals(NP.getText())) {
            where = "SELECT * FROM `nomina.pagos.prestamos`"
                    + " Where `#prestamo` LIKE '%" + NP.getText() + "%'";
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
            TPPRES.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# Lista");
            modelo.addColumn("# de prestamo");//2
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//8
            modelo.addColumn("Quincena");
            modelo.addColumn("# quincena");//10
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//12
            modelo.addColumn("Pago de prestamo");

//ANCHOS
            int[] anchos = {50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*ZON*/ 50,
                /*SERV*/ 50, /*QUIN*/ 60, /*NQ*/ 50, /*PAG*/ 60, /*PEN*/ 60,/*PDPres*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TPPRES.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mpdp) {
            JOptionPane.showMessageDialog(null, "Error al mostrar pagos de Prestamos: " + error_mpdp.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TPODT = new javax.swing.JTable();
        jLabel153 = new javax.swing.JLabel();
        FiltrosPDODT = new javax.swing.JComboBox<>();
        LabelfilPODT = new javax.swing.JLabel();
        FilnamePODT = new javax.swing.JTextField();
        FilApPODT = new javax.swing.JTextField();
        FilAmPODT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NL = new javax.swing.JTextField();
        NODT = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        NLODT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        NODTM = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        NEODT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        NFODT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        AMODT = new javax.swing.JTextField();
        NAMEODT = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        APODT = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        ZONODT = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        SERVODT = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        QUINODT = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        NQUINODT = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        PAGODT = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        PENODT = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        PODT = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        TPDP = new javax.swing.JScrollPane();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TPPRES = new javax.swing.JTable();
        jLabel157 = new javax.swing.JLabel();
        FiltrosTPDP = new javax.swing.JComboBox<>();
        LabelFPDP = new javax.swing.JLabel();
        FilPDPname = new javax.swing.JTextField();
        FilPDPAp = new javax.swing.JTextField();
        FilPDPAm = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NP = new javax.swing.JTextField();
        NL1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        NLPRES = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        NPRES = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        NEPRES = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        NFPRES = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        AMPRES = new javax.swing.JTextField();
        NAMEPRES = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        APPRES = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        ZONPRES = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        SERVPRES = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        QUINPRES = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        NQUINPRES = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        PAGPRES = new javax.swing.JTextField();
        PPRES = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        PENPRES = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPCDA = new javax.swing.JTable();
        jLabel155 = new javax.swing.JLabel();
        FilPCDA = new javax.swing.JComboBox<>();
        labelpcda = new javax.swing.JLabel();
        FilnamePCDA = new javax.swing.JTextField();
        FilAPPCDA = new javax.swing.JTextField();
        FilAMPCDA = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        NL2 = new javax.swing.JTextField();
        NC = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        NLCDA = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        NCDA = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        NECDA = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        NFCDA = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        AMCDA = new javax.swing.JTextField();
        NAMECDA = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        APCDA = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        ZONCDA = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        SERVCDA = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        QUINCDA = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        PCDA = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        OBVCDA = new javax.swing.JTextField();
        NRDPCDA = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        QACDA = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        TPODT1 = new javax.swing.JTable();
        jLabel154 = new javax.swing.JLabel();
        FiltrosPDODT1 = new javax.swing.JComboBox<>();
        LabelfilPODT1 = new javax.swing.JLabel();
        FilnamePODT1 = new javax.swing.JTextField();
        FilApPODT1 = new javax.swing.JTextField();
        FilAmPODT1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        NL3 = new javax.swing.JTextField();
        NODT1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel130 = new javax.swing.JLabel();
        NREcda1 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        TPCDA1 = new javax.swing.JTable();
        jLabel151 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        obdpagocda1 = new javax.swing.JTextArea();
        jLabel156 = new javax.swing.JLabel();
        NFpagocda1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel158 = new javax.swing.JLabel();
        FilPCDA1 = new javax.swing.JComboBox<>();
        labelpcda1 = new javax.swing.JLabel();
        FilnamePCDA1 = new javax.swing.JTextField();
        FilAPPCDA1 = new javax.swing.JTextField();
        FilAMPCDA1 = new javax.swing.JTextField();
        MMAPagos1 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        MADE1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ADCDA1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        NQna1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        NL4 = new javax.swing.JTextField();
        NC1 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        FilPDPAm1 = new javax.swing.JTextField();
        FilPDPAp1 = new javax.swing.JTextField();
        FilPDPname1 = new javax.swing.JTextField();
        LabelFPDP1 = new javax.swing.JLabel();
        FiltrosTPDP1 = new javax.swing.JComboBox<>();
        jLabel159 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        TPPRES1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        NP1 = new javax.swing.JTextField();
        NL5 = new javax.swing.JTextField();
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
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        General = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        Depositos = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        ADMV2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TPODT.setModel(new javax.swing.table.DefaultTableModel(
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
        TPODT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TPODTMousePressed(evt);
            }
        });
        jScrollPane11.setViewportView(TPODT);

        jLabel153.setText("Filtros:");

        FiltrosPDODT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Lista", "# Orden" }));
        FiltrosPDODT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosPDODTItemStateChanged(evt);
            }
        });

        LabelfilPODT.setText("jLabel154");

        FilnamePODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilnamePODTKeyReleased(evt);
            }
        });

        FilApPODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilApPODTKeyReleased(evt);
            }
        });

        FilAmPODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAmPODTKeyReleased(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        NL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NLKeyReleased(evt);
            }
        });

        NODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NODTKeyReleased(evt);
            }
        });

        jLabel14.setText("# Lista:");

        jLabel15.setText("# orden:");

        jLabel16.setText("# Empleado:");

        jLabel17.setText("Apellido P:");

        jLabel13.setText("# Folio:");

        NFODT.setEditable(false);
        NFODT.setText("0");

        jLabel19.setText("Nombre(s):");

        jLabel18.setText("Apellido M:");

        jLabel20.setText("Zona:");

        jLabel21.setText("Servicio:");

        jLabel22.setText("Quincena:");

        jLabel23.setText("# Quincena:");

        jLabel24.setText("Pagado:");

        jLabel37.setText("Pendiente:");

        jLabel38.setText("Pago odt:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NFODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(ZONODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(NLODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NODTM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NEODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(APODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AMODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAMEODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(SERVODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QUINODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NQUINODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PAGODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PENODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(NFODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(NLODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(NODTM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(NEODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(APODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(AMODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(NAMEODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(ZONODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(SERVODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(QUINODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(NQUINODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(PAGODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(PENODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(PODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane11))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosPDODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(LabelfilPODT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilnamePODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilApPODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAmPODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addContainerGap(1666, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel153)
                    .addComponent(FiltrosPDODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelfilPODT)
                    .addComponent(FilnamePODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilApPODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAmPODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(NL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3))
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Pagos Orden de taller", jPanel19);

        TPPRES.setModel(new javax.swing.table.DefaultTableModel(
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
        TPPRES.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TPPRESMousePressed(evt);
            }
        });
        jScrollPane12.setViewportView(TPPRES);

        jLabel157.setText("Filtros:");

        FiltrosTPDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Lista", "# Prestamo" }));
        FiltrosTPDP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTPDPItemStateChanged(evt);
            }
        });

        LabelFPDP.setText("jLabel158");

        FilPDPname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPnameKeyReleased(evt);
            }
        });

        FilPDPAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPApKeyReleased(evt);
            }
        });

        FilPDPAm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPAmKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        NP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NPKeyReleased(evt);
            }
        });

        NL1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NL1KeyReleased(evt);
            }
        });

        jLabel25.setText("# Lista:");

        jLabel26.setText("# prestamo:");

        jLabel27.setText("# Empleado:");

        jLabel28.setText("Apellido P:");

        jLabel29.setText("# Folio:");

        NFPRES.setEditable(false);
        NFPRES.setText("0");

        jLabel30.setText("Nombre(s):");

        jLabel31.setText("Apellido M:");

        jLabel32.setText("Zona:");

        jLabel33.setText("Servicio:");

        jLabel34.setText("Quincena:");

        jLabel35.setText("# Quincena:");

        jLabel36.setText("Pagado:");

        jLabel39.setText("Pago Pres:");

        jLabel40.setText("Pendiente:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(NFPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ZONPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(NLPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NEPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(APPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AMPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAMEPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(SERVPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QUINPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NQUINPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PAGPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PENPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PPRES, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(NFPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(NLPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(NPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(NEPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(APPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(AMPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(NAMEPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel40)
                        .addComponent(PENPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39)
                        .addComponent(PPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(ZONPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel33)
                        .addComponent(SERVPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel34)
                        .addComponent(QUINPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel35)
                        .addComponent(NQUINPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel36)
                        .addComponent(PAGPRES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton4.setText("Modificar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTPDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFPDP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPAp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPAm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NL1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 1663, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel157)
                    .addComponent(FiltrosTPDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFPDP)
                    .addComponent(FilPDPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilPDPAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilPDPAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NL1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TPDP.setViewportView(jPanel20);

        jTabbedPane2.addTab("Pagos de prestamos", TPDP);

        TPCDA.setModel(new javax.swing.table.DefaultTableModel(
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
        TPCDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPCDAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TPCDA);

        jLabel155.setText("Filtro:");

        FilPCDA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Lista", "# Caja" }));
        FilPCDA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilPCDAItemStateChanged(evt);
            }
        });

        labelpcda.setText("jLabel156");

        FilnamePCDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilnamePCDAKeyReleased(evt);
            }
        });

        FilAPPCDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAPPCDAKeyReleased(evt);
            }
        });

        FilAMPCDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAMPCDAKeyReleased(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });

        NL2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NL2KeyReleased(evt);
            }
        });

        NC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NCKeyReleased(evt);
            }
        });

        jLabel41.setText("# Lista:");

        jLabel42.setText("# CDA:");

        jLabel43.setText("# Empleado:");

        jLabel44.setText("Apellido P:");

        jLabel45.setText("# Folio:");

        NFCDA.setEditable(false);
        NFCDA.setText("0");

        jLabel46.setText("Nombre(s):");

        jLabel47.setText("Apellido M:");

        jLabel48.setText("Zona:");

        jLabel49.setText("Servicio:");

        jLabel50.setText("Quincena:");

        jLabel51.setText("Caja de ahorro");

        jLabel52.setText("Observaciones");

        jLabel53.setText("# recibo de pago");

        jLabel54.setText("Qnas aportadas:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel48)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(NFCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel41))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(ZONCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(NLCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NECDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(APCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AMCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NAMECDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(SERVCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QUINCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OBVCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QACDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NRDPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(NFCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(NLCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(NCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(NECDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(APCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(AMCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(NAMECDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(ZONCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(SERVCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(QUINCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(PCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52)
                    .addComponent(OBVCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel54)
                    .addComponent(QACDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(NRDPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel155)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelpcda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilnamePCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAPPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAMPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NL2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addContainerGap(1679, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(FilPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelpcda)
                    .addComponent(FilnamePCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAPPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAMPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(NL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 881, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTabbedPane2.addTab("Pagos caja de ahorro", jPanel1);

        jScrollPane2.setViewportView(jTabbedPane2);

        jTabbedPane1.addTab("Pagos Quincenales", jScrollPane2);

        TPODT1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(TPODT1);

        jLabel154.setText("Filtros:");

        FiltrosPDODT1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Orden", "# Lista" }));
        FiltrosPDODT1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosPDODT1ItemStateChanged(evt);
            }
        });

        LabelfilPODT1.setText("jLabel154");

        FilnamePODT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilnamePODT1KeyReleased(evt);
            }
        });

        FilApPODT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilApPODT1KeyReleased(evt);
            }
        });

        FilAmPODT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAmPODT1KeyReleased(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        NL3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NL3KeyReleased(evt);
            }
        });

        NODT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NODT1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel154)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosPDODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelfilPODT1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilnamePODT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilApPODT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAmPODT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NL3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NODT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 1065, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel154)
                    .addComponent(FiltrosPDODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelfilPODT1)
                    .addComponent(FilnamePODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilApPODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAmPODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(NL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NODT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel21);

        jTabbedPane3.addTab("Pagos orden de taller", jScrollPane4);

        jLabel130.setText("# recibo entregado");

        TPCDA1.setModel(new javax.swing.table.DefaultTableModel(
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
        TPCDA1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TPCDA1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(TPCDA1);

        jLabel151.setText("Observaciones:");

        obdpagocda1.setColumns(20);
        obdpagocda1.setRows(5);
        jScrollPane17.setViewportView(obdpagocda1);

        jLabel156.setText("# Folio");

        NFpagocda1.setEnabled(false);

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel158.setText("Filtro:");

        FilPCDA1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FilPCDA1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilPCDA1ItemStateChanged(evt);
            }
        });

        labelpcda1.setText("jLabel156");

        FilnamePCDA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilnamePCDA1KeyReleased(evt);
            }
        });

        FilAPPCDA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAPPCDA1KeyReleased(evt);
            }
        });

        FilAMPCDA1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAMPCDA1KeyReleased(evt);
            }
        });

        MMAPagos1.setText("Mostrar monto ahorrado");
        MMAPagos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMAPagos1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Monto Ahorrado del empleado:");

        MADE1.setText("0");

        jLabel9.setText("Ajuste de caja:");

        ADCDA1.setText("0");

        jLabel10.setText("# Quincena");

        NQna1.setText("0");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

        NL4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NL4KeyReleased(evt);
            }
        });

        NC1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NC1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel130)
                            .addComponent(jLabel151)
                            .addComponent(jLabel156)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NQna1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ADCDA1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NFpagocda1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(NREcda1, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jButton2)
                    .addComponent(MMAPagos1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MADE1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelpcda1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilnamePCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAPPCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAMPCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NL4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NC1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addContainerGap(743, Short.MAX_VALUE))
                    .addComponent(jScrollPane5)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel156)
                    .addComponent(NFpagocda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel158)
                    .addComponent(FilPCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelpcda1)
                    .addComponent(FilnamePCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAPPCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAMPCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(NL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel130)
                            .addComponent(NREcda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ADCDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(NQna1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel151)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MMAPagos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(MADE1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane3.addTab("Pagos Caja de ahorro", jPanel2);

        FilPDPAm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPAm1KeyReleased(evt);
            }
        });

        FilPDPAp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPAp1KeyReleased(evt);
            }
        });

        FilPDPname1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPname1KeyReleased(evt);
            }
        });

        LabelFPDP1.setText("jLabel158");

        FiltrosTPDP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Prestamo", "# Lista" }));
        FiltrosTPDP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTPDP1ItemStateChanged(evt);
            }
        });

        jLabel159.setText("Filtros:");

        TPPRES1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane14.setViewportView(TPPRES1);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTPDP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFPDP1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPname1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPAp1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPAm1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NP1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NL5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)
                        .addGap(0, 1068, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel159)
                    .addComponent(FiltrosTPDP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFPDP1)
                    .addComponent(FilPDPname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilPDPAp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilPDPAm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(NP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NL5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("Pagos Prestamos", jPanel7);

        jScrollPane3.setViewportView(jTabbedPane3);

        jTabbedPane1.addTab("Pagos Semanales", jScrollPane3);

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

        jMenu6.setText("Pre-nomina");

        jMenuItem17.setText("Semanal");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem17);

        jMenuItem19.setText("Quincenal");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenu2.add(jMenu6);

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

        jMenuItem15.setText("Generar vale de efectivo");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem15);

        jMenuItem16.setText("Reimprimir vale");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem18.setText("Generar padron");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenu1.add(jMenu5);

        Depositos.setText("Depositos");

        jMenu7.setText("Quincenales");

        jMenuItem7.setText("Depositos C/ IMSS");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem9.setText("Depositos S/ IMSS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem24.setText("Santander Depositos C/ IMSS");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem24);

        jMenuItem25.setText("Santander Depositos S/ IMSS");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem25);

        Depositos.add(jMenu7);

        jMenu8.setText("Semanales");

        jMenuItem20.setText("Depositos C/ IMSS");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem20);

        jMenuItem21.setText("Depositos S/ IMSS");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem21);

        jMenuItem26.setText("Santander Depositos C/ IMSS");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem26);

        jMenuItem27.setText("Santander Depositos S/ IMSS");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem27);

        Depositos.add(jMenu8);

        jMenu1.add(Depositos);

        Menuadm.add(jMenu1);

        ZYS.setText("Zonas y Servicios");
        ZYS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZYSActionPerformed(evt);
            }
        });
        Menuadm.add(ZYS);

        ADMV2.setText("Usuarios");
        ADMV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMV2ActionPerformed(evt);
            }
        });
        Menuadm.add(ADMV2);

        jMenuItem10.setText("Pensiones");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        Menuadm.add(jMenuItem10);

        jMenuBar1.add(Menuadm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1397, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
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

    private void ADMV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMV2ActionPerformed
        VentanaADM_3 regr = new VentanaADM_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMV2ActionPerformed

    private void FiltrosPDODTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPDODTItemStateChanged
        String FTP = (String) FiltrosPDODT.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(false);
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("Apellido P")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Apellido P:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(true);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("Apellido M")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Apellido M:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(true);
            MDTPODT();
        }
        if (FTP.equals("Nombre(s)")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Nombre(s):");
            FilnamePODT.setVisible(true);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();

        }
        if (FTP.equals("# Lista")) {
            NL.setVisible(true);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por # Lista:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("# Orden")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(true);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por # Orden:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
    }//GEN-LAST:event_FiltrosPDODTItemStateChanged

    private void FilnamePODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnamePODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilnamePODTKeyReleased

    private void FilApPODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilApPODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilApPODTKeyReleased

    private void FilAmPODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAmPODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilAmPODTKeyReleased

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        Logica_bd_pagosODTQ obj = new Logica_bd_pagosODTQ();
        obj.BDRH();
    }//GEN-LAST:event_jLabel2MousePressed

    private void NLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NLKeyReleased
        MDTPODT();
    }//GEN-LAST:event_NLKeyReleased

    private void NODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_NODTKeyReleased

    private void FiltrosTPDPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTPDPItemStateChanged
        String FTP = (String) FiltrosTPDP.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            NL1.setVisible(false);
            NP.setVisible(false);
            NL1.setText("");
            NP.setText("");
            LabelFPDP.setVisible(false);
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("Apellido P")) {
            NL1.setVisible(false);
            NP.setVisible(false);
            NL1.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Apellido P:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(true);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("Apellido M")) {
            NL1.setVisible(false);
            NP.setVisible(false);
            NL1.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Apellido M:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(true);
            MDTPPres();
        }
        if (FTP.equals("Nombre(s)")) {
            NL1.setVisible(false);
            NP.setVisible(false);
            NL1.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Nombre(s):");
            FilPDPname.setVisible(true);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();

        }
        if (FTP.equals("# Lista")) {
            NL1.setVisible(true);
            NP.setVisible(false);
            NL1.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por # Lista:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("# Prestamo")) {
            NL1.setVisible(false);
            NP.setVisible(true);
            NL1.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por # Prestamo:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
    }//GEN-LAST:event_FiltrosTPDPItemStateChanged

    private void FilPDPnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPnameKeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPnameKeyReleased

    private void FilPDPApKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPApKeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPApKeyReleased

    private void FilPDPAmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPAmKeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPAmKeyReleased

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        Logica_bd_pagosPresQ obj = new Logica_bd_pagosPresQ();
        obj.BDRH();
    }//GEN-LAST:event_jLabel3MousePressed

    private void NPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NPKeyReleased
        MDTPPres();
    }//GEN-LAST:event_NPKeyReleased

    private void NL1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NL1KeyReleased
        MDTPPres();
    }//GEN-LAST:event_NL1KeyReleased

    private void TPCDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPCDAMouseClicked
        int fila = TPCDA.getSelectedRow();
        NFCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 0)));
        NLCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 1)));
        NCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 2)));
        NECDA.setText(String.valueOf(TPCDA.getValueAt(fila, 3)));
        APCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 4)));
        AMCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 5)));
        NAMECDA.setText(String.valueOf(TPCDA.getValueAt(fila, 6)));
        ZONCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 7)));
        SERVCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 8)));
        QUINCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 9)));
        PCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 10)));
        OBVCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 11)));
        QACDA.setText(String.valueOf(TPCDA.getValueAt(fila, 12)));
        NRDPCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 13)));
    }//GEN-LAST:event_TPCDAMouseClicked

    private void FilPCDAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilPCDAItemStateChanged
        String FTP = (String) FilPCDA.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            NL2.setVisible(false);
            NL2.setText("");
            NC.setText("");
            NC.setVisible(false);
            labelpcda.setVisible(false);
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();
        }
        if (FTP.equals("Apellido P")) {
            NL2.setVisible(false);
            NC.setVisible(false);
            NL2.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por Apellido P:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(true);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();
        }
        if (FTP.equals("Apellido M")) {
            NL2.setVisible(false);
            NC.setVisible(false);
            NL2.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por Apellido M:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(true);
            MDTPCDA();
        }
        if (FTP.equals("Nombre(s)")) {
            NL2.setVisible(false);
            NC.setVisible(false);
            NL2.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por Nombre(s):");
            FilnamePCDA.setVisible(true);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();

        }
        if (FTP.equals("# Lista")) {
            NL2.setVisible(true);
            NC.setVisible(false);
            NL2.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por # Lista:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();

        }
        if (FTP.equals("# Caja")) {
            NL2.setVisible(false);
            NC.setVisible(true);
            NL2.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por # Caja:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();

        }
    }//GEN-LAST:event_FilPCDAItemStateChanged

    private void FilnamePCDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnamePCDAKeyReleased
        MDTPCDA();

    }//GEN-LAST:event_FilnamePCDAKeyReleased

    private void FilAPPCDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAPPCDAKeyReleased
        MDTPCDA();

    }//GEN-LAST:event_FilAPPCDAKeyReleased

    private void FilAMPCDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAMPCDAKeyReleased
        MDTPCDA();

    }//GEN-LAST:event_FilAMPCDAKeyReleased

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        Logica_bd_pagosCDAQ obj = new Logica_bd_pagosCDAQ();
        obj.BDRH();
    }//GEN-LAST:event_jLabel6MousePressed

    private void NL2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NL2KeyReleased
        MDTPCDA();

    }//GEN-LAST:event_NL2KeyReleased

    private void NCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NCKeyReleased
        MDTPCDA();

    }//GEN-LAST:event_NCKeyReleased

    private void FiltrosPDODT1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPDODT1ItemStateChanged
        String FTP = (String) FiltrosPDODT1.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            NL.setVisible(false);
            NL.setText("");
            NODT1.setVisible(false);
            NODT1.setText("");
            LabelfilPODT1.setVisible(false);
            FilnamePODT1.setVisible(false);
            FilnamePODT1.setText("");
            FilApPODT1.setText("");
            FilApPODT1.setVisible(false);
            FilAmPODT1.setText("");
            FilAmPODT1.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("Apellido P")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Apellido P:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(true);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("Apellido M")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Apellido M:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(true);
            MDTPODT();
        }
        if (FTP.equals("Nombre(s)")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Nombre(s):");
            FilnamePODT.setVisible(true);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();

        }
        if (FTP.equals("# Lista")) {
            NL.setVisible(true);
            NL.setText("");
            NODT.setVisible(false);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por # Lista:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("# Orden")) {
            NL.setVisible(false);
            NL.setText("");
            NODT.setVisible(true);
            NODT.setText("");
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por # Orden:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
    }//GEN-LAST:event_FiltrosPDODT1ItemStateChanged

    private void FilnamePODT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnamePODT1KeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilnamePODT1KeyReleased

    private void FilApPODT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilApPODT1KeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilApPODT1KeyReleased

    private void FilAmPODT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAmPODT1KeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilAmPODT1KeyReleased

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        Logica_bd_pagosODTQ obj = new Logica_bd_pagosODTQ();
        obj.BDRH();
    }//GEN-LAST:event_jLabel7MousePressed

    private void NL3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NL3KeyReleased
        MDTPODT();
    }//GEN-LAST:event_NL3KeyReleased

    private void NODT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NODT1KeyReleased
        MDTPODT();
    }//GEN-LAST:event_NODT1KeyReleased

    private void TPCDA1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPCDA1MouseClicked
        int fila = TPCDA.getSelectedRow();
        /*        NFpagocda.setText(String.valueOf(TPCDA.getValueAt(fila, 0)));
        NQna.setText(String.valueOf(TPCDA.getValueAt(fila, 12)));
        ADCDA.setText(String.valueOf(TPCDA.getValueAt(fila, 10)));
        obdpagocda.setText(String.valueOf(TPCDA.getValueAt(fila, 11)));
        NREcda.setText(String.valueOf(TPCDA.getValueAt(fila, 13)));*/
    }//GEN-LAST:event_TPCDA1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // MODPAGOCDA();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void FilPCDA1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilPCDA1ItemStateChanged
        String FTP = (String) FilPCDA.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            NL.setVisible(false);
            NL.setText("");
            NC.setText("");
            NC.setVisible(false);
            labelpcda.setVisible(false);
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();
        }
        if (FTP.equals("Apellido P")) {
            NL.setVisible(false);
            NC.setVisible(false);
            NL.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por Apellido P:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(true);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();
        }
        if (FTP.equals("Apellido M")) {
            NL.setVisible(false);
            NC.setVisible(false);
            NL.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por Apellido M:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(true);
            MDTPCDA();
        }
        if (FTP.equals("Nombre(s)")) {
            NL.setVisible(false);
            NC.setVisible(false);
            NL.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por Nombre(s):");
            FilnamePCDA.setVisible(true);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();

        }
        if (FTP.equals("# Lista")) {
            NL.setVisible(true);
            NC.setVisible(false);
            NL.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por # Lista:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();

        }
        if (FTP.equals("# Caja")) {
            NL.setVisible(false);
            NC.setVisible(true);
            NL.setText("");
            NC.setText("");
            labelpcda.setVisible(true);
            labelpcda.setText("Buscar por # Caja:");
            FilnamePCDA.setVisible(false);
            FilnamePCDA.setText("");
            FilAPPCDA.setText("");
            FilAPPCDA.setVisible(false);
            FilAMPCDA.setText("");
            FilAMPCDA.setVisible(false);
            MDTPCDA();

        }
    }//GEN-LAST:event_FilPCDA1ItemStateChanged

    private void FilnamePCDA1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnamePCDA1KeyReleased
        MDTPCDA();

    }//GEN-LAST:event_FilnamePCDA1KeyReleased

    private void FilAPPCDA1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAPPCDA1KeyReleased
        MDTPCDA();

    }//GEN-LAST:event_FilAPPCDA1KeyReleased

    private void FilAMPCDA1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAMPCDA1KeyReleased
        MDTPCDA();

    }//GEN-LAST:event_FilAMPCDA1KeyReleased

    private void MMAPagos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMAPagos1ActionPerformed

    }//GEN-LAST:event_MMAPagos1ActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        Logica_bd_pagosCDAS obj = new Logica_bd_pagosCDAS();
        obj.BDRH();
    }//GEN-LAST:event_jLabel11MousePressed

    private void NL4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NL4KeyReleased
        MDTPCDA();

    }//GEN-LAST:event_NL4KeyReleased

    private void NC1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NC1KeyReleased
        MDTPCDA();

    }//GEN-LAST:event_NC1KeyReleased

    private void FilPDPAm1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPAm1KeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPAm1KeyReleased

    private void FilPDPAp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPAp1KeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPAp1KeyReleased

    private void FilPDPname1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPname1KeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPname1KeyReleased

    private void FiltrosTPDP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTPDP1ItemStateChanged
        String FTP = (String) FiltrosTPDP.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            NL.setVisible(false);
            NP.setVisible(false);
            NL.setText("");
            NP.setText("");
            LabelFPDP.setVisible(false);
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("Apellido P")) {
            NL.setVisible(false);
            NP.setVisible(false);
            NL.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Apellido P:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(true);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("Apellido M")) {
            NL.setVisible(false);
            NP.setVisible(false);
            NL.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Apellido M:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(true);
            MDTPPres();
        }
        if (FTP.equals("Nombre(s)")) {
            NL.setVisible(false);
            NP.setVisible(false);
            NL.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Nombre(s):");
            FilPDPname.setVisible(true);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();

        }
        if (FTP.equals("# Lista")) {
            NL.setVisible(true);
            NP.setVisible(false);
            NL.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por # Lista:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("# Prestamo")) {
            NL.setVisible(false);
            NP.setVisible(true);
            NL.setText("");
            NP.setText("");
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por # Prestamo:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
    }//GEN-LAST:event_FiltrosTPDP1ItemStateChanged

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        Logica_bd_pagosPresS obj = new Logica_bd_pagosPresS();
        obj.BDRH();
    }//GEN-LAST:event_jLabel12MousePressed

    private void TPODTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPODTMousePressed
        int fila = TPODT.getSelectedRow();
        NFODT.setText(String.valueOf(TPODT.getValueAt(fila, 0)));
        NLODT.setText(String.valueOf(TPODT.getValueAt(fila, 1)));
        NODTM.setText(String.valueOf(TPODT.getValueAt(fila, 2)));
        NEODT.setText(String.valueOf(TPODT.getValueAt(fila, 3)));
        APODT.setText(String.valueOf(TPODT.getValueAt(fila, 4)));
        AMODT.setText(String.valueOf(TPODT.getValueAt(fila, 5)));
        NAMEODT.setText(String.valueOf(TPODT.getValueAt(fila, 6)));
        ZONODT.setText(String.valueOf(TPODT.getValueAt(fila, 7)));
        SERVODT.setText(String.valueOf(TPODT.getValueAt(fila, 8)));
        QUINODT.setText(String.valueOf(TPODT.getValueAt(fila, 9)));
        PENODT.setText(String.valueOf(TPODT.getValueAt(fila, 12)));
        NQUINODT.setText(String.valueOf(TPODT.getValueAt(fila, 10)));
        PAGODT.setText(String.valueOf(TPODT.getValueAt(fila, 11)));
        PODT.setText(String.valueOf(TPODT.getValueAt(fila, 13)));
    }//GEN-LAST:event_TPODTMousePressed

    private void TPPRESMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPPRESMousePressed
        int fila = TPPRES.getSelectedRow();
        NFPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 0)));
        NLPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 1)));
        NPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 2)));
        NEPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 3)));
        APPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 4)));
        AMPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 5)));
        NAMEPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 6)));
        ZONPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 7)));
        SERVPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 8)));
        QUINPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 9)));
        PENPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 12)));
        NQUINPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 10)));
        PAGPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 11)));
        PPRES.setText(String.valueOf(TPPRES.getValueAt(fila, 13)));
    }//GEN-LAST:event_TPPRESMousePressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String SQL = "UPDATE `nomina.pagos.odt` SET `#Folio` = ?, `#Lista` = ?,"
                + " `# de orden` = ?, `#empleado` = ?, `Apellido P` = ?, `Apellido M` = ?,"
                + " `Nombre(s)` = ?, `Zona` = ?, `Servicio` = ?, `Quincena` = ?,"
                + " `# quincena` = ?, `pagado` = ?, `pendiente` = ?, `Pago de odt` = ? WHERE `nomina.pagos.odt`.`#Folio` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFODT.getText()));
            pst.setInt(2, Integer.parseInt(NLODT.getText()));
            pst.setInt(3, Integer.parseInt(NODT.getText()));
            pst.setInt(4, Integer.parseInt(NEODT.getText()));
            pst.setString(5, APODT.getText());
            pst.setString(6, AMODT.getText());
            pst.setString(7, NAMEODT.getText());
            pst.setString(8, ZONODT.getText());
            pst.setString(9, SERVODT.getText());
            pst.setString(10, QUINODT.getText());
            pst.setString(11, NQUINODT.getText());
            pst.setString(12, PAGODT.getText());
            pst.setString(13, PENODT.getText());
            pst.setString(14, PODT.getText());
            pst.setInt(15, Integer.parseInt(NFODT.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro modificado");

            //limpiar campos
            NFODT.setText("0");
            NLODT.setText("0");
            NODT.setText("0");
            NEODT.setText("0");
            APODT.setText("");
            AMODT.setText("");
            NAMEODT.setText("");
            ZONODT.setText("");
            SERVODT.setText("");
            QUINODT.setText("");
            NQUINODT.setText("");
            PAGODT.setText("");
            PENODT.setText("");
            PODT.setText("");
        } catch (HeadlessException | SQLException Ex_Taller) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + Ex_Taller.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String SQL = "UPDATE `nomina.pagos.prestamos` SET `#Folio` = ?, `#Lista` = ?,"
                + " `#prestamo` = ?, `#empleado` = ?, `Apellido P` = ?, `Apellido M` = "
                + " `Nombre(s)` = ?, `Zona` = ?, `Servicio` = ?, `Quincena` = ?, "
                + "`# quincena` = ?, `pagado` = ?, `pendiente` = ?, `Pago de prestamo` = ? "
                + "WHERE `nomina.pagos.prestamos`.`#Folio` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFPRES.getText()));
            pst.setInt(2, Integer.parseInt(NLPRES.getText()));
            pst.setInt(3, Integer.parseInt(NPRES.getText()));
            pst.setInt(4, Integer.parseInt(NEPRES.getText()));
            pst.setString(5, APPRES.getText());
            pst.setString(6, AMPRES.getText());
            pst.setString(7, NAMEPRES.getText());
            pst.setString(8, ZONPRES.getText());
            pst.setString(9, SERVPRES.getText());
            pst.setString(10, QUINPRES.getText());
            pst.setString(11, NQUINPRES.getText());
            pst.setString(12, PAGPRES.getText());
            pst.setString(13, PENPRES.getText());
            pst.setString(14, PPRES.getText());
            pst.setInt(15, Integer.parseInt(NFPRES.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro modificado");

            //limpiar campos
            NFPRES.setText("0");
            NLPRES.setText("0");
            NPRES.setText("0");
            NEPRES.setText("0");
            APPRES.setText("");
            AMPRES.setText("");
            NAMEPRES.setText("");
            ZONPRES.setText("");
            SERVPRES.setText("");
            QUINPRES.setText("");
            NQUINPRES.setText("");
            PAGPRES.setText("");
            PENPRES.setText("");
            PPRES.setText("");

        } catch (HeadlessException | SQLException Ex_Taller) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + Ex_Taller.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String SQL = "UPDATE `nomina.pagos.cda` SET `#Folio` = ?,"
                + " `#Lista` = ?, `#caja` = ?, `#empleado` = ?, `Apellido P` = ?,"
                + " `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?, `Servicio` = ?,"
                + " `Quincena` = ?, `Caja de ahorro` = ?, `Observaciones` = ?, "
                + "`Qnas aportadas` = ?, `# de recibo de pago` = ? WHERE `nomina.pagos.cda`.`#Folio` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFCDA.getText()));
            pst.setInt(2, Integer.parseInt(NLCDA.getText()));
            pst.setInt(3, Integer.parseInt(NCDA.getText()));
            pst.setInt(4, Integer.parseInt(NECDA.getText()));
            pst.setString(5, APCDA.getText());
            pst.setString(6, AMCDA.getText());
            pst.setString(7, NAMECDA.getText());
            pst.setString(8, ZONCDA.getText());
            pst.setString(9, SERVCDA.getText());
            pst.setString(10, QUINCDA.getText());
            pst.setString(11, PCDA.getText());
            pst.setString(12, OBVCDA.getText());
            pst.setString(13, QACDA.getText());
            pst.setString(14, NRDPCDA.getText());
            pst.setInt(15, Integer.parseInt(NFCDA.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "registro modificado");

            //limpiar campos
            NFCDA.setText("0");
            NLCDA.setText("0");
            NCDA.setText("0");
            NECDA.setText("0");
            APCDA.setText("");
            AMCDA.setText("");
            NAMECDA.setText("");
            ZONCDA.setText("");
            SERVCDA.setText("");
            QUINCDA.setText("");
            PCDA.setText("");
            OBVCDA.setText("");
            QACDA.setText("");
            NRDPCDA.setText("");
        } catch (HeadlessException | SQLException Ex_Taller) {
            JOptionPane.showMessageDialog(null, "Error al agregar orden de taller: " + Ex_Taller.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        PensionesVP_7 regr = new PensionesVP_7(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        VDE regr = new VDE(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        Rvales regr = new Rvales(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        Padrones regr = new Padrones(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        PrenominaS regr = new PrenominaS();
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        PremonimaQ regr = new PremonimaQ();
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        DepositosQ_4 regr = new DepositosQ_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DepositosQ_SIMSS_4 regr = new DepositosQ_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        DepositosQSan_4 regr = new DepositosQSan_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        DepositosQsan_SIMSS_4 regr = new DepositosQsan_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        DepositosS_4 regr = new DepositosS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        DepositosS_SIMSS_4 regr = new DepositosS_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        DepositosSSan_4 regr = new DepositosSSan_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        DepositosSSan_SIMSS_4 regr = new DepositosSSan_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem27ActionPerformed

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
            java.util.logging.Logger.getLogger(EdicionPagos_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EdicionPagos_3().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADCDA1;
    private javax.swing.JMenuItem ADMV2;
    private javax.swing.JTextField AMCDA;
    private javax.swing.JTextField AMODT;
    private javax.swing.JTextField AMPRES;
    private javax.swing.JTextField APCDA;
    private javax.swing.JTextField APODT;
    private javax.swing.JTextField APPRES;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA4;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JMenu Depositos;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JTextField FilAMPCDA;
    private javax.swing.JTextField FilAMPCDA1;
    private javax.swing.JTextField FilAPPCDA;
    private javax.swing.JTextField FilAPPCDA1;
    private javax.swing.JTextField FilAmPODT;
    private javax.swing.JTextField FilAmPODT1;
    private javax.swing.JTextField FilApPODT;
    private javax.swing.JTextField FilApPODT1;
    private javax.swing.JComboBox<String> FilPCDA;
    private javax.swing.JComboBox<String> FilPCDA1;
    private javax.swing.JTextField FilPDPAm;
    private javax.swing.JTextField FilPDPAm1;
    private javax.swing.JTextField FilPDPAp;
    private javax.swing.JTextField FilPDPAp1;
    private javax.swing.JTextField FilPDPname;
    private javax.swing.JTextField FilPDPname1;
    private javax.swing.JTextField FilnamePCDA;
    private javax.swing.JTextField FilnamePCDA1;
    private javax.swing.JTextField FilnamePODT;
    private javax.swing.JTextField FilnamePODT1;
    private javax.swing.JComboBox<String> FiltrosPDODT;
    private javax.swing.JComboBox<String> FiltrosPDODT1;
    private javax.swing.JComboBox<String> FiltrosTPDP;
    private javax.swing.JComboBox<String> FiltrosTPDP1;
    private javax.swing.JMenuItem General;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JMenuItem LDA3;
    private javax.swing.JLabel LabelFPDP;
    private javax.swing.JLabel LabelFPDP1;
    private javax.swing.JLabel LabelfilPODT;
    private javax.swing.JLabel LabelfilPODT1;
    private javax.swing.JLabel MADE1;
    private javax.swing.JCheckBox MMAPagos1;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JTextField NAMECDA;
    private javax.swing.JTextField NAMEODT;
    private javax.swing.JTextField NAMEPRES;
    private javax.swing.JTextField NC;
    private javax.swing.JTextField NC1;
    private javax.swing.JTextField NCDA;
    private javax.swing.JTextField NECDA;
    private javax.swing.JTextField NEODT;
    private javax.swing.JTextField NEPRES;
    private javax.swing.JTextField NFCDA;
    private javax.swing.JTextField NFODT;
    private javax.swing.JTextField NFPRES;
    private javax.swing.JTextField NFpagocda1;
    private javax.swing.JTextField NL;
    private javax.swing.JTextField NL1;
    private javax.swing.JTextField NL2;
    private javax.swing.JTextField NL3;
    private javax.swing.JTextField NL4;
    private javax.swing.JTextField NL5;
    private javax.swing.JTextField NLCDA;
    private javax.swing.JTextField NLODT;
    private javax.swing.JTextField NLPRES;
    private javax.swing.JTextField NODT;
    private javax.swing.JTextField NODT1;
    private javax.swing.JTextField NODTM;
    private javax.swing.JTextField NP;
    private javax.swing.JTextField NP1;
    private javax.swing.JTextField NPRES;
    private javax.swing.JTextField NQUINODT;
    private javax.swing.JTextField NQUINPRES;
    private javax.swing.JTextField NQna1;
    private javax.swing.JTextField NRDPCDA;
    private javax.swing.JTextField NREcda1;
    private javax.swing.JTextField OBVCDA;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JTextField PAGODT;
    private javax.swing.JTextField PAGPRES;
    private javax.swing.JTextField PCDA;
    private javax.swing.JTextField PENODT;
    private javax.swing.JTextField PENPRES;
    private javax.swing.JTextField PODT;
    private javax.swing.JTextField PPRES;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JTextField QACDA;
    private javax.swing.JTextField QUINCDA;
    private javax.swing.JTextField QUINODT;
    private javax.swing.JTextField QUINPRES;
    private javax.swing.JTextField SERVCDA;
    private javax.swing.JTextField SERVODT;
    private javax.swing.JTextField SERVPRES;
    private javax.swing.JTable TPCDA;
    private javax.swing.JTable TPCDA1;
    private javax.swing.JScrollPane TPDP;
    private javax.swing.JTable TPODT;
    private javax.swing.JTable TPODT1;
    private javax.swing.JTable TPPRES;
    private javax.swing.JTable TPPRES1;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JTextField ZONCDA;
    private javax.swing.JTextField ZONODT;
    private javax.swing.JTextField ZONPRES;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
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
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JLabel labelpcda;
    private javax.swing.JLabel labelpcda1;
    private javax.swing.JTextArea obdpagocda1;
    // End of variables declaration//GEN-END:variables
}
