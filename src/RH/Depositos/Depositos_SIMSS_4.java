package RH.Depositos;

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
public final class Depositos_SIMSS_4 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();
    ColorRH colores = new ColorRH();
    Logica_usuarios usr;
    Logica_permisos LP;

    public Depositos_SIMSS_4() {
        initComponents();
        FunMD();
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas zz7 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas7 = new DefaultComboBoxModel(zz7.mostrarzonas());
        FZservicio7.setModel(modelzonas7);
        FiltrosZonas zz6 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas6 = new DefaultComboBoxModel(zz6.mostrarzonas());
        FZservicio6.setModel(modelzonas6);
        FiltrosZonas zz5 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas5 = new DefaultComboBoxModel(zz5.mostrarzonas());
        FZservicio5.setModel(modelzonas5);
        FiltrosZonas zz4 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas4 = new DefaultComboBoxModel(zz4.mostrarzonas());
        FZservicio4.setModel(modelzonas4);
        FiltrosZonas zz3 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas3 = new DefaultComboBoxModel(zz3.mostrarzonas());
        FZservicio3.setModel(modelzonas3);
        FiltrosZonas zz2 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas2 = new DefaultComboBoxModel(zz2.mostrarzonas());
        FZservicio2.setModel(modelzonas2);
        FiltrosZonas zz1 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas1 = new DefaultComboBoxModel(zz1.mostrarzonas());
        FZservicio1.setModel(modelzonas1);
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FZservicio.setModel(modelzonas);
        FiltrosZonas FSZP7 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP7 = new DefaultComboBoxModel(FSZP7.mostrarzonas());
        FiltroSZP7.setModel(modelFSZP7);
        FiltrosZonas FSZP6 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP6 = new DefaultComboBoxModel(FSZP6.mostrarzonas());
        FiltroSZP6.setModel(modelFSZP6);
        FiltrosZonas FSZP5 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP5 = new DefaultComboBoxModel(FSZP5.mostrarzonas());
        FiltroSZP5.setModel(modelFSZP5);
        FiltrosZonas FSZP4 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP4 = new DefaultComboBoxModel(FSZP4.mostrarzonas());
        FiltroSZP4.setModel(modelFSZP4);
        FiltrosZonas FSZP3 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP3 = new DefaultComboBoxModel(FSZP3.mostrarzonas());
        FiltroSZP3.setModel(modelFSZP3);
        FiltrosZonas FSZP2 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP2 = new DefaultComboBoxModel(FSZP2.mostrarzonas());
        FiltroSZP2.setModel(modelFSZP2);
        FiltrosZonas FSZP1 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP1 = new DefaultComboBoxModel(FSZP1.mostrarzonas());
        FiltroSZP1.setModel(modelFSZP1);
        FiltrosZonas FSZP = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP = new DefaultComboBoxModel(FSZP.mostrarzonas());
        FiltroSZP.setModel(modelFSZP);
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        FZservicio.setModel(MODELFZS);
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        LabelBE.setVisible(false);
        LabelBQ.setVisible(false);
        LabelBS.setVisible(false);
        LabelSZ.setVisible(false);
        Nominab.setVisible(false);
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
        FiltroSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelBQP.setVisible(false);
        LabelBSP.setVisible(false);
        LabelSZP.setVisible(false);
        LabelNDFP.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        busp7.setVisible(false);
        BAppag7.setVisible(false);
        Bampag7.setVisible(false);
        LabelBEP7.setVisible(false);
        LabelBQP7.setVisible(false);
        FiltroQP7.setVisible(false);
        FiltroServP7.setVisible(false);
        LabelBSP7.setVisible(false);
        FiltroSZP7.setVisible(false);
        LabelSZP7.setVisible(false);
        filtroNDFP7.setVisible(false);
        LabelNDFP7.setVisible(false);
        busp6.setVisible(false);
        BAppag6.setVisible(false);
        Bampag6.setVisible(false);
        LabelBEP6.setVisible(false);
        LabelBQP6.setVisible(false);
        FiltroQP6.setVisible(false);
        FiltroServP6.setVisible(false);
        LabelBSP6.setVisible(false);
        FiltroSZP6.setVisible(false);
        LabelSZP6.setVisible(false);
        filtroNDFP6.setVisible(false);
        LabelNDFP6.setVisible(false);
        busp5.setVisible(false);
        BAppag5.setVisible(false);
        Bampag5.setVisible(false);
        LabelBEP5.setVisible(false);
        LabelBQP5.setVisible(false);
        FiltroQP5.setVisible(false);
        FiltroServP5.setVisible(false);
        LabelBSP5.setVisible(false);
        FiltroSZP5.setVisible(false);
        LabelSZP5.setVisible(false);
        filtroNDFP5.setVisible(false);
        LabelNDFP5.setVisible(false);
        busp4.setVisible(false);
        BAppag4.setVisible(false);
        Bampag4.setVisible(false);
        LabelBEP4.setVisible(false);
        LabelBQP4.setVisible(false);
        FiltroQP4.setVisible(false);
        FiltroServP4.setVisible(false);
        LabelBSP4.setVisible(false);
        FiltroSZP4.setVisible(false);
        LabelSZP4.setVisible(false);
        filtroNDFP4.setVisible(false);
        LabelNDFP4.setVisible(false);
        busp3.setVisible(false);
        BAppag3.setVisible(false);
        Bampag3.setVisible(false);
        LabelBEP3.setVisible(false);
        LabelBQP3.setVisible(false);
        FiltroQP3.setVisible(false);
        FiltroServP3.setVisible(false);
        LabelBSP3.setVisible(false);
        FiltroSZP3.setVisible(false);
        LabelSZP3.setVisible(false);
        filtroNDFP3.setVisible(false);
        LabelNDFP3.setVisible(false);
        busp2.setVisible(false);
        BAppag2.setVisible(false);
        Bampag2.setVisible(false);
        LabelBEP2.setVisible(false);
        LabelBQP2.setVisible(false);
        FiltroQP2.setVisible(false);
        FiltroServP2.setVisible(false);
        LabelBSP2.setVisible(false);
        FiltroSZP2.setVisible(false);
        LabelSZP2.setVisible(false);
        filtroNDFP2.setVisible(false);
        LabelNDFP2.setVisible(false);
        busp1.setVisible(false);
        BAppag1.setVisible(false);
        Bampag1.setVisible(false);
        LabelBEP1.setVisible(false);
        LabelBQP1.setVisible(false);
        FiltroQP1.setVisible(false);
        FiltroServP1.setVisible(false);
        LabelBSP1.setVisible(false);
        FiltroSZP1.setVisible(false);
        LabelSZP1.setVisible(false);
        filtroNDFP1.setVisible(false);
        LabelNDFP1.setVisible(false);
        busp.setVisible(false);
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        LabelBEP.setVisible(false);
        LabelBQP.setVisible(false);
        FiltroQP.setVisible(false);
        FiltroServP.setVisible(false);
        LabelBSP.setVisible(false);
        FiltroSZP.setVisible(false);
        LabelSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelNDFP.setVisible(false);
        busp1.setVisible(false);
        BAppag1.setVisible(false);
        Bampag1.setVisible(false);
        LabelBEP1.setVisible(false);
        LabelBQP1.setVisible(false);
        FiltroQP1.setVisible(false);
        FiltroServP1.setVisible(false);
        LabelBSP1.setVisible(false);
        FiltroSZP1.setVisible(false);
        LabelSZP1.setVisible(false);
        filtroNDFP1.setVisible(false);
        LabelNDFP1.setVisible(false);
        busp2.setVisible(false);
        BAppag2.setVisible(false);
        Bampag2.setVisible(false);
        LabelBEP2.setVisible(false);
        LabelBQP2.setVisible(false);
        FiltroQP2.setVisible(false);
        FiltroServP2.setVisible(false);
        LabelBSP2.setVisible(false);
        FiltroSZP2.setVisible(false);
        LabelSZP2.setVisible(false);
        filtroNDFP2.setVisible(false);
        LabelNDFP2.setVisible(false);
        busp3.setVisible(false);
        BAppag3.setVisible(false);
        Bampag3.setVisible(false);
        LabelBEP3.setVisible(false);
        LabelBQP3.setVisible(false);
        FiltroQP3.setVisible(false);
        FiltroServP3.setVisible(false);
        LabelBSP3.setVisible(false);
        FiltroSZP3.setVisible(false);
        LabelSZP3.setVisible(false);
        filtroNDFP3.setVisible(false);
        LabelNDFP3.setVisible(false);
        busp4.setVisible(false);
        BAppag4.setVisible(false);
        Bampag4.setVisible(false);
        LabelBEP4.setVisible(false);
        LabelBQP4.setVisible(false);
        FiltroQP4.setVisible(false);
        FiltroServP4.setVisible(false);
        LabelBSP4.setVisible(false);
        FiltroSZP4.setVisible(false);
        LabelSZP4.setVisible(false);
        filtroNDFP4.setVisible(false);
        LabelNDFP4.setVisible(false);
        busp5.setVisible(false);
        BAppag5.setVisible(false);
        Bampag5.setVisible(false);
        LabelBEP5.setVisible(false);
        LabelBQP5.setVisible(false);
        FiltroQP5.setVisible(false);
        FiltroServP5.setVisible(false);
        LabelBSP5.setVisible(false);
        FiltroSZP5.setVisible(false);
        LabelSZP5.setVisible(false);
        filtroNDFP5.setVisible(false);
        LabelNDFP5.setVisible(false);
        busp6.setVisible(false);
        BAppag6.setVisible(false);
        Bampag6.setVisible(false);
        LabelBEP6.setVisible(false);
        LabelBQP6.setVisible(false);
        FiltroQP6.setVisible(false);
        FiltroServP6.setVisible(false);
        LabelBSP6.setVisible(false);
        FiltroSZP6.setVisible(false);
        LabelSZP6.setVisible(false);
        filtroNDFP6.setVisible(false);
        LabelNDFP6.setVisible(false);
        busp7.setVisible(false);
        BAppag7.setVisible(false);
        Bampag7.setVisible(false);
        LabelBEP7.setVisible(false);
        LabelBQP7.setVisible(false);
        FiltroQP7.setVisible(false);
        FiltroServP7.setVisible(false);
        LabelBSP7.setVisible(false);
        FiltroSZP7.setVisible(false);
        LabelSZP7.setVisible(false);
        filtroNDFP7.setVisible(false);
        LabelNDFP7.setVisible(false);
        LabelBE1.setVisible(false);
        LabelSZ1.setVisible(false);
        FApT1.setVisible(false);
        FAmT1.setVisible(false);
        Nominab1.setVisible(false);
        FiltroSnomina1.setVisible(false);
        LabelBS1.setVisible(false);
        FZservicio1.setVisible(false);
        LabelSZ.setVisible(false);
        FiltroQuincenanomina1.setVisible(false);
        LabelBQ1.setVisible(false);
        FiltroNDF1.setVisible(false);
        LabelBNDF1.setVisible(false);
        LabelBE2.setVisible(false);
        FApT2.setVisible(false);
        FAmT2.setVisible(false);
        Nominab2.setVisible(false);
        FiltroSnomina2.setVisible(false);
        LabelBS2.setVisible(false);
        FZservicio2.setVisible(false);
        LabelSZ2.setVisible(false);
        FiltroQuincenanomina2.setVisible(false);
        LabelBQ2.setVisible(false);
        FiltroNDF2.setVisible(false);
        LabelBNDF2.setVisible(false);
        LabelBE3.setVisible(false);
        FApT3.setVisible(false);
        FAmT3.setVisible(false);
        Nominab3.setVisible(false);
        FiltroSnomina3.setVisible(false);
        LabelBS3.setVisible(false);
        FZservicio3.setVisible(false);
        LabelSZ3.setVisible(false);
        FiltroQuincenanomina3.setVisible(false);
        LabelBQ3.setVisible(false);
        FiltroNDF3.setVisible(false);
        LabelBNDF3.setVisible(false);
        LabelBE4.setVisible(false);
        FApT4.setVisible(false);
        FAmT4.setVisible(false);
        Nominab4.setVisible(false);
        FiltroSnomina4.setVisible(false);
        LabelBS4.setVisible(false);
        FZservicio4.setVisible(false);
        LabelSZ4.setVisible(false);
        FiltroQuincenanomina4.setVisible(false);
        LabelBQ4.setVisible(false);
        FiltroNDF4.setVisible(false);
        LabelBNDF4.setVisible(false);
        LabelBE5.setVisible(false);
        FApT5.setVisible(false);
        FAmT5.setVisible(false);
        Nominab5.setVisible(false);
        FiltroSnomina5.setVisible(false);
        LabelBS5.setVisible(false);
        FZservicio5.setVisible(false);
        LabelSZ5.setVisible(false);
        FiltroQuincenanomina5.setVisible(false);
        LabelBQ5.setVisible(false);
        FiltroNDF5.setVisible(false);
        LabelBNDF5.setVisible(false);
        LabelBE6.setVisible(false);
        FApT6.setVisible(false);
        FAmT6.setVisible(false);
        Nominab6.setVisible(false);
        FiltroSnomina6.setVisible(false);
        LabelBS6.setVisible(false);
        FZservicio6.setVisible(false);
        LabelSZ6.setVisible(false);
        FiltroQuincenanomina6.setVisible(false);
        LabelBQ6.setVisible(false);
        FiltroNDF6.setVisible(false);
        LabelBNDF6.setVisible(false);
        LabelBE7.setVisible(false);
        FApT7.setVisible(false);
        FAmT7.setVisible(false);
        Nominab7.setVisible(false);
        FiltroSnomina7.setVisible(false);
        LabelBS7.setVisible(false);
        FZservicio7.setVisible(false);
        LabelSZ7.setVisible(false);
        FiltroQuincenanomina7.setVisible(false);
        LabelBQ7.setVisible(false);
        FiltroNDF7.setVisible(false);
        LabelBNDF7.setVisible(false);
        //</editor-fold>
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        año.setCalendar(fecha_actual);
        FiltrosZonas FZSnomdep = new FiltrosZonas();
        DefaultComboBoxModel MODELFZSnomdep = new DefaultComboBoxModel(FZSnomdep.mostrarzonas());
        FZservicio1.setModel(MODELFZSnomdep);
        setIconImage(new ImageIcon(Depositos_SIMSS_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        MDepFA();
    }

    public Depositos_SIMSS_4(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        FunMD();
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas zz7 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas7 = new DefaultComboBoxModel(zz7.mostrarzonas());
        FZservicio7.setModel(modelzonas7);
        FiltrosZonas zz6 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas6 = new DefaultComboBoxModel(zz6.mostrarzonas());
        FZservicio6.setModel(modelzonas6);
        FiltrosZonas zz5 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas5 = new DefaultComboBoxModel(zz5.mostrarzonas());
        FZservicio5.setModel(modelzonas5);
        FiltrosZonas zz4 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas4 = new DefaultComboBoxModel(zz4.mostrarzonas());
        FZservicio4.setModel(modelzonas4);
        FiltrosZonas zz3 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas3 = new DefaultComboBoxModel(zz3.mostrarzonas());
        FZservicio3.setModel(modelzonas3);
        FiltrosZonas zz2 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas2 = new DefaultComboBoxModel(zz2.mostrarzonas());
        FZservicio2.setModel(modelzonas2);
        FiltrosZonas zz1 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas1 = new DefaultComboBoxModel(zz1.mostrarzonas());
        FZservicio1.setModel(modelzonas1);
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FZservicio.setModel(modelzonas);
        FiltrosZonas FSZP7 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP7 = new DefaultComboBoxModel(FSZP7.mostrarzonas());
        FiltroSZP7.setModel(modelFSZP7);
        FiltrosZonas FSZP6 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP6 = new DefaultComboBoxModel(FSZP6.mostrarzonas());
        FiltroSZP6.setModel(modelFSZP6);
        FiltrosZonas FSZP5 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP5 = new DefaultComboBoxModel(FSZP5.mostrarzonas());
        FiltroSZP5.setModel(modelFSZP5);
        FiltrosZonas FSZP4 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP4 = new DefaultComboBoxModel(FSZP4.mostrarzonas());
        FiltroSZP4.setModel(modelFSZP4);
        FiltrosZonas FSZP3 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP3 = new DefaultComboBoxModel(FSZP3.mostrarzonas());
        FiltroSZP3.setModel(modelFSZP3);
        FiltrosZonas FSZP2 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP2 = new DefaultComboBoxModel(FSZP2.mostrarzonas());
        FiltroSZP2.setModel(modelFSZP2);
        FiltrosZonas FSZP1 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP1 = new DefaultComboBoxModel(FSZP1.mostrarzonas());
        FiltroSZP1.setModel(modelFSZP1);
        FiltrosZonas FSZP = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP = new DefaultComboBoxModel(FSZP.mostrarzonas());
        FiltroSZP.setModel(modelFSZP);
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        FZservicio.setModel(MODELFZS);
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        LabelBE.setVisible(false);
        LabelBQ.setVisible(false);
        LabelBS.setVisible(false);
        LabelSZ.setVisible(false);
        Nominab.setVisible(false);
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
        FiltroSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelBQP.setVisible(false);
        LabelBSP.setVisible(false);
        LabelSZP.setVisible(false);
        LabelNDFP.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        busp7.setVisible(false);
        BAppag7.setVisible(false);
        Bampag7.setVisible(false);
        LabelBEP7.setVisible(false);
        LabelBQP7.setVisible(false);
        FiltroQP7.setVisible(false);
        FiltroServP7.setVisible(false);
        LabelBSP7.setVisible(false);
        FiltroSZP7.setVisible(false);
        LabelSZP7.setVisible(false);
        filtroNDFP7.setVisible(false);
        LabelNDFP7.setVisible(false);
        busp6.setVisible(false);
        BAppag6.setVisible(false);
        Bampag6.setVisible(false);
        LabelBEP6.setVisible(false);
        LabelBQP6.setVisible(false);
        FiltroQP6.setVisible(false);
        FiltroServP6.setVisible(false);
        LabelBSP6.setVisible(false);
        FiltroSZP6.setVisible(false);
        LabelSZP6.setVisible(false);
        filtroNDFP6.setVisible(false);
        LabelNDFP6.setVisible(false);
        busp5.setVisible(false);
        BAppag5.setVisible(false);
        Bampag5.setVisible(false);
        LabelBEP5.setVisible(false);
        LabelBQP5.setVisible(false);
        FiltroQP5.setVisible(false);
        FiltroServP5.setVisible(false);
        LabelBSP5.setVisible(false);
        FiltroSZP5.setVisible(false);
        LabelSZP5.setVisible(false);
        filtroNDFP5.setVisible(false);
        LabelNDFP5.setVisible(false);
        busp4.setVisible(false);
        BAppag4.setVisible(false);
        Bampag4.setVisible(false);
        LabelBEP4.setVisible(false);
        LabelBQP4.setVisible(false);
        FiltroQP4.setVisible(false);
        FiltroServP4.setVisible(false);
        LabelBSP4.setVisible(false);
        FiltroSZP4.setVisible(false);
        LabelSZP4.setVisible(false);
        filtroNDFP4.setVisible(false);
        LabelNDFP4.setVisible(false);
        busp3.setVisible(false);
        BAppag3.setVisible(false);
        Bampag3.setVisible(false);
        LabelBEP3.setVisible(false);
        LabelBQP3.setVisible(false);
        FiltroQP3.setVisible(false);
        FiltroServP3.setVisible(false);
        LabelBSP3.setVisible(false);
        FiltroSZP3.setVisible(false);
        LabelSZP3.setVisible(false);
        filtroNDFP3.setVisible(false);
        LabelNDFP3.setVisible(false);
        busp2.setVisible(false);
        BAppag2.setVisible(false);
        Bampag2.setVisible(false);
        LabelBEP2.setVisible(false);
        LabelBQP2.setVisible(false);
        FiltroQP2.setVisible(false);
        FiltroServP2.setVisible(false);
        LabelBSP2.setVisible(false);
        FiltroSZP2.setVisible(false);
        LabelSZP2.setVisible(false);
        filtroNDFP2.setVisible(false);
        LabelNDFP2.setVisible(false);
        busp1.setVisible(false);
        BAppag1.setVisible(false);
        Bampag1.setVisible(false);
        LabelBEP1.setVisible(false);
        LabelBQP1.setVisible(false);
        FiltroQP1.setVisible(false);
        FiltroServP1.setVisible(false);
        LabelBSP1.setVisible(false);
        FiltroSZP1.setVisible(false);
        LabelSZP1.setVisible(false);
        filtroNDFP1.setVisible(false);
        LabelNDFP1.setVisible(false);
        busp.setVisible(false);
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        LabelBEP.setVisible(false);
        LabelBQP.setVisible(false);
        FiltroQP.setVisible(false);
        FiltroServP.setVisible(false);
        LabelBSP.setVisible(false);
        FiltroSZP.setVisible(false);
        LabelSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelNDFP.setVisible(false);
        busp1.setVisible(false);
        BAppag1.setVisible(false);
        Bampag1.setVisible(false);
        LabelBEP1.setVisible(false);
        LabelBQP1.setVisible(false);
        FiltroQP1.setVisible(false);
        FiltroServP1.setVisible(false);
        LabelBSP1.setVisible(false);
        FiltroSZP1.setVisible(false);
        LabelSZP1.setVisible(false);
        filtroNDFP1.setVisible(false);
        LabelNDFP1.setVisible(false);
        busp2.setVisible(false);
        BAppag2.setVisible(false);
        Bampag2.setVisible(false);
        LabelBEP2.setVisible(false);
        LabelBQP2.setVisible(false);
        FiltroQP2.setVisible(false);
        FiltroServP2.setVisible(false);
        LabelBSP2.setVisible(false);
        FiltroSZP2.setVisible(false);
        LabelSZP2.setVisible(false);
        filtroNDFP2.setVisible(false);
        LabelNDFP2.setVisible(false);
        busp3.setVisible(false);
        BAppag3.setVisible(false);
        Bampag3.setVisible(false);
        LabelBEP3.setVisible(false);
        LabelBQP3.setVisible(false);
        FiltroQP3.setVisible(false);
        FiltroServP3.setVisible(false);
        LabelBSP3.setVisible(false);
        FiltroSZP3.setVisible(false);
        LabelSZP3.setVisible(false);
        filtroNDFP3.setVisible(false);
        LabelNDFP3.setVisible(false);
        busp4.setVisible(false);
        BAppag4.setVisible(false);
        Bampag4.setVisible(false);
        LabelBEP4.setVisible(false);
        LabelBQP4.setVisible(false);
        FiltroQP4.setVisible(false);
        FiltroServP4.setVisible(false);
        LabelBSP4.setVisible(false);
        FiltroSZP4.setVisible(false);
        LabelSZP4.setVisible(false);
        filtroNDFP4.setVisible(false);
        LabelNDFP4.setVisible(false);
        busp5.setVisible(false);
        BAppag5.setVisible(false);
        Bampag5.setVisible(false);
        LabelBEP5.setVisible(false);
        LabelBQP5.setVisible(false);
        FiltroQP5.setVisible(false);
        FiltroServP5.setVisible(false);
        LabelBSP5.setVisible(false);
        FiltroSZP5.setVisible(false);
        LabelSZP5.setVisible(false);
        filtroNDFP5.setVisible(false);
        LabelNDFP5.setVisible(false);
        busp6.setVisible(false);
        BAppag6.setVisible(false);
        Bampag6.setVisible(false);
        LabelBEP6.setVisible(false);
        LabelBQP6.setVisible(false);
        FiltroQP6.setVisible(false);
        FiltroServP6.setVisible(false);
        LabelBSP6.setVisible(false);
        FiltroSZP6.setVisible(false);
        LabelSZP6.setVisible(false);
        filtroNDFP6.setVisible(false);
        LabelNDFP6.setVisible(false);
        busp7.setVisible(false);
        BAppag7.setVisible(false);
        Bampag7.setVisible(false);
        LabelBEP7.setVisible(false);
        LabelBQP7.setVisible(false);
        FiltroQP7.setVisible(false);
        FiltroServP7.setVisible(false);
        LabelBSP7.setVisible(false);
        FiltroSZP7.setVisible(false);
        LabelSZP7.setVisible(false);
        filtroNDFP7.setVisible(false);
        LabelNDFP7.setVisible(false);
        LabelBE1.setVisible(false);
        LabelSZ1.setVisible(false);
        FApT1.setVisible(false);
        FAmT1.setVisible(false);
        Nominab1.setVisible(false);
        FiltroSnomina1.setVisible(false);
        LabelBS1.setVisible(false);
        FZservicio1.setVisible(false);
        LabelSZ.setVisible(false);
        FiltroQuincenanomina1.setVisible(false);
        LabelBQ1.setVisible(false);
        FiltroNDF1.setVisible(false);
        LabelBNDF1.setVisible(false);
        LabelBE2.setVisible(false);
        FApT2.setVisible(false);
        FAmT2.setVisible(false);
        Nominab2.setVisible(false);
        FiltroSnomina2.setVisible(false);
        LabelBS2.setVisible(false);
        FZservicio2.setVisible(false);
        LabelSZ2.setVisible(false);
        FiltroQuincenanomina2.setVisible(false);
        LabelBQ2.setVisible(false);
        FiltroNDF2.setVisible(false);
        LabelBNDF2.setVisible(false);
        LabelBE3.setVisible(false);
        FApT3.setVisible(false);
        FAmT3.setVisible(false);
        Nominab3.setVisible(false);
        FiltroSnomina3.setVisible(false);
        LabelBS3.setVisible(false);
        FZservicio3.setVisible(false);
        LabelSZ3.setVisible(false);
        FiltroQuincenanomina3.setVisible(false);
        LabelBQ3.setVisible(false);
        FiltroNDF3.setVisible(false);
        LabelBNDF3.setVisible(false);
        LabelBE4.setVisible(false);
        FApT4.setVisible(false);
        FAmT4.setVisible(false);
        Nominab4.setVisible(false);
        FiltroSnomina4.setVisible(false);
        LabelBS4.setVisible(false);
        FZservicio4.setVisible(false);
        LabelSZ4.setVisible(false);
        FiltroQuincenanomina4.setVisible(false);
        LabelBQ4.setVisible(false);
        FiltroNDF4.setVisible(false);
        LabelBNDF4.setVisible(false);
        LabelBE5.setVisible(false);
        FApT5.setVisible(false);
        FAmT5.setVisible(false);
        Nominab5.setVisible(false);
        FiltroSnomina5.setVisible(false);
        LabelBS5.setVisible(false);
        FZservicio5.setVisible(false);
        LabelSZ5.setVisible(false);
        FiltroQuincenanomina5.setVisible(false);
        LabelBQ5.setVisible(false);
        FiltroNDF5.setVisible(false);
        LabelBNDF5.setVisible(false);
        LabelBE6.setVisible(false);
        FApT6.setVisible(false);
        FAmT6.setVisible(false);
        Nominab6.setVisible(false);
        FiltroSnomina6.setVisible(false);
        LabelBS6.setVisible(false);
        FZservicio6.setVisible(false);
        LabelSZ6.setVisible(false);
        FiltroQuincenanomina6.setVisible(false);
        LabelBQ6.setVisible(false);
        FiltroNDF6.setVisible(false);
        LabelBNDF6.setVisible(false);
        LabelBE7.setVisible(false);
        FApT7.setVisible(false);
        FAmT7.setVisible(false);
        Nominab7.setVisible(false);
        FiltroSnomina7.setVisible(false);
        LabelBS7.setVisible(false);
        FZservicio7.setVisible(false);
        LabelSZ7.setVisible(false);
        FiltroQuincenanomina7.setVisible(false);
        LabelBQ7.setVisible(false);
        FiltroNDF7.setVisible(false);
        LabelBNDF7.setVisible(false);
        //</editor-fold>
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        año.setCalendar(fecha_actual);
        FiltrosZonas FZSnomdep = new FiltrosZonas();
        DefaultComboBoxModel MODELFZSnomdep = new DefaultComboBoxModel(FZSnomdep.mostrarzonas());
        FZservicio1.setModel(MODELFZSnomdep);
        setIconImage(new ImageIcon(Depositos_SIMSS_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        MDepFA();
        setTitle("RH: Depositos con imss Quincenales # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
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
        String SQL = "UPDATE `rh.depositos." + Zon.getText() + ".simss` SET `#Lista` = ?,"
                + " `#Empleado` = ?, `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, "
                + "`Zona` = ?, `Servicio` = ?, `Sueldo` = ?, `Bono` = ?, `Por dia` = ?,"
                + " `Quincena del mes` = ?, `Año` = ?, `Dias de incapacidad` = ?, "
                + "`Pago seguro` = ?, `Dias de vacaciones` = ?, `Pago de vacaciones` = ?,"
                + " `Dias de descanso` = ?, `Pago de dias descansados` = ?, `Dias laborados` = ?,"
                + " `Pago de dias laborados` = ?, `Descansos trabajados` = ?, `Pago de Descansos trabajados` = ?,"
                + " `DSGS` = ?, `Pago de dias de DSGS` = ?, `Faltas justificadas` = ?,"
                + " `Descanso otorgado` = ?, `Dias festivos` = ?, `Pago de dias festivos` = ?,"
                + " `Dias festivos trabajados` = ?, `Pago de dias festivos trabajados` = ?,"
                + " `Retardos` = ?, `Pago con retardos` = ?, `Apoyo` = ?, `Lugar` = ?, `Rembolso` = ?,"
                + " `Adicionales` = ?, `Faltas` = ?, `Descuento por faltas` = ?, `Descuento imss` = ?, "
                + "`Faltantes de boleto` = ?, `Sancion` = ?, `Chamarra` = ?, `Chaleco` = ?,"
                + " `Faltante de efectivo` = ?, `Grua` = ?, `Pantalon` = ?, `Credencial` = ?,"
                + " `Boleto perdido` = ?, `Playera` = ?, `Corbata` = ?, `Pago de prestamo` = ?, "
                + "`Caja de ahorro` = ?, `Orden de taller` = ?, `Adelanto de nomina` = ?, `Deposito` = ?, "
                + "`Fecha de deposito` = ?, `Mes de pago` = ?, `Forma de pago` = ? WHERE `rh.depositos." + Zon.getText() + ".simss`.`#Folio` = ?";
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
            pst.setInt(69, Integer.parseInt(NFnom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito Modificado.");

            Cleardeposito();

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
        MDepFA();
        MDepFT();
        MDepFP();
        MDepOfi();
        MDepNor();
        MDepPon();
        MDepS1();
        MDepS2();
    }

    // mostrar datos de nomina
    public void MDNFA() {
        //Buscar empleado
        String FiltroN = Nominab.getText();
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss`";
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos acapulco.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss`";
        String FAPNom = FApT1.getText();
        String FAMNom = FAmT1.getText();
        String FiltroSnom = FiltroSnomina1.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina1.getSelectedItem().toString();
        String FiltroFol = FiltroNDF1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos puebla.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss`";
        String FAPNom = FApT2.getText();
        String FAMNom = FAmT2.getText();
        String FiltroSnom = FiltroSnomina2.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina2.getSelectedItem().toString();
        String FiltroFol = FiltroNDF2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.foraneos toluca.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String where = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss`";
        String FAPNom = FApT3.getText();
        String FAMNom = FAmT3.getText();
        String FiltroSnom = FiltroSnomina3.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina3.getSelectedItem().toString();
        String FiltroFol = FiltroNDF3.getText();

        if (!"".equals(FiltroN)) {
            where = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            where = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            where = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            where = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            where = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            where = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.norte.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss`";
        String FAPNom = FApT4.getText();
        String FAMNom = FAmT4.getText();
        String FiltroSnom = FiltroSnomina4.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina4.getSelectedItem().toString();
        String FiltroFol = FiltroNDF4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.oficina.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss`";
        String FAPNom = FApT5.getText();
        String FAMNom = FAmT5.getText();
        String FiltroSnom = FiltroSnomina5.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina5.getSelectedItem().toString();
        String FiltroFol = FiltroNDF5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.poniente.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss`";
        String FAPNom = FApT6.getText();
        String FAMNom = FAmT6.getText();
        String FiltroSnom = FiltroSnomina6.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina6.getSelectedItem().toString();
        String FiltroFol = FiltroNDF6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 1.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        String SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss`";
        String FAPNom = FApT7.getText();
        String FAMNom = FAmT7.getText();
        String FiltroSnom = FiltroSnomina7.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina7.getSelectedItem().toString();
        String FiltroFol = FiltroNDF7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select `#lista`, `#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `por dia`, `por hora`, `quincena del mes`, `año`,`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, `Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, `Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `horas extra`, `total de horas extra`, `Retardos`, `Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`, `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, `Deposito` from `nomina.detallada.sur 2.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Descuanto por faltas");
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
        Obsdeposito.setText("0");
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
        String SQL = "INSERT INTO `rh.depositos." + Zon.getText() + ".simss`"
                + " (`#Folio`, `#Lista`, `#Empleado`, `Apellido P`, `Apellido M`, "
                + "`Nombre(s)`, `Zona`, `Servicio`, `Sueldo`, `Bono`, `Banco`, `Cuenta de banco`, "
                + "`Por dia`, `por hora`, `Quincena del mes`, `Año`, `Dias de incapacidad`, "
                + "`Pago seguro`, `Dias de vacaciones`, `Pago de vacaciones`, `Dias de descanso`, "
                + "`Pago de dias descansados`, `Dias laborados`, `Pago de dias laborados`, "
                + "`Descansos trabajados`, `Pago de Descansos trabajados`, `DSGS`, `Pago de dias de DSGS`, "
                + "`Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, `Pago de dias festivos`,"
                + " `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, "
                + "`Pago con retardos`, `Apoyo`, `Lugar`, `Rembolso`, `Adicionales`, "
                + "`horas extra`, `total de horas extra`, `Faltas`, `Descuento por faltas`,"
                + " `Infonavit`, `Fonacot`, `ISR`, `Descuento imss`, `Faltantes de boleto`, "
                + "`Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`,"
                + " `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Pago de prestamo`, "
                + "`Caja de ahorro`, `Orden de taller`, `Adelanto de nomina`, `Deposito`, "
                + "`Fecha de deposito`, `Mes de pago`, `Forma de pago`, `Observaciones`) VALUES"
                + " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar deposito: " + e.getMessage());
        }
    }

    public void MDepS2() {
        String SQL = "SELECT * FROM `rh.depositos.sur 2.simss`";
        String FiltroN = busp7.getText();
        String FAPNom = BAppag7.getText();
        String FAMNom = Bampag7.getText();
        String FiltroSnom = FiltroServP7.getSelectedItem().toString();
        String FiltroQuin = FiltroQP7.getSelectedItem().toString();
        String FiltroFol = filtroNDFP7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep7.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50,
                /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep7.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

    public void MDepS1() {
        String SQL = "SELECT * FROM `rh.depositos.sur 1.simss`";
        String FiltroN = busp6.getText();
        String FAPNom = BAppag6.getText();
        String FAMNom = Bampag6.getText();
        String FiltroSnom = FiltroServP6.getSelectedItem().toString();
        String FiltroQuin = FiltroQP6.getSelectedItem().toString();
        String FiltroFol = filtroNDFP6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep6.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep6.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en sur 1 " + e.getMessage());

        }
    }

    public void MDepOfi() {
        String SQL = "SELECT * FROM `rh.depositos.oficina.simss`";
        String FiltroN = busp5.getText();
        String FAPNom = BAppag5.getText();
        String FAMNom = Bampag5.getText();
        String FiltroSnom = FiltroServP5.getSelectedItem().toString();
        String FiltroQuin = FiltroQP5.getSelectedItem().toString();
        String FiltroFol = filtroNDFP5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.oficina.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.oficina.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.oficina.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.oficina.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.oficina`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.oficina.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep5.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep5.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en oficina " + e.getMessage());

        }
    }

    public void MDepPon() {
        String SQL = "SELECT * FROM `rh.depositos.poniente.simss`";
        String FiltroN = busp4.getText();
        String FAPNom = BAppag4.getText();
        String FAMNom = Bampag4.getText();
        String FiltroSnom = FiltroServP4.getSelectedItem().toString();
        String FiltroQuin = FiltroQP4.getSelectedItem().toString();
        String FiltroFol = filtroNDFP4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.poniente.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.poniente.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.poniente.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.poniente.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.poniente.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.poniente.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep4.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep4.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en poniente " + e.getMessage());

        }
    }

    public void MDepNor() {
        String SQL = "SELECT * FROM `rh.depositos.norte.simss`";
        String FiltroN = busp3.getText();
        String FAPNom = BAppag3.getText();
        String FAMNom = Bampag3.getText();
        String FiltroSnom = FiltroServP3.getSelectedItem().toString();
        String FiltroQuin = FiltroQP3.getSelectedItem().toString();
        String FiltroFol = filtroNDFP3.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.norte.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.norte.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.norte.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.norte.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.norte.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.norte.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep3.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep3.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en norte " + e.getMessage());

        }
    }

    public void MDepFT() {
        //Buscar servicio
        String SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss`";
        String FiltroN = busp2.getText();
        String FAPNom = BAppag2.getText();
        String FAMNom = Bampag2.getText();
        String FiltroSnom = FiltroServP2.getSelectedItem().toString();
        String FiltroQuin = FiltroQP2.getSelectedItem().toString();
        String FiltroFol = filtroNDFP2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep2.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en Foraneos toluca " + e.getMessage());

        }
    }

    public void MDepFP() {
        //Buscar servicio
        String SQL = "SELECT * FROM `rh.depositos.foraneos puebla.simss`";
        String FiltroN = busp1.getText();
        String FAPNom = BAppag1.getText();
        String FAMNom = Bampag1.getText();
        String FiltroSnom = FiltroServP1.getSelectedItem().toString();
        String FiltroQuin = FiltroQP1.getSelectedItem().toString();
        String FiltroFol = filtroNDFP1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELE CT * FROM `rh.depositos.foraneos puebla.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep1.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en Foraneos puebla " + e.getMessage());

        }

    }

    public void MDepFA() {
        //Buscar servicio
        String SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss`";
        String FiltroN = busp.getText();
        String FAPNom = BAppag.getText();
        String FAMNom = Bampag.getText();
        String FiltroSnom = FiltroServP.getSelectedItem().toString();
        String FiltroQuin = FiltroQP.getSelectedItem().toString();
        String FiltroFol = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco.simss` Where `quincena del mes` LIKE '%" + FiltroQuin + "%'";
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
            Tdep.setModel(modelo);
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
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
                /*REM*/ 50, /*ADD*/ 50, /*Fal*/ 50, /*DPF*/ 50, /*DI*/ 50,
                /*FDB*/ 50, /*SAN*/ 50, /*CHAM*/ 50, /*CHAL*/ 50, /*FDE*/ 50,
                /*GRUA*/ 50, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 50, /*PLAY*/ 50,
                /*CORB*/ 50, /*PDP*/ 50, /*CDA*/ 50, /*ODT*/ 50, /*ADN*/ 50,
                /*DEP*/ 60, /*FDD*/ 60, /*MDP*/ 50, /*FDP*/ 51,/*OBS*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tdep.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar depositos en Foraneos acapulco " + e.getMessage());

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
        TDFA1 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        Tnom1 = new javax.swing.JTable();
        LabelBE1 = new javax.swing.JLabel();
        Nominab1 = new javax.swing.JTextField();
        CS8 = new javax.swing.JButton();
        LabelBS1 = new javax.swing.JLabel();
        FiltroSnomina1 = new javax.swing.JComboBox<>();
        LabelBQ1 = new javax.swing.JLabel();
        FiltroQuincenanomina1 = new javax.swing.JComboBox<>();
        LabelSZ1 = new javax.swing.JLabel();
        FZservicio1 = new javax.swing.JComboBox<>();
        jLabel169 = new javax.swing.JLabel();
        FiltrosTD1 = new javax.swing.JComboBox<>();
        LabelBNDF1 = new javax.swing.JLabel();
        FiltroNDF1 = new javax.swing.JTextField();
        FApT1 = new javax.swing.JTextField();
        FAmT1 = new javax.swing.JTextField();
        TDFA2 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        Tnom2 = new javax.swing.JTable();
        LabelBE2 = new javax.swing.JLabel();
        Nominab2 = new javax.swing.JTextField();
        CS9 = new javax.swing.JButton();
        LabelBS2 = new javax.swing.JLabel();
        FiltroSnomina2 = new javax.swing.JComboBox<>();
        LabelBQ2 = new javax.swing.JLabel();
        FiltroQuincenanomina2 = new javax.swing.JComboBox<>();
        LabelSZ2 = new javax.swing.JLabel();
        FZservicio2 = new javax.swing.JComboBox<>();
        jLabel170 = new javax.swing.JLabel();
        FiltrosTD2 = new javax.swing.JComboBox<>();
        LabelBNDF2 = new javax.swing.JLabel();
        FiltroNDF2 = new javax.swing.JTextField();
        FApT2 = new javax.swing.JTextField();
        FAmT2 = new javax.swing.JTextField();
        TDFA3 = new javax.swing.JScrollPane();
        jPanel24 = new javax.swing.JPanel();
        k = new javax.swing.JScrollPane();
        Tnom3 = new javax.swing.JTable();
        LabelBE3 = new javax.swing.JLabel();
        Nominab3 = new javax.swing.JTextField();
        CS10 = new javax.swing.JButton();
        LabelBS3 = new javax.swing.JLabel();
        FiltroSnomina3 = new javax.swing.JComboBox<>();
        LabelBQ3 = new javax.swing.JLabel();
        FiltroQuincenanomina3 = new javax.swing.JComboBox<>();
        LabelSZ3 = new javax.swing.JLabel();
        FZservicio3 = new javax.swing.JComboBox<>();
        jLabel171 = new javax.swing.JLabel();
        FiltrosTD3 = new javax.swing.JComboBox<>();
        LabelBNDF3 = new javax.swing.JLabel();
        FiltroNDF3 = new javax.swing.JTextField();
        FApT3 = new javax.swing.JTextField();
        FAmT3 = new javax.swing.JTextField();
        TDFA4 = new javax.swing.JScrollPane();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        Tnom4 = new javax.swing.JTable();
        LabelBE4 = new javax.swing.JLabel();
        Nominab4 = new javax.swing.JTextField();
        CS11 = new javax.swing.JButton();
        LabelBS4 = new javax.swing.JLabel();
        FiltroSnomina4 = new javax.swing.JComboBox<>();
        LabelBQ4 = new javax.swing.JLabel();
        FiltroQuincenanomina4 = new javax.swing.JComboBox<>();
        LabelSZ4 = new javax.swing.JLabel();
        FZservicio4 = new javax.swing.JComboBox<>();
        jLabel172 = new javax.swing.JLabel();
        FiltrosTD4 = new javax.swing.JComboBox<>();
        LabelBNDF4 = new javax.swing.JLabel();
        FiltroNDF4 = new javax.swing.JTextField();
        FApT4 = new javax.swing.JTextField();
        FAmT4 = new javax.swing.JTextField();
        TDFA5 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        Tnom5 = new javax.swing.JTable();
        LabelBE5 = new javax.swing.JLabel();
        Nominab5 = new javax.swing.JTextField();
        CS12 = new javax.swing.JButton();
        LabelBS5 = new javax.swing.JLabel();
        FiltroSnomina5 = new javax.swing.JComboBox<>();
        LabelBQ5 = new javax.swing.JLabel();
        FiltroQuincenanomina5 = new javax.swing.JComboBox<>();
        LabelSZ5 = new javax.swing.JLabel();
        FZservicio5 = new javax.swing.JComboBox<>();
        jLabel173 = new javax.swing.JLabel();
        FiltrosTD5 = new javax.swing.JComboBox<>();
        LabelBNDF5 = new javax.swing.JLabel();
        FiltroNDF5 = new javax.swing.JTextField();
        FApT5 = new javax.swing.JTextField();
        FAmT5 = new javax.swing.JTextField();
        TDFA6 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        Tnom6 = new javax.swing.JTable();
        LabelBE6 = new javax.swing.JLabel();
        Nominab6 = new javax.swing.JTextField();
        CS13 = new javax.swing.JButton();
        LabelBS6 = new javax.swing.JLabel();
        FiltroSnomina6 = new javax.swing.JComboBox<>();
        LabelBQ6 = new javax.swing.JLabel();
        FiltroQuincenanomina6 = new javax.swing.JComboBox<>();
        LabelSZ6 = new javax.swing.JLabel();
        FZservicio6 = new javax.swing.JComboBox<>();
        jLabel174 = new javax.swing.JLabel();
        FiltrosTD6 = new javax.swing.JComboBox<>();
        LabelBNDF6 = new javax.swing.JLabel();
        FiltroNDF6 = new javax.swing.JTextField();
        FApT6 = new javax.swing.JTextField();
        FAmT6 = new javax.swing.JTextField();
        TDFA7 = new javax.swing.JScrollPane();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        Tnom7 = new javax.swing.JTable();
        LabelBE7 = new javax.swing.JLabel();
        Nominab7 = new javax.swing.JTextField();
        CS14 = new javax.swing.JButton();
        LabelBS7 = new javax.swing.JLabel();
        FiltroSnomina7 = new javax.swing.JComboBox<>();
        LabelBQ7 = new javax.swing.JLabel();
        FiltroQuincenanomina7 = new javax.swing.JComboBox<>();
        LabelSZ7 = new javax.swing.JLabel();
        FZservicio7 = new javax.swing.JComboBox<>();
        jLabel175 = new javax.swing.JLabel();
        FiltrosTD7 = new javax.swing.JComboBox<>();
        LabelBNDF7 = new javax.swing.JLabel();
        FiltroNDF7 = new javax.swing.JTextField();
        FApT7 = new javax.swing.JTextField();
        FAmT7 = new javax.swing.JTextField();
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
        Adddeposito1 = new javax.swing.JButton();
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
        jScrollPane12 = new javax.swing.JScrollPane();
        PestañasPagos = new javax.swing.JTabbedPane();
        TPagos = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        Tdep = new javax.swing.JTable();
        LabelBEP = new javax.swing.JLabel();
        busp = new javax.swing.JTextField();
        CS3 = new javax.swing.JButton();
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TPagos1 = new javax.swing.JScrollPane();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        Tdep1 = new javax.swing.JTable();
        LabelBEP1 = new javax.swing.JLabel();
        busp1 = new javax.swing.JTextField();
        CS15 = new javax.swing.JButton();
        LabelSZP1 = new javax.swing.JLabel();
        FiltroSZP1 = new javax.swing.JComboBox<>();
        LabelBSP1 = new javax.swing.JLabel();
        FiltroServP1 = new javax.swing.JComboBox<>();
        LabelNDFP1 = new javax.swing.JLabel();
        filtroNDFP1 = new javax.swing.JTextField();
        LabelBQP1 = new javax.swing.JLabel();
        FiltroQP1 = new javax.swing.JComboBox<>();
        jLabel161 = new javax.swing.JLabel();
        FiltrosP1 = new javax.swing.JComboBox<>();
        BAppag1 = new javax.swing.JTextField();
        Bampag1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        TPagos2 = new javax.swing.JScrollPane();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        Tdep2 = new javax.swing.JTable();
        LabelBEP2 = new javax.swing.JLabel();
        busp2 = new javax.swing.JTextField();
        CS16 = new javax.swing.JButton();
        LabelSZP2 = new javax.swing.JLabel();
        FiltroSZP2 = new javax.swing.JComboBox<>();
        LabelBSP2 = new javax.swing.JLabel();
        FiltroServP2 = new javax.swing.JComboBox<>();
        LabelNDFP2 = new javax.swing.JLabel();
        filtroNDFP2 = new javax.swing.JTextField();
        LabelBQP2 = new javax.swing.JLabel();
        FiltroQP2 = new javax.swing.JComboBox<>();
        jLabel176 = new javax.swing.JLabel();
        FiltrosP2 = new javax.swing.JComboBox<>();
        BAppag2 = new javax.swing.JTextField();
        Bampag2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        TPagos3 = new javax.swing.JScrollPane();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        Tdep3 = new javax.swing.JTable();
        LabelBEP3 = new javax.swing.JLabel();
        busp3 = new javax.swing.JTextField();
        CS17 = new javax.swing.JButton();
        LabelSZP3 = new javax.swing.JLabel();
        FiltroSZP3 = new javax.swing.JComboBox<>();
        LabelBSP3 = new javax.swing.JLabel();
        FiltroServP3 = new javax.swing.JComboBox<>();
        LabelNDFP3 = new javax.swing.JLabel();
        filtroNDFP3 = new javax.swing.JTextField();
        LabelBQP3 = new javax.swing.JLabel();
        FiltroQP3 = new javax.swing.JComboBox<>();
        jLabel177 = new javax.swing.JLabel();
        FiltrosP3 = new javax.swing.JComboBox<>();
        BAppag3 = new javax.swing.JTextField();
        Bampag3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        TPagos4 = new javax.swing.JScrollPane();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        Tdep4 = new javax.swing.JTable();
        LabelBEP4 = new javax.swing.JLabel();
        busp4 = new javax.swing.JTextField();
        CS18 = new javax.swing.JButton();
        LabelSZP4 = new javax.swing.JLabel();
        FiltroSZP4 = new javax.swing.JComboBox<>();
        LabelBSP4 = new javax.swing.JLabel();
        FiltroServP4 = new javax.swing.JComboBox<>();
        LabelNDFP4 = new javax.swing.JLabel();
        filtroNDFP4 = new javax.swing.JTextField();
        LabelBQP4 = new javax.swing.JLabel();
        FiltroQP4 = new javax.swing.JComboBox<>();
        jLabel178 = new javax.swing.JLabel();
        FiltrosP4 = new javax.swing.JComboBox<>();
        BAppag4 = new javax.swing.JTextField();
        Bampag4 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        TPagos5 = new javax.swing.JScrollPane();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        Tdep5 = new javax.swing.JTable();
        LabelBEP5 = new javax.swing.JLabel();
        busp5 = new javax.swing.JTextField();
        CS19 = new javax.swing.JButton();
        LabelSZP5 = new javax.swing.JLabel();
        FiltroSZP5 = new javax.swing.JComboBox<>();
        LabelBSP5 = new javax.swing.JLabel();
        FiltroServP5 = new javax.swing.JComboBox<>();
        LabelNDFP5 = new javax.swing.JLabel();
        filtroNDFP5 = new javax.swing.JTextField();
        LabelBQP5 = new javax.swing.JLabel();
        FiltroQP5 = new javax.swing.JComboBox<>();
        jLabel179 = new javax.swing.JLabel();
        FiltrosP5 = new javax.swing.JComboBox<>();
        BAppag5 = new javax.swing.JTextField();
        Bampag5 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        TPagos6 = new javax.swing.JScrollPane();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        Tdep6 = new javax.swing.JTable();
        LabelBEP6 = new javax.swing.JLabel();
        busp6 = new javax.swing.JTextField();
        CS20 = new javax.swing.JButton();
        LabelSZP6 = new javax.swing.JLabel();
        FiltroSZP6 = new javax.swing.JComboBox<>();
        LabelBSP6 = new javax.swing.JLabel();
        FiltroServP6 = new javax.swing.JComboBox<>();
        LabelNDFP6 = new javax.swing.JLabel();
        filtroNDFP6 = new javax.swing.JTextField();
        LabelBQP6 = new javax.swing.JLabel();
        FiltroQP6 = new javax.swing.JComboBox<>();
        jLabel180 = new javax.swing.JLabel();
        FiltrosP6 = new javax.swing.JComboBox<>();
        BAppag6 = new javax.swing.JTextField();
        Bampag6 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        TPagos7 = new javax.swing.JScrollPane();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        Tdep7 = new javax.swing.JTable();
        LabelBEP7 = new javax.swing.JLabel();
        busp7 = new javax.swing.JTextField();
        CS21 = new javax.swing.JButton();
        LabelSZP7 = new javax.swing.JLabel();
        FiltroSZP7 = new javax.swing.JComboBox<>();
        LabelBSP7 = new javax.swing.JLabel();
        FiltroServP7 = new javax.swing.JComboBox<>();
        LabelNDFP7 = new javax.swing.JLabel();
        filtroNDFP7 = new javax.swing.JTextField();
        LabelBQP7 = new javax.swing.JLabel();
        FiltroQP7 = new javax.swing.JComboBox<>();
        jLabel181 = new javax.swing.JLabel();
        FiltrosP7 = new javax.swing.JComboBox<>();
        BAppag7 = new javax.swing.JTextField();
        Bampag7 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
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
        ZYS = new javax.swing.JMenuItem();
        ADMV1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        Alumnos = new javax.swing.JMenuItem();
        EmpleadosT = new javax.swing.JMenuItem();
        General = new javax.swing.JMenuItem();
        Semanales = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depositos C/ IMSS");

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

        FiltrosTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(8091, Short.MAX_VALUE))
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
                    .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE1.setText("Buscar Empleado:");

        Nominab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab1KeyReleased(evt);
            }
        });

        CS8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS8.setText("Cerrar sesion");
        CS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS8ActionPerformed(evt);
            }
        });

        LabelBS1.setText("Buscar Servicio:");

        FiltroSnomina1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina1ItemStateChanged(evt);
            }
        });

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

        jLabel169.setText("Filtros:");

        FiltrosTD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD1ItemStateChanged(evt);
            }
        });

        LabelBNDF1.setText("Buscar por # Lista");

        FiltroNDF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF1KeyReleased(evt);
            }
        });

        FApT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT1KeyReleased(evt);
            }
        });

        FAmT1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel169)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(FiltroNDF1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS8))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane21))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE1)
                    .addComponent(Nominab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS1)
                    .addComponent(FiltroSnomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ1)
                    .addComponent(FiltroQuincenanomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ1)
                    .addComponent(FZservicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel169)
                    .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF1)
                    .addComponent(FiltroNDF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE2.setText("Buscar Empleado:");

        Nominab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab2KeyReleased(evt);
            }
        });

        CS9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS9.setText("Cerrar sesion");
        CS9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS9ActionPerformed(evt);
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

        jLabel170.setText("Filtros:");

        FiltrosTD2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD2ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel170)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS9))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane22))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE2)
                    .addComponent(Nominab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS2)
                    .addComponent(FiltroSnomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ2)
                    .addComponent(FiltroQuincenanomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ2)
                    .addComponent(FZservicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel170)
                    .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF2)
                    .addComponent(FiltroNDF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE3.setText("Buscar Empleado:");

        Nominab3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab3KeyReleased(evt);
            }
        });

        CS10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS10.setText("Cerrar sesion");
        CS10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS10ActionPerformed(evt);
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

        jLabel171.setText("Filtros:");

        FiltrosTD3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD3ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS10))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(k))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE3)
                    .addComponent(Nominab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS3)
                    .addComponent(FiltroSnomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ3)
                    .addComponent(FiltroQuincenanomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ3)
                    .addComponent(FZservicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel171)
                    .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF3)
                    .addComponent(FiltroNDF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE4.setText("Buscar Empleado:");

        Nominab4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab4KeyReleased(evt);
            }
        });

        CS11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS11.setText("Cerrar sesion");
        CS11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS11ActionPerformed(evt);
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

        jLabel172.setText("Filtros:");

        FiltrosTD4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD4ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS11))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane24))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE4)
                    .addComponent(Nominab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS4)
                    .addComponent(FiltroSnomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ4)
                    .addComponent(FiltroQuincenanomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ4)
                    .addComponent(FZservicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel172)
                    .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF4)
                    .addComponent(FiltroNDF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE5.setText("Buscar Empleado:");

        Nominab5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab5KeyReleased(evt);
            }
        });

        CS12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS12.setText("Cerrar sesion");
        CS12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS12ActionPerformed(evt);
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

        jLabel173.setText("Filtros:");

        FiltrosTD5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD5ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS12))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane25))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE5)
                    .addComponent(Nominab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS5)
                    .addComponent(FiltroSnomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ5)
                    .addComponent(FiltroQuincenanomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ5)
                    .addComponent(FZservicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel173)
                    .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF5)
                    .addComponent(FiltroNDF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE6.setText("Buscar Empleado:");

        Nominab6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab6KeyReleased(evt);
            }
        });

        CS13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS13.setText("Cerrar sesion");
        CS13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS13ActionPerformed(evt);
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

        jLabel174.setText("Filtros:");

        FiltrosTD6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD6ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel174)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS13))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane26))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE6)
                    .addComponent(Nominab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS6)
                    .addComponent(FiltroSnomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ6)
                    .addComponent(FiltroQuincenanomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ6)
                    .addComponent(FZservicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel174)
                    .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF6)
                    .addComponent(FiltroNDF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBE7.setText("Buscar Empleado:");

        Nominab7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab7KeyReleased(evt);
            }
        });

        CS14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS14.setText("Cerrar sesion");
        CS14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS14ActionPerformed(evt);
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

        jLabel175.setText("Filtros:");

        FiltrosTD7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosTD7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD7ItemStateChanged(evt);
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

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS14))
                .addContainerGap(8091, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane27))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE7)
                    .addComponent(Nominab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS7)
                    .addComponent(FiltroSnomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ7)
                    .addComponent(FiltroQuincenanomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ7)
                    .addComponent(FZservicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel175)
                    .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF7)
                    .addComponent(FiltroNDF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS14)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        TDFA7.setViewportView(jPanel28);

        PestanañasND.addTab("Sur 2", TDFA7);

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
                            .addComponent(DPF)
                            .addComponent(NomISR)
                            .addComponent(RF)
                            .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
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

        Adddeposito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        Adddeposito1.setText("Modificar");
        Adddeposito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adddeposito1ActionPerformed(evt);
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
                                        .addComponent(Adddeposito1))
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
                .addContainerGap(351, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(Adddeposito1))))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jScrollPane10.setViewportView(jPanel9);

        RH.addTab("Registro de depositos", jScrollPane10);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        Tdep.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(Tdep);

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

        FiltrosP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
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

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton1.setText("Eliminar");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS3))
                        .addGap(0, 6840, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP)
                    .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS3)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos.setViewportView(jPanel3);

        PestañasPagos.addTab("Foraneos Acapulco", TPagos);

        jPanel29.setBackground(new java.awt.Color(204, 255, 204));

        jScrollPane29.setToolTipText("");

        Tdep1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane29.setViewportView(Tdep1);

        LabelBEP1.setText("Buscar empleado:");

        busp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp1KeyReleased(evt);
            }
        });

        CS15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS15.setText("Cerrar sesion");
        CS15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS15ActionPerformed(evt);
            }
        });

        LabelSZP1.setText("Seleccionar zona:");

        FiltroSZP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP1ItemStateChanged(evt);
            }
        });

        LabelBSP1.setText("Buscar servicio:");

        FiltroServP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP1ItemStateChanged(evt);
            }
        });

        LabelNDFP1.setText("# de Lista");

        filtroNDFP1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP1KeyReleased(evt);
            }
        });

        LabelBQP1.setText("Buscar quincena:");

        FiltroQP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP1ItemStateChanged(evt);
            }
        });

        jLabel161.setText("Filtrar:");

        FiltrosP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP1ItemStateChanged(evt);
            }
        });

        BAppag1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag1KeyReleased(evt);
            }
        });

        Bampag1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag1KeyReleased(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton2.setText("Eliminar");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane29))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel161)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LabelBEP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS15))
                        .addGap(0, 6834, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP1)
                    .addComponent(busp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP1)
                    .addComponent(FiltroSZP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP1)
                    .addComponent(FiltroServP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP1)
                    .addComponent(filtroNDFP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP1)
                    .addComponent(FiltroQP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161)
                    .addComponent(FiltrosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS15)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos1.setViewportView(jPanel29);

        PestañasPagos.addTab("Foraneos puebla", TPagos1);

        jPanel30.setBackground(new java.awt.Color(204, 255, 204));

        Tdep2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane30.setViewportView(Tdep2);

        LabelBEP2.setText("Buscar empleado:");

        busp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp2KeyReleased(evt);
            }
        });

        CS16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS16.setText("Cerrar sesion");
        CS16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS16ActionPerformed(evt);
            }
        });

        LabelSZP2.setText("Seleccionar zona:");

        FiltroSZP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP2ItemStateChanged(evt);
            }
        });

        LabelBSP2.setText("Buscar servicio:");

        FiltroServP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP2ItemStateChanged(evt);
            }
        });

        LabelNDFP2.setText("# de Lista");

        filtroNDFP2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP2KeyReleased(evt);
            }
        });

        LabelBQP2.setText("Buscar quincena:");

        FiltroQP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP2ItemStateChanged(evt);
            }
        });

        jLabel176.setText("Filtrar:");

        FiltrosP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP2ItemStateChanged(evt);
            }
        });

        BAppag2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag2KeyReleased(evt);
            }
        });

        Bampag2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag2KeyReleased(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton3.setText("Eliminar");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane30)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel30Layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel176)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LabelBEP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS16))
                        .addGap(0, 6834, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP2)
                    .addComponent(busp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP2)
                    .addComponent(FiltroSZP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP2)
                    .addComponent(FiltroServP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP2)
                    .addComponent(filtroNDFP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP2)
                    .addComponent(FiltroQP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel176)
                    .addComponent(FiltrosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS16)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos2.setViewportView(jPanel30);

        PestañasPagos.addTab("Foraneo toluca", TPagos2);

        jPanel31.setBackground(new java.awt.Color(204, 255, 204));

        Tdep3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane31.setViewportView(Tdep3);

        LabelBEP3.setText("Buscar empleado:");

        busp3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp3KeyReleased(evt);
            }
        });

        CS17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS17.setText("Cerrar sesion");
        CS17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS17ActionPerformed(evt);
            }
        });

        LabelSZP3.setText("Seleccionar zona:");

        FiltroSZP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP3ItemStateChanged(evt);
            }
        });

        LabelBSP3.setText("Buscar servicio:");

        FiltroServP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP3ItemStateChanged(evt);
            }
        });

        LabelNDFP3.setText("# de Lista");

        filtroNDFP3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP3KeyReleased(evt);
            }
        });

        LabelBQP3.setText("Buscar quincena:");

        FiltroQP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP3ItemStateChanged(evt);
            }
        });

        jLabel177.setText("Filtrar:");

        FiltrosP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP3ItemStateChanged(evt);
            }
        });

        BAppag3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag3KeyReleased(evt);
            }
        });

        Bampag3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag3KeyReleased(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton4.setText("Eliminar");

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(LabelBEP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busp3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAppag3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bampag3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSZP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBSP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroServP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNDFP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtroNDFP3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQP3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS17)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 8176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP3)
                    .addComponent(busp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP3)
                    .addComponent(FiltroSZP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP3)
                    .addComponent(FiltroServP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP3)
                    .addComponent(filtroNDFP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP3)
                    .addComponent(FiltroQP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel177)
                    .addComponent(FiltrosP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS17)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos3.setViewportView(jPanel31);

        PestañasPagos.addTab("Norte", TPagos3);

        jPanel32.setBackground(new java.awt.Color(204, 255, 204));

        Tdep4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane32.setViewportView(Tdep4);

        LabelBEP4.setText("Buscar empleado:");

        busp4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp4KeyReleased(evt);
            }
        });

        CS18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS18.setText("Cerrar sesion");
        CS18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS18ActionPerformed(evt);
            }
        });

        LabelSZP4.setText("Seleccionar zona:");

        FiltroSZP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP4ItemStateChanged(evt);
            }
        });

        LabelBSP4.setText("Buscar servicio:");

        FiltroServP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP4ItemStateChanged(evt);
            }
        });

        LabelNDFP4.setText("# de Lista");

        filtroNDFP4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP4KeyReleased(evt);
            }
        });

        LabelBQP4.setText("Buscar quincena:");

        FiltroQP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP4ItemStateChanged(evt);
            }
        });

        jLabel178.setText("Filtrar:");

        FiltrosP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP4ItemStateChanged(evt);
            }
        });

        BAppag4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag4KeyReleased(evt);
            }
        });

        Bampag4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag4KeyReleased(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton5.setText("Eliminar");

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane32)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel32Layout.createSequentialGroup()
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel178)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LabelBEP4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS18))
                        .addGap(0, 6834, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP4)
                    .addComponent(busp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP4)
                    .addComponent(FiltroSZP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP4)
                    .addComponent(FiltroServP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP4)
                    .addComponent(filtroNDFP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP4)
                    .addComponent(FiltroQP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel178)
                    .addComponent(FiltrosP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS18)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos4.setViewportView(jPanel32);

        PestañasPagos.addTab("Poniente", TPagos4);

        jPanel33.setBackground(new java.awt.Color(204, 255, 204));

        Tdep5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane33.setViewportView(Tdep5);

        LabelBEP5.setText("Buscar empleado:");

        busp5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp5KeyReleased(evt);
            }
        });

        CS19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS19.setText("Cerrar sesion");
        CS19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS19ActionPerformed(evt);
            }
        });

        LabelSZP5.setText("Seleccionar zona:");

        FiltroSZP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP5ItemStateChanged(evt);
            }
        });

        LabelBSP5.setText("Buscar servicio:");

        FiltroServP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP5ItemStateChanged(evt);
            }
        });

        LabelNDFP5.setText("# de Lista");

        filtroNDFP5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP5KeyReleased(evt);
            }
        });

        LabelBQP5.setText("Buscar quincena:");

        FiltroQP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP5ItemStateChanged(evt);
            }
        });

        jLabel179.setText("Filtrar:");

        FiltrosP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP5ItemStateChanged(evt);
            }
        });

        BAppag5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag5KeyReleased(evt);
            }
        });

        Bampag5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag5KeyReleased(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton6.setText("Eliminar");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane33)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel33Layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel179)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LabelBEP5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS19))
                        .addGap(0, 6834, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP5)
                    .addComponent(busp5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP5)
                    .addComponent(FiltroSZP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP5)
                    .addComponent(FiltroServP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP5)
                    .addComponent(filtroNDFP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP5)
                    .addComponent(FiltroQP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel179)
                    .addComponent(FiltrosP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS19)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos5.setViewportView(jPanel33);

        PestañasPagos.addTab("Oficina", TPagos5);

        jPanel34.setBackground(new java.awt.Color(204, 255, 204));

        Tdep6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane34.setViewportView(Tdep6);

        LabelBEP6.setText("Buscar empleado:");

        busp6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp6KeyReleased(evt);
            }
        });

        CS20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS20.setText("Cerrar sesion");
        CS20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS20ActionPerformed(evt);
            }
        });

        LabelSZP6.setText("Seleccionar zona:");

        FiltroSZP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP6ItemStateChanged(evt);
            }
        });

        LabelBSP6.setText("Buscar servicio:");

        FiltroServP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP6ItemStateChanged(evt);
            }
        });

        LabelNDFP6.setText("# de Lista");

        filtroNDFP6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP6KeyReleased(evt);
            }
        });

        LabelBQP6.setText("Buscar quincena:");

        FiltroQP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP6ItemStateChanged(evt);
            }
        });

        jLabel180.setText("Filtrar:");

        FiltrosP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP6ItemStateChanged(evt);
            }
        });

        BAppag6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag6KeyReleased(evt);
            }
        });

        Bampag6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag6KeyReleased(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton7.setText("Eliminar");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane34)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel34Layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel180)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LabelBEP6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS20))
                        .addGap(0, 6834, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP6)
                    .addComponent(busp6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP6)
                    .addComponent(FiltroSZP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP6)
                    .addComponent(FiltroServP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP6)
                    .addComponent(filtroNDFP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP6)
                    .addComponent(FiltroQP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel180)
                    .addComponent(FiltrosP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS20)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos6.setViewportView(jPanel34);

        PestañasPagos.addTab("Sur 1", TPagos6);

        jPanel35.setBackground(new java.awt.Color(204, 255, 204));

        Tdep7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane35.setViewportView(Tdep7);

        LabelBEP7.setText("Buscar empleado:");

        busp7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp7KeyReleased(evt);
            }
        });

        CS21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS21.setText("Cerrar sesion");
        CS21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS21ActionPerformed(evt);
            }
        });

        LabelSZP7.setText("Seleccionar zona:");

        FiltroSZP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZP7ItemStateChanged(evt);
            }
        });

        LabelBSP7.setText("Buscar servicio:");

        FiltroServP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServP7ItemStateChanged(evt);
            }
        });

        LabelNDFP7.setText("# de Lista");

        filtroNDFP7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFP7KeyReleased(evt);
            }
        });

        LabelBQP7.setText("Buscar quincena:");

        FiltroQP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP7ItemStateChanged(evt);
            }
        });

        jLabel181.setText("Filtrar:");

        FiltrosP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista" }));
        FiltrosP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosP7ItemStateChanged(evt);
            }
        });

        BAppag7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppag7KeyReleased(evt);
            }
        });

        Bampag7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bampag7KeyReleased(evt);
            }
        });

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton8.setText("Eliminar");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane35)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel35Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel181)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(LabelBEP7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(busp7, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BAppag7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bampag7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelSZP7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroSZP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBSP7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroServP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelNDFP7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filtroNDFP7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelBQP7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroQP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CS21))
                        .addGap(0, 6834, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP7)
                    .addComponent(busp7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP7)
                    .addComponent(FiltroSZP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP7)
                    .addComponent(FiltroServP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP7)
                    .addComponent(filtroNDFP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP7)
                    .addComponent(FiltroQP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel181)
                    .addComponent(FiltrosP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS21)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos7.setViewportView(jPanel35);

        PestañasPagos.addTab("Sur 2", TPagos7);

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

    private void Adddeposito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adddeposito1ActionPerformed
        Modeposito();
        MDepFA();
    }//GEN-LAST:event_Adddeposito1ActionPerformed

    private void AdddepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdddepositoActionPerformed
        Agregardeposito();
        MDepFA();
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

    private void FAmT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT7KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT7KeyReleased

    private void FApT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT7KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT7KeyReleased

    private void FiltroNDF7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF7KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF7KeyReleased

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

    private void FZservicio7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio7ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio7.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina7.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio7ItemStateChanged

    private void FiltroQuincenanomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina7ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina7ItemStateChanged

    private void FiltroSnomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina7ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina7ItemStateChanged

    private void CS14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS14ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS14ActionPerformed

    private void Nominab7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab7KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab7KeyReleased

    private void Tnom7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom7MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom7.getModel();

            int fila = Tnom7.getSelectedRow();
            NDL.setText(String.valueOf(Tnom7.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom7.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom7.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom7.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom7.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom7.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom7.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom7.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom7.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom7.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom7.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom7.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom7.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom7.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom7.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom7.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom7.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom7.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom7.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom7.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom7.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom7.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom7.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom7.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom7.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom7.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom7.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom7.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom7.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom7.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom7.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom7.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom7.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom7.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom7.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom7.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom7.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom7.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom7.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom7.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom7.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom7.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom7.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom7.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom7.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom7.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom7.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom7.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom7.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom7.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom7.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom7.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom7.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom7MouseClicked

    private void FAmT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT6KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT6KeyReleased

    private void FApT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT6KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT6KeyReleased

    private void FiltroNDF6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF6KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF6KeyReleased

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

    private void FZservicio6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio6.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina6.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio6ItemStateChanged

    private void FiltroQuincenanomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina6ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina6ItemStateChanged

    private void FiltroSnomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina6ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina6ItemStateChanged

    private void CS13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS13ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS13ActionPerformed

    private void Nominab6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab6KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab6KeyReleased

    private void Tnom6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom6MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom6.getModel();

            int fila = Tnom6.getSelectedRow();
            NDL.setText(String.valueOf(Tnom6.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom6.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom6.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom6.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom6.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom6.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom6.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom6.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom6.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom6.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom6.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom6.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom6.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom6.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom6.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom6.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom6.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom6.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom6.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom6.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom6.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom6.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom6.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom6.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom6.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom6.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom6.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom6.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom6.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom6.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom6.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom6.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom6.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom6.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom6.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom6.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom6.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom6.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom6.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom6.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom6.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom6.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom6.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom6.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom6.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom6.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom6.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom6.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom6.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom6.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom6.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom6.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom6.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom6MouseClicked

    private void FAmT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT5KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT5KeyReleased

    private void FApT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT5KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT5KeyReleased

    private void FiltroNDF5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF5KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF5KeyReleased

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

    private void FZservicio5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio5.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina5.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio5ItemStateChanged

    private void FiltroQuincenanomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina5ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina5ItemStateChanged

    private void FiltroSnomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina5ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina5ItemStateChanged

    private void CS12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS12ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS12ActionPerformed

    private void Nominab5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab5KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab5KeyReleased

    private void Tnom5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom5MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom5.getModel();

            int fila = Tnom5.getSelectedRow();
            NDL.setText(String.valueOf(Tnom5.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom5.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom5.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom5.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom5.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom5.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom5.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom5.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom5.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom5.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom5.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom5.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom5.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom5.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom5.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom5.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom5.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom5.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom5.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom5.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom5.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom5.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom5.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom5.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom5.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom5.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom5.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom5.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom5.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom5.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom5.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom5.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom5.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom5.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom5.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom5.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom5.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom5.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom5.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom5.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom5.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom5.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom5.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom5.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom5.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom5.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom5.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom5.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom5.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom5.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom5.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom5.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom5.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom5MouseClicked

    private void FAmT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT4KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT4KeyReleased

    private void FApT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT4KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT4KeyReleased

    private void FiltroNDF4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF4KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF4KeyReleased

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

    private void FZservicio4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio4.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina4.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio4ItemStateChanged

    private void FiltroQuincenanomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina4ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina4ItemStateChanged

    private void FiltroSnomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina4ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina4ItemStateChanged

    private void CS11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS11ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS11ActionPerformed

    private void Nominab4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab4KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab4KeyReleased

    private void Tnom4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom4MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom4.getModel();

            int fila = Tnom4.getSelectedRow();
            NDL.setText(String.valueOf(Tnom4.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom4.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom4.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom4.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom4.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom4.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom4.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom4.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom4.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom4.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom4.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom4.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom4.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom4.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom4.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom4.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom4.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom4.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom4.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom4.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom4.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom4.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom4.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom4.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom4.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom4.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom4.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom4.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom4.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom4.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom4.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom4.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom4.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom4.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom4.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom4.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom4.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom4.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom4.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom4.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom4.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom4.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom4.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom4.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom4.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom4.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom4.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom4.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom4.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom4.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom4.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom4.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom4.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom4MouseClicked

    private void FAmT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT3KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT3KeyReleased

    private void FApT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT3KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT3KeyReleased

    private void FiltroNDF3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF3KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF3KeyReleased

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

    private void FZservicio3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio3.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina3.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio3ItemStateChanged

    private void FiltroQuincenanomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina3ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina3ItemStateChanged

    private void FiltroSnomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina3ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina3ItemStateChanged

    private void CS10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS10ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS10ActionPerformed

    private void Nominab3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab3KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab3KeyReleased

    private void Tnom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom3MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom3.getModel();

            int fila = Tnom3.getSelectedRow();
            NDL.setText(String.valueOf(Tnom3.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom3.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom3.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom3.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom3.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom3.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom3.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom3.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom3.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom3.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom3.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom3.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom3.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom3.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom3.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom3.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom3.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom3.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom3.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom3.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom3.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom3.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom3.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom3.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom3.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom3.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom3.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom3.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom3.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom3.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom3.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom3.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom3.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom3.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom3.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom3.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom3.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom3.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom3.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom3.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom3.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom3.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom3.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom3.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom3.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom3.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom3.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom3.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom3.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom3.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom3.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom3.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom3.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom3MouseClicked

    private void FAmT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT2KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT2KeyReleased

    private void FApT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT2KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT2KeyReleased

    private void FiltroNDF2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF2KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF2KeyReleased

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

    private void FZservicio2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio2.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina2.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio2ItemStateChanged

    private void FiltroQuincenanomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina2ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina2ItemStateChanged

    private void FiltroSnomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina2ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina2ItemStateChanged

    private void CS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS9ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS9ActionPerformed

    private void Nominab2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab2KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab2KeyReleased

    private void Tnom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom2MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom2.getModel();

            int fila = Tnom2.getSelectedRow();
            NDL.setText(String.valueOf(Tnom2.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom2.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom2.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom2.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom2.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom2.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom2.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom2.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom2.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom2.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom2.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom2.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom2.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom2.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom2.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom2.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom2.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom2.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom2.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom2.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom2.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom2.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom2.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom2.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom2.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom2.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom2.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom2.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom2.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom2.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom2.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom2.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom2.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom2.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom2.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom2.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom2.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom2.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom2.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom2.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom2.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom2.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom2.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom2.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom2.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom2.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom2.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom2.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom2.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom2.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom2.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom2.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom2.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom2MouseClicked

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
            Inicio_1 regr = new Inicio_1();
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
            ban.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            Bono.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom.getValueAt(fila, 12)));
            String Quinc = model.getValueAt(fila, 13).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 14));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom.getValueAt(fila, 15)));
            pds.setText(String.valueOf(Tnom.getValueAt(fila, 16)));
            Ddv.setText(String.valueOf(Tnom.getValueAt(fila, 17)));
            PDDDV.setText(String.valueOf(Tnom.getValueAt(fila, 18)));
            DD.setText(String.valueOf(Tnom.getValueAt(fila, 19)));
            PDDD.setText(String.valueOf(Tnom.getValueAt(fila, 20)));
            DL.setText(String.valueOf(Tnom.getValueAt(fila, 21)));
            PDDL.setText(String.valueOf(Tnom.getValueAt(fila, 22)));
            dt.setText(String.valueOf(Tnom.getValueAt(fila, 23)));
            PDDT.setText(String.valueOf(Tnom.getValueAt(fila, 24)));
            DSGS.setText(String.valueOf(Tnom.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tnom.getValueAt(fila, 26)));
            FJ.setText(String.valueOf(Tnom.getValueAt(fila, 27)));
            DO.setText(String.valueOf(Tnom.getValueAt(fila, 28)));
            DF.setText(String.valueOf(Tnom.getValueAt(fila, 29)));
            PDDF.setText(String.valueOf(Tnom.getValueAt(fila, 30)));
            DFT.setText(String.valueOf(Tnom.getValueAt(fila, 31)));
            PDDFT.setText(String.valueOf(Tnom.getValueAt(fila, 32)));
            HE.setText(String.valueOf(Tnom.getValueAt(fila, 33)));
            THE.setText(String.valueOf(Tnom.getValueAt(fila, 34)));
            R.setText(String.valueOf(Tnom.getValueAt(fila, 35)));
            PCR.setText(String.valueOf(Tnom.getValueAt(fila, 36)));
            apy.setText(String.valueOf(Tnom.getValueAt(fila, 37)));
            Lugar.setText(String.valueOf(Tnom.getValueAt(fila, 38)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 39)));
            ADD.setText(String.valueOf(Tnom.getValueAt(fila, 40)));
            F.setText(String.valueOf(Tnom.getValueAt(fila, 41)));
            DPF.setText(String.valueOf(Tnom.getValueAt(fila, 42)));
            DI.setText(String.valueOf(Tnom.getValueAt(fila, 43)));
            RI.setText(String.valueOf(Tnom.getValueAt(fila, 44)));
            RF.setText(String.valueOf(Tnom.getValueAt(fila, 45)));
            NomISR.setText(String.valueOf(Tnom.getValueAt(fila, 46)));
            Fdb.setText(String.valueOf(Tnom.getValueAt(fila, 47)));
            Sancion.setText(String.valueOf(Tnom.getValueAt(fila, 48)));
            Chamarra.setText(String.valueOf(Tnom.getValueAt(fila, 49)));
            Chaleco.setText(String.valueOf(Tnom.getValueAt(fila, 50)));
            Fde.setText(String.valueOf(Tnom.getValueAt(fila, 51)));
            Grua.setText(String.valueOf(Tnom.getValueAt(fila, 52)));
            Pantalon.setText(String.valueOf(Tnom.getValueAt(fila, 53)));
            Credencial.setText(String.valueOf(Tnom.getValueAt(fila, 54)));
            Bp.setText(String.valueOf(Tnom.getValueAt(fila, 55)));
            Playera.setText(String.valueOf(Tnom.getValueAt(fila, 56)));
            Corbata.setText(String.valueOf(Tnom.getValueAt(fila, 57)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 58)));
            cda.setText(String.valueOf(Tnom.getValueAt(fila, 59)));
            Odtp.setText(String.valueOf(Tnom.getValueAt(fila, 60)));
            AdN.setText(String.valueOf(Tnom.getValueAt(fila, 61)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 62)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void FAmT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT1KeyReleased
        FunMD();
    }//GEN-LAST:event_FAmT1KeyReleased

    private void FApT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT1KeyReleased
        FunMD();
    }//GEN-LAST:event_FApT1KeyReleased

    private void FiltroNDF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF1KeyReleased
        FunMD();
    }//GEN-LAST:event_FiltroNDF1KeyReleased

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

    private void FZservicio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio1.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina1.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FZservicio1ItemStateChanged

    private void FiltroQuincenanomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina1ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQuincenanomina1ItemStateChanged

    private void FiltroSnomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina1ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroSnomina1ItemStateChanged

    private void CS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS8ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS8ActionPerformed

    private void Nominab1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab1KeyReleased
        FunMD();
    }//GEN-LAST:event_Nominab1KeyReleased

    private void Tnom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom1MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom1.getModel();

            int fila = Tnom1.getSelectedRow();
            NDL.setText(String.valueOf(Tnom1.getValueAt(fila, 0)));
            NEnom.setText(String.valueOf(Tnom1.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom1.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tnom1.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tnom1.getValueAt(fila, 4)));
            Zon.setText(String.valueOf(Tnom1.getValueAt(fila, 5)));
            ServN.setText(String.valueOf(Tnom1.getValueAt(fila, 6)));
            sueldo.setText(String.valueOf(Tnom1.getValueAt(fila, 7)));
            Bono.setText(String.valueOf(Tnom1.getValueAt(fila, 8)));
            pd.setText(String.valueOf(Tnom1.getValueAt(fila, 9)));
            String Quinc = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);
            Dpi.setText(String.valueOf(Tnom1.getValueAt(fila, 12)));
            pds.setText(String.valueOf(Tnom1.getValueAt(fila, 13)));
            Ddv.setText(String.valueOf(Tnom1.getValueAt(fila, 14)));
            PDDDV.setText(String.valueOf(Tnom1.getValueAt(fila, 15)));
            DD.setText(String.valueOf(Tnom1.getValueAt(fila, 16)));
            PDDD.setText(String.valueOf(Tnom1.getValueAt(fila, 17)));
            DL.setText(String.valueOf(Tnom1.getValueAt(fila, 18)));
            PDDL.setText(String.valueOf(Tnom1.getValueAt(fila, 19)));
            dt.setText(String.valueOf(Tnom1.getValueAt(fila, 20)));
            PDDT.setText(String.valueOf(Tnom1.getValueAt(fila, 21)));
            DSGS.setText(String.valueOf(Tnom1.getValueAt(fila, 22)));
            PDDDDSGS.setText(String.valueOf(Tnom1.getValueAt(fila, 23)));
            FJ.setText(String.valueOf(Tnom1.getValueAt(fila, 24)));
            DO.setText(String.valueOf(Tnom1.getValueAt(fila, 25)));
            DF.setText(String.valueOf(Tnom1.getValueAt(fila, 26)));
            PDDF.setText(String.valueOf(Tnom1.getValueAt(fila, 27)));
            DFT.setText(String.valueOf(Tnom1.getValueAt(fila, 28)));
            PDDFT.setText(String.valueOf(Tnom1.getValueAt(fila, 29)));
            R.setText(String.valueOf(Tnom1.getValueAt(fila, 30)));
            PCR.setText(String.valueOf(Tnom1.getValueAt(fila, 31)));
            apy.setText(String.valueOf(Tnom1.getValueAt(fila, 32)));
            Lugar.setText(String.valueOf(Tnom1.getValueAt(fila, 33)));
            Rembolso.setText(String.valueOf(Tnom1.getValueAt(fila, 34)));
            ADD.setText(String.valueOf(Tnom1.getValueAt(fila, 35)));
            F.setText(String.valueOf(Tnom1.getValueAt(fila, 36)));
            DPF.setText(String.valueOf(Tnom1.getValueAt(fila, 37)));
            DI.setText(String.valueOf(Tnom1.getValueAt(fila, 38)));
            Fdb.setText(String.valueOf(Tnom1.getValueAt(fila, 39)));
            Sancion.setText(String.valueOf(Tnom1.getValueAt(fila, 40)));
            Chamarra.setText(String.valueOf(Tnom1.getValueAt(fila, 41)));
            Chaleco.setText(String.valueOf(Tnom1.getValueAt(fila, 42)));
            Fde.setText(String.valueOf(Tnom1.getValueAt(fila, 43)));
            Grua.setText(String.valueOf(Tnom1.getValueAt(fila, 44)));
            Pantalon.setText(String.valueOf(Tnom1.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom1.getValueAt(fila, 46)));
            Bp.setText(String.valueOf(Tnom1.getValueAt(fila, 47)));
            Playera.setText(String.valueOf(Tnom1.getValueAt(fila, 48)));
            Corbata.setText(String.valueOf(Tnom1.getValueAt(fila, 49)));
            Presp.setText(String.valueOf(Tnom1.getValueAt(fila, 50)));
            cda.setText(String.valueOf(Tnom1.getValueAt(fila, 51)));
            Odtp.setText(String.valueOf(Tnom1.getValueAt(fila, 52)));
            AdN.setText(String.valueOf(Tnom1.getValueAt(fila, 53)));
            deposito.setText(String.valueOf(Tnom1.getValueAt(fila, 54)));
        } catch (ParseException ex) {
            Logger.getLogger(Depositos_SIMSS_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom1MouseClicked

    private void buspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buspKeyReleased
        FunMD();
    }//GEN-LAST:event_buspKeyReleased

    private void CS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS3ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS3ActionPerformed

    private void FiltroSZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZPItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZPItemStateChanged

    private void FiltroServPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServPItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServPItemStateChanged

    private void filtroNDFPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFPKeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFPKeyReleased

    private void FiltroQPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQPItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQPItemStateChanged

    private void FiltrosPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPItemStateChanged

        String FP = (String) FiltrosP.getSelectedItem();
        if (FP.equals("Selecciona filtro")) {
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
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            FunMD();

        }
        if (FP.equals("Filtrar por Nombre(s)")) {
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
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido P")) {
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
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido M")) {
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
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Servicio")) {
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
            FiltroSZP.setVisible(true);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(true);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por quincena")) {
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
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por # Lista")) {
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
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(true);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosPItemStateChanged

    private void BAppagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppagKeyReleased

        FunMD();
    }//GEN-LAST:event_BAppagKeyReleased

    private void BampagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BampagKeyReleased
        FunMD();
    }//GEN-LAST:event_BampagKeyReleased

    private void busp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp1KeyReleased
        FunMD();
    }//GEN-LAST:event_busp1KeyReleased

    private void CS15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS15ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS15ActionPerformed

    private void FiltroSZP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP1.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP1.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP1ItemStateChanged

    private void FiltroServP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP1ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP1ItemStateChanged

    private void filtroNDFP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP1KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP1KeyReleased

    private void FiltroQP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP1ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP1ItemStateChanged

    private void FiltrosP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP1ItemStateChanged
        String FP = (String) FiltrosP1.getSelectedItem();
        if (FP.equals("Selecciona filtro")) {
            busp1.setVisible(false);
            BAppag1.setVisible(false);
            BAppag1.setText("");
            Bampag1.setVisible(false);
            Bampag1.setText("");
            LabelBEP1.setVisible(false);
            busp1.setText("");
            LabelBQP1.setVisible(false);
            FiltroQP1.setVisible(false);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(false);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(false);
            FiltroSZP1.setVisible(false);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(false);
            filtroNDFP1.setVisible(false);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(false);
            FunMD();

        }
        if (FP.equals("Filtrar por Nombre(s)")) {
            busp1.setVisible(true);
            LabelBEP1.setVisible(true);
            LabelBEP1.setText("Buscar por nombre:");
            BAppag1.setVisible(false);
            BAppag1.setText("");
            Bampag1.setVisible(false);
            Bampag1.setText("");
            busp1.setText("");
            LabelBQP1.setVisible(false);
            FiltroQP1.setVisible(false);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(false);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(false);
            FiltroSZP1.setVisible(false);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(false);
            filtroNDFP1.setVisible(false);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido P")) {
            busp1.setVisible(false);
            LabelBEP1.setVisible(true);
            LabelBEP1.setText("Buscar por apellido P:");
            BAppag1.setVisible(true);
            BAppag1.setText("");
            Bampag1.setVisible(false);
            Bampag1.setText("");
            busp1.setText("");
            LabelBQP1.setVisible(false);
            FiltroQP1.setVisible(false);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(false);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(false);
            FiltroSZP1.setVisible(false);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(false);
            filtroNDFP1.setVisible(false);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido M")) {
            busp1.setVisible(false);
            LabelBEP1.setVisible(true);
            LabelBEP1.setText("Buscar por apellido M: ");
            BAppag1.setVisible(false);
            BAppag1.setText("");
            Bampag1.setVisible(true);
            Bampag1.setText("");
            busp1.setText("");
            LabelBQP1.setVisible(false);
            FiltroQP1.setVisible(false);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(false);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(false);
            FiltroSZP1.setVisible(false);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(false);
            filtroNDFP1.setVisible(false);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Servicio")) {
            busp1.setVisible(false);
            LabelBEP1.setVisible(false);
            BAppag1.setVisible(false);
            BAppag1.setText("");
            Bampag1.setVisible(false);
            Bampag1.setText("");
            busp1.setText("");
            LabelBQP1.setVisible(false);
            FiltroQP1.setVisible(false);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(true);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(true);
            FiltroSZP1.setVisible(true);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(true);
            filtroNDFP1.setVisible(false);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por quincena")) {
            busp1.setVisible(false);
            LabelBEP1.setVisible(false);
            BAppag1.setVisible(false);
            BAppag1.setText("");
            Bampag1.setVisible(false);
            Bampag1.setText("");
            busp1.setText("");
            LabelBQP1.setVisible(true);
            FiltroQP1.setVisible(true);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(false);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(false);
            FiltroSZP1.setVisible(false);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(false);
            filtroNDFP1.setVisible(false);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por # Lista")) {
            busp1.setVisible(false);
            LabelBEP1.setVisible(false);
            BAppag1.setVisible(false);
            BAppag1.setText("");
            Bampag1.setVisible(false);
            Bampag1.setText("");
            busp1.setText("");
            LabelBQP1.setVisible(false);
            FiltroQP1.setVisible(false);
            FiltroQP1.setSelectedIndex(0);
            FiltroServP1.setVisible(false);
            FiltroServP1.setSelectedIndex(0);
            LabelBSP1.setVisible(false);
            FiltroSZP1.setVisible(false);
            FiltroSZP1.setSelectedIndex(0);
            LabelSZP1.setVisible(false);
            filtroNDFP1.setVisible(true);
            filtroNDFP1.setText("");
            LabelNDFP1.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP1ItemStateChanged

    private void BAppag1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag1KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag1KeyReleased

    private void Bampag1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag1KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag1KeyReleased

    private void busp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp2KeyReleased
        FunMD();
    }//GEN-LAST:event_busp2KeyReleased

    private void CS16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS16ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS16ActionPerformed

    private void FiltroSZP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP2.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP2.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP2ItemStateChanged

    private void FiltroServP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP2ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP2ItemStateChanged

    private void filtroNDFP2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP2KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP2KeyReleased

    private void FiltroQP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP2ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP2ItemStateChanged

    private void FiltrosP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP2ItemStateChanged

        String FP2 = (String) FiltrosP2.getSelectedItem();
        if (FP2.equals("Selecciona filtro")) {
            busp2.setVisible(false);
            BAppag2.setVisible(false);
            BAppag2.setText("");
            Bampag2.setVisible(false);
            Bampag2.setText("");
            LabelBEP2.setVisible(false);
            busp2.setText("");
            LabelBQP2.setVisible(false);
            FiltroQP2.setVisible(false);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(false);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(false);
            FiltroSZP2.setVisible(false);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(false);
            filtroNDFP2.setVisible(false);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(false);
            FunMD();

        }
        if (FP2.equals("Filtrar por Nombre(s)")) {
            busp2.setVisible(true);
            LabelBEP2.setVisible(true);
            LabelBEP2.setText("Buscar por nombre:");
            BAppag2.setVisible(false);
            BAppag2.setText("");
            Bampag2.setVisible(false);
            Bampag2.setText("");
            busp2.setText("");
            LabelBQP2.setVisible(false);
            FiltroQP2.setVisible(false);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(false);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(false);
            FiltroSZP2.setVisible(false);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(false);
            filtroNDFP2.setVisible(false);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(false);
            FunMD();
        }
        if (FP2.equals("Filtrar por Apellido P")) {
            busp2.setVisible(false);
            LabelBEP2.setVisible(true);
            LabelBEP2.setText("Buscar por apellido P:");
            BAppag2.setVisible(true);
            BAppag2.setText("");
            Bampag2.setVisible(false);
            Bampag2.setText("");
            busp2.setText("");
            LabelBQP2.setVisible(false);
            FiltroQP2.setVisible(false);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(false);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(false);
            FiltroSZP2.setVisible(false);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(false);
            filtroNDFP2.setVisible(false);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(false);
            FunMD();
        }
        if (FP2.equals("Filtrar por Apellido M")) {
            busp2.setVisible(false);
            LabelBEP2.setVisible(true);
            LabelBEP2.setText("Buscar por apellido M: ");
            BAppag2.setVisible(false);
            BAppag2.setText("");
            Bampag2.setVisible(true);
            Bampag2.setText("");
            busp2.setText("");
            LabelBQP2.setVisible(false);
            FiltroQP2.setVisible(false);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(false);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(false);
            FiltroSZP2.setVisible(false);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(false);
            filtroNDFP2.setVisible(false);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(false);
            FunMD();
        }

        if (FP2.equals("Filtrar por Servicio")) {
            busp2.setVisible(false);
            LabelBEP2.setVisible(false);
            BAppag2.setVisible(false);
            BAppag2.setText("");
            Bampag2.setVisible(false);
            Bampag2.setText("");
            busp2.setText("");
            LabelBQP2.setVisible(false);
            FiltroQP2.setVisible(false);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(true);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(true);
            FiltroSZP2.setVisible(true);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(true);
            filtroNDFP2.setVisible(false);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(false);
            FunMD();
        }
        if (FP2.equals("Filtrar por quincena")) {
            busp2.setVisible(false);
            LabelBEP2.setVisible(false);
            BAppag2.setVisible(false);
            BAppag2.setText("");
            Bampag2.setVisible(false);
            Bampag2.setText("");
            busp2.setText("");
            LabelBQP2.setVisible(true);
            FiltroQP2.setVisible(true);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(false);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(false);
            FiltroSZP2.setVisible(false);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(false);
            filtroNDFP2.setVisible(false);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(false);
            FunMD();
        }
        if (FP2.equals("Filtrar por # Lista")) {
            busp2.setVisible(false);
            LabelBEP2.setVisible(false);
            BAppag2.setVisible(false);
            BAppag2.setText("");
            Bampag2.setVisible(false);
            Bampag2.setText("");
            busp2.setText("");
            LabelBQP2.setVisible(false);
            FiltroQP2.setVisible(false);
            FiltroQP2.setSelectedIndex(0);
            FiltroServP2.setVisible(false);
            FiltroServP2.setSelectedIndex(0);
            LabelBSP2.setVisible(false);
            FiltroSZP2.setVisible(false);
            FiltroSZP2.setSelectedIndex(0);
            LabelSZP2.setVisible(false);
            filtroNDFP2.setVisible(true);
            filtroNDFP2.setText("");
            LabelNDFP2.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP2ItemStateChanged

    private void BAppag2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag2KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag2KeyReleased

    private void Bampag2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag2KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag2KeyReleased

    private void busp3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp3KeyReleased
        FunMD();
    }//GEN-LAST:event_busp3KeyReleased

    private void CS17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS17ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS17ActionPerformed

    private void FiltroSZP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP3.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP3.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP3ItemStateChanged

    private void FiltroServP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP3ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP3ItemStateChanged

    private void filtroNDFP3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP3KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP3KeyReleased

    private void FiltroQP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP3ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP3ItemStateChanged

    private void FiltrosP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP3ItemStateChanged

        String FP3 = (String) FiltrosP3.getSelectedItem();
        if (FP3.equals("Selecciona filtro")) {
            busp3.setVisible(false);
            BAppag3.setVisible(false);
            BAppag3.setText("");
            Bampag3.setVisible(false);
            Bampag3.setText("");
            LabelBEP3.setVisible(false);
            busp3.setText("");
            LabelBQP3.setVisible(false);
            FiltroQP3.setVisible(false);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(false);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(false);
            FiltroSZP3.setVisible(false);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(false);
            filtroNDFP3.setVisible(false);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(false);
            FunMD();

        }
        if (FP3.equals("Filtrar por Nombre(s)")) {
            busp3.setVisible(true);
            LabelBEP3.setVisible(true);
            LabelBEP3.setText("Buscar por nombre:");
            BAppag3.setVisible(false);
            BAppag3.setText("");
            Bampag3.setVisible(false);
            Bampag3.setText("");
            busp3.setText("");
            LabelBQP3.setVisible(false);
            FiltroQP3.setVisible(false);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(false);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(false);
            FiltroSZP3.setVisible(false);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(false);
            filtroNDFP3.setVisible(false);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(false);
            FunMD();
        }
        if (FP3.equals("Filtrar por Apellido P")) {
            busp3.setVisible(false);
            LabelBEP3.setVisible(true);
            LabelBEP3.setText("Buscar por apellido P:");
            BAppag3.setVisible(true);
            BAppag3.setText("");
            Bampag3.setVisible(false);
            Bampag3.setText("");
            busp3.setText("");
            LabelBQP3.setVisible(false);
            FiltroQP3.setVisible(false);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(false);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(false);
            FiltroSZP3.setVisible(false);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(false);
            filtroNDFP3.setVisible(false);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(false);
            FunMD();
        }
        if (FP3.equals("Filtrar por Apellido M")) {
            busp3.setVisible(false);
            LabelBEP3.setVisible(true);
            LabelBEP3.setText("Buscar por apellido M: ");
            BAppag3.setVisible(false);
            BAppag3.setText("");
            Bampag3.setVisible(true);
            Bampag3.setText("");
            busp3.setText("");
            LabelBQP3.setVisible(false);
            FiltroQP3.setVisible(false);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(false);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(false);
            FiltroSZP3.setVisible(false);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(false);
            filtroNDFP3.setVisible(false);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(false);
            FunMD();
        }
        if (FP3.equals("Filtrar por Servicio")) {
            busp3.setVisible(false);
            LabelBEP3.setVisible(false);
            BAppag3.setVisible(false);
            BAppag3.setText("");
            Bampag3.setVisible(false);
            Bampag3.setText("");
            busp3.setText("");
            LabelBQP3.setVisible(false);
            FiltroQP3.setVisible(false);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(true);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(true);
            FiltroSZP3.setVisible(true);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(true);
            filtroNDFP3.setVisible(false);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(false);
            FunMD();
        }
        if (FP3.equals("Filtrar por quincena")) {
            busp3.setVisible(false);
            LabelBEP3.setVisible(false);
            BAppag3.setVisible(false);
            BAppag3.setText("");
            Bampag3.setVisible(false);
            Bampag3.setText("");
            busp3.setText("");
            LabelBQP3.setVisible(true);
            FiltroQP3.setVisible(true);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(false);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(false);
            FiltroSZP3.setVisible(false);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(false);
            filtroNDFP3.setVisible(false);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(false);
            FunMD();
        }
        if (FP3.equals("Filtrar por # Lista")) {
            busp3.setVisible(false);
            LabelBEP3.setVisible(false);
            BAppag3.setVisible(false);
            BAppag3.setText("");
            Bampag3.setVisible(false);
            Bampag3.setText("");
            busp3.setText("");
            LabelBQP3.setVisible(false);
            FiltroQP3.setVisible(false);
            FiltroQP3.setSelectedIndex(0);
            FiltroServP3.setVisible(false);
            FiltroServP3.setSelectedIndex(0);
            LabelBSP3.setVisible(false);
            FiltroSZP3.setVisible(false);
            FiltroSZP3.setSelectedIndex(0);
            LabelSZP3.setVisible(false);
            filtroNDFP3.setVisible(true);
            filtroNDFP3.setText("");
            LabelNDFP3.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP3ItemStateChanged

    private void BAppag3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag3KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag3KeyReleased

    private void Bampag3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag3KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag3KeyReleased

    private void busp4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp4KeyReleased
        FunMD();
    }//GEN-LAST:event_busp4KeyReleased

    private void CS18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS18ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS18ActionPerformed

    private void FiltroSZP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP4.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP4.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP4ItemStateChanged

    private void FiltroServP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP4ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP4ItemStateChanged

    private void filtroNDFP4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP4KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP4KeyReleased

    private void FiltroQP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP4ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP4ItemStateChanged

    private void FiltrosP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP4ItemStateChanged

        String FP = (String) FiltrosP4.getSelectedItem();
        if (FP.equals("Selecciona filtro")) {
            busp4.setVisible(false);
            BAppag4.setVisible(false);
            BAppag4.setText("");
            Bampag4.setVisible(false);
            Bampag4.setText("");
            LabelBEP4.setVisible(false);
            busp4.setText("");
            LabelBQP4.setVisible(false);
            FiltroQP4.setVisible(false);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(false);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(false);
            FiltroSZP4.setVisible(false);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(false);
            filtroNDFP4.setVisible(false);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(false);

            FunMD();

        }
        if (FP.equals("Filtrar por Nombre(s)")) {
            busp4.setVisible(true);
            LabelBEP4.setVisible(true);
            LabelBEP4.setText("Buscar por nombre:");
            BAppag4.setVisible(false);
            BAppag4.setText("");
            Bampag4.setVisible(false);
            Bampag4.setText("");
            busp4.setText("");
            LabelBQP4.setVisible(false);
            FiltroQP4.setVisible(false);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(false);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(false);
            FiltroSZP4.setVisible(false);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(false);
            filtroNDFP4.setVisible(false);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido P")) {
            busp4.setVisible(false);
            LabelBEP4.setVisible(true);
            LabelBEP4.setText("Buscar por apellido P:");
            BAppag4.setVisible(true);
            BAppag4.setText("");
            Bampag4.setVisible(false);
            Bampag4.setText("");
            busp4.setText("");
            LabelBQP4.setVisible(false);
            FiltroQP4.setVisible(false);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(false);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(false);
            FiltroSZP4.setVisible(false);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(false);
            filtroNDFP4.setVisible(false);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido M")) {
            busp4.setVisible(false);
            LabelBEP4.setVisible(true);
            LabelBEP4.setText("Buscar por apellido M: ");
            BAppag4.setVisible(false);
            BAppag4.setText("");
            Bampag4.setVisible(true);
            Bampag4.setText("");
            busp4.setText("");
            LabelBQP4.setVisible(false);
            FiltroQP4.setVisible(false);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(false);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(false);
            FiltroSZP4.setVisible(false);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(false);
            filtroNDFP4.setVisible(false);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Servicio")) {
            busp4.setVisible(false);
            LabelBEP4.setVisible(false);
            BAppag4.setVisible(false);
            BAppag4.setText("");
            Bampag4.setVisible(false);
            Bampag4.setText("");
            busp4.setText("");
            LabelBQP4.setVisible(false);
            FiltroQP4.setVisible(false);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(true);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(true);
            FiltroSZP4.setVisible(true);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(true);
            filtroNDFP4.setVisible(false);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por quincena")) {
            busp4.setVisible(false);
            LabelBEP4.setVisible(false);
            BAppag4.setVisible(false);
            BAppag4.setText("");
            Bampag4.setVisible(false);
            Bampag4.setText("");
            busp4.setText("");
            LabelBQP4.setVisible(true);
            FiltroQP4.setVisible(true);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(false);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(false);
            FiltroSZP4.setVisible(false);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(false);
            filtroNDFP4.setVisible(false);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por # Lista")) {
            busp4.setVisible(false);
            LabelBEP4.setVisible(false);
            BAppag4.setVisible(false);
            BAppag4.setText("");
            Bampag4.setVisible(false);
            Bampag4.setText("");
            busp4.setText("");
            LabelBQP4.setVisible(false);
            FiltroQP4.setVisible(false);
            FiltroQP4.setSelectedIndex(0);
            FiltroServP4.setVisible(false);
            FiltroServP4.setSelectedIndex(0);
            LabelBSP4.setVisible(false);
            FiltroSZP4.setVisible(false);
            FiltroSZP4.setSelectedIndex(0);
            LabelSZP4.setVisible(false);
            filtroNDFP4.setVisible(true);
            filtroNDFP4.setText("");
            LabelNDFP4.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP4ItemStateChanged

    private void BAppag4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag4KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag4KeyReleased

    private void Bampag4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag4KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag4KeyReleased

    private void busp5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp5KeyReleased
        FunMD();
    }//GEN-LAST:event_busp5KeyReleased

    private void CS19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS19ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS19ActionPerformed

    private void FiltroSZP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP5.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP5.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP5ItemStateChanged

    private void FiltroServP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP5ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP5ItemStateChanged

    private void filtroNDFP5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP5KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP5KeyReleased

    private void FiltroQP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP5ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP5ItemStateChanged

    private void FiltrosP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP5ItemStateChanged
        String FP = (String) FiltrosP5.getSelectedItem();
        if (FP.equals("Selecciona filtro")) {
            busp5.setVisible(false);
            BAppag5.setVisible(false);
            BAppag5.setText("");
            Bampag5.setVisible(false);
            Bampag5.setText("");
            LabelBEP5.setVisible(false);
            busp5.setText("");
            LabelBQP5.setVisible(false);
            FiltroQP5.setVisible(false);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(false);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(false);
            FiltroSZP5.setVisible(false);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(false);
            filtroNDFP5.setVisible(false);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(false);
            FunMD();

        }
        if (FP.equals("Filtrar por Nombre(s)")) {
            busp5.setVisible(true);
            LabelBEP5.setVisible(true);
            LabelBEP5.setText("Buscar por nombre:");
            BAppag5.setVisible(false);
            BAppag5.setText("");
            Bampag5.setVisible(false);
            Bampag5.setText("");
            busp5.setText("");
            LabelBQP5.setVisible(false);
            FiltroQP5.setVisible(false);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(false);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(false);
            FiltroSZP5.setVisible(false);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(false);
            filtroNDFP5.setVisible(false);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido P")) {
            busp5.setVisible(false);
            LabelBEP5.setVisible(true);
            LabelBEP5.setText("Buscar por apellido P:");
            BAppag5.setVisible(true);
            BAppag5.setText("");
            Bampag5.setVisible(false);
            Bampag5.setText("");
            busp5.setText("");
            LabelBQP5.setVisible(false);
            FiltroQP5.setVisible(false);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(false);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(false);
            FiltroSZP5.setVisible(false);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(false);
            filtroNDFP5.setVisible(false);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido M")) {
            busp5.setVisible(false);
            LabelBEP5.setVisible(true);
            LabelBEP5.setText("Buscar por apellido M: ");
            BAppag5.setVisible(false);
            BAppag5.setText("");
            Bampag5.setVisible(true);
            Bampag5.setText("");
            busp5.setText("");
            LabelBQP5.setVisible(false);
            FiltroQP5.setVisible(false);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(false);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(false);
            FiltroSZP5.setVisible(false);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(false);
            filtroNDFP5.setVisible(false);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Servicio")) {
            busp5.setVisible(false);
            LabelBEP5.setVisible(false);
            BAppag5.setVisible(false);
            BAppag5.setText("");
            Bampag5.setVisible(false);
            Bampag5.setText("");
            busp5.setText("");
            LabelBQP5.setVisible(false);
            FiltroQP5.setVisible(false);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(true);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(true);
            FiltroSZP5.setVisible(true);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(true);
            filtroNDFP5.setVisible(false);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por quincena")) {
            busp5.setVisible(false);
            LabelBEP5.setVisible(false);
            BAppag5.setVisible(false);
            BAppag5.setText("");
            Bampag5.setVisible(false);
            Bampag5.setText("");
            busp5.setText("");
            LabelBQP5.setVisible(true);
            FiltroQP5.setVisible(true);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(false);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(false);
            FiltroSZP5.setVisible(false);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(false);
            filtroNDFP5.setVisible(false);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por # Lista")) {
            busp5.setVisible(false);
            LabelBEP5.setVisible(false);
            BAppag5.setVisible(false);
            BAppag5.setText("");
            Bampag5.setVisible(false);
            Bampag5.setText("");
            busp5.setText("");
            LabelBQP5.setVisible(false);
            FiltroQP5.setVisible(false);
            FiltroQP5.setSelectedIndex(0);
            FiltroServP5.setVisible(false);
            FiltroServP5.setSelectedIndex(0);
            LabelBSP5.setVisible(false);
            FiltroSZP5.setVisible(false);
            FiltroSZP5.setSelectedIndex(0);
            LabelSZP5.setVisible(false);
            filtroNDFP5.setVisible(true);
            filtroNDFP5.setText("");
            LabelNDFP5.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP5ItemStateChanged

    private void BAppag5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag5KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag5KeyReleased

    private void Bampag5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag5KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag5KeyReleased

    private void busp6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp6KeyReleased
        FunMD();
    }//GEN-LAST:event_busp6KeyReleased

    private void CS20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS20ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS20ActionPerformed

    private void FiltroSZP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP6.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP6.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP6ItemStateChanged

    private void FiltroServP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP6ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP6ItemStateChanged

    private void filtroNDFP6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP6KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP6KeyReleased

    private void FiltroQP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP6ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP6ItemStateChanged

    private void FiltrosP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP6ItemStateChanged

        String FP6 = (String) FiltrosP6.getSelectedItem();
        if (FP6.equals("Selecciona filtro")) {
            busp6.setVisible(false);
            BAppag6.setVisible(false);
            BAppag6.setText("");
            Bampag6.setVisible(false);
            Bampag6.setText("");
            LabelBEP6.setVisible(false);
            busp6.setText("");
            LabelBQP6.setVisible(false);
            FiltroQP6.setVisible(false);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(false);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(false);
            FiltroSZP6.setVisible(false);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(false);
            filtroNDFP6.setVisible(false);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(false);
            FunMD();

        }
        if (FP6.equals("Filtrar por Nombre(s)")) {
            busp6.setVisible(true);
            LabelBEP6.setVisible(true);
            LabelBEP6.setText("Buscar por nombre:");
            BAppag6.setVisible(false);
            BAppag6.setText("");
            Bampag6.setVisible(false);
            Bampag6.setText("");
            busp6.setText("");
            LabelBQP6.setVisible(false);
            FiltroQP6.setVisible(false);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(false);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(false);
            FiltroSZP6.setVisible(false);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(false);
            filtroNDFP6.setVisible(false);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(false);
            FunMD();
        }
        if (FP6.equals("Filtrar por Apellido P")) {
            busp6.setVisible(false);
            LabelBEP6.setVisible(true);
            LabelBEP6.setText("Buscar por apellido P:");
            BAppag6.setVisible(true);
            BAppag6.setText("");
            Bampag6.setVisible(false);
            Bampag6.setText("");
            busp6.setText("");
            LabelBQP6.setVisible(false);
            FiltroQP6.setVisible(false);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(false);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(false);
            FiltroSZP6.setVisible(false);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(false);
            filtroNDFP6.setVisible(false);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(false);
            FunMD();
        }
        if (FP6.equals("Filtrar por Apellido M")) {
            busp6.setVisible(false);
            LabelBEP6.setVisible(true);
            LabelBEP6.setText("Buscar por apellido M: ");
            BAppag6.setVisible(false);
            BAppag6.setText("");
            Bampag6.setVisible(true);
            Bampag6.setText("");
            busp6.setText("");
            LabelBQP6.setVisible(false);
            FiltroQP6.setVisible(false);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(false);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(false);
            FiltroSZP6.setVisible(false);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(false);
            filtroNDFP6.setVisible(false);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(false);
            FunMD();
        }
        if (FP6.equals("Filtrar por Servicio")) {
            busp6.setVisible(false);
            LabelBEP6.setVisible(false);
            BAppag6.setVisible(false);
            BAppag6.setText("");
            Bampag6.setVisible(false);
            Bampag6.setText("");
            busp6.setText("");
            LabelBQP6.setVisible(false);
            FiltroQP6.setVisible(false);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(true);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(true);
            FiltroSZP6.setVisible(true);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(true);
            filtroNDFP6.setVisible(false);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(false);
            FunMD();
        }
        if (FP6.equals("Filtrar por quincena")) {
            busp6.setVisible(false);
            LabelBEP6.setVisible(false);
            BAppag6.setVisible(false);
            BAppag6.setText("");
            Bampag6.setVisible(false);
            Bampag6.setText("");
            busp6.setText("");
            LabelBQP6.setVisible(true);
            FiltroQP6.setVisible(true);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(false);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(false);
            FiltroSZP6.setVisible(false);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(false);
            filtroNDFP6.setVisible(false);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(false);
            FunMD();
        }
        if (FP6.equals("Filtrar por # Lista")) {
            busp6.setVisible(false);
            LabelBEP6.setVisible(false);
            BAppag6.setVisible(false);
            BAppag6.setText("");
            Bampag6.setVisible(false);
            Bampag6.setText("");
            busp6.setText("");
            LabelBQP6.setVisible(false);
            FiltroQP6.setVisible(false);
            FiltroQP6.setSelectedIndex(0);
            FiltroServP6.setVisible(false);
            FiltroServP6.setSelectedIndex(0);
            LabelBSP6.setVisible(false);
            FiltroSZP6.setVisible(false);
            FiltroSZP6.setSelectedIndex(0);
            LabelSZP6.setVisible(false);
            filtroNDFP6.setVisible(true);
            filtroNDFP6.setText("");
            LabelNDFP6.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP6ItemStateChanged

    private void BAppag6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag6KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag6KeyReleased

    private void Bampag6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag6KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag6KeyReleased

    private void busp7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp7KeyReleased
        FunMD();
    }//GEN-LAST:event_busp7KeyReleased

    private void CS21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS21ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS21ActionPerformed

    private void FiltroSZP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP7ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP7.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP7.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZP7ItemStateChanged

    private void FiltroServP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP7ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroServP7ItemStateChanged

    private void filtroNDFP7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP7KeyReleased
        FunMD();
    }//GEN-LAST:event_filtroNDFP7KeyReleased

    private void FiltroQP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP7ItemStateChanged
        FunMD();
    }//GEN-LAST:event_FiltroQP7ItemStateChanged

    private void FiltrosP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosP7ItemStateChanged

        String FP = (String) FiltrosP7.getSelectedItem();
        if (FP.equals("Selecciona filtro")) {
            busp7.setVisible(false);
            BAppag7.setVisible(false);
            BAppag7.setText("");
            Bampag7.setVisible(false);
            Bampag7.setText("");
            LabelBEP7.setVisible(false);
            busp7.setText("");
            LabelBQP7.setVisible(false);
            FiltroQP7.setVisible(false);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(false);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(false);
            FiltroSZP7.setVisible(false);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(false);
            filtroNDFP7.setVisible(false);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(false);
            FunMD();

        }
        if (FP.equals("Filtrar por Nombre(s)")) {
            busp7.setVisible(true);
            LabelBEP7.setVisible(true);
            LabelBEP7.setText("Buscar por nombre:");
            BAppag7.setVisible(false);
            BAppag7.setText("");
            Bampag7.setVisible(false);
            Bampag7.setText("");
            busp7.setText("");
            LabelBQP7.setVisible(false);
            FiltroQP7.setVisible(false);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(false);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(false);
            FiltroSZP7.setVisible(false);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(false);
            filtroNDFP7.setVisible(false);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido P")) {
            busp7.setVisible(false);
            LabelBEP7.setVisible(true);
            LabelBEP7.setText("Buscar por apellido P:");
            BAppag7.setVisible(true);
            BAppag7.setText("");
            Bampag7.setVisible(false);
            Bampag7.setText("");
            busp7.setText("");
            LabelBQP7.setVisible(false);
            FiltroQP7.setVisible(false);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(false);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(false);
            FiltroSZP7.setVisible(false);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(false);
            filtroNDFP7.setVisible(false);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Apellido M")) {
            busp7.setVisible(false);
            LabelBEP7.setVisible(true);
            LabelBEP7.setText("Buscar por apellido M: ");
            BAppag7.setVisible(false);
            BAppag7.setText("");
            Bampag7.setVisible(true);
            Bampag7.setText("");
            busp7.setText("");
            LabelBQP7.setVisible(false);
            FiltroQP7.setVisible(false);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(false);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(false);
            FiltroSZP7.setVisible(false);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(false);
            filtroNDFP7.setVisible(false);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por Servicio")) {
            busp7.setVisible(false);
            LabelBEP7.setVisible(false);
            BAppag7.setVisible(false);
            BAppag7.setText("");
            Bampag7.setVisible(false);
            Bampag7.setText("");
            busp7.setText("");
            LabelBQP7.setVisible(false);
            FiltroQP7.setVisible(false);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(true);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(true);
            FiltroSZP7.setVisible(true);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(true);
            filtroNDFP7.setVisible(false);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por quincena")) {
            busp7.setVisible(false);
            LabelBEP7.setVisible(false);
            BAppag7.setVisible(false);
            BAppag7.setText("");
            Bampag7.setVisible(false);
            Bampag7.setText("");
            busp7.setText("");
            LabelBQP7.setVisible(true);
            FiltroQP7.setVisible(true);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(false);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(false);
            FiltroSZP7.setVisible(false);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(false);
            filtroNDFP7.setVisible(false);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(false);
            FunMD();
        }
        if (FP.equals("Filtrar por # Lista")) {
            busp7.setVisible(false);
            LabelBEP7.setVisible(false);
            BAppag7.setVisible(false);
            BAppag7.setText("");
            Bampag7.setVisible(false);
            Bampag7.setText("");
            busp7.setText("");
            LabelBQP7.setVisible(false);
            FiltroQP7.setVisible(false);
            FiltroQP7.setSelectedIndex(0);
            FiltroServP7.setVisible(false);
            FiltroServP7.setSelectedIndex(0);
            LabelBSP7.setVisible(false);
            FiltroSZP7.setVisible(false);
            FiltroSZP7.setSelectedIndex(0);
            LabelSZP7.setVisible(false);
            filtroNDFP7.setVisible(true);
            filtroNDFP7.setText("");
            LabelNDFP7.setVisible(true);
            FunMD();
        }
    }//GEN-LAST:event_FiltrosP7ItemStateChanged

    private void BAppag7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppag7KeyReleased
        FunMD();
    }//GEN-LAST:event_BAppag7KeyReleased

    private void Bampag7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag7KeyReleased
        FunMD();
    }//GEN-LAST:event_Bampag7KeyReleased

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

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(Depositos_SIMSS_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Depositos_SIMSS_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD;
    private javax.swing.JMenuItem ADMV1;
    private javax.swing.JTextField AdN;
    private javax.swing.JButton Adddeposito;
    private javax.swing.JButton Adddeposito1;
    private javax.swing.JMenuItem Alumnos;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField BAppag;
    private javax.swing.JTextField BAppag1;
    private javax.swing.JTextField BAppag2;
    private javax.swing.JTextField BAppag3;
    private javax.swing.JTextField BAppag4;
    private javax.swing.JTextField BAppag5;
    private javax.swing.JTextField BAppag6;
    private javax.swing.JTextField BAppag7;
    private javax.swing.JTextField Bampag;
    private javax.swing.JTextField Bampag1;
    private javax.swing.JTextField Bampag2;
    private javax.swing.JTextField Bampag3;
    private javax.swing.JTextField Bampag4;
    private javax.swing.JTextField Bampag5;
    private javax.swing.JTextField Bampag6;
    private javax.swing.JTextField Bampag7;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField Bp;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA4;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JButton CS10;
    private javax.swing.JButton CS11;
    private javax.swing.JButton CS12;
    private javax.swing.JButton CS13;
    private javax.swing.JButton CS14;
    private javax.swing.JButton CS15;
    private javax.swing.JButton CS16;
    private javax.swing.JButton CS17;
    private javax.swing.JButton CS18;
    private javax.swing.JButton CS19;
    private javax.swing.JButton CS2;
    private javax.swing.JButton CS20;
    private javax.swing.JButton CS21;
    private javax.swing.JButton CS3;
    private javax.swing.JButton CS8;
    private javax.swing.JButton CS9;
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
    private javax.swing.JTextField Dpi;
    private javax.swing.JMenuItem EmpleadosT;
    private javax.swing.JMenuItem Estadias;
    private javax.swing.JTextField F;
    private javax.swing.JTextField FAmT;
    private javax.swing.JTextField FAmT1;
    private javax.swing.JTextField FAmT2;
    private javax.swing.JTextField FAmT3;
    private javax.swing.JTextField FAmT4;
    private javax.swing.JTextField FAmT5;
    private javax.swing.JTextField FAmT6;
    private javax.swing.JTextField FAmT7;
    private javax.swing.JTextField FApT;
    private javax.swing.JTextField FApT1;
    private javax.swing.JTextField FApT2;
    private javax.swing.JTextField FApT3;
    private javax.swing.JTextField FApT4;
    private javax.swing.JTextField FApT5;
    private javax.swing.JTextField FApT6;
    private javax.swing.JTextField FApT7;
    private com.toedter.calendar.JDateChooser FDD;
    private javax.swing.JTextField FDP;
    private javax.swing.JTextField FJ;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JComboBox<String> FZservicio1;
    private javax.swing.JComboBox<String> FZservicio2;
    private javax.swing.JComboBox<String> FZservicio3;
    private javax.swing.JComboBox<String> FZservicio4;
    private javax.swing.JComboBox<String> FZservicio5;
    private javax.swing.JComboBox<String> FZservicio6;
    private javax.swing.JComboBox<String> FZservicio7;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JTextField FiltroNDF1;
    private javax.swing.JTextField FiltroNDF2;
    private javax.swing.JTextField FiltroNDF3;
    private javax.swing.JTextField FiltroNDF4;
    private javax.swing.JTextField FiltroNDF5;
    private javax.swing.JTextField FiltroNDF6;
    private javax.swing.JTextField FiltroNDF7;
    private javax.swing.JComboBox<String> FiltroQP;
    private javax.swing.JComboBox<String> FiltroQP1;
    private javax.swing.JComboBox<String> FiltroQP2;
    private javax.swing.JComboBox<String> FiltroQP3;
    private javax.swing.JComboBox<String> FiltroQP4;
    private javax.swing.JComboBox<String> FiltroQP5;
    private javax.swing.JComboBox<String> FiltroQP6;
    private javax.swing.JComboBox<String> FiltroQP7;
    private javax.swing.JComboBox<String> FiltroQuincenanomina;
    private javax.swing.JComboBox<String> FiltroQuincenanomina1;
    private javax.swing.JComboBox<String> FiltroQuincenanomina2;
    private javax.swing.JComboBox<String> FiltroQuincenanomina3;
    private javax.swing.JComboBox<String> FiltroQuincenanomina4;
    private javax.swing.JComboBox<String> FiltroQuincenanomina5;
    private javax.swing.JComboBox<String> FiltroQuincenanomina6;
    private javax.swing.JComboBox<String> FiltroQuincenanomina7;
    private javax.swing.JComboBox<String> FiltroSZP;
    private javax.swing.JComboBox<String> FiltroSZP1;
    private javax.swing.JComboBox<String> FiltroSZP2;
    private javax.swing.JComboBox<String> FiltroSZP3;
    private javax.swing.JComboBox<String> FiltroSZP4;
    private javax.swing.JComboBox<String> FiltroSZP5;
    private javax.swing.JComboBox<String> FiltroSZP6;
    private javax.swing.JComboBox<String> FiltroSZP7;
    private javax.swing.JComboBox<String> FiltroServP;
    private javax.swing.JComboBox<String> FiltroServP1;
    private javax.swing.JComboBox<String> FiltroServP2;
    private javax.swing.JComboBox<String> FiltroServP3;
    private javax.swing.JComboBox<String> FiltroServP4;
    private javax.swing.JComboBox<String> FiltroServP5;
    private javax.swing.JComboBox<String> FiltroServP6;
    private javax.swing.JComboBox<String> FiltroServP7;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroSnomina1;
    private javax.swing.JComboBox<String> FiltroSnomina2;
    private javax.swing.JComboBox<String> FiltroSnomina3;
    private javax.swing.JComboBox<String> FiltroSnomina4;
    private javax.swing.JComboBox<String> FiltroSnomina5;
    private javax.swing.JComboBox<String> FiltroSnomina6;
    private javax.swing.JComboBox<String> FiltroSnomina7;
    private javax.swing.JComboBox<String> FiltrosP;
    private javax.swing.JComboBox<String> FiltrosP1;
    private javax.swing.JComboBox<String> FiltrosP2;
    private javax.swing.JComboBox<String> FiltrosP3;
    private javax.swing.JComboBox<String> FiltrosP4;
    private javax.swing.JComboBox<String> FiltrosP5;
    private javax.swing.JComboBox<String> FiltrosP6;
    private javax.swing.JComboBox<String> FiltrosP7;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JComboBox<String> FiltrosTD1;
    private javax.swing.JComboBox<String> FiltrosTD2;
    private javax.swing.JComboBox<String> FiltrosTD3;
    private javax.swing.JComboBox<String> FiltrosTD4;
    private javax.swing.JComboBox<String> FiltrosTD5;
    private javax.swing.JComboBox<String> FiltrosTD6;
    private javax.swing.JComboBox<String> FiltrosTD7;
    private javax.swing.JMenuItem General;
    private javax.swing.JMenuItem General1;
    private javax.swing.JTextField Grua;
    private javax.swing.JTextField HE;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JMenuItem LDA3;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBE1;
    private javax.swing.JLabel LabelBE2;
    private javax.swing.JLabel LabelBE3;
    private javax.swing.JLabel LabelBE4;
    private javax.swing.JLabel LabelBE5;
    private javax.swing.JLabel LabelBE6;
    private javax.swing.JLabel LabelBE7;
    private javax.swing.JLabel LabelBEP;
    private javax.swing.JLabel LabelBEP1;
    private javax.swing.JLabel LabelBEP2;
    private javax.swing.JLabel LabelBEP3;
    private javax.swing.JLabel LabelBEP4;
    private javax.swing.JLabel LabelBEP5;
    private javax.swing.JLabel LabelBEP6;
    private javax.swing.JLabel LabelBEP7;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBNDF1;
    private javax.swing.JLabel LabelBNDF2;
    private javax.swing.JLabel LabelBNDF3;
    private javax.swing.JLabel LabelBNDF4;
    private javax.swing.JLabel LabelBNDF5;
    private javax.swing.JLabel LabelBNDF6;
    private javax.swing.JLabel LabelBNDF7;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQ1;
    private javax.swing.JLabel LabelBQ2;
    private javax.swing.JLabel LabelBQ3;
    private javax.swing.JLabel LabelBQ4;
    private javax.swing.JLabel LabelBQ5;
    private javax.swing.JLabel LabelBQ6;
    private javax.swing.JLabel LabelBQ7;
    private javax.swing.JLabel LabelBQP;
    private javax.swing.JLabel LabelBQP1;
    private javax.swing.JLabel LabelBQP2;
    private javax.swing.JLabel LabelBQP3;
    private javax.swing.JLabel LabelBQP4;
    private javax.swing.JLabel LabelBQP5;
    private javax.swing.JLabel LabelBQP6;
    private javax.swing.JLabel LabelBQP7;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBS1;
    private javax.swing.JLabel LabelBS2;
    private javax.swing.JLabel LabelBS3;
    private javax.swing.JLabel LabelBS4;
    private javax.swing.JLabel LabelBS5;
    private javax.swing.JLabel LabelBS6;
    private javax.swing.JLabel LabelBS7;
    private javax.swing.JLabel LabelBSP;
    private javax.swing.JLabel LabelBSP1;
    private javax.swing.JLabel LabelBSP2;
    private javax.swing.JLabel LabelBSP3;
    private javax.swing.JLabel LabelBSP4;
    private javax.swing.JLabel LabelBSP5;
    private javax.swing.JLabel LabelBSP6;
    private javax.swing.JLabel LabelBSP7;
    private javax.swing.JLabel LabelDSGS;
    private javax.swing.JLabel LabelNDFP;
    private javax.swing.JLabel LabelNDFP1;
    private javax.swing.JLabel LabelNDFP2;
    private javax.swing.JLabel LabelNDFP3;
    private javax.swing.JLabel LabelNDFP4;
    private javax.swing.JLabel LabelNDFP5;
    private javax.swing.JLabel LabelNDFP6;
    private javax.swing.JLabel LabelNDFP7;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZ1;
    private javax.swing.JLabel LabelSZ2;
    private javax.swing.JLabel LabelSZ3;
    private javax.swing.JLabel LabelSZ4;
    private javax.swing.JLabel LabelSZ5;
    private javax.swing.JLabel LabelSZ6;
    private javax.swing.JLabel LabelSZ7;
    private javax.swing.JLabel LabelSZP;
    private javax.swing.JLabel LabelSZP1;
    private javax.swing.JLabel LabelSZP2;
    private javax.swing.JLabel LabelSZP3;
    private javax.swing.JLabel LabelSZP4;
    private javax.swing.JLabel LabelSZP5;
    private javax.swing.JLabel LabelSZP6;
    private javax.swing.JLabel LabelSZP7;
    private javax.swing.JTextField Lugar;
    private javax.swing.JComboBox<String> MDP;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NEnom;
    private javax.swing.JTextField NFnom;
    private javax.swing.JTextField NomISR;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Nominab1;
    private javax.swing.JTextField Nominab2;
    private javax.swing.JTextField Nominab3;
    private javax.swing.JTextField Nominab4;
    private javax.swing.JTextField Nominab5;
    private javax.swing.JTextField Nominab6;
    private javax.swing.JTextField Nominab7;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JTextArea Obsdeposito;
    private javax.swing.JTextField Odtp;
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
    private javax.swing.JTextField Sancion;
    private javax.swing.JMenu Semanales;
    private javax.swing.JTextField ServN;
    private javax.swing.JScrollPane TDFA;
    private javax.swing.JScrollPane TDFA1;
    private javax.swing.JScrollPane TDFA2;
    private javax.swing.JScrollPane TDFA3;
    private javax.swing.JScrollPane TDFA4;
    private javax.swing.JScrollPane TDFA5;
    private javax.swing.JScrollPane TDFA6;
    private javax.swing.JScrollPane TDFA7;
    private javax.swing.JTextField THE;
    private javax.swing.JScrollPane TPagos;
    private javax.swing.JScrollPane TPagos1;
    private javax.swing.JScrollPane TPagos2;
    private javax.swing.JScrollPane TPagos3;
    private javax.swing.JScrollPane TPagos4;
    private javax.swing.JScrollPane TPagos5;
    private javax.swing.JScrollPane TPagos6;
    private javax.swing.JScrollPane TPagos7;
    private javax.swing.JTable Tdep;
    private javax.swing.JTable Tdep1;
    private javax.swing.JTable Tdep2;
    private javax.swing.JTable Tdep3;
    private javax.swing.JTable Tdep4;
    private javax.swing.JTable Tdep5;
    private javax.swing.JTable Tdep6;
    private javax.swing.JTable Tdep7;
    private javax.swing.JTable Tnom;
    private javax.swing.JTable Tnom1;
    private javax.swing.JTable Tnom2;
    private javax.swing.JTable Tnom3;
    private javax.swing.JTable Tnom4;
    private javax.swing.JTable Tnom5;
    private javax.swing.JTable Tnom6;
    private javax.swing.JTable Tnom7;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private javax.swing.JTextField busp;
    private javax.swing.JTextField busp1;
    private javax.swing.JTextField busp2;
    private javax.swing.JTextField busp3;
    private javax.swing.JTextField busp4;
    private javax.swing.JTextField busp5;
    private javax.swing.JTextField busp6;
    private javax.swing.JTextField busp7;
    private javax.swing.JTextField cda;
    private javax.swing.JTextField cta;
    private javax.swing.JTextField deposito;
    private javax.swing.JTextField dt;
    private javax.swing.JTextField filtroNDFP;
    private javax.swing.JTextField filtroNDFP1;
    private javax.swing.JTextField filtroNDFP2;
    private javax.swing.JTextField filtroNDFP3;
    private javax.swing.JTextField filtroNDFP4;
    private javax.swing.JTextField filtroNDFP5;
    private javax.swing.JTextField filtroNDFP6;
    private javax.swing.JTextField filtroNDFP7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel76;
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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
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
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JScrollPane k;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField pds;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
