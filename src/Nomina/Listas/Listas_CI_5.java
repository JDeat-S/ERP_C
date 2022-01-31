package Nomina.Listas;

import RH.Depositos.Depositos_4;
import Semanal.PT_4;
import Semanal.Tehuantepec_4;
import Semanal.Iturbide_4;
import Nomina.ModulosS.PresS_5;
import Nomina.ModulosQ.CDAQ_5;
import Nomina.ModulosQ.ODTQ_5;
import Nomina.ModulosQ.PresQ_5;
import VentanasDReportes.*;
import Admin.*;
import Conexion.ConexionSQL;
import Filtros.FiltrosZonas;
import RH.*;
import Logicas.*;
import Nomina.NominaQSiMSS_5;
import Nomina.NominaQ_5;
import Nomina.NominaS_5;
import Nomina.NominaS_simss_5;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.PaperSize;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author JDeat
 */
public final class Listas_CI_5 extends javax.swing.JFrame {

    /**
     * Creates new form Listas
     */
    String FG = "";
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Logica_usuarios usr;
    Logica_permisos LP;

    public Listas_CI_5() {
        initComponents();
        FiltrosZonas xd = new FiltrosZonas();
        DefaultComboBoxModel modelzonass = new DefaultComboBoxModel(xd.mostrarzonas());
        FilZona.setModel(modelzonass);
        SHempleados();
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        Fecha1.setVisible(false);
        LabelFil.setVisible(false);
        LDAfilap.setVisible(false);
        LDAfilam.setVisible(false);
        LDAfilname.setVisible(false);
        DiaCor1.setVisible(false);
        DiaCor2.setVisible(false);
        DiaCor3.setVisible(false);
        DiaCor4.setVisible(false);
        DiaCor5.setVisible(false);
        DiaCor6.setVisible(false);
        DiaCor7.setVisible(false);
        DiaCor8.setVisible(false);
        DiaCor9.setVisible(false);
        DiaCor10.setVisible(false);
        DiaCor11.setVisible(false);
        DiaCor12.setVisible(false);
        DiaCor13.setVisible(false);
        DiaCor14.setVisible(false);
        DiaCor15.setVisible(false);
        DiaCor16.setVisible(false);
        FillLCIabel.setVisible(false);
        FillLCIabel1.setVisible(false);
        FillLCIabel2.setVisible(false);
        FillLCIabel3.setVisible(false);
        FillLCIabel4.setVisible(false);
        FillLCIabel5.setVisible(false);
        FillLCIabel6.setVisible(false);
        FillLCIabel7.setVisible(false);
        FillLCIabel8.setVisible(false);
        FillLCIabel9.setVisible(false);
        FillLCIAm.setVisible(false);
        FillLCIAm1.setVisible(false);
        FillLCIAm2.setVisible(false);
        FillLCIAm3.setVisible(false);
        FillLCIAm4.setVisible(false);
        FillLCIAm5.setVisible(false);
        FillLCIAm6.setVisible(false);
        FillLCIAm7.setVisible(false);
        FillLCIAm8.setVisible(false);
        FillLCIAm9.setVisible(false);
        FillLCIAp.setVisible(false);
        FillLCIAp1.setVisible(false);
        FillLCIAp2.setVisible(false);
        FillLCIAp3.setVisible(false);
        FillLCIAp4.setVisible(false);
        FillLCIAp5.setVisible(false);
        FillLCIAp6.setVisible(false);
        FillLCIAp7.setVisible(false);
        FillLCIAp8.setVisible(false);
        FillLCIAp9.setVisible(false);
        FillLCIName.setVisible(false);
        FillLCIName1.setVisible(false);
        FillLCIName2.setVisible(false);
        FillLCIName3.setVisible(false);
        FillLCIName4.setVisible(false);
        FillLCIName5.setVisible(false);
        FillLCIName6.setVisible(false);
        FillLCIName7.setVisible(false);
        FillLCIName8.setVisible(false);
        FillLCIName9.setVisible(false);
        FillLCIQuin.setVisible(false);
        FillLCIQuin1.setVisible(false);
        FillLCIQuin2.setVisible(false);
        FillLCIQuin3.setVisible(false);
        FillLCIQuin4.setVisible(false);
        FillLCIQuin5.setVisible(false);
        FillLCIQuin6.setVisible(false);
        FillLCIQuin7.setVisible(false);
        FillLCIQuin8.setVisible(false);
        FillLCIQuin9.setVisible(false);
        DiaCom1.setVisible(false);
        DiaCom2.setVisible(false);
        DiaCom3.setVisible(false);
        DiaCom4.setVisible(false);
        DiaCom5.setVisible(false);
        DiaCom6.setVisible(false);
        DiaCom7.setVisible(false);
        DiaCom8.setVisible(false);
        DiaCom9.setVisible(false);
        DiaCom10.setVisible(false);
        DiaCom11.setVisible(false);
        DiaCom12.setVisible(false);
        DiaCom13.setVisible(false);
        DiaCom14.setVisible(false);
        DiaCom15.setVisible(false);
        DiaCom16.setVisible(false);

// </editor-fold>
        MDLDA();
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(Listas_CI_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
    }

    public Listas_CI_5(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        FiltrosZonas xd = new FiltrosZonas();
        DefaultComboBoxModel modelzonass = new DefaultComboBoxModel(xd.mostrarzonas());
        FilZona.setModel(modelzonass);
        SHempleados();
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        Fecha1.setVisible(false);
        LabelFil.setVisible(false);
        LDAfilap.setVisible(false);
        LDAfilam.setVisible(false);
        LDAfilname.setVisible(false);
        DiaCor1.setVisible(false);
        DiaCor2.setVisible(false);
        DiaCor3.setVisible(false);
        DiaCor4.setVisible(false);
        DiaCor5.setVisible(false);
        DiaCor6.setVisible(false);
        DiaCor7.setVisible(false);
        DiaCor8.setVisible(false);
        DiaCor9.setVisible(false);
        DiaCor10.setVisible(false);
        DiaCor11.setVisible(false);
        DiaCor12.setVisible(false);
        DiaCor13.setVisible(false);
        DiaCor14.setVisible(false);
        DiaCor15.setVisible(false);
        DiaCor16.setVisible(false);
        FillLCIabel.setVisible(false);
        FillLCIabel1.setVisible(false);
        FillLCIabel2.setVisible(false);
        FillLCIabel3.setVisible(false);
        FillLCIabel4.setVisible(false);
        FillLCIabel5.setVisible(false);
        FillLCIabel6.setVisible(false);
        FillLCIabel7.setVisible(false);
        FillLCIabel8.setVisible(false);
        FillLCIabel9.setVisible(false);
        FillLCIAm.setVisible(false);
        FillLCIAm1.setVisible(false);
        FillLCIAm2.setVisible(false);
        FillLCIAm3.setVisible(false);
        FillLCIAm4.setVisible(false);
        FillLCIAm5.setVisible(false);
        FillLCIAm6.setVisible(false);
        FillLCIAm7.setVisible(false);
        FillLCIAm8.setVisible(false);
        FillLCIAm9.setVisible(false);
        FillLCIAp.setVisible(false);
        FillLCIAp1.setVisible(false);
        FillLCIAp2.setVisible(false);
        FillLCIAp3.setVisible(false);
        FillLCIAp4.setVisible(false);
        FillLCIAp5.setVisible(false);
        FillLCIAp6.setVisible(false);
        FillLCIAp7.setVisible(false);
        FillLCIAp8.setVisible(false);
        FillLCIAp9.setVisible(false);
        FillLCIName.setVisible(false);
        FillLCIName1.setVisible(false);
        FillLCIName2.setVisible(false);
        FillLCIName3.setVisible(false);
        FillLCIName4.setVisible(false);
        FillLCIName5.setVisible(false);
        FillLCIName6.setVisible(false);
        FillLCIName7.setVisible(false);
        FillLCIName8.setVisible(false);
        FillLCIName9.setVisible(false);
        FillLCIQuin.setVisible(false);
        FillLCIQuin1.setVisible(false);
        FillLCIQuin2.setVisible(false);
        FillLCIQuin3.setVisible(false);
        FillLCIQuin4.setVisible(false);
        FillLCIQuin5.setVisible(false);
        FillLCIQuin6.setVisible(false);
        FillLCIQuin7.setVisible(false);
        FillLCIQuin8.setVisible(false);
        FillLCIQuin9.setVisible(false);
        DiaCom1.setVisible(false);
        DiaCom2.setVisible(false);
        DiaCom3.setVisible(false);
        DiaCom4.setVisible(false);
        DiaCom5.setVisible(false);
        DiaCom6.setVisible(false);
        DiaCom7.setVisible(false);
        DiaCom8.setVisible(false);
        DiaCom9.setVisible(false);
        DiaCom10.setVisible(false);
        DiaCom11.setVisible(false);
        DiaCom12.setVisible(false);
        DiaCom13.setVisible(false);
        DiaCom14.setVisible(false);
        DiaCom15.setVisible(false);
        DiaCom16.setVisible(false);

// </editor-fold>
        MDLDA();
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(Listas_CI_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        setTitle("Listas de asistencia. # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
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
                    //NomDetallada.setVisible(false);
                }
                if (LP.getP6() == 0) {
                    //NomPagos.setVisible(false);
                }
                if (LP.getP7() == 0) {
                    PRES.setVisible(false);
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LDAQuin = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LDAAp = new javax.swing.JTextField();
        LDAAm = new javax.swing.JTextField();
        LDAName = new javax.swing.JTextField();
        LDA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmpleadosSh = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        LDAfil = new javax.swing.JComboBox<>();
        LabelFil = new javax.swing.JLabel();
        LDAfilname = new javax.swing.JTextField();
        LDAfilap = new javax.swing.JTextField();
        LDAfilam = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LDAZon = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        ULDA = new javax.swing.JLabel();
        NYear = new javax.swing.JCheckBox();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        FillLCI = new javax.swing.JComboBox<>();
        FillLCIabel = new javax.swing.JLabel();
        FillLCIAp = new javax.swing.JTextField();
        FillLCIAm = new javax.swing.JTextField();
        FillLCIName = new javax.swing.JTextField();
        FillLCIQuin = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        TableLDACI = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        FillLCI1 = new javax.swing.JComboBox<>();
        FillLCIabel1 = new javax.swing.JLabel();
        FillLCIAp1 = new javax.swing.JTextField();
        FillLCIAm1 = new javax.swing.JTextField();
        FillLCIName1 = new javax.swing.JTextField();
        FillLCIQuin1 = new javax.swing.JComboBox<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        TableLDACI1 = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        FillLCI2 = new javax.swing.JComboBox<>();
        FillLCIabel2 = new javax.swing.JLabel();
        FillLCIAp2 = new javax.swing.JTextField();
        FillLCIAm2 = new javax.swing.JTextField();
        FillLCIName2 = new javax.swing.JTextField();
        FillLCIQuin2 = new javax.swing.JComboBox<>();
        jScrollPane11 = new javax.swing.JScrollPane();
        TableLDACI2 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        FillLCI3 = new javax.swing.JComboBox<>();
        FillLCIabel3 = new javax.swing.JLabel();
        FillLCIAp3 = new javax.swing.JTextField();
        FillLCIAm3 = new javax.swing.JTextField();
        FillLCIName3 = new javax.swing.JTextField();
        FillLCIQuin3 = new javax.swing.JComboBox<>();
        jScrollPane13 = new javax.swing.JScrollPane();
        TableLDACI3 = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        FillLCI4 = new javax.swing.JComboBox<>();
        FillLCIabel4 = new javax.swing.JLabel();
        FillLCIAp4 = new javax.swing.JTextField();
        FillLCIAm4 = new javax.swing.JTextField();
        FillLCIName4 = new javax.swing.JTextField();
        FillLCIQuin4 = new javax.swing.JComboBox<>();
        jScrollPane15 = new javax.swing.JScrollPane();
        TableLDACI4 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        FillLCI5 = new javax.swing.JComboBox<>();
        FillLCIabel5 = new javax.swing.JLabel();
        FillLCIAp5 = new javax.swing.JTextField();
        FillLCIAm5 = new javax.swing.JTextField();
        FillLCIName5 = new javax.swing.JTextField();
        FillLCIQuin5 = new javax.swing.JComboBox<>();
        jScrollPane17 = new javax.swing.JScrollPane();
        TableLDACI5 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        FillLCI6 = new javax.swing.JComboBox<>();
        FillLCIabel6 = new javax.swing.JLabel();
        FillLCIAp6 = new javax.swing.JTextField();
        FillLCIAm6 = new javax.swing.JTextField();
        FillLCIName6 = new javax.swing.JTextField();
        FillLCIQuin6 = new javax.swing.JComboBox<>();
        jScrollPane19 = new javax.swing.JScrollPane();
        TableLDACI6 = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        FillLCI7 = new javax.swing.JComboBox<>();
        FillLCIabel7 = new javax.swing.JLabel();
        FillLCIAp7 = new javax.swing.JTextField();
        FillLCIAm7 = new javax.swing.JTextField();
        FillLCIName7 = new javax.swing.JTextField();
        FillLCIQuin7 = new javax.swing.JComboBox<>();
        jScrollPane21 = new javax.swing.JScrollPane();
        TableLDACI7 = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        FillLCI8 = new javax.swing.JComboBox<>();
        FillLCIabel8 = new javax.swing.JLabel();
        FillLCIAp8 = new javax.swing.JTextField();
        FillLCIAm8 = new javax.swing.JTextField();
        FillLCIName8 = new javax.swing.JTextField();
        FillLCIQuin8 = new javax.swing.JComboBox<>();
        jScrollPane23 = new javax.swing.JScrollPane();
        TableLDACI8 = new javax.swing.JTable();
        jScrollPane24 = new javax.swing.JScrollPane();
        jPanel11 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        FillLCI9 = new javax.swing.JComboBox<>();
        FillLCIabel9 = new javax.swing.JLabel();
        FillLCIAp9 = new javax.swing.JTextField();
        FillLCIAm9 = new javax.swing.JTextField();
        FillLCIName9 = new javax.swing.JTextField();
        FillLCIQuin9 = new javax.swing.JComboBox<>();
        jScrollPane25 = new javax.swing.JScrollPane();
        TableLDACI9 = new javax.swing.JTable();
        DiaCor1 = new com.toedter.calendar.JDateChooser();
        DiaCor2 = new com.toedter.calendar.JDateChooser();
        DiaCor3 = new com.toedter.calendar.JDateChooser();
        DiaCor4 = new com.toedter.calendar.JDateChooser();
        DiaCor5 = new com.toedter.calendar.JDateChooser();
        DiaCor6 = new com.toedter.calendar.JDateChooser();
        DiaCor7 = new com.toedter.calendar.JDateChooser();
        DiaCor8 = new com.toedter.calendar.JDateChooser();
        DiaCor9 = new com.toedter.calendar.JDateChooser();
        DiaCor10 = new com.toedter.calendar.JDateChooser();
        DiaCor11 = new com.toedter.calendar.JDateChooser();
        DiaCor12 = new com.toedter.calendar.JDateChooser();
        DiaCor13 = new com.toedter.calendar.JDateChooser();
        DiaCor14 = new com.toedter.calendar.JDateChooser();
        DiaCor15 = new com.toedter.calendar.JDateChooser();
        DiaCor16 = new com.toedter.calendar.JDateChooser();
        DiaCom1 = new com.toedter.calendar.JDateChooser();
        DiaCom2 = new com.toedter.calendar.JDateChooser();
        DiaCom3 = new com.toedter.calendar.JDateChooser();
        DiaCom4 = new com.toedter.calendar.JDateChooser();
        DiaCom5 = new com.toedter.calendar.JDateChooser();
        DiaCom6 = new com.toedter.calendar.JDateChooser();
        DiaCom7 = new com.toedter.calendar.JDateChooser();
        DiaCom8 = new com.toedter.calendar.JDateChooser();
        DiaCom9 = new com.toedter.calendar.JDateChooser();
        DiaCom10 = new com.toedter.calendar.JDateChooser();
        DiaCom11 = new com.toedter.calendar.JDateChooser();
        DiaCom12 = new com.toedter.calendar.JDateChooser();
        DiaCom13 = new com.toedter.calendar.JDateChooser();
        DiaCom14 = new com.toedter.calendar.JDateChooser();
        DiaCom15 = new com.toedter.calendar.JDateChooser();
        DiaCom16 = new com.toedter.calendar.JDateChooser();
        ExcelCI = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        FilZona = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        ODT1 = new javax.swing.JMenuItem();
        CNQ = new javax.swing.JMenuItem();
        PRESQ = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        CDA1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        General = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        Depositos = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        ADMV2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        Nomsem = new javax.swing.JMenuItem();
        NomSemGen = new javax.swing.JMenuItem();
        PresSem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        PRES = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        LDA1 = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listas de asistencia");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("LISTA DE ASISTENCIA C/IMSS");

        jLabel1.setText("Quincena:");

        LDAQuin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Quincena", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        LDAQuin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LDAQuinItemStateChanged(evt);
            }
        });

        jLabel3.setText("Fecha:");

        jLabel4.setText("Nombre(s):");

        Fecha1.setDateFormatString("y");

        jLabel5.setText("Apellido P:");

        jLabel6.setText("Apellido M:");

        LDAAp.setEnabled(false);

        LDAAm.setEnabled(false);

        LDAName.setEnabled(false);

        LDA.setEditable(false);
        LDA.setText("0");

        jLabel8.setText("# Lista");

        EmpleadosSh.setModel(new javax.swing.table.DefaultTableModel(
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
        EmpleadosSh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpleadosShMouseClicked(evt);
            }
        });
        EmpleadosSh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                EmpleadosShKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(EmpleadosSh);

