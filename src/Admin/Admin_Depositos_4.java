package Admin;

import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import ColoresT.ColorRH;
import Inicio.Login_2;
import ZyS.Zonas;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class Admin_Depositos_4 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();
    ColorRH colores = new ColorRH();

    public Admin_Depositos_4() {
        initComponents();
        this.setExtendedState(6);
        año.setCalendar(fecha_actual);
        FiltrosZonas FZNomdep = new FiltrosZonas();
        DefaultComboBoxModel FZNOMmodeldep = new DefaultComboBoxModel(FZNomdep.mostrarzonas());
        FiltroZnomina1.setModel(FZNOMmodeldep);
        FiltrosZonas FZSnomdep = new FiltrosZonas();
        DefaultComboBoxModel MODELFZSnomdep = new DefaultComboBoxModel(FZSnomdep.mostrarzonas());
        FZservicio1.setModel(MODELFZSnomdep);
        FiltrosZonas FZNom = new FiltrosZonas();
        DefaultComboBoxModel FZNOMmodel = new DefaultComboBoxModel(FZNom.mostrarzonas());
        FiltroZnomina.setModel(FZNOMmodel);
        FiltrosZonas FZSnom = new FiltrosZonas();
        DefaultComboBoxModel MODELFZSnom = new DefaultComboBoxModel(FZSnom.mostrarzonas());
        FZservicio.setModel(MODELFZSnom);
        LabelBE.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        Nominab.setVisible(false);
        FiltroZnomina.setVisible(false);
        LabelBZ.setVisible(false);
        FiltroSnomina.setVisible(false);
        LabelBS.setVisible(false);
        FZservicio.setVisible(false);
        LabelSZ.setVisible(false);
        FiltroQuincenanomina.setVisible(false);
        LabelBQ.setVisible(false);
        FiltroNDF.setVisible(false);
        LabelBNDF.setVisible(false);
        LabelBE1.setVisible(false);
        FApT1.setVisible(false);
        FAmT1.setVisible(false);
        Nominab1.setVisible(false);
        FiltroZnomina1.setVisible(false);
        LabelBZ1.setVisible(false);
        FiltroSnomina1.setVisible(false);
        LabelBS1.setVisible(false);
        FZservicio1.setVisible(false);
        LabelSZ1.setVisible(false);
        FiltroQuincenanomina1.setVisible(false);
        LabelBQ1.setVisible(false);
        FiltroNDF1.setVisible(false);
        LabelBNDF1.setVisible(false);
        setIconImage(new ImageIcon(Admin_Depositos_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        MDN();
        MDDep();
    }

    @SuppressWarnings("unchecked")

    public void Modeposito() {
        String SQL = "UPDATE `rh.depositos` SET `#Folio` = ?, `#Lista` = ?, `#Empleado` = ?,"
                + " `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?, "
                + "`Servicio` = ?, `Sueldo` = ?, `Bono` = ?, `Por dia` = ?, "
                + "`Quincena del mes` = ?, `Año` = ?, `Dias de incapacidad` = ?,"
                + " `Pago seguro` = ?, `Dias de vacaciones` = ?, `Pago de vacaciones` = ?,"
                + " `Dias de descanso` = ?, `Pago de dias descansados` = ?, `Dias laborados` = ?,"
                + " `Pago de dias laborados` = ?, `Descansos trabajados` = ?, "
                + "`Pago de Descansos trabajados` = ?, `DSGS` = ?, `Pago de dias de DSGS` = ?,"
                + " `Faltas justificadas` = ?, `Descanso otorgado` = ?, `Retardos` = ?,"
                + " `Pago con retardos` = ?, `Apoyo` = ?, `Lugar` = ?, `Rembolso` = ?,"
                + " `Adicionales` = ?, `Faltas` = ?, `Descuento por faltas` = ?, "
                + "`Descuento imss` = ?, `Faltantes de boleto` = ?, `Sancion` = ?, "
                + "`Chamarra` = ?, `Chaleco` = ?, `Faltante de efectivo` = ?, `Grua` = ?,"
                + " `Pantalon` = ?, `Credencial` = ?, `Boleto perdido` = ?, `Playera` = ?, "
                + "`Corbata` = ?, `Pago de prestamo` = ?, `Caja de ahorro` = ?, `Orden de taller` = ?,"
                + " `Adelanto de nomina` = ?, `Deposito` = ?, `Fecha de deposito` = ?, "
                + "`Mes de pago` = ?, `Forma de pago` = ?, `Observaciones` = ? WHERE `rh.depositos`.`#Folio` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NEnom.getText());
            pst.setString(3, NDL.getText());
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, sueldo.getText());
            pst.setString(10, Bonodep.getText());
            pst.setString(11, pd.getText());
            pst.setString(12, Quincenas.getSelectedItem().toString());
            pst.setString(13, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(14, Dpi.getText());
            pst.setString(15, pds.getText());
            pst.setString(16, Ddv.getText());
            pst.setString(17, PDDDV.getText());
            pst.setString(18, DD.getText());
            pst.setString(19, PDDD.getText());
            pst.setString(20, DL.getText());
            pst.setString(21, PDDL.getText());
            pst.setString(22, dt.getText());
            pst.setString(23, PDDT.getText());
            pst.setString(24, DSGS.getText());
            pst.setString(25, PDDDDSGS.getText());
            pst.setString(26, FJ.getText());
            pst.setString(27, DO.getText());
            pst.setString(28, R.getText());
            pst.setString(29, PCR.getText());
            pst.setString(30, apy.getText());
            pst.setString(31, Lugar.getText());
            pst.setString(32, Rembolso.getText());
            pst.setString(33, ADD.getText());
            pst.setString(34, F.getText());
            pst.setString(35, DPF.getText());
            pst.setString(36, DI.getText());
            pst.setString(37, Fdb.getText());
            pst.setString(38, Sancion.getText());
            pst.setString(39, Chamarra.getText());
            pst.setString(40, Chaleco.getText());
            pst.setString(41, Fde.getText());
            pst.setString(42, Grua.getText());
            pst.setString(43, Pantalon.getText());
            pst.setString(44, Credencial.getText());
            pst.setString(45, Bp.getText());
            pst.setString(46, Playera.getText());
            pst.setString(47, Corbata.getText());
            pst.setString(48, Presp.getText());
            pst.setString(49, cda.getText());
            pst.setString(50, Odtp.getText());
            pst.setString(51, AdN.getText());
            pst.setString(52, deposito.getText());
            pst.setString(53, ((JTextField) FDD.getDateEditor().getUiComponent()).getText());
            pst.setString(54, MDP.getSelectedItem().toString());
            pst.setString(55, FDP.getSelectedItem().toString());
            pst.setString(56, Obsdeposito.getText());
            pst.setInt(57, Integer.parseInt(NFnom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito Modificado.");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar deposito: " + e.getMessage());
        }
    }

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

    public void Cleardeposito() {
        NFnom.setText("0");
        NEnom.setText("");
        NDL.setText("");
        Ap.setText("");
        am.setText("");
        name.setText("");
        Zon.setText("");
        ServN.setText("");
        sueldo.setText("0");
        Bonodep.setText("0");
        pd.setText("0");
        Quincenas.setSelectedIndex(0);
        año.setDate(null);
        Dpi.setText("0");
        pds.setText("0");
        Ddv.setText("0");
        PDDDV.setText("0");
        DD.setText("0");
        PDDD.setText("0");
        DL.setText("0");
        PDDL.setText("0");
        dt.setText("0");
        PDDT.setText("0");
        DSGS.setText("0");
        PDDDDSGS.setText("0");
        FJ.setText("0");
        DO.setText("0");
        R.setText("0");
        PCR.setText("0");
        apy.setText("0");
        Lugar.setText("");
        Rembolso.setText("0");
        ADD.setText("0");
        F.setText("0");
        DPF.setText("0");
        DI.setText("0");
        Fdb.setText("0");
        Sancion.setText("0");
        Chamarra.setText("0");
        Chaleco.setText("0");
        Fde.setText("0");
        Grua.setText("0");
        Pantalon.setText("0");
        Credencial.setText("0");
        Bp.setText("0");
        Playera.setText("0");
        Corbata.setText("0");
        Presp.setText("0");
        cda.setText("0");
        Odtp.setText("0");
        AdN.setText("0");
        deposito.setText("0");
        FDD.setDate(null);
        MDP.setSelectedIndex(0);
        FDP.setSelectedIndex(0);
        Obsdeposito.setText("0");
    }

    public void Agregardeposito() {
        String SQL = "INSERT INTO `rh.depositos` (`#Folio`, `#Lista`, `#Empleado`, "
                + "`Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, "
                + "`Sueldo`, `Bono`, `Por dia`, `Quincena del mes`, `Año`, "
                + "`Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`,"
                + " `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, "
                + "`Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, "
                + "`Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`,"
                + " `Faltas justificadas`, `Descanso otorgado`, `Retardos`, `Pago con retardos`, "
                + "`Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`,"
                + " `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`,"
                + " `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`,"
                + " `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`,"
                + "`Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`,"
                + " `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NEnom.getText());
            pst.setString(3, NDL.getText());
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, sueldo.getText());
            pst.setString(10, Bonodep.getText());
            pst.setString(11, pd.getText());
            pst.setString(12, Quincenas.getSelectedItem().toString());
            pst.setString(13, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(14, Dpi.getText());
            pst.setString(15, pds.getText());
            pst.setString(16, Ddv.getText());
            pst.setString(17, PDDDV.getText());
            pst.setString(18, DD.getText());
            pst.setString(19, PDDD.getText());
            pst.setString(20, DL.getText());
            pst.setString(21, PDDL.getText());
            pst.setString(22, dt.getText());
            pst.setString(23, PDDT.getText());
            pst.setString(24, DSGS.getText());
            pst.setString(25, PDDDDSGS.getText());
            pst.setString(26, FJ.getText());
            pst.setString(27, DO.getText());
            pst.setString(28, R.getText());
            pst.setString(29, PCR.getText());
            pst.setString(30, apy.getText());
            pst.setString(31, Lugar.getText());
            pst.setString(32, Rembolso.getText());
            pst.setString(33, ADD.getText());
            pst.setString(34, F.getText());
            pst.setString(35, DPF.getText());
            pst.setString(36, DI.getText());
            pst.setString(37, Fdb.getText());
            pst.setString(38, Sancion.getText());
            pst.setString(39, Chamarra.getText());
            pst.setString(40, Chaleco.getText());
            pst.setString(41, Fde.getText());
            pst.setString(42, Grua.getText());
            pst.setString(43, Pantalon.getText());
            pst.setString(44, Credencial.getText());
            pst.setString(45, Bp.getText());
            pst.setString(46, Playera.getText());
            pst.setString(47, Corbata.getText());
            pst.setString(48, Presp.getText());
            pst.setString(49, cda.getText());
            pst.setString(50, Odtp.getText());
            pst.setString(51, AdN.getText());
            pst.setString(52, deposito.getText());
            pst.setString(53, ((JTextField) FDD.getDateEditor().getUiComponent()).getText());
            pst.setString(54, MDP.getSelectedItem().toString());
            pst.setString(55, FDP.getSelectedItem().toString());
            pst.setString(56, Obsdeposito.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito agregado.");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar deposito: " + e.getMessage());
        }
    }

    public void MDDep() {
        //Buscar servicio

        String SQL = "SELECT * FROM `rh.depositos`";
        String FiltroN = Nominab1.getText();
        String FAPNom = FApT1.getText();
        String FAMNom = FAmT1.getText();
        String FiltroZnom = FiltroZnomina1.getSelectedItem().toString();
        String FiltroSnom = FiltroSnomina1.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina1.getSelectedItem().toString();
        String FiltroFol = FiltroNDF1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroZnom)) {
            SQL = "SELECT * FROM `rh.depositos` where `Zona   ` LIKE '%" + FiltroZnom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdepositos.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");//1
            modelo.addColumn("# Lista");
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");
            modelo.addColumn("Por dia");
            modelo.addColumn("Quincena");
            modelo.addColumn("Año");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago seguro");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Dias de descanso");
            modelo.addColumn("Pago de dias descansados");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Pago de dias laborados");
            modelo.addColumn("Descansos trabajados");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("Descanso otorgado");
            modelo.addColumn("Retardos");
            modelo.addColumn("Pago con retardos");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Descuento imss");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Sancion");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Chaleco");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Grua");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Playera");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Deposito");
            modelo.addColumn("Fecha de deposito");
            modelo.addColumn("Mes de pago");
            modelo.addColumn("Forma de pago");
            modelo.addColumn("Observaciones");

