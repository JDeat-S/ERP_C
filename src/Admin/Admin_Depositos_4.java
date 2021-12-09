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

    public void FunMD() {
        MDNFA();
        MDNFP();
        MDNFT();
        MDNNor();
        MDNOfi();
        MDNPon();
        MDNS1();
        MDNS2();
        MDNCSQ();
    }

    // mostrar datos de nomina
    public void MDNCSQ() {
        //Buscar empleado
        String FiltroN = Nominab8.getText();
        String SQL = "select * from `nomina.corporativo santander quincenal`";
        String FAPNom = FApT8.getText();
        String FAMNom = FAmT8.getText();
        String FiltroSnom = FiltroSnomina8.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina8.getSelectedItem().toString();
        String FiltroFol = FiltroNDF8.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.corporativo santander quincenal` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.corporativo santander quincenal` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.corporativo santander quincenal` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.corporativo santander quincenal` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.corporativo santander quincenal` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.corporativo santander quincenal` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom8.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom8.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_SCQ) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Santader corp quincenal: " + error_ND_SCQ.getMessage());

        }

    }

    public void MDNFA() {
        //Buscar empleado
        String FiltroN = Nominab.getText();
        String SQL = "select * from `nomina.detallada.foraneos acapulco`";
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.foraneos acapulco` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.foraneos acapulco` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.foraneos acapulco` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.foraneos acapulco` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.foraneos acapulco` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.foraneos acapulco` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, 100,/*RETARDOS*/ 65,
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
        } catch (SQLException error_ND_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos Acapulco: " + error_ND_FA.getMessage());

        }

    }

    public void MDNFP() {
        //Buscar empleado
        String FiltroN = Nominab1.getText();
        String SQL = "select * from `nomina.detallada.foraneos puebla`";
        String FAPNom = FApT1.getText();
        String FAMNom = FAmT1.getText();
        String FiltroSnom = FiltroSnomina1.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina1.getSelectedItem().toString();
        String FiltroFol = FiltroNDF1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.foraneos puebla` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.foraneos puebla` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.foraneos puebla` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.foraneos puebla` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.foraneos puebla` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.foraneos puebla` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_FP) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos puebla: " + error_ND_FP.getMessage());

        }

    }

    public void MDNFT() {
        //Buscar empleado
        String FiltroN = Nominab2.getText();
        String SQL = "select * from `nomina.detallada.foraneos toluca`";
        String FAPNom = FApT2.getText();
        String FAMNom = FAmT2.getText();
        String FiltroSnom = FiltroSnomina2.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina2.getSelectedItem().toString();
        String FiltroFol = FiltroNDF2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.foraneos toluca` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.foraneos toluca` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.foraneos toluca` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.foraneos toluca` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.foraneos toluca` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.foraneos toluca` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom2.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_FT) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos toluca: " + error_ND_FT.getMessage());

        }

    }

    public void MDNNor() {
        //Buscar empleado
        String FiltroN = Nominab3.getText();
        String where = "select * from `nomina.detallada.norte`";
        String FAPNom = FApT3.getText();
        String FAMNom = FAmT3.getText();
        String FiltroSnom = FiltroSnomina3.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina3.getSelectedItem().toString();
        String FiltroFol = FiltroNDF3.getText();

        if (!"".equals(FiltroN)) {
            where = "Select * from `nomina.detallada.norte` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            where = "select * from `nomina.detallada.norte` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            where = "select * from `nomina.detallada.norte` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            where = "select * from `nomina.detallada.norte` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            where = "select * from `nomina.detallada.norte` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            where = "select * from `nomina.detallada.norte` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom3.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom3.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_norte) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de norte: " + error_ND_norte.getMessage());

        }

    }

    public void MDNOfi() {
        //Buscar empleado
        String FiltroN = Nominab4.getText();
        String SQL = "select * from `nomina.detallada.oficina`";
        String FAPNom = FApT4.getText();
        String FAMNom = FAmT4.getText();
        String FiltroSnom = FiltroSnomina4.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina4.getSelectedItem().toString();
        String FiltroFol = FiltroNDF4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.oficina` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.oficina` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.oficina` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.oficina` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.oficina` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.oficina` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom4.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom4.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_ofi) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Oficina: " + error_ND_ofi.getMessage());

        }

    }

    public void MDNPon() {
        //Buscar empleado
        String FiltroN = Nominab5.getText();
        String SQL = "select * from `nomina.detallada.poniente`";
        String FAPNom = FApT5.getText();
        String FAMNom = FAmT5.getText();
        String FiltroSnom = FiltroSnomina5.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina5.getSelectedItem().toString();
        String FiltroFol = FiltroNDF5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.poniente` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.poniente` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.poniente` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.poniente` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.poniente` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.poniente` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom5.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom5.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_pon) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Poniente: " + error_ND_pon.getMessage());

        }

    }

    public void MDNS1() {
        //Buscar empleado
        String FiltroN = Nominab6.getText();
        String SQL = "select * from `nomina.detallada.sur 1`";
        String FAPNom = FApT6.getText();
        String FAMNom = FAmT6.getText();
        String FiltroSnom = FiltroSnomina6.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina6.getSelectedItem().toString();
        String FiltroFol = FiltroNDF6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.sur 1` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.sur 1` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.sur 1` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.sur 1` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.sur 1` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.sur 1` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom6.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom6.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_S1) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Sur 1: " + error_ND_S1.getMessage());

        }

    }

    public void MDNS2() {
        //Buscar empleado
        String FiltroN = Nominab7.getText();
        String SQL = "select * from `nomina.detallada.sur 2`";
        String FAPNom = FApT7.getText();
        String FAMNom = FAmT7.getText();
        String FiltroSnom = FiltroSnomina7.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina7.getSelectedItem().toString();
        String FiltroFol = FiltroNDF7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nomina.detallada.sur 2` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nomina.detallada.sur 2` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nomina.detallada.sur 2` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nomina.detallada.sur 2` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nomina.detallada.sur 2` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nomina.detallada.sur 2` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tnom7.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

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
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
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
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150, /*BANCO*/ 60,
                /*CTA*/ 100, /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50,
                /*por dia*/ 100, /*QDM*/ 150, /*AÑO*/ 35, /*1*/ 50,
                /*2*/ 50,/*3*/ 50, /*4*/ 50, /*5*/ 50, /*6*/ 50,
                /*7*/ 50, /*8*/ 50, /*9*/ 50, /*10*/ 55, /*11*/ 55, /*12*/ 55, /*13*/ 55,
                /*14*/ 55, /*15*/ 55, /*31*/ 50, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, 80, 100, 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120, /*OBS*/ 750};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom7.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_ND_S2) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Sur 2: " + error_ND_S2.getMessage());

        }

    }
    //fin de mostrar datos

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
            Tnom.setModel(modelo);
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
                /*COR*/ 50, /*adn*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120};

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


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RH = new javax.swing.JTabbedPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        PestanañasND = new javax.swing.JTabbedPane();
        TDFA = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tnom = new javax.swing.JTable();
        LabelBE = new javax.swing.JLabel();
        Nominab = new javax.swing.JTextField();
        CS2 = new javax.swing.JButton();
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
        FFDP = new javax.swing.JComboBox<>();
        TDFA1 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        Tnom1 = new javax.swing.JTable();
        LabelBE2 = new javax.swing.JLabel();
        Nominab2 = new javax.swing.JTextField();
        CS8 = new javax.swing.JButton();
        LabelBS2 = new javax.swing.JLabel();
        FiltroSnomina2 = new javax.swing.JComboBox<>();
        LabelBQ2 = new javax.swing.JLabel();
        FiltroQuincenanomina2 = new javax.swing.JComboBox<>();
        LabelSZ2 = new javax.swing.JLabel();
        FZservicio2 = new javax.swing.JComboBox<>();
        jLabel169 = new javax.swing.JLabel();
        FiltrosTD1 = new javax.swing.JComboBox<>();
        LabelBNDF2 = new javax.swing.JLabel();
        FiltroNDF2 = new javax.swing.JTextField();
        FApT2 = new javax.swing.JTextField();
        FAmT2 = new javax.swing.JTextField();
        botonWeb9 = new botones.BotonWeb();
        FFDP1 = new javax.swing.JComboBox<>();
        TDFA2 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        Tnom2 = new javax.swing.JTable();
        LabelBE3 = new javax.swing.JLabel();
        Nominab3 = new javax.swing.JTextField();
        CS9 = new javax.swing.JButton();
        LabelBS3 = new javax.swing.JLabel();
        FiltroSnomina3 = new javax.swing.JComboBox<>();
        LabelBQ3 = new javax.swing.JLabel();
        FiltroQuincenanomina3 = new javax.swing.JComboBox<>();
        LabelSZ3 = new javax.swing.JLabel();
        FZservicio3 = new javax.swing.JComboBox<>();
        jLabel170 = new javax.swing.JLabel();
        FiltrosTD2 = new javax.swing.JComboBox<>();
        LabelBNDF3 = new javax.swing.JLabel();
        FiltroNDF3 = new javax.swing.JTextField();
        FApT3 = new javax.swing.JTextField();
        FAmT3 = new javax.swing.JTextField();
        botonWeb10 = new botones.BotonWeb();
        FFDP2 = new javax.swing.JComboBox<>();
        TDFA3 = new javax.swing.JScrollPane();
        jPanel24 = new javax.swing.JPanel();
        k = new javax.swing.JScrollPane();
        Tnom3 = new javax.swing.JTable();
        LabelBE4 = new javax.swing.JLabel();
        Nominab4 = new javax.swing.JTextField();
        CS10 = new javax.swing.JButton();
        LabelBS4 = new javax.swing.JLabel();
        FiltroSnomina4 = new javax.swing.JComboBox<>();
        LabelBQ4 = new javax.swing.JLabel();
        FiltroQuincenanomina4 = new javax.swing.JComboBox<>();
        LabelSZ4 = new javax.swing.JLabel();
        FZservicio4 = new javax.swing.JComboBox<>();
        jLabel171 = new javax.swing.JLabel();
        FiltrosTD3 = new javax.swing.JComboBox<>();
        LabelBNDF4 = new javax.swing.JLabel();
        FiltroNDF4 = new javax.swing.JTextField();
        FApT4 = new javax.swing.JTextField();
        FAmT4 = new javax.swing.JTextField();
        botonWeb11 = new botones.BotonWeb();
        FFDP3 = new javax.swing.JComboBox<>();
        TDFA4 = new javax.swing.JScrollPane();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        Tnom4 = new javax.swing.JTable();
        LabelBE5 = new javax.swing.JLabel();
        Nominab5 = new javax.swing.JTextField();
        CS11 = new javax.swing.JButton();
        LabelBS5 = new javax.swing.JLabel();
        FiltroSnomina5 = new javax.swing.JComboBox<>();
        LabelBQ5 = new javax.swing.JLabel();
        FiltroQuincenanomina5 = new javax.swing.JComboBox<>();
        LabelSZ5 = new javax.swing.JLabel();
        FZservicio5 = new javax.swing.JComboBox<>();
        jLabel172 = new javax.swing.JLabel();
        FiltrosTD4 = new javax.swing.JComboBox<>();
        LabelBNDF5 = new javax.swing.JLabel();
        FiltroNDF5 = new javax.swing.JTextField();
        FApT5 = new javax.swing.JTextField();
        FAmT5 = new javax.swing.JTextField();
        botonWeb12 = new botones.BotonWeb();
        FFDP4 = new javax.swing.JComboBox<>();
        TDFA5 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        Tnom5 = new javax.swing.JTable();
        LabelBE6 = new javax.swing.JLabel();
        Nominab6 = new javax.swing.JTextField();
        CS12 = new javax.swing.JButton();
        LabelBS6 = new javax.swing.JLabel();
        FiltroSnomina6 = new javax.swing.JComboBox<>();
        LabelBQ6 = new javax.swing.JLabel();
        FiltroQuincenanomina6 = new javax.swing.JComboBox<>();
        LabelSZ6 = new javax.swing.JLabel();
        FZservicio6 = new javax.swing.JComboBox<>();
        jLabel173 = new javax.swing.JLabel();
        FiltrosTD5 = new javax.swing.JComboBox<>();
        LabelBNDF6 = new javax.swing.JLabel();
        FiltroNDF6 = new javax.swing.JTextField();
        FApT6 = new javax.swing.JTextField();
        FAmT6 = new javax.swing.JTextField();
        botonWeb13 = new botones.BotonWeb();
        FFDP5 = new javax.swing.JComboBox<>();
        TDFA6 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        Tnom6 = new javax.swing.JTable();
        LabelBE7 = new javax.swing.JLabel();
        Nominab7 = new javax.swing.JTextField();
        CS13 = new javax.swing.JButton();
        LabelBS7 = new javax.swing.JLabel();
        FiltroSnomina7 = new javax.swing.JComboBox<>();
        LabelBQ7 = new javax.swing.JLabel();
        FiltroQuincenanomina7 = new javax.swing.JComboBox<>();
        LabelSZ7 = new javax.swing.JLabel();
        FZservicio7 = new javax.swing.JComboBox<>();
        jLabel174 = new javax.swing.JLabel();
        FiltrosTD6 = new javax.swing.JComboBox<>();
        LabelBNDF7 = new javax.swing.JLabel();
        FiltroNDF7 = new javax.swing.JTextField();
        FApT7 = new javax.swing.JTextField();
        FAmT7 = new javax.swing.JTextField();
        botonWeb14 = new botones.BotonWeb();
        FFDP6 = new javax.swing.JComboBox<>();
        TDFA7 = new javax.swing.JScrollPane();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        Tnom7 = new javax.swing.JTable();
        LabelBE8 = new javax.swing.JLabel();
        Nominab8 = new javax.swing.JTextField();
        CS14 = new javax.swing.JButton();
        LabelBS8 = new javax.swing.JLabel();
        FiltroSnomina8 = new javax.swing.JComboBox<>();
        LabelBQ8 = new javax.swing.JLabel();
        FiltroQuincenanomina8 = new javax.swing.JComboBox<>();
        LabelSZ8 = new javax.swing.JLabel();
        FZservicio8 = new javax.swing.JComboBox<>();
        jLabel175 = new javax.swing.JLabel();
        FiltrosTD7 = new javax.swing.JComboBox<>();
        LabelBNDF8 = new javax.swing.JLabel();
        FiltroNDF8 = new javax.swing.JTextField();
        FApT8 = new javax.swing.JTextField();
        FAmT8 = new javax.swing.JTextField();
        botonWeb15 = new botones.BotonWeb();
        FFDP7 = new javax.swing.JComboBox<>();
        TDFA8 = new javax.swing.JScrollPane();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        Tnom8 = new javax.swing.JTable();
        LabelBE9 = new javax.swing.JLabel();
        Nominab9 = new javax.swing.JTextField();
        CS24 = new javax.swing.JButton();
        LabelBQ9 = new javax.swing.JLabel();
        FiltroQuincenanomina9 = new javax.swing.JComboBox<>();
        jLabel188 = new javax.swing.JLabel();
        FiltrosTD8 = new javax.swing.JComboBox<>();
        LabelBNDF9 = new javax.swing.JLabel();
        FiltroNDF9 = new javax.swing.JTextField();
        FApT9 = new javax.swing.JTextField();
        FAmT9 = new javax.swing.JTextField();
        botonWeb25 = new botones.BotonWeb();
        FZservicio9 = new javax.swing.JComboBox<>();
        LabelBS9 = new javax.swing.JLabel();
        FiltroSnomina9 = new javax.swing.JComboBox<>();
        LabelSZ9 = new javax.swing.JLabel();
        FFDP8 = new javax.swing.JComboBox<>();
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

        CS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS2.setText("Cerrar sesion");
        CS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS2ActionPerformed(evt);
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

        FiltrosTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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

        FFDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
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
                        .addComponent(FFDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7840, Short.MAX_VALUE))
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
                    .addComponent(botonWeb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS2)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA.setViewportView(jPanel2);

        PestanañasND.addTab("Foraneos Acapulco", TDFA);

        jPanel22.setBackground(new java.awt.Color(204, 255, 255));

        Tnom1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom1MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(Tnom1);

        LabelBE2.setText("Buscar Empleado:");

        Nominab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab2KeyReleased(evt);
            }
        });

        CS8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS8.setText("Cerrar sesion");
        CS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS8ActionPerformed(evt);
            }
        });

        LabelBS2.setText("Buscar Servicio:");

        FiltroSnomina2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina2ItemStateChanged(evt);
            }
        });

        LabelBQ2.setText("Buscar Quincena:");

        FiltroQuincenanomina2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina2ItemStateChanged(evt);
            }
        });

        LabelSZ2.setText("Selecciona Zona:");

        FZservicio2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio2ItemStateChanged(evt);
            }
        });

        jLabel169.setText("Filtros:");

        FiltrosTD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD1ItemStateChanged(evt);
            }
        });

        LabelBNDF2.setText("Buscar por # Lista");

        FiltroNDF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF2KeyReleased(evt);
            }
        });

        FApT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT2KeyReleased(evt);
            }
        });

        FAmT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT2KeyReleased(evt);
            }
        });

        botonWeb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb9.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel169)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS8))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE2)
                    .addComponent(Nominab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS2)
                    .addComponent(FiltroSnomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ2)
                    .addComponent(FiltroQuincenanomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ2)
                    .addComponent(FZservicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169)
                    .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF2)
                    .addComponent(FiltroNDF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS8)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA1.setViewportView(jPanel22);

        PestanañasND.addTab("Foraneos Puebla", TDFA1);

        jPanel23.setBackground(new java.awt.Color(204, 255, 255));

        Tnom2.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom2MouseClicked(evt);
            }
        });
        jScrollPane22.setViewportView(Tnom2);

        LabelBE3.setText("Buscar Empleado:");

        Nominab3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab3KeyReleased(evt);
            }
        });

        CS9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS9.setText("Cerrar sesion");
        CS9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS9ActionPerformed(evt);
            }
        });

        LabelBS3.setText("Buscar Servicio:");

        FiltroSnomina3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina3ItemStateChanged(evt);
            }
        });

        LabelBQ3.setText("Buscar Quincena:");

        FiltroQuincenanomina3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina3ItemStateChanged(evt);
            }
        });

        LabelSZ3.setText("Selecciona Zona:");

        FZservicio3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio3ItemStateChanged(evt);
            }
        });

        jLabel170.setText("Filtros:");

        FiltrosTD2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD2ItemStateChanged(evt);
            }
        });

        LabelBNDF3.setText("Buscar por # Lista");

        FiltroNDF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF3KeyReleased(evt);
            }
        });

        FApT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT3KeyReleased(evt);
            }
        });

        FAmT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT3KeyReleased(evt);
            }
        });

        botonWeb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb10.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel170)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS9))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE3)
                    .addComponent(Nominab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS3)
                    .addComponent(FiltroSnomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ3)
                    .addComponent(FiltroQuincenanomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ3)
                    .addComponent(FZservicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel170)
                    .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF3)
                    .addComponent(FiltroNDF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS9)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA2.setViewportView(jPanel23);

        PestanañasND.addTab("Foraneos Toluca", TDFA2);

        jPanel24.setBackground(new java.awt.Color(204, 255, 255));

        Tnom3.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom3MouseClicked(evt);
            }
        });
        k.setViewportView(Tnom3);

        LabelBE4.setText("Buscar Empleado:");

        Nominab4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab4KeyReleased(evt);
            }
        });

        CS10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS10.setText("Cerrar sesion");
        CS10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS10ActionPerformed(evt);
            }
        });

        LabelBS4.setText("Buscar Servicio:");

        FiltroSnomina4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina4ItemStateChanged(evt);
            }
        });

        LabelBQ4.setText("Buscar Quincena:");

        FiltroQuincenanomina4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina4ItemStateChanged(evt);
            }
        });

        LabelSZ4.setText("Selecciona Zona:");

        FZservicio4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio4ItemStateChanged(evt);
            }
        });

        jLabel171.setText("Filtros:");

        FiltrosTD3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD3ItemStateChanged(evt);
            }
        });

        LabelBNDF4.setText("Buscar por # Lista");

        FiltroNDF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF4KeyReleased(evt);
            }
        });

        FApT4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT4KeyReleased(evt);
            }
        });

        FAmT4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT4KeyReleased(evt);
            }
        });

        botonWeb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb11.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS10))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(k))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE4)
                    .addComponent(Nominab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS4)
                    .addComponent(FiltroSnomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ4)
                    .addComponent(FiltroQuincenanomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ4)
                    .addComponent(FZservicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel171)
                    .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF4)
                    .addComponent(FiltroNDF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS10)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA3.setViewportView(jPanel24);

        PestanañasND.addTab("Norte", TDFA3);

        jPanel25.setBackground(new java.awt.Color(204, 255, 255));

        Tnom4.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom4MouseClicked(evt);
            }
        });
        jScrollPane24.setViewportView(Tnom4);

        LabelBE5.setText("Buscar Empleado:");

        Nominab5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab5KeyReleased(evt);
            }
        });

        CS11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS11.setText("Cerrar sesion");
        CS11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS11ActionPerformed(evt);
            }
        });

        LabelBS5.setText("Buscar Servicio:");

        FiltroSnomina5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina5ItemStateChanged(evt);
            }
        });

        LabelBQ5.setText("Buscar Quincena:");

        FiltroQuincenanomina5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina5ItemStateChanged(evt);
            }
        });

        LabelSZ5.setText("Selecciona Zona:");

        FZservicio5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio5ItemStateChanged(evt);
            }
        });

        jLabel172.setText("Filtros:");

        FiltrosTD4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD4ItemStateChanged(evt);
            }
        });

        LabelBNDF5.setText("Buscar por # Lista");

        FiltroNDF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF5KeyReleased(evt);
            }
        });

        FApT5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT5KeyReleased(evt);
            }
        });

        FAmT5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT5KeyReleased(evt);
            }
        });

        botonWeb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb12.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS11))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane24))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE5)
                    .addComponent(Nominab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS5)
                    .addComponent(FiltroSnomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ5)
                    .addComponent(FiltroQuincenanomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ5)
                    .addComponent(FZservicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel172)
                    .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF5)
                    .addComponent(FiltroNDF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS11)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA4.setViewportView(jPanel25);

        PestanañasND.addTab("Oficina", TDFA4);

        jPanel26.setBackground(new java.awt.Color(204, 255, 255));

        Tnom5.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom5MouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(Tnom5);

        LabelBE6.setText("Buscar Empleado:");

        Nominab6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab6KeyReleased(evt);
            }
        });

        CS12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS12.setText("Cerrar sesion");
        CS12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS12ActionPerformed(evt);
            }
        });

        LabelBS6.setText("Buscar Servicio:");

        FiltroSnomina6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina6ItemStateChanged(evt);
            }
        });

        LabelBQ6.setText("Buscar Quincena:");

        FiltroQuincenanomina6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina6ItemStateChanged(evt);
            }
        });

        LabelSZ6.setText("Selecciona Zona:");

        FZservicio6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio6ItemStateChanged(evt);
            }
        });

        jLabel173.setText("Filtros:");

        FiltrosTD5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD5ItemStateChanged(evt);
            }
        });

        LabelBNDF6.setText("Buscar por # Lista");

        FiltroNDF6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF6KeyReleased(evt);
            }
        });

        FApT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT6KeyReleased(evt);
            }
        });

        FAmT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT6KeyReleased(evt);
            }
        });

        botonWeb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb13.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS12))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane25))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE6)
                    .addComponent(Nominab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS6)
                    .addComponent(FiltroSnomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ6)
                    .addComponent(FiltroQuincenanomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ6)
                    .addComponent(FZservicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel173)
                    .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF6)
                    .addComponent(FiltroNDF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS12)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA5.setViewportView(jPanel26);

        PestanañasND.addTab("Poniente", TDFA5);

        jPanel27.setBackground(new java.awt.Color(204, 255, 255));

        Tnom6.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom6MouseClicked(evt);
            }
        });
        jScrollPane26.setViewportView(Tnom6);

        LabelBE7.setText("Buscar Empleado:");

        Nominab7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab7KeyReleased(evt);
            }
        });

        CS13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS13.setText("Cerrar sesion");
        CS13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS13ActionPerformed(evt);
            }
        });

        LabelBS7.setText("Buscar Servicio:");

        FiltroSnomina7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina7ItemStateChanged(evt);
            }
        });

        LabelBQ7.setText("Buscar Quincena:");

        FiltroQuincenanomina7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina7ItemStateChanged(evt);
            }
        });

        LabelSZ7.setText("Selecciona Zona:");

        FZservicio7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio7ItemStateChanged(evt);
            }
        });

        jLabel174.setText("Filtros:");

        FiltrosTD6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD6ItemStateChanged(evt);
            }
        });

        LabelBNDF7.setText("Buscar por # Lista");

        FiltroNDF7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF7KeyReleased(evt);
            }
        });

        FApT7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT7KeyReleased(evt);
            }
        });

        FAmT7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT7KeyReleased(evt);
            }
        });

        botonWeb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb14.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel174)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS13))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane26))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE7)
                    .addComponent(Nominab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS7)
                    .addComponent(FiltroSnomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ7)
                    .addComponent(FiltroQuincenanomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ7)
                    .addComponent(FZservicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel174)
                    .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF7)
                    .addComponent(FiltroNDF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS13)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA6.setViewportView(jPanel27);

        PestanañasND.addTab("Sur 1", TDFA6);

        jPanel28.setBackground(new java.awt.Color(204, 255, 255));

        Tnom7.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom7MouseClicked(evt);
            }
        });
        jScrollPane27.setViewportView(Tnom7);

        LabelBE8.setText("Buscar Empleado:");

        Nominab8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab8KeyReleased(evt);
            }
        });

        CS14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS14.setText("Cerrar sesion");
        CS14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS14ActionPerformed(evt);
            }
        });

        LabelBS8.setText("Buscar Servicio:");

        FiltroSnomina8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina8ItemStateChanged(evt);
            }
        });

        LabelBQ8.setText("Buscar Quincena:");

        FiltroQuincenanomina8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina8ItemStateChanged(evt);
            }
        });

        LabelSZ8.setText("Selecciona Zona:");

        FZservicio8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio8ItemStateChanged(evt);
            }
        });

        jLabel175.setText("Filtros:");

        FiltrosTD7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD7ItemStateChanged(evt);
            }
        });

        LabelBNDF8.setText("Buscar por # Lista");

        FiltroNDF8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF8KeyReleased(evt);
            }
        });

        FApT8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT8KeyReleased(evt);
            }
        });

        FAmT8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT8KeyReleased(evt);
            }
        });

        botonWeb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb15.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FFDP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS14))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane27))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE8)
                    .addComponent(Nominab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS8)
                    .addComponent(FiltroSnomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ8)
                    .addComponent(FiltroQuincenanomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ8)
                    .addComponent(FZservicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel175)
                    .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF8)
                    .addComponent(FiltroNDF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS14)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA7.setViewportView(jPanel28);

        PestanañasND.addTab("Sur 2", TDFA7);

        jPanel38.setBackground(new java.awt.Color(204, 255, 255));

        Tnom8.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom8MouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(Tnom8);

        LabelBE9.setText("Buscar Empleado:");

        Nominab9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab9KeyReleased(evt);
            }
        });

        CS24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS24.setText("Cerrar sesion");
        CS24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS24ActionPerformed(evt);
            }
        });

        LabelBQ9.setText("Buscar Quincena:");

        FiltroQuincenanomina9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQuincenanomina9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQuincenanomina9ItemStateChanged(evt);
            }
        });

        jLabel188.setText("Filtros:");

        FiltrosTD8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
        FiltrosTD8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD8ItemStateChanged(evt);
            }
        });

        LabelBNDF9.setText("Buscar por # Lista");

        FiltroNDF9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF9KeyReleased(evt);
            }
        });

        FApT9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT9KeyReleased(evt);
            }
        });

        FAmT9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT9KeyReleased(evt);
            }
        });

        botonWeb25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb25.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        FZservicio9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicio9ItemStateChanged(evt);
            }
        });

        LabelBS9.setText("Buscar Servicio:");

        FiltroSnomina9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        LabelSZ9.setText("Selecciona Zona:");

        FFDP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel188)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FFDP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQuincenanomina9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS24))
                .addContainerGap(7840, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane28))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE9)
                    .addComponent(Nominab9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ9)
                    .addComponent(FiltroQuincenanomina9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel188)
                    .addComponent(FiltrosTD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF9)
                    .addComponent(FiltroNDF9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FZservicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS9)
                    .addComponent(FiltroSnomina9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ9)
                    .addComponent(FFDP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS24)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA8.setViewportView(jPanel38);

        PestanañasND.addTab("Corporativo santander quincenal", TDFA8);

        jScrollPane9.setViewportView(PestanañasND);

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
                .addContainerGap(226, Short.MAX_VALUE))
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
            .addComponent(RH, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
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

            DefaultTableModel model = (DefaultTableModel) Tnom.getModel();

            int fila = Tnom.getSelectedRow();
            NFnom.setText(String.valueOf(Tnom.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tnom.getValueAt(fila, 1)));
            NEnom.setText(String.valueOf(Tnom.getValueAt(fila, 2)));
            Ap.setText(String.valueOf(Tnom.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 6)));
            ServN.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            Bonodep.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            String Quinc = model.getValueAt(fila, 11).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 12));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom.getValueAt(fila, 13)));
            pds.setText(String.valueOf(Tnom.getValueAt(fila, 14)));
            Ddv.setText(String.valueOf(Tnom.getValueAt(fila, 15)));
            PDDDV.setText(String.valueOf(Tnom.getValueAt(fila, 16)));
            DD.setText(String.valueOf(Tnom.getValueAt(fila, 17)));
            PDDD.setText(String.valueOf(Tnom.getValueAt(fila, 18)));
            DL.setText(String.valueOf(Tnom.getValueAt(fila, 19)));
            PDDL.setText(String.valueOf(Tnom.getValueAt(fila, 20)));
            dt.setText(String.valueOf(Tnom.getValueAt(fila, 21)));
            PDDT.setText(String.valueOf(Tnom.getValueAt(fila, 22)));
            DSGS.setText(String.valueOf(Tnom.getValueAt(fila, 23)));
            PDDDDSGS.setText(String.valueOf(Tnom.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tnom.getValueAt(fila, 25)));
            DO.setText(String.valueOf(Tnom.getValueAt(fila, 26)));
            R.setText(String.valueOf(Tnom.getValueAt(fila, 27)));
            PCR.setText(String.valueOf(Tnom.getValueAt(fila, 28)));
            apy.setText(String.valueOf(Tnom.getValueAt(fila, 29)));
            Lugar.setText(String.valueOf(Tnom.getValueAt(fila, 30)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 31)));
            ADD.setText(String.valueOf(Tnom.getValueAt(fila, 32)));
            F.setText(String.valueOf(Tnom.getValueAt(fila, 33)));
            DPF.setText(String.valueOf(Tnom.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tnom.getValueAt(fila, 35)));
            Fdb.setText(String.valueOf(Tnom.getValueAt(fila, 36)));
            Sancion.setText(String.valueOf(Tnom.getValueAt(fila, 37)));
            Chamarra.setText(String.valueOf(Tnom.getValueAt(fila, 38)));
            Chaleco.setText(String.valueOf(Tnom.getValueAt(fila, 39)));
            Fde.setText(String.valueOf(Tnom.getValueAt(fila, 40)));
            Grua.setText(String.valueOf(Tnom.getValueAt(fila, 41)));
            Pantalon.setText(String.valueOf(Tnom.getValueAt(fila, 42)));
            Credencial.setText(String.valueOf(Tnom.getValueAt(fila, 43)));
            Bp.setText(String.valueOf(Tnom.getValueAt(fila, 44)));
            Playera.setText(String.valueOf(Tnom.getValueAt(fila, 45)));
            Corbata.setText(String.valueOf(Tnom.getValueAt(fila, 46)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 47)));
            cda.setText(String.valueOf(Tnom.getValueAt(fila, 48)));
            Odtp.setText(String.valueOf(Tnom.getValueAt(fila, 49)));
            AdN.setText(String.valueOf(Tnom.getValueAt(fila, 50)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 51)));
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
            Obsdeposito.setText(String.valueOf(Tnom.getValueAt(fila, 55)));

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

    private void FZservicio9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio9ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio8.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina8.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio9ItemStateChanged

    private void FAmT9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT9KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT9KeyReleased

    private void FApT9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT9KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT9KeyReleased

    private void FiltroNDF9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF9KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF9KeyReleased

    private void FiltrosTD8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD8ItemStateChanged
        String FTD8 = (String) FiltrosTD8.getSelectedItem();
        if (FTD8.equals("Selecciona filtro")) {
            Nominab8.setText("");
            LabelBE8.setVisible(false);
            FApT8.setText("");
            FApT8.setVisible(false);
            FAmT8.setVisible(false);
            FAmT8.setText("");
            Nominab8.setVisible(false);
            FiltroSnomina8.setVisible(false);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(false);
            FZservicio8.setVisible(false);
            LabelSZ8.setVisible(false);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(false);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(false);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(false);
            LabelBNDF8.setVisible(false);
            FunMD();

        }
        if (FTD8.equals("Filtrar por Apellido P")) {
            Nominab8.setText("");
            LabelBE8.setVisible(true);
            LabelBE8.setText("Buscar Apellido P:");
            FApT8.setText("");
            FApT8.setVisible(true);
            FAmT8.setVisible(false);
            FAmT8.setText("");
            FiltroSnomina8.setVisible(false);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(false);
            FZservicio8.setVisible(false);
            LabelSZ8.setVisible(false);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(false);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(false);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(false);
            LabelBNDF8.setVisible(false);
            FunMD();
        }
        if (FTD8.equals("Filtrar por Apellido M")) {
            Nominab8.setText("");
            LabelBE8.setVisible(true);
            LabelBE8.setText("Buscar Apellido M:");
            FApT8.setText("");
            FApT8.setVisible(false);
            FAmT8.setVisible(true);
            FAmT8.setText("");
            Nominab8.setVisible(false);
            FiltroSnomina8.setVisible(false);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(false);
            FZservicio8.setVisible(false);
            LabelSZ8.setVisible(false);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(false);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(false);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(false);
            LabelBNDF8.setVisible(false);
            FunMD();
        }
        if (FTD8.equals("Filtrar por Nombre(s)")) {
            Nominab8.setText("");
            LabelBE8.setVisible(true);
            LabelBE8.setText("Buscar Nombre(s):");
            FApT8.setText("");
            FApT8.setVisible(false);
            FAmT8.setVisible(false);
            FAmT8.setText("");
            Nominab8.setVisible(true);
            FiltroSnomina8.setVisible(false);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(false);
            FZservicio8.setVisible(false);
            LabelSZ8.setVisible(false);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(false);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(false);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(false);
            LabelBNDF8.setVisible(false);
            FunMD();
        }
        if (FTD8.equals("Filtrar por Servicio")) {
            Nominab8.setText("");
            LabelBE8.setVisible(false);
            FApT8.setText("");
            FApT8.setVisible(false);
            FAmT8.setVisible(false);
            FAmT8.setText("");
            Nominab8.setVisible(false);
            FiltroSnomina8.setVisible(true);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(true);
            FZservicio8.setVisible(true);
            LabelSZ8.setVisible(true);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(false);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(false);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(false);
            LabelBNDF8.setVisible(false);
            FunMD();
        }
        if (FTD8.equals("Filtrar por quincena")) {
            Nominab8.setText("");
            LabelBE8.setVisible(false);
            FApT8.setText("");
            FApT8.setVisible(false);
            FAmT8.setVisible(false);
            FAmT8.setText("");
            Nominab8.setVisible(false);
            FiltroSnomina8.setVisible(false);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(false);
            FZservicio8.setVisible(false);
            LabelSZ8.setVisible(false);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(true);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(true);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(false);
            LabelBNDF8.setVisible(false);
            FunMD();
        }
        if (FTD8.equals("Filtrar por # Lista")) {
            Nominab8.setText("");
            LabelBE8.setVisible(false);
            FApT8.setText("");
            FApT8.setVisible(false);
            FAmT8.setVisible(false);
            FAmT8.setText("");
            Nominab8.setVisible(false);
            FiltroSnomina8.setVisible(false);
            FiltroSnomina8.setSelectedIndex(0);
            LabelBS8.setVisible(false);
            FZservicio8.setVisible(false);
            LabelSZ8.setVisible(false);
            FZservicio8.setSelectedIndex(0);
            FiltroQuincenanomina8.setVisible(false);
            FiltroQuincenanomina8.setSelectedIndex(0);
            LabelBQ8.setVisible(false);
            FiltroNDF8.setText("");
            FiltroNDF8.setVisible(true);
            LabelBNDF8.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD8ItemStateChanged

    private void FiltroQuincenanomina9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina9ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina9ItemStateChanged

    private void CS24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS24ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS24ActionPerformed

    private void Nominab9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab9KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab9KeyReleased

    private void Tnom8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom8MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom8.getModel();

            int fila = Tnom8.getSelectedRow();
            NDL.setText(String.valueOf(Tnom8.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom8.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom8.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom8.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom8.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom8.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom8.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom8.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom8.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom8.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom8.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom8.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom8.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom8.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom8.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom8.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom8.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom8.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom8.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom8.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom8.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom8.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom8.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom8.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom8.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom8.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom8.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom8.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom8.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom8.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom8.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom8.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom8.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom8MouseClicked

    private void FAmT8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT8KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT8KeyReleased

    private void FApT8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT8KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT8KeyReleased

    private void FiltroNDF8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF8KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF8KeyReleased

    private void FiltrosTD7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD7ItemStateChanged

        String FTD7 = (String) FiltrosTD7.getSelectedItem();
        if (FTD7.equals("Selecciona filtro")) {
            Nominab7.setText("");
            LabelBE7.setVisible(false);
            FApT7.setText("");
            FApT7.setVisible(false);
            FAmT7.setVisible(false);
            FAmT7.setText("");
            Nominab7.setVisible(false);
            FiltroSnomina7.setVisible(false);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(false);
            FZservicio7.setVisible(false);
            LabelSZ7.setVisible(false);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(false);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(false);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(false);
            LabelBNDF7.setVisible(false);
            FunMD();

        }
        if (FTD7.equals("Filtrar por Apellido P")) {
            Nominab7.setText("");
            LabelBE7.setVisible(true);
            LabelBE7.setText("Buscar Apellido P:");
            FApT7.setText("");
            FApT7.setVisible(true);
            FAmT7.setVisible(false);
            FAmT7.setText("");
            FiltroSnomina7.setVisible(false);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(false);
            FZservicio7.setVisible(false);
            LabelSZ7.setVisible(false);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(false);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(false);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(false);
            LabelBNDF7.setVisible(false);
            FunMD();
        }
        if (FTD7.equals("Filtrar por Apellido M")) {
            Nominab7.setText("");
            LabelBE7.setVisible(true);
            LabelBE7.setText("Buscar Apellido M:");
            FApT7.setText("");
            FApT7.setVisible(false);
            FAmT7.setVisible(true);
            FAmT7.setText("");
            Nominab7.setVisible(false);
            FiltroSnomina7.setVisible(false);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(false);
            FZservicio7.setVisible(false);
            LabelSZ7.setVisible(false);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(false);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(false);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(false);
            LabelBNDF7.setVisible(false);
            FunMD();
        }
        if (FTD7.equals("Filtrar por Nombre(s)")) {
            Nominab7.setText("");
            LabelBE7.setVisible(true);
            LabelBE7.setText("Buscar Nombre(s):");
            FApT7.setText("");
            FApT7.setVisible(false);
            FAmT7.setVisible(false);
            FAmT7.setText("");
            Nominab7.setVisible(true);
            FiltroSnomina7.setVisible(false);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(false);
            FZservicio7.setVisible(false);
            LabelSZ7.setVisible(false);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(false);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(false);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(false);
            LabelBNDF7.setVisible(false);
            FunMD();
        }
        if (FTD7.equals("Filtrar por Servicio")) {
            Nominab7.setText("");
            LabelBE7.setVisible(false);
            FApT7.setText("");
            FApT7.setVisible(false);
            FAmT7.setVisible(false);
            FAmT7.setText("");
            Nominab7.setVisible(false);
            FiltroSnomina7.setVisible(true);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(true);
            FZservicio7.setVisible(true);
            LabelSZ7.setVisible(true);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(false);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(false);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(false);
            LabelBNDF7.setVisible(false);
            FunMD();
        }
        if (FTD7.equals("Filtrar por quincena")) {
            Nominab7.setText("");
            LabelBE7.setVisible(false);
            FApT7.setText("");
            FApT7.setVisible(false);
            FAmT7.setVisible(false);
            FAmT7.setText("");
            Nominab7.setVisible(false);
            FiltroSnomina7.setVisible(false);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(false);
            FZservicio7.setVisible(false);
            LabelSZ7.setVisible(false);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(true);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(true);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(false);
            LabelBNDF7.setVisible(false);
            FunMD();
        }
        if (FTD7.equals("Filtrar por # Lista")) {
            Nominab7.setText("");
            LabelBE7.setVisible(false);
            FApT7.setText("");
            FApT7.setVisible(false);
            FAmT7.setVisible(false);
            FAmT7.setText("");
            Nominab7.setVisible(false);
            FiltroSnomina7.setVisible(false);
            FiltroSnomina7.setSelectedIndex(0);
            LabelBS7.setVisible(false);
            FZservicio7.setVisible(false);
            LabelSZ7.setVisible(false);
            FZservicio7.setSelectedIndex(0);
            FiltroQuincenanomina7.setVisible(false);
            FiltroQuincenanomina7.setSelectedIndex(0);
            LabelBQ7.setVisible(false);
            FiltroNDF7.setText("");
            FiltroNDF7.setVisible(true);
            LabelBNDF7.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD7ItemStateChanged

    private void FZservicio8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio8ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio7.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina7.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio8ItemStateChanged

    private void FiltroQuincenanomina8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina8ItemStateChanged

    private void FiltroSnomina8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina8ItemStateChanged

    private void CS14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS14ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS14ActionPerformed

    private void Nominab8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab8KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab8KeyReleased

    private void Tnom7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom7MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom7.getModel();

            int fila = Tnom7.getSelectedRow();
            NDL.setText(String.valueOf(Tnom7.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom7.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom7.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom7.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom7.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom7.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom7.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom7.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom7.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom7.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom7.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom7.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom7.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom7.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom7.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom7.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom7.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom7.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom7.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom7.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom7.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom7.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom7.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom7.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom7.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom7.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom7.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom7.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom7.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom7.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom7.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom7.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom7.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom7MouseClicked

    private void FAmT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT7KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT7KeyReleased

    private void FApT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT7KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT7KeyReleased

    private void FiltroNDF7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF7KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF7KeyReleased

    private void FiltrosTD6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD6ItemStateChanged

        String FTD6 = (String) FiltrosTD6.getSelectedItem();
        if (FTD6.equals("Selecciona filtro")) {
            Nominab6.setText("");
            LabelBE6.setVisible(false);
            FApT6.setText("");
            FApT6.setVisible(false);
            FAmT6.setVisible(false);
            FAmT6.setText("");
            Nominab6.setVisible(false);
            FiltroSnomina6.setVisible(false);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(false);
            FZservicio6.setVisible(false);
            LabelSZ6.setVisible(false);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(false);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(false);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(false);
            LabelBNDF6.setVisible(false);
            FunMD();

        }
        if (FTD6.equals("Filtrar por Apellido P")) {
            Nominab6.setText("");
            LabelBE6.setVisible(true);
            LabelBE6.setText("Buscar Apellido P:");
            FApT6.setText("");
            FApT6.setVisible(true);
            FAmT6.setVisible(false);
            FAmT6.setText("");
            FiltroSnomina6.setVisible(false);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(false);
            FZservicio6.setVisible(false);
            LabelSZ6.setVisible(false);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(false);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(false);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(false);
            LabelBNDF6.setVisible(false);
            FunMD();
        }
        if (FTD6.equals("Filtrar por Apellido M")) {
            Nominab6.setText("");
            LabelBE6.setVisible(true);
            LabelBE6.setText("Buscar Apellido M:");
            FApT6.setText("");
            FApT6.setVisible(false);
            FAmT6.setVisible(true);
            FAmT6.setText("");
            Nominab6.setVisible(false);
            FiltroSnomina6.setVisible(false);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(false);
            FZservicio6.setVisible(false);
            LabelSZ6.setVisible(false);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(false);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(false);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(false);
            LabelBNDF6.setVisible(false);
            FunMD();
        }
        if (FTD6.equals("Filtrar por Nombre(s)")) {
            Nominab6.setText("");
            LabelBE6.setVisible(true);
            LabelBE6.setText("Buscar Nombre(s):");
            FApT6.setText("");
            FApT6.setVisible(false);
            FAmT6.setVisible(false);
            FAmT6.setText("");
            Nominab6.setVisible(true);
            FiltroSnomina6.setVisible(false);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(false);
            FZservicio6.setVisible(false);
            LabelSZ6.setVisible(false);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(false);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(false);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(false);
            LabelBNDF6.setVisible(false);
            FunMD();
        }
        if (FTD6.equals("Filtrar por Servicio")) {
            Nominab6.setText("");
            LabelBE6.setVisible(false);
            FApT6.setText("");
            FApT6.setVisible(false);
            FAmT6.setVisible(false);
            FAmT6.setText("");
            Nominab6.setVisible(false);
            FiltroSnomina6.setVisible(true);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(true);
            FZservicio6.setVisible(true);
            LabelSZ6.setVisible(true);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(false);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(false);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(false);
            LabelBNDF6.setVisible(false);
            FunMD();
        }
        if (FTD6.equals("Filtrar por quincena")) {
            Nominab6.setText("");
            LabelBE6.setVisible(false);
            FApT6.setText("");
            FApT6.setVisible(false);
            FAmT6.setVisible(false);
            FAmT6.setText("");
            Nominab6.setVisible(false);
            FiltroSnomina6.setVisible(false);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(false);
            FZservicio6.setVisible(false);
            LabelSZ6.setVisible(false);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(true);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(true);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(false);
            LabelBNDF6.setVisible(false);
            FunMD();
        }
        if (FTD6.equals("Filtrar por # Lista")) {
            Nominab6.setText("");
            LabelBE6.setVisible(false);
            FApT6.setText("");
            FApT6.setVisible(false);
            FAmT6.setVisible(false);
            FAmT6.setText("");
            Nominab6.setVisible(false);
            FiltroSnomina6.setVisible(false);
            FiltroSnomina6.setSelectedIndex(0);
            LabelBS6.setVisible(false);
            FZservicio6.setVisible(false);
            LabelSZ6.setVisible(false);
            FZservicio6.setSelectedIndex(0);
            FiltroQuincenanomina6.setVisible(false);
            FiltroQuincenanomina6.setSelectedIndex(0);
            LabelBQ6.setVisible(false);
            FiltroNDF6.setText("");
            FiltroNDF6.setVisible(true);
            LabelBNDF6.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD6ItemStateChanged

    private void CS13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS13ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS13ActionPerformed
    
    private void Tnom6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom6MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom6.getModel();

            int fila = Tnom6.getSelectedRow();
            NDL.setText(String.valueOf(Tnom6.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom6.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom6.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom6.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom6.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom6.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom6.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom6.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tnom6.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom6.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom6.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom6.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom6.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom6.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom6.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom6.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom6.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom6.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom6.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom6.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom6.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom6.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom6.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom6.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom6.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom6.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom6.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom6.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom6.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom6.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom6.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom6.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom6MouseClicked

    private void FAmT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT6KeyReleased
        FunMD();

    }//GEN-LAST:event_FAmT6KeyReleased

    private void FApT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT6KeyReleased
        FunMD();

    }//GEN-LAST:event_FApT6KeyReleased

    private void FiltroNDF6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF6KeyReleased
        FunMD();

    }//GEN-LAST:event_FiltroNDF6KeyReleased

    private void FiltrosTD5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD5ItemStateChanged
        String FTD5 = (String) FiltrosTD5.getSelectedItem();
        if (FTD5.equals("Selecciona filtro")) {
            Nominab5.setText("");
            LabelBE5.setVisible(false);
            FApT5.setText("");
            FApT5.setVisible(false);
            FAmT5.setVisible(false);
            FAmT5.setText("");
            Nominab5.setVisible(false);
            FiltroSnomina5.setVisible(false);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(false);
            FZservicio5.setVisible(false);
            LabelSZ5.setVisible(false);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(false);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(false);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(false);
            LabelBNDF5.setVisible(false);
            FunMD();

        }
        if (FTD5.equals("Filtrar por Apellido P")) {
            Nominab5.setText("");
            LabelBE5.setVisible(true);
            LabelBE5.setText("Buscar Apellido P:");
            FApT5.setText("");
            FApT5.setVisible(true);
            FAmT5.setVisible(false);
            FAmT5.setText("");
            FiltroSnomina5.setVisible(false);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(false);
            FZservicio5.setVisible(false);
            LabelSZ5.setVisible(false);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(false);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(false);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(false);
            LabelBNDF5.setVisible(false);
            FunMD();
        }
        if (FTD5.equals("Filtrar por Apellido M")) {
            Nominab5.setText("");
            LabelBE5.setVisible(true);
            LabelBE5.setText("Buscar Apellido M:");
            FApT5.setText("");
            FApT5.setVisible(false);
            FAmT5.setVisible(true);
            FAmT5.setText("");
            Nominab5.setVisible(false);
            FiltroSnomina5.setVisible(false);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(false);
            FZservicio5.setVisible(false);
            LabelSZ5.setVisible(false);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(false);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(false);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(false);
            LabelBNDF5.setVisible(false);
            FunMD();
        }
        if (FTD5.equals("Filtrar por Nombre(s)")) {
            Nominab5.setText("");
            LabelBE5.setVisible(true);
            LabelBE5.setText("Buscar Nombre(s):");
            FApT5.setText("");
            FApT5.setVisible(false);
            FAmT5.setVisible(false);
            FAmT5.setText("");
            Nominab5.setVisible(true);
            FiltroSnomina5.setVisible(false);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(false);
            FZservicio5.setVisible(false);
            LabelSZ5.setVisible(false);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(false);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(false);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(false);
            LabelBNDF5.setVisible(false);
            FunMD();
        }
        if (FTD5.equals("Filtrar por Servicio")) {
            Nominab5.setText("");
            LabelBE5.setVisible(false);
            FApT5.setText("");
            FApT5.setVisible(false);
            FAmT5.setVisible(false);
            FAmT5.setText("");
            Nominab5.setVisible(false);
            FiltroSnomina5.setVisible(true);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(true);
            FZservicio5.setVisible(true);
            LabelSZ5.setVisible(true);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(false);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(false);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(false);
            LabelBNDF5.setVisible(false);
            FunMD();
        }
        if (FTD5.equals("Filtrar por quincena")) {
            Nominab5.setText("");
            LabelBE5.setVisible(false);
            FApT5.setText("");
            FApT5.setVisible(false);
            FAmT5.setVisible(false);
            FAmT5.setText("");
            Nominab5.setVisible(false);
            FiltroSnomina5.setVisible(false);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(false);
            FZservicio5.setVisible(false);
            LabelSZ5.setVisible(false);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(true);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(true);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(false);
            LabelBNDF5.setVisible(false);
            FunMD();
        }
        if (FTD5.equals("Filtrar por # Lista")) {
            Nominab5.setText("");
            LabelBE5.setVisible(false);
            FApT5.setText("");
            FApT5.setVisible(false);
            FAmT5.setVisible(false);
            FAmT5.setText("");
            Nominab5.setVisible(false);
            FiltroSnomina5.setVisible(false);
            FiltroSnomina5.setSelectedIndex(0);
            LabelBS5.setVisible(false);
            FZservicio5.setVisible(false);
            LabelSZ5.setVisible(false);
            FZservicio5.setSelectedIndex(0);
            FiltroQuincenanomina5.setVisible(false);
            FiltroQuincenanomina5.setSelectedIndex(0);
            LabelBQ5.setVisible(false);
            FiltroNDF5.setText("");
            FiltroNDF5.setVisible(true);
            LabelBNDF5.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD5ItemStateChanged

    private void FZservicio6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio5.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina5.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio6ItemStateChanged

    private void FiltroQuincenanomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina6ItemStateChanged
        FunMD();

    }//GEN-LAST:event_FiltroQuincenanomina6ItemStateChanged

    private void FiltroSnomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina6ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina6ItemStateChanged

    private void CS12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS12ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS12ActionPerformed

    private void Nominab6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab6KeyReleased
        FunMD();

    }//GEN-LAST:event_Nominab6KeyReleased

    private void Tnom5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom5MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom5.getModel();

            int fila = Tnom5.getSelectedRow();
            NDL.setText(String.valueOf(Tnom5.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom5.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom5.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom5.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom5.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom5.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom5.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom5.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom5.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom5.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom5.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom5.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom5.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom5.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom5.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom5.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom5.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom5.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom5.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom5.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom5.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom5.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom5.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom5.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom5.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom5.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom5.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom5.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom5.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom5.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom5.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom5.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom5.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom5MouseClicked

    private void FAmT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT5KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT5KeyReleased

    private void FApT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT5KeyReleased
        FunMD();

    }//GEN-LAST:event_FApT5KeyReleased

    private void FiltroNDF5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF5KeyReleased
        FunMD();

    }//GEN-LAST:event_FiltroNDF5KeyReleased

    private void FiltrosTD4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD4ItemStateChanged
        String FTD4 = (String) FiltrosTD4.getSelectedItem();
        if (FTD4.equals("Selecciona filtro")) {
            Nominab4.setText("");
            LabelBE4.setVisible(false);
            FApT4.setText("");
            FApT4.setVisible(false);
            FAmT4.setVisible(false);
            FAmT4.setText("");
            Nominab4.setVisible(false);
            FiltroSnomina4.setVisible(false);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(false);
            FZservicio4.setVisible(false);
            LabelSZ4.setVisible(false);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(false);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(false);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(false);
            LabelBNDF4.setVisible(false);
            FunMD();

        }
        if (FTD4.equals("Filtrar por Apellido P")) {
            Nominab4.setText("");
            LabelBE4.setVisible(true);
            LabelBE4.setText("Buscar Apellido P:");
            FApT4.setText("");
            FApT4.setVisible(true);
            FAmT4.setVisible(false);
            FAmT4.setText("");
            FiltroSnomina4.setVisible(false);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(false);
            FZservicio4.setVisible(false);
            LabelSZ4.setVisible(false);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(false);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(false);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(false);
            LabelBNDF4.setVisible(false);
            FunMD();
        }
        if (FTD4.equals("Filtrar por Apellido M")) {
            Nominab4.setText("");
            LabelBE4.setVisible(true);
            LabelBE4.setText("Buscar Apellido M:");
            FApT4.setText("");
            FApT4.setVisible(false);
            FAmT4.setVisible(true);
            FAmT4.setText("");
            Nominab4.setVisible(false);
            FiltroSnomina4.setVisible(false);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(false);
            FZservicio4.setVisible(false);
            LabelSZ4.setVisible(false);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(false);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(false);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(false);
            LabelBNDF4.setVisible(false);
            FunMD();
        }
        if (FTD4.equals("Filtrar por Nombre(s)")) {
            Nominab4.setText("");
            LabelBE4.setVisible(true);
            LabelBE4.setText("Buscar Nombre(s):");
            FApT4.setText("");
            FApT4.setVisible(false);
            FAmT4.setVisible(false);
            FAmT4.setText("");
            Nominab4.setVisible(true);
            FiltroSnomina4.setVisible(false);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(false);
            FZservicio4.setVisible(false);
            LabelSZ4.setVisible(false);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(false);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(false);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(false);
            LabelBNDF4.setVisible(false);
            FunMD();
        }
        if (FTD4.equals("Filtrar por Servicio")) {
            Nominab4.setText("");
            LabelBE4.setVisible(false);
            FApT4.setText("");
            FApT4.setVisible(false);
            FAmT4.setVisible(false);
            FAmT4.setText("");
            Nominab4.setVisible(false);
            FiltroSnomina4.setVisible(true);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(true);
            FZservicio4.setVisible(true);
            LabelSZ4.setVisible(true);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(false);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(false);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(false);
            LabelBNDF4.setVisible(false);
            FunMD();
        }
        if (FTD4.equals("Filtrar por quincena")) {
            Nominab4.setText("");
            LabelBE4.setVisible(false);
            FApT4.setText("");
            FApT4.setVisible(false);
            FAmT4.setVisible(false);
            FAmT4.setText("");
            Nominab4.setVisible(false);
            FiltroSnomina4.setVisible(false);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(false);
            FZservicio4.setVisible(false);
            LabelSZ4.setVisible(false);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(true);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(true);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(false);
            LabelBNDF4.setVisible(false);
            FunMD();
        }
        if (FTD4.equals("Filtrar por # Lista")) {
            Nominab4.setText("");
            LabelBE4.setVisible(false);
            FApT4.setText("");
            FApT4.setVisible(false);
            FAmT4.setVisible(false);
            FAmT4.setText("");
            Nominab4.setVisible(false);
            FiltroSnomina4.setVisible(false);
            FiltroSnomina4.setSelectedIndex(0);
            LabelBS4.setVisible(false);
            FZservicio4.setVisible(false);
            LabelSZ4.setVisible(false);
            FZservicio4.setSelectedIndex(0);
            FiltroQuincenanomina4.setVisible(false);
            FiltroQuincenanomina4.setSelectedIndex(0);
            LabelBQ4.setVisible(false);
            FiltroNDF4.setText("");
            FiltroNDF4.setVisible(true);
            LabelBNDF4.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD4ItemStateChanged

    private void FZservicio5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio4.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina4.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio5ItemStateChanged

    private void FiltroQuincenanomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina5ItemStateChanged
        FunMD();

    }//GEN-LAST:event_FiltroQuincenanomina5ItemStateChanged

    private void FiltroSnomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina5ItemStateChanged
        FunMD();

    }//GEN-LAST:event_FiltroSnomina5ItemStateChanged

    private void CS11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS11ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS11ActionPerformed

    private void Nominab5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab5KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab5KeyReleased

    private void Tnom4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom4MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom4.getModel();

            int fila = Tnom4.getSelectedRow();
            NDL.setText(String.valueOf(Tnom4.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom4.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom4.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom4.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom4.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom4.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom4.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom4.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom4.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom4.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom4.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom4.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom4.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom4.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom4.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom4.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom4.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom4.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom4.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom4.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom4.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom4.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom4.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom4.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom4.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom4.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom4.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom4.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom4.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom4.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom4.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom4.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom4.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom4MouseClicked

    private void FAmT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT4KeyReleased
        FunMD();

    }//GEN-LAST:event_FAmT4KeyReleased

    private void FiltroNDF4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF4KeyReleased
        FunMD();

    }//GEN-LAST:event_FiltroNDF4KeyReleased

    private void FApT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT4KeyReleased
        FunMD();

    }//GEN-LAST:event_FApT4KeyReleased

    private void FiltrosTD3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD3ItemStateChanged
        String FTD3 = (String) FiltrosTD3.getSelectedItem();
        if (FTD3.equals("Selecciona filtro")) {
            Nominab3.setText("");
            LabelBE3.setVisible(false);
            FApT3.setText("");
            FApT3.setVisible(false);
            FAmT3.setVisible(false);
            FAmT3.setText("");
            Nominab3.setVisible(false);
            FiltroSnomina3.setVisible(false);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(false);
            FZservicio3.setVisible(false);
            LabelSZ3.setVisible(false);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(false);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(false);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(false);
            LabelBNDF3.setVisible(false);
            FunMD();

        }
        if (FTD3.equals("Filtrar por Apellido P")) {
            Nominab3.setText("");
            LabelBE3.setVisible(true);
            LabelBE3.setText("Buscar Apellido P:");
            FApT3.setText("");
            FApT3.setVisible(true);
            FAmT3.setVisible(false);
            FAmT3.setText("");
            FiltroSnomina3.setVisible(false);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(false);
            FZservicio3.setVisible(false);
            LabelSZ3.setVisible(false);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(false);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(false);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(false);
            LabelBNDF3.setVisible(false);
            FunMD();
        }
        if (FTD3.equals("Filtrar por Apellido M")) {
            Nominab3.setText("");
            LabelBE3.setVisible(true);
            LabelBE3.setText("Buscar Apellido M:");
            FApT3.setText("");
            FApT3.setVisible(false);
            FAmT3.setVisible(true);
            FAmT3.setText("");
            Nominab3.setVisible(false);
            FiltroSnomina3.setVisible(false);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(false);
            FZservicio3.setVisible(false);
            LabelSZ3.setVisible(false);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(false);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(false);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(false);
            LabelBNDF3.setVisible(false);
            FunMD();
        }
        if (FTD3.equals("Filtrar por Nombre(s)")) {
            Nominab3.setText("");
            LabelBE3.setVisible(true);
            LabelBE3.setText("Buscar Nombre(s):");
            FApT3.setText("");
            FApT3.setVisible(false);
            FAmT3.setVisible(false);
            FAmT3.setText("");
            Nominab3.setVisible(true);
            FiltroSnomina3.setVisible(false);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(false);
            FZservicio3.setVisible(false);
            LabelSZ3.setVisible(false);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(false);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(false);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(false);
            LabelBNDF3.setVisible(false);
            FunMD();
        }
        if (FTD3.equals("Filtrar por Servicio")) {
            Nominab3.setText("");
            LabelBE3.setVisible(false);
            FApT3.setText("");
            FApT3.setVisible(false);
            FAmT3.setVisible(false);
            FAmT3.setText("");
            Nominab3.setVisible(false);
            FiltroSnomina3.setVisible(true);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(true);
            FZservicio3.setVisible(true);
            LabelSZ3.setVisible(true);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(false);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(false);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(false);
            LabelBNDF3.setVisible(false);
            FunMD();
        }
        if (FTD3.equals("Filtrar por quincena")) {
            Nominab3.setText("");
            LabelBE3.setVisible(false);
            FApT3.setText("");
            FApT3.setVisible(false);
            FAmT3.setVisible(false);
            FAmT3.setText("");
            Nominab3.setVisible(false);
            FiltroSnomina3.setVisible(false);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(false);
            FZservicio3.setVisible(false);
            LabelSZ3.setVisible(false);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(true);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(true);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(false);
            LabelBNDF3.setVisible(false);
            FunMD();
        }
        if (FTD3.equals("Filtrar por # Lista")) {
            Nominab3.setText("");
            LabelBE3.setVisible(false);
            FApT3.setText("");
            FApT3.setVisible(false);
            FAmT3.setVisible(false);
            FAmT3.setText("");
            Nominab3.setVisible(false);
            FiltroSnomina3.setVisible(false);
            FiltroSnomina3.setSelectedIndex(0);
            LabelBS3.setVisible(false);
            FZservicio3.setVisible(false);
            LabelSZ3.setVisible(false);
            FZservicio3.setSelectedIndex(0);
            FiltroQuincenanomina3.setVisible(false);
            FiltroQuincenanomina3.setSelectedIndex(0);
            LabelBQ3.setVisible(false);
            FiltroNDF3.setText("");
            FiltroNDF3.setVisible(true);
            LabelBNDF3.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD3ItemStateChanged

    private void FZservicio4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio3.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina3.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio4ItemStateChanged

    private void FiltroQuincenanomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina4ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina4ItemStateChanged

    private void FiltroSnomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina4ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina4ItemStateChanged

    private void CS10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS10ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS10ActionPerformed

    private void Nominab4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab4KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab4KeyReleased

    private void Tnom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom3MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom3.getModel();

            int fila = Tnom3.getSelectedRow();
            NDL.setText(String.valueOf(Tnom3.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom3.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom3.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom3.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom3.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom3.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom3.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom3.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tnom3.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom3.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom3.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom3.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom3.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom3.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom3.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom3.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom3.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom3.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom3.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom3.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom3.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom3.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom3.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom3.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom3.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom3.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom3.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom3.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom3.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom3.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom3.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom3.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom3MouseClicked

    private void FApT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT3KeyReleased
        FunMD();

    }//GEN-LAST:event_FApT3KeyReleased

    private void FiltroNDF3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF3KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF3KeyReleased

    private void FiltrosTD2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD2ItemStateChanged

        String FTD2 = (String) FiltrosTD2.getSelectedItem();
        if (FTD2.equals("Selecciona filtro")) {
            Nominab2.setText("");
            LabelBE2.setVisible(false);
            FApT2.setText("");
            FApT2.setVisible(false);
            FAmT2.setVisible(false);
            FAmT2.setText("");
            Nominab2.setVisible(false);
            FiltroSnomina2.setVisible(false);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(false);
            FZservicio2.setVisible(false);
            LabelSZ2.setVisible(false);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(false);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(false);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(false);
            LabelBNDF2.setVisible(false);
            FunMD();

        }
        if (FTD2.equals("Filtrar por Apellido P")) {
            Nominab2.setText("");
            LabelBE2.setVisible(true);
            LabelBE2.setText("Buscar Apellido P:");
            FApT2.setText("");
            FApT2.setVisible(true);
            FAmT2.setVisible(false);
            FAmT2.setText("");
            FiltroSnomina2.setVisible(false);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(false);
            FZservicio2.setVisible(false);
            LabelSZ2.setVisible(false);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(false);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(false);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(false);
            LabelBNDF2.setVisible(false);
            FunMD();
        }
        if (FTD2.equals("Filtrar por Apellido M")) {
            Nominab2.setText("");
            LabelBE2.setVisible(true);
            LabelBE2.setText("Buscar Apellido M:");
            FApT2.setText("");
            FApT2.setVisible(false);
            FAmT2.setVisible(true);
            FAmT2.setText("");
            Nominab2.setVisible(false);
            FiltroSnomina2.setVisible(false);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(false);
            FZservicio2.setVisible(false);
            LabelSZ2.setVisible(false);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(false);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(false);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(false);
            LabelBNDF2.setVisible(false);
            FunMD();
        }
        if (FTD2.equals("Filtrar por Nombre(s)")) {
            Nominab2.setText("");
            LabelBE2.setVisible(true);
            LabelBE2.setText("Buscar Nombre(s):");
            FApT2.setText("");
            FApT2.setVisible(false);
            FAmT2.setVisible(false);
            FAmT2.setText("");
            Nominab2.setVisible(true);
            FiltroSnomina2.setVisible(false);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(false);
            FZservicio2.setVisible(false);
            LabelSZ2.setVisible(false);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(false);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(false);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(false);
            LabelBNDF2.setVisible(false);
            FunMD();
        }
        if (FTD2.equals("Filtrar por Servicio")) {
            Nominab2.setText("");
            LabelBE2.setVisible(false);
            FApT2.setText("");
            FApT2.setVisible(false);
            FAmT2.setVisible(false);
            FAmT2.setText("");
            Nominab2.setVisible(false);
            FiltroSnomina2.setVisible(true);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(true);
            FZservicio2.setVisible(true);
            LabelSZ2.setVisible(true);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(false);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(false);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(false);
            LabelBNDF2.setVisible(false);
            FunMD();
        }
        if (FTD2.equals("Filtrar por quincena")) {
            Nominab2.setText("");
            LabelBE2.setVisible(false);
            FApT2.setText("");
            FApT2.setVisible(false);
            FAmT2.setVisible(false);
            FAmT2.setText("");
            Nominab2.setVisible(false);
            FiltroSnomina2.setVisible(false);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(false);
            FZservicio2.setVisible(false);
            LabelSZ2.setVisible(false);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(true);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(true);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(false);
            LabelBNDF2.setVisible(false);
            FunMD();
        }
        if (FTD2.equals("Filtrar por # Lista")) {
            Nominab2.setText("");
            LabelBE2.setVisible(false);
            FApT2.setText("");
            FApT2.setVisible(false);
            FAmT2.setVisible(false);
            FAmT2.setText("");
            Nominab2.setVisible(false);
            FiltroSnomina2.setVisible(false);
            FiltroSnomina2.setSelectedIndex(0);
            LabelBS2.setVisible(false);
            FZservicio2.setVisible(false);
            LabelSZ2.setVisible(false);
            FZservicio2.setSelectedIndex(0);
            FiltroQuincenanomina2.setVisible(false);
            FiltroQuincenanomina2.setSelectedIndex(0);
            LabelBQ2.setVisible(false);
            FiltroNDF2.setText("");
            FiltroNDF2.setVisible(true);
            LabelBNDF2.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD2ItemStateChanged

    private void FZservicio3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio2.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina2.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio3ItemStateChanged

    private void FiltroQuincenanomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina3ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina3ItemStateChanged

    private void FiltroSnomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina3ItemStateChanged
        FunMD();

    }//GEN-LAST:event_FiltroSnomina3ItemStateChanged

    private void CS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS9ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS9ActionPerformed

    private void Nominab3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab3KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab3KeyReleased

    private void Tnom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom2MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom2.getModel();

            int fila = Tnom2.getSelectedRow();
            NDL.setText(String.valueOf(Tnom2.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom2.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom2.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom2.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom2.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom2.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom2.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom2.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom2.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom2.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom2.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom2.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom2.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom2.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom2.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom2.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom2.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom2.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom2.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom2.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom2.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom2.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom2.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom2.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom2.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom2.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom2.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom2.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom2.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom2.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom2.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom2.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom2.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_Tnom2MouseClicked

    private void FAmT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT3KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT3KeyReleased

    private void FAmT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT2KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT2KeyReleased

    private void FApT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT2KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT2KeyReleased

    private void FiltroNDF2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF2KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF2KeyReleased

    private void FiltrosTD1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD1ItemStateChanged

        String FTD1 = (String) FiltrosTD1.getSelectedItem();
        if (FTD1.equals("Selecciona filtro")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
            FiltroSnomina1.setVisible(false);
            FiltroSnomina1.setSelectedIndex(0);
            LabelBS1.setVisible(false);
            FZservicio1.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio1.setSelectedIndex(0);
            FiltroQuincenanomina1.setVisible(false);
            FiltroQuincenanomina1.setSelectedIndex(0);
            LabelBQ1.setVisible(false);
            FiltroNDF1.setText("");
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            FunMD();

        }
        if (FTD1.equals("Filtrar por Apellido P")) {
            Nominab1.setText("");
            LabelBE1.setVisible(true);
            LabelBE1.setText("Buscar Apellido P:");
            FApT1.setText("");
            FApT1.setVisible(true);
            FAmT1.setVisible(false);
            FAmT1.setText("");
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
            FunMD();
        }
        if (FTD1.equals("Filtrar por Apellido M")) {
            Nominab1.setText("");
            LabelBE1.setVisible(true);
            LabelBE1.setText("Buscar Apellido M:");
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(true);
            FAmT1.setText("");
            Nominab1.setVisible(false);
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
            FunMD();
        }
        if (FTD1.equals("Filtrar por Nombre(s)")) {
            Nominab1.setText("");
            LabelBE1.setVisible(true);
            LabelBE1.setText("Buscar Nombre(s):");
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(true);
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
            FunMD();
        }
        if (FTD1.equals("Filtrar por Servicio")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
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
            FunMD();
        }
        if (FTD1.equals("Filtrar por quincena")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
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
            FunMD();
        }
        if (FTD1.equals("Filtrar por # Lista")) {
            Nominab1.setText("");
            LabelBE1.setVisible(false);
            FApT1.setText("");
            FApT1.setVisible(false);
            FAmT1.setVisible(false);
            FAmT1.setText("");
            Nominab1.setVisible(false);
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
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTD1ItemStateChanged

    private void FZservicio2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio1.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina1.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio2ItemStateChanged

    private void FiltroQuincenanomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina2ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina2ItemStateChanged

    private void FiltroSnomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina2ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina2ItemStateChanged

    private void CS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS8ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS8ActionPerformed

    private void Nominab2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab2KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab2KeyReleased

    private void Tnom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom1MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom1.getModel();

            int fila = Tnom1.getSelectedRow();
            NDL.setText(String.valueOf(Tnom1.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom1.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom1.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom1.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom1.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom1.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom1.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom1.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom1.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom1.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            PDDDDSGS.setText(String.valueOf(Tnom1.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom1.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom1.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom1.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom1.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom1.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom1.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom1.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom1.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom1.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom1.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom1.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom1.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom1.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom1.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom1.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom1.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom1.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom1.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom1.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom1.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom1.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom1.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom1MouseClicked

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased
        FunMD();
    }//GEN-LAST:event_FAmTKeyReleased

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased
        FunMD();
    }//GEN-LAST:event_FApTKeyReleased

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDFKeyReleased

    private void FiltrosTDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTDItemStateChanged
        String FTD = (String) FiltrosTD.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
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
            FunMD();

        }
        if (FTD.equals("Filtrar por Apellido P")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido P:");
            FApT.setText("");
            FApT.setVisible(true);
            FAmT.setVisible(false);
            FAmT.setText("");
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
            FunMD();
        }
        if (FTD.equals("Filtrar por Apellido M")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido M:");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(true);
            FAmT.setText("");
            Nominab.setVisible(false);
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
            FunMD();
        }
        if (FTD.equals("Filtrar por Nombre(s)")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Nombre(s):");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(true);
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
            FunMD();
        }
        if (FTD.equals("Filtrar por Servicio")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
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
            FunMD();
        }
        if (FTD.equals("Filtrar por quincena")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
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
            FunMD();
        }
        if (FTD.equals("Filtrar por # Lista")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
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
            FunMD();
        }
    }//GEN-LAST:event_FiltrosTDItemStateChanged

    private void FZservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicioItemStateChanged

    private void FiltroQuincenanominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanominaItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void NominabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NominabKeyReleased
        FunMD();
    }//GEN-LAST:event_NominabKeyReleased

    private void TnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TnomMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom.getModel();

            int fila = Tnom.getSelectedRow();
            NDL.setText(String.valueOf(Tnom.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            Bonodep.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);

            PDDDDSGS.setText(String.valueOf(Tnom.getValueAt(fila, 41)));
            apy.setText(String.valueOf(Tnom.getValueAt(fila, 50)));
            Lugar.setText(String.valueOf(Tnom.getValueAt(fila, 51)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 52)));
            ADD.setText(String.valueOf(Tnom.getValueAt(fila, 53)));
            DI.setText(String.valueOf(Tnom.getValueAt(fila, 56)));
            Fdb.setText(String.valueOf(Tnom.getValueAt(fila, 57)));
            Sancion.setText(String.valueOf(Tnom.getValueAt(fila, 58)));
            Chamarra.setText(String.valueOf(Tnom.getValueAt(fila, 59)));
            Chaleco.setText(String.valueOf(Tnom.getValueAt(fila, 60)));
            Fde.setText(String.valueOf(Tnom.getValueAt(fila, 61)));
            Grua.setText(String.valueOf(Tnom.getValueAt(fila, 62)));
            Pantalon.setText(String.valueOf(Tnom.getValueAt(fila, 63)));
            Credencial.setText(String.valueOf(Tnom.getValueAt(fila, 64)));
            Bp.setText(String.valueOf(Tnom.getValueAt(fila, 65)));
            Playera.setText(String.valueOf(Tnom.getValueAt(fila, 66)));
            Corbata.setText(String.valueOf(Tnom.getValueAt(fila, 67)));
            AdN.setText(String.valueOf(Tnom.getValueAt(fila, 68)));
            DVT.setText(String.valueOf(Tnom.getValueAt(fila, 69)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 70)));
            cda.setText(String.valueOf(Tnom.getValueAt(fila, 71)));
            Odtp.setText(String.valueOf(Tnom.getValueAt(fila, 72)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 73)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void FZservicio7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio7ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio6.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina6.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio7ItemStateChanged

    private void FiltroQuincenanomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina7ItemStateChanged
    }//GEN-LAST:event_FiltroQuincenanomina7ItemStateChanged

    private void FiltroSnomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina7ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina7ItemStateChanged

    private void Nominab7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab7KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab7KeyReleased

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
    private javax.swing.JButton CS10;
    private javax.swing.JButton CS11;
    private javax.swing.JButton CS12;
    private javax.swing.JButton CS13;
    private javax.swing.JButton CS14;
    private javax.swing.JButton CS2;
    private javax.swing.JButton CS24;
    private javax.swing.JButton CS8;
    private javax.swing.JButton CS9;
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
    private javax.swing.JMenuItem EmpleadosT;
    private javax.swing.JLabel F;
    private javax.swing.JTextField FAmT;
    private javax.swing.JTextField FAmT1;
    private javax.swing.JTextField FAmT2;
    private javax.swing.JTextField FAmT3;
    private javax.swing.JTextField FAmT4;
    private javax.swing.JTextField FAmT5;
    private javax.swing.JTextField FAmT6;
    private javax.swing.JTextField FAmT7;
    private javax.swing.JTextField FAmT8;
    private javax.swing.JTextField FAmT9;
    private javax.swing.JTextField FApT;
    private javax.swing.JTextField FApT1;
    private javax.swing.JTextField FApT2;
    private javax.swing.JTextField FApT3;
    private javax.swing.JTextField FApT4;
    private javax.swing.JTextField FApT5;
    private javax.swing.JTextField FApT6;
    private javax.swing.JTextField FApT7;
    private javax.swing.JTextField FApT8;
    private javax.swing.JTextField FApT9;
    private com.toedter.calendar.JDateChooser FDD;
    private javax.swing.JComboBox<String> FDP;
    private javax.swing.JComboBox<String> FFDP;
    private javax.swing.JComboBox<String> FFDP1;
    private javax.swing.JComboBox<String> FFDP2;
    private javax.swing.JComboBox<String> FFDP3;
    private javax.swing.JComboBox<String> FFDP4;
    private javax.swing.JComboBox<String> FFDP5;
    private javax.swing.JComboBox<String> FFDP6;
    private javax.swing.JComboBox<String> FFDP7;
    private javax.swing.JComboBox<String> FFDP8;
    private javax.swing.JLabel FJ;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JComboBox<String> FZservicio1;
    private javax.swing.JComboBox<String> FZservicio2;
    private javax.swing.JComboBox<String> FZservicio3;
    private javax.swing.JComboBox<String> FZservicio4;
    private javax.swing.JComboBox<String> FZservicio5;
    private javax.swing.JComboBox<String> FZservicio6;
    private javax.swing.JComboBox<String> FZservicio7;
    private javax.swing.JComboBox<String> FZservicio8;
    private javax.swing.JComboBox<String> FZservicio9;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JComboBox<String> Fildepositos;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JTextField FiltroNDF1;
    private javax.swing.JTextField FiltroNDF2;
    private javax.swing.JTextField FiltroNDF3;
    private javax.swing.JTextField FiltroNDF4;
    private javax.swing.JTextField FiltroNDF5;
    private javax.swing.JTextField FiltroNDF6;
    private javax.swing.JTextField FiltroNDF7;
    private javax.swing.JTextField FiltroNDF8;
    private javax.swing.JTextField FiltroNDF9;
    private javax.swing.JComboBox<String> FiltroQuincenanomina;
    private javax.swing.JComboBox<String> FiltroQuincenanomina1;
    private javax.swing.JComboBox<String> FiltroQuincenanomina2;
    private javax.swing.JComboBox<String> FiltroQuincenanomina3;
    private javax.swing.JComboBox<String> FiltroQuincenanomina4;
    private javax.swing.JComboBox<String> FiltroQuincenanomina5;
    private javax.swing.JComboBox<String> FiltroQuincenanomina6;
    private javax.swing.JComboBox<String> FiltroQuincenanomina7;
    private javax.swing.JComboBox<String> FiltroQuincenanomina8;
    private javax.swing.JComboBox<String> FiltroQuincenanomina9;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroSnomina1;
    private javax.swing.JComboBox<String> FiltroSnomina2;
    private javax.swing.JComboBox<String> FiltroSnomina3;
    private javax.swing.JComboBox<String> FiltroSnomina4;
    private javax.swing.JComboBox<String> FiltroSnomina5;
    private javax.swing.JComboBox<String> FiltroSnomina6;
    private javax.swing.JComboBox<String> FiltroSnomina7;
    private javax.swing.JComboBox<String> FiltroSnomina8;
    private javax.swing.JComboBox<String> FiltroSnomina9;
    private javax.swing.JComboBox<String> FiltroZnomina1;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JComboBox<String> FiltrosTD1;
    private javax.swing.JComboBox<String> FiltrosTD2;
    private javax.swing.JComboBox<String> FiltrosTD3;
    private javax.swing.JComboBox<String> FiltrosTD4;
    private javax.swing.JComboBox<String> FiltrosTD5;
    private javax.swing.JComboBox<String> FiltrosTD6;
    private javax.swing.JComboBox<String> FiltrosTD7;
    private javax.swing.JComboBox<String> FiltrosTD8;
    private javax.swing.JTextField Grua;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBE1;
    private javax.swing.JLabel LabelBE2;
    private javax.swing.JLabel LabelBE3;
    private javax.swing.JLabel LabelBE4;
    private javax.swing.JLabel LabelBE5;
    private javax.swing.JLabel LabelBE6;
    private javax.swing.JLabel LabelBE7;
    private javax.swing.JLabel LabelBE8;
    private javax.swing.JLabel LabelBE9;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBNDF1;
    private javax.swing.JLabel LabelBNDF2;
    private javax.swing.JLabel LabelBNDF3;
    private javax.swing.JLabel LabelBNDF4;
    private javax.swing.JLabel LabelBNDF5;
    private javax.swing.JLabel LabelBNDF6;
    private javax.swing.JLabel LabelBNDF7;
    private javax.swing.JLabel LabelBNDF8;
    private javax.swing.JLabel LabelBNDF9;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQ1;
    private javax.swing.JLabel LabelBQ2;
    private javax.swing.JLabel LabelBQ3;
    private javax.swing.JLabel LabelBQ4;
    private javax.swing.JLabel LabelBQ5;
    private javax.swing.JLabel LabelBQ6;
    private javax.swing.JLabel LabelBQ7;
    private javax.swing.JLabel LabelBQ8;
    private javax.swing.JLabel LabelBQ9;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBS1;
    private javax.swing.JLabel LabelBS2;
    private javax.swing.JLabel LabelBS3;
    private javax.swing.JLabel LabelBS4;
    private javax.swing.JLabel LabelBS5;
    private javax.swing.JLabel LabelBS6;
    private javax.swing.JLabel LabelBS7;
    private javax.swing.JLabel LabelBS8;
    private javax.swing.JLabel LabelBS9;
    private javax.swing.JLabel LabelBZ1;
    private javax.swing.JLabel LabelDSGS;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZ1;
    private javax.swing.JLabel LabelSZ2;
    private javax.swing.JLabel LabelSZ3;
    private javax.swing.JLabel LabelSZ4;
    private javax.swing.JLabel LabelSZ5;
    private javax.swing.JLabel LabelSZ6;
    private javax.swing.JLabel LabelSZ7;
    private javax.swing.JLabel LabelSZ8;
    private javax.swing.JLabel LabelSZ9;
    private javax.swing.JTextField Lugar;
    private javax.swing.JComboBox<String> MDP;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NEnom;
    private javax.swing.JTextField NFnom;
    private javax.swing.JMenuItem Nomina;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Nominab1;
    private javax.swing.JTextField Nominab2;
    private javax.swing.JTextField Nominab3;
    private javax.swing.JTextField Nominab4;
    private javax.swing.JTextField Nominab5;
    private javax.swing.JTextField Nominab6;
    private javax.swing.JTextField Nominab7;
    private javax.swing.JTextField Nominab8;
    private javax.swing.JTextField Nominab9;
    private javax.swing.JTextArea Obsdeposito;
    private javax.swing.JTextField Odtp;
    private javax.swing.JLabel PCR;
    private javax.swing.JLabel PDDD;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JLabel PDDDV;
    private javax.swing.JLabel PDDL;
    private javax.swing.JLabel PDDT;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JTabbedPane PestanañasND;
    private javax.swing.JTextField Playera;
    private javax.swing.JTextField Presp;
    private javax.swing.JComboBox<String> Quincenas;
    private javax.swing.JLabel R;
    private javax.swing.JTabbedPane RH;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JTextField Sancion;
    private javax.swing.JTextField ServN;
    private javax.swing.JScrollPane TDFA;
    private javax.swing.JScrollPane TDFA1;
    private javax.swing.JScrollPane TDFA2;
    private javax.swing.JScrollPane TDFA3;
    private javax.swing.JScrollPane TDFA4;
    private javax.swing.JScrollPane TDFA5;
    private javax.swing.JScrollPane TDFA6;
    private javax.swing.JScrollPane TDFA7;
    private javax.swing.JScrollPane TDFA8;
    private javax.swing.JTable Tdepositos;
    private javax.swing.JTable Tnom;
    private javax.swing.JTable Tnom1;
    private javax.swing.JTable Tnom2;
    private javax.swing.JTable Tnom3;
    private javax.swing.JTable Tnom4;
    private javax.swing.JTable Tnom5;
    private javax.swing.JTable Tnom6;
    private javax.swing.JTable Tnom7;
    private javax.swing.JTable Tnom8;
    private javax.swing.JMenuItem UsuariosRH;
    private javax.swing.JMenuItem Usuariosnom;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private botones.BotonWeb botonWeb1;
    private botones.BotonWeb botonWeb10;
    private botones.BotonWeb botonWeb11;
    private botones.BotonWeb botonWeb12;
    private botones.BotonWeb botonWeb13;
    private botones.BotonWeb botonWeb14;
    private botones.BotonWeb botonWeb15;
    private botones.BotonWeb botonWeb25;
    private botones.BotonWeb botonWeb5;
    private botones.BotonWeb botonWeb9;
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
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel65;
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
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane k;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pd;
    private javax.swing.JLabel pds;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