        jLabel9.setText("Filtrar por:");

        LDAfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        LDAfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LDAfilItemStateChanged(evt);
            }
        });

        LabelFil.setText("jLabel10");

        LDAfilname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LDAfilnameKeyReleased(evt);
            }
        });

        LDAfilap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LDAfilapKeyReleased(evt);
            }
        });

        LDAfilam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LDAfilamKeyReleased(evt);
            }
        });

        jLabel7.setText("Zona");

        LDAZon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LDAZonKeyReleased(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel11.setText("Ultima lista registrada:");

        ULDA.setText("0");

        NYear.setText("Año nuevo");
        NYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NYearActionPerformed(evt);
            }
        });

        jScrollPane3.setBackground(new java.awt.Color(204, 255, 204));

        jScrollPane5.setBackground(new java.awt.Color(204, 255, 204));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel10.setText("Filtro:");

        FillLCI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIItemStateChanged(evt);
            }
        });

        FillLCIabel.setText("jLabel12");

        FillLCIAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIApKeyReleased(evt);
            }
        });

        FillLCIAm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAmKeyReleased(evt);
            }
        });

        FillLCIName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCINameKeyReleased(evt);
            }
        });

        FillLCIQuin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuinItemStateChanged(evt);
            }
        });

        TableLDACI.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACIMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(TableLDACI);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(FillLCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel)
                    .addComponent(FillLCIAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane5.setViewportView(jPanel2);

        jTabbedPane3.addTab("Foraneos acapulco", jScrollPane5);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel13.setText("Filtro:");

        FillLCI1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI1ItemStateChanged(evt);
            }
        });

        FillLCIabel1.setText("jLabel12");

        FillLCIAp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp1KeyReleased(evt);
            }
        });

        FillLCIAm1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm1KeyReleased(evt);
            }
        });

        FillLCIName1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName1KeyReleased(evt);
            }
        });

        FillLCIQuin1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuin1ItemStateChanged(evt);
            }
        });

        TableLDACI1.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableLDACI1KeyReleased(evt);
            }
        });
        jScrollPane9.setViewportView(TableLDACI1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(FillLCI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel1)
                    .addComponent(FillLCIAp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane8.setViewportView(jPanel3);

        jTabbedPane3.addTab("Foraneos puebla", jScrollPane8);

        jPanel4.setBackground(new java.awt.Color(204, 255, 204));

        jLabel15.setText("Filtro:");

        FillLCI2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI2ItemStateChanged(evt);
            }
        });

        FillLCIabel2.setText("jLabel12");

        FillLCIAp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp2KeyReleased(evt);
            }
        });

        FillLCIAm2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm2KeyReleased(evt);
            }
        });

        FillLCIName2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName2KeyReleased(evt);
            }
        });

        FillLCIQuin2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIQuin2KeyReleased(evt);
            }
        });

        TableLDACI2.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI2MouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(TableLDACI2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(FillLCI2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel2)
                    .addComponent(FillLCIAp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane10.setViewportView(jPanel4);

        jTabbedPane3.addTab("Foraneos toluca", jScrollPane10);

        jLabel17.setText("Filtro:");

        FillLCI3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI3ItemStateChanged(evt);
            }
        });

        FillLCIabel3.setText("jLabel12");

        FillLCIAp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp3KeyReleased(evt);
            }
        });

        FillLCIAm3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm3KeyReleased(evt);
            }
        });

        FillLCIName3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName3KeyReleased(evt);
            }
        });

        FillLCIQuin3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuin3ItemStateChanged(evt);
            }
        });

        TableLDACI3.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI3MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(TableLDACI3);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(FillLCI3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel3)
                    .addComponent(FillLCIAp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane12.setViewportView(jPanel5);

        jTabbedPane3.addTab("Norte", jScrollPane12);

        jLabel19.setText("Filtro:");

        FillLCI4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI4ItemStateChanged(evt);
            }
        });

        FillLCIabel4.setText("jLabel12");

        FillLCIAp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp4KeyReleased(evt);
            }
        });

        FillLCIAm4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm4KeyReleased(evt);
            }
        });

        FillLCIName4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FillLCIName4KeyTyped(evt);
            }
        });

        FillLCIQuin4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuin4ItemStateChanged(evt);
            }
        });

        TableLDACI4.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI4MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(TableLDACI4);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(FillLCI4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel4)
                    .addComponent(FillLCIAp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane14.setViewportView(jPanel6);

        jTabbedPane3.addTab("Oficina", jScrollPane14);

        jLabel21.setText("Filtro:");

        FillLCI5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI5ItemStateChanged(evt);
            }
        });

        FillLCIabel5.setText("jLabel12");

        FillLCIAp5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp5KeyReleased(evt);
            }
        });

        FillLCIAm5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm5KeyReleased(evt);
            }
        });

        FillLCIName5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName5KeyReleased(evt);
            }
        });

        FillLCIQuin5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIQuin5KeyReleased(evt);
            }
        });

        TableLDACI5.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI5MouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(TableLDACI5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(FillLCI5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel5)
                    .addComponent(FillLCIAp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane16.setViewportView(jPanel7);

        jTabbedPane3.addTab("Poniente", jScrollPane16);

        jLabel23.setText("Filtro:");

        FillLCI6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI6ItemStateChanged(evt);
            }
        });

        FillLCIabel6.setText("jLabel12");

        FillLCIAp6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp6KeyReleased(evt);
            }
        });

        FillLCIAm6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm6KeyReleased(evt);
            }
        });

        FillLCIName6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName6KeyReleased(evt);
            }
        });

        FillLCIQuin6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuin6ItemStateChanged(evt);
            }
        });

        TableLDACI6.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI6MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(TableLDACI6);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(FillLCI6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel6)
                    .addComponent(FillLCIAp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane18.setViewportView(jPanel8);

        jTabbedPane3.addTab("Sur 1", jScrollPane18);

        jLabel25.setText("Filtro:");

        FillLCI7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI7ItemStateChanged(evt);
            }
        });

        FillLCIabel7.setText("jLabel12");

        FillLCIAp7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp7KeyReleased(evt);
            }
        });

        FillLCIAm7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm7KeyReleased(evt);
            }
        });

        FillLCIName7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName7KeyReleased(evt);
            }
        });

        FillLCIQuin7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuin7ItemStateChanged(evt);
            }
        });

        TableLDACI7.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI7MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(TableLDACI7);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(FillLCI7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel7)
                    .addComponent(FillLCIAp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane20.setViewportView(jPanel9);

        jTabbedPane3.addTab("Sur 2", jScrollPane20);

        jLabel27.setText("Filtro:");

        FillLCI8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI8ItemStateChanged(evt);
            }
        });

        FillLCIabel8.setText("jLabel12");

        FillLCIAp8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp8KeyReleased(evt);
            }
        });

        FillLCIAm8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm8KeyReleased(evt);
            }
        });

        FillLCIName8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName8KeyReleased(evt);
            }
        });

        FillLCIQuin8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIQuin8KeyReleased(evt);
            }
        });

        TableLDACI8.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI8MouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(TableLDACI8);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(FillLCI8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel8)
                    .addComponent(FillLCIAp8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane22.setViewportView(jPanel10);

        jTabbedPane3.addTab("Santander Quincenal", jScrollPane22);

        jLabel29.setText("Filtro:");

        FillLCI9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "Apellido P", "Apellido M", "Nombre(s)", "Quincenas" }));
        FillLCI9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCI9ItemStateChanged(evt);
            }
        });

        FillLCIabel9.setText("jLabel12");

        FillLCIAp9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAp9KeyReleased(evt);
            }
        });

        FillLCIAm9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIAm9KeyReleased(evt);
            }
        });

        FillLCIName9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FillLCIName9KeyReleased(evt);
            }
        });

        FillLCIQuin9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FillLCIQuin9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FillLCIQuin9ItemStateChanged(evt);
            }
        });

        TableLDACI9.setModel(new javax.swing.table.DefaultTableModel(
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
        TableLDACI9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLDACI9MouseClicked(evt);
            }
        });
        jScrollPane25.setViewportView(TableLDACI9);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCI9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAp9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIAm9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIName9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FillLCIQuin9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(FillLCI9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIabel9)
                    .addComponent(FillLCIAp9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIAm9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIName9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FillLCIQuin9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane24.setViewportView(jPanel11);

        jTabbedPane3.addTab("Santander Semanal", jScrollPane24);

        jScrollPane3.setViewportView(jTabbedPane3);

        jTabbedPane1.addTab("Listas con IMSS", jScrollPane3);

        DiaCor1.setDateFormatString("d");

        DiaCor2.setDateFormatString("d");

        DiaCor3.setDateFormatString("d");

        DiaCor4.setDateFormatString("d");

        DiaCor5.setDateFormatString("d");

        DiaCor6.setDateFormatString("d");

        DiaCor7.setDateFormatString("d");

        DiaCor8.setDateFormatString("d");

        DiaCor9.setDateFormatString("d");

        DiaCor10.setDateFormatString("d");

        DiaCor11.setDateFormatString("d");

        DiaCor12.setDateFormatString("d");

        DiaCor13.setDateFormatString("d");

        DiaCor14.setDateFormatString("d");

        DiaCor15.setDateFormatString("d");

        DiaCor16.setDateFormatString("d");

        DiaCom1.setDateFormatString("EEEE");

        DiaCom2.setDateFormatString("EEEE");

        DiaCom3.setDateFormatString("EEEE");

        DiaCom4.setDateFormatString("EEEE");

        DiaCom5.setDateFormatString("EEEE");

        DiaCom6.setDateFormatString("EEEE");

        DiaCom7.setDateFormatString("EEEE");

        DiaCom8.setDateFormatString("EEEE");

        DiaCom9.setDateFormatString("EEEE");

        DiaCom10.setDateFormatString("EEEE");

        DiaCom11.setDateFormatString("EEEE");

        DiaCom12.setDateFormatString("EEEE");

        DiaCom13.setDateFormatString("EEEE");

        DiaCom14.setDateFormatString("EEEE");

        DiaCom15.setDateFormatString("EEEE");

        DiaCom16.setDateFormatString("EEEE");

        ExcelCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        ExcelCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcelCIActionPerformed(evt);
            }
        });

        jLabel51.setText("Re-imprimir lista:");

        jLabel12.setText("Zona:");

        FilZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FilZona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilZonaItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LDAQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(DiaCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DiaCom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LDAAp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LDAAm, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(LDAName, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Agregar))
                                            .addComponent(jLabel4))
                                        .addGap(228, 228, 228)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ExcelCI)
                                            .addComponent(jLabel51)))
                                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ULDA))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LDA, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LDAZon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel3)
                                        .addGap(110, 110, 110)
                                        .addComponent(NYear))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addComponent(jLabel2)))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LDAfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelFil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LDAfilname, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LDAfilap, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LDAfilam, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FilZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 617, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(LDAfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelFil)
                            .addComponent(LDAfilname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDAfilap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LDAfilam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(FilZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(LDAZon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(ULDA))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NYear)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(LDAQuin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DiaCom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiaCor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(DiaCor15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(DiaCor14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(DiaCor12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(DiaCor10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(DiaCor9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(DiaCom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(DiaCom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(DiaCom4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(DiaCom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(DiaCom6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(DiaCom7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(DiaCor8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(DiaCom8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(DiaCom9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(DiaCom10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(DiaCor11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(DiaCom11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(DiaCom12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(DiaCor13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(DiaCom13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(DiaCom14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DiaCom15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DiaCor16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DiaCom16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LDAAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LDAAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LDAName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Agregar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ExcelCI)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

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

        CNQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CNQ.setText("Nomina IMSS");
        CNQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNQActionPerformed(evt);
            }
        });
        jMenu6.add(CNQ);

        PRESQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRESQ.setText("Prestamos");
        PRESQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESQActionPerformed(evt);
            }
        });
        jMenu6.add(PRESQ);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem7.setText("Nomina General");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem7);

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

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem8.setText("Nomina Semanal IMSS");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem9.setText("Prestamos Semanales");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem9);

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem10.setText("Nomina Semanal General");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenu5.add(jMenu7);

        jMenuItem11.setText("Listas de asistencia");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

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

        jMenuItem12.setText("Inturbide");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem12);

        jMenuItem13.setText("Tehuantepec");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuItem14.setText("PTE titla");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem14);

        jMenu8.add(jMenu9);

        Depositos.setText("Depositos");

        jMenuItem15.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem15.setText("Depositos C/ IMSS");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        Depositos.add(jMenuItem15);

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

        jMenu1.setText("Cambiar a:");

        jMenu3.setText("Semanal");

        Nomsem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Nomsem.setText("Nomina Semanal IMSS");
        Nomsem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomsemActionPerformed(evt);
            }
        });
        jMenu3.add(Nomsem);

        NomSemGen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        NomSemGen.setText("Nomina Semanal General");
        NomSemGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomSemGenActionPerformed(evt);
            }
        });
        jMenu3.add(NomSemGen);

        PresSem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        PresSem.setText("Prestamos Semanales");
        PresSem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PresSemActionPerformed(evt);
            }
        });
        jMenu3.add(PresSem);

        jMenu1.add(jMenu3);

        jMenu2.setText("Nomina quincenal");

        ODT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        ODT.setText("Ordenes de taller");
        ODT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODTActionPerformed(evt);
            }
        });
        jMenu2.add(ODT);

        CDA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA.setText("Caja de ahorro");
        CDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDAActionPerformed(evt);
            }
        });
        jMenu2.add(CDA);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Nomina IMSS");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        PRES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRES.setText("Prestamos");
        PRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESActionPerformed(evt);
            }
        });
        jMenu2.add(PRES);

        jMenuItem24.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem24.setText("Nomina General");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem24);

        jMenu1.add(jMenu2);

        LDA1.setText("Listas de asistencia S/IMSS");
        LDA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LDA1ActionPerformed(evt);
            }
        });
        jMenu1.add(LDA1);

        jMenuBar1.add(jMenu1);

        Reportes.setText("Reportes");

        jMenuItem6.setText("Reportes de nomina");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Reportes.add(jMenuItem6);

        jMenuItem16.setText("Reportes de nomina sem");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        Reportes.add(jMenuItem16);

        jMenuBar1.add(Reportes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void MostrarULDA() {
        String SQL = "SELECT `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'confort2022' AND TABLE_NAME = 'nomina.listas." + LDAZon.getText() + "'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                ULDA.setText("" + (Integer.parseInt(rs.getString("AUTO_INCREMENT")) - 1));
            }
            st.isClosed();
            rs.isClosed();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar ultima lista registrada de " + LDAZon.getText() + ": " + e);

        }

    }

    public void SHempleados() {
        //Buscar empleado
        String Share = LDAfilname.getText();
        String ShareAP = LDAfilap.getText();
        String ShareAM = LDAfilam.getText();
        String SQL = "SELECT `Apellido P`, `Apellido M`, `Nombre(s)`,`Zona`"
                + " FROM `rh.empleados` WHERE `Entra a IMSS` LIKE '%SI%' AND `Zona`"
                + " LIKE '%" + FilZona.getSelectedItem().toString() + "%' AND `Status` LIKE '%VIGENTE%'";

        if (!"".equals(Share)) {
            SQL = "SELECT `Apellido P`, `Apellido M`, `Nombre(s)`,`Zona` FROM "
                    + "`rh.empleados` WHERE `Entra a IMSS` LIKE '%SI%' AND `Nombre(s)` LIKE '%" + Share + "%' AND "
                    + "`Zona` LIKE '%" + FilZona.getSelectedItem().toString() + "%' AND `Status` LIKE '%VIGENTE%'";
        } else if (!"".equals(ShareAP)) {
            SQL = "SELECT `Apellido P`, `Apellido M`, `Nombre(s)`,`Zona` FROM "
                    + "`rh.empleados` WHERE `Entra a IMSS` LIKE '%SI%' AND `Apellido P` LIKE '%" + ShareAP + "%' AND "
                    + "`Zona` LIKE '%" + FilZona.getSelectedItem().toString() + "%' AND `Status` LIKE '%VIGENTE%'";
        } else if (!"".equals(ShareAM)) {
            SQL = "SELECT `Apellido P`, `Apellido M`, `Nombre(s)`,`Zona` FROM "
                    + "`rh.empleados` WHERE `Entra a IMSS` LIKE '%SI%' AND `Apellido M` LIKE '%" + ShareAM + "%' AND "
                    + "`Zona` LIKE '%" + FilZona.getSelectedItem().toString() + "%' AND `Status` LIKE '%VIGENTE%'";
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
            EmpleadosSh.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Zona");

//Anchos
            int[] anchos = {50, 50, 100, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                EmpleadosSh.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con Listas de asistencia: " + ex.getMessage());

        }

    }

    public void AgregarLDA() {
        String SQL = "INSERT INTO `nomina.listas." + LDAZon.getText() + "` "
                + "(`NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                + "`dd 1/16`, `dd 2/17`, `dd 3/18`, `dd 4/19`, `dd 5/20`, `dd 6/21`, `dd 7/22`,"
                + " `dd 8/23`, `dd 9/24`, `dd 10/25`, `dd 11/26`, `dd 12/27`, `dd 13/28`, `dd 14/29`,"
                + " `dd 15/30`, `dd 31`, `EEEE 1/16`, `EEEE 2/17`, `EEEE 3/18`, `EEEE 4/19`, `EEEE 5/20`,"
                + " `EEEE 6/21`, `EEEE 7/22`, `EEEE 8/23`, `EEEE 9/24`, `EEEE 10/25`, `EEEE 11/26`, `EEEE 12/27`,"
                + " `EEEE 13/28`, `EEEE 14/29`, `EEEE 15/30`, `EEEE 31`, `y 1/16`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, Integer.parseInt(LDA.getText()));
            pst.setString(2, LDAZon.getText());
            pst.setString(3, LDAQuin.getSelectedItem().toString());
            pst.setString(4, LDAAp.getText());
            pst.setString(5, LDAAm.getText());
            pst.setString(6, LDAName.getText());
            pst.setString(7, ((JTextField) DiaCor1.getDateEditor().getUiComponent()).getText());
            pst.setString(8, ((JTextField) DiaCor2.getDateEditor().getUiComponent()).getText());
            pst.setString(9, ((JTextField) DiaCor3.getDateEditor().getUiComponent()).getText());
            pst.setString(10, ((JTextField) DiaCor4.getDateEditor().getUiComponent()).getText());
            pst.setString(11, ((JTextField) DiaCor5.getDateEditor().getUiComponent()).getText());
            pst.setString(12, ((JTextField) DiaCor6.getDateEditor().getUiComponent()).getText());
            pst.setString(13, ((JTextField) DiaCor7.getDateEditor().getUiComponent()).getText());
            pst.setString(14, ((JTextField) DiaCor8.getDateEditor().getUiComponent()).getText());
            pst.setString(15, ((JTextField) DiaCor9.getDateEditor().getUiComponent()).getText());
            pst.setString(16, ((JTextField) DiaCor10.getDateEditor().getUiComponent()).getText());
            pst.setString(17, ((JTextField) DiaCor11.getDateEditor().getUiComponent()).getText());
            pst.setString(18, ((JTextField) DiaCor12.getDateEditor().getUiComponent()).getText());
            pst.setString(19, ((JTextField) DiaCor13.getDateEditor().getUiComponent()).getText());
            pst.setString(20, ((JTextField) DiaCor14.getDateEditor().getUiComponent()).getText());
            pst.setString(21, ((JTextField) DiaCor15.getDateEditor().getUiComponent()).getText());
            pst.setString(22, ((JTextField) DiaCor16.getDateEditor().getUiComponent()).getText());
            pst.setString(23, ((JTextField) DiaCom1.getDateEditor().getUiComponent()).getText());
            pst.setString(24, ((JTextField) DiaCom2.getDateEditor().getUiComponent()).getText());
            pst.setString(25, ((JTextField) DiaCom3.getDateEditor().getUiComponent()).getText());
            pst.setString(26, ((JTextField) DiaCom4.getDateEditor().getUiComponent()).getText());
            pst.setString(27, ((JTextField) DiaCom5.getDateEditor().getUiComponent()).getText());
            pst.setString(28, ((JTextField) DiaCom6.getDateEditor().getUiComponent()).getText());
            pst.setString(29, ((JTextField) DiaCom7.getDateEditor().getUiComponent()).getText());
            pst.setString(30, ((JTextField) DiaCom8.getDateEditor().getUiComponent()).getText());
            pst.setString(31, ((JTextField) DiaCom9.getDateEditor().getUiComponent()).getText());
            pst.setString(32, ((JTextField) DiaCom10.getDateEditor().getUiComponent()).getText());
            pst.setString(33, ((JTextField) DiaCom11.getDateEditor().getUiComponent()).getText());
            pst.setString(34, ((JTextField) DiaCom12.getDateEditor().getUiComponent()).getText());
            pst.setString(35, ((JTextField) DiaCom13.getDateEditor().getUiComponent()).getText());
            pst.setString(36, ((JTextField) DiaCom14.getDateEditor().getUiComponent()).getText());
            pst.setString(37, ((JTextField) DiaCom15.getDateEditor().getUiComponent()).getText());
            pst.setString(38, ((JTextField) DiaCom16.getDateEditor().getUiComponent()).getText());
            pst.setString(39, ((JTextField) Fecha1.getDateEditor().getUiComponent()).getText());

            pst.executeUpdate();

            MostrarULDA();

            pst.isClosed();

            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
            chooser.setSelectedFile(new File("Lista de la " + LDAQuin.getSelectedItem().toString() + " de " + LDAZon.getText() + " de "
                    + LDAAp.getText() + " " + " " + LDAAm.getText() + " " + LDAName.getText()));
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                String ruta = chooser.getSelectedFile().toString().concat(".xlsx"); //extención del archivo excel
            }
            try {
                String ruta = chooser.getSelectedFile().toString().concat(".xlsx");
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection(
                        "jdbc:mysql://192.168.1.170:3306/confort2022",
                        "Servidor",
                        "Confort1022"
                );

                Statement statement = connect.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM `nomina.listas." + LDAZon.getText() + "` WHERE " + ULDA.getText());
                try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                    XSSFWorkbook libro = new XSSFWorkbook();
                    XSSFSheet spreadsheet = libro.createSheet(("Lista"));

                    XSSFRow row = spreadsheet.createRow((short) 0);
                    XSSFCell cell = (XSSFCell) row.createCell((short) 0);

                    XSSFCellStyle Encabezado = libro.createCellStyle();
                    Encabezado.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                    Encabezado.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

                    XSSFCellStyle Stilodd = libro.createCellStyle();

                    Stilodd.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                    Stilodd.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                    Stilodd.setBorderTop(XSSFCellStyle.BORDER_THIN);
                    Stilodd.setAlignment(XSSFCellStyle.ALIGN_CENTER_SELECTION);
                    Stilodd.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                    XSSFCellStyle StiloEEEE = libro.createCellStyle();

                    StiloEEEE.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                    StiloEEEE.setBorderRight(XSSFCellStyle.BORDER_THIN);
                    StiloEEEE.setBorderTop(XSSFCellStyle.BORDER_THIN);
                    StiloEEEE.setAlignment(XSSFCellStyle.ALIGN_JUSTIFY);
                    StiloEEEE.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                    XSSFCellStyle Contenido = libro.createCellStyle();
                    Contenido.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                    Contenido.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
                    Contenido.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                    Contenido.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                    Contenido.setBorderRight(XSSFCellStyle.BORDER_THIN);
                    Contenido.setBorderTop(XSSFCellStyle.BORDER_THIN);

                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    0, //first row (0-based)
                                    0, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(1);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    1, //first row (0-based)
                                    1, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
//quincena etc mañana
                    row = spreadsheet.createRow(4);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    4, //first row (0-based)
                                    4, //last row (0-based)
                                    0, //first column (0-based)
                                    1 //last column (0-based)
                            )
                    );
                    row.setHeight((short) 500);
                    cell = row.createCell(0);
                    spreadsheet.setColumnWidth(0, 750);
                    cell.setCellValue("Fecha");
                    cell.setCellStyle(Contenido);

                    spreadsheet.setColumnWidth(1, 2500);
                    cell = row.createCell(1);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(2);
                    spreadsheet.setColumnWidth(2, 9500);
                    cell.setCellValue("Nombre completo");
                    cell.setCellStyle(Contenido);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    4, //first row (0-based)
                                    4, //last row (0-based)
                                    1, //first column (0-based)
                                    3 //last column (0-based)
                            )
                    );
                    cell = row.createCell(3);
                    cell.setCellValue("Entrada");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue("Salida");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    spreadsheet.setColumnWidth(5, 5000);
                    cell.setCellValue("Firma");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    spreadsheet.setColumnWidth(6, 5000);
                    cell.setCellValue("Lugar");

                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    spreadsheet.setColumnWidth(7, 1800);
                    cell.setCellValue("Doble");

                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    spreadsheet.setColumnWidth(8, 5650);
                    cell.setCellValue("Observaciones");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    4, //first row (0-based)
                                    4, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    //  int i = 2;
                    while (resultSet.next()) {
                        row = spreadsheet.createRow(2);
                        row.setHeight((short) 400);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getString("Quincena") + " " + resultSet.getString("y 1/16"));
                        cell.setCellStyle(Contenido);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        2, //first row (0-based)
                                        2, //last row (0-based)
                                        0, //first column (0-based)
                                        2 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        2, //first row (0-based)
                                        2, //last row (0-based)
                                        4, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(4);
                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell.setCellStyle(Encabezado);

                        cell = row.createCell(5);
                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell = row.createCell(6);
                        cell.setCellStyle(Encabezado);

                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell.setCellStyle(Encabezado);

                        cell = row.createCell(7);
                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell.setCellStyle(Encabezado);

                        cell = row.createCell(8);
                        cell.setCellValue(resultSet.getString("Zona"));
                        spreadsheet.setColumnWidth(8, 4250);
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(9);
                        spreadsheet.setColumnWidth(9, 1500);
                        cell.setCellValue(resultSet.getInt("NDL"));
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(5);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellStyle(Stilodd);
                        cell.setCellValue(resultSet.getInt("dd 1/16"));
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 1/16"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        5, //first row (0-based)
                                        5, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(6);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 2/17"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 2/17"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        6, //first row (0-based)
                                        6, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(7);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 3/18"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 3/18"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        7, //first row (0-based)
                                        7, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(8);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 4/19"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 4/19"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        8, //first row (0-based)
                                        8, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(9);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 5/20"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 5/20"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        9, //first row (0-based)
                                        9, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(10);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 6/21"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 6/21"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        10, //first row (0-based)
                                        10, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(11);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 7/22"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 7/22"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        11, //first row (0-based)
                                        11, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(12);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 8/23"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 8/23"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        12, //first row (0-based)
                                        12, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(13);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 9/24"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 9/24"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        13, //first row (0-based)
                                        13, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(14);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 10/25"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 10/25"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        14, //first row (0-based)
                                        14, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(15);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 11/26"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 11/26"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        15, //first row (0-based)
                                        15, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(16);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 12/27"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 12/27"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        16, //first row (0-based)
                                        16, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(17);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 13/28"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 13/28"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        17, //first row (0-based)
                                        17, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(18);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 14/29"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 14/29"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        18, //first row (0-based)
                                        18, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(19);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 15/30"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 15/30"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        19, //first row (0-based)
                                        19, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(20);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getString("dd 31"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 31"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        20, //first row (0-based)
                                        20, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                    }
                    spreadsheet.getPrintSetup();
                    spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                    spreadsheet.getPrintSetup().setLandscape(true); // Dirección de impresión, true: horizontal, false: vertical
                    spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.49); // Margen (abajo)  
                    spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                    spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                    spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.1); // Margen (arriba)
                    spreadsheet.setMargin(HSSFSheet.FooterMargin, (double) 0.1);
                    spreadsheet.setMargin(HSSFSheet.HeaderMargin, (double) 0.1);

                    spreadsheet.setHorizontallyCenter(true); // Establecer la página impresa para que se centre horizontalmente
                    libro.write(archivo);
                }
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {

                try {
                    throw e;
                } catch (IOException | NumberFormatException ex) {
                    Logger.getLogger(Listas_CI_5.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Listas_CI_5.class.getName()).log(Level.SEVERE, null, ex);
            }

            LDAZon.setText("");
            LDAQuin.setSelectedIndex(0);
            LDAAp.setText("");
            LDAAm.setText("");
            LDAName.setText("");
            Fecha1.setDate(null);
            DiaCor1.setDate(null);
            DiaCor2.setDate(null);
            DiaCor3.setDate(null);
            DiaCor4.setDate(null);
            DiaCor5.setDate(null);
            DiaCor6.setDate(null);
            DiaCor7.setDate(null);
            DiaCor8.setDate(null);
            DiaCor9.setDate(null);
            DiaCor10.setDate(null);
            DiaCor11.setDate(null);
            DiaCor12.setDate(null);
            DiaCor13.setDate(null);
            DiaCor14.setDate(null);
            DiaCor15.setDate(null);
            DiaCor16.setDate(null);

            DiaCom1.setDate(null);
            DiaCom2.setDate(null);
            DiaCom3.setDate(null);
            DiaCom4.setDate(null);
            DiaCom5.setDate(null);
            DiaCom6.setDate(null);
            DiaCom7.setDate(null);
            DiaCom8.setDate(null);
            DiaCom9.setDate(null);
            DiaCom10.setDate(null);
            DiaCom11.setDate(null);
            DiaCom12.setDate(null);
            DiaCom13.setDate(null);
            DiaCom14.setDate(null);
            DiaCom15.setDate(null);
            DiaCom16.setDate(null);

            JOptionPane.showMessageDialog(null, "Lista de asistencia registrada.");

        } catch (SQLException error_AddLDA) {
            JOptionPane.showMessageDialog(null, "Error al registrar lista de asistencia: " + error_AddLDA);
        }

    }

    public void MDLDA() {
        String FiltroN = FillLCIName.getText();
        String FAP = FillLCIAp.getText();
        String FAM = FillLCIAm.getText();
        String FQuin = FillLCIQuin.getSelectedItem().toString();
        String SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos acapulco`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos acapulco`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos acapulco`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos acapulco`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos acapulco`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de acapulco: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName1.getText();
        FAP = FillLCIAp1.getText();
        FAM = FillLCIAm1.getText();
        FQuin = FillLCIQuin1.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos puebla`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos puebla`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos puebla`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos puebla`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos puebla`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de puebla: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName2.getText();
        FAP = FillLCIAp2.getText();
        FAM = FillLCIAm2.getText();
        FQuin = FillLCIQuin2.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos toluca`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos toluca`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos toluca`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos toluca`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.foraneos toluca`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI2.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de toluca: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName3.getText();
        FAP = FillLCIAp3.getText();
        FAM = FillLCIAm3.getText();
        FQuin = FillLCIQuin3.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.norte`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.norte`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.norte`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.norte`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.norte`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI3.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI3.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de norte: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName4.getText();
        FAP = FillLCIAp4.getText();
        FAM = FillLCIAm4.getText();
        FQuin = FillLCIQuin4.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.oficina`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.oficina`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.oficina`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.oficina`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.oficina`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI4.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI4.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de oficina: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName5.getText();
        FAP = FillLCIAp5.getText();
        FAM = FillLCIAm5.getText();
        FQuin = FillLCIQuin5.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.poniente`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.poniente`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.poniente`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.poniente`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.poniente`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI5.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//5
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI5.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de poniente: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName6.getText();
        FAP = FillLCIAp6.getText();
        FAM = FillLCIAm6.getText();
        FQuin = FillLCIQuin6.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 1`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 1`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 1`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 1`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 1`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI6.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//6
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI6.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de sur 1: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName7.getText();
        FAP = FillLCIAp7.getText();
        FAM = FillLCIAm7.getText();
        FQuin = FillLCIQuin7.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 2`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 2`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 2`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 2`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.sur 2`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI7.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//7
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//7

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI7.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de sur 2: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName8.getText();
        FAP = FillLCIAp8.getText();
        FAM = FillLCIAm8.getText();
        FQuin = FillLCIQuin8.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander quincenal`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander quincenal`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander quincenal`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander quincenal`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander quincenal`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI8.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//8
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//8

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI8.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de corporativo santander quincenal: " + error_mostrsr_pcda.getMessage());

        }

        FiltroN = FillLCIName9.getText();
        FAP = FillLCIAp9.getText();
        FAM = FillLCIAm9.getText();
        FQuin = FillLCIQuin9.getSelectedItem().toString();
        SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander semanal`";

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander semanal`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander semanal`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander semanal`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        } else if (!"".equals(FQuin)) {
            SQL = "SELECT `NDL`, `Zona`, `Quincena`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `nomina.listas.corporativo santander semanal`"
                    + " Where `Quincena` LIKE '%" + FQuin + "%'";
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
            TableLDACI9.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Zona");//2
            modelo.addColumn("Quincena");//2
            modelo.addColumn("Apellido P");//9
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//9

//ANCHOS
            int[] anchos = {/*ND*/50, /*Zon*/ 50, /*Quin*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TableLDACI9.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

        } catch (SQLException error_mostrsr_pcda) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de corporativo santander semanal: " + error_mostrsr_pcda.getMessage());

        }

    }


    private void LDAQuinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LDAQuinItemStateChanged
        int vari = LDAQuin.getSelectedIndex();

        if (NYear.isSelected() == true) {
            // <editor-fold defaultstate="collapsed" desc="SelecalM1ionar">
            if (vari == 0) {
                Fecha1.setDate(null);
                DiaCor1.setDate(null);
                DiaCor2.setDate(null);
                DiaCor3.setDate(null);
                DiaCor4.setDate(null);
                DiaCor5.setDate(null);
                DiaCor6.setDate(null);
                DiaCor7.setDate(null);
                DiaCor8.setDate(null);
                DiaCor9.setDate(null);
                DiaCor10.setDate(null);
                DiaCor11.setDate(null);
                DiaCor12.setDate(null);
                DiaCor13.setDate(null);
                DiaCor14.setDate(null);
                DiaCor15.setDate(null);
                DiaCor16.setDate(null);
                DiaCom1.setDate(null);
                DiaCom2.setDate(null);
                DiaCom3.setDate(null);
                DiaCom4.setDate(null);
                DiaCom5.setDate(null);
                DiaCom6.setDate(null);
                DiaCom7.setDate(null);
                DiaCom8.setDate(null);
                DiaCom9.setDate(null);
                DiaCom10.setDate(null);
                DiaCom11.setDate(null);
                DiaCom12.setDate(null);
                DiaCom13.setDate(null);
                DiaCom14.setDate(null);
                DiaCom15.setDate(null);
                DiaCom16.setDate(null);

            }
            //</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ENE">
            if (vari == 1) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
            //</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ENE">

            if (vari == 2) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 FEB">
            if (vari == 3) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb">

            if (vari == 4) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor14.setDate(null);
                    DiaCom14.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb B">

            if (vari == 5) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Marzo">
            if (vari == 6) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Marzo">

            if (vari == 7) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Abril">
            if (vari == 8) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 abril">

            if (vari == 9) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 may">
            if (vari == 10) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 may">

            if (vari == 11) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jun">
            if (vari == 12) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jun">

            if (vari == 13) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jul">
            if (vari == 14) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jul">

            if (vari == 15) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ago">
            if (vari == 16) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ago">

            if (vari == 17) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 sep">
            if (vari == 18) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 sep">

            if (vari == 19) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 oct">
            if (vari == 20) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 oct">

            if (vari == 21) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 nov">
            if (vari == 22) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 nov">

            if (vari == 23) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 dic">
            if (vari == 24) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 dic">

            if (vari == 25) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
        }
        if (NYear.isSelected() == false) {
            // <editor-fold defaultstate="collapsed" desc="SelecalM1ionar">
            if (vari == 0) {
                Fecha1.setDate(null);
                DiaCor1.setDate(null);
                DiaCor2.setDate(null);
                DiaCor3.setDate(null);
                DiaCor4.setDate(null);
                DiaCor5.setDate(null);
                DiaCor6.setDate(null);
                DiaCor7.setDate(null);
                DiaCor8.setDate(null);
                DiaCor9.setDate(null);
                DiaCor10.setDate(null);
                DiaCor11.setDate(null);
                DiaCor12.setDate(null);
                DiaCor13.setDate(null);
                DiaCor14.setDate(null);
                DiaCor15.setDate(null);
                DiaCor16.setDate(null);
                DiaCom1.setDate(null);
                DiaCom2.setDate(null);
                DiaCom3.setDate(null);
                DiaCom4.setDate(null);
                DiaCom5.setDate(null);
                DiaCom6.setDate(null);
                DiaCom7.setDate(null);
                DiaCom8.setDate(null);
                DiaCom9.setDate(null);
                DiaCom10.setDate(null);
                DiaCom11.setDate(null);
                DiaCom12.setDate(null);
                DiaCom13.setDate(null);
                DiaCom14.setDate(null);
                DiaCom15.setDate(null);
                DiaCom16.setDate(null);

            }
            //</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ENE">
            if (vari == 1) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
            //</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ENE">

            if (vari == 2) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 FEB">
            if (vari == 3) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb">

            if (vari == 4) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);

                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor14.setDate(null);
                    DiaCom14.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb B">

            if (vari == 5) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);

                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Marzo">
            if (vari == 6) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Marzo">

            if (vari == 7) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Abril">
            if (vari == 8) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 abril">

            if (vari == 9) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 may">
            if (vari == 10) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 may">

            if (vari == 11) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jun">
            if (vari == 12) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jun">

            if (vari == 13) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jul">
            if (vari == 14) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jul">

            if (vari == 15) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ago">
            if (vari == 16) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ago">

            if (vari == 17) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 sep">
            if (vari == 18) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 sep">

            if (vari == 19) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 oct">
            if (vari == 20) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 oct">

            if (vari == 21) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 nov">
            if (vari == 22) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 nov">

            if (vari == 23) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 dic">
            if (vari == 24) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 dic">

            if (vari == 25) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
        }

    }//GEN-LAST:event_LDAQuinItemStateChanged

    private void LDAfilapKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LDAfilapKeyReleased
        SHempleados();
    }//GEN-LAST:event_LDAfilapKeyReleased

    private void LDAfilnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LDAfilnameKeyReleased
        SHempleados();
    }//GEN-LAST:event_LDAfilnameKeyReleased

    private void LDAfilamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LDAfilamKeyReleased
        SHempleados();
    }//GEN-LAST:event_LDAfilamKeyReleased

    private void EmpleadosShMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpleadosShMouseClicked

        int fila = EmpleadosSh.getSelectedRow();
        LDAAp.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 0)));
        LDAAm.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 1)));
        LDAName.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 2)));
        LDAZon.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 3)));

        MostrarULDA();
    }//GEN-LAST:event_EmpleadosShMouseClicked

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        AgregarLDA();
    }//GEN-LAST:event_AgregarActionPerformed

    private void LDAfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LDAfilItemStateChanged
        if (LDAfil.getSelectedIndex() == 0) {
            LabelFil.setVisible(false);
            LDAfilap.setVisible(false);
            LDAfilam.setVisible(false);
            LDAfilname.setVisible(false);
            LDAfilap.setText("");
            LDAfilam.setText("");
            LDAfilname.setText("");

        }
        if (LDAfil.getSelectedIndex() == 1) {
            LabelFil.setVisible(true);
            LabelFil.setText("Buscar Apellido P:");
            LDAfilap.setVisible(true);
            LDAfilam.setVisible(false);
            LDAfilname.setVisible(false);
            LDAfilap.setText("");
            LDAfilam.setText("");
            LDAfilname.setText("");

        }
        if (LDAfil.getSelectedIndex() == 2) {
            LabelFil.setVisible(true);
            LabelFil.setText("Buscar Apellido M:");
            LDAfilap.setVisible(false);
            LDAfilam.setVisible(true);
            LDAfilname.setVisible(false);
            LDAfilap.setText("");
            LDAfilam.setText("");
            LDAfilname.setText("");

        }
        if (LDAfil.getSelectedIndex() == 3) {
            LabelFil.setVisible(true);
            LabelFil.setText("Buscar Nombre(s)");
            LDAfilap.setVisible(false);
            LDAfilam.setVisible(false);
            LDAfilname.setVisible(true);
            LDAfilap.setText("");
            LDAfilam.setText("");
            LDAfilname.setText("");

        }
        SHempleados();
    }//GEN-LAST:event_LDAfilItemStateChanged

    private void EmpleadosShKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmpleadosShKeyReleased
        int fila = EmpleadosSh.getSelectedRow();
        LDAAp.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 0)));
        LDAAm.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 1)));
        LDAName.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 2)));
        LDAZon.setText(String.valueOf(EmpleadosSh.getValueAt(fila, 3)));

        MostrarULDA();
    }//GEN-LAST:event_EmpleadosShKeyReleased

    private void LDAZonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LDAZonKeyReleased
        MostrarULDA();

    }//GEN-LAST:event_LDAZonKeyReleased

    private void NYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NYearActionPerformed
        int vari = LDAQuin.getSelectedIndex();

        if (NYear.isSelected() == true) {
            // <editor-fold defaultstate="collapsed" desc="SelecalM1ionar">
            if (vari == 0) {
                Fecha1.setDate(null);
                DiaCor1.setDate(null);
                DiaCor2.setDate(null);
                DiaCor3.setDate(null);
                DiaCor4.setDate(null);
                DiaCor5.setDate(null);
                DiaCor6.setDate(null);
                DiaCor7.setDate(null);
                DiaCor8.setDate(null);
                DiaCor9.setDate(null);
                DiaCor10.setDate(null);
                DiaCor11.setDate(null);
                DiaCor12.setDate(null);
                DiaCor13.setDate(null);
                DiaCor14.setDate(null);
                DiaCor15.setDate(null);
                DiaCor16.setDate(null);
                DiaCom1.setDate(null);
                DiaCom2.setDate(null);
                DiaCom3.setDate(null);
                DiaCom4.setDate(null);
                DiaCom5.setDate(null);
                DiaCom6.setDate(null);
                DiaCom7.setDate(null);
                DiaCom8.setDate(null);
                DiaCom9.setDate(null);
                DiaCom10.setDate(null);
                DiaCom11.setDate(null);
                DiaCom12.setDate(null);
                DiaCom13.setDate(null);
                DiaCom14.setDate(null);
                DiaCom15.setDate(null);
                DiaCom16.setDate(null);

            }
            //</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ENE">
            if (vari == 1) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
            //</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ENE">

            if (vari == 2) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 FEB">
            if (vari == 3) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb">

            if (vari == 4) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor14.setDate(null);
                    DiaCom14.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb B">

            if (vari == 5) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Marzo">
            if (vari == 6) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Marzo">

            if (vari == 7) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Abril">
            if (vari == 8) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();
                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 abril">

            if (vari == 9) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 may">
            if (vari == 10) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 may">

            if (vari == 11) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jun">
            if (vari == 12) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jun">

            if (vari == 13) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jul">
            if (vari == 14) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jul">

            if (vari == 15) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ago">
            if (vari == 16) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ago">

            if (vari == 17) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 sep">
            if (vari == 18) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 sep">

            if (vari == 19) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 oct">
            if (vari == 20) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 oct">

            if (vari == 21) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 nov">
            if (vari == 22) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 nov">

            if (vari == 23) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 dic">
            if (vari == 24) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 dic">

            if (vari == 25) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Calendar calY1 = Calendar.getInstance();
                    calY1.setTime(fin);
                    calY1.add(Calendar.YEAR, 1);
                    fin = calY1.getTime();
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
        }
        if (NYear.isSelected() == false) {
            // <editor-fold defaultstate="collapsed" desc="SelecalM1ionar">
            if (vari == 0) {
                Fecha1.setDate(null);
                DiaCor1.setDate(null);
                DiaCor2.setDate(null);
                DiaCor3.setDate(null);
                DiaCor4.setDate(null);
                DiaCor5.setDate(null);
                DiaCor6.setDate(null);
                DiaCor7.setDate(null);
                DiaCor8.setDate(null);
                DiaCor9.setDate(null);
                DiaCor10.setDate(null);
                DiaCor11.setDate(null);
                DiaCor12.setDate(null);
                DiaCor13.setDate(null);
                DiaCor14.setDate(null);
                DiaCor15.setDate(null);
                DiaCor16.setDate(null);
                DiaCom1.setDate(null);
                DiaCom2.setDate(null);
                DiaCom3.setDate(null);
                DiaCom4.setDate(null);
                DiaCom5.setDate(null);
                DiaCom6.setDate(null);
                DiaCom7.setDate(null);
                DiaCom8.setDate(null);
                DiaCom9.setDate(null);
                DiaCom10.setDate(null);
                DiaCom11.setDate(null);
                DiaCom12.setDate(null);
                DiaCom13.setDate(null);
                DiaCom14.setDate(null);
                DiaCom15.setDate(null);
                DiaCom16.setDate(null);

            }
            //</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ENE">
            if (vari == 1) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }

            }
            //</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ENE">

            if (vari == 2) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ene.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 FEB">
            if (vari == 3) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }
//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb">

            if (vari == 4) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);

                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor14.setDate(null);
                    DiaCom14.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Feb B">

            if (vari == 5) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-feb.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);

                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor15.setDate(null);
                    DiaCom15.setDate(null);

                    //calM1.add(Calendar.DATE, 1);
                    //fin = calM1.getTime();
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Marzo">
            if (vari == 6) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 Marzo">

            if (vari == 7) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-mar.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 Abril">
            if (vari == 8) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 abril">

            if (vari == 9) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-abr.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 may">
            if (vari == 10) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 may">

            if (vari == 11) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-may.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jun">
            if (vari == 12) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jun">

            if (vari == 13) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jun.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 jul">
            if (vari == 14) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 jul">

            if (vari == 15) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-jul.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 ago">
            if (vari == 16) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 ago">

            if (vari == 17) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-ago.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 sep">
            if (vari == 18) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 sep">

            if (vari == 19) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-sep.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 oct">
            if (vari == 20) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 oct">

            if (vari == 21) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-oct.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 nov">
            if (vari == 22) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 nov">

            if (vari == 23) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-nov.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>

            // <editor-fold defaultstate="collapsed" desc="Q1 dic">
            if (vari == 24) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 1-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    /*calM1.add(Calendar.DATE, 1);
                fin = calM1.getTime();*/
                    DiaCor16.setDate(null);
                    DiaCom16.setDate(null);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
            // <editor-fold defaultstate="collapsed" desc="Q2 dic">

            if (vari == 25) {
                try {
                    Date DTano = new Date();
                    SimpleDateFormat ano = new SimpleDateFormat("y");
                    SimpleDateFormat dias = new SimpleDateFormat("EEEE");
                    FG = dias.format(DTano) + ", 16-dic.-" + ano.format(DTano);
                    Date fin = new SimpleDateFormat("EEEE, d-MMM-y").parse(FG);
                    Fecha1.setDate(fin);
                    Fecha1.setDate(fin);
                    DiaCor1.setDate(fin);
                    DiaCom1.setDate(fin);

                    Calendar calM1 = Calendar.getInstance();
                    calM1.setTime(fin);
                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor2.setDate(fin);
                    DiaCom2.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor3.setDate(fin);
                    DiaCom3.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor4.setDate(fin);
                    DiaCom4.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor5.setDate(fin);
                    DiaCom5.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor6.setDate(fin);
                    DiaCom6.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor7.setDate(fin);
                    DiaCom7.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor8.setDate(fin);
                    DiaCom8.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor9.setDate(fin);
                    DiaCom9.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor10.setDate(fin);
                    DiaCom10.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor11.setDate(fin);
                    DiaCom11.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor12.setDate(fin);
                    DiaCom12.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor13.setDate(fin);
                    DiaCom13.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor14.setDate(fin);
                    DiaCom14.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor15.setDate(fin);
                    DiaCom15.setDate(fin);

                    calM1.add(Calendar.DATE, 1);
                    fin = calM1.getTime();

                    DiaCor16.setDate(fin);
                    DiaCom16.setDate(fin);

                } catch (ParseException ex) {
                    Logger.getLogger(Listas_CI_5.class
                            .getName()).log(Level.SEVERE, null, ex);
                }
            }//</editor-fold>
        }
    }//GEN-LAST:event_NYearActionPerformed

    private void ExcelCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcelCIActionPerformed
        if (LDA.getText().equals("0")) {
            JOptionPane.showMessageDialog(this, "Selecciona una lista.");

        } else {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
            chooser.setSelectedFile(new File("Lista de la " + LDAQuin.getSelectedItem().toString() + " de " + LDAZon.getText() + " de "
                    + LDAAp.getText() + " " + " " + LDAAm.getText() + " " + LDAName.getText()));
            chooser.setFileFilter(filter);
            chooser.setDialogTitle("Guardar archivo");
            chooser.setAcceptAllFileFilterUsed(false);
            if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
                String ruta = chooser.getSelectedFile().toString().concat(".xlsx"); //extención del archivo excel
            }
            try {
                String ruta = chooser.getSelectedFile().toString().concat(".xlsx");
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connect = DriverManager.getConnection(
                        "jdbc:mysql://192.168.1.170:3306/confort2022",
                        "Servidor",
                        "Confort1022"
                );

                Statement statement = connect.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM `nomina.listas." + LDAZon.getText() + "` WHERE " + LDA.getText());
                try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                    XSSFWorkbook libro = new XSSFWorkbook();
                    XSSFSheet spreadsheet = libro.createSheet(("Lista"));

                    XSSFRow row = spreadsheet.createRow((short) 0);
                    XSSFCell cell = (XSSFCell) row.createCell((short) 0);

                    XSSFCellStyle Encabezado = libro.createCellStyle();
                    Encabezado.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                    Encabezado.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

                    XSSFCellStyle Stilodd = libro.createCellStyle();

                    Stilodd.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                    Stilodd.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                    Stilodd.setBorderTop(XSSFCellStyle.BORDER_THIN);
                    Stilodd.setAlignment(XSSFCellStyle.ALIGN_CENTER_SELECTION);
                    Stilodd.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                    XSSFCellStyle StiloEEEE = libro.createCellStyle();

                    StiloEEEE.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                    StiloEEEE.setBorderRight(XSSFCellStyle.BORDER_THIN);
                    StiloEEEE.setBorderTop(XSSFCellStyle.BORDER_THIN);
                    StiloEEEE.setAlignment(XSSFCellStyle.ALIGN_JUSTIFY);
                    StiloEEEE.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                    XSSFCellStyle Contenido = libro.createCellStyle();
                    Contenido.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                    Contenido.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
                    Contenido.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                    Contenido.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                    Contenido.setBorderRight(XSSFCellStyle.BORDER_THIN);
                    Contenido.setBorderTop(XSSFCellStyle.BORDER_THIN);

                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    0, //first row (0-based)
                                    0, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(1);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    1, //first row (0-based)
                                    1, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
//quincena etc mañana
                    row = spreadsheet.createRow(4);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    4, //first row (0-based)
                                    4, //last row (0-based)
                                    0, //first column (0-based)
                                    1 //last column (0-based)
                            )
                    );
                    row.setHeight((short) 500);
                    cell = row.createCell(0);
                    spreadsheet.setColumnWidth(0, 750);
                    cell.setCellValue("Fecha");
                    cell.setCellStyle(Contenido);

                    spreadsheet.setColumnWidth(1, 2500);
                    cell = row.createCell(1);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(2);
                    spreadsheet.setColumnWidth(2, 9500);
                    cell.setCellValue("Nombre completo");
                    cell.setCellStyle(Contenido);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    4, //first row (0-based)
                                    4, //last row (0-based)
                                    1, //first column (0-based)
                                    3 //last column (0-based)
                            )
                    );
                    cell = row.createCell(3);
                    cell.setCellValue("Entrada");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue("Salida");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    spreadsheet.setColumnWidth(5, 5000);
                    cell.setCellValue("Firma");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    spreadsheet.setColumnWidth(6, 5000);
                    cell.setCellValue("Lugar");

                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    spreadsheet.setColumnWidth(7, 1800);
                    cell.setCellValue("Doble");

                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    spreadsheet.setColumnWidth(8, 5650);
                    cell.setCellValue("Observaciones");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    4, //first row (0-based)
                                    4, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    //  int i = 2;
                    while (resultSet.next()) {
                        row = spreadsheet.createRow(2);
                        row.setHeight((short) 400);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getString("Quincena") + " " + resultSet.getString("y 1/16"));
                        cell.setCellStyle(Contenido);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        2, //first row (0-based)
                                        2, //last row (0-based)
                                        0, //first column (0-based)
                                        2 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        2, //first row (0-based)
                                        2, //last row (0-based)
                                        4, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(4);
                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell.setCellStyle(Encabezado);

                        cell = row.createCell(5);
                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell = row.createCell(6);
                        cell.setCellStyle(Encabezado);

                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell.setCellStyle(Encabezado);

                        cell = row.createCell(7);
                        cell.setCellValue(resultSet.getString("Apellido P") + " "
                                + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                        cell.setCellStyle(Encabezado);

                        cell = row.createCell(8);
                        cell.setCellValue(resultSet.getString("Zona"));
                        spreadsheet.setColumnWidth(8, 4250);
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(9);
                        spreadsheet.setColumnWidth(9, 1500);
                        cell.setCellValue(resultSet.getInt("NDL"));
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(5);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellStyle(Stilodd);
                        cell.setCellValue(resultSet.getInt("dd 1/16"));
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 1/16"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        5, //first row (0-based)
                                        5, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(6);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 2/17"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 2/17"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        6, //first row (0-based)
                                        6, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(7);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 3/18"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 3/18"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        7, //first row (0-based)
                                        7, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(8);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 4/19"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 4/19"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        8, //first row (0-based)
                                        8, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(9);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 5/20"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 5/20"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        9, //first row (0-based)
                                        9, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(10);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 6/21"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 6/21"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        10, //first row (0-based)
                                        10, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(11);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 7/22"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 7/22"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        11, //first row (0-based)
                                        11, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(12);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 8/23"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 8/23"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        12, //first row (0-based)
                                        12, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(13);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 9/24"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 9/24"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        13, //first row (0-based)
                                        13, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(14);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 10/25"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 10/25"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        14, //first row (0-based)
                                        14, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(15);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 11/26"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 11/26"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        15, //first row (0-based)
                                        15, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(16);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 12/27"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 12/27"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        16, //first row (0-based)
                                        16, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(17);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 13/28"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 13/28"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        17, //first row (0-based)
                                        17, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(18);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 14/29"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 14/29"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        18, //first row (0-based)
                                        18, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(19);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getInt("dd 15/30"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 15/30"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        19, //first row (0-based)
                                        19, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(20);
                        row.setHeight((short) 600);
                        cell = row.createCell(0);
                        cell.setCellValue(resultSet.getString("dd 31"));
                        cell.setCellStyle(Stilodd);
                        cell = row.createCell(1);
                        cell.setCellValue(resultSet.getString("EEEE 31"));
                        cell.setCellStyle(StiloEEEE);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        20, //first row (0-based)
                                        20, //last row (0-based)
                                        8, //first column (0-based)
                                        9 //last column (0-based)
                                )
                        );
                        cell = row.createCell(8);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(9);
                        cell.setCellStyle(Contenido);

                    }
                    spreadsheet.getPrintSetup();
                    spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                    spreadsheet.getPrintSetup().setLandscape(true); // Dirección de impresión, true: horizontal, false: vertical
                    spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.49); // Margen (abajo)  
                    spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                    spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                    spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.1); // Margen (arriba)
                    spreadsheet.setMargin(HSSFSheet.FooterMargin, (double) 0.1);
                    spreadsheet.setMargin(HSSFSheet.HeaderMargin, (double) 0.1);

                    spreadsheet.setHorizontallyCenter(true); // Establecer la página impresa para que se centre horizontalmente
                    libro.write(archivo);
                }
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {

                try {
                    throw e;
                } catch (IOException | NumberFormatException ex) {
                    Logger.getLogger(Listas_CI_5.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Listas_CI_5.class.getName()).log(Level.SEVERE, null, ex);
            }

            LDAZon.setText("");
            LDAQuin.setSelectedIndex(0);
            LDAAp.setText("");
            LDAAm.setText("");
            LDAName.setText("");
        }
    }//GEN-LAST:event_ExcelCIActionPerformed

    private void ODT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODT1ActionPerformed
        ODTQ_5 regr = new ODTQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODT1ActionPerformed

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

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void CDA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA1ActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDA1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        NominaS_5 regr = new NominaS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        PresS_5 regr = new PresS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        NominaS_simss_5 regr = new NominaS_simss_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        Listas_CI_5 regr = new Listas_CI_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        Iturbide_4 regr = new Iturbide_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Tehuantepec_4 regr = new Tehuantepec_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        PT_4 regr = new PT_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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

    private void CDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDAActionPerformed
        CDAQ_5 regr = new CDAQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDAActionPerformed

    private void PRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESActionPerformed
        PresQ_5 regr = new PresQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PRESActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NominaQ_5 regr = new NominaQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void LDA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LDA1ActionPerformed
        Listas_SI_5 regr = new Listas_SI_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LDA1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        RepNom_7 regr = new RepNom_7(usr, LP);
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Depositos_4 regr = new Depositos_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void ADMV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMV2ActionPerformed
        VentanaADM_3 regr = new VentanaADM_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMV2ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        RepNomSem_7 regr = new RepNomSem_7();
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void TableLDACI9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI9MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI9.getModel();

        int fila = TableLDACI9.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI9.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI9.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI9.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI9.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI9.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI9MouseClicked

    private void FillLCIQuin9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuin9ItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin9ItemStateChanged

    private void FillLCIName9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName9KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName9KeyReleased

    private void FillLCIAm9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm9KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm9KeyReleased

    private void FillLCIAp9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp9KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp9KeyReleased

    private void FillLCI9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI9ItemStateChanged
        if (FillLCI9.getSelectedIndex() == 0) {
            FillLCIabel9.setVisible(false);
            FillLCIAm9.setVisible(false);
            FillLCIAm9.setText("");
            FillLCIAp9.setVisible(false);
            FillLCIAp9.setText("");
            FillLCIName9.setVisible(false);
            FillLCIName9.setText("");
            FillLCIQuin9.setVisible(false);
            FillLCIQuin9.setSelectedIndex(0);

        }
        if (FillLCI9.getSelectedIndex() == 1) {
            FillLCIabel9.setVisible(true);
            FillLCIabel9.setText("Buscar apellido P:");
            FillLCIAm9.setVisible(false);
            FillLCIAm9.setText("");
            FillLCIAp9.setVisible(true);
            FillLCIAp9.setText("");
            FillLCIName9.setVisible(false);
            FillLCIName9.setText("");
            FillLCIQuin9.setVisible(false);
            FillLCIQuin9.setSelectedIndex(0);

        }
        if (FillLCI9.getSelectedIndex() == 2) {
            FillLCIabel9.setVisible(true);
            FillLCIabel9.setText("Buscar apellido M:");
            FillLCIAm9.setVisible(true);
            FillLCIAm9.setText("");
            FillLCIAp9.setVisible(false);
            FillLCIAp9.setText("");
            FillLCIName9.setVisible(false);
            FillLCIName9.setText("");
            FillLCIQuin9.setVisible(false);
            FillLCIQuin9.setSelectedIndex(0);

        }
                if (FillLCI9.getSelectedIndex() == 3) {
            FillLCIabel9.setVisible(true);
            FillLCIabel9.setText("Nombre(s):");
            FillLCIAm9.setVisible(false);
            FillLCIAm9.setText("");
            FillLCIAp9.setVisible(false);
            FillLCIAp9.setText("");
            FillLCIName9.setVisible(true);
            FillLCIName9.setText("");
            FillLCIQuin9.setVisible(false);
            FillLCIQuin9.setSelectedIndex(0);

        }
        if (FillLCI9.getSelectedIndex() == 4) {
            FillLCIabel9.setVisible(true);
            FillLCIabel9.setText("Buscar Quincena:");
            FillLCIAm9.setVisible(false);
            FillLCIAm9.setText("");
            FillLCIAp9.setVisible(false);
            FillLCIAp9.setText("");
            FillLCIName9.setVisible(false);
            FillLCIName9.setText("");
            FillLCIQuin9.setVisible(true);
            FillLCIQuin9.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI9ItemStateChanged

    private void TableLDACI8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI8MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI8.getModel();

        int fila = TableLDACI8.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI8.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI8.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI8.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI8.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI8.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI8MouseClicked

    private void FillLCIQuin8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIQuin8KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin8KeyReleased

    private void FillLCIName8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName8KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName8KeyReleased

    private void FillLCIAm8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm8KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm8KeyReleased

    private void FillLCIAp8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp8KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp8KeyReleased

    private void FillLCI8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI8ItemStateChanged
        if (FillLCI8.getSelectedIndex() == 0) {
            FillLCIabel8.setVisible(false);
            FillLCIAm8.setVisible(false);
            FillLCIAm8.setText("");
            FillLCIAp8.setVisible(false);
            FillLCIAp8.setText("");
            FillLCIName8.setVisible(false);
            FillLCIName8.setText("");
            FillLCIQuin8.setVisible(false);
            FillLCIQuin8.setSelectedIndex(0);

        }
        if (FillLCI8.getSelectedIndex() == 1) {
            FillLCIabel8.setVisible(true);
            FillLCIabel8.setText("Buscar apellido P:");
            FillLCIAm8.setVisible(false);
            FillLCIAm8.setText("");
            FillLCIAp8.setVisible(true);
            FillLCIAp8.setText("");
            FillLCIName8.setVisible(false);
            FillLCIName8.setText("");
            FillLCIQuin8.setVisible(false);
            FillLCIQuin8.setSelectedIndex(0);

        }
        if (FillLCI8.getSelectedIndex() == 2) {
            FillLCIabel8.setVisible(true);
            FillLCIabel8.setText("Buscar apellido M:");
            FillLCIAm8.setVisible(true);
            FillLCIAm8.setText("");
            FillLCIAp8.setVisible(false);
            FillLCIAp8.setText("");
            FillLCIName8.setVisible(false);
            FillLCIName8.setText("");
            FillLCIQuin8.setVisible(false);
            FillLCIQuin8.setSelectedIndex(0);

        }
        if (FillLCI8.getSelectedIndex() == 3) {
            FillLCIabel8.setVisible(true);
            FillLCIabel8.setText("Nombre(s):");
            FillLCIAm8.setVisible(false);
            FillLCIAm8.setText("");
            FillLCIAp8.setVisible(false);
            FillLCIAp8.setText("");
            FillLCIName8.setVisible(true);
            FillLCIName8.setText("");
            FillLCIQuin8.setVisible(false);
            FillLCIQuin8.setSelectedIndex(0);

        }
        if (FillLCI8.getSelectedIndex() == 4) {
            FillLCIabel8.setVisible(true);
            FillLCIabel8.setText("Buscar Quincena:");
            FillLCIAm8.setVisible(false);
            FillLCIAm8.setText("");
            FillLCIAp8.setVisible(false);
            FillLCIAp8.setText("");
            FillLCIName8.setVisible(false);
            FillLCIName8.setText("");
            FillLCIQuin8.setVisible(true);
            FillLCIQuin8.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI8ItemStateChanged

    private void TableLDACI7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI7MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI7.getModel();

        int fila = TableLDACI7.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI7.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI7.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI7.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI7.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI7.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI7MouseClicked

    private void FillLCIQuin7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuin7ItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin7ItemStateChanged

    private void FillLCIName7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName7KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName7KeyReleased

    private void FillLCIAm7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm7KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm7KeyReleased

    private void FillLCIAp7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp7KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp7KeyReleased

    private void FillLCI7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI7ItemStateChanged
        if (FillLCI7.getSelectedIndex() == 0) {
            FillLCIabel7.setVisible(false);
            FillLCIAm7.setVisible(false);
            FillLCIAm7.setText("");
            FillLCIAp7.setVisible(false);
            FillLCIAp7.setText("");
            FillLCIName7.setVisible(false);
            FillLCIName7.setText("");
            FillLCIQuin7.setVisible(false);
            FillLCIQuin7.setSelectedIndex(0);

        }
        if (FillLCI7.getSelectedIndex() == 1) {
            FillLCIabel7.setVisible(true);
            FillLCIabel7.setText("Buscar apellido P:");
            FillLCIAm7.setVisible(false);
            FillLCIAm7.setText("");
            FillLCIAp7.setVisible(true);
            FillLCIAp7.setText("");
            FillLCIName7.setVisible(false);
            FillLCIName7.setText("");
            FillLCIQuin7.setVisible(false);
            FillLCIQuin7.setSelectedIndex(0);

        }
        if (FillLCI7.getSelectedIndex() == 2) {
            FillLCIabel7.setVisible(true);
            FillLCIabel7.setText("Buscar apellido M:");
            FillLCIAm7.setVisible(true);
            FillLCIAm7.setText("");
            FillLCIAp7.setVisible(false);
            FillLCIAp7.setText("");
            FillLCIName7.setVisible(false);
            FillLCIName7.setText("");
            FillLCIQuin7.setVisible(false);
            FillLCIQuin7.setSelectedIndex(0);

        }
                if (FillLCI7.getSelectedIndex() == 3) {
            FillLCIabel7.setVisible(true);
            FillLCIabel7.setText("Nombre(s):");
            FillLCIAm7.setVisible(false);
            FillLCIAm7.setText("");
            FillLCIAp7.setVisible(false);
            FillLCIAp7.setText("");
            FillLCIName7.setVisible(true);
            FillLCIName7.setText("");
            FillLCIQuin7.setVisible(false);
            FillLCIQuin7.setSelectedIndex(0);

        }
        if (FillLCI7.getSelectedIndex() == 4) {
            FillLCIabel7.setVisible(true);
            FillLCIabel7.setText("Buscar Quincena:");
            FillLCIAm7.setVisible(false);
            FillLCIAm7.setText("");
            FillLCIAp7.setVisible(false);
            FillLCIAp7.setText("");
            FillLCIName7.setVisible(false);
            FillLCIName7.setText("");
            FillLCIQuin7.setVisible(true);
            FillLCIQuin7.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI7ItemStateChanged

    private void TableLDACI6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI6MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI6.getModel();

        int fila = TableLDACI6.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI6.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI6.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI6.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI6.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI6.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI6MouseClicked

    private void FillLCIQuin6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuin6ItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin6ItemStateChanged

    private void FillLCIName6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName6KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName6KeyReleased

    private void FillLCIAm6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm6KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm6KeyReleased

    private void FillLCIAp6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp6KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp6KeyReleased

    private void FillLCI6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI6ItemStateChanged
        if (FillLCI6.getSelectedIndex() == 0) {
            FillLCIabel6.setVisible(false);
            FillLCIAm6.setVisible(false);
            FillLCIAm6.setText("");
            FillLCIAp6.setVisible(false);
            FillLCIAp6.setText("");
            FillLCIName6.setVisible(false);
            FillLCIName6.setText("");
            FillLCIQuin6.setVisible(false);
            FillLCIQuin6.setSelectedIndex(0);

        }
        if (FillLCI6.getSelectedIndex() == 1) {
            FillLCIabel6.setVisible(true);
            FillLCIabel6.setText("Buscar apellido P:");
            FillLCIAm6.setVisible(false);
            FillLCIAm6.setText("");
            FillLCIAp6.setVisible(true);
            FillLCIAp6.setText("");
            FillLCIName6.setVisible(false);
            FillLCIName6.setText("");
            FillLCIQuin6.setVisible(false);
            FillLCIQuin6.setSelectedIndex(0);

        }
        if (FillLCI6.getSelectedIndex() == 2) {
            FillLCIabel6.setVisible(true);
            FillLCIabel6.setText("Buscar apellido M:");
            FillLCIAm6.setVisible(true);
            FillLCIAm6.setText("");
            FillLCIAp6.setVisible(false);
            FillLCIAp6.setText("");
            FillLCIName6.setVisible(false);
            FillLCIName6.setText("");
            FillLCIQuin6.setVisible(false);
            FillLCIQuin6.setSelectedIndex(0);

        }
                if (FillLCI6.getSelectedIndex() == 3) {
            FillLCIabel6.setVisible(true);
            FillLCIabel6.setText("Nombre(s):");
            FillLCIAm6.setVisible(false);
            FillLCIAm6.setText("");
            FillLCIAp6.setVisible(false);
            FillLCIAp6.setText("");
            FillLCIName6.setVisible(true);
            FillLCIName6.setText("");
            FillLCIQuin6.setVisible(false);
            FillLCIQuin6.setSelectedIndex(0);

        }
        if (FillLCI6.getSelectedIndex() == 4) {
            FillLCIabel6.setVisible(true);
            FillLCIabel6.setText("Buscar Quincena:");
            FillLCIAm6.setVisible(false);
            FillLCIAm6.setText("");
            FillLCIAp6.setVisible(false);
            FillLCIAp6.setText("");
            FillLCIName6.setVisible(false);
            FillLCIName6.setText("");
            FillLCIQuin6.setVisible(true);
            FillLCIQuin6.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI6ItemStateChanged

    private void TableLDACI5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI5MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI5.getModel();

        int fila = TableLDACI5.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI5.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI5.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI5.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI5.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI5.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI5MouseClicked

    private void FillLCIQuin5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIQuin5KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin5KeyReleased

    private void FillLCIName5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName5KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName5KeyReleased

    private void FillLCIAm5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm5KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm5KeyReleased

    private void FillLCIAp5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp5KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp5KeyReleased

    private void FillLCI5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI5ItemStateChanged
        if (FillLCI5.getSelectedIndex() == 0) {
            FillLCIabel5.setVisible(false);
            FillLCIAm5.setVisible(false);
            FillLCIAm5.setText("");
            FillLCIAp5.setVisible(false);
            FillLCIAp5.setText("");
            FillLCIName5.setVisible(false);
            FillLCIName5.setText("");
            FillLCIQuin5.setVisible(false);
            FillLCIQuin5.setSelectedIndex(0);

        }
        if (FillLCI5.getSelectedIndex() == 1) {
            FillLCIabel5.setVisible(true);
            FillLCIabel5.setText("Buscar apellido P:");
            FillLCIAm5.setVisible(true);
            FillLCIAm5.setText("");
            FillLCIAp5.setVisible(true);
            FillLCIAp5.setText("");
            FillLCIName5.setVisible(false);
            FillLCIName5.setText("");
            FillLCIQuin5.setVisible(false);
            FillLCIQuin5.setSelectedIndex(0);

        }
        if (FillLCI5.getSelectedIndex() == 2) {
            FillLCIabel5.setVisible(true);
            FillLCIabel5.setText("Buscar apellido M:");
            FillLCIAm5.setVisible(true);
            FillLCIAm5.setText("");
            FillLCIAp5.setVisible(false);
            FillLCIAp5.setText("");
            FillLCIName5.setVisible(false);
            FillLCIName5.setText("");
            FillLCIQuin5.setVisible(false);
            FillLCIQuin5.setSelectedIndex(0);

        }
                if (FillLCI5.getSelectedIndex() == 3) {
            FillLCIabel5.setVisible(true);
            FillLCIabel5.setText("Nombre(s):");
            FillLCIAm5.setVisible(false);
            FillLCIAm5.setText("");
            FillLCIAp5.setVisible(false);
            FillLCIAp5.setText("");
            FillLCIName5.setVisible(true);
            FillLCIName5.setText("");
            FillLCIQuin5.setVisible(false);
            FillLCIQuin5.setSelectedIndex(0);

        }
        if (FillLCI5.getSelectedIndex() == 4) {
            FillLCIabel5.setVisible(true);
            FillLCIabel5.setText("Buscar Quincena:");
            FillLCIAm5.setVisible(false);
            FillLCIAm5.setText("");
            FillLCIAp5.setVisible(false);
            FillLCIAp5.setText("");
            FillLCIName5.setVisible(false);
            FillLCIName5.setText("");
            FillLCIQuin5.setVisible(true);
            FillLCIQuin5.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI5ItemStateChanged

    private void TableLDACI4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI4MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI4.getModel();

        int fila = TableLDACI4.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI4.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI4.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI4.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI4.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI4.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI4MouseClicked

    private void FillLCIQuin4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuin4ItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin4ItemStateChanged

    private void FillLCIName4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName4KeyTyped
        MDLDA();
    }//GEN-LAST:event_FillLCIName4KeyTyped

    private void FillLCIAm4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm4KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm4KeyReleased

    private void FillLCIAp4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp4KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp4KeyReleased

    private void FillLCI4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI4ItemStateChanged
        if (FillLCI4.getSelectedIndex() == 0) {
            FillLCIabel4.setVisible(false);
            FillLCIAm4.setVisible(false);
            FillLCIAm4.setText("");
            FillLCIAp4.setVisible(false);
            FillLCIAp4.setText("");
            FillLCIName4.setVisible(false);
            FillLCIName4.setText("");
            FillLCIQuin4.setVisible(false);
            FillLCIQuin4.setSelectedIndex(0);

        }
        if (FillLCI4.getSelectedIndex() == 1) {
            FillLCIabel4.setVisible(false);
            FillLCIabel4.setText("Buscar apellido P:");
            FillLCIAm4.setVisible(false);
            FillLCIAm4.setText("");
            FillLCIAp4.setVisible(true);
            FillLCIAp4.setText("");
            FillLCIName4.setVisible(false);
            FillLCIName4.setText("");
            FillLCIQuin4.setVisible(false);
            FillLCIQuin4.setSelectedIndex(0);

        }
        if (FillLCI4.getSelectedIndex() == 2) {
            FillLCIabel4.setVisible(false);
            FillLCIabel4.setText("Buscar apellido M:");
            FillLCIAm4.setVisible(true);
            FillLCIAm4.setText("");
            FillLCIAp4.setVisible(false);
            FillLCIAp4.setText("");
            FillLCIName4.setVisible(false);
            FillLCIName4.setText("");
            FillLCIQuin4.setVisible(false);
            FillLCIQuin4.setSelectedIndex(0);

        }
        if (FillLCI4.getSelectedIndex() == 3) {
            FillLCIabel4.setVisible(true);
            FillLCIabel4.setText("Nombre(s):");
            FillLCIAm4.setVisible(false);
            FillLCIAm4.setText("");
            FillLCIAp4.setVisible(false);
            FillLCIAp4.setText("");
            FillLCIName4.setVisible(true);
            FillLCIName4.setText("");
            FillLCIQuin4.setVisible(false);
            FillLCIQuin4.setSelectedIndex(0);

        }
        if (FillLCI4.getSelectedIndex() == 4) {
            FillLCIabel4.setVisible(false);
            FillLCIabel4.setText("Buscar Quincena:");
            FillLCIAm4.setVisible(false);
            FillLCIAm4.setText("");
            FillLCIAp4.setVisible(false);
            FillLCIAp4.setText("");
            FillLCIName4.setVisible(false);
            FillLCIName4.setText("");
            FillLCIQuin4.setVisible(true);
            FillLCIQuin4.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI4ItemStateChanged

    private void TableLDACI3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI3MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI3.getModel();

        int fila = TableLDACI3.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI3.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI3.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI3.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI3.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI3.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI3MouseClicked

    private void FillLCIQuin3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuin3ItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin3ItemStateChanged

    private void FillLCIName3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName3KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName3KeyReleased

    private void FillLCIAm3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm3KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm3KeyReleased

    private void FillLCIAp3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp3KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp3KeyReleased

    private void FillLCI3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI3ItemStateChanged
        if (FillLCI3.getSelectedIndex() == 0) {
            FillLCIabel3.setVisible(false);
            FillLCIAm3.setVisible(false);
            FillLCIAm3.setText("");
            FillLCIAp3.setVisible(false);
            FillLCIAp3.setText("");
            FillLCIName3.setVisible(false);
            FillLCIName3.setText("");
            FillLCIQuin3.setVisible(false);
            FillLCIQuin3.setSelectedIndex(0);

        }
        if (FillLCI3.getSelectedIndex() == 1) {
            FillLCIabel3.setVisible(true);
            FillLCIabel3.setText("Buscar apellido P:");
            FillLCIAm3.setVisible(false);
            FillLCIAm3.setText("");
            FillLCIAp3.setVisible(true);
            FillLCIAp3.setText("");
            FillLCIName3.setVisible(false);
            FillLCIName3.setText("");
            FillLCIQuin3.setVisible(false);
            FillLCIQuin3.setSelectedIndex(0);

        }
        if (FillLCI3.getSelectedIndex() == 2) {
            FillLCIabel3.setVisible(true);
            FillLCIabel3.setText("Buscar apellido M:");
            FillLCIAm3.setVisible(true);
            FillLCIAm3.setText("");
            FillLCIAp3.setVisible(false);
            FillLCIAp3.setText("");
            FillLCIName3.setVisible(false);
            FillLCIName3.setText("");
            FillLCIQuin3.setVisible(false);
            FillLCIQuin3.setSelectedIndex(0);

        }
        if (FillLCI3.getSelectedIndex() == 3) {
            FillLCIabel3.setVisible(true);
            FillLCIabel3.setText("Nombre(s):");
            FillLCIAm3.setVisible(false);
            FillLCIAm3.setText("");
            FillLCIAp3.setVisible(false);
            FillLCIAp3.setText("");
            FillLCIName3.setVisible(true);
            FillLCIName3.setText("");
            FillLCIQuin3.setVisible(false);
            FillLCIQuin3.setSelectedIndex(0);

        }
        if (FillLCI3.getSelectedIndex() == 4) {
            FillLCIabel3.setVisible(true);
            FillLCIabel3.setText("Buscar Quincena:");
            FillLCIAm3.setVisible(false);
            FillLCIAm3.setText("");
            FillLCIAp3.setVisible(false);
            FillLCIAp3.setText("");
            FillLCIName3.setVisible(false);
            FillLCIName3.setText("");
            FillLCIQuin3.setVisible(true);
            FillLCIQuin3.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI3ItemStateChanged

    private void TableLDACI2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACI2MouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI2.getModel();

        int fila = TableLDACI2.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI2.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI2.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI2.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI2.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI2.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI2MouseClicked

    private void FillLCIQuin2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIQuin2KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin2KeyReleased

    private void FillLCIName2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName2KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName2KeyReleased

    private void FillLCIAm2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm2KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm2KeyReleased

    private void FillLCIAp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp2KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp2KeyReleased

    private void FillLCI2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI2ItemStateChanged
        if (FillLCI2.getSelectedIndex() == 0) {
            FillLCIabel2.setVisible(false);
            FillLCIAm2.setVisible(false);
            FillLCIAm2.setText("");
            FillLCIAp2.setVisible(false);
            FillLCIAp2.setText("");
            FillLCIName2.setVisible(false);
            FillLCIName2.setText("");
            FillLCIQuin2.setVisible(false);
            FillLCIQuin2.setSelectedIndex(0);

        }
        if (FillLCI2.getSelectedIndex() == 1) {
            FillLCIabel2.setVisible(true);
            FillLCIabel2.setText("Buscar apellido P:");
            FillLCIAm2.setVisible(false);
            FillLCIAm2.setText("");
            FillLCIAp2.setVisible(true);
            FillLCIAp2.setText("");
            FillLCIName2.setVisible(false);
            FillLCIName2.setText("");
            FillLCIQuin2.setVisible(false);
            FillLCIQuin2.setSelectedIndex(0);

        }
        if (FillLCI2.getSelectedIndex() == 2) {
            FillLCIabel2.setVisible(true);
            FillLCIabel2.setText("Buscar apellido M:");
            FillLCIAm2.setVisible(true);
            FillLCIAm2.setText("");
            FillLCIAp2.setVisible(false);
            FillLCIAp2.setText("");
            FillLCIName2.setVisible(false);
            FillLCIName2.setText("");
            FillLCIQuin2.setVisible(false);
            FillLCIQuin2.setSelectedIndex(0);

        }
        if (FillLCI2.getSelectedIndex() == 3) {
            FillLCIabel2.setVisible(true);
            FillLCIabel2.setText("Buscar Nombre(s):");
            FillLCIAm2.setVisible(false);
            FillLCIAm2.setText("");
            FillLCIAp2.setVisible(false);
            FillLCIAp2.setText("");
            FillLCIName2.setVisible(true);
            FillLCIName2.setText("");
            FillLCIQuin2.setVisible(false);
            FillLCIQuin2.setSelectedIndex(0);

        }
        if (FillLCI2.getSelectedIndex() == 4) {
            FillLCIabel2.setVisible(true);
            FillLCIabel2.setText("Buscar Quincena:");
            FillLCIAm2.setVisible(false);
            FillLCIAm2.setText("");
            FillLCIAp2.setVisible(false);
            FillLCIAp2.setText("");
            FillLCIName2.setVisible(false);
            FillLCIName2.setText("");
            FillLCIQuin2.setVisible(true);
            FillLCIQuin2.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI2ItemStateChanged

    private void TableLDACI1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableLDACI1KeyReleased
        DefaultTableModel model = (DefaultTableModel) TableLDACI1.getModel();

        int fila = TableLDACI1.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI1.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI1.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI1.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI1.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI1.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);
    }//GEN-LAST:event_TableLDACI1KeyReleased

    private void FillLCIQuin1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuin1ItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuin1ItemStateChanged

    private void FillLCIName1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIName1KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIName1KeyReleased

    private void FillLCIAm1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAm1KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAm1KeyReleased

    private void FillLCIAp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAp1KeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAp1KeyReleased

    private void FillLCI1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCI1ItemStateChanged
        if (FillLCI1.getSelectedIndex() == 0) {
            FillLCIabel1.setVisible(false);
            FillLCIAm1.setVisible(false);
            FillLCIAm1.setText("");
            FillLCIAp1.setVisible(false);
            FillLCIAp1.setText("");
            FillLCIName1.setVisible(false);
            FillLCIName1.setText("");
            FillLCIQuin1.setVisible(false);
            FillLCIQuin1.setSelectedIndex(0);

        }
        if (FillLCI1.getSelectedIndex() == 1) {
            FillLCIabel1.setVisible(true);
            FillLCIabel1.setText("Buscar apellido P:");
            FillLCIAm1.setVisible(false);
            FillLCIAm1.setText("");
            FillLCIAp1.setVisible(true);
            FillLCIAp1.setText("");
            FillLCIName1.setVisible(false);
            FillLCIName1.setText("");
            FillLCIQuin1.setVisible(false);
            FillLCIQuin1.setSelectedIndex(0);

        }
        if (FillLCI1.getSelectedIndex() == 2) {
            FillLCIabel1.setVisible(true);
            FillLCIabel1.setText("Buscar apellido M:");
            FillLCIAm1.setVisible(true);
            FillLCIAm1.setText("");
            FillLCIAp1.setVisible(false);
            FillLCIAp1.setText("");
            FillLCIName1.setVisible(false);
            FillLCIName1.setText("");
            FillLCIQuin1.setVisible(false);
            FillLCIQuin1.setSelectedIndex(0);

        }
        if (FillLCI1.getSelectedIndex() == 3) {
            FillLCIabel1.setVisible(true);
            FillLCIabel1.setText("Buscar Nombre(s):");
            FillLCIAm1.setVisible(false);
            FillLCIAm1.setText("");
            FillLCIAp1.setVisible(false);
            FillLCIAp1.setText("");
            FillLCIName1.setVisible(true);
            FillLCIName1.setText("");
            FillLCIQuin1.setVisible(false);
            FillLCIQuin1.setSelectedIndex(0);

        }
        if (FillLCI1.getSelectedIndex() == 4) {
            FillLCIabel1.setVisible(true);
            FillLCIabel1.setText("Buscar Quincena:");
            FillLCIAm1.setVisible(false);
            FillLCIAm1.setText("");
            FillLCIAp1.setVisible(false);
            FillLCIAp1.setText("");
            FillLCIName1.setVisible(false);
            FillLCIName1.setText("");
            FillLCIQuin1.setVisible(true);
            FillLCIQuin1.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCI1ItemStateChanged

    private void TableLDACIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableLDACIMouseClicked
        DefaultTableModel model = (DefaultTableModel) TableLDACI.getModel();

        int fila = TableLDACI.getSelectedRow();
        LDA.setText(String.valueOf(TableLDACI.getValueAt(fila, 0)));
        LDAZon.setText(String.valueOf(TableLDACI.getValueAt(fila, 1)));
        String combo1 = model.getValueAt(fila, 2).toString();
        for (int i = 0; i < LDAQuin.getItemCount(); i++) {
            if (LDAQuin.getItemAt(i).equalsIgnoreCase(combo1)) {
                LDAQuin.setSelectedIndex(i);
            }
        }
        LDAAp.setText(String.valueOf(TableLDACI.getValueAt(fila, 3)));
        LDAAm.setText(String.valueOf(TableLDACI.getValueAt(fila, 4)));
        LDAName.setText(String.valueOf(TableLDACI.getValueAt(fila, 5)));
        ExcelCI.setVisible(true);

    }//GEN-LAST:event_TableLDACIMouseClicked

    private void FillLCIQuinItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIQuinItemStateChanged
        MDLDA();
    }//GEN-LAST:event_FillLCIQuinItemStateChanged

    private void FillLCINameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCINameKeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCINameKeyReleased

    private void FillLCIAmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIAmKeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIAmKeyReleased

    private void FillLCIApKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FillLCIApKeyReleased
        MDLDA();
    }//GEN-LAST:event_FillLCIApKeyReleased

    private void FillLCIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FillLCIItemStateChanged
        if (FillLCI.getSelectedIndex() == 0) {
            FillLCIabel.setVisible(false);
            FillLCIAm.setVisible(false);
            FillLCIAm.setText("");
            FillLCIAp.setVisible(false);
            FillLCIAp.setText("");
            FillLCIName.setVisible(false);
            FillLCIName.setText("");
            FillLCIQuin.setVisible(false);
            FillLCIQuin.setSelectedIndex(0);

        }
        if (FillLCI.getSelectedIndex() == 1) {
            FillLCIabel.setVisible(true);
            FillLCIabel.setText("Buscar apellido P:");
            FillLCIAm.setVisible(false);
            FillLCIAm.setText("");
            FillLCIAp.setVisible(true);
            FillLCIAp.setText("");
            FillLCIName.setVisible(false);
            FillLCIName.setText("");
            FillLCIQuin.setVisible(false);
            FillLCIQuin.setSelectedIndex(0);

        }
        if (FillLCI.getSelectedIndex() == 2) {
            FillLCIabel.setVisible(true);
            FillLCIabel.setText("Buscar apellido M:");
            FillLCIAm.setVisible(true);
            FillLCIAm.setText("");
            FillLCIAp.setVisible(false);
            FillLCIAp.setText("");
            FillLCIName.setVisible(false);
            FillLCIName.setText("");
            FillLCIQuin.setVisible(false);
            FillLCIQuin.setSelectedIndex(0);

        }
        if (FillLCI.getSelectedIndex() == 3) {
            FillLCIabel.setVisible(true);
            FillLCIabel.setText("Buscar Nombre(s):");
            FillLCIAm.setVisible(false);
            FillLCIAm.setText("");
            FillLCIAp.setVisible(false);
            FillLCIAp.setText("");
            FillLCIName.setVisible(true);
            FillLCIName.setText("");
            FillLCIQuin.setVisible(false);
            FillLCIQuin.setSelectedIndex(0);

        }
        if (FillLCI.getSelectedIndex() == 4) {
            FillLCIabel.setVisible(true);
            FillLCIabel.setText("Buscar Quincena:");
            FillLCIAm.setVisible(false);
            FillLCIAm.setText("");
            FillLCIAp.setVisible(false);
            FillLCIAp.setText("");
            FillLCIName.setVisible(false);
            FillLCIName.setText("");
            FillLCIQuin.setVisible(true);
            FillLCIQuin.setSelectedIndex(0);

        }
        MDLDA();
    }//GEN-LAST:event_FillLCIItemStateChanged

    private void FilZonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilZonaItemStateChanged
        SHempleados();
    }//GEN-LAST:event_FilZonaItemStateChanged

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
            java.util.logging.Logger.getLogger(Listas_CI_5.class
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Listas_CI_5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ADMV2;
    private javax.swing.JButton Agregar;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA1;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JMenu Depositos;
    private com.toedter.calendar.JDateChooser DiaCom1;
    private com.toedter.calendar.JDateChooser DiaCom10;
    private com.toedter.calendar.JDateChooser DiaCom11;
    private com.toedter.calendar.JDateChooser DiaCom12;
    private com.toedter.calendar.JDateChooser DiaCom13;
    private com.toedter.calendar.JDateChooser DiaCom14;
    private com.toedter.calendar.JDateChooser DiaCom15;
    private com.toedter.calendar.JDateChooser DiaCom16;
    private com.toedter.calendar.JDateChooser DiaCom2;
    private com.toedter.calendar.JDateChooser DiaCom3;
    private com.toedter.calendar.JDateChooser DiaCom4;
    private com.toedter.calendar.JDateChooser DiaCom5;
    private com.toedter.calendar.JDateChooser DiaCom6;
    private com.toedter.calendar.JDateChooser DiaCom7;
    private com.toedter.calendar.JDateChooser DiaCom8;
    private com.toedter.calendar.JDateChooser DiaCom9;
    private com.toedter.calendar.JDateChooser DiaCor1;
    private com.toedter.calendar.JDateChooser DiaCor10;
    private com.toedter.calendar.JDateChooser DiaCor11;
    private com.toedter.calendar.JDateChooser DiaCor12;
    private com.toedter.calendar.JDateChooser DiaCor13;
    private com.toedter.calendar.JDateChooser DiaCor14;
    private com.toedter.calendar.JDateChooser DiaCor15;
    private com.toedter.calendar.JDateChooser DiaCor16;
    private com.toedter.calendar.JDateChooser DiaCor2;
    private com.toedter.calendar.JDateChooser DiaCor3;
    private com.toedter.calendar.JDateChooser DiaCor4;
    private com.toedter.calendar.JDateChooser DiaCor5;
    private com.toedter.calendar.JDateChooser DiaCor6;
    private com.toedter.calendar.JDateChooser DiaCor7;
    private com.toedter.calendar.JDateChooser DiaCor8;
    private com.toedter.calendar.JDateChooser DiaCor9;
    private javax.swing.JTable EmpleadosSh;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JButton ExcelCI;
    private com.toedter.calendar.JDateChooser Fecha1;
    private javax.swing.JComboBox<String> FilZona;
    private javax.swing.JComboBox<String> FillLCI;
    private javax.swing.JComboBox<String> FillLCI1;
    private javax.swing.JComboBox<String> FillLCI2;
    private javax.swing.JComboBox<String> FillLCI3;
    private javax.swing.JComboBox<String> FillLCI4;
    private javax.swing.JComboBox<String> FillLCI5;
    private javax.swing.JComboBox<String> FillLCI6;
    private javax.swing.JComboBox<String> FillLCI7;
    private javax.swing.JComboBox<String> FillLCI8;
    private javax.swing.JComboBox<String> FillLCI9;
    private javax.swing.JTextField FillLCIAm;
    private javax.swing.JTextField FillLCIAm1;
    private javax.swing.JTextField FillLCIAm2;
    private javax.swing.JTextField FillLCIAm3;
    private javax.swing.JTextField FillLCIAm4;
    private javax.swing.JTextField FillLCIAm5;
    private javax.swing.JTextField FillLCIAm6;
    private javax.swing.JTextField FillLCIAm7;
    private javax.swing.JTextField FillLCIAm8;
    private javax.swing.JTextField FillLCIAm9;
    private javax.swing.JTextField FillLCIAp;
    private javax.swing.JTextField FillLCIAp1;
    private javax.swing.JTextField FillLCIAp2;
    private javax.swing.JTextField FillLCIAp3;
    private javax.swing.JTextField FillLCIAp4;
    private javax.swing.JTextField FillLCIAp5;
    private javax.swing.JTextField FillLCIAp6;
    private javax.swing.JTextField FillLCIAp7;
    private javax.swing.JTextField FillLCIAp8;
    private javax.swing.JTextField FillLCIAp9;
    private javax.swing.JTextField FillLCIName;
    private javax.swing.JTextField FillLCIName1;
    private javax.swing.JTextField FillLCIName2;
    private javax.swing.JTextField FillLCIName3;
    private javax.swing.JTextField FillLCIName4;
    private javax.swing.JTextField FillLCIName5;
    private javax.swing.JTextField FillLCIName6;
    private javax.swing.JTextField FillLCIName7;
    private javax.swing.JTextField FillLCIName8;
    private javax.swing.JTextField FillLCIName9;
    private javax.swing.JComboBox<String> FillLCIQuin;
    private javax.swing.JComboBox<String> FillLCIQuin1;
    private javax.swing.JComboBox<String> FillLCIQuin2;
    private javax.swing.JComboBox<String> FillLCIQuin3;
    private javax.swing.JComboBox<String> FillLCIQuin4;
    private javax.swing.JComboBox<String> FillLCIQuin5;
    private javax.swing.JComboBox<String> FillLCIQuin6;
    private javax.swing.JComboBox<String> FillLCIQuin7;
    private javax.swing.JComboBox<String> FillLCIQuin8;
    private javax.swing.JComboBox<String> FillLCIQuin9;
    private javax.swing.JLabel FillLCIabel;
    private javax.swing.JLabel FillLCIabel1;
    private javax.swing.JLabel FillLCIabel2;
    private javax.swing.JLabel FillLCIabel3;
    private javax.swing.JLabel FillLCIabel4;
    private javax.swing.JLabel FillLCIabel5;
    private javax.swing.JLabel FillLCIabel6;
    private javax.swing.JLabel FillLCIabel7;
    private javax.swing.JLabel FillLCIabel8;
    private javax.swing.JLabel FillLCIabel9;
    private javax.swing.JMenuItem General;
    private javax.swing.JTextField LDA;
    private javax.swing.JMenuItem LDA1;
    private javax.swing.JTextField LDAAm;
    private javax.swing.JTextField LDAAp;
    private javax.swing.JTextField LDAName;
    private javax.swing.JComboBox<String> LDAQuin;
    private javax.swing.JTextField LDAZon;
    private javax.swing.JComboBox<String> LDAfil;
    private javax.swing.JTextField LDAfilam;
    private javax.swing.JTextField LDAfilap;
    private javax.swing.JTextField LDAfilname;
    private javax.swing.JLabel LabelFil;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JCheckBox NYear;
    private javax.swing.JMenuItem NomSemGen;
    private javax.swing.JMenuItem Nomsem;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT1;
    private javax.swing.JMenuItem PRES;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JMenuItem PresSem;
    private javax.swing.JMenu Reportes;
    private javax.swing.JTable TableLDACI;
    private javax.swing.JTable TableLDACI1;
    private javax.swing.JTable TableLDACI2;
    private javax.swing.JTable TableLDACI3;
    private javax.swing.JTable TableLDACI4;
    private javax.swing.JTable TableLDACI5;
    private javax.swing.JTable TableLDACI6;
    private javax.swing.JTable TableLDACI7;
    private javax.swing.JTable TableLDACI8;
    private javax.swing.JTable TableLDACI9;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JLabel ULDA;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
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
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
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
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}
