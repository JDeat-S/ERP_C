package Pensiones;

import Admin.*;
import Conexion.ConexionSQL;
import Logicas.Logica_permisos;
import Logicas.Logica_usuarios;
import Nomina.ModulosQ.*;
import Nomina.ModulosS.*;
import Nomina.*;
import Nomina.Listas.*;
import Pensiones.Logicas.*;
import RH.*;
import RH.Depositos.*;
import Semanal.*;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class PensionesVP_7 extends javax.swing.JFrame {

    /**
     * Creates new form PensionesVP_7
     */
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Logica_usuarios usr;
    Logica_permisos LP;
    ButtonGroup CVeh;
    ButtonGroup TDserv;

    public PensionesVP_7() {
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
        this.setExtendedState(6);
        setIconImage(new ImageIcon(PensionesVP_7.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        LabelFiliturbide.setVisible(false);
        Apiturbide.setVisible(false);
        Amiturbide.setVisible(false);
        nameiturbide.setVisible(false);
        NPiturbide.setVisible(false);
        LabelFilTehuantepec.setVisible(false);
        ApTehuantepec.setVisible(false);
        AmTehuantepec.setVisible(false);
        nameTehuantepec.setVisible(false);
        NPTehuantepec.setVisible(false);
        LabelFilptetitla.setVisible(false);
        Apptetitla.setVisible(false);
        Amptetitla.setVisible(false);
        nameptetitla.setVisible(false);
        NPptetitla.setVisible(false);
        MDPEN();
    }

    public PensionesVP_7(Logica_usuarios usr, Logica_permisos LP) {
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
        this.setExtendedState(6);
        setIconImage(new ImageIcon(PensionesVP_7.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        this.usr = usr;
        this.LP = LP;
        MDPEN();
        LabelFiliturbide.setVisible(false);
        Apiturbide.setVisible(false);
        Amiturbide.setVisible(false);
        nameiturbide.setVisible(false);
        NPiturbide.setVisible(false);
        LabelFilTehuantepec.setVisible(false);
        ApTehuantepec.setVisible(false);
        AmTehuantepec.setVisible(false);
        nameTehuantepec.setVisible(false);
        NPTehuantepec.setVisible(false);
        LabelFilptetitla.setVisible(false);
        Apptetitla.setVisible(false);
        Amptetitla.setVisible(false);
        nameptetitla.setVisible(false);
        NPptetitla.setVisible(false);
        setTitle("Pensiones # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
                + " Tipo de ususario: " + usr.getNombre_tipo() + " Usuario: " + usr.getUsuario());
        switch (LP.getVDA()) {
            case 0 -> {
            }
            case 1 -> {
                Menuadm.setVisible(false);

            }
            case 2 -> {
                Menuadm.setVisible(false);
                if (LP.getP1() == 0) {
                    AddPen.setVisible(false);
                }
                if (LP.getP2() == 0) {
                    ModPen.setVisible(false);

                }
                if (LP.getP3() == 0) {
                    Titurbide.setVisible(false);
                }
                if (LP.getP4() == 0) {
                }
                if (LP.getP5() == 0) {
                }
                if (LP.getP6() == 0) {
                }
                if (LP.getP7() == 0) {
                }
                if (LP.getP8() == 0) {
                }
                if (LP.getP9() == 0) {
                }
                if (LP.getP10() == 0) {
                }
            }
            default -> {
            }
        }
    }

    public void operaciones() {
        double recargo, IVAop, recargo1, IVAop1, recargo2, IVAop2;
        if (Rec.isSelected() == true) {
            recargo = 280;
            RecImporte.setText("" + recargo);
        } else {
            recargo = 0;
            RecImporte.setText("" + recargo);

        }
        if (this.IVA.isSelected() == true) {
            IVAop = 0.16;
            IVAImporte.setText("" + (Double.parseDouble(Importe.getText()) * IVAop));
        } else {
            IVAop = 0;
            IVAImporte.setText("" + (Double.parseDouble(Importe.getText()) * IVAop));

        }
        if (Rec1.isSelected() == true) {
            recargo1 = 280;
            RecImporte1.setText("" + recargo1);
        } else {
            recargo1 = 0;
            RecImporte1.setText("" + recargo1);

        }
        if (this.IVA1.isSelected() == true) {
            IVAop1 = 0.16;
            IVAImporte1.setText("" + (Double.parseDouble(Importe1.getText()) * IVAop1));
        } else {
            IVAop1 = 0;
            IVAImporte1.setText("" + (Double.parseDouble(Importe1.getText()) * IVAop1));

        }
        if (Rec2.isSelected() == true) {
            recargo2 = 280;
            RecImporte2.setText("" + recargo2);
        } else {
            recargo2 = 0;
            RecImporte2.setText("" + recargo2);

        }
        if (this.IVA2.isSelected() == true) {
            IVAop2 = 0.16;
            IVAImporte2.setText("" + (Double.parseDouble(Importe2.getText()) * IVAop2));
        } else {
            IVAop2 = 0;
            IVAImporte2.setText("" + (Double.parseDouble(Importe2.getText()) * IVAop2));

        }
        double total = ((Double.parseDouble(Importe.getText()) * IVAop) + Double.parseDouble(Importe.getText()) + recargo)
                + ((Double.parseDouble(Importe1.getText()) * IVAop1) + Double.parseDouble(Importe1.getText()) + recargo1)
                + ((Double.parseDouble(Importe2.getText()) * IVAop2) + Double.parseDouble(Importe2.getText()) + recargo2);
        TAP.setText("" + total);
    }

    public void MDPEN() {
        String FiltroN = nameiturbide.getText();
        String FAP = Apiturbide.getText();
        String FAM = Amiturbide.getText();
        String where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.iturbide`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.iturbide`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.iturbide`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.iturbide`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(NPiturbide.getText())) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.iturbide`"
                    + " Where `#padron` LIKE '%" + NPiturbide.getText() + "%'";
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
            Titurbide.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Registro");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Status");
            modelo.addColumn("Mes");
            modelo.addColumn("Razon social");
            modelo.addColumn("# Padron");

//ANCHOS
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50,50,50,50};


            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Titurbide.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mpdodt) {
            JOptionPane.showMessageDialog(null, "Error al motrar datos iturbide: " + error_mpdodt.getMessage());

        }
        FiltroN = nameTehuantepec.getText();
        FAP = ApTehuantepec.getText();
        FAM = AmTehuantepec.getText();
        where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.tehuantepec`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.tehuantepec`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.tehuantepec`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.tehuantepec`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(NPTehuantepec.getText())) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.tehuantepec`"
                    + " Where `#padron` LIKE '%" + NPTehuantepec.getText() + "%'";
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
            TTehuantepec.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Registro");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Status");
            modelo.addColumn("Mes");
            modelo.addColumn("Razon social");
            modelo.addColumn("# Padron");

//ANCHOS
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50,50,50,50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TTehuantepec.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mpdodt) {
            JOptionPane.showMessageDialog(null, "Error al motrar dato: " + error_mpdodt.getMessage());

        }
        FiltroN = nameptetitla.getText();
        FAP = Apptetitla.getText();
        FAM = Amptetitla.getText();
        where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.puente titla`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.ptetitla`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.puente titla`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.puente titla`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(NPptetitla.getText())) {
            where = "SELECT `#registro`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Status`, `#Padron` FROM `pensiones.puente titla`"
                    + " Where `#padron` LIKE '%" + NPptetitla.getText() + "%'";
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
            Tptetitla.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Registro");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Status");
            modelo.addColumn("Mes");
            modelo.addColumn("Razon social");
            modelo.addColumn("# Padron");

