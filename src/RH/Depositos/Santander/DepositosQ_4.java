package RH.Depositos.Santander;

import Semanal.PT_4;
import Semanal.Tehuantepec_4;
import Semanal.Iturbide_4;
import Nomina.ModulosS.CDAS_5;
import Nomina.ModulosS.ODTS_5;
import Nomina.ModulosQ.CDAQ_5;
import Nomina.ModulosQ.PresQ_5;
import Nomina.ModulosS.PresS_5;
import Nomina.ModulosQ.ODTQ_5;
import Nomina.NominaS_simss_5;
import Nomina.NominaS_5;
import Nomina.NominaQSiMSS_5;
import Nomina.Listas.*;
import Admin.*;
import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import ColoresT.ColorRH;
import Inicio.Inicio_1;
import Logicas.BDRH.DepCIMSS.*;
import Logicas.Logica_permisos;
import Logicas.Logica_usuarios;
import Nomina.*;
import RH.Empleados_4;
import RH.Estadias_4;
import RH.Tortas_4;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
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
public final class DepositosQ_4 extends javax.swing.JFrame {
    
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();
    ColorRH colores = new ColorRH();
    Logica_usuarios usr;
    Logica_permisos LP;
    
    public DepositosQ_4() {
        initComponents();
        FunMD();
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas zz8 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas8 = new DefaultComboBoxModel(zz8.mostrarzonas());
        FZservicio8.setModel(modelzonas8);
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        busp8.setVisible(false);
        BAppag8.setVisible(false);
        Bampag8.setVisible(false);
        LabelBEP8.setVisible(false);
        LabelBQP8.setVisible(false);
        FiltroQP8.setVisible(false);
        FiltroServP8.setVisible(false);
        LabelBSP8.setVisible(false);
        FiltroSZP8.setVisible(false);
        LabelSZP8.setVisible(false);
        filtroNDFP8.setVisible(false);
        LabelNDFP8.setVisible(false);
        LabelBE8.setVisible(false);
        FApT8.setVisible(false);
        FAmT8.setVisible(false);
        Nominab8.setVisible(false);
        FiltroSnomina8.setVisible(false);
        LabelBS8.setVisible(false);
        FZservicio8.setVisible(false);
        LabelSZ8.setVisible(false);
        FiltroQuincenanomina8.setVisible(false);
        LabelBQ8.setVisible(false);
        FiltroNDF8.setVisible(false);
        LabelBNDF8.setVisible(false);
        //</editor-fold>
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        año.setCalendar(fecha_actual);
        
        setIconImage(new ImageIcon(DepositosQ_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
    }
    
    public DepositosQ_4(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        FunMD();
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas zz8 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas8 = new DefaultComboBoxModel(zz8.mostrarzonas());
        FZservicio8.setModel(modelzonas8);
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        LabelBE8.setVisible(false);
        FApT8.setVisible(false);
        FAmT8.setVisible(false);
        Nominab8.setVisible(false);
        FiltroSnomina8.setVisible(false);
        LabelBS8.setVisible(false);
        FZservicio8.setVisible(false);
        LabelSZ8.setVisible(false);
        FiltroQuincenanomina8.setVisible(false);
        LabelBQ8.setVisible(false);
        FiltroNDF8.setVisible(false);
        LabelBNDF8.setVisible(false);
        busp8.setVisible(false);
        BAppag8.setVisible(false);
        Bampag8.setVisible(false);
        LabelBEP8.setVisible(false);
        LabelBQP8.setVisible(false);
        FiltroQP8.setVisible(false);
        FiltroServP8.setVisible(false);
        LabelBSP8.setVisible(false);
        FiltroSZP8.setVisible(false);
        LabelSZP8.setVisible(false);
        filtroNDFP8.setVisible(false);
        LabelNDFP8.setVisible(false);
        LabelBE8.setVisible(false);
        FApT8.setVisible(false);
        FAmT8.setVisible(false);
        Nominab8.setVisible(false);
        FiltroSnomina8.setVisible(false);
        LabelBS8.setVisible(false);
        FZservicio8.setVisible(false);
        LabelSZ8.setVisible(false);
        FiltroQuincenanomina8.setVisible(false);
        LabelBQ8.setVisible(false);
        FiltroNDF8.setVisible(false);
        LabelBNDF8.setVisible(false);
        //</editor-fold>
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        año.setCalendar(fecha_actual);
        setIconImage(new ImageIcon(DepositosQ_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        setTitle("RH: Depositos imss Quincenales # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
                + " Tipo de ususario: " + usr.getNombre_tipo() + " Usuario: " + usr.getUsuario());
        
        switch (LP.getVDA()) {
            case 0 -> {
            }
            case 1 -> {
                Menuadm.setVisible(false);
                if (LP.getP1() == 0) {
                    Alumnos.setVisible(false);
                }
                if (LP.getP2() == 0) {
                    EmpleadosT.setVisible(false);
                }
                if (LP.getP3() == 0) {
                    //Depositos.setVisible(false);
                }
                if (LP.getP4() == 0) {
                    Semanales.setVisible(false);
                }
            }
            case 2 -> {
                Menuadm.setVisible(false);
                
            }
            default -> {
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    
    public void Modeposito() {
        String SQL = "UPDATE `rh.depositos.corporativo santander quincenal`"
                + " SET `#Folio` = ?, `#Lista` = ?, `#Empleado` = ?, `Apellido P` = ?,"
                + " `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?, `Servicio` = ?, `Sueldo` = ?,"
                + " `Bono` = ?, `Banco` = ?, `Cuenta de banco` = ?, `Por dia` = ?, `por hora` = ?,"
                + " `Quincena del mes` = ?, `Año` = ?, `Dias de incapacidad` = ?, `Pago seguro` = ?,"
                + " `Dias de vacaciones` = ?, `Pago de vacaciones` = ?, `Dias de descanso` = ?,"
                + " `Pago de dias descansados` = ?, `Dias laborados` = ?, `Pago de dias laborados` = ?,"
                + " `Descansos trabajados` = ?, `Pago de Descansos trabajados` = ?, `DSGS` = ?,"
                + " `Pago de dias de DSGS` = ?, `Faltas justificadas` = ?, `Descanso otorgado` = ?, "
                + "`Dias festivos` = ?, `Pago de dias festivos` = ?, `Dias festivos trabajados` = ?,"
                + " `Pago de dias festivos trabajados` = ?, `Retardos` = ?, `Pago con retardos` = ?, "
                + "`Apoyo` = ?, `Lugar` = ?, `Rembolso` = ?, `Adicionales` = ?, `horas extra` = ?,"
                + " `total de horas extra` = ?, `Faltas` = ?, `Descuento por faltas` = ?, `Infonavit` = ?,"
                + " `Fonacot` = ?, `ISR` = ?, `Descuento imss` = ?, `Faltantes de boleto` = ?, `Sancion` = ?,"
                + " `Chamarra` = ?, `Chaleco` = ?, `Faltante de efectivo` = ?, `Grua` = ?, `Pantalon` = ?,"
                + " `Credencial` = ?, `Boleto perdido` = ?, `Playera` = ?, `Corbata` = ?,"
                + " `Pago de prestamo` = ?, `Caja de ahorro` = ?, `Orden de taller` = ?,"
                + " `Adelanto de nomina` = ?, `fecha de alta` = ?, `SDI` = ?, `Total percepciones` = ?, "
                + "`Total gravable` = ?, `subsidio empleo` = ?, `total deducciones` = ?,"
                + " `total efectivo` = ?, `neto pagado` = ?, `sueldo bruto` = ?, `subsidio` = ?, "
                + "`carga patronal` = ?, `Sub total` = ?, `Total sin iva` = ?, `pago real` = ?, `otro` = ?,"
                + " `Deposito` = ?, `Fecha de deposito` = ?, `Mes de pago` = ?, `Forma de pago` = ?,"
                + " `Observaciones` = ? WHERE `rh.depositos.corporativo santander quincenal`.`#Folio` = ?";
        
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setString(3, NEnom.getText());
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, sueldo.getText());
            pst.setString(10, Bono.getText());
            pst.setString(11, ban.getText());
            pst.setString(12, cta.getText());
            pst.setString(13, pd.getText());
            pst.setString(14, PH.getText());
            pst.setString(15, Quincenas.getSelectedItem().toString());
            pst.setString(16, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(17, Dpi.getText());
            pst.setString(18, pds.getText());
            pst.setString(19, Ddv.getText());
            pst.setString(20, PDDDV.getText());
            pst.setString(21, DD.getText());
            pst.setString(22, PDDD.getText());
            pst.setString(23, DL.getText());
            pst.setString(24, PDDL.getText());
            pst.setString(25, dt.getText());
            pst.setString(26, PDDT.getText());
            pst.setString(27, DSGS.getText());
            pst.setString(28, PDDDDSGS.getText());
            pst.setString(29, FJ.getText());
            pst.setString(30, DO.getText());
            pst.setString(31, DF.getText());
            pst.setString(32, PDDF.getText());
            pst.setString(33, DFT.getText());
            pst.setString(34, PDDFT.getText());
            pst.setString(35, R.getText());
            pst.setString(36, PCR.getText());
            pst.setString(37, apy.getText());
            pst.setString(38, Lugar.getText());
            pst.setString(39, Rembolso.getText());
            pst.setString(40, ADD.getText());
            pst.setString(41, HE.getText());
            pst.setString(42, THE.getText());
            pst.setString(43, F.getText());
            pst.setString(44, DPF.getText());
            pst.setString(45, RI.getText());
            pst.setString(46, RF.getText());
            pst.setString(47, NomISR.getText());
            pst.setString(48, DI.getText());
            pst.setString(49, Fdb.getText());
            pst.setString(50, Sancion.getText());
            pst.setString(51, Chamarra.getText());
            pst.setString(52, Chaleco.getText());
            pst.setString(53, Fde.getText());
            pst.setString(54, Grua.getText());
            pst.setString(55, Pantalon.getText());
            pst.setString(56, Credencial.getText());
            pst.setString(57, Bp.getText());
            pst.setString(58, Playera.getText());
            pst.setString(59, Corbata.getText());
            pst.setString(60, Presp.getText());
            pst.setString(61, cda.getText());
            pst.setString(62, Odtp.getText());
            pst.setString(63, AdN.getText());
            pst.setString(64, ((JTextField) FechaDA.getDateEditor().getUiComponent()).getText());
            pst.setString(65, SDI.getText());
            pst.setString(66, TP.getText());
            pst.setString(67, TG.getText());
            pst.setString(68, SubsidioE.getText());
            pst.setString(69, TDeducciones.getText());
            pst.setString(70, TotalEf.getText());
            pst.setString(71, NPagado.getText());
            pst.setString(72, SBruto.getText());
            pst.setString(73, Subsidio.getText());
            pst.setString(74, CargaP.getText());
            pst.setString(75, SBtotal.getText());
            pst.setString(76, TSIVA.getText());
            pst.setString(77, PReal.getText());
            pst.setString(78, Otros.getText());
            pst.setString(79, deposito.getText());
            pst.setString(80, ((JTextField) FDD.getDateEditor().getUiComponent()).getText());
            pst.setString(81, MDP.getSelectedItem().toString());
            pst.setString(82, FDP.getText());
            pst.setString(83, Obsdeposito.getText());
            pst.setInt(84, Integer.parseInt(NFnom.getText()));
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito Modificado.");
            
            Cleardeposito();
            FunMD();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar deposito: " + e.getMessage());
        }
    }
    
    public void FunMD() {
        MDNSQ();
        MDepSQ();
    }

    // mostrar datos de nomina
    public void MDNSQ() {
        //Buscar empleado
        String FiltroN = Nominab8.getText();
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal`";
        String FAPNom = FApT8.getText();
        String FAMNom = FAmT8.getText();
        String FiltroSnom = FiltroSnomina8.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina8.getSelectedItem().toString();
        String FiltroFol = FiltroNDF8.getText();
        
        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.corporativo santander quincenal` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Zona");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Sueldo");//8
            modelo.addColumn("Bono");
            modelo.addColumn("Por dia");
            modelo.addColumn("Por hora");
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
            modelo.addColumn("Dia festivo");
            modelo.addColumn("Pago de dia festivo");
            modelo.addColumn("Dia festivo trabajado");
            modelo.addColumn("Pago de dias festivos trabajados");
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Retardos");//26
            modelo.addColumn("Pago con retardos");
            modelo.addColumn("Apoyo");//28
            modelo.addColumn("Lugar");
            modelo.addColumn("Rembolso");//30
            modelo.addColumn("Adicionales");
            modelo.addColumn("Faltas");//32
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Desc IMSS");//34
            modelo.addColumn("Infonavit");
            modelo.addColumn("Fonacot");
            modelo.addColumn("ISR");
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
            modelo.addColumn("Total de descuentos varios");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//48
            modelo.addColumn("Deposito");

//Anchos hasta quincena
            int[] anchos = {/*NL*/50, /*NE*/ 60, /*AP*/ 70, /*AM*/ 70, /*NAME*/ 150,
                /*ZONA*/ 50, /*SERV*/ 70, /*SUELDO*/ 55, /*BONO*/ 50, /*Ban*/ 50,/*cta*/ 50, /*pordia*/ 50, /*porHora*/ 50,
                /*QDM*/ 150, /*AÑO*/ 35, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90,/*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*HE*/ 50, /*THE*/ 50, /*FALT*/ 45,
                /*DPF*/ 120, /*INF*/ 50, /*FON*/ 50, /*ISR*/ 50,/*DI*/ 50, /*FDB*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*adn*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, /*DEP*/ 120};
            
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
        } catch (SQLException error_ND_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos Acapulco: " + error_ND_FA.getMessage());
            
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
        Bono.setText("0");
        pd.setText("0");
        Quincenas.setSelectedIndex(0);
        año.setCalendar(fecha_actual);
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
        FDP.setText("");
        Obsdeposito.setText("");
        ban.setText("");
        cta.setText("");
        PH.setText("");
        THE.setText("0");
        HE.setText("0");
        RI.setText("0");
        RF.setText("0");
        NomISR.setText("0");
    }
    
    public void Agregardeposito() {
        String SQL = "INSERT INTO `rh.depositos.corporativo santander quincenal`"
                + " (`#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, "
                + "`Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, "
                + "`Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, "
                + "`Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`,"
                + " `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`,"
                + " `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`,"
                + " `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`,"
                + " `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`,"
                + " `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`,"
                + " `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, "
                + "`total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`,"
                + " `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`,"
                + " `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`,"
                + " `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`,"
                + " `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Fecha de alta`,"
                + " `SDI`, `Total percepciones`, `Total Gravable`, `Subsidio empleo`,"
                + " `total deducciones`, `total efectivo`, `neto pagado`, `sueldobruto`,"
                + " `subsidio`, `carga patronal`, `Sub total`, `Total sin IVA`, `Pago real`,"
                + " `Otros`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`,"
                + " `Observaciones`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setInt(1, Integer.parseInt(NFnom.getText()));
            pst.setString(2, NDL.getText());
            pst.setString(3, NEnom.getText());
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, sueldo.getText());
            pst.setString(10, Bono.getText());
            pst.setString(11, ban.getText());
            pst.setString(12, cta.getText());
            pst.setString(13, pd.getText());
            pst.setString(14, PH.getText());
            pst.setString(15, Quincenas.getSelectedItem().toString());
            pst.setString(16, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(17, Dpi.getText());
            pst.setString(18, pds.getText());
            pst.setString(19, Ddv.getText());
            pst.setString(20, PDDDV.getText());
            pst.setString(21, DD.getText());
            pst.setString(22, PDDD.getText());
            pst.setString(23, DL.getText());
            pst.setString(24, PDDL.getText());
            pst.setString(25, dt.getText());
            pst.setString(26, PDDT.getText());
            pst.setString(27, DSGS.getText());
            pst.setString(28, PDDDDSGS.getText());
            pst.setString(29, FJ.getText());
            pst.setString(30, DO.getText());
            pst.setString(31, DF.getText());
            pst.setString(32, PDDF.getText());
            pst.setString(33, DFT.getText());
            pst.setString(34, PDDFT.getText());
            pst.setString(35, R.getText());
            pst.setString(36, PCR.getText());
            pst.setString(37, apy.getText());
            pst.setString(38, Lugar.getText());
            pst.setString(39, Rembolso.getText());
            pst.setString(40, ADD.getText());
            pst.setString(41, HE.getText());
            pst.setString(42, THE.getText());
            pst.setString(43, F.getText());
            pst.setString(44, DPF.getText());
            pst.setString(45, RI.getText());
            pst.setString(46, RF.getText());
            pst.setString(47, NomISR.getText());
            pst.setString(48, DI.getText());
            pst.setString(49, Fdb.getText());
            pst.setString(50, Sancion.getText());
            pst.setString(51, Chamarra.getText());
            pst.setString(52, Chaleco.getText());
            pst.setString(53, Fde.getText());
            pst.setString(54, Grua.getText());
            pst.setString(55, Pantalon.getText());
            pst.setString(56, Credencial.getText());
            pst.setString(57, Bp.getText());
            pst.setString(58, Playera.getText());
            pst.setString(59, Corbata.getText());
            pst.setString(60, Presp.getText());
            pst.setString(61, cda.getText());
            pst.setString(62, Odtp.getText());
            pst.setString(63, AdN.getText());
            pst.setString(64, deposito.getText());
            pst.setString(65, ((JTextField) FDD.getDateEditor().getUiComponent()).getText());
            pst.setString(66, MDP.getSelectedItem().toString());
            pst.setString(67, FDP.getText());
            pst.setString(68, Obsdeposito.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito agregado.");
            
            Cleardeposito();
            FunMD();
            
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar deposito: " + e.getMessage());
        }
    }
    
    public void MDepSQ() {
        String SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.corporativo santander quincenal`";
        String FiltroN = busp8.getText();
        String FAPNom = BAppag8.getText();
        String FAMNom = Bampag8.getText();
        String FiltroSnom = FiltroServP8.getSelectedItem().toString();
        String FiltroQuin = FiltroQP8.getSelectedItem().toString();
        String FiltroFol = filtroNDFP8.getText();
        
        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.corporativo santander quincenal`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.c` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.corporativo santander quincenal` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.corporativo santander quincenal` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.corporativo santander quincenal`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT `#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, `Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, `Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, `Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, `Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`, `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, `Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones` FROM `rh.depositos.corporativo santander quincenal` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep8.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;
            
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("# Folio");
            modelo.addColumn("# Lista");
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Por dia");
            modelo.addColumn("Por hora");
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
            modelo.addColumn("Dia festivo");
            modelo.addColumn("Pago de dia festivo");
            modelo.addColumn("Dia festivo trabajado");
            modelo.addColumn("Pago de dias festivos trabajados");
            modelo.addColumn("Retardos");
            modelo.addColumn("Pago con retardos");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Descuento imss");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Fonacot");
            modelo.addColumn("ISR");
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
                /*PDV*/ 50, /*DDD*/ 50, /*PDDD*/ 50, /*DL*/ 50, /*PDDL*/ 50, 50, 50, 50, 50, 50, 50, 50, 50,
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50,
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};
            
            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep8.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
                
            }
            
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en sur 2 " + e.getMessage());
            
        }
    }

    //Calculo de deposito
    public void deposito() {
        //por dia
        PH.setText("" + Double.parseDouble(pd.getText()) / 8);

//incapacidad
        pds.setText("" + Double.parseDouble(Dpi.getText()) * Double.parseDouble(pd.getText()));

//vacaciones
        PDDDV.setText("" + Double.parseDouble(Ddv.getText()) * Double.parseDouble(pd.getText()));
//descanso
        PDDD.setText("" + Double.parseDouble(DD.getText()) * Double.parseDouble(pd.getText()));
//dia laborado
        PDDL.setText("" + Double.parseDouble(DL.getText()) * Double.parseDouble(pd.getText()));

        //Dia festivo
        PDDF.setText("" + Double.parseDouble(DF.getText()) * Double.parseDouble(pd.getText()));

        //dia festivo laborado
        PDDFT.setText("" + (3 * Double.parseDouble(pd.getText())) * Double.parseDouble(DFT.getText()));

//descanso
        PDDT.setText("" + (2 * Double.parseDouble(pd.getText())) * Double.parseDouble(dt.getText()));
//faltas
        DPF.setText("" + ((350 * Double.parseDouble(F.getText())) - (Double.parseDouble(pd.getText()) * Double.parseDouble(F.getText()))));
//retardo
        PCR.setText("" + ((Double.parseDouble(pd.getText()) * Double.parseDouble(R.getText())) - (Double.parseDouble(R.getText()) * 50)));
//hora extra
        this.THE.setText("" + Double.parseDouble(this.HE.getText()) * Double.parseDouble(this.PH.getText()));

//ingresos
        double Ingresos = (Double.parseDouble(this.PDDDDSGS.getText())
                + Double.parseDouble(this.Bono.getText()) + Double.parseDouble(this.Rembolso.getText())
                + Double.parseDouble(this.PDDT.getText()) + Double.parseDouble(this.ADD.getText())
                + Double.parseDouble(this.apy.getText()) + Double.parseDouble(this.PDDD.getText())
                + Double.parseDouble(this.PCR.getText()) + Double.parseDouble(this.PDDFT.getText())
                + Double.parseDouble(this.PDDF.getText()) + Double.parseDouble(this.PDDL.getText())
                + Double.parseDouble(this.PDDDV.getText()) + Double.parseDouble(this.THE.getText()));
        
        double Egresos = (Double.parseDouble(this.DVT.getText())
                + Double.parseDouble(this.DI.getText()) + Double.parseDouble(this.Odtp.getText())
                + Double.parseDouble(this.Presp.getText()) + Double.parseDouble(this.cda.getText())
                + Double.parseDouble(this.DPF.getText()) + Double.parseDouble(this.RI.getText())
                + Double.parseDouble(RF.getText()) + Double.parseDouble(NomISR.getText()));
        
        DecimalFormat dDeposito = new DecimalFormat("#.00");
        this.deposito.setText(dDeposito.format(Ingresos - Egresos));
        
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RH = new javax.swing.JTabbedPane();
        jScrollPane9 = new javax.swing.JScrollPane();
        PestanañasND = new javax.swing.JTabbedPane();
        TDFA8 = new javax.swing.JScrollPane();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane28 = new javax.swing.JScrollPane();
        Tnom8 = new javax.swing.JTable();
        LabelBE8 = new javax.swing.JLabel();
        Nominab8 = new javax.swing.JTextField();
        CS22 = new javax.swing.JButton();
        LabelBS8 = new javax.swing.JLabel();
        FiltroSnomina8 = new javax.swing.JComboBox<>();
        LabelBQ8 = new javax.swing.JLabel();
        FiltroQuincenanomina8 = new javax.swing.JComboBox<>();
        LabelSZ8 = new javax.swing.JLabel();
        FZservicio8 = new javax.swing.JComboBox<>();
        jLabel186 = new javax.swing.JLabel();
        FiltrosTD8 = new javax.swing.JComboBox<>();
        LabelBNDF8 = new javax.swing.JLabel();
        FiltroNDF8 = new javax.swing.JTextField();
        FApT8 = new javax.swing.JTextField();
        FAmT8 = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel123 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        DI = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        Presp = new javax.swing.JTextField();
        cda = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        Odtp = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        F = new javax.swing.JTextField();
        DPF = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        RI = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        RF = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        NomISR = new javax.swing.JTextField();
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
        jScrollPane16 = new javax.swing.JScrollPane();
        Obsdeposito = new javax.swing.JTextArea();
        Adddeposito = new javax.swing.JButton();
        Moddeposito = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel122 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
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
        DVT = new javax.swing.JTextField();
        jPanel19 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        Zon = new javax.swing.JTextField();
        ServN = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        Bono = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        ban = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cta = new javax.swing.JTextField();
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
        jPanel18 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LabelDSGS = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        PDDDDSGS = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        apy = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        Lugar = new javax.swing.JTextField();
        Rembolso = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        ADD = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        R = new javax.swing.JTextField();
        Dpi = new javax.swing.JTextField();
        Ddv = new javax.swing.JTextField();
        DD = new javax.swing.JTextField();
        DL = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        DSGS = new javax.swing.JTextField();
        FJ = new javax.swing.JTextField();
        DO = new javax.swing.JTextField();
        DF = new javax.swing.JTextField();
        DFT = new javax.swing.JTextField();
        PCR = new javax.swing.JTextField();
        pds = new javax.swing.JTextField();
        PDDDV = new javax.swing.JTextField();
        PDDD = new javax.swing.JTextField();
        PDDL = new javax.swing.JTextField();
        PDDT = new javax.swing.JTextField();
        PDDF = new javax.swing.JTextField();
        PDDFT = new javax.swing.JTextField();
        FDP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deposito = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        PH = new javax.swing.JTextField();
        HE = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        THE = new javax.swing.JTextField();
        SubsidioE = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TDeducciones = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Subsidio = new javax.swing.JTextField();
        TotalEf = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        NPagado = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        SBruto = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        SBtotal = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        CargaP = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Otros = new javax.swing.JTextField();
        FechaDA = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        SDI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        TP = new javax.swing.JTextField();
        PReal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TG = new javax.swing.JTextField();
        TSIVA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        PestañasPagos = new javax.swing.JTabbedPane();
        TPagos8 = new javax.swing.JScrollPane();
        jPanel37 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        Tdep8 = new javax.swing.JTable();
        LabelBEP8 = new javax.swing.JLabel();
        busp8 = new javax.swing.JTextField();
        CS23 = new javax.swing.JButton();
        LabelSZP8 = new javax.swing.JLabel();
        FiltroSZP8 = new javax.swing.JComboBox<>();
        LabelBSP8 = new javax.swing.JLabel();
        FiltroServP8 = new javax.swing.JComboBox<>();
        LabelNDFP8 = new javax.swing.JLabel();
        filtroNDFP8 = new javax.swing.JTextField();
        LabelBQP8 = new javax.swing.JLabel();
        FiltroQP8 = new javax.swing.JComboBox<>();
        jLabel187 = new javax.swing.JLabel();
        FiltrosP8 = new javax.swing.JComboBox<>();
        BAppag8 = new javax.swing.JTextField();
        Bampag8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CNQ = new javax.swing.JMenuItem();
        PRESQ = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
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
        Alumnos = new javax.swing.JMenuItem();
        EmpleadosT = new javax.swing.JMenuItem();
        General = new javax.swing.JMenuItem();
        Depositos = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        Semanales = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depositos C/ IMSS");

        jPanel36.setBackground(new java.awt.Color(204, 255, 255));

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

        LabelBE8.setText("Buscar Empleado:");

        Nominab8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab8KeyReleased(evt);
            }
        });

        CS22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS22.setText("Cerrar sesion");
        CS22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS22ActionPerformed(evt);
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

        jLabel186.setText("Filtros:");

        FiltrosTD8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD8ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS22))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane28))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE8)
                    .addComponent(Nominab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS8)
                    .addComponent(FiltroSnomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ8)
                    .addComponent(FiltroQuincenanomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ8)
                    .addComponent(FZservicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel186)
                    .addComponent(FiltrosTD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF8)
                    .addComponent(FiltroNDF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane28, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS22)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA8.setViewportView(jPanel36);

        PestanañasND.addTab("Santander quincenal", TDFA8);

        jScrollPane9.setViewportView(PestanañasND);

        RH.addTab("Nominas", jScrollPane9);

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));

        jLabel123.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel123.setText("Deposito:");

        jPanel16.setBackground(new java.awt.Color(204, 255, 204));

        jLabel60.setText("Desc IMSS:");

        DI.setText("0");
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

        Odtp.setText("0");
        Odtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OdtpKeyReleased(evt);
            }
        });

        jLabel26.setText("Dias con faltas:");

        jLabel137.setText("Descuento por faltas:");

        F.setText("0");

        DPF.setText("0");

        jLabel32.setText("Retencion infonavit:");

        RI.setText("0");
        RI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RIKeyReleased(evt);
            }
        });

        jLabel39.setText("fonacot:");

        RF.setText("0");
        RF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RFKeyReleased(evt);
            }
        });

        jLabel45.setText("ISR");

        NomISR.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84)
                    .addComponent(jLabel60)
                    .addComponent(jLabel26)
                    .addComponent(jLabel61)
                    .addComponent(jLabel85))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(DI, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Presp))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel137)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel45))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DPF, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(RI)
                            .addComponent(RF)
                            .addComponent(NomISR))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel137)
                    .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(RF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(NomISR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        Obsdeposito.setColumns(20);
        Obsdeposito.setLineWrap(true);
        Obsdeposito.setRows(5);
        jScrollPane16.setViewportView(Obsdeposito);

        Adddeposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        Adddeposito.setText("Agregar");
        Adddeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdddepositoActionPerformed(evt);
            }
        });

        Moddeposito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        Moddeposito.setText("Modificar");
        Moddeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModdepositoActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(204, 255, 204));

        jLabel122.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel122.setText("Descuentos varios:");

        jLabel124.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel124.setText("Total de descuentos varios:");

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

        DVT.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        DVT.setText("0");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(AdN)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(jLabel122))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel124)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DVT, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 28, Short.MAX_VALUE)))
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
                    .addComponent(DVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(204, 255, 204));

        jLabel91.setText("Servicio:");

        jLabel92.setText("Zona:");

        jLabel93.setText("Bono:");

        Bono.setText("0");

        jLabel95.setText("Sueldo:");

        sueldo.setText("0");

        jLabel13.setText("Banco:");

        jLabel5.setText("Cuenta de Banco:");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ban))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel93)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
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
                    .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        Datgen.setBackground(new java.awt.Color(204, 255, 204));

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

        jPanel18.setBackground(new java.awt.Color(204, 255, 204));

        jLabel105.setText("Dias de incapacidad:");

        jLabel107.setText("Dias de vacaciones:");

        jLabel103.setText("Dias descansados:");

        jLabel15.setText("Dias Laborados:");

        jLabel16.setText("Descansos Trabajados:");

        LabelDSGS.setText("Descanso sin goce de sueldo:");

        jLabel142.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel142.setText("Ingresos:");

        jLabel104.setText("Pago de seguro:");

        jLabel9.setText("Pago de dias de vacaciones:");

        jLabel88.setText("Pago de dias descansados:");

        jLabel128.setText("Pago de dias laborados:");

        jLabel21.setText("Pago de descansos trabajados:");

        jLabel136.setText("Pago de dias de DSGS:");

        PDDDDSGS.setText("0");
        PDDDDSGS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PDDDDSGSKeyReleased(evt);
            }
        });

        jLabel19.setText("Faltas Justificadas:");

        jLabel31.setText("Descanso Otorgado:");

        jLabel17.setText("Apoyo:");

        apy.setText("0");
        apy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apyKeyReleased(evt);
            }
        });

        jLabel76.setText("Lugar:");

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

        jLabel138.setText("Pago con retardos:");

        jLabel182.setText("Dias festivos:");

        jLabel183.setText("Dias festivos trabajados:");

        jLabel184.setText("Pago de dias festivos:");

        jLabel185.setText("Pago de dias festivos trabajados:");

        R.setText("0");

        Dpi.setText("0");

        Ddv.setText("0");

        DD.setText("0");

        DL.setText("0");

        dt.setText("0");

        DSGS.setText("0");

        FJ.setText("0");

        DO.setText("0");

        DF.setText("0");

        DFT.setText("0");

        PCR.setText("0");

        pds.setText("0");

        PDDDV.setText("0");

        PDDD.setText("0");

        PDDL.setText("0");

        PDDT.setText("0");

        PDDF.setText("0");

        PDDFT.setText("0");

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
                            .addComponent(jLabel76)
                            .addComponent(jLabel182)
                            .addComponent(jLabel183)
                            .addComponent(jLabel15)
                            .addComponent(jLabel103)
                            .addComponent(jLabel107)
                            .addComponent(jLabel16)
                            .addComponent(jLabel105)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(apy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(Lugar, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel87)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DFT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel185))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DF)
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel184))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel88))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel136))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel21))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel128))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(Ddv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel138, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel104, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PCR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pds, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDDV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDFT, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(DO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(FJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel142)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel138)
                    .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel104)
                    .addComponent(Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(jLabel9)
                    .addComponent(Ddv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDDDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel103)
                    .addComponent(jLabel88)
                    .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDDD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel128)
                    .addComponent(DL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel21)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PDDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDSGS)
                    .addComponent(jLabel136)
                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DSGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(FJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(DO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel182)
                            .addComponent(jLabel184)
                            .addComponent(DF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PDDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel183)
                            .addComponent(jLabel185)
                            .addComponent(DFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PDDFT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel1.setText("Quincena:");

        deposito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deposito.setText("0");

        jLabel40.setText("Por hora:");

        PH.setText("0");

        HE.setText("0");
        HE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HEKeyReleased(evt);
            }
        });

        jLabel42.setText("Total horas extra:");

        jLabel41.setText("Horas extras:");

        THE.setText("0");

        jLabel10.setText("Total deducciones:");

        jLabel11.setText("Total efectivo:");

        jLabel14.setText("Neto pagado:");

        jLabel18.setText("Sueldo bruto:");

        jLabel22.setText("Subsidio");

        jLabel24.setText("Sub total:");

        jLabel23.setText("Carga patronal:");

        jLabel2.setText("Fecha de alta:");

        jLabel4.setText("SDI");

        jLabel6.setText("Total percepciones:");

        jLabel29.setText("Otros");

        jLabel7.setText("Total Gravable:");

        jLabel28.setText("Pago real:");

        jLabel8.setText("Subsidio empleo:");

        jLabel27.setText("Total sin IVA:");

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
                                        .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel40)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel123)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel101)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel110))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(Adddeposito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Moddeposito))
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel133)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(THE, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel24)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addGap(35, 35, 35)
                            .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FechaDA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SDI)
                    .addComponent(TP)
                    .addComponent(TG)
                    .addComponent(SubsidioE)
                    .addComponent(TDeducciones)
                    .addComponent(TotalEf)
                    .addComponent(NPagado)
                    .addComponent(SBruto)
                    .addComponent(Subsidio)
                    .addComponent(CargaP)
                    .addComponent(SBtotal)
                    .addComponent(TSIVA)
                    .addComponent(PReal)
                    .addComponent(Otros, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel41)
                                            .addComponent(HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel42)
                                            .addComponent(THE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel133)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Datgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel101)
                                        .addComponent(jLabel1))
                                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel89)
                                    .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40)
                                    .addComponent(PH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel123)
                                    .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Adddeposito)
                                    .addComponent(Moddeposito)))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(FechaDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(SDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(TG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(SubsidioE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(TDeducciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TotalEf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(NPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(SBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(Subsidio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(CargaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(SBtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(TSIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(PReal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(Otros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(jPanel9);

        RH.addTab("Registro de depositos", jScrollPane10);

        jPanel37.setBackground(new java.awt.Color(204, 255, 204));

        Tdep8.setModel(new javax.swing.table.DefaultTableModel(
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
        Tdep8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep8MousePressed(evt);
            }
        });
        jScrollPane36.setViewportView(Tdep8);

        LabelBEP8.setText("Buscar empleado:");

        busp8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp8KeyReleased(evt);
            }
        });

        CS23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS23.setText("Cerrar sesion");
        CS23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS23ActionPerformed(evt);
            }
        });

        LabelSZP8.setText("Seleccionar zona:");

        FiltroSZP8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP8ItemStateChanged(evt);
            }
        });

        LabelBSP8.setText("Buscar servicio:");

        FiltroServP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP8ItemStateChanged(evt);
            }
        });

        LabelNDFP8.setText("# de Lista");

        filtroNDFP8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP8KeyReleased(evt);
            }
        });

        LabelBQP8.setText("Buscar quincena:");

        FiltroQP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP8ItemStateChanged(evt);
            }
        });

        jLabel187.setText("Filtrar:");

        FiltrosP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP8ItemStateChanged(evt);
            }
        });

        BAppag8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag8KeyReleased(evt);
            }
        });

        Bampag8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag8KeyReleased(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36)
                    .addGroup(jPanel37Layout.createSequentialGroup()
                        .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel37Layout.createSequentialGroup()
                                .addComponent(jLabel187)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBEP8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS23))
                        .addGap(0, 7194, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP8)
                    .addComponent(busp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP8)
                    .addComponent(FiltroSZP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP8)
                    .addComponent(FiltroServP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP8)
                    .addComponent(filtroNDFP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP8)
                    .addComponent(FiltroQP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel187)
                    .addComponent(FiltrosP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS23)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos8.setViewportView(jPanel37);

        PestañasPagos.addTab("Santander quincenal", TPagos8);

        jScrollPane12.setViewportView(PestañasPagos);

        RH.addTab("Tabla depositos", jScrollPane12);

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

        jMenu1.setText("Cambiar a:");

        Alumnos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Alumnos.setText("Alumnos estadia");
        Alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlumnosActionPerformed(evt);
            }
        });
        jMenu1.add(Alumnos);

        EmpleadosT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        EmpleadosT.setText("Empelados torteria");
        EmpleadosT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpleadosTActionPerformed(evt);
            }
        });
        jMenu1.add(EmpleadosT);

        General.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        General.setText("Empleados General");
        General.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeneralActionPerformed(evt);
            }
        });
        jMenu1.add(General);

        Depositos.setText("Depositos");

        jMenu7.setText("Quincenales");

        jMenuItem9.setText("Depositos S/ IMSS");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        Depositos.add(jMenu7);

        jMenu8.setText("Semanales");

        jMenuItem15.setText("Depositos C/ IMSS");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem15);

        jMenuItem16.setText("Depositos S/ IMSS");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem16);

        Depositos.add(jMenu8);

        jMenu1.add(Depositos);

        jMenuBar1.add(jMenu1);

        Semanales.setText("Semanales");

        jMenuItem2.setText("Inturbide");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Semanales.add(jMenuItem2);

        jMenuItem3.setText("Tehuantepec");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Semanales.add(jMenuItem3);

        jMenuItem4.setText("PTE titla");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Semanales.add(jMenuItem4);

        jMenuBar1.add(Semanales);

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

    private void ModdepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModdepositoActionPerformed
        Modeposito();
        FunMD();
    }//GEN-LAST:event_ModdepositoActionPerformed

    private void AdddepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdddepositoActionPerformed
        Agregardeposito();
        FunMD();
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

    private void PDDDDSGSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDDDDSGSKeyReleased
        deposito();
    }//GEN-LAST:event_PDDDDSGSKeyReleased

    private void apyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apyKeyReleased
        deposito();
    }//GEN-LAST:event_apyKeyReleased

    private void RembolsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RembolsoKeyReleased
        deposito();
    }//GEN-LAST:event_RembolsoKeyReleased

    private void ADDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADDKeyReleased
        deposito();
    }//GEN-LAST:event_ADDKeyReleased

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

    private void CDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDAActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDAActionPerformed

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

    private void ZYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZYSActionPerformed
        AltasZyS_3 regr = new AltasZyS_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZYSActionPerformed

    private void AlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlumnosActionPerformed
        
        Estadias_4 regr = new Estadias_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AlumnosActionPerformed

    private void EmpleadosTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpleadosTActionPerformed
        
        Tortas_4 regr = new Tortas_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EmpleadosTActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Iturbide_4 regr = new Iturbide_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Tehuantepec_4 regr = new Tehuantepec_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        PT_4 regr = new PT_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void GeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeneralActionPerformed
        Empleados_4 regr = new Empleados_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GeneralActionPerformed

    private void ADMV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMV1ActionPerformed
        VentanaADM_3 regr = new VentanaADM_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMV1ActionPerformed

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

    private void RIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RIKeyReleased
        deposito();
    }//GEN-LAST:event_RIKeyReleased

    private void RFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFKeyReleased
        deposito();
    }//GEN-LAST:event_RFKeyReleased

    private void HEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HEKeyReleased
        deposito();
    }//GEN-LAST:event_HEKeyReleased

    private void Tnom8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom8MouseClicked
        try {
            
            DefaultTableModel model = (DefaultTableModel) Tnom8.getModel();
            
            int fila = Tnom8.getSelectedRow();
            NDL.setText(String.valueOf(Tnom8.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom8.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom8.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom8.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom8.getValueAt(fila, 4)));
            ban.setText(String.valueOf(Tnom8.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom8.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom8.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom8.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom8.getValueAt(fila, 9)));
            Bono.setText(String.valueOf(Tnom8.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom8.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom8.getValueAt(fila, 12)));
            String Quinc = model.getValueAt(fila, 13).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 14));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom8.getValueAt(fila, 15)));
            pds.setText(String.valueOf(Tnom8.getValueAt(fila, 16)));
            Ddv.setText(String.valueOf(Tnom8.getValueAt(fila, 17)));
            PDDDV.setText(String.valueOf(Tnom8.getValueAt(fila, 18)));
            DD.setText(String.valueOf(Tnom8.getValueAt(fila, 19)));
            PDDD.setText(String.valueOf(Tnom8.getValueAt(fila, 20)));
            DL.setText(String.valueOf(Tnom8.getValueAt(fila, 21)));
            PDDL.setText(String.valueOf(Tnom8.getValueAt(fila, 22)));
            dt.setText(String.valueOf(Tnom8.getValueAt(fila, 23)));
            PDDT.setText(String.valueOf(Tnom8.getValueAt(fila, 24)));
            DSGS.setText(String.valueOf(Tnom8.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tnom8.getValueAt(fila, 26)));
            FJ.setText(String.valueOf(Tnom8.getValueAt(fila, 27)));
            DO.setText(String.valueOf(Tnom8.getValueAt(fila, 28)));
            DF.setText(String.valueOf(Tnom8.getValueAt(fila, 29)));
            PDDF.setText(String.valueOf(Tnom8.getValueAt(fila, 30)));
            DFT.setText(String.valueOf(Tnom8.getValueAt(fila, 31)));
            PDDFT.setText(String.valueOf(Tnom8.getValueAt(fila, 32)));
            HE.setText(String.valueOf(Tnom8.getValueAt(fila, 33)));
            THE.setText(String.valueOf(Tnom8.getValueAt(fila, 34)));
            R.setText(String.valueOf(Tnom8.getValueAt(fila, 35)));
            PCR.setText(String.valueOf(Tnom8.getValueAt(fila, 36)));
            apy.setText(String.valueOf(Tnom8.getValueAt(fila, 37)));
            Lugar.setText(String.valueOf(Tnom8.getValueAt(fila, 38)));
            Rembolso.setText(String.valueOf(Tnom8.getValueAt(fila, 39)));
            ADD.setText(String.valueOf(Tnom8.getValueAt(fila, 40)));
            F.setText(String.valueOf(Tnom8.getValueAt(fila, 41)));
            DPF.setText(String.valueOf(Tnom8.getValueAt(fila, 42)));
            DI.setText(String.valueOf(Tnom8.getValueAt(fila, 43)));
            RI.setText(String.valueOf(Tnom8.getValueAt(fila, 44)));
            RF.setText(String.valueOf(Tnom8.getValueAt(fila, 45)));
            NomISR.setText(String.valueOf(Tnom8.getValueAt(fila, 46)));
            Fdb.setText(String.valueOf(Tnom8.getValueAt(fila, 47)));
            Sancion.setText(String.valueOf(Tnom8.getValueAt(fila, 48)));
            Chamarra.setText(String.valueOf(Tnom8.getValueAt(fila, 49)));
            Chaleco.setText(String.valueOf(Tnom8.getValueAt(fila, 50)));
            Fde.setText(String.valueOf(Tnom8.getValueAt(fila, 51)));
            Grua.setText(String.valueOf(Tnom8.getValueAt(fila, 52)));
            Pantalon.setText(String.valueOf(Tnom8.getValueAt(fila, 53)));
            Credencial.setText(String.valueOf(Tnom8.getValueAt(fila, 54)));
            Bp.setText(String.valueOf(Tnom8.getValueAt(fila, 55)));
            Playera.setText(String.valueOf(Tnom8.getValueAt(fila, 56)));
            Corbata.setText(String.valueOf(Tnom8.getValueAt(fila, 57)));
            AdN.setText(String.valueOf(Tnom8.getValueAt(fila, 58)));
            DVT.setText(String.valueOf(Tnom8.getValueAt(fila, 59)));
            Presp.setText(String.valueOf(Tnom8.getValueAt(fila, 60)));
            cda.setText(String.valueOf(Tnom8.getValueAt(fila, 61)));
            Odtp.setText(String.valueOf(Tnom8.getValueAt(fila, 62)));
            deposito.setText(String.valueOf(Tnom8.getValueAt(fila, 63)));
        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom8MouseClicked

    private void Nominab8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab8KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab8KeyReleased

    private void CS22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS22ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS22ActionPerformed

    private void FiltroSnomina8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina8ItemStateChanged

    private void FiltroQuincenanomina8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina8ItemStateChanged

    private void FZservicio8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FZservicio8ItemStateChanged

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

    private void FiltroNDF8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF8KeyReleased
        FunMD();

    }//GEN-LAST:event_FiltroNDF8KeyReleased

    private void FApT8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT8KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT8KeyReleased

    private void FAmT8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT8KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT8KeyReleased

    private void busp8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp8KeyReleased
        FunMD();
    }//GEN-LAST:event_busp8KeyReleased

    private void CS23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS23ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS23ActionPerformed

    private void FiltroSZP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP8ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP8.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP8.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP8ItemStateChanged

    private void FiltroServP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP8ItemStateChanged

    private void filtroNDFP8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP8KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP8KeyReleased

    private void FiltroQP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP8ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP8ItemStateChanged

    private void FiltrosP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP8ItemStateChanged
        String FP = (String) FiltrosP8.getSelectedItem();
        if (FP.equals("Selecciona filtro")) {
            busp8.setVisible(false);
            BAppag8.setVisible(false);
            BAppag8.setText("");
            Bampag8.setVisible(false);
            Bampag8.setText("");
            LabelBEP8.setVisible(false);
            busp8.setText("");
            LabelBQP8.setVisible(false);
            FiltroQP8.setVisible(false);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(false);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(false);
            FiltroSZP8.setVisible(false);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(false);
            filtroNDFP8.setVisible(false);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(false);
            FunMD();
            
        }
        if (FP.equals("Filtrar por Nombre(s)")) {
            busp8.setVisible(true);
            LabelBEP8.setVisible(true);
            LabelBEP8.setText("Buscar por nombre:");
            BAppag8.setVisible(false);
            BAppag8.setText("");
            Bampag8.setVisible(false);
            Bampag8.setText("");
            busp8.setText("");
            LabelBQP8.setVisible(false);
            FiltroQP8.setVisible(false);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(false);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(false);
            FiltroSZP8.setVisible(false);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(false);
            filtroNDFP8.setVisible(false);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido P")) {
            busp8.setVisible(false);
            LabelBEP8.setVisible(true);
            LabelBEP8.setText("Buscar por apellido P:");
            BAppag8.setVisible(true);
            BAppag8.setText("");
            Bampag8.setVisible(false);
            Bampag8.setText("");
            busp8.setText("");
            LabelBQP8.setVisible(false);
            FiltroQP8.setVisible(false);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(false);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(false);
            FiltroSZP8.setVisible(false);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(false);
            filtroNDFP8.setVisible(false);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido M")) {
            busp8.setVisible(false);
            LabelBEP8.setVisible(true);
            LabelBEP8.setText("Buscar por apellido M: ");
            BAppag8.setVisible(false);
            BAppag8.setText("");
            Bampag8.setVisible(true);
            Bampag8.setText("");
            busp8.setText("");
            LabelBQP8.setVisible(false);
            FiltroQP8.setVisible(false);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(false);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(false);
            FiltroSZP8.setVisible(false);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(false);
            filtroNDFP8.setVisible(false);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Servicio")) {
            busp8.setVisible(false);
            LabelBEP8.setVisible(false);
            BAppag8.setVisible(false);
            BAppag8.setText("");
            Bampag8.setVisible(false);
            Bampag8.setText("");
            busp8.setText("");
            LabelBQP8.setVisible(false);
            FiltroQP8.setVisible(false);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(true);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(true);
            FiltroSZP8.setVisible(true);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(true);
            filtroNDFP8.setVisible(false);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por quincena")) {
            busp8.setVisible(false);
            LabelBEP8.setVisible(false);
            BAppag8.setVisible(false);
            BAppag8.setText("");
            Bampag8.setVisible(false);
            Bampag8.setText("");
            busp8.setText("");
            LabelBQP8.setVisible(true);
            FiltroQP8.setVisible(true);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(false);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(false);
            FiltroSZP8.setVisible(false);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(false);
            filtroNDFP8.setVisible(false);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por # Lista")) {
            busp8.setVisible(false);
            LabelBEP8.setVisible(false);
            BAppag8.setVisible(false);
            BAppag8.setText("");
            Bampag8.setVisible(false);
            Bampag8.setText("");
            busp8.setText("");
            LabelBQP8.setVisible(false);
            FiltroQP8.setVisible(false);
            FiltroQP8.setSelectedIndex(0);
            FiltroServP8.setVisible(false);
            FiltroServP8.setSelectedIndex(0);
            LabelBSP8.setVisible(false);
            FiltroSZP8.setVisible(false);
            FiltroSZP8.setSelectedIndex(0);
            LabelSZP8.setVisible(false);
            filtroNDFP8.setVisible(true);
            filtroNDFP8.setText("");
            LabelNDFP8.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP8ItemStateChanged

    private void BAppag8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag8KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag8KeyReleased

    private void Bampag8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag8KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag8KeyReleased

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        Logica_BDDep_CSQ obj = new Logica_BDDep_CSQ();
        obj.BDRH();
    }//GEN-LAST:event_jLabel12MousePressed

    private void Tdep8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep8MousePressed
        try {
            
            DefaultTableModel model = (DefaultTableModel) Tdep8.getModel();
            
            int fila = Tdep8.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep8.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep8.getValueAt(fila, 1)));
            NEnom.setText(String.valueOf(Tdep8.getValueAt(fila, 2)));
            Ap.setText(String.valueOf(Tdep8.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tdep8.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tdep8.getValueAt(fila, 5)));
            Zon.setText(String.valueOf(Tdep8.getValueAt(fila, 6)));
            ServN.setText(String.valueOf(Tdep8.getValueAt(fila, 7)));
            sueldo.setText(String.valueOf(Tdep8.getValueAt(fila, 8)));
            Bono.setText(String.valueOf(Tdep8.getValueAt(fila, 9)));
            ban.setText(String.valueOf(Tdep8.getValueAt(fila, 10)));
            cta.setText(String.valueOf(Tdep8.getValueAt(fila, 11)));
            pd.setText(String.valueOf(Tdep8.getValueAt(fila, 12)));
            PH.setText(String.valueOf(Tdep8.getValueAt(fila, 13)));
            String Quinc = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 15));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tdep8.getValueAt(fila, 16)));
            pds.setText(String.valueOf(Tdep8.getValueAt(fila, 17)));
            Ddv.setText(String.valueOf(Tdep8.getValueAt(fila, 18)));
            PDDDV.setText(String.valueOf(Tdep8.getValueAt(fila, 19)));
            DD.setText(String.valueOf(Tdep8.getValueAt(fila, 20)));
            PDDD.setText(String.valueOf(Tdep8.getValueAt(fila, 21)));
            DL.setText(String.valueOf(Tdep8.getValueAt(fila, 22)));
            PDDL.setText(String.valueOf(Tdep8.getValueAt(fila, 23)));
            dt.setText(String.valueOf(Tdep8.getValueAt(fila, 24)));
            PDDT.setText(String.valueOf(Tdep8.getValueAt(fila, 25)));
            DSGS.setText(String.valueOf(Tdep8.getValueAt(fila, 26)));
            PDDDDSGS.setText(String.valueOf(Tdep8.getValueAt(fila, 27)));
            FJ.setText(String.valueOf(Tdep8.getValueAt(fila, 28)));
            DO.setText(String.valueOf(Tdep8.getValueAt(fila, 29)));
            DF.setText(String.valueOf(Tdep8.getValueAt(fila, 30)));
            PDDF.setText(String.valueOf(Tdep8.getValueAt(fila, 31)));
            DFT.setText(String.valueOf(Tdep8.getValueAt(fila, 32)));
            PDDFT.setText(String.valueOf(Tdep8.getValueAt(fila, 33)));
            R.setText(String.valueOf(Tdep8.getValueAt(fila, 34)));
            PCR.setText(String.valueOf(Tdep8.getValueAt(fila, 35)));
            apy.setText(String.valueOf(Tdep8.getValueAt(fila, 36)));
            Lugar.setText(String.valueOf(Tdep8.getValueAt(fila, 37)));
            Rembolso.setText(String.valueOf(Tdep8.getValueAt(fila, 38)));
            ADD.setText(String.valueOf(Tdep8.getValueAt(fila, 39)));
            HE.setText(String.valueOf(Tdep8.getValueAt(fila, 40)));
            THE.setText(String.valueOf(Tdep8.getValueAt(fila, 41)));
            F.setText(String.valueOf(Tdep8.getValueAt(fila, 42)));
            DPF.setText(String.valueOf(Tdep8.getValueAt(fila, 43)));
            DI.setText(String.valueOf(Tdep8.getValueAt(fila, 47)));
            RI.setText(String.valueOf(Tdep8.getValueAt(fila, 44)));
            RF.setText(String.valueOf(Tdep8.getValueAt(fila, 45)));
            NomISR.setText(String.valueOf(Tdep8.getValueAt(fila, 46)));
            Fdb.setText(String.valueOf(Tdep8.getValueAt(fila, 48)));
            Sancion.setText(String.valueOf(Tdep8.getValueAt(fila, 49)));
            Chamarra.setText(String.valueOf(Tdep8.getValueAt(fila, 50)));
            Chaleco.setText(String.valueOf(Tdep8.getValueAt(fila, 51)));
            Fde.setText(String.valueOf(Tdep8.getValueAt(fila, 52)));
            Grua.setText(String.valueOf(Tdep8.getValueAt(fila, 53)));
            Pantalon.setText(String.valueOf(Tdep8.getValueAt(fila, 54)));
            Credencial.setText(String.valueOf(Tdep8.getValueAt(fila, 55)));
            Bp.setText(String.valueOf(Tdep8.getValueAt(fila, 56)));
            Playera.setText(String.valueOf(Tdep8.getValueAt(fila, 57)));
            Corbata.setText(String.valueOf(Tdep8.getValueAt(fila, 58)));
            Presp.setText(String.valueOf(Tdep8.getValueAt(fila, 59)));
            cda.setText(String.valueOf(Tdep8.getValueAt(fila, 60)));
            Odtp.setText(String.valueOf(Tdep8.getValueAt(fila, 61)));
            AdN.setText(String.valueOf(Tdep8.getValueAt(fila, 62)));
            deposito.setText(String.valueOf(Tdep8.getValueAt(fila, 63)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 64));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 65).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep8.getValueAt(fila, 66)));
            Obsdeposito.setText(String.valueOf(Tdep8.getValueAt(fila, 67)));
            
        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        try {
            int seleccionar = Tdep8.getSelectedRow();
            int id = Integer.parseInt(Tdep8.getValueAt(seleccionar, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select fecha de alta`, `SDI`, `Total percepciones`,"
                    + " `Total gravable`, `subsidio empleo`, `total deducciones`, `total efectivo`, "
                    + "`neto pagado`, `sueldo bruto`, `subsidio`, `carga patronal`, `Sub total`,"
                    + "`Total sin iva`, `pago real`, `otro` FROM ``rh.depositos.corporativo santander quincenal` where `#Folio` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            
            while (rs.next()) {
                Date date1 = new SimpleDateFormat("d MMM y").parse((rs.getString(1)));
                FDD.setDate(date1);
                SDI.setText(rs.getString(2));
                TP.setText(rs.getString(3));
                TG.setText(rs.getString(4));
                SubsidioE.setText(rs.getString(5));
                TDeducciones.setText(rs.getString(6));
                TotalEf.setText(rs.getString(7));
                NPagado.setText(rs.getString(8));
                SBruto.setText(rs.getString(9));
                Subsidio.setText(rs.getString(10));
                CargaP.setText(rs.getString(11));
                SBtotal.setText(rs.getString(12));
                TSIVA.setText(rs.getString(13));
                PReal.setText(rs.getString(14));
                Otros.setText(rs.getString(15));
            }
            ps.isClosed();
            rs.isClosed();
            
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(DepositosQ_4.class.getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep8MousePressed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        DepositosQ_SIMSS_4 regr = new DepositosQ_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        DepositosS_4 regr = new DepositosS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        DepositosS_SIMSS_4 regr = new DepositosS_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem16ActionPerformed

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
            java.util.logging.Logger.getLogger(DepositosQ_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DepositosQ_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD;
    private javax.swing.JMenuItem ADMV1;
    private javax.swing.JTextField AdN;
    private javax.swing.JButton Adddeposito;
    private javax.swing.JMenuItem Alumnos;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField BAppag8;
    private javax.swing.JTextField Bampag8;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField Bp;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA4;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JButton CS22;
    private javax.swing.JButton CS23;
    private javax.swing.JTextField CargaP;
    private javax.swing.JTextField Chaleco;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
    private javax.swing.JTextField DD;
    private javax.swing.JTextField DF;
    private javax.swing.JTextField DFT;
    private javax.swing.JTextField DI;
    private javax.swing.JTextField DL;
    private javax.swing.JTextField DO;
    private javax.swing.JTextField DPF;
    private javax.swing.JTextField DSGS;
    private javax.swing.JTextField DVT;
    private javax.swing.JPanel Datgen;
    private javax.swing.JTextField Ddv;
    private javax.swing.JMenu Depositos;
    private javax.swing.JMenu Depositos1;
    private javax.swing.JTextField Dpi;
    private javax.swing.JMenuItem EmpleadosT;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JTextField F;
    private javax.swing.JTextField FAmT8;
    private javax.swing.JTextField FApT8;
    private com.toedter.calendar.JDateChooser FDD;
    private javax.swing.JTextField FDP;
    private javax.swing.JTextField FJ;
    private javax.swing.JComboBox<String> FZservicio8;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private com.toedter.calendar.JDateChooser FechaDA;
    private javax.swing.JTextField FiltroNDF8;
    private javax.swing.JComboBox<String> FiltroQP8;
    private javax.swing.JComboBox<String> FiltroQuincenanomina8;
    private javax.swing.JComboBox<String> FiltroSZP8;
    private javax.swing.JComboBox<String> FiltroServP8;
    private javax.swing.JComboBox<String> FiltroSnomina8;
    private javax.swing.JComboBox<String> FiltrosP8;
    private javax.swing.JComboBox<String> FiltrosTD8;
    private javax.swing.JMenuItem General;
    private javax.swing.JMenuItem General1;
    private javax.swing.JTextField Grua;
    private javax.swing.JTextField HE;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JMenuItem LDA3;
    private javax.swing.JLabel LabelBE8;
    private javax.swing.JLabel LabelBEP8;
    private javax.swing.JLabel LabelBNDF8;
    private javax.swing.JLabel LabelBQ8;
    private javax.swing.JLabel LabelBQP8;
    private javax.swing.JLabel LabelBS8;
    private javax.swing.JLabel LabelBSP8;
    private javax.swing.JLabel LabelDSGS;
    private javax.swing.JLabel LabelNDFP8;
    private javax.swing.JLabel LabelSZ8;
    private javax.swing.JLabel LabelSZP8;
    private javax.swing.JTextField Lugar;
    private javax.swing.JComboBox<String> MDP;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JButton Moddeposito;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NEnom;
    private javax.swing.JTextField NFnom;
    private javax.swing.JTextField NPagado;
    private javax.swing.JTextField NomISR;
    private javax.swing.JTextField Nominab8;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JTextArea Obsdeposito;
    private javax.swing.JTextField Odtp;
    private javax.swing.JTextField Otros;
    private javax.swing.JTextField PCR;
    private javax.swing.JTextField PDDD;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JTextField PDDDV;
    private javax.swing.JTextField PDDF;
    private javax.swing.JTextField PDDFT;
    private javax.swing.JTextField PDDL;
    private javax.swing.JTextField PDDT;
    private javax.swing.JTextField PH;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JTextField PReal;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JTabbedPane PestanañasND;
    private javax.swing.JTabbedPane PestañasPagos;
    private javax.swing.JTextField Playera;
    private javax.swing.JTextField Presp;
    private javax.swing.JComboBox<String> Quincenas;
    private javax.swing.JTextField R;
    private javax.swing.JTextField RF;
    private javax.swing.JTabbedPane RH;
    private javax.swing.JTextField RI;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JTextField SBruto;
    private javax.swing.JTextField SBtotal;
    private javax.swing.JTextField SDI;
    private javax.swing.JTextField Sancion;
    private javax.swing.JMenu Semanales;
    private javax.swing.JTextField ServN;
    private javax.swing.JTextField Subsidio;
    private javax.swing.JTextField SubsidioE;
    private javax.swing.JScrollPane TDFA8;
    private javax.swing.JTextField TDeducciones;
    private javax.swing.JTextField TG;
    private javax.swing.JTextField THE;
    private javax.swing.JTextField TP;
    private javax.swing.JScrollPane TPagos8;
    private javax.swing.JTextField TSIVA;
    private javax.swing.JTable Tdep8;
    private javax.swing.JTable Tnom8;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JTextField TotalEf;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private javax.swing.JTextField busp8;
    private javax.swing.JTextField cda;
    private javax.swing.JTextField cta;
    private javax.swing.JTextField deposito;
    private javax.swing.JTextField dt;
    private javax.swing.JTextField filtroNDFP8;
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
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
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
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
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
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField pds;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
