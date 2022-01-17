package Nomina;

import VentanasDReportes.RepNom_7;
import Admin.*;
import Conexion.ConexionSQL;
import RH.*;
import Inicio.Inicio_1;
import Logicas.Logica_permisos;
import Logicas.Logica_usuarios;
import java.awt.HeadlessException;
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
 */
public final class PresQ_5 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Logica_usuarios usr;
    Logica_permisos LP;

    public PresQ_5() {
        initComponents();
        shareprestamo();
        MDP();
        MDTPPres();
        LabelPrestamos.setVisible(false);
        BE.setVisible(false);
        BE.setText("");
        Busapshpre.setText("");
        Busapshpre.setVisible(false);
        Busamshpre.setText("");
        Busamshpre.setVisible(false);
        Labelfilpres.setVisible(false);
        FNamepres.setVisible(false);
        FAPpres.setVisible(false);
        FAMpres.setVisible(false);
        LabelFPDP.setVisible(false);
        FilPDPname.setVisible(false);
        FilPDPAp.setVisible(false);
        FilPDPAm.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(PresQ_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());

    }

    public PresQ_5(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        shareprestamo();
        MDP();
        MDTPPres();
        LabelPrestamos.setVisible(false);
        BE.setVisible(false);
        BE.setText("");
        Busapshpre.setText("");
        Busapshpre.setVisible(false);
        Busamshpre.setText("");
        Busamshpre.setVisible(false);
        Labelfilpres.setVisible(false);
        FNamepres.setVisible(false);
        FAPpres.setVisible(false);
        FAMpres.setVisible(false);
        LabelFPDP.setVisible(false);
        FilPDPname.setVisible(false);
        FilPDPAp.setVisible(false);
        FilPDPAm.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(PresQ_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        setTitle("Nomina: Prestamos Quincenales. # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
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
                    ODT.setVisible(false);
                }
                if (LP.getP2() == 0) {
                    CDA.setVisible(false);
                }
                if (LP.getP3() == 0) {
                    LDA.setVisible(false);
                }
                if (LP.getP4() == 0) {
                    Reportes.setVisible(false);
                }
                if (LP.getP5() == 0) {
                    //   NomDetallada.setVisible(false);
                }
                if (LP.getP6() == 0) {
                    // NomPagos.setVisible(false);
                }
                if (LP.getP7() == 0) {
                    //PRES.setVisible(false);
                }
                if (LP.getP8() == 0) {
                    Nomsem.setVisible(false);
                    NomSemGen.setVisible(false);
                }
                if (LP.getP9() == 0) {
                    PresSem.setVisible(false);
                }
                if (LP.getP10() == 0) {
                    //Modm.setVisible(false);
                }
            }
            default -> {
            }
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

    public void eliminarpre() {

        try {

            int filaseleccionada = Pre.getSelectedRow();
            String sql = "delete from prestamos where idprestamos=" + Pre.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Prestamo eliminado.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar prestamo: " + e.getMessage());

        }

    }

    public void MDP() {
        //Buscar empleado
        String FILNAMEPRE = FNamepres.getText();
        String FILAPPRE = FAPpres.getText();
        String FILAMPRE = FAMpres.getText();
        String sql = "select * from `nomina.prestamos`";

        if (!"".equals(FILNAMEPRE)) {
            sql = " select * from `nomina.prestamos` WHERE `Nombre(s)` LIKE '%" + FILNAMEPRE + "%'";
        } else if (!"".equals(FILAPPRE)) {
            sql = " select * from `nomina.prestamos` WHERE `Apellido P` LIKE '%" + FILAPPRE + "%'";
        } else if (!"".equals(FILAMPRE)) {
            sql = " select * from `nomina.prestamos` WHERE `Apellido M` LIKE '%" + FILAMPRE + "%'";
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
            Pre.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# de prestamo");//1
            modelo.addColumn("Fecha de solicitud");//
            modelo.addColumn("Mes");//3
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//5
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");//7
            modelo.addColumn("Servicio");
            modelo.addColumn("Cantidad");//9
            modelo.addColumn("Tiempo");
            modelo.addColumn("Interes");
            modelo.addColumn("Monto total");//12
            modelo.addColumn("Pago por quincena");
            modelo.addColumn("Carpeta de descuentos");//14
            modelo.addColumn("Fecha liberado");
            modelo.addColumn("Status");//16
            modelo.addColumn("Metodo");
            modelo.addColumn("Quincenas pagadas");//18
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//20

//Anchos
            int[] anchos = {/*ndp*/35, /*fds*/ 50, /*mes*/ 45, /*ap*/ 55, /*am*/ 55,
                /*Nom*/ 125, /*zon*/ 65, /*Serv*/ 80, /*Cantidad*/ 55,/*tiempo*/ 60, /*inte*/ 50,
                /*MT*/ 55, /*PQ*/ 75, /*CDD*/ 250, /*FL*/ 55, /*STATUS*/ 70, /*METODO*/ 60,
                /*QP*/ 60, /*PAG*/ 60, /*PEN*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Pre.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException Error_prestamos) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de prestamos: " + Error_prestamos.getMessage());

        }
    }

    public void editarpre() {

        int id = Integer.parseInt(Num.getText());

        String SQL = "UPDATE `nomina.prestamos` SET `idprestamos` = ?, `Fecha de solicitud` = ?, `Mes` = ?,"
                + " `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?, "
                + "`Servicio` = ?, `Cantidad` = ?, `Tiempo` = ?, `Interes` = ?,"
                + " `Monto total` = ?, `Por quincena` = ?, `Carpeta de descuentos` = ?,"
                + " `Fecha liberado` = ?, `Status` = ?, `Metodo` = ?,"
                + " `Quincenas pagadas` = ?, `Pagado` = ?, `Pendiente` = ? WHERE"
                + " `nomina.prestamos`.`idprestamos` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, id);
            pst.setString(2, FS.getText());
            pst.setString(3, Mes.getSelectedItem().toString());
            pst.setString(4, Appres.getText());
            pst.setString(5, Ampres.getText());
            pst.setString(6, Namepres.getText());
            pst.setString(7, Zona.getText());
            pst.setString(8, Serv.getText());
            pst.setString(9, Cantidad.getText());
            pst.setString(10, Interes.getSelectedItem().toString());
            pst.setString(11, interes.getText());
            pst.setString(12, MT.getText());
            pst.setString(13, PQ.getText());
            pst.setString(14, Carpeta.getText());
            pst.setString(15, FL.getText());
            pst.setString(16, Status.getText());
            pst.setString(17, Metodo.getText());
            pst.setString(18, QPprest.getText());
            pst.setString(19, PagadoPres.getText());
            pst.setString(20, Pendientepres.getText());
            pst.setInt(21, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Modificado");

            Num.setText("0");
            FS.setText("");
            Namepres.setText("");
            Appres.setText("");
            Ampres.setText("");
            Zona.setText("");
            Serv.setText("");
            Cantidad.setText("0");
            interes.setText("0");
            Interes.setSelectedIndex(0);
            Mes.setSelectedIndex(0);
            PQ.setText("0");
            MT.setText("0");
            Carpeta.setText("");
            FL.setText("");
            Status.setText("");
            Metodo.setText("");
            QPprest.setText("0");
            PagadoPres.setText("0");
            Pendientepres.setText("0");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Prestamo: " + e.getMessage());
        }
    }

    public void AgregarPre() {

        int id = Integer.parseInt(Num.getText());

        String SQL = "INSERT INTO `nomina.prestamos` (`idprestamos`, `Fecha de solicitud`,"
                + " `Mes`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`,"
                + " `Cantidad`, `Tiempo`, `Interes`, `Monto total`, `Por quincena`, "
                + "`Carpeta de descuentos`, `Fecha liberado`, `Status`, `Metodo`, "
                + "`Quincenas pagadas`, `Pagado`, `Pendiente`) VALUES (?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, id);
            pst.setString(2, FS.getText());
            pst.setString(3, Mes.getSelectedItem().toString());
            pst.setString(4, Appres.getText());
            pst.setString(5, Ampres.getText());
            pst.setString(6, Namepres.getText());
            pst.setString(7, Zona.getText());
            pst.setString(8, Serv.getText());
            pst.setString(9, Cantidad.getText());
            pst.setString(10, Interes.getSelectedItem().toString());
            pst.setString(11, interes.getText());
            pst.setString(12, MT.getText());
            pst.setString(13, PQ.getText());
            pst.setString(14, Carpeta.getText());
            pst.setString(15, FL.getText());
            pst.setString(16, Status.getText());
            pst.setString(17, Metodo.getText());
            pst.setString(18, QPprest.getText());
            pst.setString(19, PagadoPres.getText());
            pst.setString(20, Pendientepres.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Agregado");

            Num.setText("0");
            FS.setText("");
            Namepres.setText("");
            Appres.setText("");
            Ampres.setText("");
            Zona.setText("");
            Serv.setText("");
            Cantidad.setText("0");
            interes.setText("0");
            Interes.setSelectedIndex(0);
            Mes.setSelectedIndex(0);
            PQ.setText("0");
            MT.setText("0");
            Carpeta.setText("");
            FL.setText("");
            Status.setText("");
            Metodo.setText("");
            QPprest.setText("0");
            PagadoPres.setText("0");
            Pendientepres.setText("0");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar prestamo: " + e.getMessage());
        }
    }

    public void shareprestamo() {
        //Buscar empleado
        String Share = BE.getText();
        String ShareAP = Busapshpre.getText();
        String ShareAM = Busamshpre.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                + " from `rh.empleados`  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from `rh.empleados` WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from `rh.empleados` WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
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
            share1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Servicio");
            modelo.addColumn("Zona");

//Anchos
            int[] anchos = {50, 50, 100, 75, 50};

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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con prestamos: " + ex.getMessage());

        }

    }

    public void IOMTPres() {
        double inter = 0, Quincenasint = 0;

        String interespres = (String) Interes.getSelectedItem();
        if (interespres.equals(".")) {
            inter = 0;
            Quincenasint = 0;
        }
        if (interespres.equals("2 Quincenas 10%")) {
            inter = 10;
            Quincenasint = 2;
        }
        if (interespres.equals("3 Quincenas 15%")) {
            inter = 15;
            Quincenasint = 3;
        }
        if (interespres.equals("4 Quincenas 15%")) {
            inter = 15;
            Quincenasint = 4;
        }
        if (interespres.equals("5 Quincenas 20%")) {
            inter = 20;
            Quincenasint = 5;
        }
        if (interespres.equals("6 Quincenas 20%")) {
            inter = 20;
            Quincenasint = 6;
        }
        if (interespres.equals("7 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 7;
        }
        if (interespres.equals("8 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 8;
        }
        if (interespres.equals("9 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 9;
        }
        if (interespres.equals("10 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 10;
        }
        if (interespres.equals("11 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 11;
        }
        if (interespres.equals("12 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 12;
        }
        if (interespres.equals("13 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 13;
        }
        if (interespres.equals("14 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 14;
        }
        if (interespres.equals("15 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 15;
        }
        if (interespres.equals("16 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 16;
        }
        if (interespres.equals("17 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 17;
        }
        if (interespres.equals("18 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 18;
        }
        if (interespres.equals("19 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 19;
        }
        if (interespres.equals("20 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 20;
        }
        if (Sinteres.isSelected() == true) {
            inter = 0;
        }

        //operacion interes
        double CAN = Double.parseDouble(this.Cantidad.getText());
        double total = (inter * CAN) / 100;
        this.interes.setText("" + total + "");
        //operacion por semanas

        double PQuin = Double.parseDouble(this.MT.getText());
        double totalPQ = PQuin / Quincenasint;
        this.PQ.setText("" + totalPQ + "");
//monto total
        double MTinteres1 = Double.parseDouble(this.Cantidad.getText());
        double MTinteres2 = Double.parseDouble(this.interes.getText());
        double MTo = (MTinteres1 + MTinteres2);
        this.MT.setText("" + MTo + "");;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PestañasPrin = new javax.swing.JTabbedPane();
        Prestamos = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Num = new javax.swing.JTextField();
        Mes = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        Interes = new javax.swing.JComboBox<>();
        interes = new javax.swing.JTextField();
        MT = new javax.swing.JTextField();
        Carpeta = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        Metodo = new javax.swing.JTextField();
        LabelPrestamos = new javax.swing.JLabel();
        BE = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        share1 = new javax.swing.JTable();
        Zona = new javax.swing.JTextField();
        Serv = new javax.swing.JTextField();
        Agregarprestamo = new javax.swing.JButton();
        modprestamo = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        PQ = new javax.swing.JTextField();
        FS = new javax.swing.JTextField();
        FL = new javax.swing.JTextField();
        CS4 = new javax.swing.JButton();
        Busapshpre = new javax.swing.JTextField();
        Filtrosshp = new javax.swing.JComboBox<>();
        Busamshpre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Appres = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Ampres = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Namepres = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        QPprest = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        PagadoPres = new javax.swing.JTextField();
        Pendientepres = new javax.swing.JTextField();
        Sinteres = new javax.swing.JCheckBox();
        TablasPrestamos = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        Labelfilpres = new javax.swing.JLabel();
        FNamepres = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        Pre = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        CS5 = new javax.swing.JButton();
        botonWeb3 = new botones.BotonWeb();
        FiltrosTP = new javax.swing.JComboBox<>();
        jLabel160 = new javax.swing.JLabel();
        FAPpres = new javax.swing.JTextField();
        FAMpres = new javax.swing.JTextField();
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
        botonWeb5 = new botones.BotonWeb();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        ODT1 = new javax.swing.JMenuItem();
        CNQ1 = new javax.swing.JMenuItem();
        PRESQ1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        CDA1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        General = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        Depositos = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        ADMV2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        Nomsem = new javax.swing.JMenuItem();
        NomSemGen = new javax.swing.JMenuItem();
        PresSem = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CNQ = new javax.swing.JMenuItem();
        NomGen = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
        LDA = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamos");

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel30.setText("Apellido P:");

        jLabel34.setText("Zona:");

        jLabel35.setText("Servicio:");

        jLabel36.setText("Cantidad:");

        jLabel37.setText("Interes:");

        jLabel38.setText("Monto total:");

        jLabel39.setText("Carpeta:");

        jLabel40.setText("Fecha liberado:");

        jLabel41.setText("Mes:");

        jLabel42.setText("Fecha solicitud");

        jLabel43.setText("# Prestamo");

        jLabel44.setText("Status:");

        jLabel45.setText("Metodo:");

        Num.setText("0");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        Cantidad.setText("0");

        Interes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "2 Quincenas 10%", "3 Quincenas 15%", "4 Quincenas 15%", "5 Quincenas 20%", "6 Quincenas 20%", "7 Quincenas 25%", "8 Quincenas 25%", "9 Quincenas 25%", "10 Quincenas 25%", "11 Quincenas 25%", "12 Quincenas 25%", "13 Quincenas 25%", "14 Quincenas 25%", "15 Quincenas 25%", "16 Quincenas 25%", "17 Quincenas 25%", "18 Quincenas 25%", "19 Quincenas 25%", "20 Quincenas 25%" }));
        Interes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                InteresItemStateChanged(evt);
            }
        });

        interes.setText("0");

        MT.setText("0");
        MT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                MTKeyReleased(evt);
            }
        });

        LabelPrestamos.setText("Buscar empleado:");

        BE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BEKeyReleased(evt);
            }
        });

        share1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        share1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                share1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(share1);

        Agregarprestamo.setText("Agregar");
        Agregarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarprestamoActionPerformed(evt);
            }
        });

        modprestamo.setText("Modificar");
        modprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modprestamoActionPerformed(evt);
            }
        });

        jLabel47.setText("Por quincena:");

        PQ.setText("0");

        FS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSActionPerformed(evt);
            }
        });

        CS4.setText("Cerrar sesion");
        CS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS4ActionPerformed(evt);
            }
        });

        Busapshpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusapshpreKeyReleased(evt);
            }
        });

        Filtrosshp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        Filtrosshp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosshpItemStateChanged(evt);
            }
        });

        Busamshpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusamshpreKeyReleased(evt);
            }
        });

        jLabel8.setText("Filtros:");

        jLabel33.setText("Apellido M:");

        jLabel46.setText("Nombre(s):");

        jLabel58.setText("Detalles de pagos:");

        jLabel97.setText("Quincenas pagadas:");

        QPprest.setText("0");

        jLabel99.setText("Pagado:");

        jLabel100.setText("Pendiente:");

        PagadoPres.setText("0");

        Pendientepres.setText("0");

        Sinteres.setText("Sin interes");
        Sinteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinteresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel30)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Namepres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Zona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Mes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Appres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ampres, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(161, 161, 161)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane8)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Filtrosshp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelPrestamos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Busapshpre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Busamshpre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CS4)
                                        .addGap(0, 549, Short.MAX_VALUE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel97))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(PagadoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(QPprest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pendientepres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 814, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Agregarprestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modprestamo))
                            .addComponent(MT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Carpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(FL, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(PQ, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Sinteres)))))
                        .addGap(0, 1022, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrestamos)
                    .addComponent(Busapshpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtrosshp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busamshpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CS4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(Appres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(Ampres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Namepres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel100)
                        .addComponent(Pendientepres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel97)
                        .addComponent(QPprest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel99)
                    .addComponent(PagadoPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sinteres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(MT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Carpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(FL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregarprestamo)
                    .addComponent(modprestamo))
                .addContainerGap(396, Short.MAX_VALUE))
        );

        Prestamos.setViewportView(jPanel4);

        PestañasPrin.addTab("Registro/Modificacion", Prestamos);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        Labelfilpres.setText("Buscar por nombre:");

        FNamepres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FNamepresKeyReleased(evt);
            }
        });

        Pre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        Pre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Pre);

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        CS5.setText("Cerrar sesion");
        CS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS5ActionPerformed(evt);
            }
        });

        botonWeb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb3.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPrestamosQuin.php");

        FiltrosTP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosTP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTPItemStateChanged(evt);
            }
        });

        jLabel160.setText("Filtros:");

        FAPpres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAPpresKeyReleased(evt);
            }
        });

        FAMpres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAMpresKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 3137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel160)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Labelfilpres)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FNamepres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAPpres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAMpres, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CS5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labelfilpres)
                    .addComponent(FNamepres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(CS5)
                    .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FiltrosTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel160)
                    .addComponent(FAPpres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAMpres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        TablasPrestamos.setViewportView(jPanel5);

        PestañasPrin.addTab("Tablas de prestamos", TablasPrestamos);

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
        jScrollPane12.setViewportView(TPPRES);

        jLabel157.setText("Filtros:");

        FiltrosTPDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
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

        botonWeb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb5.setToolTipText("");
        botonWeb5.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosPrestamosQuin.php");

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
                        .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1038, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel157)
                        .addComponent(FiltrosTPDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelFPDP)
                        .addComponent(FilPDPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilPDPAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilPDPAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        TPDP.setViewportView(jPanel20);

        PestañasPrin.addTab("Tabla pagos de prestamos", TPDP);

        Menuadm.setText("Todas las ventanas");

        jMenu5.setText("Area Nomina");

        jMenu6.setText("Nomina quincenal");

        ODT1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ODT1.setText("Ordenes de taller");
        ODT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODT1ActionPerformed(evt);
            }
        });
        jMenu6.add(ODT1);

        CNQ1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CNQ1.setText("Nomina IMSS");
        CNQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNQ1ActionPerformed(evt);
            }
        });
        jMenu6.add(CNQ1);

        PRESQ1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRESQ1.setText("Prestamos");
        PRESQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESQ1ActionPerformed(evt);
            }
        });
        jMenu6.add(PRESQ1);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem8.setText("Nomina General");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem8);

        CDA1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA1.setText("Caja de ahorro");
        CDA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDA1ActionPerformed(evt);
            }
        });
        jMenu6.add(CDA1);

        jMenu5.add(jMenu6);

        jMenu7.setText("Semanal");

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem9.setText("Nomina Semanal IMSS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem10.setText("Prestamos Semanales");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem11.setText("Nomina Semanal General");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem11);

        jMenu5.add(jMenu7);

        jMenuItem12.setText("Listas de asistencia");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        Menuadm.add(jMenu5);

        jMenu8.setText("Area RH");

        General.setText("Empleados General");
        General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralActionPerformed(evt);
            }
        });
        jMenu8.add(General);

        Estadias.setText("Alumno de estadia");
        Estadias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadiasActionPerformed(evt);
            }
        });
        jMenu8.add(Estadias);

        Torteria.setText("Empleados Torteria");
        Torteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorteriaActionPerformed(evt);
            }
        });
        jMenu8.add(Torteria);

        jMenu9.setText("Semanales");

        jMenuItem13.setText("Inturbide");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuItem14.setText("Tehuantepec");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem14);

        jMenuItem15.setText("PTE titla");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem15);

        jMenu8.add(jMenu9);

        Depositos.setText("Depositos");

        jMenuItem16.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem16.setText("Depositos C/ IMSS");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        Depositos.add(jMenuItem16);

        jMenu8.add(Depositos);

        Menuadm.add(jMenu8);

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

        jMenuBar1.add(Menuadm);

        jMenu4.setText("Cambiar a:");

        jMenu10.setText("Semanal");

        Nomsem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Nomsem.setText("Nomina Semanal IMSS");
        Nomsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomsemActionPerformed(evt);
            }
        });
        jMenu10.add(Nomsem);

        NomSemGen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        NomSemGen.setText("Nomina Semanal General");
        NomSemGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomSemGenActionPerformed(evt);
            }
        });
        jMenu10.add(NomSemGen);

        PresSem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        PresSem.setText("Prestamos Semanales");
        PresSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresSemActionPerformed(evt);
            }
        });
        jMenu10.add(PresSem);

        jMenu4.add(jMenu10);

        jMenu11.setText("Nomina quincenal");

        ODT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ODT.setText("Ordenes de taller");
        ODT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODTActionPerformed(evt);
            }
        });
        jMenu11.add(ODT);

        CNQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CNQ.setText("Nomina IMSS");
        CNQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNQActionPerformed(evt);
            }
        });
        jMenu11.add(CNQ);

        NomGen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        NomGen.setText("Nomina General");
        NomGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomGenActionPerformed(evt);
            }
        });
        jMenu11.add(NomGen);

        CDA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA.setText("Caja de ahorro");
        CDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDAActionPerformed(evt);
            }
        });
        jMenu11.add(CDA);

        jMenu4.add(jMenu11);

        LDA.setText("Listas de asistencia");
        LDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LDAActionPerformed(evt);
            }
        });
        jMenu4.add(LDA);

        jMenuBar1.add(jMenu4);

        Reportes.setText("Reportes");

        jMenuItem6.setText("Reportes de nomina");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Reportes.add(jMenuItem6);

        jMenuBar1.add(Reportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 1640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InteresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_InteresItemStateChanged

        IOMTPres();
        String mt = MT.getText();
        Pendientepres.setText(mt);
    }//GEN-LAST:event_InteresItemStateChanged

    private void BEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BEKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BEKeyReleased

    private void share1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share1MouseClicked

        int seleccionar = share1.getSelectedRow();
        Appres.setText(String.valueOf(share1.getValueAt(seleccionar, 0)));
        Ampres.setText(String.valueOf(share1.getValueAt(seleccionar, 1)));
        Namepres.setText(String.valueOf(share1.getValueAt(seleccionar, 2)));
        Zona.setText(String.valueOf(share1.getValueAt(seleccionar, 3)));
        Serv.setText(String.valueOf(share1.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share1MouseClicked

    private void AgregarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarprestamoActionPerformed

        AgregarPre();
        MDP();
    }//GEN-LAST:event_AgregarprestamoActionPerformed

    private void modprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modprestamoActionPerformed

        editarpre();
        MDP();
    }//GEN-LAST:event_modprestamoActionPerformed

    private void FSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSActionPerformed

    }//GEN-LAST:event_FSActionPerformed

    private void CS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS4ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS4ActionPerformed

    private void BusapshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusapshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusapshpreKeyReleased

    private void FiltrosshpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosshpItemStateChanged

        String FSH = (String) Filtrosshp.getSelectedItem();
        if (FSH.equals("Selecciona filtro")) {
            LabelPrestamos.setVisible(false);
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();
        }
        if (FSH.equals("Apellido P")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Apellido P:");
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(true);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();
        }
        if (FSH.equals("Apellido M")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Apellido M:");
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(true);
            shareprestamo();
        }
        if (FSH.equals("Nombre(s)")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Nombre(s):");
            BE.setVisible(true);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();

        }
    }//GEN-LAST:event_FiltrosshpItemStateChanged

    private void BusamshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusamshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusamshpreKeyReleased

    private void SinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinteresActionPerformed
        IOMTPres();
    }//GEN-LAST:event_SinteresActionPerformed

    private void FNamepresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FNamepresKeyReleased

        MDP();
    }//GEN-LAST:event_FNamepresKeyReleased

    private void PreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreMouseClicked

        DefaultTableModel model = (DefaultTableModel) Pre.getModel();
        try {
            int seleccionar = Pre.getSelectedRow();
            Num.setText(String.valueOf(Pre.getValueAt(seleccionar, 0)));
            FS.setText(String.valueOf(Pre.getValueAt(seleccionar, 1)));
            String combo1 = model.getValueAt(seleccionar, 2).toString();
            for (int i = 0; i < Mes.getItemCount(); i++) {
                if (Mes.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Mes.setSelectedIndex(i);
                }
            }
            Appres.setText(String.valueOf(Pre.getValueAt(seleccionar, 3)));
            Ampres.setText(String.valueOf(Pre.getValueAt(seleccionar, 4)));
            Namepres.setText(String.valueOf(Pre.getValueAt(seleccionar, 5)));
            Zona.setText(String.valueOf(Pre.getValueAt(seleccionar, 6)));
            Serv.setText(String.valueOf(Pre.getValueAt(seleccionar, 7)));
            Cantidad.setText(String.valueOf(Pre.getValueAt(seleccionar, 8)));
            String combo2 = model.getValueAt(seleccionar, 9).toString();
            for (int i = 0; i < Interes.getItemCount(); i++) {
                if (Interes.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Interes.setSelectedIndex(i);
                }
            }
            interes.setText(String.valueOf(Pre.getValueAt(seleccionar, 10)));
            MT.setText(String.valueOf(Pre.getValueAt(seleccionar, 11)));
            PQ.setText(String.valueOf(Pre.getValueAt(seleccionar, 12)));
            Carpeta.setText(String.valueOf(Pre.getValueAt(seleccionar, 13)));
            FL.setText(String.valueOf(Pre.getValueAt(seleccionar, 14)));
            Status.setText(String.valueOf(Pre.getValueAt(seleccionar, 15)));
            Metodo.setText(String.valueOf(Pre.getValueAt(seleccionar, 16)));
            QPprest.setText(String.valueOf(Pre.getValueAt(seleccionar, 17)));
            PagadoPres.setText(String.valueOf(Pre.getValueAt(seleccionar, 18)));
            Pendientepres.setText(String.valueOf(Pre.getValueAt(seleccionar, 19)));

            int id = Integer.parseInt(Pre.getValueAt(seleccionar, 0).toString());
            String Otrointeres = interes.getText();
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from `nomina.prestamos` where idprestamos =?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {
                if (rs.getString("Interes").equals("0.0")) {
                    Sinteres.setSelected(true);

                } else if (rs.getString("Interes").equals(Otrointeres)) {
                    Sinteres.setSelected(false);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }
    }//GEN-LAST:event_PreMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        eliminarpre();
        MDP();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS5ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS5ActionPerformed

    private void FiltrosTPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTPItemStateChanged

        String FTP = (String) FiltrosTP.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            Labelfilpres.setVisible(false);
            FNamepres.setVisible(false);
            FNamepres.setText("");
            FAPpres.setText("");
            FAPpres.setVisible(false);
            FAMpres.setText("");
            FAMpres.setVisible(false);
            MDP();
        }
        if (FTP.equals("Apellido P")) {
            Labelfilpres.setVisible(true);
            Labelfilpres.setText("Buscar por Apellido P:");
            FNamepres.setVisible(false);
            FNamepres.setText("");
            FAPpres.setText("");
            FAPpres.setVisible(true);
            FAMpres.setText("");
            FAMpres.setVisible(false);
            MDP();
        }
        if (FTP.equals("Apellido M")) {
            Labelfilpres.setVisible(true);
            Labelfilpres.setText("Buscar por Apellido M:");
            FNamepres.setVisible(false);
            FNamepres.setText("");
            FAPpres.setText("");
            FAPpres.setVisible(false);
            FAMpres.setText("");
            FAMpres.setVisible(true);
            MDP();
        }
        if (FTP.equals("Nombre(s)")) {
            Labelfilpres.setVisible(true);
            Labelfilpres.setText("Buscar por Nombre(s):");
            FNamepres.setVisible(true);
            FNamepres.setText("");
            FAPpres.setText("");
            FAPpres.setVisible(false);
            FAMpres.setText("");
            FAMpres.setVisible(false);
            MDP();

        }
    }//GEN-LAST:event_FiltrosTPItemStateChanged

    private void FAPpresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAPpresKeyReleased
        MDP();
    }//GEN-LAST:event_FAPpresKeyReleased

    private void FAMpresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAMpresKeyReleased
        MDP();
    }//GEN-LAST:event_FAMpresKeyReleased

    private void FiltrosTPDPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTPDPItemStateChanged
        String FTP = (String) FiltrosTPDP.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
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

    private void MTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MTKeyReleased
        String mt = MT.getText();
        Pendientepres.setText(mt);
    }//GEN-LAST:event_MTKeyReleased

    private void ODT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODT1ActionPerformed
        ODTQ_5 regr = new ODTQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODT1ActionPerformed

    private void CNQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNQ1ActionPerformed
        NominaQ_5 regr = new NominaQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CNQ1ActionPerformed

    private void PRESQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESQ1ActionPerformed
        PresQ_5 regr = new PresQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PRESQ1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void CDA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA1ActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDA1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        NominaS_5 regr = new NominaS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        PresS_5 regr = new PresS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        NominaS_simss_5 regr = new NominaS_simss_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Listas_5 regr = new Listas_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

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

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Inturbide_4 regr = new Inturbide_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        Tehueantepec_4 regr = new Tehueantepec_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        PT_4 regr = new PT_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        Depositos_4 regr = new Depositos_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void ZYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZYSActionPerformed
        AltasZyS_3 regr = new AltasZyS_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZYSActionPerformed

    private void NomsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomsemActionPerformed
        NominaS_5 regr = new NominaS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NomsemActionPerformed

    private void NomSemGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomSemGenActionPerformed
        NominaS_simss_5 regr = new NominaS_simss_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NomSemGenActionPerformed

    private void PresSemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PresSemActionPerformed
        PresS_5 regr = new PresS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PresSemActionPerformed

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

    private void NomGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomGenActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NomGenActionPerformed

    private void LDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LDAActionPerformed
        Listas_5 regr = new Listas_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LDAActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RepNom_7 regr = new RepNom_7(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void CDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDAActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDAActionPerformed

    private void ADMV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMV2ActionPerformed
        VentanaADM_3 regr = new VentanaADM_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMV2ActionPerformed

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
            java.util.logging.Logger.getLogger(PresQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PresQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PresQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PresQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PresQ_5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ADMV2;
    private javax.swing.JButton Agregarprestamo;
    private javax.swing.JTextField Ampres;
    private javax.swing.JTextField Appres;
    private javax.swing.JTextField BE;
    private javax.swing.JTextField Busamshpre;
    private javax.swing.JTextField Busapshpre;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA1;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JMenuItem CNQ1;
    private javax.swing.JButton CS4;
    private javax.swing.JButton CS5;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Carpeta;
    private javax.swing.JMenu Depositos;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JTextField FAMpres;
    private javax.swing.JTextField FAPpres;
    private javax.swing.JTextField FL;
    private javax.swing.JTextField FNamepres;
    private javax.swing.JTextField FS;
    private javax.swing.JTextField FilPDPAm;
    private javax.swing.JTextField FilPDPAp;
    private javax.swing.JTextField FilPDPname;
    private javax.swing.JComboBox<String> FiltrosTP;
    private javax.swing.JComboBox<String> FiltrosTPDP;
    private javax.swing.JComboBox<String> Filtrosshp;
    private javax.swing.JMenuItem General;
    private javax.swing.JComboBox<String> Interes;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JLabel LabelFPDP;
    private javax.swing.JLabel LabelPrestamos;
    private javax.swing.JLabel Labelfilpres;
    private javax.swing.JTextField MT;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextField Metodo;
    private javax.swing.JTextField Namepres;
    private javax.swing.JMenuItem NomGen;
    private javax.swing.JMenuItem NomSemGen;
    private javax.swing.JMenuItem Nomsem;
    private javax.swing.JTextField Num;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT1;
    private javax.swing.JTextField PQ;
    private javax.swing.JMenuItem PRESQ1;
    private javax.swing.JTextField PagadoPres;
    private javax.swing.JTextField Pendientepres;
    private javax.swing.JTabbedPane PestañasPrin;
    private javax.swing.JTable Pre;
    private javax.swing.JMenuItem PresSem;
    private javax.swing.JScrollPane Prestamos;
    private javax.swing.JTextField QPprest;
    private javax.swing.JMenu Reportes;
    private javax.swing.JTextField Serv;
    private javax.swing.JCheckBox Sinteres;
    private javax.swing.JTextField Status;
    private javax.swing.JScrollPane TPDP;
    private javax.swing.JTable TPPRES;
    private javax.swing.JScrollPane TablasPrestamos;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zona;
    private botones.BotonWeb botonWeb3;
    private botones.BotonWeb botonWeb5;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel30;
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
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JButton modprestamo;
    private javax.swing.JTable share1;
    // End of variables declaration//GEN-END:variables
}