//Anchos
            int[] anchos = {/*#F*/10, /*NL*/ 10, /*NE*/ 10, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 80,
                /*Zona*/ 50, /*Serv*/ 80, /*Sueldo*/ 50, /*Bono*/ 50, /*PD*/ 30,
                /*Qdm*/ 75, /*año*/ 40, /*DDI*/ 50, /*PS*/ 50, /*DDV*/ 50,
                /*PDV*/ 50, /*DDD*/ 50, /*PDDD*/ 50, /*DL*/ 50, /*PDDL*/ 50,
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50,
                /*DO*/ 50, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdepositos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos " + e.getMessage());

        }

    }

    public void deposito() {

        double EG2 = Double.parseDouble(this.DI.getText());
        double EG4 = Double.parseDouble(this.cda.getText());
        double EG7 = Double.parseDouble(this.Odtp.getText());
        double EG8 = Double.parseDouble(this.Presp.getText());
        double EG16 = Double.parseDouble(this.DPF.getText());
//ingresos
        double IN3 = Double.parseDouble(this.ADD.getText());
        double IN5 = Double.parseDouble(this.apy.getText());
        double IN9 = Double.parseDouble(this.Rembolso.getText());
        double IN10 = Double.parseDouble(this.Bonodep.getText());
        double IN15 = Double.parseDouble(this.PCR.getText());
        double IN14 = Double.parseDouble(this.PDDD.getText());
        double IN1 = Double.parseDouble(this.PDDL.getText());
        double IN6 = Double.parseDouble(this.PDDT.getText());
        double IN13 = Double.parseDouble(this.PDDDDSGS.getText());

        double Ingresos = (IN13 + IN10 + IN9 + IN6 + IN3 + IN5 + IN14 + IN15 + IN1);
        double Egresos = (EG2 + EG7 + EG8 + EG4 + EG16);
        double total = Ingresos - Egresos;
        this.deposito.setText("" + total + "");
    }

    public void MDN() {
        //Buscar empleado
        String SQL = "SELECT `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`,  `quincena del mes`, `año`, `Dias de incapacidad`,"
                + " `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`,"
                + " `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`,"
                + " `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`,"
                + " `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, "
                + "`Descanso Otorgado`, `Retardos`, `Pago con retardos`, `Apoyo`,"
                + " `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, "
                + "`Desc IMSS`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`,"
                + " `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`,"
                + " `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Pago de prestamo`,"
                + " `Caja de ahorro`, `Orden de taller`, `Deposito` FROM `nomina.detallada`";

        String FiltroN = Nominab.getText();
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroZnom = FiltroZnomina.getSelectedItem().toString();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`,"
                    + " `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `quincena del mes`, "
                    + "`año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, "
                    + "`Pago de dias de vacaciones`, `Dias descansados`, "
                    + "`Pago de dias descansados`, `Dias Laborados`,"
                    + " `Pago de dias laborados`, `Descansos Trabajados`, "
                    + "`Pago de dias trabajados`, `Descanso sin goce de sueldo`, "
                    + "`Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`,"
                    + " `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, "
                    + "`Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`,"
                    + " `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`,"
                    + " `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, "
                    + "`Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Pago de prestamo`, "
                    + "`Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`,"
                    + " `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `quincena del mes`, `año`,"
                    + "`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`,"
                    + " `Pago de dias de vacaciones`, `Dias descansados`, "
                    + "`Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, "
                    + "`Descansos Trabajados`, `Pago de dias trabajados`,"
                    + " `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, "
                    + "`Faltas Justificadas`, `Descanso Otorgado`, `Retardos`, "
                    + "`Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, "
                    + "`Faltas`, `Descuento por faltas`, `Desc IMSS`, `Faltantes de boleto`, "
                    + "`Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, "
                    + "`Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, "
                    + "`Corbata`, `Adelanto de nomina`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`,"
                    + " `Deposito` from `nomina.detallada` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`,"
                    + " `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`,  `por dia`, `quincena del mes`,`año`,"
                    + "`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`,"
                    + " `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`,"
                    + " `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, "
                    + "`Pago de dias trabajados`, `Descanso sin goce de sueldo`,"
                    + " `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`,"
                    + " `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, "
                    + "`Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, "
                    + "`Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`,"
                    + " `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, "
                    + "`Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from "
                    + "`nomina.detallada` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Zona`, `Servicio`, `Sueldo`, `Bono`,  `por dia`, `quincena del mes`,`año`,`Dias de incapacidad`, "
                    + "`Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, "
                    + "`Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, "
                    + "`Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, "
                    + "`Descanso sin goce de sueldo`, `Pago de dias de DSGS`, "
                    + "`Faltas Justificadas`, `Descanso Otorgado`, `Retardos`, "
                    + "`Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, "
                    + "`Faltas`, `Descuento por faltas`, `Desc IMSS`, `Faltantes de boleto`, "
                    + "`Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, "
                    + "`Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, "
                    + "`Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` "
                    + "from `nomina.detallada` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroZnom)) {
            SQL = "select `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `quincena del mes`,`año`,`Dias de incapacidad`, "
                    + "`Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, "
                    + "`Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, "
                    + "`Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, "
                    + "`Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, "
                    + "`Descanso Otorgado`, `Retardos`, `Pago con retardos`, `Apoyo`,"
                    + " `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, "
                    + "`Desc IMSS`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`,"
                    + " `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, "
                    + "`Playera`, `Corbata`, `Adelanto de nomina`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, "
                    + "`Deposito` from `nomina.detallada` where `Zona   ` LIKE '%" + FiltroZnom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                    + " `Servicio`, `Sueldo`, `Bono`, `por dia`, `quincena del mes`, `año`, `Dias de incapacidad`, `Pago de seguro`, "
                    + "`Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, "
                    + "`Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, "
                    + "`Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, "
                    + "`Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`,"
                    + " `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`,"
                    + " `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`,"
                    + " `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`,"
                    + " `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, "
                    + "`Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Pago de prestamo`, "
                    + "`Caja de ahorro`, `Orden de taller`, `Deposito` from nomina"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select  `#Folio`, `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `quincena del mes`,`año`,`Dias de incapacidad`, "
                    + "`Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, "
                    + "`Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, "
                    + "`Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, "
                    + "`Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, "
                    + "`Descanso Otorgado`, `Retardos`, `Pago con retardos`, `Apoyo`, "
                    + "`Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, "
                    + "`Desc IMSS`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`,"
                    + " `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`,"
                    + " `Playera`, `Corbata`, `Adelanto de nomina`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, "
                    + "`Deposito` from `nomina.detallada` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdeposito.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# lista");//1
            modelo.addColumn("# Empleado");//2
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//4
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Sueldo");//8
            modelo.addColumn("Bono");
            modelo.addColumn("Por dia");
            modelo.addColumn("Quincena del mes");//10
            modelo.addColumn("Año");
            modelo.addColumn("Dias de incapacidad");//12
            modelo.addColumn("Pago de seguro");
            modelo.addColumn("Dias de vacaciones");//14
            modelo.addColumn("Pago de dias de vacaciones");
            modelo.addColumn("Dias descansados");//16
            modelo.addColumn("Pago de dias descansados");
            modelo.addColumn("Dias Laborados");//18
            modelo.addColumn("Pago de dias laborados");
            modelo.addColumn("Descansos Trabajados");//20
            modelo.addColumn("Pago de descansos trabajados");
            modelo.addColumn("Descanso sin goce de sueldo");//22
            modelo.addColumn("Pago de dias de DSGS");
            modelo.addColumn("Faltas Justificadas");//24
            modelo.addColumn("Descanso Otorgado");
            modelo.addColumn("Retardos");//26
            modelo.addColumn("Pago con retardos");
            modelo.addColumn("Apoyo");//28
            modelo.addColumn("Lugar");
            modelo.addColumn("Rembolso");//30
            modelo.addColumn("Adicionales");
            modelo.addColumn("Faltas");//32
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Desc IMSS");//34
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Sancion");//36
            modelo.addColumn("Chamarra");
            modelo.addColumn("Chaleco");//38
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Grua");//40
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");//42
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Playera");//44
            modelo.addColumn("Corbata");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//48
            modelo.addColumn("Deposito");

