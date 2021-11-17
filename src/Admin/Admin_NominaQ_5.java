package Admin;

import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import Inicio.Login_2;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
 */
public final class Admin_NominaQ_5 extends javax.swing.JFrame {

    int a = 1;
    int Pa = 10;
    int b = 15;
    int c = 20;
    int D = 25;
    int e = 2;
    int f = 4;
    int g = 6;
    int h = 8;
    ButtonGroup IAT;
    ButtonGroup DAB;
    int Q01 = 1;
    int Q02 = 2;
    int Q03 = 3;
    int Q04 = 4;
    int Q05 = 5;
    int Q06 = 6;
    int Q07 = 7;
    int Q08 = 8;
    int Q09 = 9;
    int Q010 = 10;
    int Q011 = 11;
    int Q012 = 12;
    int Q013 = 13;
    int Q014 = 14;
    int Q015 = 15;
    int Q016 = 16;
    int Q017 = 17;
    int Q018 = 18;
    int Q019 = 19;
    int Q020 = 20;
    int Q021 = 21;
    int Q022 = 22;
    int Q023 = 23;
    int Q024 = 24;
    double dd, in, dv;
    double dd2, in2, dv2;
    double dd3, in3, dv3;
    double dd4, in4, dv4;
    double dd5, in5, dv5;
    double dd6, in6, dv6;
    double dd7, in7, dv7;
    double dd8, in8, dv8;
    double dd9, in9, dv9;
    double dd10, in10, dv10;
    double dd11, in11, dv11;
    double dd12, in12, dv12;
    double dd13, in13, dv13;
    double dd14, in14, dv14;
    double dd15, in15, dv15;
    double dd16, in16, dv16;

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    public Admin_NominaQ_5() {
        initComponents();
        LabelPrestamos.setVisible(false);
        BE.setVisible(false);
        BE.setText("");
        Busapshpre.setText("");
        Busapshpre.setVisible(false);
        Busamshpre.setText("");
        Busamshpre.setVisible(false);
        LabelPrestamos1.setVisible(false);
        BE1.setVisible(false);
        BE1.setText("");
        Busapshpre1.setText("");
        Busapshpre1.setVisible(false);
        Busamshpre1.setText("");
        Busamshpre1.setVisible(false);
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FiltroZnomina.setModel(modelzonas);
        FiltrosZonas FZP = new FiltrosZonas();
        DefaultComboBoxModel modelFZP = new DefaultComboBoxModel(FZP.mostrarzonas());
        FiltroZP.setModel(modelFZP);
        FiltrosZonas FSZP = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP = new DefaultComboBoxModel(FSZP.mostrarzonas());
        FiltroSZP.setModel(modelFSZP);
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        FZservicio.setModel(MODELFZS);
        año.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        shareprestamo();
        shareN();
        sharetp();
        mostrarpagos();
        Bono.setVisible(false);
        MDP();
        IAT = new ButtonGroup();
        IAT.add(Si);
        IAT.add(no);
        DAB = new ButtonGroup();
        DAB.add(Bsi);
        DAB.add(Bno);
        MDT();
        LabelBE.setVisible(false);
        LabelBQ.setVisible(false);
        LabelBS.setVisible(false);
        LabelBZ.setVisible(false);
        LabelSZ.setVisible(false);
        Nominab.setText("");
        Nominab.setVisible(false);
        FiltroZnomina.setVisible(false);
        FiltroZnomina.setSelectedIndex(0);
        FiltroSnomina.setVisible(false);
        FiltroSnomina.setSelectedIndex(0);
        FZservicio.setVisible(false);
        FZservicio.setSelectedIndex(0);
        FiltroQuincenanomina.setVisible(false);
        FiltroQuincenanomina.setSelectedIndex(0);
        FiltroNDF.setVisible(false);
        LabelBNDF.setVisible(false);
        busp.setVisible(false);
        LabelBEP.setVisible(false);
        FiltroQP.setVisible(false);
        FiltroServP.setVisible(false);
        FiltroZP.setVisible(false);
        FiltroSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelBQP.setVisible(false);
        LabelBSP.setVisible(false);
        LabelSZP.setVisible(false);
        LabelNDFP.setVisible(false);
        LabelBZP.setVisible(false);
        Filtro1.setVisible(false);
        Filtro1.setText("");
        BNameNom.setVisible(false);
        BNameNom.setText("");
        BAPNom.setText("");
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        BAMNom.setText("");
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        Labelcda.setVisible(false);
        Busnamecdash.setVisible(false);
        BusAPcdash.setVisible(false);
        BusAMcdash.setVisible(false);
        Labelfilpres.setVisible(false);
        FNamepres.setVisible(false);
        FAPpres.setVisible(false);
        FAMpres.setVisible(false);
        LabelFPDP.setVisible(false);
        FilPDPname.setVisible(false);
        FilPDPAp.setVisible(false);
        FilPDPAm.setVisible(false);
        Labelfilodt.setVisible(false);
        Fnameodt.setVisible(false);
        FilApodt.setVisible(false);
        FilAmodt.setVisible(false);
        Labelfilcda.setVisible(false);
        BusnameCDA.setVisible(false);
        FilAPCDA.setVisible(false);
        FillAMCDA.setVisible(false);
        labelpcda.setVisible(false);
        FilnamePCDA.setVisible(false);
        FilAPPCDA.setVisible(false);
        FilAMPCDA.setVisible(false);
        LabelfilPODT.setVisible(false);
        FilnamePODT.setVisible(false);
        FilApPODT.setVisible(false);
        FilAmPODT.setVisible(false);
        sharecda();
        setIconImage(new ImageIcon(Admin_NominaQ_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        MDCDA();
        sumaTA();
        sharecdanom();
        sharepresnom();
        shareODTnom();
        MDN();
        MDTPCDA();
        MDTPODT();
        MDTPPres();

    }

    @SuppressWarnings("unchecked")

    public void IOMTPres() {
        double inter = 0, Quincenasint = 0;

        String dt = (String) Interes.getSelectedItem();
        if (dt.equals(".")) {
            inter = 0;
            Quincenasint = 0;
        }
        if (dt.equals("2 Quincenas 10%")) {
            inter = 10;
            Quincenasint = 2;
        }
        if (dt.equals("3 Quincenas 15%")) {
            inter = 15;
            Quincenasint = 3;
        }
        if (dt.equals("4 Quincenas 15%")) {
            inter = 15;
            Quincenasint = 4;
        }
        if (dt.equals("5 Quincenas 20%")) {
            inter = 20;
            Quincenasint = 5;
        }
        if (dt.equals("6 Quincenas 20%")) {
            inter = 20;
            Quincenasint = 6;
        }
        if (dt.equals("7 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 7;
        }
        if (dt.equals("8 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 8;
        }
        if (dt.equals("9 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 9;
        }
        if (dt.equals("10 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 10;
        }
        if (dt.equals("11 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 11;
        }
        if (dt.equals("12 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 12;
        }
        if (dt.equals("13 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 13;
        }
        if (dt.equals("14 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 14;
        }
        if (dt.equals("15 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 15;
        }
        if (dt.equals("16 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 16;
        }
        if (dt.equals("17 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 17;
        }
        if (dt.equals("18 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 18;
        }
        if (dt.equals("19 Quincenas 25%")) {
            inter = 25;
            Quincenasint = 19;
        }
        if (dt.equals("20 Quincenas 25%")) {
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

    //Agregar pago Pres
    public void AgregarPagoPres() {

        String SQL = "INSERT INTO `nomina.pagos.prestamos` (`#Folio`, `#Lista`, `#prestamo`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Quincena`, `# quincena`, `pagado`, `pendiente`, "
                + "`Pago de prestamo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setInt(3, Integer.parseInt(NumPrenom.getText()));
            pst.setInt(4, Integer.parseInt(NEnom.getText()));
            pst.setString(5, Ap.getText());
            pst.setString(6, am.getText());
            pst.setString(7, name.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, ServN.getText());
            pst.setString(10, Quincenas.getSelectedItem().toString());
            pst.setString(11, NQprenom.getText());
            pst.setString(12, Pagadoprenom.getText());
            pst.setString(13, Pendienteprenom.getText());
            pst.setString(14, Presp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de prestamo registrado");

        } catch (HeadlessException | SQLException Error_PdPrestamo) {
            JOptionPane.showMessageDialog(null, "Error al registrar pago de prestamo: " + Error_PdPrestamo.getMessage());
        }
    }

    //mostrar pagos Pres
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

    //Agregar pago ODT
    public void AgregarPagoODT() {

        String SQL = "INSERT INTO `nomina.pagos.odt` (`#Folio`, `#Lista`, `# de orden`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Quincena`, `# quincena`, `pagado`, `pendiente`, "
                + "`Pago de odt`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setInt(3, Integer.parseInt(NODTnom.getText()));
            pst.setInt(4, Integer.parseInt(NEnom.getText()));
            pst.setString(5, Ap.getText());
            pst.setString(6, am.getText());
            pst.setString(7, name.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, ServN.getText());
            pst.setString(10, Quincenas.getSelectedItem().toString());
            pst.setString(11, NQODTnom.getText());
            pst.setString(12, PagODTnom.getText());
            pst.setString(13, PenODTnom.getText());
            pst.setString(14, Odtp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de orden agregado");

        } catch (HeadlessException | SQLException error_agregar_pdodt) {
            JOptionPane.showMessageDialog(null, "Error al agregar pago de orden: " + error_agregar_pdodt.getMessage());
        }
    }

    //mostrar pagos ODT
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

    //mod pagos cda
    public void MODPAGOCDA() {

        String SQL = "UPDATE `nomina.pagos.cda` SET `Observaciones` = ?, `# de recibo de pago`"
                + " = ? WHERE `nomina.pagos.cda`.`#Folio` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, obdpagocda.getText());
            pst.setString(2, NREcda.getText());
            pst.setInt(3, Integer.parseInt(NFpagocda.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de caja de ahorro modificado.");

        } catch (HeadlessException | SQLException error_mod_pcda) {
            JOptionPane.showMessageDialog(null, "Error al modificar pago de caja de ahorro: " + error_mod_pcda.getMessage());
        }
    }

//mostrar datos pagos cda
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
            int[] anchos = {/*ND*/50, /*NL*/ 50, /*NC*/ 50, /*NE*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*ZON*/ 50,
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
//Agregar pago CDA

    public void AgregarPagoCDA() {

        String SQL = "INSERT INTO `nomina.pagos.cda` (`#Folio`, `#Lista`, `#caja`, `#empleado`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Quincena`, `Caja de ahorro`,"
                + " `Observaciones`, `Qnas aportadas`, `# de recibo de pago`) VALUES (?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setInt(3, Integer.parseInt(NCDANom.getText()));
            pst.setInt(4, Integer.parseInt(NEnom.getText()));
            pst.setString(5, Ap.getText());
            pst.setString(6, am.getText());
            pst.setString(7, name.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, ServN.getText());
            pst.setString(10, Quincenas.getSelectedItem().toString());
            pst.setString(11, cda.getText());
            pst.setString(12, obdpagocda.getText());
            pst.setString(13, QAcdanom.getText());
            pst.setString(14, NREcda.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de caja de ahorro agregado");

        } catch (HeadlessException | SQLException error_add_pdcda) {
            JOptionPane.showMessageDialog(null, "Error al agregar pago de caja de ahorro: " + error_add_pdcda.getMessage());
        }
    }

//auto ODT
    public void PagoODT() {
        String Otropagoodt = PenODTnom.getText();

        if (Otropagoodt.equals("0.0")) {
            String SQL = "UPDATE `taller` SET `Status` = 'Pagado', `Quincenas pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `taller`.`idTaller` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, NQprenom.getText());
                pst.setString(2, Pagadoprenom.getText());
                pst.setString(3, Pendienteprenom.getText());
                pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de taller agregado.");

            } catch (HeadlessException | SQLException error_auto_odt) {
                JOptionPane.showMessageDialog(null, "Error al abonar orden de taller: " + error_auto_odt.getMessage());
            }
        } else if (Otropagoodt.equals(PenODTnom.getText())) {
            String SQL = "UPDATE `taller` SET `Status` = 'Debe', `Pagado` = ?, `Pendiente` = ?, "
                    + "`Quincenas pagadas` = ? WHERE `taller`.`idTaller` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, PagODTnom.getText());
                pst.setString(2, PenODTnom.getText());
                pst.setString(3, NQODTnom.getText());
                pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de orden de taller agregado.");

            } catch (HeadlessException | SQLException error_auto_odt) {
                JOptionPane.showMessageDialog(null, "Error al abonar orden de taller: " + error_auto_odt.getMessage());
            }
        }

    }

    public void shareODTnom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Por quincenas`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `taller`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincenas`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `taller`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Por quincenas`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `taller`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Por quincenas`,"
                    + " `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `taller`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%' AND `Status` LIKE '%Debe%' ";
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
            SHODTnom.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Orden");
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Pago por Qna");
            modelo.addColumn("Qnas pagadas");//6
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//8

//ANCHOS
            int[] anchos = {/*NP*/50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*PPQ*/ 50,
                /*QP*/ 50, /*PAG*/ 60, /*PEN*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                SHODTnom.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_odt) {
            JOptionPane.showMessageDialog(null, "Error al compartir ordenes de taller con nomina: " + error_sh_odt.getMessage());

        }

    }

//AUTO PRES
    public void Pagopres() {
        String otroprestamo = Pendienteprenom.getText();

        if (otroprestamo.equals("0.0")) {
            String SQL = "UPDATE `prestamos` SET `Status` = 'Pagado', `Quincenas pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `prestamos`.`idprestamos` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, NQprenom.getText());
                pst.setString(2, Pagadoprenom.getText());
                pst.setString(3, Pendienteprenom.getText());
                pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de prestamo agregado.");

            } catch (HeadlessException | SQLException error_auto_pres) {
                JOptionPane.showMessageDialog(null, "Error al abonar prestamo: " + error_auto_pres.getMessage());
            }
        } else if (otroprestamo.equals(Pendienteprenom.getText())) {

            String SQL = "UPDATE `prestamos` SET `Status` = 'Debe', `Quincenas pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `prestamos`.`idprestamos` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, NQprenom.getText());
                pst.setString(2, Pagadoprenom.getText());
                pst.setString(3, Pendienteprenom.getText());
                pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de prestamo agregado.");

            } catch (HeadlessException | SQLException error_auto_pres) {
                JOptionPane.showMessageDialog(null, "Error al abonar prestamo: " + error_auto_pres.getMessage());
            }
        }

    }

    public void sharepresnom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `prestamos`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `prestamos`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `prestamos`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `prestamos`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%' AND `Status` LIKE '%Debe%'";
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
            SHPresnom.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Prestamo");
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Pago por Qna");
            modelo.addColumn("Qnas pagadas");//6
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//8

//ANCHOS
            int[] anchos = {/*NP*/50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*PPQ*/ 50,
                /*QP*/ 50, /*PAG*/ 60, /*PEN*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                SHPresnom.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_pre_nom) {
            JOptionPane.showMessageDialog(null, "Error al compartir prestamos con nomina: " + error_sh_pre_nom.getMessage());

        }

    }
//AUTO CDA

    public void editarCDAdnom() {

        String SQL = "UPDATE `nomina.cajadeahorro` SET "
                + " `Quincenas Ahorradas` = ?, `Total Ahorrado` = ? WHERE `nomina.cajadeahorro`.`#caja` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, QAcdanom.getText());
            pst.setString(2, TACDANOM.getText());
            pst.setInt(3, Integer.parseInt(NCDANom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Abono de caja de ahorro agregado");

        } catch (HeadlessException | SQLException error_auto_cda) {
            JOptionPane.showMessageDialog(null, "Error al abonar Caja de ahorro: " + error_auto_cda.getMessage());
        }
    }

    public void sharecdanom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Ahorro por quincena`, `Quincenas Ahorradas`, `Total Ahorrado` "
                + " FROM `nomina.cajadeahorro`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Ahorro por quincena`, `Quincenas Ahorradas`, `Total Ahorrado`"
                    + "  FROM `nomina.cajadeahorro`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Ahorro por quincena`, `Quincenas Ahorradas`, `Total Ahorrado` "
                    + " FROM `nomina.cajadeahorro`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Ahorro por quincena`, `Quincenas Ahorradas`, `Total Ahorrado` "
                    + " FROM `nomina.cajadeahorro`"
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
            SHCDAnom.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Caja");
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Ahorro por Qna");
            modelo.addColumn("Qnas ahorradas");//6
            modelo.addColumn("Total ahorrado");

//ANCHOS
            int[] anchos = {/*NF*/50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*APQ*/ 50,
                /*QA*/ 50, /*TA*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                SHCDAnom.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_cda_nom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir datos de caja de ahorro en nomina: " + error_sh_cda_nom.getMessage());

        }

    }

//Suma de total ahorrado 
    public void sumaTA() {
        double t = 0;
        double p = 0;
        if (Tablacda.getRowCount() > 0) {
            for (int i = 0; i < Tablacda.getRowCount(); i++) {
                p = Double.parseDouble(Tablacda.getValueAt(i, 9).toString());
                t += p;
            }
            TELC.setText("" + t);
        } else {

        }
    }

    //Editar CDA
    public void editarCDA() {

        String SQL = "UPDATE `nomina.cajadeahorro` SET `#caja` = ?,"
                + " `#exp_Empleado` = ?, `Apellido P` = ?, `Apellido M` = ?,"
                + " `Nombre(s)` = ?, `Zona` = ?, `Servicio` = ?, "
                + "`Ahorro por quincena` = ?, `Quincenas Ahorradas` = ?,"
                + " `Total Ahorrado` = ?, `caja anticipada` = ?, `total a pagar` = ?, "
                + "`% interes` = ?, `interes a pagar` = ?, `Por final pagar` = ?, "
                + "`Status` = ?, `Observacion 1` = ?, `Observaciones` = ? WHERE "
                + "`nomina.cajadeahorro`.`#caja` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Numcda.getText()));
            pst.setInt(2, Integer.parseInt(numEcda.getText()));
            pst.setString(3, APcda.getText());
            pst.setString(4, AMcda.getText());
            pst.setString(5, namecda.getText());
            pst.setString(6, zonacda.getText());
            pst.setString(7, servcda.getText());
            pst.setString(8, APQ.getText());
            pst.setString(9, QAdas.getText());
            pst.setString(10, TArrado.getText());
            pst.setString(11, CajaA.getText());
            pst.setString(12, Totalap.getText());
            pst.setString(13, PorcenIn.getText());
            pst.setString(14, IAP.getText());
            pst.setString(15, PPF.getText());
            pst.setString(16, Statuscda.getSelectedItem().toString());
            pst.setString(17, Obs1cda.getSelectedItem().toString());
            pst.setString(18, Obscda.getText());
            pst.setInt(19, Integer.parseInt(Numcda.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Caja de ahorro Modificada");

        } catch (HeadlessException | SQLException error_mod_cda) {
            JOptionPane.showMessageDialog(null, "Error modificar Caja de ahorro: " + error_mod_cda.getMessage());
        }
    }

    //agregar caja de ahorro
    public void AgregarCDA() {

        String SQL = "INSERT INTO `nomina.cajadeahorro` (`#caja`, `#exp_Empleado`,"
                + " `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`,"
                + " `Ahorro por quincena`, `Quincenas Ahorradas`, `Total Ahorrado`,"
                + " `caja anticipada`, `total a pagar`, `% interes`, `interes a pagar`,"
                + " `Por final pagar`, `Status`, `Observacion 1`, `Observaciones`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Numcda.getText()));
            pst.setInt(2, Integer.parseInt(numEcda.getText()));
            pst.setString(3, APcda.getText());
            pst.setString(4, AMcda.getText());
            pst.setString(5, namecda.getText());
            pst.setString(6, zonacda.getText());
            pst.setString(7, servcda.getText());
            pst.setString(8, APQ.getText());
            pst.setString(9, QAdas.getText());
            pst.setString(10, TArrado.getText());
            pst.setString(11, CajaA.getText());
            pst.setString(12, Totalap.getText());
            pst.setString(13, PorcenIn.getText());
            pst.setString(14, IAP.getText());
            pst.setString(15, PPF.getText());
            pst.setString(16, Statuscda.getSelectedItem().toString());
            pst.setString(17, Obs1cda.getSelectedItem().toString());
            pst.setString(18, Obscda.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Caja de ahorro Agregada");

        } catch (HeadlessException | SQLException error_add_cda) {
            JOptionPane.showMessageDialog(null, "Error al agregar Caja de ahorro: " + error_add_cda.getMessage());
        }
    }

    //mostrar datos caja de ahorro
    public void MDCDA() {
        //Buscar empleado
        String Share = BusnameCDA.getText();
        String ShareAP = FilAPCDA.getText();
        String ShareAM = FillAMCDA.getText();
        String where = "select * from `nomina.cajadeahorro`";

        if (!"".equals(Share)) {
            where = " select * from `nomina.cajadeahorro` WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select * from `nomina.cajadeahorro` WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * from `nomina.cajadeahorro` WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
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
            Tablacda.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Caja");//1
            modelo.addColumn("# Empleado");//
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//5
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//7
            modelo.addColumn("Ahorro por quincena");
            modelo.addColumn("Quincenas Ahorradas");//9
            modelo.addColumn("Total Ahorrado");
            modelo.addColumn("caja anticipada");//11
            modelo.addColumn("total a pagar");
            modelo.addColumn("% interes");//13
            modelo.addColumn("interes a pagar");
            modelo.addColumn("Por final pagar");//15
            modelo.addColumn("Status");
            modelo.addColumn("Observacion 1");//17
            modelo.addColumn("Observaciones");
//Anchos
            int[] anchos = {/*ndf*/35, /*nde*/ 35, /*ap*/ 55, /*am*/ 55, /*nom*/ 150,
                /*Zon*/ 60, /*serv*/ 75, /*APQ*/ 60, /*QA*/ 60, /*TA*/ 60, /*CA*/ 60,
                /*TAP*/ 50, /*PINT*/ 50, /*IAP*/ 55, /*PFP*/ 60, /*Status*/ 60, /*OBS1*/ 60,
                /*obs*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tablacda.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_md_cda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de caja de ahorro: " + error_md_cda.getMessage());

        }

    }

    //compartr con caja de ahorro
    public void sharecda() {
        //Buscar empleado
        String Share = Busnamecdash.getText();
        String ShareAP = BusAPcdash.getText();
        String ShareAM = BusAMcdash.getText();
        String where = "select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Zona`, `Servicio` from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                    + " `Servicio` from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                    + " `Servicio` from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                    + " `Servicio` from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
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
            ShareCDA.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//6

//Anchos
            int[] anchos = {25, 50, 50, 150, 40, 75};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                ShareCDA.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_cda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con caja de ahorro: " + error_sh_cda.getMessage());

        }

    }

    //limpiar cda
    public void limpiarcda() {
        Numcda.setText("0");
        numEcda.setText("0");
        APcda.setText("");
        AMcda.setText("");
        namecda.setText("");
        zonacda.setText("");
        servcda.setText("");
        APQ.setText("0");
        QAdas.setText("0");
        TArrado.setText("0");
        CajaA.setText("0");
        Totalap.setText("0");
        PorcenIn.setText("0");
        IAP.setText("0");
        PPF.setText("0");
        Obscda.setText("");
        Statuscda.setSelectedIndex(0);
        Obs1cda.setSelectedIndex(0);
        CalIn.setSelected(false);
    }

    //limpiar nomina
    public void limpiarnom() {
        DAB.clearSelection();
        NQprenom.setText("0");
        AdN.setText("0");
        QAcdanom.setText("0");
        NODTnom.setText("0");
        NCDANom.setText("0");
        NCDANom.setText("0");
        NFnom.setText("0");
        NDL.setText("");
        NEnom.setText("0");
        NEnom.setText("0");
        Ap.setText("");
        am.setText("");
        name.setText("");
        Bono.setText("0");
        Bono1.setText("0");
        cta.setText("");
        ban.setText("");
        Zon.setText("");
        ServN.setText("");
        sueldo.setText("0");
        pd.setText("0");
        Fdb.setText("0");
        Fde.setText("0");
        Bp.setText("0");
        Sancion.setText("0");
        Grua.setText("0");
        Playera.setText("0");
        Chamarra.setText("0");
        Pantalon.setText("0");
        Corbata.setText("0");
        Chaleco.setText("0");
        Credencial.setText("0");
        DVT.setText("0");
        apy.setText("0");
        Lugar.setText("");
        DI.setText("26.98");
        cda.setText("0");
        Presp.setText("0");
        obs.setText("");
        ADD.setText("0");
        Rembolso.setText("0");
        deposito.setText("0");
        Odtp.setText("0");
        NumPrenom.setText("0");
        NQprenom.setText("0");
        Pagadoprenom.setText("0");
        Pendienteprenom.setText("0");
        TACDANOM.setText("0");
        NODTnom.setText("0");
        NQODTnom.setText("0");
        PagODTnom.setText("0");
        PenODTnom.setText("0");
        QAcdanom.setText("0");
        Dia1.setSelectedIndex(0);
        DIa2.setSelectedIndex(0);
        Dia3.setSelectedIndex(0);
        Dia4.setSelectedIndex(0);
        Dia5.setSelectedIndex(0);
        Dia6.setSelectedIndex(0);
        Dia7.setSelectedIndex(0);
        Dia8.setSelectedIndex(0);
        Dia9.setSelectedIndex(0);
        Dia10.setSelectedIndex(0);
        Dia11.setSelectedIndex(0);
        Dia12.setSelectedIndex(0);
        Dia13.setSelectedIndex(0);
        Dia14.setSelectedIndex(0);
        Dia15.setSelectedIndex(0);
        Dia16.setSelectedIndex(0);

    }
//Descuentos varios

    public void desv() {
        double desv1 = Double.parseDouble(this.Fdb.getText());
        double desv2 = Double.parseDouble(this.Fde.getText());
        double desv3 = Double.parseDouble(this.Bp.getText());
        double desv4 = Double.parseDouble(this.Sancion.getText());
        double desv5 = Double.parseDouble(this.Grua.getText());
        double desv6 = Double.parseDouble(this.Playera.getText());
        double desv7 = Double.parseDouble(this.Chamarra.getText());
        double desv8 = Double.parseDouble(this.Corbata.getText());
        double desv9 = Double.parseDouble(this.Pantalon.getText());
        double desv10 = Double.parseDouble(this.Chaleco.getText());
        double desv11 = Double.parseDouble(this.Credencial.getText());
        double desv12 = Double.parseDouble(this.AdN.getText());

        double total = desv1 + desv2 + desv3 + desv4 + desv5 + desv6 + desv7
                + desv8 + desv9 + desv10 + desv11 + desv12;
        this.DVT.setText("" + total + "");
    }

//Compartir con talleres
    public void sharetp() {
        //Buscar empleado
        String Share = BE1.getText();
        String ShareAP = Busapshpre1.getText();
        String ShareAM = Busamshpre1.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
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
            share2.setModel(modelo);
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
                share2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_odt) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con orden de taller: " + error_sh_odt.getMessage());

        }

    }
//compartir con prestamos

    public void shareprestamo() {
        //Buscar empleado
        String Share = BE.getText();
        String ShareAP = Busapshpre.getText();
        String ShareAM = Busamshpre.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
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

//descanso sin gose de sueldo
    public void DSGS() {
        double dsgs = Double.parseDouble(this.DSGS1.getText());
        double dsgs2 = Double.parseDouble(this.DSGS2.getText());
        double dsgs3 = Double.parseDouble(this.DSGS3.getText());
        double dsgs4 = Double.parseDouble(this.DSGS4.getText());
        double dsgs5 = Double.parseDouble(this.DSGS5.getText());
        double dsgs6 = Double.parseDouble(this.DSGS6.getText());
        double dsgs7 = Double.parseDouble(this.DSGS7.getText());
        double dsgs8 = Double.parseDouble(this.DSGS8.getText());
        double dsgs9 = Double.parseDouble(this.DSGS9.getText());
        double dsgs10 = Double.parseDouble(this.DSGS10.getText());
        double dsgs11 = Double.parseDouble(this.DSGS11.getText());
        double dsgs12 = Double.parseDouble(this.DSGS12.getText());
        double dsgs13 = Double.parseDouble(this.DSGS13.getText());
        double dsgs14 = Double.parseDouble(this.DSGS14.getText());
        double dsgs15 = Double.parseDouble(this.DSGS15.getText());
        double dsgs16 = Double.parseDouble(this.DSGS16.getText());

        double total = dsgs + dsgs2 + dsgs3 + dsgs4 + dsgs5 + dsgs6 + dsgs7 + dsgs8 + dsgs9 + dsgs10 + dsgs11 + dsgs12 + dsgs13 + dsgs14 + dsgs15 + dsgs16;
        this.DSGS.setText("" + total + "");
    }
// Dia laborado

    public void DL() {
        int D1 = Integer.parseInt(DL1.getText());
        int D2 = Integer.parseInt(DL2.getText());
        int D3 = Integer.parseInt(DL3.getText());
        int D4 = Integer.parseInt(DL4.getText());
        int D5 = Integer.parseInt(DL5.getText());
        int D6 = Integer.parseInt(DL6.getText());
        int D7 = Integer.parseInt(DL7.getText());
        int D8 = Integer.parseInt(DL8.getText());
        int D9 = Integer.parseInt(DL9.getText());
        int D10 = Integer.parseInt(DL10.getText());
        int D11 = Integer.parseInt(DL11.getText());
        int D12 = Integer.parseInt(DL12.getText());
        int D13 = Integer.parseInt(DL13.getText());
        int D14 = Integer.parseInt(DL14.getText());
        int D15 = Integer.parseInt(DL15.getText());
        int D16 = Integer.parseInt(DL16.getText());
        double total = D1 + D2 + D3 + D4 + D5 + D6 + D7 + D8 + D9 + D10 + D11 + D12 + D13 + D14 + D15 + D16;
        DL.setText("" + total + "");

    }
//descanso trabajado

    public void DT() {
        double DEST1 = Double.parseDouble(this.dt1.getText());
        double DEST2 = Double.parseDouble(this.dt2.getText());
        double DEST3 = Double.parseDouble(this.dt3.getText());
        double DEST4 = Double.parseDouble(this.dt4.getText());
        double DEST5 = Double.parseDouble(this.dt5.getText());
        double DEST6 = Double.parseDouble(this.dt6.getText());
        double DEST7 = Double.parseDouble(this.dt7.getText());
        double DEST8 = Double.parseDouble(this.dt8.getText());
        double DEST9 = Double.parseDouble(this.dt9.getText());
        double DEST10 = Double.parseDouble(this.dt10.getText());
        double DEST11 = Double.parseDouble(this.dt11.getText());
        double DEST12 = Double.parseDouble(this.dt12.getText());
        double DEST13 = Double.parseDouble(this.dt13.getText());
        double DEST14 = Double.parseDouble(this.dt14.getText());
        double DEST15 = Double.parseDouble(this.dt15.getText());
        double DEST16 = Double.parseDouble(this.dt16.getText());

        double total = DEST1 + DEST2 + DEST3 + DEST4 + DEST5 + DEST6 + DEST7 + DEST8 + DEST9 + DEST10 + DEST11 + DEST12 + DEST13 + DEST14 + DEST15 + DEST16;
        this.dt.setText("" + total + "");
    }
//falta

    public void F() {
        double Fal1 = Double.parseDouble(this.F1.getText());
        double Fal2 = Double.parseDouble(this.F2.getText());
        double Fal3 = Double.parseDouble(this.F3.getText());
        double Fal4 = Double.parseDouble(this.F4.getText());
        double Fal5 = Double.parseDouble(this.F5.getText());
        double Fal6 = Double.parseDouble(this.F6.getText());
        double Fal7 = Double.parseDouble(this.F7.getText());
        double Fal8 = Double.parseDouble(this.F8.getText());
        double Fal9 = Double.parseDouble(this.F9.getText());
        double Fal10 = Double.parseDouble(this.F10.getText());
        double Fal11 = Double.parseDouble(this.F11.getText());
        double Fal12 = Double.parseDouble(this.F12.getText());
        double Fal13 = Double.parseDouble(this.F13.getText());
        double Fal14 = Double.parseDouble(this.F14.getText());
        double Fal15 = Double.parseDouble(this.F15.getText());
        double Fal16 = Double.parseDouble(this.F16.getText());

        double total = Fal1 + Fal2 + Fal3 + Fal4 + Fal5 + Fal6 + Fal7 + Fal8
                + Fal9 + Fal10 + Fal11 + Fal12 + Fal13 + Fal14 + Fal15 + Fal16;
        this.F.setText("" + total + "");
    }
//Falta justificada

    public void FJ() {
        double FalJ1 = Double.parseDouble(this.FJ1.getText());
        double FalJ2 = Double.parseDouble(this.FJ2.getText());
        double FalJ3 = Double.parseDouble(this.FJ3.getText());
        double FalJ4 = Double.parseDouble(this.FJ4.getText());
        double FalJ5 = Double.parseDouble(this.FJ5.getText());
        double FalJ6 = Double.parseDouble(this.FJ6.getText());
        double FalJ7 = Double.parseDouble(this.FJ7.getText());
        double FalJ8 = Double.parseDouble(this.FJ8.getText());
        double FalJ9 = Double.parseDouble(this.FJ9.getText());
        double FalJ10 = Double.parseDouble(this.FJ10.getText());
        double FalJ11 = Double.parseDouble(this.FJ11.getText());
        double FalJ12 = Double.parseDouble(this.FJ12.getText());
        double FalJ13 = Double.parseDouble(this.FJ13.getText());
        double FalJ14 = Double.parseDouble(this.FJ14.getText());
        double FalJ15 = Double.parseDouble(this.FJ15.getText());
        double FalJ16 = Double.parseDouble(this.FJ16.getText());

        double total = FalJ1 + FalJ2 + FalJ3 + FalJ4 + FalJ5 + FalJ6 + FalJ7 + FalJ8 + FalJ9 + FalJ10 + FalJ11 + FalJ12 + FalJ13 + FalJ14 + FalJ15 + FalJ16;
        this.FJ.setText("" + total + "");
    }
//retardos

    public void R() {
        double d1 = Double.parseDouble(this.R1.getText());
        double d2 = Double.parseDouble(this.R2.getText());
        double d3 = Double.parseDouble(this.R3.getText());
        double d4 = Double.parseDouble(this.R4.getText());
        double d5 = Double.parseDouble(this.R5.getText());
        double d6 = Double.parseDouble(this.R6.getText());
        double d7 = Double.parseDouble(this.R7.getText());
        double d8 = Double.parseDouble(this.R8.getText());
        double d9 = Double.parseDouble(this.R9.getText());
        double d10 = Double.parseDouble(this.R10.getText());
        double d11 = Double.parseDouble(this.R11.getText());
        double d12 = Double.parseDouble(this.R12.getText());
        double d13 = Double.parseDouble(this.R13.getText());
        double d14 = Double.parseDouble(this.R14.getText());
        double d15 = Double.parseDouble(this.R15.getText());
        double d16 = Double.parseDouble(this.R16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.R.setText("" + total + "");
    }
//Descanso otorgado

    public void DO() {
        double d1 = Double.parseDouble(this.DO1.getText());
        double d2 = Double.parseDouble(this.DO2.getText());
        double d3 = Double.parseDouble(this.DO3.getText());
        double d4 = Double.parseDouble(this.DO4.getText());
        double d5 = Double.parseDouble(this.DO5.getText());
        double d6 = Double.parseDouble(this.DO6.getText());
        double d7 = Double.parseDouble(this.DO7.getText());
        double d8 = Double.parseDouble(this.DO8.getText());
        double d9 = Double.parseDouble(this.DO9.getText());
        double d10 = Double.parseDouble(this.DO10.getText());
        double d11 = Double.parseDouble(this.DO11.getText());
        double d12 = Double.parseDouble(this.DO12.getText());
        double d13 = Double.parseDouble(this.DO13.getText());
        double d14 = Double.parseDouble(this.DO14.getText());
        double d15 = Double.parseDouble(this.DO15.getText());
        double d16 = Double.parseDouble(this.DO16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.DO.setText("" + total + "");
    }

    public void shareN() {
        //Buscar empleado
        String Share = BNameNom.getText();
        String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();
        String where = "select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`"
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
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
            modelo.addColumn("Banco");//7
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//5
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");

//Anchos
            int[] anchos = {/*numE*/35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 150, /*Banco*/ 75, /*CTA*/ 50, /*zona*/ 60,
                /*servicio*/ 100, /*sueldo*/ 60, /*bono*/ 40};

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + e.getMessage());

        }

    }

//pago por quincena (division)
    public void PQt() {
        double d1 = Double.parseDouble(this.Q1.getText());
        double d2 = Double.parseDouble(this.Q2.getText());
        double d3 = Double.parseDouble(this.Q3.getText());
        double d4 = Double.parseDouble(this.Q4.getText());
        double d5 = Double.parseDouble(this.Q5.getText());
        double d6 = Double.parseDouble(this.Q6.getText());
        double d7 = Double.parseDouble(this.Q7.getText());
        double d8 = Double.parseDouble(this.Q8.getText());
        double d9 = Double.parseDouble(this.Q9.getText());
        double d10 = Double.parseDouble(this.Q10.getText());
        double d11 = Double.parseDouble(this.Q11.getText());
        double d12 = Double.parseDouble(this.Q12.getText());
        double d13 = Double.parseDouble(this.Q13.getText());
        double d14 = Double.parseDouble(this.Q14.getText());
        double d15 = Double.parseDouble(this.Q15.getText());
        double d16 = Double.parseDouble(this.Q16.getText());
        double d17 = Double.parseDouble(this.Q17.getText());
        double d18 = Double.parseDouble(this.Q18.getText());
        double d19 = Double.parseDouble(this.Q19.getText());
        double d20 = Double.parseDouble(this.Q20.getText());
        double d21 = Double.parseDouble(this.Q21.getText());
        double d22 = Double.parseDouble(this.Q22.getText());
        double d23 = Double.parseDouble(this.Q23.getText());
        double d24 = Double.parseDouble(this.Q24.getText());
        double d25 = Double.parseDouble(this.Iad.getText());

        double total = d25 / (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13
                + d14 + d15 + d16 + d17 + d18 + d19 + d20 + d21 + d22 + d23 + d24);
        this.PQT.setText("" + total + "");
    }

    public void eliminarT() {

        try {

            int filaseleccionada = OdT.getSelectedRow();
            String sql = "delete from taller where idtaller=" + OdT.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Orden eliminada.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar orden: " + e.getMessage());

        }

    }

//Mostrar orden de taller
    public void MDT() {
        //Buscar empleado
        String Share = Fnameodt.getText();
        String ShareAP = FilApodt.getText();
        String ShareAM = FilAmodt.getText();
        String where = "select * from taller";

        if (!"".equals(Share)) {
            where = " select * from taller WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select * from taller WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * from taller WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
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
            OdT.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# de orden");//1
            modelo.addColumn("Fecha de expedicion");//
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//5
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//7
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");//9
            modelo.addColumn("Placas");
            modelo.addColumn("Color");//11
            modelo.addColumn("# de piezas");
            modelo.addColumn("Daño");//13
            modelo.addColumn("Costo total");
            modelo.addColumn("Ingreso a taller");//15
            modelo.addColumn("Status");
            modelo.addColumn("Pago a");
            modelo.addColumn("Importe a descontar");//17
            modelo.addColumn("Quincenas a pagar");
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//19
            modelo.addColumn("Pago por quincena");
            modelo.addColumn("Forma de pago");//21
            modelo.addColumn("Quincenas pagadas");
            modelo.addColumn("Observaciones");//23

//Anchos
            int[] anchos = {/*ndo*/35, /*fde*/ 50, /*ap*/ 55, /*am*/ 55, /*nom*/ 150,
                /*Zon*/ 60, /*serv*/ 75, /*Marca*/ 60, /*Modelo*/ 60, /*Placas*/ 60, /*Color*/ 60,
                /*NDP*/ 50, /*Daño*/ 500,
                /*CT*/ 55, /*IAT*/ 60, /*Status*/ 60, /*pago a*/ 70, /*IAD*/ 60, /*QAP*/ 60, /*PAGA*/ 55,
                /*PENDIENTE*/ 55, /*PPQ*/ 70, /*FDP*/ 65, /*QP*/ 50, /*obs*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                OdT.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de taller: " + e.getMessage());

        }

    }

//modificar orden de taller
    public void editarT() {
        int id = Integer.parseInt(Ndo.getText());
        String Iat;
        if (Si.isSelected() == true) {
            Iat = "Si";
        } else if (no.isSelected() == true) {
            Iat = "No";
        } else {
            Iat = "Si";
        }
        String SQL = "UPDATE `taller` SET `idTaller` = ?, "
                + "`Fecha de expedicion` = ?, `Apellido P` = ?,"
                + " `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?,"
                + " `Servicio` = ?, `Marca` = ?, `Modelo` = ?, `Placas` = ?,"
                + " `Color` = ?, `# de piezas` = ?, `Daño` = ?, `Costo total` = ?,"
                + " `Ingreso a taller` = ?, `Status` = ?, `Pago a` = ?, `Importe a descontar` = ?, `Quincenas a pagar` = ?, "
                + " `Pagado` = ?, `Pendiente` = ?, `Por quincenas` = ?, `Forma de pago` = ?,"
                + " `Quincenas pagadas` = ?, `Observaciones` = ? WHERE `taller`.`idTaller` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Ndo.getText()));
            pst.setString(2, FE.getText());
            pst.setString(3, ApTaller.getText());
            pst.setString(4, Amtaller.getText());
            pst.setString(5, NameTaller.getText());
            pst.setString(6, Zona1.getText());
            pst.setString(7, Serv1.getText());
            pst.setString(8, Marca.getText());
            pst.setString(9, Modelo.getText());
            pst.setString(10, Placas.getText());
            pst.setString(11, Color.getText());
            pst.setString(12, ndp.getText());
            pst.setString(13, Daño.getText());
            pst.setString(14, CT.getText());
            pst.setString(15, Iat);
            pst.setString(16, Statusodt.getSelectedItem().toString());
            pst.setString(17, Paodt.getSelectedItem().toString());
            pst.setString(18, Iad.getText());
            pst.setString(19, QAP.getSelectedItem().toString());
            pst.setString(20, Pagado.getText());
            pst.setString(21, Pendiente.getText());
            pst.setString(22, PQT.getText());
            pst.setString(23, Fdp.getSelectedItem().toString());
            pst.setString(24, QPodt.getText());
            pst.setString(25, Observaciones.getText());
            pst.setInt(26, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orden Modificada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error modificar Orden" + e.getMessage());
        }
    }

    public void limpiarT() {
        Ndo.setText("0");
        IAT.clearSelection();
        FE.setText("");
        NameTaller.setText("");
        ApTaller.setText("");
        Amtaller.setText("");
        Zona1.setText("");
        Marca.setText("");
        Serv1.setText("");
        ndp.setText("");
        Daño.setText("");
        CT.setText("0");
        Statusodt.setSelectedIndex(0);
        Paodt.setSelectedIndex(0);
        Iad.setText("0");
        QAP.setSelectedIndex(0);
        PQT.setText("");
        Marca.setText("");
        Modelo.setText("");
        Color.setText("");
        Placas.setText("");
        Pagado.setText("");
        Pendiente.setText("");
        Fdp.setSelectedIndex(0);
        Observaciones.setText("");
        QPodt.setText("0");
    }

    public void limpiarP() {
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
    }

    //agregar orden de taller
    public void AgregarT() {

        String Iat;
        if (Si.isSelected() == true) {
            Iat = "Si";
        } else if (no.isSelected() == true) {
            Iat = "No";
        } else {
            Iat = ".";
        }
        String SQL = "INSERT INTO `taller` (`idTaller`, `Fecha de expedicion`,"
                + " `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`,"
                + " `Marca`, `Modelo`, `Placas`, `Color`, `# de piezas`, `Daño`,"
                + " `Costo total`, `Ingreso a taller`, `Status`, `Pago a`, `Importe a descontar`, `Quincenas a pagar`,"
                + " `Pagado`, `Pendiente`, `Por quincenas`, `Forma de pago`, `Quincenas pagadas`, `Observaciones`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Ndo.getText()));
            pst.setString(2, FE.getText());
            pst.setString(3, ApTaller.getText());
            pst.setString(4, Amtaller.getText());
            pst.setString(5, NameTaller.getText());
            pst.setString(6, Zona1.getText());
            pst.setString(7, Serv1.getText());
            pst.setString(8, Marca.getText());
            pst.setString(9, Modelo.getText());
            pst.setString(10, Placas.getText());
            pst.setString(11, Color.getText());
            pst.setString(12, ndp.getText());
            pst.setString(13, Daño.getText());
            pst.setString(14, CT.getText());
            pst.setString(15, Iat);
            pst.setString(16, Statusodt.getSelectedItem().toString());
            pst.setString(17, Paodt.getSelectedItem().toString());
            pst.setString(18, Iad.getText());
            pst.setString(19, QAP.getSelectedItem().toString());
            pst.setString(20, Pagado.getText());
            pst.setString(21, Pendiente.getText());
            pst.setString(22, PQT.getText());
            pst.setString(23, Fdp.getSelectedItem().toString());
            pst.setString(24, QPodt.getText());
            pst.setString(25, Observaciones.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orden de Taller Agregada");

        } catch (HeadlessException | SQLException Ex_Taller) {
            JOptionPane.showMessageDialog(null, "Error al agregar orden de taller: " + Ex_Taller.getMessage());
        }
    }

    public void DAR() {
        double Dar1 = Double.parseDouble(this.CT.getText());

        double igual = Dar1;

        this.Iad.setText("" + igual + "");
    }

    public void DAR1() {
        double d1 = Double.parseDouble(this.CT.getText());
        double d2 = Double.parseDouble(this.Pagado.getText());
        double d3 = d1 - d2;
        double total = d3;

        this.Pendiente.setText("" + total + "");
    }

//mostrar datos prestamos
    public void MDP() {
        //Buscar empleado
        String FILNAMEPRE = FNamepres.getText();
        String FILAPPRE = FAPpres.getText();
        String FILAMPRE = FAMpres.getText();
        String sql = "select * from prestamos";

        if (!"".equals(FILNAMEPRE)) {
            sql = " select * from prestamos WHERE `Nombre(s)` LIKE '%" + FILNAMEPRE + "%'";
        } else if (!"".equals(FILAPPRE)) {
            sql = " select * from prestamos WHERE `Apellido P` LIKE '%" + FILAPPRE + "%'";
        } else if (!"".equals(FILAMPRE)) {
            sql = " select * from prestamos WHERE `Apellido M` LIKE '%" + FILAMPRE + "%'";
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

// modificar prestamo
    public void editarpre() {

        int id = Integer.parseInt(Num.getText());

        String SQL = "UPDATE `prestamos` SET `idprestamos` = ?, `Fecha de solicitud` = ?, `Mes` = ?,"
                + " `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?, "
                + "`Servicio` = ?, `Cantidad` = ?, `Tiempo` = ?, `Interes` = ?,"
                + " `Monto total` = ?, `Por quincena` = ?, `Carpeta de descuentos` = ?,"
                + " `Fecha liberado` = ?, `Status` = ?, `Metodo` = ?,"
                + " `Quincenas pagadas` = ?, `Pagado` = ?, `Pendiente` = ? WHERE"
                + " `prestamos`.`idprestamos` = ?";

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

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Prestamo: " + e.getMessage());
        }
    }

    public void AgregarPre() {

        int id = Integer.parseInt(Num.getText());

        String SQL = "INSERT INTO `prestamos` (`idprestamos`, `Fecha de solicitud`,"
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

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar prestamo: " + e.getMessage());
        }
    }

//mostrar datos pagos nomina
    public void mostrarpagos() {
        //Nombre persona del pago
        String FiltroN = busp.getText();
        String FAPpago = BAppag.getText();
        String FAMpago = Bampag.getText();
        String where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Zona`, `Servicio`,"
                + " `Sueldo`, `Bono`, `Deposito` `quincena del mes`, `año` FROM `nomina.detallada`";
        String FiltroZpago = FiltroZP.getSelectedItem().toString();
        String FiltroSpago = FiltroServP.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Zona`, `Servicio`, "
                    + " `Sueldo`, `Bono`, `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Zona`, `Servicio`,"
                    + " `Sueldo`, `Bono`, `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Zona`, `Servicio`, "
                    + "` `Sueldo`, `Bono`, `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Zona`, `Servicio`, "
                    + " `Sueldo`, `Bono`, `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroZpago)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Zona`, `Servicio`, "
                    + "`Sueldo`, `Bono`, `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " where `Zona` LIKE '%" + FiltroZpago + "%'";
        } else if (!"".equals(FiltroSpago)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, "
                    + "  `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            where = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Zona`, `Servicio`, "
                    + "`Sueldo`, `Bono`, `Deposito`, `quincena del mes`, `año` FROM `nomina.detallada`"
                    + " Where `quincena del mes` LIKE '%" + FiltroQuinpago + "%'";
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
            pago.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Zona");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Bono");
            modelo.addColumn("Deposito");
            modelo.addColumn("Quincena del mes");//11
            modelo.addColumn("Año");//12

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*ZONA*/ 50, /*SERV*/ 60, /*SQ*/ 60, /*BONO*/ 50, /*DEP*/ 60, /*QDM*/ 80,
                /*AÑO*/ 40};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos: " + e.getMessage());

        }

    }

//Modificar nomina
    public void MODN() {

        String SQL = "UPDATE `nomina.detallada` SET `#Folio` = ?, `#lista` = ?, `#empleado` = ?,"
                + " `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Banco` = ?, "
                + "`Cuenta de banco` = ?, `Zona` = ?, `Servicio` = ?, `Sueldo` = ?, "
                + "`Bono` = ?, `por dia` = ?, `quincena del mes` = ?, `año` = ?, `1/16` = ?, "
                + "`2/17` = ?, `3/18` = ?, `4/19` = ?, `5/20` = ?, `6/21` = ?, `7/22` = ?, "
                + "`8/23` = ?, `9/24` = ?, `10/25` = ?, `11/26` = ?, `12/27` = ?, `13/28` = ?, "
                + "`14/29` = ?, `15/30` = ?, `31` = ?, `Dias de incapacidad` = ?, "
                + "`Pago de seguro` = ?, `Dias de vacaciones` = ?, `Pago de dias de vacaciones` = ?, "
                + "`Dias descansados` = ?, `Pago de dias descansados` = ?, `Dias Laborados` = ?, "
                + "`Pago de dias laborados` = ?, `Descansos Trabajados` = ?, `Pago de dias trabajados` = ?, "
                + "`Descanso sin goce de sueldo` = ?, `Pago de dias de DSGS` = ?, `Faltas Justificadas` = ?, "
                + "`Descanso Otorgado` = ?, `Retardos` = ?, `Pago con retardos` = ?, `Apoyo` = ?, `Lugar` = ?, "
                + "`Rembolso` = ?, `Adicionales` = ?, `Faltas` = ?, `Descuento por faltas` = ?, "
                + "`Desc IMSS` = ?, `Faltantes de boleto` = ?, `Sancion` = ?, `Chamarra` = ?, "
                + "`Chaleco` = ?, `Faltante de efectivo` = ?, `Grua` = ?, `Pantalon` = ?, "
                + "`Credencial` = ?, `Adelanto de nomina` = ?, `Boleto perdido` = ?, `Playera` = ?, `Corbata` = ?, "
                + "`Total de DV` = ?, `Pago de prestamo` = ?, `Caja de ahorro` = ?, "
                + "`Orden de taller` = ?, `Deposito` = ?, `Observaciones` = ? WHERE "
                + "`nomina.detallada`.`#Folio` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setInt(3, Integer.parseInt(NEnom.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, ban.getText());
            pst.setString(8, cta.getText());
            pst.setString(9, Zon.getText());
            pst.setString(10, ServN.getText());
            pst.setString(11, sueldo.getText());
            pst.setString(12, Bono1.getText());
            pst.setString(13, pd.getText());
            pst.setString(14, Quincenas.getSelectedItem().toString());
            pst.setString(15, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(16, Dia1.getSelectedItem().toString());
            pst.setString(17, DIa2.getSelectedItem().toString());
            pst.setString(18, Dia3.getSelectedItem().toString());
            pst.setString(19, Dia4.getSelectedItem().toString());
            pst.setString(20, Dia5.getSelectedItem().toString());
            pst.setString(21, Dia6.getSelectedItem().toString());
            pst.setString(22, Dia7.getSelectedItem().toString());
            pst.setString(23, Dia8.getSelectedItem().toString());
            pst.setString(24, Dia9.getSelectedItem().toString());
            pst.setString(25, Dia10.getSelectedItem().toString());
            pst.setString(26, Dia11.getSelectedItem().toString());
            pst.setString(27, Dia12.getSelectedItem().toString());
            pst.setString(28, Dia13.getSelectedItem().toString());
            pst.setString(29, Dia14.getSelectedItem().toString());
            pst.setString(30, Dia15.getSelectedItem().toString());
            pst.setString(31, Dia16.getSelectedItem().toString());
            pst.setString(32, Dpi.getText());
            pst.setString(33, pds.getText());
            pst.setString(34, Ddv.getText());
            pst.setString(35, PDDDV.getText());
            pst.setString(36, DD.getText());
            pst.setString(37, PDDD.getText());
            pst.setString(38, DL.getText());
            pst.setString(39, PDDL.getText());
            pst.setString(40, dt.getText());
            pst.setString(41, PDDT.getText());
            pst.setString(42, DSGS.getText());
            pst.setString(43, PDDDDSGS.getText());
            pst.setString(44, FJ.getText());
            pst.setString(45, DO.getText());
            pst.setString(46, R.getText());
            pst.setString(47, PCR.getText());
            pst.setString(48, apy.getText());
            pst.setString(49, Lugar.getText());
            pst.setString(50, Rembolso.getText());
            pst.setString(51, ADD.getText());
            pst.setString(52, F.getText());
            pst.setString(53, DPF.getText());
            pst.setString(54, DI.getText());
            pst.setString(55, Fdb.getText());
            pst.setString(56, Sancion.getText());
            pst.setString(57, Chamarra.getText());
            pst.setString(58, Chaleco.getText());
            pst.setString(59, Fde.getText());
            pst.setString(60, Grua.getText());
            pst.setString(61, Pantalon.getText());
            pst.setString(62, Credencial.getText());
            pst.setString(63, Bp.getText());
            pst.setString(64, Playera.getText());
            pst.setString(65, Corbata.getText());
            pst.setString(66, DVT.getText());
            pst.setString(67, AdN.getText());
            pst.setString(68, Presp.getText());
            pst.setString(69, cda.getText());
            pst.setString(70, Odtp.getText());
            pst.setString(71, deposito.getText());
            pst.setString(72, obs.getText());
            pst.setInt(73, Integer.parseInt(NFnom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Modificada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar nomina: " + e.getMessage());
        }
    }

    public void eliminarnom() {

        try {

            int filaseleccionada = Tnom.getSelectedRow();
            String sql = "delete from nomina where #lista=" + Tnom.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }

    }

    //mostrar datos de nomina
    public void MDN() {
        //Buscar empleado
        String FiltroN = Nominab.getText();
        String where = "select * from `nomina.detallada`";
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroZnom = FiltroZnomina.getSelectedItem().toString();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            where = "Select * from `nomina.detallada` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            where = "select * from `nomina.detallada` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            where = "select * from `nomina.detallada` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            where = "select * from `nomina.detallada` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroZnom)) {
            where = "select * from `nomina.detallada` where `Zona   ` LIKE '%" + FiltroZnom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            where = "select * from nomina Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            where = "select * from `nomina.detallada` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# lista");//1
            modelo.addColumn("# Empleado");//2
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//4
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Banco");//6
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Zona");//8
            modelo.addColumn("Servicio");
            modelo.addColumn("Sueldo");//10
            modelo.addColumn("Bono");
            modelo.addColumn("Por dia");//12
            modelo.addColumn("Quincena del mes");
            modelo.addColumn("Año");//14
            modelo.addColumn("Dia 1 o 16");
            modelo.addColumn("Dia 2 o 17");//16
            modelo.addColumn("Dia 3 o 18");
            modelo.addColumn("Dia 4 o 19");//18
            modelo.addColumn("Dia 5 o 20");
            modelo.addColumn("Dia 6 o 21");//20
            modelo.addColumn("Dia 7 o 22");
            modelo.addColumn("Dia 8 o 23");//22
            modelo.addColumn("Dia 9 o 24");
            modelo.addColumn("Dia 10 o 25");//24
            modelo.addColumn("Dia 11 o 26");
            modelo.addColumn("Dia 12 o 27");//26
            modelo.addColumn("Dia 13 o 28");
            modelo.addColumn("Dia 14 o 29");//28
            modelo.addColumn("Dia 15 o 30");
            modelo.addColumn("Dia 31");//30
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//32
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//34
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("Descanso sin goce de sueldo");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Retardos");
            modelo.addColumn("Pago con retardos");//52
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Faltantes de boleto");//54
            modelo.addColumn("Sancion");
            modelo.addColumn("Chamarra");//56
            modelo.addColumn("Chaleco");
            modelo.addColumn("Faltante de efectivo");//58
            modelo.addColumn("Grua");
            modelo.addColumn("Pantalon");//60 
            modelo.addColumn("Credencial");
            modelo.addColumn("Boleto perdido");//62
            modelo.addColumn("Playera");
            modelo.addColumn("Corbata");//64
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Total de DV");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//70

//Anchos hasta quincena
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla Nomina: " + e.getMessage());

        }

    }

//Agregar nomina
    public void AgregarN() {

        String SQL = "INSERT INTO `nomina.detallada` (`#Folio`, `#lista`, `#empleado`, `Apellido P`, "
                + "`Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, "
                + "`Sueldo`, `Bono`, `por dia`, `quincena del mes`, `año`, `1/16`, `2/17`,"
                + " `3/18`, `4/19`, `5/20`, `6/21`, `7/22`, `8/23`, `9/24`, `10/25`, `11/26`, "
                + "`12/27`, `13/28`, `14/29`, `15/30`, `31`, `Dias de incapacidad`, `Pago de seguro`,"
                + " `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, "
                + "`Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, "
                + "`Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, "
                + "`Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Retardos`, `Pago con retardos`,"
                + " `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, "
                + "  `Desc IMSS`, `Faltantes de boleto`, `Sancion`, `Chamarra`,"
                + " `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, "
                + "`Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, "
                + "`Deposito`, `Observaciones`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setInt(3, Integer.parseInt(NEnom.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, ban.getText());
            pst.setString(8, cta.getText());
            pst.setString(9, Zon.getText());
            pst.setString(10, ServN.getText());
            pst.setString(11, sueldo.getText());
            pst.setString(12, Bono1.getText());
            pst.setString(13, pd.getText());
            pst.setString(14, Quincenas.getSelectedItem().toString());
            pst.setString(15, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(16, Dia1.getSelectedItem().toString());
            pst.setString(17, DIa2.getSelectedItem().toString());
            pst.setString(18, Dia3.getSelectedItem().toString());
            pst.setString(19, Dia4.getSelectedItem().toString());
            pst.setString(20, Dia5.getSelectedItem().toString());
            pst.setString(21, Dia6.getSelectedItem().toString());
            pst.setString(22, Dia7.getSelectedItem().toString());
            pst.setString(23, Dia8.getSelectedItem().toString());
            pst.setString(24, Dia9.getSelectedItem().toString());
            pst.setString(25, Dia10.getSelectedItem().toString());
            pst.setString(26, Dia11.getSelectedItem().toString());
            pst.setString(27, Dia12.getSelectedItem().toString());
            pst.setString(28, Dia13.getSelectedItem().toString());
            pst.setString(29, Dia14.getSelectedItem().toString());
            pst.setString(30, Dia15.getSelectedItem().toString());
            pst.setString(31, Dia16.getSelectedItem().toString());
            pst.setString(32, Dpi.getText());
            pst.setString(33, pds.getText());
            pst.setString(34, Ddv.getText());
            pst.setString(35, PDDDV.getText());
            pst.setString(36, DD.getText());
            pst.setString(37, PDDD.getText());
            pst.setString(38, DL.getText());
            pst.setString(39, PDDL.getText());
            pst.setString(40, dt.getText());
            pst.setString(41, PDDT.getText());
            pst.setString(42, DSGS.getText());
            pst.setString(43, PDDDDSGS.getText());
            pst.setString(44, FJ.getText());
            pst.setString(45, DO.getText());
            pst.setString(46, R.getText());
            pst.setString(47, PCR.getText());
            pst.setString(48, apy.getText());
            pst.setString(49, Lugar.getText());
            pst.setString(50, Rembolso.getText());
            pst.setString(51, ADD.getText());
            pst.setString(52, F.getText());
            pst.setString(53, DPF.getText());
            pst.setString(54, DI.getText());
            pst.setString(55, Fdb.getText());
            pst.setString(56, Sancion.getText());
            pst.setString(57, Chamarra.getText());
            pst.setString(58, Chaleco.getText());
            pst.setString(59, Fde.getText());
            pst.setString(60, Grua.getText());
            pst.setString(61, Pantalon.getText());
            pst.setString(62, Credencial.getText());
            pst.setString(63, Bp.getText());
            pst.setString(64, Playera.getText());
            pst.setString(65, Corbata.getText());
            pst.setString(66, AdN.getText());
            pst.setString(67, DVT.getText());
            pst.setString(68, Presp.getText());
            pst.setString(69, cda.getText());
            pst.setString(70, Odtp.getText());
            pst.setString(71, deposito.getText());
            pst.setString(72, obs.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Agregada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Nomina: " + e.getMessage());
        }
    }

//Calculo de deposito
    public void deposito() {
        //por dia
        double PD = Double.parseDouble(this.pd.getText());
//incapacidad
        double dpi = Double.parseDouble(this.Dpi.getText());
        double totaldpi = dpi * PD;
        pds.setText("" + totaldpi);

//vacaciones
        double DDV = Double.parseDouble(this.Ddv.getText());
        double totalddv = DDV * PD;
        PDDDV.setText("" + totalddv);
//descanso
        double DID = Double.parseDouble(this.DD.getText());
        double totaldd = DID * PD;
        PDDD.setText("" + totaldd);
//dia laborado
        double DIAL = Double.parseDouble(this.DL.getText());
        double totalDL = DIAL * PD;
        PDDL.setText("" + totalDL);
//descanso
        double DEST = Double.parseDouble(this.dt.getText());
        double totaldt = (2 * PD) * DEST;
        PDDT.setText("" + totaldt);

        double FAL = Double.parseDouble(this.F.getText());
        double totalFAL = (350 * FAL);
        DPF.setText("" + totalFAL);

        double RET = Double.parseDouble(this.R.getText());
        double totalRET = (PD * RET) - (RET * 50);
        PCR.setText("" + totalRET);

        //EGRESOS
        double EG1 = Double.parseDouble(this.DVT.getText());
        double EG2 = Double.parseDouble(this.DI.getText());
        double EG4 = Double.parseDouble(this.cda.getText());
        double EG7 = Double.parseDouble(this.Odtp.getText());
        double EG8 = Double.parseDouble(this.Presp.getText());
        double EG16 = Double.parseDouble(this.DPF.getText());
//ingresos
        double IN3 = Double.parseDouble(this.ADD.getText());
        double IN5 = Double.parseDouble(this.apy.getText());
        double IN9 = Double.parseDouble(this.Rembolso.getText());
        double IN10 = Double.parseDouble(this.Bono.getText());
        double IN15 = Double.parseDouble(this.PCR.getText());
        double IN14 = Double.parseDouble(this.PDDD.getText());
        double IN1 = Double.parseDouble(this.PDDL.getText());
        double IN6 = Double.parseDouble(this.PDDT.getText());
        double IN2 = Double.parseDouble(this.PDDDV.getText());
        double IN13 = Double.parseDouble(this.PDDDDSGS.getText());

        double Ingresos = (IN13 + IN10 + IN9 + IN6 + IN3 + IN5 + IN14 + IN15 + IN1 + IN2);
        double Egresos = (EG1 + EG2 + EG7 + EG8 + EG4 + EG16);
        DecimalFormat df = new DecimalFormat("#.00");
        this.deposito.setText(df.format(Ingresos - Egresos));

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DO1 = new javax.swing.JLabel();
        DO2 = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        dt1 = new javax.swing.JLabel();
        dt2 = new javax.swing.JLabel();
        dt3 = new javax.swing.JLabel();
        dt4 = new javax.swing.JLabel();
        DL1 = new javax.swing.JLabel();
        dt5 = new javax.swing.JLabel();
        DL2 = new javax.swing.JLabel();
        dt6 = new javax.swing.JLabel();
        F1 = new javax.swing.JLabel();
        F2 = new javax.swing.JLabel();
        FJ1 = new javax.swing.JLabel();
        FJ2 = new javax.swing.JLabel();
        FJ3 = new javax.swing.JLabel();
        FJ4 = new javax.swing.JLabel();
        FJ5 = new javax.swing.JLabel();
        dt7 = new javax.swing.JLabel();
        dt8 = new javax.swing.JLabel();
        dt9 = new javax.swing.JLabel();
        dt10 = new javax.swing.JLabel();
        dt11 = new javax.swing.JLabel();
        dt12 = new javax.swing.JLabel();
        dt13 = new javax.swing.JLabel();
        dt14 = new javax.swing.JLabel();
        dt15 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        R4 = new javax.swing.JLabel();
        R5 = new javax.swing.JLabel();
        R6 = new javax.swing.JLabel();
        R7 = new javax.swing.JLabel();
        R8 = new javax.swing.JLabel();
        R9 = new javax.swing.JLabel();
        R10 = new javax.swing.JLabel();
        R11 = new javax.swing.JLabel();
        R12 = new javax.swing.JLabel();
        R13 = new javax.swing.JLabel();
        R14 = new javax.swing.JLabel();
        R15 = new javax.swing.JLabel();
        DO3 = new javax.swing.JLabel();
        DO4 = new javax.swing.JLabel();
        DO5 = new javax.swing.JLabel();
        DO6 = new javax.swing.JLabel();
        DO7 = new javax.swing.JLabel();
        DO8 = new javax.swing.JLabel();
        DO9 = new javax.swing.JLabel();
        DO10 = new javax.swing.JLabel();
        DO11 = new javax.swing.JLabel();
        DO12 = new javax.swing.JLabel();
        DO13 = new javax.swing.JLabel();
        DO14 = new javax.swing.JLabel();
        DO15 = new javax.swing.JLabel();
        F3 = new javax.swing.JLabel();
        F4 = new javax.swing.JLabel();
        F5 = new javax.swing.JLabel();
        F6 = new javax.swing.JLabel();
        F7 = new javax.swing.JLabel();
        F8 = new javax.swing.JLabel();
        F9 = new javax.swing.JLabel();
        F10 = new javax.swing.JLabel();
        F11 = new javax.swing.JLabel();
        F12 = new javax.swing.JLabel();
        F13 = new javax.swing.JLabel();
        F14 = new javax.swing.JLabel();
        F15 = new javax.swing.JLabel();
        DL3 = new javax.swing.JLabel();
        DL4 = new javax.swing.JLabel();
        DL5 = new javax.swing.JLabel();
        DL6 = new javax.swing.JLabel();
        DL7 = new javax.swing.JLabel();
        DL8 = new javax.swing.JLabel();
        DL9 = new javax.swing.JLabel();
        DL10 = new javax.swing.JLabel();
        DL11 = new javax.swing.JLabel();
        DL12 = new javax.swing.JLabel();
        DL13 = new javax.swing.JLabel();
        DL14 = new javax.swing.JLabel();
        DL15 = new javax.swing.JLabel();
        DL16 = new javax.swing.JLabel();
        dt16 = new javax.swing.JLabel();
        R16 = new javax.swing.JLabel();
        DO16 = new javax.swing.JLabel();
        FJ16 = new javax.swing.JLabel();
        F16 = new javax.swing.JLabel();
        FJ6 = new javax.swing.JLabel();
        FJ7 = new javax.swing.JLabel();
        FJ8 = new javax.swing.JLabel();
        FJ9 = new javax.swing.JLabel();
        FJ10 = new javax.swing.JLabel();
        FJ11 = new javax.swing.JLabel();
        FJ12 = new javax.swing.JLabel();
        FJ13 = new javax.swing.JLabel();
        FJ14 = new javax.swing.JLabel();
        FJ15 = new javax.swing.JLabel();
        DSGS1 = new javax.swing.JLabel();
        DSGS2 = new javax.swing.JLabel();
        DSGS3 = new javax.swing.JLabel();
        DSGS4 = new javax.swing.JLabel();
        DSGS5 = new javax.swing.JLabel();
        DSGS6 = new javax.swing.JLabel();
        DSGS7 = new javax.swing.JLabel();
        DSGS8 = new javax.swing.JLabel();
        DSGS9 = new javax.swing.JLabel();
        DSGS10 = new javax.swing.JLabel();
        DSGS11 = new javax.swing.JLabel();
        DSGS12 = new javax.swing.JLabel();
        DSGS13 = new javax.swing.JLabel();
        DSGS14 = new javax.swing.JLabel();
        DSGS15 = new javax.swing.JLabel();
        DSGS16 = new javax.swing.JLabel();
        Q6 = new javax.swing.JLabel();
        Q8 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Q11 = new javax.swing.JLabel();
        Q10 = new javax.swing.JLabel();
        Q9 = new javax.swing.JLabel();
        Q25 = new javax.swing.JLabel();
        Q7 = new javax.swing.JLabel();
        Q26 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        Q27 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        Q28 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        Q24 = new javax.swing.JLabel();
        Q23 = new javax.swing.JLabel();
        Q22 = new javax.swing.JLabel();
        Q21 = new javax.swing.JLabel();
        Q20 = new javax.swing.JLabel();
        Q19 = new javax.swing.JLabel();
        Q18 = new javax.swing.JLabel();
        Q17 = new javax.swing.JLabel();
        Q16 = new javax.swing.JLabel();
        Q15 = new javax.swing.JLabel();
        Q14 = new javax.swing.JLabel();
        Q13 = new javax.swing.JLabel();
        Q12 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Nomina = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        jLabel133 = new javax.swing.JLabel();
        Datgen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        NDL = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        NEnom = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        NFnom = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        BAMNom = new javax.swing.JTextField();
        FiltrosNom = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        CS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        share = new javax.swing.JTable();
        BAPNom = new javax.swing.JTextField();
        Filtro1 = new javax.swing.JLabel();
        BNameNom = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        Quincenas = new javax.swing.JComboBox<>();
        d = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        d10 = new javax.swing.JLabel();
        d11 = new javax.swing.JLabel();
        d12 = new javax.swing.JLabel();
        d13 = new javax.swing.JLabel();
        d14 = new javax.swing.JLabel();
        d15 = new javax.swing.JLabel();
        Dia1 = new javax.swing.JComboBox<>();
        DIa2 = new javax.swing.JComboBox<>();
        Dia3 = new javax.swing.JComboBox<>();
        Dia4 = new javax.swing.JComboBox<>();
        Dia5 = new javax.swing.JComboBox<>();
        Dia6 = new javax.swing.JComboBox<>();
        Dia7 = new javax.swing.JComboBox<>();
        Dia8 = new javax.swing.JComboBox<>();
        Dia9 = new javax.swing.JComboBox<>();
        Dia10 = new javax.swing.JComboBox<>();
        Dia11 = new javax.swing.JComboBox<>();
        Dia12 = new javax.swing.JComboBox<>();
        Dia13 = new javax.swing.JComboBox<>();
        Dia14 = new javax.swing.JComboBox<>();
        Dia15 = new javax.swing.JComboBox<>();
        Dia16 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        año = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        Bsi = new javax.swing.JRadioButton();
        Bno = new javax.swing.JRadioButton();
        Bono = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Zon = new javax.swing.JTextField();
        ServN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Bono1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ban = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        DPF = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        DI = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        SHPresnom = new javax.swing.JTable();
        jLabel144 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        SHCDAnom = new javax.swing.JTable();
        cda = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        SHODTnom = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        Odtp = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        QAcdanom = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        NCDANom = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        TACDANOM = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        NumPrenom = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        Pagadoprenom = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        Pendienteprenom = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        PagODTnom = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        NODTnom = new javax.swing.JTextField();
        jLabel147 = new javax.swing.JLabel();
        PenODTnom = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        Presp = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        NQprenom = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        NQODTnom = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        Dpi = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        Ddv = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        DD = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        DL = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        LabelDSGS = new javax.swing.JLabel();
        DSGS = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        PDDDV = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        PDDD = new javax.swing.JLabel();
        pds = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        PDDL = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PDDT = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        PDDDDSGS = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        DO = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        apy = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        Lugar = new javax.swing.JTextField();
        FJ = new javax.swing.JLabel();
        Rembolso = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        ADD = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        PCR = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        DVT = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        Fdb = new javax.swing.JTextField();
        jLabel79 = new javax.swing.JLabel();
        Sancion = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        Chamarra = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        Chaleco = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        Fde = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        Grua = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        Pantalon = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        Credencial = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        Bp = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        Playera = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        Corbata = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        AdN = new javax.swing.JTextField();
        jScrollPane20 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        AgregarNP = new javax.swing.JButton();
        Modm = new javax.swing.JButton();
        deposito = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        TDnomina = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tnom = new javax.swing.JTable();
        LabelBE = new javax.swing.JLabel();
        Nominab = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        CS2 = new javax.swing.JButton();
        LabelBZ = new javax.swing.JLabel();
        FiltroZnomina = new javax.swing.JComboBox<>();
        LabelBS = new javax.swing.JLabel();
        FiltroSnomina = new javax.swing.JComboBox<>();
        LabelBQ = new javax.swing.JLabel();
        FiltroQuincenanomina = new javax.swing.JComboBox<>();
        LabelSZ = new javax.swing.JLabel();
        FZservicio = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        FiltrosTD = new javax.swing.JComboBox<>();
        LabelBNDF = new javax.swing.JLabel();
        FiltroNDF = new javax.swing.JTextField();
        FApT = new javax.swing.JTextField();
        FAmT = new javax.swing.JTextField();
        botonWeb1 = new botones.BotonWeb();
        TPagos = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pago = new javax.swing.JTable();
        LabelBEP = new javax.swing.JLabel();
        busp = new javax.swing.JTextField();
        CS3 = new javax.swing.JButton();
        LabelBZP = new javax.swing.JLabel();
        FiltroZP = new javax.swing.JComboBox<>();
        LabelSZP = new javax.swing.JLabel();
        FiltroSZP = new javax.swing.JComboBox<>();
        LabelBSP = new javax.swing.JLabel();
        FiltroServP = new javax.swing.JComboBox<>();
        LabelNDFP = new javax.swing.JLabel();
        filtroNDFP = new javax.swing.JTextField();
        LabelBQP = new javax.swing.JLabel();
        FiltroQP = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        FiltrosP = new javax.swing.JComboBox<>();
        BAppag = new javax.swing.JTextField();
        Bampag = new javax.swing.JTextField();
        botonWeb2 = new botones.BotonWeb();
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
        Tprestamos = new javax.swing.JScrollPane();
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
        Talleres = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        CT = new javax.swing.JTextField();
        Si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        Paodt = new javax.swing.JComboBox<>();
        Iad = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        Pagado = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        Pendiente = new javax.swing.JTextField();
        Fdp = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        Ndo = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        share2 = new javax.swing.JTable();
        LabelPrestamos1 = new javax.swing.JLabel();
        BE1 = new javax.swing.JTextField();
        Agregartaller = new javax.swing.JButton();
        Modificartaller = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Daño = new javax.swing.JTextArea();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        Zona1 = new javax.swing.JTextField();
        Serv1 = new javax.swing.JTextField();
        ndp = new javax.swing.JTextField();
        ApTaller = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        Amtaller = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        NameTaller = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        Placas = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        QAP = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        PQT = new javax.swing.JTextField();
        FE = new javax.swing.JTextField();
        CS6 = new javax.swing.JButton();
        FshT = new javax.swing.JComboBox<>();
        Busapshpre1 = new javax.swing.JTextField();
        Busamshpre1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        QPodt = new javax.swing.JTextField();
        Statusodt = new javax.swing.JComboBox<>();
        jLabel168 = new javax.swing.JLabel();
        TTalleres = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        Labelfilodt = new javax.swing.JLabel();
        Fnameodt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        OdT = new javax.swing.JTable();
        EliminarT = new javax.swing.JButton();
        CS7 = new javax.swing.JButton();
        botonWeb4 = new botones.BotonWeb();
        jLabel161 = new javax.swing.JLabel();
        FiltrosTODT = new javax.swing.JComboBox<>();
        FilApodt = new javax.swing.JTextField();
        FilAmodt = new javax.swing.JTextField();
        TDPODT = new javax.swing.JScrollPane();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TPODT = new javax.swing.JTable();
        jLabel153 = new javax.swing.JLabel();
        FiltrosPDODT = new javax.swing.JComboBox<>();
        LabelfilPODT = new javax.swing.JLabel();
        FilnamePODT = new javax.swing.JTextField();
        FilApPODT = new javax.swing.JTextField();
        FilAmPODT = new javax.swing.JTextField();
        botonWeb6 = new botones.BotonWeb();
        Cajadeahorro = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel98 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        numEcda = new javax.swing.JTextField();
        APcda = new javax.swing.JTextField();
        AMcda = new javax.swing.JTextField();
        namecda = new javax.swing.JTextField();
        zonacda = new javax.swing.JTextField();
        servcda = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        Numcda = new javax.swing.JTextField();
        jLabel117 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        Obscda = new javax.swing.JTextArea();
        jLabel118 = new javax.swing.JLabel();
        Filsharecda = new javax.swing.JComboBox<>();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ShareCDA = new javax.swing.JTable();
        jLabel124 = new javax.swing.JLabel();
        TELC = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        Tablacda = new javax.swing.JTable();
        CalIn = new javax.swing.JCheckBox();
        jLabel125 = new javax.swing.JLabel();
        TIAP = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        Totalap = new javax.swing.JTextField();
        jLabel121 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        APQ = new javax.swing.JTextField();
        jLabel123 = new javax.swing.JLabel();
        QAdas = new javax.swing.JTextField();
        TArrado = new javax.swing.JTextField();
        PorcenIn = new javax.swing.JTextField();
        CajaA = new javax.swing.JTextField();
        IAP = new javax.swing.JTextField();
        PPF = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        Obs1cda = new javax.swing.JComboBox<>();
        jLabel114 = new javax.swing.JLabel();
        Statuscda = new javax.swing.JComboBox<>();
        jLabel115 = new javax.swing.JLabel();
        Labelcda = new javax.swing.JLabel();
        BusAPcdash = new javax.swing.JTextField();
        BusAMcdash = new javax.swing.JTextField();
        Busnamecdash = new javax.swing.JTextField();
        Labelfilcda = new javax.swing.JLabel();
        BusnameCDA = new javax.swing.JTextField();
        AgregarCDA = new javax.swing.JButton();
        ModCDA = new javax.swing.JButton();
        botonWeb7 = new botones.BotonWeb();
        jLabel162 = new javax.swing.JLabel();
        Filtroscda = new javax.swing.JComboBox<>();
        FilAPCDA = new javax.swing.JTextField();
        FillAMCDA = new javax.swing.JTextField();
        Eliminarcda = new javax.swing.JButton();
        TPDCDA = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel129 = new javax.swing.JLabel();
        NREcda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TPCDA = new javax.swing.JTable();
        jLabel150 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        obdpagocda = new javax.swing.JTextArea();
        jLabel152 = new javax.swing.JLabel();
        NFpagocda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel155 = new javax.swing.JLabel();
        FilPCDA = new javax.swing.JComboBox<>();
        labelpcda = new javax.swing.JLabel();
        FilnamePCDA = new javax.swing.JTextField();
        FilAPPCDA = new javax.swing.JTextField();
        FilAMPCDA = new javax.swing.JTextField();
        botonWeb8 = new botones.BotonWeb();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        Nomina1 = new javax.swing.JMenuItem();
        Administradores = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        UsuariosRH = new javax.swing.JMenuItem();
        General = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        DO1.setText("0");

        DO2.setText("0");

        R1.setText("0");

        R2.setText("0");

        dt1.setText("0");

        dt2.setText("0");

        dt3.setText("0");

        dt4.setText("0");

        DL1.setText("0");

        dt5.setText("0");

        DL2.setText("0");

        dt6.setText("0");

        F1.setText("0");

        F2.setText("0");

        FJ1.setText("0");

        FJ2.setText("0");

        FJ3.setText("0");

        FJ4.setText("0");

        FJ5.setText("0");

        dt7.setText("0");

        dt8.setText("0");

        dt9.setText("0");

        dt10.setText("0");

        dt11.setText("0");

        dt12.setText("0");

        dt13.setText("0");

        dt14.setText("0");

        dt15.setText("0");

        R3.setText("0");

        R4.setText("0");

        R5.setText("0");

        R6.setText("0");

        R7.setText("0");

        R8.setText("0");

        R9.setText("0");

        R10.setText("0");

        R11.setText("0");

        R12.setText("0");

        R13.setText("0");

        R14.setText("0");

        R15.setText("0");

        DO3.setText("0");

        DO4.setText("0");

        DO5.setText("0");

        DO6.setText("0");

        DO7.setText("0");

        DO8.setText("0");

        DO9.setText("0");

        DO10.setText("0");

        DO11.setText("0");

        DO12.setText("0");

        DO13.setText("0");

        DO14.setText("0");

        DO15.setText("0");

        F3.setText("0");

        F4.setText("0");

        F5.setText("0");

        F6.setText("0");

        F7.setText("0");

        F8.setText("0");

        F9.setText("0");

        F10.setText("0");

        F11.setText("0");

        F12.setText("0");

        F13.setText("0");

        F14.setText("0");

        F15.setText("0");

        DL3.setText("0");

        DL4.setText("0");

        DL5.setText("0");

        DL6.setText("0");

        DL7.setText("0");

        DL8.setText("0");

        DL9.setText("0");

        DL10.setText("0");

        DL11.setText("0");

        DL12.setText("0");

        DL13.setText("0");

        DL14.setText("0");

        DL15.setText("0");

        DL16.setText("0");

        dt16.setText("0");

        R16.setText("0");

        DO16.setText("0");

        FJ16.setText("0");

        F16.setText("0");

        FJ6.setText("0");

        FJ7.setText("0");

        FJ8.setText("0");

        FJ9.setText("0");

        FJ10.setText("0");

        FJ11.setText("0");

        FJ12.setText("0");

        FJ13.setText("0");

        FJ14.setText("0");

        FJ15.setText("0");

        DSGS1.setText("0");

        DSGS2.setText("0");

        DSGS3.setText("0");

        DSGS4.setText("0");

        DSGS5.setText("0");

        DSGS6.setText("0");

        DSGS7.setText("0");

        DSGS8.setText("0");

        DSGS9.setText("0");

        DSGS10.setText("0");

        DSGS11.setText("0");

        DSGS12.setText("0");

        DSGS13.setText("0");

        DSGS14.setText("0");

        DSGS15.setText("0");

        DSGS16.setText("0");

        Q6.setText("0");

        Q8.setText("0");

        Q2.setText("0");

        Q4.setText("0");

        Q11.setText("0");

        Q10.setText("0");

        Q9.setText("0");

        Q25.setText("0");

        Q7.setText("0");

        Q26.setText("0");

        Q5.setText("0");

        Q27.setText("0");

        Q3.setText("0");

        Q28.setText("0");

        Q1.setText("0");

        Q24.setText("0");

        Q23.setText("0");

        Q22.setText("0");

        Q21.setText("0");

        Q20.setText("0");

        Q19.setText("0");

        Q18.setText("0");

        Q17.setText("0");

        Q16.setText("0");

        Q15.setText("0");

        Q14.setText("0");

        Q13.setText("0");

        Q12.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina Quincenal");

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));

        jLabel133.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel133.setText("Datos del empleado.");

        Datgen.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("# Lista:");

        jLabel2.setText("Apellido P:");

        jLabel4.setText("Apellido M:");

        jLabel27.setText("Nombres(s):");

        jLabel127.setText("# empleado:");

        NEnom.setText("0");

        jLabel159.setText("# Folio:");

        NFnom.setText("0");
        NFnom.setEnabled(false);

        javax.swing.GroupLayout DatgenLayout = new javax.swing.GroupLayout(Datgen);
        Datgen.setLayout(DatgenLayout);
        DatgenLayout.setHorizontalGroup(
            DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatgenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel159)
                    .addComponent(jLabel127)
                    .addComponent(jLabel27)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NDL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Ap, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(NEnom, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(NFnom))
                .addContainerGap())
        );
        DatgenLayout.setVerticalGroup(
            DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatgenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel159)
                    .addComponent(NFnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(NEnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel26.setText("Por dia:");

        BAMNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAMNomKeyReleased(evt);
            }
        });

        FiltrosNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosNom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosNomItemStateChanged(evt);
            }
        });

        jLabel28.setText("Filtrar por:");

        CS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS.setText("Cerrar sesion");
        CS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSActionPerformed(evt);
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
        jScrollPane2.setViewportView(share);

        BAPNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAPNomKeyReleased(evt);
            }
        });

        Filtro1.setText("Buscar empleado:");

        BNameNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BNameNomKeyReleased(evt);
            }
        });

        pd.setText("0");

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));

        Quincenas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Quincena", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        Quincenas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                QuincenasItemStateChanged(evt);
            }
        });

        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setText("0");

        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setText("0");

        d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d2.setText("0");

        d3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d3.setText("0");

        d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4.setText("0");

        d5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d5.setText("0");

        d6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d6.setText("0");

        d7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d7.setText("0");

        d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8.setText("0");

        d9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d9.setText("0");

        d10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d10.setText("0");

        d11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d11.setText("0");

        d12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d12.setText("0");

        d13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d13.setText("0");

        d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d14.setText("0");

        d15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d15.setText("0");

        Dia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia1ItemStateChanged(evt);
            }
        });

        DIa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DIa2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DIa2ItemStateChanged(evt);
            }
        });

        Dia3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia3ItemStateChanged(evt);
            }
        });

        Dia4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia4ItemStateChanged(evt);
            }
        });

        Dia5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia5ItemStateChanged(evt);
            }
        });

        Dia6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia6ItemStateChanged(evt);
            }
        });

        Dia7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia7ItemStateChanged(evt);
            }
        });

        Dia8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia8ItemStateChanged(evt);
            }
        });

        Dia9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia9ItemStateChanged(evt);
            }
        });

        Dia10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia10ItemStateChanged(evt);
            }
        });

        Dia11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia11ItemStateChanged(evt);
            }
        });

        Dia12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia12ItemStateChanged(evt);
            }
        });

        Dia13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia13ItemStateChanged(evt);
            }
        });

        Dia14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia14ItemStateChanged(evt);
            }
        });

        Dia15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia15ItemStateChanged(evt);
            }
        });

        Dia16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        Dia16.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia16ItemStateChanged(evt);
            }
        });

        jLabel10.setText("Nomina");

        jLabel91.setText("Año:");

        año.setDateFormatString("yyyy");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(d15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(Dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DIa2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dia16, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel91)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel91)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Dia3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DIa2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Dia1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(d, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(d9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addContainerGap())
        );

        jLabel3.setText("Bono");

        Bsi.setText("Si");
        Bsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsiActionPerformed(evt);
            }
        });

        Bno.setText("No");
        Bno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnoActionPerformed(evt);
            }
        });

        Bono.setText("0");

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));

        jLabel6.setText("Servicio:");

        jLabel14.setText("Zona:");

        jLabel90.setText("Bono:");

        Bono1.setText("0");

        jLabel5.setText("Cuenta de Banco:");

        jLabel7.setText("Sueldo:");

        sueldo.setText("0");

        jLabel13.setText("Banco:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bono1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ServN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(Zon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                            .addComponent(cta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ServN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(Bono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        jLabel134.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel134.setText("Egresos:");

        F.setText("0");

        jLabel18.setText("Dias con faltas:");

        jLabel137.setText("Descuento por faltas:");

        DPF.setText("0");

        jLabel24.setText("Desc IMSS:");

        DI.setText("26.98");
        DI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIActionPerformed(evt);
            }
        });
        DI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DIKeyReleased(evt);
            }
        });

        SHPresnom.setModel(new javax.swing.table.DefaultTableModel(
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
        SHPresnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHPresnomMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(SHPresnom);

        jLabel144.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel144.setText("Prestamos:");

        SHCDAnom.setModel(new javax.swing.table.DefaultTableModel(
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
        SHCDAnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHCDAnomMouseClicked(evt);
            }
        });
        jScrollPane18.setViewportView(SHCDAnom);

        cda.setText("0");
        cda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdaKeyReleased(evt);
            }
        });

        jLabel22.setText("Ahorro por Qna:");

        jLabel145.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel145.setText("Caja de ahorro:");

        jLabel146.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel146.setText("Orden de Taller:");

        SHODTnom.setModel(new javax.swing.table.DefaultTableModel(
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
        SHODTnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHODTnomMouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(SHODTnom);

        jLabel29.setText("Orden de taller:");

        Odtp.setText("0");
        Odtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OdtpKeyReleased(evt);
            }
        });

        jLabel130.setText("Qnas ahorradas:");

        QAcdanom.setText("0");

        jLabel132.setText("# caja:");

        NCDANom.setText("0");

        jLabel139.setText("Total ahorrado:");

        TACDANOM.setText("0");

        jLabel131.setText("# Prestamo:");

        NumPrenom.setText("0");

        jLabel140.setText("Pagado:");

        Pagadoprenom.setText("0");

        jLabel141.setText("Pendiente:");

        Pendienteprenom.setText("0");

        jLabel142.setText("Pagado:");

        PagODTnom.setText("0");

        jLabel143.setText("# de orden:");

        NODTnom.setText("0");

        jLabel147.setText("Pendiente:");

        PenODTnom.setText("0");

        jLabel74.setText("Pago de prestamo:");

        Presp.setText("0");
        Presp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrespKeyReleased(evt);
            }
        });

        jLabel148.setText("# Quincena:");

        NQprenom.setText("0");

        jLabel149.setText("# Quincena:");

        NQODTnom.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(257, 257, 257)
                                .addComponent(jLabel145))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(236, 236, 236)
                                .addComponent(jLabel146))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(263, 263, 263)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel144)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel134)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane19)
                            .addComponent(jScrollPane17)
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel10Layout.createSequentialGroup()
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel137)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DPF))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel132)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NCDANom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel130)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QAcdanom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel139)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TACDANOM, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel143)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel149)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NQODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel142)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PagODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel147)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PenODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel131)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel148)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NQprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel140)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pagadoprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel141)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pendienteprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel74)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 72, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(F)
                    .addComponent(jLabel137)
                    .addComponent(DPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel74)
                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel131)
                        .addComponent(NumPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel140)
                        .addComponent(Pagadoprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel141)
                        .addComponent(Pendienteprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(NQprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel130)
                    .addComponent(QAcdanom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel132)
                    .addComponent(NCDANom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139)
                    .addComponent(TACDANOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel146)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel142)
                    .addComponent(PagODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(NODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147)
                    .addComponent(PenODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149)
                    .addComponent(NQODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));

        Dpi.setText("0");

        jLabel105.setText("Dias de incapacidad:");

        Ddv.setText("0");

        jLabel107.setText("Dias de vacaciones:");

        DD.setText("0");

        jLabel103.setText("Dias descansados:");

        jLabel15.setText("Dias Laborados:");

        DL.setText("0");

        jLabel16.setText("Descansos Trabajados:");

        dt.setText("0");

        LabelDSGS.setText("Descanso sin goce de sueldo:");

        DSGS.setText("0");

        jLabel135.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel135.setText("Ingresos:");

        jLabel104.setText("Pago de seguro:");

        PDDDV.setText("0");

        jLabel9.setText("Pago de dias de vacaciones:");

        jLabel88.setText("Pago de dias descansados:");

        PDDD.setText("0");

        pds.setText("0");

        jLabel128.setText("Pago de dias laborados:");

        PDDL.setText("0");

        jLabel21.setText("Pago de descansos trabajados:");

        PDDT.setText("0");

        jLabel136.setText("Pago de dias de DSGS:");

        PDDDDSGS.setText("0");
        PDDDDSGS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PDDDDSGSKeyReleased(evt);
            }
        });

        jLabel19.setText("Faltas Justificadas:");

        jLabel31.setText("Descanso Otorgado:");

        DO.setText("0");

        jLabel17.setText("Apoyo:");

        apy.setText("0");
        apy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apyKeyReleased(evt);
            }
        });

        jLabel76.setText("Lugar:");

        FJ.setText("0");

        Rembolso.setText("0");
        Rembolso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RembolsoKeyReleased(evt);
            }
        });

        jLabel87.setText("Rembolso:");

        ADD.setText("0");
        ADD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ADDKeyReleased(evt);
            }
        });

        jLabel25.setText("Adicionales:");

        jLabel20.setText("Dias con retardos:");

        R.setText("0");

        jLabel138.setText("Pago con retardos:");

        PCR.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel19)
                            .addComponent(LabelDSGS)
                            .addComponent(jLabel31)
                            .addComponent(jLabel17)
                            .addComponent(jLabel76))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DO)
                                    .addComponent(FJ)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DSGS)
                                        .addGap(24, 24, 24)
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel88)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel104)
                                            .addComponent(jLabel128)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel136)
                                            .addComponent(jLabel138))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDDDV)
                                    .addComponent(PDDD)
                                    .addComponent(pds)
                                    .addComponent(PDDL)
                                    .addComponent(PDDT)
                                    .addComponent(PCR)
                                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(apy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Lugar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel87)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Rembolso, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                                    .addComponent(ADD)))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel135)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DL))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DD))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ddv))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dpi)
                            .addComponent(R))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(R)
                    .addComponent(jLabel138)
                    .addComponent(PCR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dpi)
                    .addComponent(jLabel105)
                    .addComponent(jLabel104)
                    .addComponent(pds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ddv)
                    .addComponent(jLabel107)
                    .addComponent(jLabel9)
                    .addComponent(PDDDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DD)
                    .addComponent(jLabel103)
                    .addComponent(jLabel88)
                    .addComponent(PDDD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(DL)
                    .addComponent(jLabel128)
                    .addComponent(PDDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dt)
                    .addComponent(jLabel21)
                    .addComponent(PDDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDSGS)
                    .addComponent(DSGS)
                    .addComponent(jLabel136)
                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(FJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(DO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));

        jLabel23.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel23.setText("Descuentos varios:");

        jLabel89.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel89.setText("Total de descuentos varios:");

        DVT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DVT.setText("0");

        jLabel75.setText("Faltantes de boleto:");

        Fdb.setText("0");
        Fdb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FdbKeyReleased(evt);
            }
        });

        jLabel79.setText("Sancion:");

        Sancion.setText("0");
        Sancion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SancionKeyReleased(evt);
            }
        });

        jLabel82.setText("Chamarra:");

        Chamarra.setText("0");
        Chamarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChamarraKeyReleased(evt);
            }
        });

        jLabel85.setText("Chaleco:");

        Chaleco.setText("0");
        Chaleco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChalecoKeyReleased(evt);
            }
        });

        jLabel77.setText("Faltante de efectivo:");

        Fde.setText("0");
        Fde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FdeKeyReleased(evt);
            }
        });

        jLabel80.setText("Grua:");

        Grua.setText("0");
        Grua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GruaKeyReleased(evt);
            }
        });

        jLabel83.setText("Pantalon:");

        Pantalon.setText("0");
        Pantalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PantalonKeyReleased(evt);
            }
        });

        jLabel86.setText("Credencial:");

        Credencial.setText("0");
        Credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CredencialKeyReleased(evt);
            }
        });

        jLabel78.setText("Boleto perdido:");

        Bp.setText("0");
        Bp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BpKeyReleased(evt);
            }
        });

        jLabel81.setText("Playera:");

        Playera.setText("0");
        Playera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PlayeraKeyReleased(evt);
            }
        });

        jLabel84.setText("Corbata:");

        Corbata.setText("0");
        Corbata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CorbataKeyReleased(evt);
            }
        });

        jLabel167.setText("Adelanto de nomina:");

        AdN.setText("0");
        AdN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AdNKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel23))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DVT))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel75)
                            .addComponent(jLabel82)
                            .addComponent(jLabel85)
                            .addComponent(jLabel77)
                            .addComponent(jLabel80))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel84))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel81))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel78))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                                .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel83)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pantalon, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Credencial, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Bp, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Playera, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Corbata, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(AdN))))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel83)
                    .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(Credencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel78)
                    .addComponent(Bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(Playera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel84)
                    .addComponent(Corbata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel167)
                    .addComponent(AdN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(DVT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        obs.setColumns(20);
        obs.setLineWrap(true);
        obs.setRows(5);
        jScrollPane20.setViewportView(obs);

        jPanel11.setBackground(new java.awt.Color(153, 255, 153));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel11.setText("Deposito:");

        AgregarNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AgregarNP.setText("Agregar");
        AgregarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNPActionPerformed(evt);
            }
        });

        Modm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        Modm.setText("Modificar");
        Modm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModmActionPerformed(evt);
            }
        });

        deposito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deposito.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deposito))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(AgregarNP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(Modm)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNP)
                    .addComponent(Modm))
                .addContainerGap())
        );

        jLabel12.setText("Observaciones:");

        jPanel21.setBackground(new java.awt.Color(204, 255, 255));

        jLabel48.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel48.setText("Dias festivos.");

        jLabel73.setText("- 1o. de enero.");

        jLabel126.setText("- El primer lunes de febrero en conmemoración del 5 de febrero");

        jLabel154.setText("- El tercer lunes de marzo en conmemoración del 21 de marzo");

        jLabel156.setText("- 1o. de mayo");

        jLabel158.setText("- 16 de septiembre");

        jLabel163.setText("- El tercer lunes de noviembre en conmemoración del 20 de noviembre;");

        jLabel164.setText("- El 1o. de diciembre de cada seis años, cuando corresponda a la transmisión del Poder Ejecutivo Federal");

        jLabel165.setText("- 25 de diciembre");

        jLabel166.setText("- El que determinen las leyes federales y locales electorales, en el caso de elecciones ordinarias, para efectuar la jornada electoral");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel158))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel48))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel73))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel126))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel164))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel156))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel154))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel163))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel165))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel166)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel48)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel156)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel158)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel163)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel165)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel166)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(Datgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel133)
                                        .addGap(119, 119, 119)))
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Filtro1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BNameNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(CS))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Bsi)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addComponent(Bno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel3))))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel17Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel12))
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtro1)
                            .addComponent(BNameNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(CS)
                            .addComponent(jLabel133))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Datgen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bno)
                            .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Nomina.setViewportView(jPanel17);

        jTabbedPane1.addTab("Nomina Quincenal", Nomina);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        Tnom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18", "Title 19", "Title 20", "Title 21", "Title 22", "Title 23", "Title 24", "Title 25", "Title 26", "Title 27", "Title 28", "Title 29", "Title 30", "Title 31", "Title 32", "Title 33", "Title 34", "Title 35", "Title 36", "Title 37", "Title 38", "Title 39", "Title 40", "Title 41", "Title 42", "Title 43", "Title 44", "Title 45", "Title 46", "Title 47", "Title 48", "Title 49", "Title 50"
            }
        ));
        Tnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TnomMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tnom);

        LabelBE.setText("Buscar Empleado:");

        Nominab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NominabKeyReleased(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        CS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS2.setText("Cerrar sesion");
        CS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS2ActionPerformed(evt);
            }
        });

        LabelBZ.setText("Buscar Zona");

        FiltroZnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZnominaItemStateChanged(evt);
            }
        });

        LabelBS.setText("Buscar Servicio:");

        FiltroSnomina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnominaItemStateChanged(evt);
            }
        });

        LabelBQ.setText("Buscar Quincena:");

        FiltroQuincenanomina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanominaItemStateChanged(evt);
            }
        });

        LabelSZ.setText("Selecciona Zona:");

        FZservicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicioItemStateChanged(evt);
            }
        });

        jLabel65.setText("Filtros:");

        FiltrosTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTDItemStateChanged(evt);
            }
        });

        LabelBNDF.setText("Buscar por # Lista");

        FiltroNDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDFKeyReleased(evt);
            }
        });

        FApT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApTKeyReleased(evt);
            }
        });

        FAmT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmTKeyReleased(evt);
            }
        });

        botonWeb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb1.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroZnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS2))
                .addContainerGap(6745, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE)
                    .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar)
                    .addComponent(LabelBZ)
                    .addComponent(FiltroZnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS)
                    .addComponent(FiltroSnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ)
                    .addComponent(FiltroQuincenanomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ)
                    .addComponent(FZservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF)
                    .addComponent(FiltroNDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS2)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDnomina.setViewportView(jPanel2);

        jTabbedPane1.addTab("Tabla Detallada", TDnomina);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jScrollPane6.setViewportView(pago);

        LabelBEP.setText("Buscar empleado:");

        busp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buspKeyReleased(evt);
            }
        });

        CS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS3.setText("Cerrar sesion");
        CS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS3ActionPerformed(evt);
            }
        });

        LabelBZP.setText("Buscar zona:");

        FiltroZP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroZP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZPItemStateChanged(evt);
            }
        });

        LabelSZP.setText("Seleccionar zona:");

        FiltroSZP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZPItemStateChanged(evt);
            }
        });

        LabelBSP.setText("Buscar servicio:");

        FiltroServP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServPItemStateChanged(evt);
            }
        });

        LabelNDFP.setText("# de Lista");

        filtroNDFP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFPKeyReleased(evt);
            }
        });

        LabelBQP.setText("Buscar quincena:");

        FiltroQP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQPItemStateChanged(evt);
            }
        });

        jLabel64.setText("Filtrar:");

        FiltrosP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosPItemStateChanged(evt);
            }
        });

        BAppag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppagKeyReleased(evt);
            }
        });

        Bampag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BampagKeyReleased(evt);
            }
        });

        botonWeb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb2.setToolTipText("");
        botonWeb2.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAppag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bampag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBZP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroServP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNDFP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtroNDFP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 2252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP)
                    .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBZP)
                    .addComponent(FiltroZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP)
                    .addComponent(FiltroSZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP)
                    .addComponent(FiltroServP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP)
                    .addComponent(filtroNDFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP)
                    .addComponent(FiltroQP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(FiltrosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS3)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos.setViewportView(jPanel3);

        jTabbedPane1.addTab("Tabla Pagos", TPagos);

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
                                        .addGap(0, 382, Short.MAX_VALUE))))
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
                                .addGap(0, 647, Short.MAX_VALUE))))
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
                        .addGap(0, 855, Short.MAX_VALUE)))
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

        jTabbedPane1.addTab("Prestamos", Prestamos);

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

        Tprestamos.setViewportView(jPanel5);

        jTabbedPane1.addTab("Tabla prestamos", Tprestamos);

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
                        .addGap(0, 825, Short.MAX_VALUE)))
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

        jTabbedPane1.addTab("Tabla pagos de prestamos", TPDP);

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jLabel49.setText("# De orden:");

        jLabel50.setText("Fecha de Expedicion:");

        jLabel51.setText("Costo total");

        jLabel52.setText("Ingreso a taller:");

        jLabel53.setText("Status");

        jLabel54.setText("Importe a descontar");

        jLabel55.setText("Descuento a responsable");

        jLabel56.setText("Forma de pago:");

        jLabel57.setText("Observaciones:");

        CT.setText("0");
        CT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTKeyReleased(evt);
            }
        });

        Si.setText("Si");

        no.setText("No");

        Paodt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Pago a cliente", "Pago a cerrajeria", "Vencida", "Pago a taller" }));

        Iad.setText("0");

        jLabel59.setText("Pagado:");

        Pagado.setText("0");
        Pagado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PagadoKeyReleased(evt);
            }
        });

        jLabel60.setText("Pendiente:");

        Fdp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Deposito", "Efectivo", "Transferencia" }));

        Observaciones.setColumns(20);
        Observaciones.setLineWrap(true);
        Observaciones.setRows(5);
        jScrollPane4.setViewportView(Observaciones);

        Ndo.setText("0");

        share2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        share2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                share2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(share2);

        LabelPrestamos1.setText("Buscar empleado:");

        BE1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BE1KeyReleased(evt);
            }
        });

        Agregartaller.setText("Agregar");
        Agregartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregartallerActionPerformed(evt);
            }
        });

        Modificartaller.setText("Modificar");
        Modificartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificartallerActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel62.setText("Daño:");

        jLabel63.setText("Responsable");

        Daño.setColumns(20);
        Daño.setLineWrap(true);
        Daño.setRows(5);
        jScrollPane7.setViewportView(Daño);

        jLabel66.setText("Apellido P:");

        jLabel67.setText("Zona:");

        jLabel68.setText("Servicio:");

        jLabel69.setText("Datos vehiculo");

        jLabel70.setText("# De piezas:");

        jLabel61.setText("Apellido M:");

        jLabel92.setText("Nombre(s)");

        jLabel93.setText("Marca:");

        jLabel94.setText("Modelo:");

        jLabel95.setText("Placas:");

        jLabel96.setText("Color:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel63))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel68)
                            .addComponent(jLabel67)
                            .addComponent(jLabel66)
                            .addComponent(jLabel61)
                            .addComponent(jLabel92)
                            .addComponent(jLabel62)
                            .addComponent(jLabel96)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(ndp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zona1)
                            .addComponent(Serv1)
                            .addComponent(ApTaller)
                            .addComponent(Amtaller)
                            .addComponent(NameTaller)
                            .addComponent(Marca)
                            .addComponent(Modelo)
                            .addComponent(Placas)
                            .addComponent(Color))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(86, 86, 86))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(ApTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(Amtaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(NameTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(Zona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(Serv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(Placas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(ndp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(16, 16, 16))
        );

        jLabel71.setText("Quincenas a pagar:");

        QAP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "1 Quincena", "2 Quincenas", "3 Quincenas", "4 Quincenas", "5 Quincenas", "6 Quincenas", "7 Quincenas", "8 Quincenas", "9 Quincenas", "10 Quincenas", "11 Quincenas", "12 Quincenas", "13 Quincenas", "14 Quincenas", "15 Quincenas", "16 Quincenas", "17 Quincenas", "18 Quincenas", "19 Quincenas", "20 Quincenas", "21 Quincenas", "22 Quincenas", "23 Quincenas", "24 Quincenas" }));
        QAP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                QAPItemStateChanged(evt);
            }
        });

        jLabel72.setText("Por Quincena:");

        CS6.setText("Cerrar sesion");
        CS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS6ActionPerformed(evt);
            }
        });

        FshT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FshT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FshTItemStateChanged(evt);
            }
        });

        Busapshpre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Busapshpre1KeyReleased(evt);
            }
        });

        Busamshpre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Busamshpre1KeyReleased(evt);
            }
        });

        jLabel32.setText("Filtros:");

        jLabel151.setText("Quincenas pagadas:");

        QPodt.setText("0");

        Statusodt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Debe", "Pagado", "Baja" }));

        jLabel168.setText("Pago a:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel57))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Agregartaller)
                                            .addComponent(Modificartaller)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Si)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Fdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel55))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Iad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pagado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel151)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QPodt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Statusodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel168)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Paodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PQT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FshT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelPrestamos1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BE1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Busapshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Busamshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CS6)
                                        .addGap(0, 107, Short.MAX_VALUE))
                                    .addComponent(jScrollPane5)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ndo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(Ndo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(FshT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrestamos1)
                    .addComponent(BE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busapshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busamshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CS6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(Modificartaller)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Agregartaller))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel51)
                                        .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel52)
                                        .addComponent(Si)
                                        .addComponent(no)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel71)
                                        .addComponent(QAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel72)
                                        .addComponent(Paodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel53)
                                        .addComponent(PQT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Statusodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel168))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56)
                                .addComponent(Fdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel54)
                                .addComponent(Iad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel59)
                                .addComponent(Pagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60)
                                .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel151)
                                .addComponent(QPodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(355, Short.MAX_VALUE))
        );

        Talleres.setViewportView(jPanel6);

        jTabbedPane1.addTab("Talleres", Talleres);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        Labelfilodt.setText("Buscar Orden de taller por nombre:");

        Fnameodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FnameodtKeyReleased(evt);
            }
        });

        OdT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18", "Title 19", "Title 20"
            }
        ));
        OdT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OdTMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(OdT);

        EliminarT.setText("Eliminar");
        EliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTActionPerformed(evt);
            }
        });

        CS7.setText("Cerrar sesion");
        CS7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS7ActionPerformed(evt);
            }
        });

        botonWeb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb4.setToolTipText("");
        botonWeb4.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCOdTaller.php");

        jLabel161.setText("Filtros:");

        FiltrosTODT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosTODT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTODTItemStateChanged(evt);
            }
        });

        FilApodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilApodtKeyReleased(evt);
            }
        });

        FilAmodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAmodtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Labelfilodt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fnameodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilApodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAmodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CS7))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 4964, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labelfilodt)
                    .addComponent(Fnameodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarT)
                    .addComponent(CS7)
                    .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161)
                    .addComponent(FiltrosTODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilApodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAmodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        TTalleres.setViewportView(jPanel8);

        jTabbedPane1.addTab("Tabla talleres", TTalleres);

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
        jScrollPane11.setViewportView(TPODT);

        jLabel153.setText("Filtros:");

        FiltrosPDODT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
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

        botonWeb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb6.setToolTipText("");
        botonWeb6.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosPrestamosQuin.php");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosPDODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelfilPODT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilnamePODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilApPODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAmPODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 812, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel153)
                        .addComponent(FiltrosPDODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelfilPODT)
                        .addComponent(FilnamePODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilApPODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilAmPODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonWeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        TDPODT.setViewportView(jPanel19);

        jTabbedPane1.addTab("Tabla pagos de ODT", TDPODT);

        jLabel98.setText("# empleado:");

        jLabel101.setText("Apellido P:");

        jLabel102.setText("Apellido M");

        jLabel106.setText("Nombre(s):");

        jLabel108.setText("Zona:");

        jLabel109.setText("Servicio:");

        numEcda.setText("0");

        servcda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                servcdaActionPerformed(evt);
            }
        });

        jLabel116.setText("# Caja:");

        Numcda.setText("0");

        jLabel117.setText("Observaciones:");

        Obscda.setColumns(20);
        Obscda.setLineWrap(true);
        Obscda.setRows(5);
        jScrollPane13.setViewportView(Obscda);

        jLabel118.setText("Filtros:");

        Filsharecda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        Filsharecda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilsharecdaItemStateChanged(evt);
            }
        });

        jLabel119.setText("Detalles de caja:");

        ShareCDA.setModel(new javax.swing.table.DefaultTableModel(
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
        ShareCDA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShareCDAMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(ShareCDA);

        jLabel124.setText("Total en la caja:");

        TELC.setText("0");

        Tablacda.setModel(new javax.swing.table.DefaultTableModel(
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
        Tablacda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablacdaMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(Tablacda);

        CalIn.setText("Calcular interes.");
        CalIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalInActionPerformed(evt);
            }
        });

        jLabel125.setText("Total interes a pagar:");

        TIAP.setText("0");

        jLabel110.setText("Ahorro por Qna:");

        jLabel120.setText("Total a pagar:");

        jLabel111.setText("Qnas ahorradas:");

        jLabel112.setText("Total ahorrado:");

        Totalap.setText("0");

        jLabel121.setText("% Interes:");

        jLabel113.setText("Caja anticipada:");

        jLabel122.setText("Interes a pagar:");

        APQ.setText("0");
        APQ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                APQKeyReleased(evt);
            }
        });

        jLabel123.setText("Por pagar final:");

        QAdas.setText("0");
        QAdas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QAdasKeyReleased(evt);
            }
        });

        TArrado.setText("0");

        PorcenIn.setText("0");

        CajaA.setText("0");
        CajaA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CajaAKeyReleased(evt);
            }
        });

        IAP.setText("0");

        PPF.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel123)
                    .addComponent(jLabel122)
                    .addComponent(jLabel113)
                    .addComponent(jLabel112)
                    .addComponent(jLabel111)
                    .addComponent(jLabel110)
                    .addComponent(jLabel120)
                    .addComponent(jLabel121))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(CajaA, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(TArrado)
                        .addComponent(Totalap, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(QAdas, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(APQ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(PorcenIn, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IAP, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(PPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel110)
                    .addComponent(APQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel111)
                    .addComponent(QAdas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel112)
                    .addComponent(TArrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel113)
                    .addComponent(CajaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(Totalap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel121)
                    .addComponent(PorcenIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel122)
                    .addComponent(IAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(PPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Obs1cda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "ABANDONA", "PAGADA", "DEBE" }));

        jLabel114.setText("Status:");

        Statuscda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "BAJA", "BAJA TEMPORAL", "SALE DE CAJA", "VIGENTE" }));

        jLabel115.setText("Observacione 1:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel115)
                    .addComponent(jLabel114))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Statuscda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Obs1cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel114)
                    .addComponent(Statuscda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(Obs1cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        Labelcda.setText("jLabel126");

        BusAPcdash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusAPcdashKeyReleased(evt);
            }
        });

        BusAMcdash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusAMcdashKeyReleased(evt);
            }
        });

        Busnamecdash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusnamecdashKeyReleased(evt);
            }
        });

        Labelfilcda.setText("Buscar por nombre(s):");

        BusnameCDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusnameCDAKeyReleased(evt);
            }
        });

        AgregarCDA.setText("Agregar");
        AgregarCDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCDAActionPerformed(evt);
            }
        });

        ModCDA.setText("Modificar");
        ModCDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModCDAActionPerformed(evt);
            }
        });

        botonWeb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb7.setToolTipText("");
        botonWeb7.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCCda.php");

        jLabel162.setText("Filtros:");

        Filtroscda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        Filtroscda.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroscdaItemStateChanged(evt);
            }
        });

        FilAPCDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAPCDAKeyReleased(evt);
            }
        });

        FillAMCDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillAMCDAKeyReleased(evt);
            }
        });

        Eliminarcda.setText("Eliminar");
        Eliminarcda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarcdaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel118)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filsharecda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Labelcda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BusAPcdash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BusAMcdash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busnamecdash, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel116)
                            .addComponent(jLabel98)
                            .addComponent(jLabel101)
                            .addComponent(jLabel102))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(APcda)
                            .addComponent(AMcda)
                            .addComponent(numEcda, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                            .addComponent(Numcda))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel109)
                            .addComponent(jLabel108)
                            .addComponent(jLabel106))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(servcda, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(zonacda)
                            .addComponent(namecda)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel119))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CalIn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel117))
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel125)
                                            .addComponent(jLabel124))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TELC)
                                            .addComponent(TIAP, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(AgregarCDA)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ModCDA)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel162)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filtroscda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Labelfilcda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BusnameCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FilAPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FillAMCDA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Eliminarcda))
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 2500, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(Numcda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel118)
                    .addComponent(Filsharecda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Labelcda)
                    .addComponent(BusAPcdash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusAMcdash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busnamecdash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel106)
                                .addComponent(namecda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel108)
                                .addComponent(zonacda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel109)
                                .addComponent(servcda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel14Layout.createSequentialGroup()
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel98)
                                .addComponent(numEcda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel101)
                                .addComponent(APcda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel102)
                                .addComponent(AMcda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(31, 31, 31)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Labelfilcda)
                        .addComponent(BusnameCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel162)
                        .addComponent(Filtroscda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilAPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FillAMCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Eliminarcda)
                        .addComponent(botonWeb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel119)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addComponent(jLabel117)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel124)
                                    .addComponent(TELC))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel125)
                                    .addComponent(TIAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CalIn)
                                .addGap(59, 59, 59)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgregarCDA)
                            .addComponent(ModCDA))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
        );

        Cajadeahorro.setViewportView(jPanel14);

        jTabbedPane1.addTab("Caja de ahorro", Cajadeahorro);

        jLabel129.setText("# recibo entregado");

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

        jLabel150.setText("Observaciones:");

        obdpagocda.setColumns(20);
        obdpagocda.setRows(5);
        jScrollPane16.setViewportView(obdpagocda);

        jLabel152.setText("# Folio");

        NFpagocda.setEnabled(false);

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel155.setText("Filtro:");

        FilPCDA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
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

        botonWeb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb8.setToolTipText("");
        botonWeb8.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosCda.php");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel129)
                            .addComponent(jLabel150)
                            .addComponent(jLabel152))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(NFpagocda, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(NREcda, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
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
                        .addComponent(botonWeb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1613, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel152)
                        .addComponent(NFpagocda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel155)
                        .addComponent(FilPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(labelpcda)
                        .addComponent(FilnamePCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilAPPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilAMPCDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonWeb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel129)
                            .addComponent(NREcda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel150)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
                .addContainerGap())
        );

        TPDCDA.setViewportView(jPanel1);

        jTabbedPane1.addTab("Tabla pagos de caja de ahorro", TPDCDA);

        Menuadm.setText("Todas las ventanas");

        Nomina1.setText("Ventana Nomina");
        Nomina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nomina1ActionPerformed(evt);
            }
        });
        Menuadm.add(Nomina1);

        Administradores.setText("Administradores");
        Administradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministradoresActionPerformed(evt);
            }
        });
        Menuadm.add(Administradores);

        ZYS.setText("Zonas y Servicios");
        ZYS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZYSActionPerformed(evt);
            }
        });
        Menuadm.add(ZYS);

        UsuariosRH.setText("Usuarios RH");
        UsuariosRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosRHActionPerformed(evt);
            }
        });
        Menuadm.add(UsuariosRH);

        General.setText("Empleados General");
        General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralActionPerformed(evt);
            }
        });
        Menuadm.add(General);

        Estadias.setText("Alumno de estadia");
        Estadias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstadiasActionPerformed(evt);
            }
        });
        Menuadm.add(Estadias);

        Torteria.setText("Empleados Torteria");
        Torteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TorteriaActionPerformed(evt);
            }
        });
        Menuadm.add(Torteria);

        jMenuBar1.add(Menuadm);

        jMenu1.setText("Cambiar a:");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Nomina Semanal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1379, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 897, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nomina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nomina1ActionPerformed
        Admin_NominaQ_5 regr = new Admin_NominaQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Nomina1ActionPerformed

    private void AdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministradoresActionPerformed
        Administradores_3 regr = new Administradores_3();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AdministradoresActionPerformed

    private void ZYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZYSActionPerformed
        AltasZyS_3 regr = new AltasZyS_3();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZYSActionPerformed

    private void UsuariosRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosRHActionPerformed
        Usuarios_RH_3 regr = new Usuarios_RH_3();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsuariosRHActionPerformed

    private void GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralActionPerformed
        Admin_Empleados_4 regr = new Admin_Empleados_4();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GeneralActionPerformed

    private void EstadiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstadiasActionPerformed
        Admin_Estadias_4 regr = new Admin_Estadias_4();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EstadiasActionPerformed

    private void TorteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TorteriaActionPerformed
        Admin_Tortas_4 regr = new Admin_Tortas_4();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_TorteriaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Admin_NominaS_5 regr = new Admin_NominaS_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ModmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModmActionPerformed
        MODN();
        MDCDA();
        MDTPCDA();
        MDTPPres();
        mostrarpagos();
        MDN();
        MDTPODT();
        limpiarnom();
    }//GEN-LAST:event_ModmActionPerformed

    private void AgregarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNPActionPerformed

//operacion para pago de Pres
        double QPREP = Double.parseDouble(this.NQprenom.getText());
        double QPREPT = QPREP + 1;
        NQprenom.setText("" + QPREPT);
        double PPN = Double.parseDouble(this.Pagadoprenom.getText());
        double PENPN = Double.parseDouble(this.Pendienteprenom.getText());
        double PP = Double.parseDouble(this.Presp.getText());
        double TP = PPN + PP;
        Pagadoprenom.setText("" + TP);
        double TPEN = PENPN - PP;
        Pendienteprenom.setText("" + TPEN);

        //Operacion para pago ODT
        double QODTP = Double.parseDouble(this.NQODTnom.getText());
        double QODTPT = QODTP + 1;
        NQODTnom.setText("" + QODTPT);
        double PODTN = Double.parseDouble(this.PagODTnom.getText());
        double ODTPN = Double.parseDouble(this.PenODTnom.getText());
        double ODTP = Double.parseDouble(this.Odtp.getText());
        double TODT = PODTN + ODTP;
        PagODTnom.setText("" + TODT);
        double TODTT = ODTPN - ODTP;
        PenODTnom.setText("" + TODTT);

//operacion para agregar abono CDA
        double APQna = Double.parseDouble(this.cda.getText());
        double QA = Double.parseDouble(this.QAcdanom.getText());
        double QAT = QA + 1;
        QAcdanom.setText("" + QAT);
        double totalahorrado = APQna * (QAT);
        TACDANOM.setText("" + totalahorrado);

        AgregarN();
        AgregarPagoODT();
        editarCDAdnom();
        AgregarPagoCDA();
        AgregarPagoPres();
        sharecdanom();
        MDCDA();
        MDTPCDA();
        MDTPPres();
        mostrarpagos();
        MDN();
        MDTPODT();
        limpiarnom();
    }//GEN-LAST:event_AgregarNPActionPerformed

    private void SancionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SancionKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_SancionKeyReleased

    private void GruaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GruaKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_GruaKeyReleased

    private void BpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BpKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_BpKeyReleased

    private void FdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdeKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_FdeKeyReleased

    private void FdbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdbKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_FdbKeyReleased

    private void CredencialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CredencialKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_CredencialKeyReleased

    private void ChalecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChalecoKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ChalecoKeyReleased

    private void CorbataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorbataKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_CorbataKeyReleased

    private void PantalonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PantalonKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_PantalonKeyReleased

    private void ChamarraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChamarraKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ChamarraKeyReleased

    private void PlayeraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayeraKeyReleased

        desv();
        deposito();
    }//GEN-LAST:event_PlayeraKeyReleased

    private void ADDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADDKeyReleased
        deposito();
    }//GEN-LAST:event_ADDKeyReleased

    private void RembolsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RembolsoKeyReleased
        deposito();
    }//GEN-LAST:event_RembolsoKeyReleased

    private void apyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apyKeyReleased
        deposito();
    }//GEN-LAST:event_apyKeyReleased

    private void OdtpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OdtpKeyReleased
        deposito();
    }//GEN-LAST:event_OdtpKeyReleased

    private void PrespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrespKeyReleased
        deposito();
    }//GEN-LAST:event_PrespKeyReleased

    private void DIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIKeyReleased
        deposito();
    }//GEN-LAST:event_DIKeyReleased

    private void DIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIActionPerformed

    }//GEN-LAST:event_DIActionPerformed

    private void BnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnoActionPerformed

        Bono.setText("0");
        deposito();

    }//GEN-LAST:event_BnoActionPerformed

    private void BsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsiActionPerformed
        String Bonosi = Bono1.getText();
        Bono.setText(Bonosi);
        deposito();
    }//GEN-LAST:event_BsiActionPerformed

    private void Dia16ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia16ItemStateChanged
        String dt = (String) Dia16.getSelectedItem();
        if (dt.equals(".")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("A")) {
            DL16.setText("" + a + "");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("D")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 1;
            in16 = 0;
        }
        if (dt.equals("V")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 1;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("I")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 1;
        }
        if (dt.equals("F")) {
            DL16.setText("0");
            F16.setText("" + a + "");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("FJ")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("" + a + "");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("DT")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("" + a + "");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals(" ")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("" + a + "");
            R16.setText("0");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("R")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("" + a + "");
            DSGS16.setText("0");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        if (dt.equals("DSGS")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("" + a + "");
            dv16 = 0;
            dd16 = 0;
            in16 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DSGS();
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        deposito();
    }//GEN-LAST:event_Dia16ItemStateChanged

    private void Dia15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia15ItemStateChanged

        String ACCION15 = (String) Dia15.getSelectedItem();
        if (ACCION15.equals(".")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("A")) {
            DL15.setText("" + a + "");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("D")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 1;
            in15 = 0;
        }
        if (ACCION15.equals("V")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 1;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("I")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 1;
        }
        if (ACCION15.equals("F")) {
            DL15.setText("0");
            F15.setText("" + a + "");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("FJ")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("" + a + "");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("DT")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("" + a + "");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals(" ")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("" + a + "");
            R15.setText("0");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("R")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("" + a + "");
            DSGS15.setText("0");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        if (ACCION15.equals("DSGS")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("" + a + "");
            dv15 = 0;
            dd15 = 0;
            in15 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia15ItemStateChanged

    private void Dia14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia14ItemStateChanged

        String dt = (String) Dia14.getSelectedItem();
        if (dt.equals(".")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("A")) {
            DL14.setText("" + a + "");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("D")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 1;
            in14 = 0;
        }
        if (dt.equals("V")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 1;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("I")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 1;
        }
        if (dt.equals("F")) {
            DL14.setText("0");
            F14.setText("" + a + "");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("FJ")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("" + a + "");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("DT")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("" + a + "");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals(" ")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("" + a + "");
            R14.setText("0");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("R")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("" + a + "");
            DSGS14.setText("0");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;
        }
        if (dt.equals("DSGS")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("" + a + "");
            dv14 = 0;
            dd14 = 0;
            in14 = 0;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia14ItemStateChanged

    private void Dia13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia13ItemStateChanged

        String ACCION13 = (String) Dia13.getSelectedItem();
        if (ACCION13.equals(".")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals("A")) {
            DL13.setText("" + a + "");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals("D")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 1;
            in13 = 0;
        }
        if (ACCION13.equals("V")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 1;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals("I")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 1;
        }
        if (ACCION13.equals("F")) {
            DL13.setText("0");
            F13.setText("" + a + "");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;

        }
        if (ACCION13.equals("FJ")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("" + a + "");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals("DT")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("" + a + "");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals(" ")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("" + a + "");
            R13.setText("0");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals("R")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("" + a + "");
            DSGS13.setText("0");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        if (ACCION13.equals("DSGS")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("" + a + "");
            dv13 = 0;
            dd13 = 0;
            in13 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia13ItemStateChanged

    private void Dia12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia12ItemStateChanged

        String dt = (String) Dia12.getSelectedItem();
        if (dt.equals(".")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("A")) {
            DL12.setText("" + a + "");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("D")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 1;
            in12 = 0;
        }
        if (dt.equals("V")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 1;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("I")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 1;
        }
        if (dt.equals("F")) {
            DL12.setText("0");
            F12.setText("" + a + "");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("FJ")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("" + a + "");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("DT")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("" + a + "");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals(" ")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("" + a + "");
            R12.setText("0");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("R")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("" + a + "");
            DSGS12.setText("0");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        if (dt.equals("DSGS")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("" + a + "");
            dv12 = 0;
            dd12 = 0;
            in12 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia12ItemStateChanged

    private void Dia11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia11ItemStateChanged

        String dt = (String) Dia11.getSelectedItem();
        if (dt.equals(".")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("A")) {
            DL11.setText("" + a + "");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("D")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 1;
            in11 = 0;
        }
        if (dt.equals("V")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 1;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("I")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 1;
        }
        if (dt.equals("F")) {
            DL11.setText("0");
            F11.setText("" + a + "");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("FJ")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("" + a + "");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("DT")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("" + a + "");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals(" ")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("" + a + "");
            R11.setText("0");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("R")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("" + a + "");
            DSGS11.setText("0");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        if (dt.equals("DSGS")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("" + a + "");
            dv11 = 0;
            dd11 = 0;
            in11 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia11ItemStateChanged

    private void Dia10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia10ItemStateChanged

        String dt = (String) Dia10.getSelectedItem();
        if (dt.equals(".")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("A")) {
            DL10.setText("" + a + "");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("D")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 1;
            in10 = 0;
        }
        if (dt.equals("V")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 1;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("I")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 1;
        }
        if (dt.equals("F")) {
            DL10.setText("0");
            F10.setText("" + a + "");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("FJ")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("" + a + "");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("DT")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("" + a + "");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals(" ")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("" + a + "");
            R10.setText("0");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("R")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("" + a + "");
            DSGS10.setText("0");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        if (dt.equals("DSGS")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("" + a + "");
            dv10 = 0;
            dd10 = 0;
            in10 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia10ItemStateChanged

    private void Dia9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia9ItemStateChanged

        String dt = (String) Dia9.getSelectedItem();
        if (dt.equals(".")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("A")) {
            DL9.setText("" + a + "");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("D")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 1;
            in9 = 0;
        }
        if (dt.equals("V")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 1;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("I")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 1;
        }
        if (dt.equals("F")) {
            DL9.setText("0");
            F9.setText("" + a + "");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("FJ")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("" + a + "");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("DT")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("" + a + "");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals(" ")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("" + a + "");
            R9.setText("0");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("R")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("" + a + "");
            DSGS9.setText("0");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        if (dt.equals("DSGS")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("" + a + "");
            dv9 = 0;
            dd9 = 0;
            in9 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia9ItemStateChanged

    private void Dia8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia8ItemStateChanged

        String dt = (String) Dia8.getSelectedItem();
        if (dt.equals(".")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("A")) {
            DL8.setText("" + a + "");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("D")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 1;
            in8 = 0;
        }
        if (dt.equals("V")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 1;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("I")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 1;
        }
        if (dt.equals("F")) {
            DL8.setText("0");
            F8.setText("" + a + "");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("FJ")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("" + a + "");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("DT")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("" + a + "");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals(" ")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("" + a + "");
            R8.setText("0");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("R")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("" + a + "");
            DSGS8.setText("0");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        if (dt.equals("DSGS")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("" + a + "");
            dv8 = 0;
            dd8 = 0;
            in8 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia8ItemStateChanged

    private void Dia7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia7ItemStateChanged

        String dt = (String) Dia7.getSelectedItem();
        if (dt.equals(".")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("A")) {
            DL7.setText("" + a + "");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("D")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 1;
            in7 = 0;
        }
        if (dt.equals("V")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 1;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("I")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 1;
        }
        if (dt.equals("F")) {
            DL7.setText("0");
            F7.setText("" + a + "");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("FJ")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("" + a + "");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("DT")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("" + a + "");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals(" ")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("" + a + "");
            R7.setText("0");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("R")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("" + a + "");
            DSGS7.setText("0");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        if (dt.equals("DSGS")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("" + a + "");
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia7ItemStateChanged

    private void Dia6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia6ItemStateChanged

        String dt = (String) Dia6.getSelectedItem();
        if (dt.equals(".")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("A")) {
            DL6.setText("" + a + "");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("D")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 1;
            in6 = 0;
        }
        if (dt.equals("V")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 1;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("I")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 1;
        }
        if (dt.equals("F")) {
            DL6.setText("0");
            F6.setText("" + a + "");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("FJ")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("" + a + "");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("DT")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("" + a + "");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals(" ")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("" + a + "");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("R")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("" + a + "");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        if (dt.equals("DSGS")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("" + a + "");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia6ItemStateChanged

    private void Dia5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia5ItemStateChanged

        String dt = (String) Dia5.getSelectedItem();
        if (dt.equals(".")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("A")) {
            DL5.setText("" + a + "");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("D")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 1;
            in5 = 0;
        }
        if (dt.equals("V")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 1;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("I")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 1;
        }
        if (dt.equals("F")) {
            DL5.setText("0");
            F5.setText("" + a + "");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("FJ")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("" + a + "");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("DT")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("" + a + "");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals(" ")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("" + a + "");
            R5.setText("0");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("R")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("" + a + "");
            DSGS5.setText("0");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        if (dt.equals("DSGS")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("" + a + "");
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia5ItemStateChanged

    private void Dia4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia4ItemStateChanged

        String dt = (String) Dia4.getSelectedItem();
        if (dt.equals(".")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("A")) {
            DL4.setText("" + a + "");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("D")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 1;
            in4 = 0;
        }
        if (dt.equals("V")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 1;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("I")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 1;
        }
        if (dt.equals("F")) {
            DL4.setText("0");
            F4.setText("" + a + "");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("FJ")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("" + a + "");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("DT")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("" + a + "");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals(" ")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("" + a + "");
            R4.setText("0");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("R")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("" + a + "");
            DSGS4.setText("0");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        if (dt.equals("DSGS")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("" + a + "");
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia4ItemStateChanged

    private void Dia3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia3ItemStateChanged

        String dt = (String) Dia3.getSelectedItem();
        if (dt.equals(".")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;

        }
        if (dt.equals("A")) {
            DL3.setText("" + a + "");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals("D")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt1.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 1;
            in3 = 0;
        }
        if (dt.equals("V")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 1;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals("I")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 1;
        }
        if (dt.equals("F")) {
            DL3.setText("0");
            F3.setText("" + a + "");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals("FJ")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("" + a + "");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals("DT")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("" + a + "");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals(" ")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("" + a + "");
            R3.setText("0");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals("R")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("" + a + "");
            DSGS3.setText("0");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        if (dt.equals("DSGS")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("" + a + "");
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia3ItemStateChanged

    private void DIa2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DIa2ItemStateChanged

        String dt = (String) DIa2.getSelectedItem();
        if (dt.equals(".")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("A")) {
            DL2.setText("" + a + "");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("D")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 1;
            in2 = 0;
        }
        if (dt.equals("V")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 1;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("I")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 1;
        }
        if (dt.equals("F")) {
            DL2.setText("0");
            F2.setText("" + a + "");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("FJ")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("" + a + "");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("DT")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("" + a + "");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;

        }
        if (dt.equals(" ")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("" + a + "");
            R2.setText("0");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("R")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("" + a + "");
            DSGS2.setText("0");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        if (dt.equals("DSGS")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("" + a + "");
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();

    }//GEN-LAST:event_DIa2ItemStateChanged

    private void Dia1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia1ItemStateChanged

        String dt = (String) Dia1.getSelectedItem();
        if (dt.equals(".")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;

        }
        if (dt.equals("A")) {
            DL1.setText("" + a + "");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;

        }
        if (dt.equals("D")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dd = 1;
            dv = 0;
            in = 0;
        }
        if (dt.equals("V")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 1;
            dd = 0;
            in = 0;
        }
        if (dt.equals("I")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 1;

        }
        if (dt.equals("F")) {
            DL1.setText("0");
            F1.setText("" + a + "");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;
        }
        if (dt.equals("FJ")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("" + a + "");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;

        }
        if (dt.equals("DT")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("" + a + "");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;

        }
        if (dt.equals(" ")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("" + a + "");
            R1.setText("0");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;

        }
        if (dt.equals("R")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("" + a + "");
            DSGS1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;
        }
        if (dt.equals("DSGS")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("" + a + "");
            dv = 0;
            dd = 0;
            in = 0;
        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7 + dv8
                + dv9 + dv10 + dv11 + dv12 + dv13 + dv14 + dv15 + dv16;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7 + dd8
                + dd9 + dd10 + dd11 + dd12 + dd13 + dd14 + dd15 + dd16;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7 + in8
                + in9 + in10 + in11 + in12 + in13 + in14 + in15 + in16;
        Dpi.setText(("" + totalin));
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();

    }//GEN-LAST:event_Dia1ItemStateChanged

    private void QuincenasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_QuincenasItemStateChanged

        String Q = (String) Quincenas.getSelectedItem();
        if (Q.equals("1ra Quincena de Enero")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");

        }
        if (Q.equals("2da Quincena de Enero")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d15.setVisible(true);
            Dia16.setVisible(true);
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Febrero")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d15.setVisible(false);
            Dia16.setVisible(false);
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Febrero")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setVisible(false);
            Dia14.setVisible(false);
            d14.setVisible(false);
            Dia15.setVisible(false);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 13;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Feb B")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            Dia14.setVisible(true);
            d13.setVisible(true);
            d14.setVisible(false);
            Dia15.setVisible(false);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 14;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Marzo")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d15.setVisible(false);
            Dia16.setVisible(false);
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");

        }
        if (Q.equals("2da Quincena de Marzo")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }

        if (Q.equals("1ra Quincena de Abril")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Abril")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Mayo")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Mayo")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }

        if (Q.equals("1ra Quincena de Junio")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Junio")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Julio")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Julio")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Agosto")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Agosto")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Septiembre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Septiembre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Octubre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Octubre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Noviembre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Noviembre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("1ra Quincena de Diciembre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
        if (Q.equals("2da Quincena de Diciembre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }

    }//GEN-LAST:event_QuincenasItemStateChanged

    private void BNameNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BNameNomKeyReleased
        sharecdanom();
        shareN();
        sharepresnom();
        shareODTnom();
    }//GEN-LAST:event_BNameNomKeyReleased

    private void BAPNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAPNomKeyReleased
        sharecdanom();
        shareN();
        sharepresnom();
        shareODTnom();
    }//GEN-LAST:event_BAPNomKeyReleased

    private void shareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shareMouseClicked

        int seleccionar = share.getSelectedRow();
        NEnom.setText(String.valueOf(share.getValueAt(seleccionar, 0)));
        Ap.setText(String.valueOf(share.getValueAt(seleccionar, 1)));
        am.setText(String.valueOf(share.getValueAt(seleccionar, 2)));
        name.setText(String.valueOf(share.getValueAt(seleccionar, 3)));
        ban.setText(String.valueOf(share.getValueAt(seleccionar, 4)));
        cta.setText(String.valueOf(share.getValueAt(seleccionar, 5)));
        Zon.setText(String.valueOf(share.getValueAt(seleccionar, 6)));
        ServN.setText(String.valueOf(share.getValueAt(seleccionar, 7)));
        sueldo.setText(String.valueOf(share.getValueAt(seleccionar, 8)));
        Bono1.setText(String.valueOf(share.getValueAt(seleccionar, 9)));
        String Q = (String) Quincenas.getSelectedItem();
        if (Q.equals("1ra Quincena de Enero")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalene1 = String.format("%.2f", total);
            pd.setText("" + Totalene1 + "");

        }
        if (Q.equals("2da Quincena de Enero")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d15.setVisible(true);
            Dia16.setVisible(true);
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalene2 = String.format("%.2f", total);
            pd.setText("" + Totalene2 + "");
        }
        if (Q.equals("1ra Quincena de Febrero")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d15.setVisible(false);
            Dia16.setVisible(false);
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalfeb1 = String.format("%.2f", total);
            pd.setText("" + Totalfeb1 + "");
        }
        if (Q.equals("2da Quincena de Febrero")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setVisible(false);
            Dia14.setVisible(false);
            d14.setVisible(false);
            Dia15.setVisible(false);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 13;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalfeb2 = String.format("%.2f", total);
            pd.setText("" + Totalfeb2 + "");
        }
        if (Q.equals("2da Quincena de Feb B")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            Dia14.setVisible(true);
            d13.setVisible(true);
            d14.setVisible(false);
            Dia15.setVisible(false);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 14;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalfeb2b = String.format("%.2f", total);
            pd.setText("" + Totalfeb2b + "");
        }
        if (Q.equals("1ra Quincena de Marzo")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d15.setVisible(false);
            Dia16.setVisible(false);
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalmarzo1 = String.format("%.2f", total);
            pd.setText("" + Totalmarzo1 + "");
        }
        if (Q.equals("2da Quincena de Marzo")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalmar2 = String.format("%.2f", total);
            pd.setText("" + Totalmar2 + "");
        }

        if (Q.equals("1ra Quincena de Abril")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalabr1 = String.format("%.2f", total);
            pd.setText("" + Totalabr1 + "");
        }
        if (Q.equals("2da Quincena de Abril")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalabr2 = String.format("%.2f", total);
            pd.setText("" + Totalabr2 + "");
        }
        if (Q.equals("1ra Quincena de Mayo")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalmay1 = String.format("%.2f", total);
            pd.setText("" + Totalmay1 + "");
        }
        if (Q.equals("2da Quincena de Mayo")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalmay2 = String.format("%.2f", total);
            pd.setText("" + Totalmay2 + "");
        }

        if (Q.equals("1ra Quincena de Junio")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaljun1 = String.format("%.2f", total);
            pd.setText("" + Totaljun1 + "");
        }
        if (Q.equals("2da Quincena de Junio")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaljun2 = String.format("%.2f", total);
            pd.setText("" + Totaljun2 + "");

        }
        if (Q.equals("1ra Quincena de Julio")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaljul1 = String.format("%.2f", total);
            pd.setText("" + Totaljul1 + "");

        }
        if (Q.equals("2da Quincena de Julio")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaljul2 = String.format("%.2f", total);
            pd.setText("" + Totaljul2 + "");
        }
        if (Q.equals("1ra Quincena de Agosto")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalago1 = String.format("%.2f", total);
            pd.setText("" + Totalago1 + "");

        }
        if (Q.equals("2da Quincena de Agosto")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalago2 = String.format("%.2f", total);
            pd.setText("" + Totalago2 + "");

        }
        if (Q.equals("1ra Quincena de Septiembre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalsep1 = String.format("%.2f", total);
            pd.setText("" + Totalsep1 + "");

        }
        if (Q.equals("2da Quincena de Septiembre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalsep2 = String.format("%.2f", total);
            pd.setText("" + Totalsep2 + "");

        }
        if (Q.equals("1ra Quincena de Octubre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaloct1 = String.format("%.2f", total);
            pd.setText("" + Totaloct1 + "");

        }
        if (Q.equals("2da Quincena de Octubre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaloct2 = String.format("%.2f", total);
            pd.setText("" + Totaloct2 + "");

        }
        if (Q.equals("1ra Quincena de Noviembre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalnov1 = String.format("%.2f", total);
            pd.setText("" + Totalnov1 + "");

        }
        if (Q.equals("2da Quincena de Noviembre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totalnov2 = String.format("%.2f", total);
            pd.setText("" + Totalnov2 + "");

        }
        if (Q.equals("1ra Quincena de Diciembre")) {
            d.setText("1");
            d1.setText("2");
            d2.setText("3");
            d3.setText("4");
            d4.setText("5");
            d5.setText("6");
            d6.setText("7");
            d7.setText("8");
            d8.setText("9");
            d9.setText("10");
            d10.setText("11");
            d11.setText("12");
            d12.setText("13");
            d13.setText("14");
            d14.setText("15");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(false);
            Dia16.setVisible(false);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaldic1 = String.format("%.2f", total);
            pd.setText("" + Totaldic1 + "");

        }
        if (Q.equals("2da Quincena de Diciembre")) {
            d.setText("16");
            d1.setText("17");
            d2.setText("18");
            d3.setText("19");
            d4.setText("20");
            d5.setText("21");
            d6.setText("22");
            d7.setText("23");
            d8.setText("24");
            d9.setText("25");
            d10.setText("26");
            d11.setText("27");
            d12.setText("28");
            d13.setText("29");
            d14.setText("30");
            d15.setText("31");
            d13.setVisible(true);
            Dia14.setVisible(true);
            d14.setVisible(true);
            Dia15.setVisible(true);
            d15.setVisible(true);
            Dia16.setVisible(true);
            Dia1.setSelectedIndex(0);
            DIa2.setSelectedIndex(0);
            Dia3.setSelectedIndex(0);
            Dia4.setSelectedIndex(0);
            Dia5.setSelectedIndex(0);
            Dia6.setSelectedIndex(0);
            Dia7.setSelectedIndex(0);
            Dia8.setSelectedIndex(0);
            Dia9.setSelectedIndex(0);
            Dia10.setSelectedIndex(0);
            Dia11.setSelectedIndex(0);
            Dia12.setSelectedIndex(0);
            Dia13.setSelectedIndex(0);
            Dia14.setSelectedIndex(0);
            Dia15.setSelectedIndex(0);
            Dia16.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            String Totaldic2 = String.format("%.2f", total);
            pd.setText("" + Totaldic2 + "");

        }
        deposito();
    }//GEN-LAST:event_shareMouseClicked

    private void CSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CSActionPerformed

    private void FiltrosNomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosNomItemStateChanged

        String dt = (String) FiltrosNom.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Filtro1.setVisible(false);
            Filtro1.setText("");
            BNameNom.setVisible(false);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido P")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido P:");
            BNameNom.setVisible(false);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(true);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido M")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido M:");
            BNameNom.setVisible(false);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(true);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Nombre(s)")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Nombre(s):");
            BNameNom.setVisible(true);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
    }//GEN-LAST:event_FiltrosNomItemStateChanged

    private void BAMNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAMNomKeyReleased
        sharecdanom();
        shareN();
        sharepresnom();
        shareODTnom();
    }//GEN-LAST:event_BAMNomKeyReleased

    private void ModCDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModCDAActionPerformed
        editarCDA();
        limpiarcda();
        MDCDA();
        sumaTA();
    }//GEN-LAST:event_ModCDAActionPerformed

    private void AgregarCDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCDAActionPerformed
        AgregarCDA();
        limpiarcda();
        MDCDA();
        sumaTA();
    }//GEN-LAST:event_AgregarCDAActionPerformed

    private void BusnameCDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusnameCDAKeyReleased
        MDCDA();
    }//GEN-LAST:event_BusnameCDAKeyReleased

    private void BusnamecdashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusnamecdashKeyReleased
        sharecda();
    }//GEN-LAST:event_BusnamecdashKeyReleased

    private void BusAMcdashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusAMcdashKeyReleased
        sharecda();
    }//GEN-LAST:event_BusAMcdashKeyReleased

    private void BusAPcdashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusAPcdashKeyReleased
        sharecda();
    }//GEN-LAST:event_BusAPcdashKeyReleased

    private void CajaAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CajaAKeyReleased
        double TA = Double.parseDouble(this.TArrado.getText());
        double CA = Double.parseDouble(this.CajaA.getText());
        double totalpagar = TA - CA;
        Totalap.setText("" + totalpagar);
    }//GEN-LAST:event_CajaAKeyReleased

    private void QAdasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QAdasKeyReleased
        double APQna = Double.parseDouble(this.APQ.getText());
        double QA = Double.parseDouble(this.QAdas.getText());
        double totalahorrado = APQna * QA;
        TArrado.setText("" + totalahorrado);

        double TA = Double.parseDouble(this.TArrado.getText());
        double CA = Double.parseDouble(this.CajaA.getText());
        double totalpagar = TA - CA;
        Totalap.setText("" + totalpagar);
    }//GEN-LAST:event_QAdasKeyReleased

    private void APQKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_APQKeyReleased
//operacion quincenas cde caja de ahorro
        double APQna = Double.parseDouble(this.APQ.getText());
        double QA = Double.parseDouble(this.QAdas.getText());
        double totalahorrado = APQna * QA;
        TArrado.setText("" + totalahorrado);

        double TA = Double.parseDouble(this.TArrado.getText());
        double CA = Double.parseDouble(this.CajaA.getText());
        double totalpagar = TA - CA;
        Totalap.setText("" + totalpagar);
    }//GEN-LAST:event_APQKeyReleased

    private void CalInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalInActionPerformed
        if (CalIn.isSelected() == true) {

            double TA = Double.parseDouble(this.TArrado.getText());
            double Tcaja = Double.parseDouble(this.TELC.getText());
            double totalinteres = ((TA * 100) / (Tcaja)) / 100;
            PorcenIn.setText("" + (totalinteres) * 100);

            double Piin = Double.parseDouble(this.PorcenIn.getText());
            double TotalintP = Double.parseDouble(this.TIAP.getText());

            IAP.setText("" + ((Piin / 100) * TotalintP));

            double TAPagar = Double.parseDouble(this.Totalap.getText());
            double IApagar = Double.parseDouble(this.IAP.getText());
            PPF.setText("" + ((TAPagar) + IApagar));

        } else if (CalIn.isSelected() == false) {
            PorcenIn.setText("0");

        }
    }//GEN-LAST:event_CalInActionPerformed

    private void TablacdaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablacdaMouseClicked
        DefaultTableModel model = (DefaultTableModel) Tablacda.getModel();

        int fila = Tablacda.getSelectedRow();
        Numcda.setText(String.valueOf(Tablacda.getValueAt(fila, 0)));
        numEcda.setText(String.valueOf(Tablacda.getValueAt(fila, 1)));
        APcda.setText(String.valueOf(Tablacda.getValueAt(fila, 2)));
        AMcda.setText(String.valueOf(Tablacda.getValueAt(fila, 3)));
        namecda.setText(String.valueOf(Tablacda.getValueAt(fila, 4)));
        zonacda.setText(String.valueOf(Tablacda.getValueAt(fila, 5)));
        servcda.setText(String.valueOf(Tablacda.getValueAt(fila, 6)));
        APQ.setText(String.valueOf(Tablacda.getValueAt(fila, 7)));
        QAdas.setText(String.valueOf(Tablacda.getValueAt(fila, 8)));
        TArrado.setText(String.valueOf(Tablacda.getValueAt(fila, 9)));
        CajaA.setText(String.valueOf(Tablacda.getValueAt(fila, 10)));
        Totalap.setText(String.valueOf(Tablacda.getValueAt(fila, 11)));
        PorcenIn.setText(String.valueOf(Tablacda.getValueAt(fila, 12)));
        IAP.setText(String.valueOf(Tablacda.getValueAt(fila, 13)));
        PPF.setText(String.valueOf(Tablacda.getValueAt(fila, 14)));

        Obscda.setText(String.valueOf(Tablacda.getValueAt(fila, 17)));
        String combo1 = model.getValueAt(fila, 15).toString();
        for (int i = 0; i < Statuscda.getItemCount(); i++) {
            if (Statuscda.getItemAt(i).equalsIgnoreCase(combo1)) {
                Statuscda.setSelectedIndex(i);
            }
        }
        //Combobo2
        String combo3 = model.getValueAt(fila, 16).toString();
        for (int i = 0; i < Obs1cda.getItemCount(); i++) {
            if (Obs1cda.getItemAt(i).equalsIgnoreCase(combo3)) {
                Obs1cda.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_TablacdaMouseClicked

    private void ShareCDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShareCDAMouseClicked

        int fila = ShareCDA.getSelectedRow();
        numEcda.setText(String.valueOf(ShareCDA.getValueAt(fila, 0)));
        APcda.setText(String.valueOf(ShareCDA.getValueAt(fila, 1)));
        AMcda.setText(String.valueOf(ShareCDA.getValueAt(fila, 2)));
        namecda.setText(String.valueOf(ShareCDA.getValueAt(fila, 3)));
        zonacda.setText(String.valueOf(ShareCDA.getValueAt(fila, 4)));
        servcda.setText(String.valueOf(ShareCDA.getValueAt(fila, 5)));
    }//GEN-LAST:event_ShareCDAMouseClicked

    private void FilsharecdaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilsharecdaItemStateChanged
        String dt = (String) Filsharecda.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Labelcda.setVisible(false);
            Busnamecdash.setVisible(false);
            Busnamecdash.setText("");
            BusAPcdash.setText("");
            BusAPcdash.setVisible(false);
            BusAMcdash.setText("");
            BusAMcdash.setVisible(false);
            sharecda();
        }
        if (dt.equals("Apellido P")) {
            Labelcda.setVisible(true);
            Labelcda.setText("Buscar por Apellido P:");
            Busnamecdash.setVisible(false);
            Busnamecdash.setText("");
            BusAPcdash.setText("");
            BusAPcdash.setVisible(true);
            BusAMcdash.setText("");
            BusAMcdash.setVisible(false);
            sharecda();

        }
        if (dt.equals("Apellido M")) {
            Labelcda.setVisible(true);
            Labelcda.setText("Buscar por Apellido M:");
            Busnamecdash.setVisible(false);
            Busnamecdash.setText("");
            BusAPcdash.setText("");
            BusAPcdash.setVisible(false);
            BusAMcdash.setText("");
            BusAMcdash.setVisible(true);
            sharecda();

        }
        if (dt.equals("Nombre(s)")) {
            Labelcda.setVisible(true);
            Labelcda.setText("Buscar por Nombre(s):");
            Busnamecdash.setVisible(true);
            Busnamecdash.setText("");
            BusAPcdash.setText("");
            BusAPcdash.setVisible(false);
            BusAMcdash.setText("");
            BusAMcdash.setVisible(false);
            sharecda();

        }
    }//GEN-LAST:event_FilsharecdaItemStateChanged

    private void servcdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_servcdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_servcdaActionPerformed

    private void CS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS7ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS7ActionPerformed

    private void EliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTActionPerformed

        eliminarT();
        MDT();
        limpiarT();
    }//GEN-LAST:event_EliminarTActionPerformed

    private void OdTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OdTMouseClicked

        DefaultTableModel model = (DefaultTableModel) OdT.getModel();
        try {

            int fila = OdT.getSelectedRow();
            Ndo.setText(String.valueOf(OdT.getValueAt(fila, 0)));
            FE.setText(String.valueOf(OdT.getValueAt(fila, 1)));
            ApTaller.setText(String.valueOf(OdT.getValueAt(fila, 2)));
            Amtaller.setText(String.valueOf(OdT.getValueAt(fila, 3)));
            NameTaller.setText(String.valueOf(OdT.getValueAt(fila, 4)));
            Zona1.setText(String.valueOf(OdT.getValueAt(fila, 5)));
            Serv1.setText(String.valueOf(OdT.getValueAt(fila, 6)));
            Marca.setText(String.valueOf(OdT.getValueAt(fila, 7)));
            Modelo.setText(String.valueOf(OdT.getValueAt(fila, 8)));
            Placas.setText(String.valueOf(OdT.getValueAt(fila, 9)));
            Color.setText(String.valueOf(OdT.getValueAt(fila, 10)));
            ndp.setText(String.valueOf(OdT.getValueAt(fila, 11)));
            Daño.setText(String.valueOf(OdT.getValueAt(fila, 12)));
            CT.setText(String.valueOf(OdT.getValueAt(fila, 13)));
            
            Iad.setText(String.valueOf(OdT.getValueAt(fila, 17)));
            
            Pagado.setText(String.valueOf(OdT.getValueAt(fila, 19)));
            Pendiente.setText(String.valueOf(OdT.getValueAt(fila, 20)));
            PQT.setText(String.valueOf(OdT.getValueAt(fila, 21)));
            
            Observaciones.setText(String.valueOf(OdT.getValueAt(fila, 24)));

            String combo4 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Statusodt.getItemCount(); i++) {
                if (Statusodt.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Statusodt.setSelectedIndex(i);
                }
            }

            String combo1 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Paodt.getItemCount(); i++) {
                if (Paodt.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Paodt.setSelectedIndex(i);
                }
            }
            
            String combo3 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < QAP.getItemCount(); i++) {
                if (QAP.getItemAt(i).equalsIgnoreCase(combo3)) {
                    QAP.setSelectedIndex(i);
                }
            }
            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Fdp.getItemCount(); i++) {
                if (Fdp.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Fdp.setSelectedIndex(i);
                }
            }
            int id = Integer.parseInt(OdT.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from taller where idTaller =?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {
                if (rs.getString("Ingreso a taller").equals("Si")) {
                    Si.setSelected(true);
                } else if (rs.getString("Ingreso a taller").equals("No")) {
                    no.setSelected(true);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }

        deposito();
    }//GEN-LAST:event_OdTMouseClicked

    private void FnameodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameodtKeyReleased
        MDT();

    }//GEN-LAST:event_FnameodtKeyReleased

    private void Busamshpre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busamshpre1KeyReleased

        sharetp();
    }//GEN-LAST:event_Busamshpre1KeyReleased

    private void Busapshpre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busapshpre1KeyReleased

        sharetp();
    }//GEN-LAST:event_Busapshpre1KeyReleased

    private void FshTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FshTItemStateChanged

        String dt = (String) FshT.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            LabelPrestamos1.setVisible(false);
            BE1.setVisible(false);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(false);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(false);
            sharetp();
        }
        if (dt.equals("Apellido P")) {
            LabelPrestamos1.setVisible(true);
            LabelPrestamos1.setText("Buscar por Apellido P:");
            BE1.setVisible(false);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(true);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(false);
            sharetp();
        }
        if (dt.equals("Apellido M")) {
            LabelPrestamos1.setVisible(true);
            LabelPrestamos1.setText("Buscar por Apellido M:");
            BE1.setVisible(false);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(false);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(true);
            sharetp();
        }
        if (dt.equals("Nombre(s)")) {
            LabelPrestamos1.setVisible(true);
            LabelPrestamos1.setText("Buscar por Nombre(s):");
            BE1.setVisible(true);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(false);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(false);
            sharetp();

        }
    }//GEN-LAST:event_FshTItemStateChanged

    private void CS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS6ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS6ActionPerformed

    private void QAPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_QAPItemStateChanged

        String dt = (String) QAP.getSelectedItem();
        if (dt.equals(".")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("1 Quincena")) {
            Q1.setText("" + Q01 + "");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("2 Quincenas")) {
            Q1.setText("0");
            Q2.setText("" + Q02 + "");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("3 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("" + Q03 + "");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }

        if (dt.equals("4 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("" + Q04 + "");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("5 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("" + Q05 + "");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("6 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("" + Q06 + "");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("7 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("" + Q07 + "");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("8 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("" + Q08 + "");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("9 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("" + Q09 + "");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("10 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("" + Q010 + "");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("11 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("" + Q011 + "");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("12 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("" + Q012 + "");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("13 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("" + Q013 + "");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("14 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("" + Q014 + "");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("15 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("" + Q015 + "");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("16 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("" + Q016 + "");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("17 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("" + Q017 + "");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("18 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("" + Q018 + "");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("19 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("" + Q019 + "");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("20 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("" + Q020 + "");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("21 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("" + Q021 + "");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("22 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("" + Q022 + "");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("23 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("" + Q023 + "");
            Q24.setText("0");
        }
        if (dt.equals("24 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("" + Q024 + "");
        }
        PQt();
    }//GEN-LAST:event_QAPItemStateChanged

    private void ModificartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificartallerActionPerformed

        editarT();
        MDT();
        limpiarT();
    }//GEN-LAST:event_ModificartallerActionPerformed

    private void AgregartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregartallerActionPerformed

        AgregarT();
        MDT();
        limpiarT();
    }//GEN-LAST:event_AgregartallerActionPerformed

    private void BE1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BE1KeyReleased

        sharetp();
    }//GEN-LAST:event_BE1KeyReleased

    private void share2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share2MouseClicked

        int seleccionar = share2.getSelectedRow();
        ApTaller.setText(String.valueOf(share2.getValueAt(seleccionar, 0)));
        Amtaller.setText(String.valueOf(share2.getValueAt(seleccionar, 1)));
        NameTaller.setText(String.valueOf(share2.getValueAt(seleccionar, 2)));
        Zona1.setText(String.valueOf(share2.getValueAt(seleccionar, 3)));
        Serv1.setText(String.valueOf(share2.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share2MouseClicked

    private void PagadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagadoKeyReleased

        DAR1();
    }//GEN-LAST:event_PagadoKeyReleased

    private void CTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTKeyReleased

        DAR();
    }//GEN-LAST:event_CTKeyReleased

    private void CS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS5ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        eliminarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_jButton6ActionPerformed

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
            Presp.setText(String.valueOf(Pre.getValueAt(seleccionar, 12)));
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
            ps = con.prepareStatement("select * from prestamos where idprestamos =?");
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

    private void FNamepresKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FNamepresKeyReleased

        MDP();
    }//GEN-LAST:event_FNamepresKeyReleased

    private void BusamshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusamshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusamshpreKeyReleased

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

    private void BusapshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusapshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusapshpreKeyReleased

    private void CS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS4ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS4ActionPerformed

    private void FSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSActionPerformed

    }//GEN-LAST:event_FSActionPerformed

    private void modprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modprestamoActionPerformed

        editarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_modprestamoActionPerformed

    private void AgregarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarprestamoActionPerformed

        AgregarPre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_AgregarprestamoActionPerformed

    private void share1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share1MouseClicked

        int seleccionar = share1.getSelectedRow();
        Appres.setText(String.valueOf(share1.getValueAt(seleccionar, 0)));
        Ampres.setText(String.valueOf(share1.getValueAt(seleccionar, 1)));
        Namepres.setText(String.valueOf(share1.getValueAt(seleccionar, 2)));
        Zona.setText(String.valueOf(share1.getValueAt(seleccionar, 3)));
        Serv.setText(String.valueOf(share1.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share1MouseClicked

    private void BEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BEKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BEKeyReleased

    private void InteresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_InteresItemStateChanged

        IOMTPres();
    }//GEN-LAST:event_InteresItemStateChanged

    private void BampagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BampagKeyReleased

        mostrarpagos();
    }//GEN-LAST:event_BampagKeyReleased

    private void BAppagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppagKeyReleased

        mostrarpagos();
    }//GEN-LAST:event_BAppagKeyReleased

    private void FiltrosPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPItemStateChanged

        String dt = (String) FiltrosP.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            busp.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            LabelBEP.setVisible(false);
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();

        }
        if (dt.equals("Filtrar por Nombre(s)")) {
            busp.setVisible(true);
            LabelBEP.setVisible(true);
            LabelBEP.setText("Buscar por nombre:");
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();
        }
        if (dt.equals("Filtrar por Apellido P")) {
            busp.setVisible(false);
            LabelBEP.setVisible(true);
            LabelBEP.setText("Buscar por apellido P:");
            BAppag.setVisible(true);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();
        }
        if (dt.equals("Filtrar por Apellido M")) {
            busp.setVisible(false);
            LabelBEP.setVisible(true);
            LabelBEP.setText("Buscar por apellido M: ");
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(true);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();
        }
        if (dt.equals("Filtrar por Zona")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(true);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(true);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();
        }
        if (dt.equals("Filtrar por Servicio")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(true);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(true);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(true);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(true);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();
        }
        if (dt.equals("Filtrar por quincena")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(true);
            FiltroQP.setVisible(true);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            mostrarpagos();
        }
        if (dt.equals("Filtrar por # Lista")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(true);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(true);
            mostrarpagos();
        }
    }//GEN-LAST:event_FiltrosPItemStateChanged

    private void FiltroQPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQPItemStateChanged

        mostrarpagos();
    }//GEN-LAST:event_FiltroQPItemStateChanged

    private void filtroNDFPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFPKeyReleased

        mostrarpagos();
    }//GEN-LAST:event_filtroNDFPKeyReleased

    private void FiltroServPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServPItemStateChanged

        mostrarpagos();
    }//GEN-LAST:event_FiltroServPItemStateChanged

    private void FiltroSZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZPItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP.setModel(modelServicio);
        }
        mostrarpagos();
    }//GEN-LAST:event_FiltroSZPItemStateChanged

    private void FiltroZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZPItemStateChanged

        mostrarpagos();
    }//GEN-LAST:event_FiltroZPItemStateChanged

    private void CS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS3ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS3ActionPerformed

    private void buspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buspKeyReleased

        mostrarpagos();
    }//GEN-LAST:event_buspKeyReleased

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased

        MDN();
    }//GEN-LAST:event_FAmTKeyReleased

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased

        MDN();
    }//GEN-LAST:event_FApTKeyReleased

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased

        MDN();
    }//GEN-LAST:event_FiltroNDFKeyReleased

    private void FiltrosTDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTDItemStateChanged

        String dt = (String) FiltrosTD.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();

        }
        if (dt.equals("Filtrar por Apellido P")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido P:");
            FApT.setText("");
            FApT.setVisible(true);
            FAmT.setVisible(false);
            FAmT.setText("");
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();
        }
        if (dt.equals("Filtrar por Apellido M")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido M:");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(true);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();
        }
        if (dt.equals("Filtrar por Nombre(s)")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Nombre(s):");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(true);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();
        }
        if (dt.equals("Filtrar por Zona")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(true);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(true);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();
        }
        if (dt.equals("Filtrar por Servicio")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(true);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(true);
            FZservicio.setVisible(true);
            LabelSZ.setVisible(true);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();
        }
        if (dt.equals("Filtrar por quincena")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(true);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(true);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            MDN();
        }
        if (dt.equals("Filtrar por # Lista")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            FiltroQuincenanomina.setVisible(false);
            FiltroQuincenanomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(true);
            LabelBNDF.setVisible(true);
            MDN();
        }
    }//GEN-LAST:event_FiltrosTDItemStateChanged

    private void FZservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicioItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina.setModel(modelServicio);
        }
        MDN();
    }//GEN-LAST:event_FZservicioItemStateChanged

    private void FiltroQuincenanominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanominaItemStateChanged

        MDN();
    }//GEN-LAST:event_FiltroQuincenanominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged

        MDN();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void FiltroZnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZnominaItemStateChanged

        MDN();
    }//GEN-LAST:event_FiltroZnominaItemStateChanged

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        eliminarnom();
        MDN();
        limpiarnom();
    }//GEN-LAST:event_EliminarActionPerformed

    private void NominabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NominabKeyReleased

        MDN();
    }//GEN-LAST:event_NominabKeyReleased

    private void TnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TnomMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom.getModel();

            int fila = Tnom.getSelectedRow();
            NFnom.setText(String.valueOf(Tnom.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tnom.getValueAt(fila, 1)));
            NEnom.setText(String.valueOf(Tnom.getValueAt(fila, 2)));
            Ap.setText(String.valueOf(Tnom.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            ban.setText(String.valueOf(Tnom.getValueAt(fila, 6)));
            cta.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            Bono1.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            Bono.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 12)));
            String combo1 = model.getValueAt(fila, 13).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 14));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < DIa2.getItemCount(); i++) {
                if (DIa2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DIa2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 30).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }
            
            PDDDDSGS.setText(String.valueOf(Tnom.getValueAt(fila, 42)));
            apy.setText(String.valueOf(Tnom.getValueAt(fila, 47)));
            Lugar.setText(String.valueOf(Tnom.getValueAt(fila, 48)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 49)));
            ADD.setText(String.valueOf(Tnom.getValueAt(fila, 50)));
            DI.setText(String.valueOf(Tnom.getValueAt(fila, 53)));
            Fdb.setText(String.valueOf(Tnom.getValueAt(fila, 54)));
            Sancion.setText(String.valueOf(Tnom.getValueAt(fila, 55)));
            Chamarra.setText(String.valueOf(Tnom.getValueAt(fila, 56)));
            Chaleco.setText(String.valueOf(Tnom.getValueAt(fila, 57)));
            Fde.setText(String.valueOf(Tnom.getValueAt(fila, 58)));
            Grua.setText(String.valueOf(Tnom.getValueAt(fila, 59)));
            Pantalon.setText(String.valueOf(Tnom.getValueAt(fila, 60)));
            Credencial.setText(String.valueOf(Tnom.getValueAt(fila, 61)));
            Bp.setText(String.valueOf(Tnom.getValueAt(fila, 62)));
            Playera.setText(String.valueOf(Tnom.getValueAt(fila, 63)));
            Corbata.setText(String.valueOf(Tnom.getValueAt(fila, 64)));
            AdN.setText(String.valueOf(Tnom.getValueAt(fila, 65)));
            DVT.setText(String.valueOf(Tnom.getValueAt(fila, 66)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 67)));
            cda.setText(String.valueOf(Tnom.getValueAt(fila, 68)));
            Odtp.setText(String.valueOf(Tnom.getValueAt(fila, 69)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 70)));
            obs.setText(String.valueOf(Tnom.getValueAt(fila, 71)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void SHCDAnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHCDAnomMouseClicked
        int fila = SHCDAnom.getSelectedRow();
        NCDANom.setText(String.valueOf(SHCDAnom.getValueAt(fila, 0)));
        cda.setText(String.valueOf(SHCDAnom.getValueAt(fila, 4)));
        QAcdanom.setText(String.valueOf(SHCDAnom.getValueAt(fila, 5)));
        TACDANOM.setText(String.valueOf(SHCDAnom.getValueAt(fila, 6)));
        deposito();
    }//GEN-LAST:event_SHCDAnomMouseClicked

    private void SHPresnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHPresnomMouseClicked
        int fila = SHPresnom.getSelectedRow();
        NumPrenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 0)));
        Presp.setText(String.valueOf(SHPresnom.getValueAt(fila, 4)));
        NQprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 5)));
        Pagadoprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 6)));
        Pendienteprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 7)));
        deposito();
    }//GEN-LAST:event_SHPresnomMouseClicked

    private void SHODTnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHODTnomMouseClicked
        int fila = SHODTnom.getSelectedRow();
        NODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 0)));
        Odtp.setText(String.valueOf(SHODTnom.getValueAt(fila, 4)));
        NQODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 5)));
        PagODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 6)));
        PenODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 7)));
        deposito();
    }//GEN-LAST:event_SHODTnomMouseClicked

    private void PDDDDSGSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDDDDSGSKeyReleased
        deposito();
    }//GEN-LAST:event_PDDDDSGSKeyReleased

    private void cdaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdaKeyReleased
        deposito();
    }//GEN-LAST:event_cdaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        MODPAGOCDA();
        MDTPCDA();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void TPCDAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TPCDAMouseClicked
        int fila = TPCDA.getSelectedRow();
        NFpagocda.setText(String.valueOf(TPCDA.getValueAt(fila, 0)));
        obdpagocda.setText(String.valueOf(TPCDA.getValueAt(fila, 10)));
        NREcda.setText(String.valueOf(TPCDA.getValueAt(fila, 12)));
    }//GEN-LAST:event_TPCDAMouseClicked

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

    private void FilnamePODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnamePODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilnamePODTKeyReleased

    private void FilApPODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilApPODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilApPODTKeyReleased

    private void FilAmPODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAmPODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilAmPODTKeyReleased

    private void FiltrosPDODTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPDODTItemStateChanged
        String FTP = (String) FiltrosPDODT.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
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

    }//GEN-LAST:event_FiltrosPDODTItemStateChanged

    private void FiltrosTODTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTODTItemStateChanged
        String FTP = (String) FiltrosTODT.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            Labelfilodt.setVisible(false);
            Fnameodt.setVisible(false);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(false);
            FilAmodt.setText("");
            FilAmodt.setVisible(false);
            MDT();
        }
        if (FTP.equals("Apellido P")) {
            Labelfilodt.setVisible(true);
            Labelfilodt.setText("Buscar por Apellido P:");
            Fnameodt.setVisible(false);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(true);
            FilAmodt.setText("");
            FilAmodt.setVisible(false);
            MDT();
        }
        if (FTP.equals("Apellido M")) {
            Labelfilodt.setVisible(true);
            Labelfilodt.setText("Buscar por Apellido M:");
            Fnameodt.setVisible(false);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(false);
            FilAmodt.setText("");
            FilAmodt.setVisible(true);
            MDT();
        }
        if (FTP.equals("Nombre(s)")) {
            Labelfilodt.setVisible(true);
            Labelfilodt.setText("Buscar por Nombre(s):");
            Fnameodt.setVisible(true);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(false);
            FilAmodt.setText("");
            FilAmodt.setVisible(false);
            MDT();

        }
    }//GEN-LAST:event_FiltrosTODTItemStateChanged

    private void FilApodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilApodtKeyReleased
        MDT();
    }//GEN-LAST:event_FilApodtKeyReleased

    private void FilAmodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAmodtKeyReleased
        MDT();
    }//GEN-LAST:event_FilAmodtKeyReleased

    private void FilAPCDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAPCDAKeyReleased
        MDCDA();
    }//GEN-LAST:event_FilAPCDAKeyReleased

    private void FillAMCDAKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillAMCDAKeyReleased
        MDCDA();
    }//GEN-LAST:event_FillAMCDAKeyReleased

    private void FiltroscdaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroscdaItemStateChanged
        String FTP = (String) Filtroscda.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            Labelfilcda.setVisible(false);
            BusnameCDA.setVisible(false);
            BusnameCDA.setText("");
            FilAPCDA.setText("");
            FilAPCDA.setVisible(false);
            FillAMCDA.setText("");
            FillAMCDA.setVisible(false);
            MDCDA();
        }
        if (FTP.equals("Apellido P")) {
            Labelfilcda.setVisible(true);
            Labelfilcda.setText("Buscar por Apellido P:");
            BusnameCDA.setVisible(false);
            BusnameCDA.setText("");
            FilAPCDA.setText("");
            FilAPCDA.setVisible(true);
            FillAMCDA.setText("");
            FillAMCDA.setVisible(false);
            MDCDA();
        }
        if (FTP.equals("Apellido M")) {
            Labelfilcda.setVisible(true);
            Labelfilcda.setText("Buscar por Apellido M:");
            BusnameCDA.setVisible(false);
            BusnameCDA.setText("");
            FilAPCDA.setText("");
            FilAPCDA.setVisible(false);
            FillAMCDA.setText("");
            FillAMCDA.setVisible(true);
            MDCDA();
        }
        if (FTP.equals("Nombre(s)")) {
            Labelfilcda.setVisible(true);
            Labelfilcda.setText("Buscar por Nombre(s):");
            BusnameCDA.setVisible(true);
            BusnameCDA.setText("");
            FilAPCDA.setText("");
            FilAPCDA.setVisible(false);
            FillAMCDA.setText("");
            FillAMCDA.setVisible(false);
            MDCDA();

        }
    }//GEN-LAST:event_FiltroscdaItemStateChanged

    private void FilPCDAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilPCDAItemStateChanged
        String FTP = (String) FilPCDA.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
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

    private void SinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinteresActionPerformed
        IOMTPres();
    }//GEN-LAST:event_SinteresActionPerformed

    private void EliminarcdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarcdaActionPerformed
        try {

            int filaseleccionada = Tablacda.getSelectedRow();
            String sql = "delete from nomina.cajadeahorro where #caja=" + Tablacda.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Caja de ahorro eliminada eliminada.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Caja de ahorro: " + e.getMessage());

        }
    }//GEN-LAST:event_EliminarcdaActionPerformed

    private void AdNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdNKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_AdNKeyReleased

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
            java.util.logging.Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_NominaQ_5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD;
    private javax.swing.JTextField AMcda;
    private javax.swing.JTextField APQ;
    private javax.swing.JTextField APcda;
    private javax.swing.JTextField AdN;
    private javax.swing.JMenuItem Administradores;
    private javax.swing.JButton AgregarCDA;
    private javax.swing.JButton AgregarNP;
    private javax.swing.JButton Agregarprestamo;
    private javax.swing.JButton Agregartaller;
    private javax.swing.JTextField Ampres;
    private javax.swing.JTextField Amtaller;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField ApTaller;
    private javax.swing.JTextField Appres;
    private javax.swing.JTextField BAMNom;
    private javax.swing.JTextField BAPNom;
    private javax.swing.JTextField BAppag;
    private javax.swing.JTextField BE;
    private javax.swing.JTextField BE1;
    private javax.swing.JTextField BNameNom;
    private javax.swing.JTextField Bampag;
    private javax.swing.JRadioButton Bno;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField Bono1;
    private javax.swing.JTextField Bp;
    private javax.swing.JRadioButton Bsi;
    private javax.swing.JTextField BusAMcdash;
    private javax.swing.JTextField BusAPcdash;
    private javax.swing.JTextField Busamshpre;
    private javax.swing.JTextField Busamshpre1;
    private javax.swing.JTextField Busapshpre;
    private javax.swing.JTextField Busapshpre1;
    private javax.swing.JTextField BusnameCDA;
    private javax.swing.JTextField Busnamecdash;
    private javax.swing.JButton CS;
    private javax.swing.JButton CS2;
    private javax.swing.JButton CS3;
    private javax.swing.JButton CS4;
    private javax.swing.JButton CS5;
    private javax.swing.JButton CS6;
    private javax.swing.JButton CS7;
    private javax.swing.JTextField CT;
    private javax.swing.JTextField CajaA;
    private javax.swing.JScrollPane Cajadeahorro;
    private javax.swing.JCheckBox CalIn;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Carpeta;
    private javax.swing.JTextField Chaleco;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
    private javax.swing.JLabel DD;
    private javax.swing.JTextField DI;
    private javax.swing.JComboBox<String> DIa2;
    private javax.swing.JLabel DL;
    private javax.swing.JLabel DL1;
    private javax.swing.JLabel DL10;
    private javax.swing.JLabel DL11;
    private javax.swing.JLabel DL12;
    private javax.swing.JLabel DL13;
    private javax.swing.JLabel DL14;
    private javax.swing.JLabel DL15;
    private javax.swing.JLabel DL16;
    private javax.swing.JLabel DL2;
    private javax.swing.JLabel DL3;
    private javax.swing.JLabel DL4;
    private javax.swing.JLabel DL5;
    private javax.swing.JLabel DL6;
    private javax.swing.JLabel DL7;
    private javax.swing.JLabel DL8;
    private javax.swing.JLabel DL9;
    private javax.swing.JLabel DO;
    private javax.swing.JLabel DO1;
    private javax.swing.JLabel DO10;
    private javax.swing.JLabel DO11;
    private javax.swing.JLabel DO12;
    private javax.swing.JLabel DO13;
    private javax.swing.JLabel DO14;
    private javax.swing.JLabel DO15;
    private javax.swing.JLabel DO16;
    private javax.swing.JLabel DO2;
    private javax.swing.JLabel DO3;
    private javax.swing.JLabel DO4;
    private javax.swing.JLabel DO5;
    private javax.swing.JLabel DO6;
    private javax.swing.JLabel DO7;
    private javax.swing.JLabel DO8;
    private javax.swing.JLabel DO9;
    private javax.swing.JLabel DPF;
    private javax.swing.JLabel DSGS;
    private javax.swing.JLabel DSGS1;
    private javax.swing.JLabel DSGS10;
    private javax.swing.JLabel DSGS11;
    private javax.swing.JLabel DSGS12;
    private javax.swing.JLabel DSGS13;
    private javax.swing.JLabel DSGS14;
    private javax.swing.JLabel DSGS15;
    private javax.swing.JLabel DSGS16;
    private javax.swing.JLabel DSGS2;
    private javax.swing.JLabel DSGS3;
    private javax.swing.JLabel DSGS4;
    private javax.swing.JLabel DSGS5;
    private javax.swing.JLabel DSGS6;
    private javax.swing.JLabel DSGS7;
    private javax.swing.JLabel DSGS8;
    private javax.swing.JLabel DSGS9;
    private javax.swing.JLabel DVT;
    private javax.swing.JPanel Datgen;
    private javax.swing.JTextArea Daño;
    private javax.swing.JLabel Ddv;
    private javax.swing.JComboBox<String> Dia1;
    private javax.swing.JComboBox<String> Dia10;
    private javax.swing.JComboBox<String> Dia11;
    private javax.swing.JComboBox<String> Dia12;
    private javax.swing.JComboBox<String> Dia13;
    private javax.swing.JComboBox<String> Dia14;
    private javax.swing.JComboBox<String> Dia15;
    private javax.swing.JComboBox<String> Dia16;
    private javax.swing.JComboBox<String> Dia3;
    private javax.swing.JComboBox<String> Dia4;
    private javax.swing.JComboBox<String> Dia5;
    private javax.swing.JComboBox<String> Dia6;
    private javax.swing.JComboBox<String> Dia7;
    private javax.swing.JComboBox<String> Dia8;
    private javax.swing.JComboBox<String> Dia9;
    private javax.swing.JLabel Dpi;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarT;
    private javax.swing.JButton Eliminarcda;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JLabel F;
    private javax.swing.JLabel F1;
    private javax.swing.JLabel F10;
    private javax.swing.JLabel F11;
    private javax.swing.JLabel F12;
    private javax.swing.JLabel F13;
    private javax.swing.JLabel F14;
    private javax.swing.JLabel F15;
    private javax.swing.JLabel F16;
    private javax.swing.JLabel F2;
    private javax.swing.JLabel F3;
    private javax.swing.JLabel F4;
    private javax.swing.JLabel F5;
    private javax.swing.JLabel F6;
    private javax.swing.JLabel F7;
    private javax.swing.JLabel F8;
    private javax.swing.JLabel F9;
    private javax.swing.JTextField FAMpres;
    private javax.swing.JTextField FAPpres;
    private javax.swing.JTextField FAmT;
    private javax.swing.JTextField FApT;
    private javax.swing.JTextField FE;
    private javax.swing.JLabel FJ;
    private javax.swing.JLabel FJ1;
    private javax.swing.JLabel FJ10;
    private javax.swing.JLabel FJ11;
    private javax.swing.JLabel FJ12;
    private javax.swing.JLabel FJ13;
    private javax.swing.JLabel FJ14;
    private javax.swing.JLabel FJ15;
    private javax.swing.JLabel FJ16;
    private javax.swing.JLabel FJ2;
    private javax.swing.JLabel FJ3;
    private javax.swing.JLabel FJ4;
    private javax.swing.JLabel FJ5;
    private javax.swing.JLabel FJ6;
    private javax.swing.JLabel FJ7;
    private javax.swing.JLabel FJ8;
    private javax.swing.JLabel FJ9;
    private javax.swing.JTextField FL;
    private javax.swing.JTextField FNamepres;
    private javax.swing.JTextField FS;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JComboBox<String> Fdp;
    private javax.swing.JTextField FilAMPCDA;
    private javax.swing.JTextField FilAPCDA;
    private javax.swing.JTextField FilAPPCDA;
    private javax.swing.JTextField FilAmPODT;
    private javax.swing.JTextField FilAmodt;
    private javax.swing.JTextField FilApPODT;
    private javax.swing.JTextField FilApodt;
    private javax.swing.JComboBox<String> FilPCDA;
    private javax.swing.JTextField FilPDPAm;
    private javax.swing.JTextField FilPDPAp;
    private javax.swing.JTextField FilPDPname;
    private javax.swing.JTextField FillAMCDA;
    private javax.swing.JTextField FilnamePCDA;
    private javax.swing.JTextField FilnamePODT;
    private javax.swing.JComboBox<String> Filsharecda;
    private javax.swing.JLabel Filtro1;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JComboBox<String> FiltroQP;
    private javax.swing.JComboBox<String> FiltroQuincenanomina;
    private javax.swing.JComboBox<String> FiltroSZP;
    private javax.swing.JComboBox<String> FiltroServP;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroZP;
    private javax.swing.JComboBox<String> FiltroZnomina;
    private javax.swing.JComboBox<String> FiltrosNom;
    private javax.swing.JComboBox<String> FiltrosP;
    private javax.swing.JComboBox<String> FiltrosPDODT;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JComboBox<String> FiltrosTODT;
    private javax.swing.JComboBox<String> FiltrosTP;
    private javax.swing.JComboBox<String> FiltrosTPDP;
    private javax.swing.JComboBox<String> Filtroscda;
    private javax.swing.JComboBox<String> Filtrosshp;
    private javax.swing.JTextField Fnameodt;
    private javax.swing.JComboBox<String> FshT;
    private javax.swing.JMenuItem General;
    private javax.swing.JTextField Grua;
    private javax.swing.JTextField IAP;
    private javax.swing.JTextField Iad;
    private javax.swing.JComboBox<String> Interes;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBEP;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQP;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBSP;
    private javax.swing.JLabel LabelBZ;
    private javax.swing.JLabel LabelBZP;
    private javax.swing.JLabel LabelDSGS;
    private javax.swing.JLabel LabelFPDP;
    private javax.swing.JLabel LabelNDFP;
    private javax.swing.JLabel LabelPrestamos;
    private javax.swing.JLabel LabelPrestamos1;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZP;
    private javax.swing.JLabel Labelcda;
    private javax.swing.JLabel LabelfilPODT;
    private javax.swing.JLabel Labelfilcda;
    private javax.swing.JLabel Labelfilodt;
    private javax.swing.JLabel Labelfilpres;
    private javax.swing.JTextField Lugar;
    private javax.swing.JTextField MT;
    private javax.swing.JTextField Marca;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextField Metodo;
    private javax.swing.JButton ModCDA;
    private javax.swing.JTextField Modelo;
    private javax.swing.JButton Modificartaller;
    private javax.swing.JButton Modm;
    private javax.swing.JTextField NCDANom;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NEnom;
    private javax.swing.JTextField NFnom;
    private javax.swing.JTextField NFpagocda;
    private javax.swing.JTextField NODTnom;
    private javax.swing.JTextField NQODTnom;
    private javax.swing.JTextField NQprenom;
    private javax.swing.JTextField NREcda;
    private javax.swing.JTextField NameTaller;
    private javax.swing.JTextField Namepres;
    private javax.swing.JTextField Ndo;
    private javax.swing.JScrollPane Nomina;
    private javax.swing.JMenuItem Nomina1;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Num;
    private javax.swing.JTextField NumPrenom;
    private javax.swing.JTextField Numcda;
    private javax.swing.JComboBox<String> Obs1cda;
    private javax.swing.JTextArea Obscda;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JTable OdT;
    private javax.swing.JTextField Odtp;
    private javax.swing.JLabel PCR;
    private javax.swing.JLabel PDDD;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JLabel PDDDV;
    private javax.swing.JLabel PDDL;
    private javax.swing.JLabel PDDT;
    private javax.swing.JTextField PPF;
    private javax.swing.JTextField PQ;
    private javax.swing.JTextField PQT;
    private javax.swing.JTextField PagODTnom;
    private javax.swing.JTextField Pagado;
    private javax.swing.JTextField PagadoPres;
    private javax.swing.JTextField Pagadoprenom;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JComboBox<String> Paodt;
    private javax.swing.JTextField PenODTnom;
    private javax.swing.JTextField Pendiente;
    private javax.swing.JTextField Pendienteprenom;
    private javax.swing.JTextField Pendientepres;
    private javax.swing.JTextField Placas;
    private javax.swing.JTextField Playera;
    private javax.swing.JTextField PorcenIn;
    private javax.swing.JTable Pre;
    private javax.swing.JTextField Presp;
    private javax.swing.JScrollPane Prestamos;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q10;
    private javax.swing.JLabel Q11;
    private javax.swing.JLabel Q12;
    private javax.swing.JLabel Q13;
    private javax.swing.JLabel Q14;
    private javax.swing.JLabel Q15;
    private javax.swing.JLabel Q16;
    private javax.swing.JLabel Q17;
    private javax.swing.JLabel Q18;
    private javax.swing.JLabel Q19;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q20;
    private javax.swing.JLabel Q21;
    private javax.swing.JLabel Q22;
    private javax.swing.JLabel Q23;
    private javax.swing.JLabel Q24;
    private javax.swing.JLabel Q25;
    private javax.swing.JLabel Q26;
    private javax.swing.JLabel Q27;
    private javax.swing.JLabel Q28;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel Q6;
    private javax.swing.JLabel Q7;
    private javax.swing.JLabel Q8;
    private javax.swing.JLabel Q9;
    private javax.swing.JComboBox<String> QAP;
    private javax.swing.JTextField QAcdanom;
    private javax.swing.JTextField QAdas;
    private javax.swing.JTextField QPodt;
    private javax.swing.JTextField QPprest;
    private javax.swing.JComboBox<String> Quincenas;
    private javax.swing.JLabel R;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R10;
    private javax.swing.JLabel R11;
    private javax.swing.JLabel R12;
    private javax.swing.JLabel R13;
    private javax.swing.JLabel R14;
    private javax.swing.JLabel R15;
    private javax.swing.JLabel R16;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private javax.swing.JLabel R4;
    private javax.swing.JLabel R5;
    private javax.swing.JLabel R6;
    private javax.swing.JLabel R7;
    private javax.swing.JLabel R8;
    private javax.swing.JLabel R9;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JTable SHCDAnom;
    private javax.swing.JTable SHODTnom;
    private javax.swing.JTable SHPresnom;
    private javax.swing.JTextField Sancion;
    private javax.swing.JTextField Serv;
    private javax.swing.JTextField Serv1;
    private javax.swing.JTextField ServN;
    private javax.swing.JTable ShareCDA;
    private javax.swing.JRadioButton Si;
    private javax.swing.JCheckBox Sinteres;
    private javax.swing.JTextField Status;
    private javax.swing.JComboBox<String> Statuscda;
    private javax.swing.JComboBox<String> Statusodt;
    private javax.swing.JTextField TACDANOM;
    private javax.swing.JTextField TArrado;
    private javax.swing.JScrollPane TDPODT;
    private javax.swing.JScrollPane TDnomina;
    private javax.swing.JLabel TELC;
    private javax.swing.JTextField TIAP;
    private javax.swing.JTable TPCDA;
    private javax.swing.JScrollPane TPDCDA;
    private javax.swing.JScrollPane TPDP;
    private javax.swing.JTable TPODT;
    private javax.swing.JTable TPPRES;
    private javax.swing.JScrollPane TPagos;
    private javax.swing.JScrollPane TTalleres;
    private javax.swing.JTable Tablacda;
    private javax.swing.JScrollPane Talleres;
    private javax.swing.JTable Tnom;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JTextField Totalap;
    private javax.swing.JScrollPane Tprestamos;
    private javax.swing.JMenuItem UsuariosRH;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField Zona;
    private javax.swing.JTextField Zona1;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private botones.BotonWeb botonWeb1;
    private botones.BotonWeb botonWeb2;
    private botones.BotonWeb botonWeb3;
    private botones.BotonWeb botonWeb4;
    private botones.BotonWeb botonWeb5;
    private botones.BotonWeb botonWeb6;
    private botones.BotonWeb botonWeb7;
    private botones.BotonWeb botonWeb8;
    private javax.swing.JTextField busp;
    private javax.swing.JTextField cda;
    private javax.swing.JTextField cta;
    private javax.swing.JLabel d;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d10;
    private javax.swing.JLabel d11;
    private javax.swing.JLabel d12;
    private javax.swing.JLabel d13;
    private javax.swing.JLabel d14;
    private javax.swing.JLabel d15;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel d3;
    private javax.swing.JLabel d4;
    private javax.swing.JLabel d5;
    private javax.swing.JLabel d6;
    private javax.swing.JLabel d7;
    private javax.swing.JLabel d8;
    private javax.swing.JLabel d9;
    private javax.swing.JTextField deposito;
    private javax.swing.JLabel dt;
    private javax.swing.JLabel dt1;
    private javax.swing.JLabel dt10;
    private javax.swing.JLabel dt11;
    private javax.swing.JLabel dt12;
    private javax.swing.JLabel dt13;
    private javax.swing.JLabel dt14;
    private javax.swing.JLabel dt15;
    private javax.swing.JLabel dt16;
    private javax.swing.JLabel dt2;
    private javax.swing.JLabel dt3;
    private javax.swing.JLabel dt4;
    private javax.swing.JLabel dt5;
    private javax.swing.JLabel dt6;
    private javax.swing.JLabel dt7;
    private javax.swing.JLabel dt8;
    private javax.swing.JLabel dt9;
    private javax.swing.JTextField filtroNDFP;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
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
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelpcda;
    private javax.swing.JButton modprestamo;
    private javax.swing.JTextField name;
    private javax.swing.JTextField namecda;
    private javax.swing.JTextField ndp;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField numEcda;
    private javax.swing.JTextArea obdpagocda;
    private javax.swing.JTextArea obs;
    private javax.swing.JTable pago;
    private javax.swing.JTextField pd;
    private javax.swing.JLabel pds;
    private javax.swing.JTextField servcda;
    private javax.swing.JTable share;
    private javax.swing.JTable share1;
    private javax.swing.JTable share2;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField zonacda;
    // End of variables declaration//GEN-END:variables
}