//ANCHOS
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50,50,50,50};


            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tptetitla.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Am = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Direccion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NR = new javax.swing.JTextField();
        TC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TO = new javax.swing.JTextField();
        CEL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MAIL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ObsPen = new javax.swing.JTextArea();
        Placas = new javax.swing.JTextField();
        Marca = new javax.swing.JTextField();
        Modelo = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RS = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        NP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Importe = new javax.swing.JTextField();
        Rec = new javax.swing.JCheckBox();
        IVA = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        TAP = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        TP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        FechaDP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Metodo = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        NS = new javax.swing.JTextField();
        RecImporte = new javax.swing.JTextField();
        IVAImporte = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Est = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Titurbide = new javax.swing.JTable();
        jLabel31 = new javax.swing.JLabel();
        Filiturbide = new javax.swing.JComboBox<>();
        LabelFiliturbide = new javax.swing.JLabel();
        Apiturbide = new javax.swing.JTextField();
        Amiturbide = new javax.swing.JTextField();
        nameiturbide = new javax.swing.JTextField();
        NPiturbide = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TTehuantepec = new javax.swing.JTable();
        jLabel32 = new javax.swing.JLabel();
        FilTehuantepec = new javax.swing.JComboBox<>();
        LabelFilTehuantepec = new javax.swing.JLabel();
        ApTehuantepec = new javax.swing.JTextField();
        AmTehuantepec = new javax.swing.JTextField();
        nameTehuantepec = new javax.swing.JTextField();
        NPTehuantepec = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        Tptetitla = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        Filptetitla = new javax.swing.JComboBox<>();
        LabelFilptetitla = new javax.swing.JLabel();
        Apptetitla = new javax.swing.JTextField();
        Amptetitla = new javax.swing.JTextField();
        nameptetitla = new javax.swing.JTextField();
        NPptetitla = new javax.swing.JTextField();
        AddPen = new javax.swing.JButton();
        Status = new javax.swing.JComboBox<>();
        ModPen = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        Mescbx = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        INIDIPEN = new javax.swing.JTextField();
        INIMESPEN = new javax.swing.JComboBox<>();
        FINDIPEN = new javax.swing.JTextField();
        FINMESPEN = new javax.swing.JComboBox<>();
        Modelo1 = new javax.swing.JTextField();
        Marca1 = new javax.swing.JTextField();
        Placas1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Color1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Placas2 = new javax.swing.JTextField();
        Marca2 = new javax.swing.JTextField();
        Modelo2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Color2 = new javax.swing.JTextField();
        año1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        año2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        Importe1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Importe2 = new javax.swing.JTextField();
        IVA1 = new javax.swing.JCheckBox();
        Rec1 = new javax.swing.JCheckBox();
        IVAImporte1 = new javax.swing.JTextField();
        RecImporte1 = new javax.swing.JTextField();
        RecImporte2 = new javax.swing.JTextField();
        Rec2 = new javax.swing.JCheckBox();
        IVA2 = new javax.swing.JCheckBox();
        IVAImporte2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        tds12 = new javax.swing.JRadioButton();
        cv3 = new javax.swing.JRadioButton();
        cv2 = new javax.swing.JRadioButton();
        cv1 = new javax.swing.JRadioButton();
        cv5 = new javax.swing.JRadioButton();
        tds24 = new javax.swing.JRadioButton();
        cv4 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CNQ = new javax.swing.JMenuItem();
        PRESQ = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        CDA1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        CDA4 = new javax.swing.JMenuItem();
        ODT2 = new javax.swing.JMenuItem();
        LDA = new javax.swing.JMenuItem();
        LDA3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        General1 = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        Depositos1 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        ADMV1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Apellido P:");

        jLabel2.setText("Apellido M:");

        jLabel3.setText("Nombre(s):");

        jLabel4.setText("Direccion:");

        Direccion.setColumns(20);
        Direccion.setRows(5);
        jScrollPane3.setViewportView(Direccion);

        jLabel5.setText("Tel. Casa:");

        jLabel6.setText("# Registro:");

        NR.setEditable(false);
        NR.setText("0");

        jLabel7.setText("Tel Oficina:");

        jLabel8.setText("Celular:");

        jLabel9.setText("Mail:");

        jLabel10.setText("Placas:");

        jLabel11.setText("Marca:");

        jLabel12.setText("Modelo:");

        jLabel13.setText("Año:");

        jLabel14.setText("Color:");

        jLabel17.setText("Observaciones:");

        ObsPen.setColumns(20);
        ObsPen.setRows(5);
        jScrollPane4.setViewportView(ObsPen);

        jLabel18.setText("Status:");

        jLabel20.setText("Razon Social:");

        jLabel21.setText("# Padron:");

        NP.setText("0");

        jLabel22.setText("Inicio de pension:");

        jLabel23.setText("Fin de pension:");

        jLabel24.setText("Importe:");

        Importe.setText("0");
        Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImporteKeyReleased(evt);
            }
        });

        Rec.setText("Recargo");
        Rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecActionPerformed(evt);
            }
        });

        IVA.setText("IVA");
        IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAActionPerformed(evt);
            }
        });

        jLabel25.setText("Total a pagar:");

        TAP.setText("0");

        jLabel26.setText("Total Pagado:");

        TP.setText("0");

        jLabel28.setText("Fecha de pago:");

        jLabel29.setText("Metodo:");

        jLabel30.setText("CTE:");

        RecImporte.setEditable(false);
        RecImporte.setText("0");

        IVAImporte.setEditable(false);
        IVAImporte.setText("0");
        IVAImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAImporteActionPerformed(evt);
            }
        });

        jLabel27.setText("Estacionamiento:");

        Est.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "iturbide", "puente titla", "tehuantepec" }));

        Titurbide.setModel(new javax.swing.table.DefaultTableModel(
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
        Titurbide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TiturbideMousePressed(evt);
            }
        });
        jScrollPane7.setViewportView(Titurbide);

        jLabel31.setText("Filtro");

        Filiturbide.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Padron" }));
        Filiturbide.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiliturbideItemStateChanged(evt);
            }
        });

        LabelFiliturbide.setText("jLabel32");

        Apiturbide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ApiturbideKeyReleased(evt);
            }
        });

        Amiturbide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmiturbideKeyReleased(evt);
            }
        });

        nameiturbide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameiturbideKeyReleased(evt);
            }
        });

        NPiturbide.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NPiturbideKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 2448, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFiliturbide)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Amiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(Filiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFiliturbide)
                    .addComponent(Apiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPiturbide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jScrollPane6.setViewportView(jPanel2);

        jTabbedPane2.addTab("Iturbide", jScrollPane6);

        TTehuantepec.setModel(new javax.swing.table.DefaultTableModel(
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
        TTehuantepec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TTehuantepecMousePressed(evt);
            }
        });
        jScrollPane9.setViewportView(TTehuantepec);

        jLabel32.setText("Filtro");

        FilTehuantepec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Padron" }));
        FilTehuantepec.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilTehuantepecItemStateChanged(evt);
            }
        });

        LabelFilTehuantepec.setText("jLabel32");

        ApTehuantepec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ApTehuantepecKeyReleased(evt);
            }
        });

        AmTehuantepec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmTehuantepecKeyReleased(evt);
            }
        });

        nameTehuantepec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameTehuantepecKeyReleased(evt);
            }
        });

        NPTehuantepec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NPTehuantepecKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 2448, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFilTehuantepec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AmTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(FilTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFilTehuantepec)
                    .addComponent(ApTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AmTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPTehuantepec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jScrollPane8.setViewportView(jPanel3);

        jTabbedPane2.addTab("Tehuantepec", jScrollPane8);

        Tptetitla.setModel(new javax.swing.table.DefaultTableModel(
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
        Tptetitla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TptetitlaMousePressed(evt);
            }
        });
        jScrollPane11.setViewportView(Tptetitla);

        jLabel33.setText("Filtro");

        Filptetitla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)", "# Padron" }));
        Filptetitla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilptetitlaItemStateChanged(evt);
            }
        });

        LabelFilptetitla.setText("jLabel32");

        Apptetitla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ApptetitlaKeyReleased(evt);
            }
        });

        Amptetitla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AmptetitlaKeyReleased(evt);
            }
        });

        nameptetitla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameptetitlaKeyReleased(evt);
            }
        });

        NPptetitla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NPptetitlaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 2448, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFilptetitla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Amptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(Filptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFilptetitla)
                    .addComponent(Apptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NPptetitla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jScrollPane10.setViewportView(jPanel4);

        jTabbedPane2.addTab("Puente titla", jScrollPane10);

        AddPen.setText("Agregar");
        AddPen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPenActionPerformed(evt);
            }
        });

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Debe", "Pagado", "Baja" }));

        ModPen.setText("Modificar");
        ModPen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModPenActionPerformed(evt);
            }
        });

        jLabel35.setText("Mes de registro:");

        Mescbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel19.setText("Dia");

        jLabel34.setText("Mes");

        INIMESPEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        FINMESPEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel36.setText("Modelo:");

        jLabel37.setText("Marca:");

        jLabel38.setText("Placas:");

        jLabel39.setText("Color:");

        jLabel40.setText("Auto 1");

        jLabel41.setText("Auto 2");

        jLabel42.setText("Auto 3");

        jLabel43.setText("Placas:");

        jLabel44.setText("Marca:");

        jLabel45.setText("Modelo:");

        jLabel46.setText("Color:");

        jLabel47.setText("Año:");

        jLabel48.setText("Año:");

        Importe1.setText("0");
        Importe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe1KeyReleased(evt);
            }
        });

        jLabel49.setText("Importe:");

        jLabel50.setText("Importe:");

        Importe2.setText("0");
        Importe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe2KeyReleased(evt);
            }
        });

        IVA1.setText("IVA");
        IVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVA1ActionPerformed(evt);
            }
        });

        Rec1.setText("Recargo");
        Rec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rec1ActionPerformed(evt);
            }
        });

        IVAImporte1.setEditable(false);
        IVAImporte1.setText("0");

        RecImporte1.setEditable(false);
        RecImporte1.setText("0");

        RecImporte2.setEditable(false);
        RecImporte2.setText("0");

        Rec2.setText("Recargo");
        Rec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rec2ActionPerformed(evt);
            }
        });

        IVA2.setText("IVA");
        IVA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVA2ActionPerformed(evt);
            }
        });

        IVAImporte2.setEditable(false);
        IVAImporte2.setText("0");

        tds12.setText("12 HRS");

        cv3.setText("3");

        cv2.setText("2");

        cv1.setText("1");

        cv5.setText("5");

        tds24.setText("24 HRS");

        cv4.setText("4");

        jLabel16.setText("Tipo de pension:");

        jLabel15.setText("Clase de Auto:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(cv3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cv4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cv5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(cv1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cv2))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(tds12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tds24)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cv1)
                    .addComponent(cv2)
                    .addComponent(cv3)
                    .addComponent(cv4)
                    .addComponent(cv5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(tds12)
                    .addComponent(tds24))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Ap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Am, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel5)
                                                            .addComponent(jLabel7)
                                                            .addComponent(jLabel8))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(CEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(TC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(TO, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(37, 37, 37)
                                                        .addComponent(jLabel21)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel35)
                                                    .addComponent(jLabel20))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Mescbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(RS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel28)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel34))
                                    .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(FINDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FINMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(INIDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(INIMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FechaDP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel24)
                                            .addComponent(Rec)
                                            .addComponent(IVA))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(RecImporte, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Importe, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(año, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Color, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Modelo, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Marca, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Placas, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IVAImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel40)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel38)
                                                .addComponent(jLabel37)
                                                .addComponent(jLabel36)
                                                .addComponent(jLabel39)
                                                .addComponent(jLabel47)
                                                .addComponent(jLabel49))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Color1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Placas1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(24, 24, 24)
                                                    .addComponent(IVA1))
                                                .addComponent(Rec1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(IVAImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(RecImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(135, 135, 135)
                                        .addComponent(jLabel41)
                                        .addGap(62, 62, 62)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel43)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Placas2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel44)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Marca2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel45)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel48)
                                                    .addComponent(jLabel46)
                                                    .addComponent(jLabel50)
                                                    .addComponent(Rec2)
                                                    .addComponent(IVA2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Color2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(año2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(RecImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(IVAImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(AddPen)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ModPen))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel25)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TAP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel26)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(156, 156, 156))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(jLabel42)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 423, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(Mescbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(RS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(Placas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Rec)
                                    .addComponent(RecImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IVA)
                                    .addComponent(IVAImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(TAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(AddPen)
                                    .addComponent(ModPen))
                                .addGap(120, 120, 120))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(INIDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INIMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(FINDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FINMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(FechaDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(NS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel42)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Placas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel43)
                            .addComponent(Placas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37)
                            .addComponent(jLabel44)
                            .addComponent(Marca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel36)
                            .addComponent(Modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel45))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39)
                            .addComponent(jLabel46)
                            .addComponent(Color2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(año2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RecImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rec1)
                            .addComponent(RecImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rec2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IVA1)
                            .addComponent(IVAImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IVAImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IVA2))))
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        jTabbedPane1.addTab("Registro de pensiones", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

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

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem5.setText("Nomina General");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        CDA1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA1.setText("Caja de ahorro");
        CDA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDA1ActionPerformed(evt);
            }
        });
        jMenu3.add(CDA1);

        jMenu2.add(jMenu3);

        jMenu4.setText("Semanal");

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem6.setText("Nomina Semanal IMSS");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem7.setText("Prestamos Semanales");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem8.setText("Nomina Semanal General");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem8);

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

        jMenu5.setText("Area RH");

        General1.setText("Empleados General");
        General1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                General1ActionPerformed(evt);
            }
        });
        jMenu5.add(General1);

        Estadias.setText("Alumno de estadia");
        Estadias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadiasActionPerformed(evt);
            }
        });
        jMenu5.add(Estadias);

        Torteria.setText("Empleados Torteria");
        Torteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorteriaActionPerformed(evt);
            }
        });
        jMenu5.add(Torteria);

        jMenu6.setText("Semanales");

        jMenuItem10.setText("Inturbide");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Tehuantepec");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuItem12.setText("PTE titla");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem12);

        jMenu5.add(jMenu6);

        Depositos1.setText("Depositos");

        jMenu9.setText("Quincenales");

        jMenuItem1.setText("Depositos C/ IMSS");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem1);

        jMenuItem13.setText("Depositos S/ IMSS");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        Depositos1.add(jMenu9);

        jMenu10.setText("Semanales");

        jMenuItem17.setText("Depositos C/ IMSS");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem17);

        jMenuItem18.setText("Depositos S/ IMSS");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem18);

        Depositos1.add(jMenu10);

        jMenu5.add(Depositos1);

        Menuadm.add(jMenu5);

        ZYS.setText("Zonas y Servicios");
        ZYS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZYSActionPerformed(evt);
            }
        });
        Menuadm.add(ZYS);

        ADMV1.setText("Usuarios");
        ADMV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADMV1ActionPerformed(evt);
            }
        });
        Menuadm.add(ADMV1);

        jMenuBar1.add(Menuadm);

        jMenu1.setText("Reporte");

        jMenu7.setText("Estacionamiento");

        jMenu8.setText("Tehuantepec");

        jMenuItem2.setText("Por mes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem3.setText("General");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem3);

        jMenu7.add(jMenu8);

        jMenu11.setText("Iturbide");

        jMenuItem4.setText("Por mes");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem4);

        jMenuItem9.setText("General");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem9);

        jMenu7.add(jMenu11);

        jMenu12.setText("Puente titla");

        jMenuItem14.setText("Por mes");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem14);

        jMenuItem15.setText("General");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem15);

        jMenu7.add(jMenu12);

        jMenu1.add(jMenu7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1302, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPenActionPerformed

        String CV = null, tds = null;
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
        if (tds12.isSelected()) {
            tds = "12 horas";
        }
        if (tds24.isSelected()) {
            tds = "24 horas";
        }
        String SQL = "INSERT INTO `pensiones." + Est.getSelectedItem().toString() + "` "
                + "(`#registro`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Direccion`, "
                + "`Mail`, `Placas 1`, `marca 1`, `modelo 1`, `Color 1`, `Ano 1`, `Placas 2`,"
                + " `Marca 2`, `Modelo 2`, `Color 2`, `Año 2`, `Placas 3`, `Marca 3`, "
                + "`Modelo 3`, `Color 3`, `Año 3`, `Tel Casa`, `Tel Oficina`, `Celular`, "
                + "`Observaciones`, `ClaseDA`, `Tdpension`, `Status`, `MDregistro`, `RSocial`,"
                + " `#Padron`, `Diainicio`, `mesinicio`, `diafin`, `mesfin`, `Importe`, `Recargo`, "
                + "`IVA`, `TaPagar`, `Tpagado`, `FdPago`, `metodo`, `cte`) VALUES (?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NR.getText()));
            pst.setString(2, Ap.getText());
            pst.setString(3, Am.getText());
            pst.setString(4, Name.getText());
            pst.setString(5, Direccion.getText());
            pst.setString(6, MAIL.getText());
            pst.setString(7, Placas.getText());
            pst.setString(8, Marca.getText());
            pst.setString(9, Modelo.getText());
            pst.setString(10, Color.getText());
            pst.setString(11, año.getText());
            pst.setString(12, Placas1.getText());
            pst.setString(13, Marca1.getText());
            pst.setString(14, Modelo1.getText());
            pst.setString(15, Color1.getText());
            pst.setString(16, año1.getText());
            pst.setString(17, Placas2.getText());
            pst.setString(18, Marca2.getText());
            pst.setString(19, Modelo2.getText());
            pst.setString(20, Color2.getText());
            pst.setString(21, año2.getText());
            pst.setString(22, TC.getText());
            pst.setString(23, TO.getText());
            pst.setString(24, CEL.getText());
            pst.setString(25, ObsPen.getText());
            pst.setString(26, CV);
            pst.setString(27, tds);
            pst.setString(28, Status.getSelectedItem().toString());
            pst.setString(29, Mescbx.getSelectedItem().toString());
            pst.setString(30, RS.getText());
            pst.setString(31, NP.getText());
            pst.setString(32, INIDIPEN.getText());
            pst.setString(33, INIMESPEN.getSelectedItem().toString());
            pst.setString(34, FINDIPEN.getText());
            pst.setString(35, FINMESPEN.getSelectedItem().toString());
            pst.setString(36, Importe.getText());
            pst.setString(37, RecImporte.getText());
            pst.setString(38, IVAImporte.getText());
            pst.setString(39, TAP.getText());
            pst.setString(40, TP.getText());
            pst.setString(41, FechaDP.getText());
            pst.setString(42, Metodo.getText());
            pst.setString(43, NS.getText());

            pst.executeUpdate();

            MDPEN();

            NR.setText("0");
            Ap.setText("");
            Am.setText("");
            Name.setText("");
            Direccion.setText("");
            MAIL.setText("");
            TC.setText("");
            TO.setText("");
            CEL.setText("");
            ObsPen.setText("");
            Placas.setText("");
            Marca.setText("");
            Modelo.setText("");
            año.setText("");
            Color.setText("");
            Placas1.setText("");
            Marca1.setText("");
            Modelo1.setText("");
            año1.setText("");
            Color1.setText("");
            Placas2.setText("");
            Marca2.setText("");
            Modelo2.setText("");
            año2.setText("");
            Color2.setText("");
            Status.setSelectedIndex(0);
            INIMESPEN.setSelectedIndex(0);
            FINMESPEN.setSelectedIndex(0);
            Mescbx.setSelectedIndex(0);
            INIDIPEN.setText("");
            RS.setText("");
            NP.setText("0");
            FINDIPEN.setText("");
            Importe.setText("0");
            RecImporte.setText("0");
            IVAImporte.setText("0");
            TAP.setText("0");
            TP.setText("0");
            FechaDP.setText("");
            Metodo.setText("");
            NS.setText("");

            pst.isClosed();
            JOptionPane.showMessageDialog(null, "pension registrada.");
        } catch (SQLException error_AddLDA) {
            JOptionPane.showMessageDialog(null, "Error al registrar pension: " + error_AddLDA);
        }
    }//GEN-LAST:event_AddPenActionPerformed

    private void ApiturbideKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApiturbideKeyReleased
        MDPEN();
    }//GEN-LAST:event_ApiturbideKeyReleased

    private void AmiturbideKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmiturbideKeyReleased
        MDPEN();
    }//GEN-LAST:event_AmiturbideKeyReleased

    private void nameiturbideKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameiturbideKeyReleased
        MDPEN();
    }//GEN-LAST:event_nameiturbideKeyReleased

    private void NPiturbideKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NPiturbideKeyReleased
        MDPEN();
    }//GEN-LAST:event_NPiturbideKeyReleased

    private void ImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyReleased
        operaciones();
    }//GEN-LAST:event_ImporteKeyReleased

    private void RecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecActionPerformed
        operaciones();
    }//GEN-LAST:event_RecActionPerformed

    private void IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAActionPerformed
        operaciones();
    }//GEN-LAST:event_IVAActionPerformed

    private void ApTehuantepecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApTehuantepecKeyReleased
        MDPEN();
    }//GEN-LAST:event_ApTehuantepecKeyReleased

    private void AmTehuantepecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmTehuantepecKeyReleased
        MDPEN();
    }//GEN-LAST:event_AmTehuantepecKeyReleased

    private void nameTehuantepecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTehuantepecKeyReleased
        MDPEN();
    }//GEN-LAST:event_nameTehuantepecKeyReleased

    private void NPTehuantepecKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NPTehuantepecKeyReleased
        MDPEN();
    }//GEN-LAST:event_NPTehuantepecKeyReleased

    private void ApptetitlaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApptetitlaKeyReleased
        MDPEN();
    }//GEN-LAST:event_ApptetitlaKeyReleased

    private void AmptetitlaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmptetitlaKeyReleased
        MDPEN();
    }//GEN-LAST:event_AmptetitlaKeyReleased

    private void nameptetitlaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameptetitlaKeyReleased
        MDPEN();
    }//GEN-LAST:event_nameptetitlaKeyReleased

    private void NPptetitlaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NPptetitlaKeyReleased
        MDPEN();
    }//GEN-LAST:event_NPptetitlaKeyReleased

    private void ModPenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModPenActionPerformed
        String CV = null, tds = null;
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
        if (tds12.isSelected()) {
            tds = "12 horas";
        }
        if (tds24.isSelected()) {
            tds = "24 horas";
        }
        String SQL = "UPDATE `pensiones." + Est.getSelectedItem().toString() + "` SET `#registro` = ?,"
                + " `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Direccion` = ?, `Mail` = ?,"
                + " `#Casa` = ?, `#Oficina` = ?, `#Celular` = ?, `Observaciones` = ?, `Placas` = ?,"
                + " `Marca` = ?, `Modelo` = ?, `Año` = ?, `Color` = ?, `Clase auto` = ?, `Tipo de pension` = ?,"
                + " `Status` = ?, `Referencia Bancaria` = ?, `Razon Social` = ?, `#padron` = ?,"
                + " `Iniciopension` = ?, `Mes` = ?, `Finpension` = ?, `Importe` = ?, `Recargo` = ?, `IVA` = ?,"
                + " `Total a pagar` = ?, `Total pagado` = ?, `Fecha de pago` = ?, `Metodo` = ?, `CTE` = ?"
                + " WHERE `pensiones." + Est.getSelectedItem().toString() + "`.`#registro` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(NR.getText()));
            pst.setString(2, Ap.getText());
            pst.setString(3, Am.getText());
            pst.setString(4, Name.getText());
            pst.setString(5, Direccion.getText());
            pst.setString(6, MAIL.getText());
            pst.setString(7, Placas.getText());
            pst.setString(8, Marca.getText());
            pst.setString(9, Modelo.getText());
            pst.setString(10, Color.getText());
            pst.setString(11, año.getText());
            pst.setString(12, Placas1.getText());
            pst.setString(13, Marca1.getText());
            pst.setString(14, Modelo1.getText());
            pst.setString(15, Color1.getText());
            pst.setString(16, año1.getText());
            pst.setString(17, Placas2.getText());
            pst.setString(18, Marca2.getText());
            pst.setString(19, Modelo2.getText());
            pst.setString(20, Color2.getText());
            pst.setString(21, año2.getText());
            pst.setString(22, TC.getText());
            pst.setString(23, TO.getText());
            pst.setString(24, CEL.getText());
            pst.setString(25, ObsPen.getText());
            pst.setString(26, CV);
            pst.setString(27, tds);
            pst.setString(28, Status.getSelectedItem().toString());
            pst.setString(29, Mescbx.getSelectedItem().toString());
            pst.setString(30, RS.getText());
            pst.setString(31, NP.getText());
            pst.setString(32, INIDIPEN.getText());
            pst.setString(33, INIMESPEN.getSelectedItem().toString());
            pst.setString(34, FINDIPEN.getText());
            pst.setString(35, FINMESPEN.getSelectedItem().toString());
            pst.setString(36, Importe.getText());
            pst.setString(37, RecImporte.getText());
            pst.setString(38, IVAImporte.getText());
            pst.setString(39, TAP.getText());
            pst.setString(40, TP.getText());
            pst.setString(41, FechaDP.getText());
            pst.setString(42, Metodo.getText());
            pst.setString(43, NS.getText());

            pst.executeUpdate();

            MDPEN();

            NR.setText("0");
            Ap.setText("");
            Am.setText("");
            Name.setText("");
            Direccion.setText("");
            MAIL.setText("");
            TC.setText("");
            TO.setText("");
            CEL.setText("");
            ObsPen.setText("");
            Placas.setText("");
            Marca.setText("");
            Modelo.setText("");
            año.setText("");
            Color.setText("");
            Placas1.setText("");
            Marca1.setText("");
            Modelo1.setText("");
            año1.setText("");
            Color1.setText("");
            Placas2.setText("");
            Marca2.setText("");
            Modelo2.setText("");
            año2.setText("");
            Color2.setText("");
            Status.setSelectedIndex(0);
            INIMESPEN.setSelectedIndex(0);
            FINMESPEN.setSelectedIndex(0);
            Mescbx.setSelectedIndex(0);
            INIDIPEN.setText("");
            RS.setText("");
            NP.setText("0");
            FINDIPEN.setText("");
            Importe.setText("0");
            RecImporte.setText("0");
            IVAImporte.setText("0");
            TAP.setText("0");
            TP.setText("0");
            FechaDP.setText("");
            Metodo.setText("");
            NS.setText("");

            pst.isClosed();
            JOptionPane.showMessageDialog(null, "pension registrada.");
        } catch (SQLException error_AddLDA) {
            JOptionPane.showMessageDialog(null, "Error al registrar pension: " + error_AddLDA);
        }
    }//GEN-LAST:event_ModPenActionPerformed

    private void TTehuantepecMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TTehuantepecMousePressed
        DefaultTableModel model = (DefaultTableModel) TTehuantepec.getModel();

        int fila = TTehuantepec.getSelectedRow();
        NR.setText(String.valueOf(TTehuantepec.getValueAt(fila, 0)));
        Ap.setText(String.valueOf(TTehuantepec.getValueAt(fila, 1)));
        Am.setText(String.valueOf(TTehuantepec.getValueAt(fila, 2)));
        Name.setText(String.valueOf(TTehuantepec.getValueAt(fila, 3)));
        Direccion.setText(String.valueOf(TTehuantepec.getValueAt(fila, 4)));
        MAIL.setText(String.valueOf(TTehuantepec.getValueAt(fila, 5)));
        TC.setText(String.valueOf(TTehuantepec.getValueAt(fila, 6)));
        TO.setText(String.valueOf(TTehuantepec.getValueAt(fila, 7)));
        CEL.setText(String.valueOf(TTehuantepec.getValueAt(fila, 8)));
        ObsPen.setText(String.valueOf(TTehuantepec.getValueAt(fila, 9)));
        Placas.setText(String.valueOf(TTehuantepec.getValueAt(fila, 10)));
        Marca.setText(String.valueOf(TTehuantepec.getValueAt(fila, 11)));
        Modelo.setText(String.valueOf(TTehuantepec.getValueAt(fila, 12)));
        año.setText(String.valueOf(TTehuantepec.getValueAt(fila, 13)));
        Color.setText(String.valueOf(TTehuantepec.getValueAt(fila, 14)));
        // CDA.setText(String.valueOf(TTehuantepec.getValueAt(fila, 15)));
        // TDP.setText(String.valueOf(TTehuantepec.getValueAt(fila, 16)));
        String combo4 = model.getValueAt(fila, 17).toString();
        for (int i = 0; i < Status.getItemCount(); i++) {
            if (Status.getItemAt(i).equalsIgnoreCase(combo4)) {
                Status.setSelectedIndex(i);
            }
        }
        String combo5 = model.getValueAt(fila, 18).toString();
        for (int i = 0; i < Mescbx.getItemCount(); i++) {
            if (Mescbx.getItemAt(i).equalsIgnoreCase(combo5)) {
                Mescbx.setSelectedIndex(i);
            }
        }
        RS.setText(String.valueOf(TTehuantepec.getValueAt(fila, 19)));
        NP.setText(String.valueOf(TTehuantepec.getValueAt(fila, 20)));
        INIDIPEN.setText(String.valueOf(TTehuantepec.getValueAt(fila, 21)));
        String combo6 = model.getValueAt(fila, 22).toString();
        for (int i = 0; i < INIMESPEN.getItemCount(); i++) {
            if (INIMESPEN.getItemAt(i).equalsIgnoreCase(combo6)) {
                INIMESPEN.setSelectedIndex(i);
            }
        }
        FINDIPEN.setText(String.valueOf(TTehuantepec.getValueAt(fila, 23)));
        String combo7 = model.getValueAt(fila, 24).toString();
        for (int i = 0; i < FINMESPEN.getItemCount(); i++) {
            if (FINMESPEN.getItemAt(i).equalsIgnoreCase(combo7)) {
                FINMESPEN.setSelectedIndex(i);
            }
        }
        Importe.setText(String.valueOf(TTehuantepec.getValueAt(fila, 25)));
        RecImporte.setText(String.valueOf(TTehuantepec.getValueAt(fila, 26)));
        IVAImporte.setText(String.valueOf(TTehuantepec.getValueAt(fila, 27)));
        TAP.setText(String.valueOf(TTehuantepec.getValueAt(fila, 28)));
        TP.setText(String.valueOf(TTehuantepec.getValueAt(fila, 29)));
        FechaDP.setText(String.valueOf(TTehuantepec.getValueAt(fila, 30)));
        Metodo.setText(String.valueOf(TTehuantepec.getValueAt(fila, 31)));
        NS.setText(String.valueOf(TTehuantepec.getValueAt(fila, 32)));

        if (Double.parseDouble(RecImporte.getText()) >= 0.1) {
            Rec.setSelected(true);
        } else {
            Rec.setSelected(false);
        }
        if (Double.parseDouble(IVAImporte.getText()) >= 0.1) {
            IVA.setSelected(true);
        } else {
            IVA.setSelected(false);
        }
        Est.setSelectedIndex(3);
    }//GEN-LAST:event_TTehuantepecMousePressed

    private void TiturbideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TiturbideMousePressed
        DefaultTableModel model = (DefaultTableModel) Titurbide.getModel();

        int fila = Titurbide.getSelectedRow();
        NR.setText(String.valueOf(Titurbide.getValueAt(fila, 0)));
        Ap.setText(String.valueOf(Titurbide.getValueAt(fila, 1)));
        Am.setText(String.valueOf(Titurbide.getValueAt(fila, 2)));
        Name.setText(String.valueOf(Titurbide.getValueAt(fila, 3)));
        Direccion.setText(String.valueOf(Titurbide.getValueAt(fila, 4)));
        MAIL.setText(String.valueOf(Titurbide.getValueAt(fila, 5)));
        TC.setText(String.valueOf(Titurbide.getValueAt(fila, 6)));
        TO.setText(String.valueOf(Titurbide.getValueAt(fila, 7)));
        CEL.setText(String.valueOf(Titurbide.getValueAt(fila, 8)));
        ObsPen.setText(String.valueOf(Titurbide.getValueAt(fila, 9)));
        Placas.setText(String.valueOf(Titurbide.getValueAt(fila, 10)));
        Marca.setText(String.valueOf(Titurbide.getValueAt(fila, 11)));
        Modelo.setText(String.valueOf(Titurbide.getValueAt(fila, 12)));
        año.setText(String.valueOf(Titurbide.getValueAt(fila, 13)));
        Color.setText(String.valueOf(Titurbide.getValueAt(fila, 14)));
        //    CDA.setText(String.valueOf(Titurbide.getValueAt(fila, 15)));
        // TDP.setText(String.valueOf(Titurbide.getValueAt(fila, 16)));
        String combo4 = model.getValueAt(fila, 17).toString();
        for (int i = 0; i < Status.getItemCount(); i++) {
            if (Status.getItemAt(i).equalsIgnoreCase(combo4)) {
                Status.setSelectedIndex(i);
            }
        }
        String combo5 = model.getValueAt(fila, 18).toString();
        for (int i = 0; i < Mescbx.getItemCount(); i++) {
            if (Mescbx.getItemAt(i).equalsIgnoreCase(combo5)) {
                Mescbx.setSelectedIndex(i);
            }
        }
        RS.setText(String.valueOf(Titurbide.getValueAt(fila, 19)));
        NP.setText(String.valueOf(Titurbide.getValueAt(fila, 20)));
        INIDIPEN.setText(String.valueOf(Titurbide.getValueAt(fila, 21)));
        String combo6 = model.getValueAt(fila, 22).toString();
        for (int i = 0; i < INIMESPEN.getItemCount(); i++) {
            if (INIMESPEN.getItemAt(i).equalsIgnoreCase(combo6)) {
                INIMESPEN.setSelectedIndex(i);
            }
        }
        FINDIPEN.setText(String.valueOf(Titurbide.getValueAt(fila, 23)));
        String combo7 = model.getValueAt(fila, 24).toString();
        for (int i = 0; i < FINMESPEN.getItemCount(); i++) {
            if (FINMESPEN.getItemAt(i).equalsIgnoreCase(combo7)) {
                FINMESPEN.setSelectedIndex(i);
            }
        }
        Importe.setText(String.valueOf(Titurbide.getValueAt(fila, 25)));
        RecImporte.setText(String.valueOf(Titurbide.getValueAt(fila, 26)));
        IVAImporte.setText(String.valueOf(Titurbide.getValueAt(fila, 27)));
        TAP.setText(String.valueOf(Titurbide.getValueAt(fila, 28)));
        TP.setText(String.valueOf(Titurbide.getValueAt(fila, 29)));
        FechaDP.setText(String.valueOf(Titurbide.getValueAt(fila, 30)));
        Metodo.setText(String.valueOf(Titurbide.getValueAt(fila, 31)));
        NS.setText(String.valueOf(Titurbide.getValueAt(fila, 32)));

        if (Double.parseDouble(RecImporte.getText()) >= 0.1) {
            Rec.setSelected(true);
        } else {
            Rec.setSelected(false);
        }
        if (Double.parseDouble(IVAImporte.getText()) >= 0.1) {
            IVA.setSelected(true);
        } else {
            IVA.setSelected(false);
        }
        Est.setSelectedIndex(1);
    }//GEN-LAST:event_TiturbideMousePressed

    private void TptetitlaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TptetitlaMousePressed
        DefaultTableModel model = (DefaultTableModel) Tptetitla.getModel();

        int fila = Tptetitla.getSelectedRow();
        NR.setText(String.valueOf(Tptetitla.getValueAt(fila, 0)));
        Ap.setText(String.valueOf(Tptetitla.getValueAt(fila, 1)));
        Am.setText(String.valueOf(Tptetitla.getValueAt(fila, 2)));
        Name.setText(String.valueOf(Tptetitla.getValueAt(fila, 3)));
        Direccion.setText(String.valueOf(Tptetitla.getValueAt(fila, 4)));
        MAIL.setText(String.valueOf(Tptetitla.getValueAt(fila, 5)));
        TC.setText(String.valueOf(Tptetitla.getValueAt(fila, 6)));
        TO.setText(String.valueOf(Tptetitla.getValueAt(fila, 7)));
        CEL.setText(String.valueOf(Tptetitla.getValueAt(fila, 8)));
        ObsPen.setText(String.valueOf(Tptetitla.getValueAt(fila, 9)));
        Placas.setText(String.valueOf(Tptetitla.getValueAt(fila, 10)));
        Marca.setText(String.valueOf(Tptetitla.getValueAt(fila, 11)));
        Modelo.setText(String.valueOf(Tptetitla.getValueAt(fila, 12)));
        año.setText(String.valueOf(Tptetitla.getValueAt(fila, 13)));
        Color.setText(String.valueOf(Tptetitla.getValueAt(fila, 14)));
        //  CDA.setText(String.valueOf(Tptetitla.getValueAt(fila, 15)));
        //   TDP.setText(String.valueOf(Tptetitla.getValueAt(fila, 16)));
        String combo4 = model.getValueAt(fila, 17).toString();
        for (int i = 0; i < Status.getItemCount(); i++) {
            if (Status.getItemAt(i).equalsIgnoreCase(combo4)) {
                Status.setSelectedIndex(i);
            }
        }
        String combo5 = model.getValueAt(fila, 18).toString();
        for (int i = 0; i < Mescbx.getItemCount(); i++) {
            if (Mescbx.getItemAt(i).equalsIgnoreCase(combo5)) {
                Mescbx.setSelectedIndex(i);
            }
        }
        RS.setText(String.valueOf(Tptetitla.getValueAt(fila, 19)));
        NP.setText(String.valueOf(Tptetitla.getValueAt(fila, 20)));
        INIDIPEN.setText(String.valueOf(Tptetitla.getValueAt(fila, 21)));
        String combo6 = model.getValueAt(fila, 22).toString();
        for (int i = 0; i < INIMESPEN.getItemCount(); i++) {
            if (INIMESPEN.getItemAt(i).equalsIgnoreCase(combo6)) {
                INIMESPEN.setSelectedIndex(i);
            }
        }
        FINDIPEN.setText(String.valueOf(Tptetitla.getValueAt(fila, 23)));
        String combo7 = model.getValueAt(fila, 24).toString();
        for (int i = 0; i < FINMESPEN.getItemCount(); i++) {
            if (FINMESPEN.getItemAt(i).equalsIgnoreCase(combo7)) {
                FINMESPEN.setSelectedIndex(i);
            }
        }
        Importe.setText(String.valueOf(Tptetitla.getValueAt(fila, 25)));
        RecImporte.setText(String.valueOf(Tptetitla.getValueAt(fila, 26)));
        IVAImporte.setText(String.valueOf(Tptetitla.getValueAt(fila, 27)));
        TAP.setText(String.valueOf(Tptetitla.getValueAt(fila, 28)));
        TP.setText(String.valueOf(Tptetitla.getValueAt(fila, 29)));
        FechaDP.setText(String.valueOf(Tptetitla.getValueAt(fila, 30)));
        Metodo.setText(String.valueOf(Tptetitla.getValueAt(fila, 31)));
        NS.setText(String.valueOf(Tptetitla.getValueAt(fila, 32)));

        if (Double.parseDouble(RecImporte.getText()) >= 0.1) {
            Rec.setSelected(true);
        } else {
            Rec.setSelected(false);
        }
        if (Double.parseDouble(IVAImporte.getText()) >= 0.1) {
            IVA.setSelected(true);
        } else {
            IVA.setSelected(false);
        }
        Est.setSelectedIndex(2);
    }//GEN-LAST:event_TptetitlaMousePressed

    private void FiliturbideItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiliturbideItemStateChanged
        if (Filiturbide.getSelectedIndex() == 0) {
            LabelFiliturbide.setVisible(false);
            Apiturbide.setVisible(false);
            Amiturbide.setVisible(false);
            nameiturbide.setVisible(false);
            NPiturbide.setVisible(false);
            Apiturbide.setText("");
            Amiturbide.setText("");
            nameiturbide.setText("");
            NPiturbide.setText("");
        }
        if (Filiturbide.getSelectedIndex() == 1) {
            LabelFiliturbide.setVisible(true);
            LabelFiliturbide.setText("Buscar por Apellido P:");
            Apiturbide.setVisible(true);
            Amiturbide.setVisible(false);
            nameiturbide.setVisible(false);
            NPiturbide.setVisible(false);
            Apiturbide.setText("");
            Amiturbide.setText("");
            nameiturbide.setText("");
            NPiturbide.setText("");
        }
        if (Filiturbide.getSelectedIndex() == 2) {
            LabelFiliturbide.setVisible(true);
            LabelFiliturbide.setText("Buscar por Apellido M");
            Apiturbide.setVisible(false);
            Amiturbide.setVisible(true);
            nameiturbide.setVisible(false);
            NPiturbide.setVisible(false);
            Apiturbide.setText("");
            Amiturbide.setText("");
            nameiturbide.setText("");
            NPiturbide.setText("");
        }
        if (Filiturbide.getSelectedIndex() == 3) {
            LabelFiliturbide.setVisible(true);
            LabelFiliturbide.setText("Buscar por Nombre(s):");
            Apiturbide.setVisible(false);
            Amiturbide.setVisible(false);
            nameiturbide.setVisible(true);
            NPiturbide.setVisible(false);
            Apiturbide.setText("");
            Amiturbide.setText("");
            nameiturbide.setText("");
            NPiturbide.setText("");
        }
        if (Filiturbide.getSelectedIndex() == 4) {
            LabelFiliturbide.setVisible(true);
            LabelFiliturbide.setText("Buscar por # Padron:");
            Apiturbide.setVisible(false);
            Amiturbide.setVisible(false);
            nameiturbide.setVisible(false);
            NPiturbide.setVisible(true);
            Apiturbide.setText("");
            Amiturbide.setText("");
            nameiturbide.setText("");
            NPiturbide.setText("");
        }
        MDPEN();

    }//GEN-LAST:event_FiliturbideItemStateChanged

    private void FilTehuantepecItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilTehuantepecItemStateChanged
        if (FilTehuantepec.getSelectedIndex() == 0) {
            LabelFilTehuantepec.setVisible(false);
            ApTehuantepec.setVisible(false);
            AmTehuantepec.setVisible(false);
            nameTehuantepec.setVisible(false);
            NPTehuantepec.setVisible(false);
            ApTehuantepec.setText("");
            AmTehuantepec.setText("");
            nameTehuantepec.setText("");
            NPTehuantepec.setText("");
        }
        if (FilTehuantepec.getSelectedIndex() == 1) {
            LabelFilTehuantepec.setVisible(true);
            LabelFilTehuantepec.setText("Buscar por Apellido P:");
            ApTehuantepec.setVisible(true);
            AmTehuantepec.setVisible(false);
            nameTehuantepec.setVisible(false);
            NPTehuantepec.setVisible(false);
            ApTehuantepec.setText("");
            AmTehuantepec.setText("");
            nameTehuantepec.setText("");
            NPTehuantepec.setText("");
        }
        if (FilTehuantepec.getSelectedIndex() == 2) {
            LabelFilTehuantepec.setVisible(true);
            LabelFilTehuantepec.setText("Buscar por Apellido M");
            ApTehuantepec.setVisible(false);
            AmTehuantepec.setVisible(true);
            nameTehuantepec.setVisible(false);
            NPTehuantepec.setVisible(false);
            ApTehuantepec.setText("");
            AmTehuantepec.setText("");
            nameTehuantepec.setText("");
            NPTehuantepec.setText("");
        }
        if (FilTehuantepec.getSelectedIndex() == 3) {
            LabelFilTehuantepec.setVisible(true);
            LabelFilTehuantepec.setText("Buscar por Nombre(s):");
            ApTehuantepec.setVisible(false);
            AmTehuantepec.setVisible(false);
            nameTehuantepec.setVisible(true);
            NPTehuantepec.setVisible(false);
            ApTehuantepec.setText("");
            AmTehuantepec.setText("");
            nameTehuantepec.setText("");
            NPTehuantepec.setText("");
        }
        if (FilTehuantepec.getSelectedIndex() == 4) {
            LabelFilTehuantepec.setVisible(true);
            LabelFilTehuantepec.setText("Buscar por # Padron:");
            ApTehuantepec.setVisible(false);
            AmTehuantepec.setVisible(false);
            nameTehuantepec.setVisible(false);
            NPTehuantepec.setVisible(true);
            ApTehuantepec.setText("");
            AmTehuantepec.setText("");
            nameTehuantepec.setText("");
            NPTehuantepec.setText("");
        }
        MDPEN();
    }//GEN-LAST:event_FilTehuantepecItemStateChanged

    private void FilptetitlaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilptetitlaItemStateChanged
        if (Filptetitla.getSelectedIndex() == 0) {
            LabelFilptetitla.setVisible(false);
            Apptetitla.setVisible(false);
            Amptetitla.setVisible(false);
            nameptetitla.setVisible(false);
            NPptetitla.setVisible(false);
            Apptetitla.setText("");
            Amptetitla.setText("");
            nameptetitla.setText("");
            NPptetitla.setText("");
        }
        if (Filptetitla.getSelectedIndex() == 1) {
            LabelFilptetitla.setVisible(true);
            LabelFilptetitla.setText("Buscar por Apellido P:");
            Apptetitla.setVisible(true);
            Amptetitla.setVisible(false);
            nameptetitla.setVisible(false);
            NPptetitla.setVisible(false);
            Apptetitla.setText("");
            Amptetitla.setText("");
            nameptetitla.setText("");
            NPptetitla.setText("");
        }
        if (Filptetitla.getSelectedIndex() == 2) {
            LabelFilptetitla.setVisible(true);
            LabelFilptetitla.setText("Buscar por Apellido M");
            Apptetitla.setVisible(false);
            Amptetitla.setVisible(true);
            nameptetitla.setVisible(false);
            NPptetitla.setVisible(false);
            Apptetitla.setText("");
            Amptetitla.setText("");
            nameptetitla.setText("");
            NPptetitla.setText("");
        }
        if (Filptetitla.getSelectedIndex() == 3) {
            LabelFilptetitla.setVisible(true);
            LabelFilptetitla.setText("Buscar por Nombre(s):");
            Apptetitla.setVisible(false);
            Amptetitla.setVisible(false);
            nameptetitla.setVisible(true);
            NPptetitla.setVisible(false);
            Apptetitla.setText("");
            Amptetitla.setText("");
            nameptetitla.setText("");
            NPptetitla.setText("");
        }
        if (Filptetitla.getSelectedIndex() == 4) {
            LabelFilptetitla.setVisible(true);
            LabelFilptetitla.setText("Buscar por # Padron:");
            Apptetitla.setVisible(false);
            Amptetitla.setVisible(false);
            nameptetitla.setVisible(false);
            NPptetitla.setVisible(true);
            Apptetitla.setText("");
            Amptetitla.setText("");
            nameptetitla.setText("");
            NPptetitla.setText("");
        }
        MDPEN();
    }//GEN-LAST:event_FilptetitlaItemStateChanged

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

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void CDA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA1ActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDA1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        NominaS_5 regr = new NominaS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        PresS_5 regr = new PresS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        NominaS_simss_5 regr = new NominaS_simss_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

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

    private void General1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_General1ActionPerformed

        Empleados_4 RH = new Empleados_4(usr, LP);
        RH.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_General1ActionPerformed

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

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Iturbide_4 regr = new Iturbide_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Tehuantepec_4 regr = new Tehuantepec_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        PT_4 regr = new PT_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        DepositosQ_4 regr = new DepositosQ_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        DepositosQ_SIMSS_4 regr = new DepositosQ_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        DepositosS_4 regr = new DepositosS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        DepositosS_SIMSS_4 regr = new DepositosS_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void ZYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZYSActionPerformed
        AltasZyS_3 regr = new AltasZyS_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZYSActionPerformed

    private void ADMV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMV1ActionPerformed
        VentanaADM_3 regr = new VentanaADM_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMV1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        PMtehuantepec regr = new PMtehuantepec(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        PMiturbide regr = new PMiturbide(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        PMptetitla regr = new PMptetitla(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        LogicaPenTehuantepec obj = new LogicaPenTehuantepec();
        obj.Pensiones();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        LogicaPenIturbide obj = new LogicaPenIturbide();
        obj.Pensiones();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        LogicaPenptetitla obj = new LogicaPenptetitla();
        obj.Pensiones();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void Importe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe1KeyReleased
        operaciones();
    }//GEN-LAST:event_Importe1KeyReleased

    private void Importe2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe2KeyReleased
        operaciones();
    }//GEN-LAST:event_Importe2KeyReleased

    private void IVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVA1ActionPerformed
        operaciones();
    }//GEN-LAST:event_IVA1ActionPerformed

    private void Rec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rec1ActionPerformed
        operaciones();
    }//GEN-LAST:event_Rec1ActionPerformed

    private void Rec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rec2ActionPerformed
        operaciones();
    }//GEN-LAST:event_Rec2ActionPerformed

    private void IVA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVA2ActionPerformed
        operaciones();
    }//GEN-LAST:event_IVA2ActionPerformed

    private void IVAImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAImporteActionPerformed
        operaciones();
    }//GEN-LAST:event_IVAImporteActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PensionesVP_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PensionesVP_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PensionesVP_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PensionesVP_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PensionesVP_7().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ADMV1;
    private javax.swing.JButton AddPen;
    private javax.swing.JTextField Am;
    private javax.swing.JTextField AmTehuantepec;
    private javax.swing.JTextField Amiturbide;
    private javax.swing.JTextField Amptetitla;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField ApTehuantepec;
    private javax.swing.JTextField Apiturbide;
    private javax.swing.JTextField Apptetitla;
    private javax.swing.JMenuItem CDA1;
    private javax.swing.JMenuItem CDA4;
    private javax.swing.JTextField CEL;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Color1;
    private javax.swing.JTextField Color2;
    private javax.swing.JMenu Depositos1;
    private javax.swing.JTextArea Direccion;
    private javax.swing.JComboBox<String> Est;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JTextField FINDIPEN;
    private javax.swing.JComboBox<String> FINMESPEN;
    private javax.swing.JTextField FechaDP;
    private javax.swing.JComboBox<String> FilTehuantepec;
    private javax.swing.JComboBox<String> Filiturbide;
    private javax.swing.JComboBox<String> Filptetitla;
    private javax.swing.JMenuItem General1;
    private javax.swing.JTextField INIDIPEN;
    private javax.swing.JComboBox<String> INIMESPEN;
    private javax.swing.JCheckBox IVA;
    private javax.swing.JCheckBox IVA1;
    private javax.swing.JCheckBox IVA2;
    private javax.swing.JTextField IVAImporte;
    private javax.swing.JTextField IVAImporte1;
    private javax.swing.JTextField IVAImporte2;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Importe1;
    private javax.swing.JTextField Importe2;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JMenuItem LDA3;
    private javax.swing.JLabel LabelFilTehuantepec;
    private javax.swing.JLabel LabelFiliturbide;
    private javax.swing.JLabel LabelFilptetitla;
    private javax.swing.JTextField MAIL;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Marca1;
    private javax.swing.JTextField Marca2;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JComboBox<String> Mescbx;
    private javax.swing.JTextField Metodo;
    private javax.swing.JButton ModPen;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Modelo1;
    private javax.swing.JTextField Modelo2;
    private javax.swing.JTextField NP;
    private javax.swing.JTextField NPTehuantepec;
    private javax.swing.JTextField NPiturbide;
    private javax.swing.JTextField NPptetitla;
    private javax.swing.JTextField NR;
    private javax.swing.JTextField NS;
    private javax.swing.JTextField Name;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JTextArea ObsPen;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JTextField Placas;
    private javax.swing.JTextField Placas1;
    private javax.swing.JTextField Placas2;
    private javax.swing.JTextField RS;
    private javax.swing.JCheckBox Rec;
    private javax.swing.JCheckBox Rec1;
    private javax.swing.JCheckBox Rec2;
    private javax.swing.JTextField RecImporte;
    private javax.swing.JTextField RecImporte1;
    private javax.swing.JTextField RecImporte2;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTextField TAP;
    private javax.swing.JTextField TC;
    private javax.swing.JTextField TO;
    private javax.swing.JTextField TP;
    private javax.swing.JTable TTehuantepec;
    private javax.swing.JTable Titurbide;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JTable Tptetitla;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField año;
    private javax.swing.JTextField año1;
    private javax.swing.JTextField año2;
    private javax.swing.JRadioButton cv1;
    private javax.swing.JRadioButton cv2;
    private javax.swing.JRadioButton cv3;
    private javax.swing.JRadioButton cv4;
    private javax.swing.JRadioButton cv5;
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
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField nameTehuantepec;
    private javax.swing.JTextField nameiturbide;
    private javax.swing.JTextField nameptetitla;
    private javax.swing.JRadioButton tds12;
    private javax.swing.JRadioButton tds24;
    // End of variables declaration//GEN-END:variables
}