//Anchos hasta quincena
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150,
                /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50, /*pordia*/ 50,
                /*QDM*/ 150, /*AÑO*/ 35, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*adn*/60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdeposito.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RH = new javax.swing.JTabbedPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane17 = new javax.swing.JScrollPane();
        Tdeposito = new javax.swing.JTable();
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
        jLabel90 = new javax.swing.JLabel();
        FiltrosTD = new javax.swing.JComboBox<>();
        LabelBNDF = new javax.swing.JLabel();
        FiltroNDF = new javax.swing.JTextField();
        FApT = new javax.swing.JTextField();
        FAmT = new javax.swing.JTextField();
        botonWeb3 = new botones.BotonWeb();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        Dpi = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        Ddv = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        DD = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        DL = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        LabelDSGS = new javax.swing.JLabel();
        DSGS = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        PDDDV = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        PDDD = new javax.swing.JLabel();
        pds = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        PDDL = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        PDDT = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        PDDDDSGS = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        DO = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        apy = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        Lugar = new javax.swing.JTextField();
        FJ = new javax.swing.JLabel();
        Rembolso = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        ADD = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        PCR = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        deposito = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        DI = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        Presp = new javax.swing.JTextField();
        cda = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        Odtp = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        DPF = new javax.swing.JLabel();
        pd = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        Quincenas = new javax.swing.JComboBox<>();
        jLabel101 = new javax.swing.JLabel();
        año = new com.toedter.calendar.JDateChooser();
        jLabel102 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        FDD = new com.toedter.calendar.JDateChooser();
        MDP = new javax.swing.JComboBox<>();
        FDP = new javax.swing.JComboBox<>();
        jScrollPane16 = new javax.swing.JScrollPane();
        Obsdeposito = new javax.swing.JTextArea();
        Adddeposito = new javax.swing.JButton();
        Adddeposito1 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        DVT = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        Fdb = new javax.swing.JTextField();
        jLabel126 = new javax.swing.JLabel();
        Sancion = new javax.swing.JTextField();
        jLabel127 = new javax.swing.JLabel();
        Chamarra = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        Chaleco = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        Fde = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        Grua = new javax.swing.JTextField();
        jLabel134 = new javax.swing.JLabel();
        Pantalon = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        Credencial = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        Bp = new javax.swing.JTextField();
        jLabel139 = new javax.swing.JLabel();
        Playera = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        Corbata = new javax.swing.JTextField();
        jLabel167 = new javax.swing.JLabel();
        AdN = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        Zon = new javax.swing.JTextField();
        ServN = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        Bonodep = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        Datgen = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        NDL = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel141 = new javax.swing.JLabel();
        NEnom = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        NFnom = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel13 = new javax.swing.JPanel();
        jLabel72 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        Tdepositos = new javax.swing.JTable();
        Fildepositos = new javax.swing.JComboBox<>();
        FiltroNDF1 = new javax.swing.JTextField();
        FiltroZnomina1 = new javax.swing.JComboBox<>();
        FApT1 = new javax.swing.JTextField();
        LabelBS1 = new javax.swing.JLabel();
        FAmT1 = new javax.swing.JTextField();
        FiltroSnomina1 = new javax.swing.JComboBox<>();
        botonWeb5 = new botones.BotonWeb();
        LabelBQ1 = new javax.swing.JLabel();
        FiltroQuincenanomina1 = new javax.swing.JComboBox<>();
        LabelSZ1 = new javax.swing.JLabel();
        FZservicio1 = new javax.swing.JComboBox<>();
        LabelBE1 = new javax.swing.JLabel();
        Nominab1 = new javax.swing.JTextField();
        LabelBNDF1 = new javax.swing.JLabel();
        LabelBZ1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Alumnos = new javax.swing.JMenuItem();
        EmpleadosT = new javax.swing.JMenuItem();
        Menuadm = new javax.swing.JMenu();
        Nomina = new javax.swing.JMenuItem();
        Administradores = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        Usuariosnom = new javax.swing.JMenuItem();
        UsuariosRH = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Interface de Recursos Humanos");

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));

        Tdeposito.setModel(new javax.swing.table.DefaultTableModel(
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
        Tdeposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TdepositoMouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(Tdeposito);

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

        jLabel90.setText("Filtros:");

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

        botonWeb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb3.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane17))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(jLabel90)
                    .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF)
                    .addComponent(FiltroNDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS2)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel14);

        RH.addTab("Tabla detallada Nomina", jScrollPane9);

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));

        Dpi.setText("0");

        jLabel105.setText("Dias de incapacidad:");

        Ddv.setText("0");

        jLabel107.setText("Dias de vacaciones:");

        DD.setText("0");

        jLabel103.setText("Dias descansados:");

        jLabel74.setText("Dias Laborados:");

        DL.setText("0");

        jLabel75.setText("Descansos Trabajados:");

        dt.setText("0");

        LabelDSGS.setText("Descanso sin goce de sueldo:");

        DSGS.setText("0");

        jLabel104.setText("Pago de seguro:");

        PDDDV.setText("0");

        jLabel76.setText("Pago de dias de vacaciones:");

        jLabel88.setText("Pago de dias descansados:");

        PDDD.setText("0");

        pds.setText("0");

        jLabel128.setText("Pago de dias laborados:");

        PDDL.setText("0");

        jLabel77.setText("Pago de descansos trabajados:");

        PDDT.setText("0");

        jLabel136.setText("Pago de dias de DSGS:");

        PDDDDSGS.setText("0");
        PDDDDSGS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PDDDDSGSKeyReleased(evt);
            }
        });

        jLabel78.setText("Faltas Justificadas:");

        jLabel79.setText("Descanso Otorgado:");

        DO.setText("0");

        jLabel80.setText("Apoyo:");

        apy.setText("0");
        apy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apyKeyReleased(evt);
            }
        });

        jLabel81.setText("Lugar:");

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

        jLabel82.setText("Adicionales:");

        jLabel83.setText("Dias con retardos:");

        R.setText("0");

        jLabel138.setText("Pago con retardos:");

        PCR.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78)
                    .addComponent(LabelDSGS)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81))
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
                                    .addComponent(jLabel76)
                                    .addComponent(jLabel104)
                                    .addComponent(jLabel128)
                                    .addComponent(jLabel77)
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
                            .addComponent(jLabel82))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Rembolso, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(ADD))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                            .addComponent(jLabel83)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
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
                    .addComponent(jLabel76)
                    .addComponent(PDDDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DD)
                    .addComponent(jLabel103)
                    .addComponent(jLabel88)
                    .addComponent(PDDD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(DL)
                    .addComponent(jLabel128)
                    .addComponent(PDDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(dt)
                    .addComponent(jLabel77)
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
                            .addComponent(jLabel78)
                            .addComponent(FJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(DO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel123.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel123.setText("Deposito:");

        deposito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deposito.setText("0");

        jLabel60.setText("Desc IMSS:");

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

        jLabel84.setText("Pago de prestamo:");

        Presp.setText("0");
        Presp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrespKeyReleased(evt);
            }
        });

        cda.setText("0");
        cda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdaKeyReleased(evt);
            }
        });

        jLabel61.setText("Ahorro por Qna:");

        jLabel85.setText("Orden de taller:");

        F.setText("0");

        Odtp.setText("0");
        Odtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OdtpKeyReleased(evt);
            }
        });

        jLabel26.setText("Dias con faltas:");

        jLabel137.setText("Descuento por faltas:");

        DPF.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel137)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DPF))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addComponent(jLabel85)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel16Layout.createSequentialGroup()
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel84)
                                .addComponent(jLabel60)
                                .addComponent(jLabel26))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(F)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DI, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Presp))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(F)
                    .addComponent(jLabel137)
                    .addComponent(DPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel85))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pd.setText("0");

        jLabel89.setText("Por dia:");

        Quincenas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Quincena", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));

        jLabel101.setText("Año:");

        año.setDateFormatString("yyyy");

        jLabel102.setText("Fecha de deposito:");

        jLabel106.setText("Mes de pago:");

        jLabel109.setText("Forma de pago");

        jLabel110.setText("Observaciones");

        MDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        FDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Santander", "BBVA", "Efectivo", "Tarjeta y efectivo" }));

        Obsdeposito.setColumns(20);
        Obsdeposito.setLineWrap(true);
        Obsdeposito.setRows(5);
        jScrollPane16.setViewportView(Obsdeposito);

        Adddeposito.setText("Agregar");
        Adddeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdddepositoActionPerformed(evt);
            }
        });

        Adddeposito1.setText("Modificar");
        Adddeposito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adddeposito1ActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));

        jLabel122.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel122.setText("Descuentos varios:");

        jLabel124.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel124.setText("Total de descuentos varios:");

        DVT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DVT.setText("0");

        jLabel125.setText("Faltantes de boleto:");

        Fdb.setText("0");
        Fdb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FdbKeyReleased(evt);
            }
        });

        jLabel126.setText("Sancion:");

        Sancion.setText("0");
        Sancion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SancionKeyReleased(evt);
            }
        });

        jLabel127.setText("Chamarra:");

        Chamarra.setText("0");
        Chamarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChamarraKeyReleased(evt);
            }
        });

        jLabel129.setText("Chaleco:");

        Chaleco.setText("0");
        Chaleco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChalecoKeyReleased(evt);
            }
        });

        jLabel131.setText("Faltante de efectivo:");

        Fde.setText("0");
        Fde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FdeKeyReleased(evt);
            }
        });

        jLabel132.setText("Grua:");

        Grua.setText("0");
        Grua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GruaKeyReleased(evt);
            }
        });

        jLabel134.setText("Pantalon:");

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

        jLabel135.setText("Boleto perdido:");

        Bp.setText("0");
        Bp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BpKeyReleased(evt);
            }
        });

        jLabel139.setText("Playera:");

        Playera.setText("0");
        Playera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PlayeraKeyReleased(evt);
            }
        });

        jLabel140.setText("Corbata:");

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

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel122))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DVT))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel126)
                            .addComponent(jLabel125)
                            .addComponent(jLabel127)
                            .addComponent(jLabel129)
                            .addComponent(jLabel131)
                            .addComponent(jLabel132))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel167))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel140))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel139))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel135))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel134)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Pantalon, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Credencial, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Bp, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Playera, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(Corbata, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(AdN))))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel122)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel134)
                    .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel126)
                    .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel86)
                    .addComponent(Credencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel135)
                    .addComponent(Bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel139)
                    .addComponent(Playera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel140)
                    .addComponent(Corbata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel132)
                    .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel167)
                    .addComponent(AdN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(DVT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(204, 255, 255));

        jLabel91.setText("Servicio:");

        jLabel92.setText("Zona:");

        jLabel93.setText("Bono:");

        Bonodep.setText("0");

        jLabel95.setText("Sueldo:");

        sueldo.setText("0");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bonodep, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel92)
                            .addComponent(jLabel91)
                            .addComponent(jLabel95))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(ServN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Zon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(sueldo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(ServN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(Bonodep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        Datgen.setBackground(new java.awt.Color(204, 255, 255));

        jLabel97.setText("# Lista:");

        jLabel98.setText("Apellido P:");

        jLabel99.setText("Apellido M:");

        jLabel100.setText("Nombre(s):");

        jLabel141.setText("# empleado:");

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
                    .addComponent(jLabel141)
                    .addComponent(jLabel100)
                    .addComponent(jLabel99)
                    .addComponent(jLabel98)
                    .addComponent(jLabel97))
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
                    .addComponent(jLabel141)
                    .addComponent(NEnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(NDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel100)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel133.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel133.setText("Datos del empleado.");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(Datgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel89)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel123)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deposito))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel110))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(FDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel101)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(Adddeposito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Adddeposito1))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel133)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Datgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel101))
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(deposito))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102)
                            .addComponent(FDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(MDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel110)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Adddeposito)
                            .addComponent(Adddeposito1))))
                .addContainerGap(225, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(jPanel9);

        RH.addTab("Registro de depositos", jScrollPane10);

        jLabel72.setText("Filtros:");

        Tdepositos.setModel(new javax.swing.table.DefaultTableModel(
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
        Tdepositos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TdepositosMouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(Tdepositos);

        Fildepositos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        Fildepositos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FildepositosItemStateChanged(evt);
            }
        });

        FiltroNDF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF1KeyReleased(evt);
            }
        });

        FiltroZnomina1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZnomina1ItemStateChanged(evt);
            }
        });

        FApT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT1KeyReleased(evt);
            }
        });

        LabelBS1.setText("Buscar Servicio:");

        FAmT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT1KeyReleased(evt);
            }
        });

        FiltroSnomina1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina1ItemStateChanged(evt);
            }
        });

        botonWeb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N

        LabelBQ1.setText("Buscar Quincena:");

        FiltroQuincenanomina1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina1ItemStateChanged(evt);
            }
        });

        LabelSZ1.setText("Selecciona Zona:");

        FZservicio1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio1ItemStateChanged(evt);
            }
        });

        LabelBE1.setText("Buscar Empleado:");

        Nominab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab1KeyReleased(evt);
            }
        });

        LabelBNDF1.setText("Buscar por # Lista");

        LabelBZ1.setText("Buscar Zona");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel72)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fildepositos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBZ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroZnomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 7346, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(Fildepositos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelBE1)
                        .addComponent(Nominab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelBZ1)
                        .addComponent(FiltroZnomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelBS1)
                        .addComponent(FiltroSnomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelBQ1)
                        .addComponent(FiltroQuincenanomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelSZ1)
                        .addComponent(FZservicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelBNDF1)
                        .addComponent(FiltroNDF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FApT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FAmT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(jPanel13);

        RH.addTab("Tabla depositos", jScrollPane12);

        jMenu1.setText("Cambiar a:");

        Alumnos.setText("Alumnos estadia");
        Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(Alumnos);

        EmpleadosT.setText("Empelados torteria");
        EmpleadosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosTActionPerformed(evt);
            }
        });
        jMenu1.add(EmpleadosT);

        jMenuBar1.add(jMenu1);

        Menuadm.setText("Todas las ventanas");

        Nomina.setText("Ventana Nomina");
        Nomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NominaActionPerformed(evt);
            }
        });
        Menuadm.add(Nomina);

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

        Usuariosnom.setText("Usuarios Nomina");
        Usuariosnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosnomActionPerformed(evt);
            }
        });
        Menuadm.add(Usuariosnom);

        UsuariosRH.setText("Usuarios RH");
        UsuariosRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuariosRHActionPerformed(evt);
            }
        });
        Menuadm.add(UsuariosRH);

        jMenuBar1.add(Menuadm);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RH, javax.swing.GroupLayout.DEFAULT_SIZE, 1296, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(RH, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosActionPerformed

        Admin_Estadias_4 regr = new Admin_Estadias_4();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlumnosActionPerformed

    private void EmpleadosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosTActionPerformed

        Admin_Tortas_4 regr = new Admin_Tortas_4();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosTActionPerformed

    private void NominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NominaActionPerformed

        Admin_NominaQ_5 regr = new Admin_NominaQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_NominaActionPerformed

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

    private void UsuariosnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosnomActionPerformed

        Usuarios_Nomina_3 regr = new Usuarios_Nomina_3();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsuariosnomActionPerformed

    private void UsuariosRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuariosRHActionPerformed

        Usuarios_RH_3 regr = new Usuarios_RH_3();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsuariosRHActionPerformed

    private void TdepositosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TdepositosMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tdeposito.getModel();

            int fila = Tdeposito.getSelectedRow();
            NFnom.setText(String.valueOf(Tdeposito.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdeposito.getValueAt(fila, 1)));
            NEnom.setText(String.valueOf(Tdeposito.getValueAt(fila, 2)));
            Ap.setText(String.valueOf(Tdeposito.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tdeposito.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tdeposito.getValueAt(fila, 5)));
            Zon.setText(String.valueOf(Tdeposito.getValueAt(fila, 6)));
            ServN.setText(String.valueOf(Tdeposito.getValueAt(fila, 7)));
            sueldo.setText(String.valueOf(Tdeposito.getValueAt(fila, 8)));
            Bonodep.setText(String.valueOf(Tdeposito.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tdeposito.getValueAt(fila, 10)));
            String Quinc = model.getValueAt(fila, 11).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 12));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tdeposito.getValueAt(fila, 13)));
            pds.setText(String.valueOf(Tdeposito.getValueAt(fila, 14)));
            Ddv.setText(String.valueOf(Tdeposito.getValueAt(fila, 15)));
            PDDDV.setText(String.valueOf(Tdeposito.getValueAt(fila, 16)));
            DD.setText(String.valueOf(Tdeposito.getValueAt(fila, 17)));
            PDDD.setText(String.valueOf(Tdeposito.getValueAt(fila, 18)));
            DL.setText(String.valueOf(Tdeposito.getValueAt(fila, 19)));
            PDDL.setText(String.valueOf(Tdeposito.getValueAt(fila, 20)));
            dt.setText(String.valueOf(Tdeposito.getValueAt(fila, 21)));
            PDDT.setText(String.valueOf(Tdeposito.getValueAt(fila, 22)));
            DSGS.setText(String.valueOf(Tdeposito.getValueAt(fila, 23)));
            PDDDDSGS.setText(String.valueOf(Tdeposito.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdeposito.getValueAt(fila, 25)));
            DO.setText(String.valueOf(Tdeposito.getValueAt(fila, 26)));
            R.setText(String.valueOf(Tdeposito.getValueAt(fila, 27)));
            PCR.setText(String.valueOf(Tdeposito.getValueAt(fila, 28)));
            apy.setText(String.valueOf(Tdeposito.getValueAt(fila, 29)));
            Lugar.setText(String.valueOf(Tdeposito.getValueAt(fila, 30)));
            Rembolso.setText(String.valueOf(Tdeposito.getValueAt(fila, 31)));
            ADD.setText(String.valueOf(Tdeposito.getValueAt(fila, 32)));
            F.setText(String.valueOf(Tdeposito.getValueAt(fila, 33)));
            DPF.setText(String.valueOf(Tdeposito.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdeposito.getValueAt(fila, 35)));
            Fdb.setText(String.valueOf(Tdeposito.getValueAt(fila, 36)));
            Sancion.setText(String.valueOf(Tdeposito.getValueAt(fila, 37)));
            Chamarra.setText(String.valueOf(Tdeposito.getValueAt(fila, 38)));
            Chaleco.setText(String.valueOf(Tdeposito.getValueAt(fila, 39)));
            Fde.setText(String.valueOf(Tdeposito.getValueAt(fila, 40)));
            Grua.setText(String.valueOf(Tdeposito.getValueAt(fila, 41)));
            Pantalon.setText(String.valueOf(Tdeposito.getValueAt(fila, 42)));
            Credencial.setText(String.valueOf(Tdeposito.getValueAt(fila, 43)));
            Bp.setText(String.valueOf(Tdeposito.getValueAt(fila, 44)));
            Playera.setText(String.valueOf(Tdeposito.getValueAt(fila, 45)));
            Corbata.setText(String.valueOf(Tdeposito.getValueAt(fila, 46)));
            Presp.setText(String.valueOf(Tdeposito.getValueAt(fila, 47)));
            cda.setText(String.valueOf(Tdeposito.getValueAt(fila, 48)));
            Odtp.setText(String.valueOf(Tdeposito.getValueAt(fila, 49)));
            AdN.setText(String.valueOf(Tdeposito.getValueAt(fila, 50)));
            deposito.setText(String.valueOf(Tdeposito.getValueAt(fila, 51)));
            Date FDPago = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 52));
            FDD.setDate(FDPago);
            String Mes = model.getValueAt(fila, 53).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            String Metodo = model.getValueAt(fila, 54).toString();
            for (int i = 0; i < FDP.getItemCount(); i++) {
                if (FDP.getItemAt(i).equalsIgnoreCase(Metodo)) {
                    FDP.setSelectedIndex(i);
                }
            }
            Obsdeposito.setText(String.valueOf(Tdeposito.getValueAt(fila, 55)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_Depositos_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TdepositosMouseClicked

    private void FiltroNDF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF1KeyReleased
        MDDep();
    }//GEN-LAST:event_FiltroNDF1KeyReleased

    private void FiltroZnomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZnomina1ItemStateChanged
        MDDep();
    }//GEN-LAST:event_FiltroZnomina1ItemStateChanged

    private void FApT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT1KeyReleased
        MDDep();
    }//GEN-LAST:event_FApT1KeyReleased

    private void FAmT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT1KeyReleased
        MDDep();
    }//GEN-LAST:event_FAmT1KeyReleased

    private void FiltroSnomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina1ItemStateChanged
        MDDep();
    }//GEN-LAST:event_FiltroSnomina1ItemStateChanged

    private void FiltroQuincenanomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina1ItemStateChanged
        MDDep();
    }//GEN-LAST:event_FiltroQuincenanomina1ItemStateChanged

    private void FZservicio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio1ItemStateChanged
        MDDep();
    }//GEN-LAST:event_FZservicio1ItemStateChanged

    private void Nominab1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab1KeyReleased
        MDDep();
    }//GEN-LAST:event_Nominab1KeyReleased

    private void FildepositosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FildepositosItemStateChanged
        String dt = (String) Fildepositos.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();

        }
        if (dt.equals("Filtrar por Apellido P")) {
            Nominab1.setText("");
            LabelBE1.setVisible(true);
            LabelBE1.setText("Buscar Apellido P:");
            FApT1.setText("");
            FApT1.setVisible(true);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();
        }
        if (dt.equals("Filtrar por Apellido M")) {
            Nominab1.setText("");
            LabelBE1.setVisible(true);
            LabelBE1.setText("Buscar Apellido M:");
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(true);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();
        }
        if (dt.equals("Filtrar por Nombre(s)")) {
            Nominab1.setText("");
            LabelBE1.setVisible(true);
            LabelBE1.setText("Buscar Nombre(s):");
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(true);
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();
        }
        if (dt.equals("Filtrar por Zona")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroZnomina1.setVisible(true);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(true);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();
        }
        if (dt.equals("Filtrar por Servicio")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(true);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(true);
            FZservicio1.setVisible(true);
            LabelSZ1.setVisible(true);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();
        }
        if (dt.equals("Filtrar por quincena")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(true);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(true);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            MDDep();
        }
        if (dt.equals("Filtrar por # Lista")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroZnomina1.setVisible(false);
            FiltroZnomina1.setSelectedIndex(0);
            LabelBZ1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ1.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(true);
            LabelBNDF1.setVisible(true);
            MDDep();
        }
    }//GEN-LAST:event_FildepositosItemStateChanged

    private void TdepositoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TdepositoMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tdeposito.getModel();

            int fila = Tdeposito.getSelectedRow();
            NFnom.setText(String.valueOf(Tdeposito.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdeposito.getValueAt(fila, 1)));
            NEnom.setText(String.valueOf(Tdeposito.getValueAt(fila, 2)));
            Ap.setText(String.valueOf(Tdeposito.getValueAt(fila, 3)));//3
            am.setText(String.valueOf(Tdeposito.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tdeposito.getValueAt(fila, 5)));
            Zon.setText(String.valueOf(Tdeposito.getValueAt(fila, 6)));
            ServN.setText(String.valueOf(Tdeposito.getValueAt(fila, 7)));
            sueldo.setText(String.valueOf(Tdeposito.getValueAt(fila, 8)));
            Bonodep.setText(String.valueOf(Tdeposito.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tdeposito.getValueAt(fila, 10)));
            String combo1 = model.getValueAt(fila, 11).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 12));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tdeposito.getValueAt(fila, 13)));
            pds.setText(String.valueOf(Tdeposito.getValueAt(fila, 14)));
            Ddv.setText(String.valueOf(Tdeposito.getValueAt(fila, 15)));
            PDDDV.setText(String.valueOf(Tdeposito.getValueAt(fila, 16)));
            DD.setText(String.valueOf(Tdeposito.getValueAt(fila, 17)));
            PDDD.setText(String.valueOf(Tdeposito.getValueAt(fila, 18)));
            DL.setText(String.valueOf(Tdeposito.getValueAt(fila, 19)));
            PDDL.setText(String.valueOf(Tdeposito.getValueAt(fila, 20)));
            dt.setText(String.valueOf(Tdeposito.getValueAt(fila, 21)));
            PDDT.setText(String.valueOf(Tdeposito.getValueAt(fila, 22)));
            DSGS.setText(String.valueOf(Tdeposito.getValueAt(fila, 23)));
            PDDDDSGS.setText(String.valueOf(Tdeposito.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdeposito.getValueAt(fila, 25)));
            DO.setText(String.valueOf(Tdeposito.getValueAt(fila, 26)));
            R.setText(String.valueOf(Tdeposito.getValueAt(fila, 27)));
            PCR.setText(String.valueOf(Tdeposito.getValueAt(fila, 28)));
            apy.setText(String.valueOf(Tdeposito.getValueAt(fila, 29)));
            Lugar.setText(String.valueOf(Tdeposito.getValueAt(fila, 30)));
            Rembolso.setText(String.valueOf(Tdeposito.getValueAt(fila, 31)));
            ADD.setText(String.valueOf(Tdeposito.getValueAt(fila, 32)));
            F.setText(String.valueOf(Tdeposito.getValueAt(fila, 33)));
            DPF.setText(String.valueOf(Tdeposito.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdeposito.getValueAt(fila, 35)));
            Fdb.setText(String.valueOf(Tdeposito.getValueAt(fila, 36)));
            Sancion.setText(String.valueOf(Tdeposito.getValueAt(fila, 37)));
            Chamarra.setText(String.valueOf(Tdeposito.getValueAt(fila, 38)));
            Chaleco.setText(String.valueOf(Tdeposito.getValueAt(fila, 39)));
            Fde.setText(String.valueOf(Tdeposito.getValueAt(fila, 40)));
            Grua.setText(String.valueOf(Tdeposito.getValueAt(fila, 41)));
            Pantalon.setText(String.valueOf(Tdeposito.getValueAt(fila, 42)));
            Credencial.setText(String.valueOf(Tdeposito.getValueAt(fila, 43)));
            Bp.setText(String.valueOf(Tdeposito.getValueAt(fila, 44)));
            Playera.setText(String.valueOf(Tdeposito.getValueAt(fila, 45)));
            Corbata.setText(String.valueOf(Tdeposito.getValueAt(fila, 46)));
            AdN.setText(String.valueOf(Tdeposito.getValueAt(fila, 47)));
            Presp.setText(String.valueOf(Tdeposito.getValueAt(fila, 48)));
            cda.setText(String.valueOf(Tdeposito.getValueAt(fila, 49)));
            Odtp.setText(String.valueOf(Tdeposito.getValueAt(fila, 50)));
            deposito.setText(String.valueOf(Tdeposito.getValueAt(fila, 51)));

            desv();
        } catch (ParseException ex) {
            Logger.getLogger(Admin_Depositos_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TdepositoMouseClicked

    private void NominabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NominabKeyReleased

        MDN();
    }//GEN-LAST:event_NominabKeyReleased

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        MDN();
    }//GEN-LAST:event_EliminarActionPerformed

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void FiltroZnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZnominaItemStateChanged

        MDN();
    }//GEN-LAST:event_FiltroZnominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged

        MDN();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void FiltroQuincenanominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanominaItemStateChanged

        MDN();
    }//GEN-LAST:event_FiltroQuincenanominaItemStateChanged

    private void FZservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicioItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina.setModel(modelServicio);
        }
        MDN();
    }//GEN-LAST:event_FZservicioItemStateChanged

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

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased

        MDN();
    }//GEN-LAST:event_FiltroNDFKeyReleased

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased

        MDN();
    }//GEN-LAST:event_FApTKeyReleased

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased

        MDN();
    }//GEN-LAST:event_FAmTKeyReleased

    private void AdNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdNKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_AdNKeyReleased

    private void CorbataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorbataKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_CorbataKeyReleased

    private void PlayeraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayeraKeyReleased

        desv();
        deposito();
    }//GEN-LAST:event_PlayeraKeyReleased

    private void BpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BpKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_BpKeyReleased

    private void CredencialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CredencialKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_CredencialKeyReleased

    private void PantalonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PantalonKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_PantalonKeyReleased

    private void GruaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GruaKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_GruaKeyReleased

    private void FdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdeKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_FdeKeyReleased

    private void ChalecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChalecoKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ChalecoKeyReleased

    private void ChamarraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChamarraKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ChamarraKeyReleased

    private void SancionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SancionKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_SancionKeyReleased

    private void FdbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdbKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_FdbKeyReleased

    private void Adddeposito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adddeposito1ActionPerformed
        Modeposito();
        Cleardeposito();
        MDDep();
    }//GEN-LAST:event_Adddeposito1ActionPerformed

    private void AdddepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdddepositoActionPerformed
        Agregardeposito();
        Cleardeposito();
        MDDep();
    }//GEN-LAST:event_AdddepositoActionPerformed

    private void OdtpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OdtpKeyReleased
        deposito();
    }//GEN-LAST:event_OdtpKeyReleased

    private void cdaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdaKeyReleased
        deposito();
    }//GEN-LAST:event_cdaKeyReleased

    private void PrespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrespKeyReleased
        deposito();
    }//GEN-LAST:event_PrespKeyReleased

    private void DIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIKeyReleased
        deposito();
    }//GEN-LAST:event_DIKeyReleased

    private void DIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIActionPerformed

    }//GEN-LAST:event_DIActionPerformed

    private void ADDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADDKeyReleased
        deposito();
    }//GEN-LAST:event_ADDKeyReleased

    private void RembolsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RembolsoKeyReleased
        deposito();
    }//GEN-LAST:event_RembolsoKeyReleased

    private void apyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apyKeyReleased
        deposito();
    }//GEN-LAST:event_apyKeyReleased

    private void PDDDDSGSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDDDDSGSKeyReleased
        deposito();
    }//GEN-LAST:event_PDDDDSGSKeyReleased

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
            java.util.logging.Logger.getLogger(Admin_Depositos_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Depositos_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD;
    private javax.swing.JTextField AdN;
    private javax.swing.JButton Adddeposito;
    private javax.swing.JButton Adddeposito1;
    private javax.swing.JMenuItem Administradores;
    private javax.swing.JMenuItem Alumnos;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField Bonodep;
    private javax.swing.JTextField Bp;
    private javax.swing.JButton CS2;
    private javax.swing.JTextField Chaleco;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
    private javax.swing.JLabel DD;
    private javax.swing.JTextField DI;
    private javax.swing.JLabel DL;
    private javax.swing.JLabel DO;
    private javax.swing.JLabel DPF;
    private javax.swing.JLabel DSGS;
    private javax.swing.JLabel DVT;
    private javax.swing.JPanel Datgen;
    private javax.swing.JLabel Ddv;
    private javax.swing.JLabel Dpi;
    private javax.swing.JButton Eliminar;
    private javax.swing.JMenuItem EmpleadosT;
    private javax.swing.JLabel F;
    private javax.swing.JTextField FAmT;
    private javax.swing.JTextField FAmT1;
    private javax.swing.JTextField FApT;
    private javax.swing.JTextField FApT1;
    private com.toedter.calendar.JDateChooser FDD;
    private javax.swing.JComboBox<String> FDP;
    private javax.swing.JLabel FJ;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JComboBox<String> FZservicio1;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JComboBox<String> Fildepositos;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JTextField FiltroNDF1;
    private javax.swing.JComboBox<String> FiltroQuincenanomina;
    private javax.swing.JComboBox<String> FiltroQuincenanomina1;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroSnomina1;
    private javax.swing.JComboBox<String> FiltroZnomina;
    private javax.swing.JComboBox<String> FiltroZnomina1;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JTextField Grua;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBE1;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBNDF1;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQ1;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBS1;
    private javax.swing.JLabel LabelBZ;
    private javax.swing.JLabel LabelBZ1;
    private javax.swing.JLabel LabelDSGS;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZ1;
    private javax.swing.JTextField Lugar;
    private javax.swing.JComboBox<String> MDP;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NEnom;
    private javax.swing.JTextField NFnom;
    private javax.swing.JMenuItem Nomina;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Nominab1;
    private javax.swing.JTextArea Obsdeposito;
    private javax.swing.JTextField Odtp;
    private javax.swing.JLabel PCR;
    private javax.swing.JLabel PDDD;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JLabel PDDDV;
    private javax.swing.JLabel PDDL;
    private javax.swing.JLabel PDDT;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JTextField Playera;
    private javax.swing.JTextField Presp;
    private javax.swing.JComboBox<String> Quincenas;
    private javax.swing.JLabel R;
    private javax.swing.JTabbedPane RH;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JTextField Sancion;
    private javax.swing.JTextField ServN;
    private javax.swing.JTable Tdeposito;
    private javax.swing.JTable Tdepositos;
    private javax.swing.JMenuItem UsuariosRH;
    private javax.swing.JMenuItem Usuariosnom;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private botones.BotonWeb botonWeb3;
    private botones.BotonWeb botonWeb5;
    private javax.swing.JTextField cda;
    private javax.swing.JLabel deposito;
    private javax.swing.JLabel dt;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
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
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pd;
    private javax.swing.JLabel pds;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
