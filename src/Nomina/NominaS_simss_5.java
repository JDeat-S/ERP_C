package Nomina;

import Nomina.ModulosS.CDAS_5;
import Nomina.ModulosS.PresS_5;
import Nomina.ModulosS.ODTS_5;
import Nomina.ModulosQ.CDAQ_5;
import Nomina.ModulosQ.ODTQ_5;
import Nomina.ModulosQ.PresQ_5;
import VentanasDReportes.RepNom_7;
import Admin.*;
import Conexion.ConexionSQL;
import RH.*;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import Inicio.Inicio_1;
import Logicas.Logica_permisos;
import Logicas.Logica_usuarios;
import VentanasDReportes.RepNomSem_7;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.MessageFormat;
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
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class NominaS_simss_5 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    ButtonGroup DAB;
    Calendar fecha_actual = new GregorianCalendar();
    double DS, DM, DMi, DJ, DV,
            AS, AD, AL, AM, AMi, AJ, AV,
            dd, in, dv, df, dft,
            DO1, DO2, R1, R2, dt1, dt2, dt3, dt4, DL1, DL2, dt5,
            dt6, F1, F2, FJ1, FJ2, FJ3, FJ4, FJ5, dt7, R3, R4, R5, R6, R7,
            DO3, DO4, DO5, DO6, DO7, DL3, DL4, DL5, DL6, DL7, FJ6, FJ7,
            DSGS1, DSGS2, DSGS3, DSGS4, DSGS5, DSGS6, DSGS7,
            F3, F4, F5, F6, F7,
            dd2, in2, dv2, df2, dft2,
            dd3, in3, dv3, df3, dft3,
            dd4, in4, dv4, df4, dft4,
            dd5, in5, dv5, df5, dft5,
            dd6, in6, dv6, df6, dft6,
            dd7, in7, dv7, df7, dft7;

    Logica_usuarios usr;
    Logica_permisos LP;

    public NominaS_simss_5() {
        initComponents();
        DAB = new ButtonGroup();
        DAB.add(Bsi);
        DAB.add(Bno);
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas zz8 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas8 = new DefaultComboBoxModel(zz8.mostrarzonas());
        FZservicio8.setModel(modelzonas8);
        FiltrosZonas FSZP8 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP8 = new DefaultComboBoxModel(FSZP8.mostrarzonas());
        FiltroSZP8.setModel(modelFSZP8);
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
        año.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        Bono.setVisible(false);
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
        Filtro1.setVisible(false);
        BNameNom.setVisible(false);
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
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
        shareN();
        sharepresnom();
        FunMD();
        setIconImage(new ImageIcon(NominaS_simss_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        sumaDep();
        sharecdanom();
        sharepresnom();
        shareODTnom();
    }

    public NominaS_simss_5(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        DAB = new ButtonGroup();
        DAB.add(Bsi);
        DAB.add(Bno);
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas zz8 = new FiltrosZonas();
        DefaultComboBoxModel modelzonas8 = new DefaultComboBoxModel(zz8.mostrarzonas());
        FZservicio8.setModel(modelzonas8);
        FiltrosZonas FSZP8 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP8 = new DefaultComboBoxModel(FSZP8.mostrarzonas());
        FiltroSZP8.setModel(modelFSZP8);
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
        año.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        Bono.setVisible(false);
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
        Filtro1.setVisible(false);
        BNameNom.setVisible(false);
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
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
        shareN();
        sharepresnom();
        FunMD();
        setIconImage(new ImageIcon(NominaS_simss_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        sumaDep();
        sharecdanom();
        sharepresnom();
        shareODTnom();
        setTitle("Nomina Semanal General. # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
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
                    NomDetallada.setVisible(false);
                }
                if (LP.getP6() == 0) {
                    NomPagos.setVisible(false);
                }
                if (LP.getP7() == 0) {
                    PRES.setVisible(false);
                }
                if (LP.getP8() == 0) {
                    //Nomsem.setVisible(false);
                    NomSemGen.setVisible(false);
                }
                if (LP.getP9() == 0) {
                    PresSem.setVisible(false);
                }
                if (LP.getP10() == 0) {
                    Modm.setVisible(false);
                }
            }
            default -> {
            }
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Fvier = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Fmier = new com.toedter.calendar.JDateChooser();
        Fmar = new com.toedter.calendar.JDateChooser();
        FLun = new com.toedter.calendar.JDateChooser();
        Fsab = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FJuev = new com.toedter.calendar.JDateChooser();
        Bono = new javax.swing.JTextField();
        Bno = new javax.swing.JRadioButton();
        Bsi = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        FDom = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        año = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Semana = new javax.swing.JComboBox<>();
        LS = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        FDP = new com.toedter.calendar.JDateChooser();
        SabT = new javax.swing.JComboBox<>();
        MierT = new javax.swing.JComboBox<>();
        VieT = new javax.swing.JComboBox<>();
        JueT = new javax.swing.JComboBox<>();
        LunT = new javax.swing.JComboBox<>();
        DomT = new javax.swing.JComboBox<>();
        MarT = new javax.swing.JComboBox<>();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        NDL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        NE = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Zon = new javax.swing.JTextField();
        ban = new javax.swing.JTextField();
        ServN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Bono1 = new javax.swing.JTextField();
        BAPNom = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        BAMNom = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        FiltrosNom = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        CS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        share = new javax.swing.JTable();
        Filtro1 = new javax.swing.JLabel();
        BNameNom = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        PH = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        Clean = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        Dpi = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        Ddv = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        DD = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        DL = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        LabelDSGS = new javax.swing.JLabel();
        DSGS = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        PDDDV = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        PDDD = new javax.swing.JLabel();
        pds = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        PDDL = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        PDDT = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        PDDDDSGS = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel261 = new javax.swing.JLabel();
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
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        DF = new javax.swing.JLabel();
        DFT = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        PDDF = new javax.swing.JLabel();
        PDDFT = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        HE = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        THE = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel134 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        jLabel262 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        DPF = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        DI = new javax.swing.JTextField();
        jScrollPane24 = new javax.swing.JScrollPane();
        SHPresnom = new javax.swing.JTable();
        jLabel144 = new javax.swing.JLabel();
        jScrollPane25 = new javax.swing.JScrollPane();
        SHCDAnom = new javax.swing.JTable();
        cda = new javax.swing.JTextField();
        jLabel263 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jScrollPane26 = new javax.swing.JScrollPane();
        SHODTnom = new javax.swing.JTable();
        jLabel264 = new javax.swing.JLabel();
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
        jLabel265 = new javax.swing.JLabel();
        Presp = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        NSprenom = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        NSODTnom = new javax.swing.JTextField();
        jLabel266 = new javax.swing.JLabel();
        RI = new javax.swing.JTextField();
        jLabel267 = new javax.swing.JLabel();
        RF = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        ISR = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        deposito = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        AgregarNP = new javax.swing.JButton();
        Modm = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        Pbs = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
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
        ADN = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        NomDetallada = new javax.swing.JScrollPane();
        PestanañasND = new javax.swing.JTabbedPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        FApT = new javax.swing.JTextField();
        LabelBS = new javax.swing.JLabel();
        FAmT = new javax.swing.JTextField();
        FiltroSnomina = new javax.swing.JComboBox<>();
        botonWeb1 = new botones.BotonWeb();
        LabelBQ = new javax.swing.JLabel();
        FiltroQuincenanomina = new javax.swing.JComboBox<>();
        LabelSZ = new javax.swing.JLabel();
        FZservicio = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        LabelBE = new javax.swing.JLabel();
        FiltrosTD = new javax.swing.JComboBox<>();
        Nominab = new javax.swing.JTextField();
        LabelBNDF = new javax.swing.JLabel();
        Eliminar = new javax.swing.JButton();
        FiltroNDF = new javax.swing.JTextField();
        CS2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tnom = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        FApT1 = new javax.swing.JTextField();
        LabelBS1 = new javax.swing.JLabel();
        FAmT1 = new javax.swing.JTextField();
        FiltroSnomina1 = new javax.swing.JComboBox<>();
        botonWeb3 = new botones.BotonWeb();
        LabelBQ1 = new javax.swing.JLabel();
        FiltroQuincenanomina1 = new javax.swing.JComboBox<>();
        LabelSZ1 = new javax.swing.JLabel();
        FZservicio1 = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        LabelBE1 = new javax.swing.JLabel();
        FiltrosTD1 = new javax.swing.JComboBox<>();
        Nominab1 = new javax.swing.JTextField();
        LabelBNDF1 = new javax.swing.JLabel();
        Eliminar1 = new javax.swing.JButton();
        FiltroNDF1 = new javax.swing.JTextField();
        CS4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tnom1 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel10 = new javax.swing.JPanel();
        FApT2 = new javax.swing.JTextField();
        LabelBS2 = new javax.swing.JLabel();
        FAmT2 = new javax.swing.JTextField();
        FiltroSnomina2 = new javax.swing.JComboBox<>();
        botonWeb4 = new botones.BotonWeb();
        LabelBQ2 = new javax.swing.JLabel();
        FiltroQuincenanomina2 = new javax.swing.JComboBox<>();
        LabelSZ2 = new javax.swing.JLabel();
        FZservicio2 = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        LabelBE2 = new javax.swing.JLabel();
        FiltrosTD2 = new javax.swing.JComboBox<>();
        Nominab2 = new javax.swing.JTextField();
        LabelBNDF2 = new javax.swing.JLabel();
        Eliminar2 = new javax.swing.JButton();
        FiltroNDF2 = new javax.swing.JTextField();
        CS5 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        Tnom2 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        jPanel14 = new javax.swing.JPanel();
        FApT3 = new javax.swing.JTextField();
        LabelBS3 = new javax.swing.JLabel();
        FAmT3 = new javax.swing.JTextField();
        FiltroSnomina3 = new javax.swing.JComboBox<>();
        botonWeb5 = new botones.BotonWeb();
        LabelBQ3 = new javax.swing.JLabel();
        FiltroQuincenanomina3 = new javax.swing.JComboBox<>();
        LabelSZ3 = new javax.swing.JLabel();
        FZservicio3 = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        LabelBE3 = new javax.swing.JLabel();
        FiltrosTD3 = new javax.swing.JComboBox<>();
        Nominab3 = new javax.swing.JTextField();
        LabelBNDF3 = new javax.swing.JLabel();
        Eliminar3 = new javax.swing.JButton();
        FiltroNDF3 = new javax.swing.JTextField();
        CS6 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        Tnom3 = new javax.swing.JTable();
        jScrollPane14 = new javax.swing.JScrollPane();
        jPanel15 = new javax.swing.JPanel();
        FApT4 = new javax.swing.JTextField();
        LabelBS4 = new javax.swing.JLabel();
        FAmT4 = new javax.swing.JTextField();
        FiltroSnomina4 = new javax.swing.JComboBox<>();
        botonWeb6 = new botones.BotonWeb();
        LabelBQ4 = new javax.swing.JLabel();
        FiltroQuincenanomina4 = new javax.swing.JComboBox<>();
        LabelSZ4 = new javax.swing.JLabel();
        FZservicio4 = new javax.swing.JComboBox<>();
        jLabel69 = new javax.swing.JLabel();
        LabelBE4 = new javax.swing.JLabel();
        FiltrosTD4 = new javax.swing.JComboBox<>();
        Nominab4 = new javax.swing.JTextField();
        LabelBNDF4 = new javax.swing.JLabel();
        Eliminar4 = new javax.swing.JButton();
        FiltroNDF4 = new javax.swing.JTextField();
        CS7 = new javax.swing.JButton();
        jScrollPane15 = new javax.swing.JScrollPane();
        Tnom4 = new javax.swing.JTable();
        jScrollPane16 = new javax.swing.JScrollPane();
        jPanel16 = new javax.swing.JPanel();
        FApT5 = new javax.swing.JTextField();
        LabelBS5 = new javax.swing.JLabel();
        FAmT5 = new javax.swing.JTextField();
        FiltroSnomina5 = new javax.swing.JComboBox<>();
        botonWeb7 = new botones.BotonWeb();
        LabelBQ5 = new javax.swing.JLabel();
        FiltroQuincenanomina5 = new javax.swing.JComboBox<>();
        LabelSZ5 = new javax.swing.JLabel();
        FZservicio5 = new javax.swing.JComboBox<>();
        jLabel70 = new javax.swing.JLabel();
        LabelBE5 = new javax.swing.JLabel();
        FiltrosTD5 = new javax.swing.JComboBox<>();
        Nominab5 = new javax.swing.JTextField();
        LabelBNDF5 = new javax.swing.JLabel();
        Eliminar5 = new javax.swing.JButton();
        FiltroNDF5 = new javax.swing.JTextField();
        CS8 = new javax.swing.JButton();
        jScrollPane17 = new javax.swing.JScrollPane();
        Tnom5 = new javax.swing.JTable();
        jScrollPane18 = new javax.swing.JScrollPane();
        jPanel17 = new javax.swing.JPanel();
        FApT6 = new javax.swing.JTextField();
        LabelBS6 = new javax.swing.JLabel();
        FAmT6 = new javax.swing.JTextField();
        FiltroSnomina6 = new javax.swing.JComboBox<>();
        botonWeb8 = new botones.BotonWeb();
        LabelBQ6 = new javax.swing.JLabel();
        FiltroQuincenanomina6 = new javax.swing.JComboBox<>();
        LabelSZ6 = new javax.swing.JLabel();
        FZservicio6 = new javax.swing.JComboBox<>();
        jLabel71 = new javax.swing.JLabel();
        LabelBE6 = new javax.swing.JLabel();
        FiltrosTD6 = new javax.swing.JComboBox<>();
        Nominab6 = new javax.swing.JTextField();
        LabelBNDF6 = new javax.swing.JLabel();
        Eliminar6 = new javax.swing.JButton();
        FiltroNDF6 = new javax.swing.JTextField();
        CS9 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        Tnom6 = new javax.swing.JTable();
        jScrollPane20 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        FApT7 = new javax.swing.JTextField();
        LabelBS7 = new javax.swing.JLabel();
        FAmT7 = new javax.swing.JTextField();
        FiltroSnomina7 = new javax.swing.JComboBox<>();
        botonWeb9 = new botones.BotonWeb();
        LabelBQ7 = new javax.swing.JLabel();
        FiltroQuincenanomina7 = new javax.swing.JComboBox<>();
        LabelSZ7 = new javax.swing.JLabel();
        FZservicio7 = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        LabelBE7 = new javax.swing.JLabel();
        FiltrosTD7 = new javax.swing.JComboBox<>();
        Nominab7 = new javax.swing.JTextField();
        LabelBNDF7 = new javax.swing.JLabel();
        Eliminar7 = new javax.swing.JButton();
        FiltroNDF7 = new javax.swing.JTextField();
        CS10 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        Tnom7 = new javax.swing.JTable();
        jScrollPane22 = new javax.swing.JScrollPane();
        jPanel19 = new javax.swing.JPanel();
        FApT8 = new javax.swing.JTextField();
        LabelBS8 = new javax.swing.JLabel();
        FAmT8 = new javax.swing.JTextField();
        FiltroSnomina8 = new javax.swing.JComboBox<>();
        botonWeb10 = new botones.BotonWeb();
        LabelBQ8 = new javax.swing.JLabel();
        FiltroQuincenanomina8 = new javax.swing.JComboBox<>();
        LabelSZ8 = new javax.swing.JLabel();
        FZservicio8 = new javax.swing.JComboBox<>();
        jLabel74 = new javax.swing.JLabel();
        LabelBE8 = new javax.swing.JLabel();
        FiltrosTD8 = new javax.swing.JComboBox<>();
        Nominab8 = new javax.swing.JTextField();
        LabelBNDF8 = new javax.swing.JLabel();
        Eliminar8 = new javax.swing.JButton();
        FiltroNDF8 = new javax.swing.JTextField();
        CS11 = new javax.swing.JButton();
        jScrollPane23 = new javax.swing.JScrollPane();
        Tnom8 = new javax.swing.JTable();
        NomPagos = new javax.swing.JScrollPane();
        PestañasPagos = new javax.swing.JTabbedPane();
        TPagos = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pago = new javax.swing.JTable();
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
        botonWeb2 = new botones.BotonWeb();
        jLabel30 = new javax.swing.JLabel();
        MTDsum = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        TPagos1 = new javax.swing.JScrollPane();
        jPanel29 = new javax.swing.JPanel();
        jScrollPane29 = new javax.swing.JScrollPane();
        pago1 = new javax.swing.JTable();
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
        jLabel159 = new javax.swing.JLabel();
        FiltrosP1 = new javax.swing.JComboBox<>();
        BAppag1 = new javax.swing.JTextField();
        Bampag1 = new javax.swing.JTextField();
        botonWeb16 = new botones.BotonWeb();
        jLabel31 = new javax.swing.JLabel();
        MTDsum1 = new javax.swing.JLabel();
        Imprimir1 = new javax.swing.JButton();
        TPagos2 = new javax.swing.JScrollPane();
        jPanel30 = new javax.swing.JPanel();
        jScrollPane30 = new javax.swing.JScrollPane();
        pago2 = new javax.swing.JTable();
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
        botonWeb17 = new botones.BotonWeb();
        jLabel33 = new javax.swing.JLabel();
        MTDsum2 = new javax.swing.JLabel();
        Imprimir2 = new javax.swing.JButton();
        TPagos3 = new javax.swing.JScrollPane();
        jPanel31 = new javax.swing.JPanel();
        jScrollPane31 = new javax.swing.JScrollPane();
        pago3 = new javax.swing.JTable();
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
        botonWeb18 = new botones.BotonWeb();
        jLabel34 = new javax.swing.JLabel();
        MTDsum3 = new javax.swing.JLabel();
        Imprimir3 = new javax.swing.JButton();
        TPagos4 = new javax.swing.JScrollPane();
        jPanel32 = new javax.swing.JPanel();
        jScrollPane32 = new javax.swing.JScrollPane();
        pago4 = new javax.swing.JTable();
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
        botonWeb19 = new botones.BotonWeb();
        jLabel35 = new javax.swing.JLabel();
        MTDsum4 = new javax.swing.JLabel();
        Imprimir4 = new javax.swing.JButton();
        TPagos5 = new javax.swing.JScrollPane();
        jPanel33 = new javax.swing.JPanel();
        jScrollPane33 = new javax.swing.JScrollPane();
        pago5 = new javax.swing.JTable();
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
        botonWeb20 = new botones.BotonWeb();
        Imprimir5 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        MTDsum5 = new javax.swing.JLabel();
        TPagos6 = new javax.swing.JScrollPane();
        jPanel34 = new javax.swing.JPanel();
        jScrollPane34 = new javax.swing.JScrollPane();
        pago6 = new javax.swing.JTable();
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
        botonWeb21 = new botones.BotonWeb();
        jLabel37 = new javax.swing.JLabel();
        MTDsum6 = new javax.swing.JLabel();
        Imprimir6 = new javax.swing.JButton();
        TPagos7 = new javax.swing.JScrollPane();
        jPanel35 = new javax.swing.JPanel();
        jScrollPane35 = new javax.swing.JScrollPane();
        pago7 = new javax.swing.JTable();
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
        botonWeb22 = new botones.BotonWeb();
        jLabel38 = new javax.swing.JLabel();
        MTDsum7 = new javax.swing.JLabel();
        Imprimir7 = new javax.swing.JButton();
        TPagos8 = new javax.swing.JScrollPane();
        jPanel38 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        pago8 = new javax.swing.JTable();
        LabelBEP8 = new javax.swing.JLabel();
        busp8 = new javax.swing.JTextField();
        CS24 = new javax.swing.JButton();
        LabelSZP8 = new javax.swing.JLabel();
        FiltroSZP8 = new javax.swing.JComboBox<>();
        LabelBSP8 = new javax.swing.JLabel();
        FiltroServP8 = new javax.swing.JComboBox<>();
        LabelNDFP8 = new javax.swing.JLabel();
        filtroNDFP8 = new javax.swing.JTextField();
        LabelBQP8 = new javax.swing.JLabel();
        FiltroQP8 = new javax.swing.JComboBox<>();
        jLabel186 = new javax.swing.JLabel();
        FiltrosP8 = new javax.swing.JComboBox<>();
        BAppag8 = new javax.swing.JTextField();
        Bampag8 = new javax.swing.JTextField();
        botonWeb25 = new botones.BotonWeb();
        jLabel39 = new javax.swing.JLabel();
        MTDsum8 = new javax.swing.JLabel();
        Imprimir9 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        ODT1 = new javax.swing.JMenuItem();
        CNQ1 = new javax.swing.JMenuItem();
        PRESQ = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        CDA1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        CDA3 = new javax.swing.JMenuItem();
        ODT2 = new javax.swing.JMenuItem();
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
        jMenu3 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        NomSemGen = new javax.swing.JMenuItem();
        PresSem = new javax.swing.JMenuItem();
        CDA2 = new javax.swing.JMenuItem();
        ODT3 = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CNQ = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
        PRES = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        LDA = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina Semanal General");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setText("Jueves");

        jLabel1.setText("Lunes");

        jLabel2.setText("Martes");

        jLabel3.setText("Miercoles");

        jLabel5.setText("Viernes");

        jLabel6.setText("Sabado");

        Bono.setText("0");

        Bno.setText("No");
        Bno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnoActionPerformed(evt);
            }
        });

        Bsi.setText("Si");
        Bsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsiActionPerformed(evt);
            }
        });

        jLabel18.setText("Bono");

        jLabel22.setText("Domingo");

        año.setDateFormatString("yyyy");
        año.setMinSelectableDate(new java.util.Date(-62135744314000L));

        jLabel23.setText("Año:");

        jLabel29.setText("Semana");

        Semana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona semana", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "5ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "5ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "5ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "5ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "5ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "5ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "5ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "5ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "5ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "5ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "5ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre", "5ta semana Diciembre" }));
        Semana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SemanaItemStateChanged(evt);
            }
        });

        LS.setText("Limpiar Semana");
        LS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LSActionPerformed(evt);
            }
        });

        jLabel32.setText("Fecha de pago");

        SabT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        SabT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SabTItemStateChanged(evt);
            }
        });

        MierT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        MierT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MierTItemStateChanged(evt);
            }
        });

        VieT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        VieT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                VieTItemStateChanged(evt);
            }
        });

        JueT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        JueT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JueTItemStateChanged(evt);
            }
        });

        LunT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        LunT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LunTItemStateChanged(evt);
            }
        });

        DomT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        DomT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DomTItemStateChanged(evt);
            }
        });

        MarT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        MarT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MarTItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Fsab, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FDom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(50, 50, 50)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel2)
                                .addGap(97, 97, 97)
                                .addComponent(jLabel3)
                                .addGap(103, 103, 103)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(56, 56, 56))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(LS)
                                        .addGap(363, 363, 363)
                                        .addComponent(jLabel23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(FLun, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(Fmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fmier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FJuev, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fvier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(214, 214, 214))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(SabT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(DomT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LunT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addComponent(MarT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(MierT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(JueT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(VieT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bsi)
                    .addComponent(Bno)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18))
                    .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(Semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fsab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FLun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fmier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FJuev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fvier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DomT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JueT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LunT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(VieT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SabT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MierT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LS)
                                .addComponent(jLabel23))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bsi)
                        .addGap(8, 8, 8)
                        .addComponent(Bno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setText("# Lista:");

        NDL.setText("0");

        jLabel8.setText("Apellido P:");

        jLabel9.setText("Apellido M:");

        jLabel27.setText("Nombres(s):");

        jLabel54.setText("# Empleado");

        NE.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel27)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NDL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Ap, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(NE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(NE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));

        jLabel10.setText("Servicio:");

        jLabel11.setText("Sueldo:");

        jLabel14.setText("Zona:");

        jLabel13.setText("Banco:");

        sueldo.setText("0");
        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                sueldoKeyReleased(evt);
            }
        });

        jLabel12.setText("Cuenta de Banco:");

        jLabel90.setText("Bono:");

        Bono1.setText("0");
        Bono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Bono1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel90))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Zon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ServN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bono1))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ServN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(Bono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BAPNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAPNomKeyReleased(evt);
            }
        });

        pd.setText("0");

        BAMNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAMNomKeyReleased(evt);
            }
        });

        jLabel26.setText("Por dia:");

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

        Filtro1.setText("Buscar empleado:");

        BNameNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BNameNomKeyReleased(evt);
            }
        });

        jLabel19.setText("Por hora:");

        PH.setText("0");

        jLabel52.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel52.setText("Datos de empledo.");

        Clean.setText("Limpiar campos");
        Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanActionPerformed(evt);
            }
        });

        jPanel28.setBackground(new java.awt.Color(204, 255, 255));

        Dpi.setText("0");

        jLabel105.setText("Dias de incapacidad:");

        Ddv.setText("0");

        jLabel107.setText("Dias de vacaciones:");

        DD.setText("0");

        jLabel103.setText("Dias descansados:");

        jLabel43.setText("Dias Laborados:");

        DL.setText("0");

        jLabel16.setText("Descansos Trabajados:");

        dt.setText("0");

        LabelDSGS.setText("Descanso sin goce de sueldo:");

        DSGS.setText("0");

        jLabel135.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel135.setText("Ingresos:");

        jLabel104.setText("Pago de seguro:");

        PDDDV.setText("0");

        jLabel49.setText("Pago de dias de vacaciones:");

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

        jLabel55.setText("Faltas Justificadas:");

        jLabel261.setText("Descanso Otorgado:");

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

        jLabel182.setText("Dias festivos:");

        jLabel183.setText("Dias festivos trabajados:");

        DF.setText("0");

        DFT.setText("0");

        jLabel184.setText("Pago de dias festivos:");

        jLabel185.setText("Pago de dias festivos trabajados:");

        PDDF.setText("0");

        PDDFT.setText("0");

        jLabel41.setText("Horas extras:");

        HE.setText("0");
        HE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HEKeyReleased(evt);
            }
        });

        jLabel42.setText("Total horas extra:");

        THE.setText("0");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dt))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DL))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel103)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DD))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(jLabel107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ddv))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel105))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dpi)
                            .addComponent(R))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55)
                            .addComponent(LabelDSGS)
                            .addComponent(jLabel261)
                            .addComponent(jLabel17)
                            .addComponent(jLabel76)
                            .addComponent(jLabel182)
                            .addComponent(jLabel183)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addComponent(DFT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                        .addComponent(jLabel185))
                                    .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addComponent(DF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel184))
                                    .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addComponent(DSGS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel88)
                                            .addComponent(jLabel49)
                                            .addComponent(jLabel104)
                                            .addComponent(jLabel128)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel136)
                                            .addComponent(jLabel138))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDDDV)
                                    .addComponent(PDDD)
                                    .addComponent(pds)
                                    .addComponent(PDDL)
                                    .addComponent(PDDT)
                                    .addComponent(PCR)
                                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDF)
                                    .addComponent(PDDFT)))
                            .addGroup(jPanel28Layout.createSequentialGroup()
                                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(THE, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(HE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                    .addComponent(FJ)
                                    .addComponent(DO)
                                    .addGroup(jPanel28Layout.createSequentialGroup()
                                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(apy, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                            .addComponent(Lugar, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(49, 49, 49)
                                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel87)
                                            .addComponent(jLabel25))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel135)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel135)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(R)
                    .addComponent(jLabel138)
                    .addComponent(PCR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dpi)
                    .addComponent(jLabel105)
                    .addComponent(jLabel104)
                    .addComponent(pds))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ddv)
                    .addComponent(jLabel107)
                    .addComponent(jLabel49)
                    .addComponent(PDDDV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DD)
                    .addComponent(jLabel103)
                    .addComponent(jLabel88)
                    .addComponent(PDDD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(DL)
                    .addComponent(jLabel128)
                    .addComponent(PDDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dt)
                    .addComponent(jLabel21)
                    .addComponent(PDDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDSGS)
                    .addComponent(DSGS)
                    .addComponent(jLabel136)
                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(FJ))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel261)
                            .addComponent(DO))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel182)
                            .addComponent(DF)
                            .addComponent(jLabel184)
                            .addComponent(PDDF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel183)
                            .addComponent(DFT)
                            .addComponent(jLabel185)
                            .addComponent(PDDFT))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel76)
                            .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(THE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));

        jLabel134.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel134.setText("Egresos:");

        F.setText("0");

        jLabel262.setText("Dias con faltas:");

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
        jScrollPane24.setViewportView(SHPresnom);

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
        jScrollPane25.setViewportView(SHCDAnom);

        cda.setText("0");
        cda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdaKeyReleased(evt);
            }
        });

        jLabel263.setText("Ahorro por Sem:");

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
        jScrollPane26.setViewportView(SHODTnom);

        jLabel264.setText("Orden de taller:");

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

        jLabel265.setText("Pago de prestamo:");

        Presp.setText("0");
        Presp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrespKeyReleased(evt);
            }
        });

        jLabel148.setText("# Semana:");

        NSprenom.setText("0");

        jLabel149.setText("# Semana:");

        NSODTnom.setText("0");

        jLabel266.setText("Retencion infonavit:");

        RI.setText("0");
        RI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RIKeyReleased(evt);
            }
        });

        jLabel267.setText("fonacot:");

        RF.setText("0");
        RF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RFKeyReleased(evt);
            }
        });

        jLabel45.setText("ISR");

        ISR.setText("0");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel145))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel146))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel144)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel134))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane26)
                            .addComponent(jScrollPane24)
                            .addComponent(jScrollPane25, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel262)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(F)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel137)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DPF))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel24)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel266)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel267)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RF, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ISR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel132)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NCDANom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel263)
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
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel143)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel149)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NSODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel142)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PagODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel147)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PenODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel264)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(jLabel131)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel148)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NSprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel140)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pagadoprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel141)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pendienteprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel265)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 63, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel134)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel262)
                    .addComponent(F)
                    .addComponent(jLabel137)
                    .addComponent(DPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel266)
                    .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel267)
                    .addComponent(RF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(ISR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel144)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel265)
                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel131)
                        .addComponent(NumPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel140)
                        .addComponent(Pagadoprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel141)
                        .addComponent(Pendienteprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(NSprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel145)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel263)
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
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel264)
                    .addComponent(jLabel142)
                    .addComponent(PagODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel143)
                    .addComponent(NODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel147)
                    .addComponent(PenODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel149)
                    .addComponent(NSODTnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(153, 255, 153));

        deposito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deposito.setText("0");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Deposito");

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

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deposito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(AgregarNP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modm)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(deposito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNP)
                    .addComponent(Modm))
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(204, 255, 255));

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel50.setText("Dias festivos.");

        jLabel91.setText("- 1o. de enero.");

        jLabel127.setText("- El primer lunes de febrero en conmemoración del 5 de febrero");

        jLabel155.setText("- El tercer lunes de marzo en conmemoración del 21 de marzo");

        jLabel157.setText("- 1o. de mayo");

        jLabel160.setText("- 16 de septiembre");

        jLabel168.setText("- El tercer lunes de noviembre en conmemoración del 20 de noviembre;");

        jLabel169.setText("- El 1o. de diciembre de cada seis años, cuando corresponda a la transmisión del Poder Ejecutivo Federal");

        jLabel170.setText("- 25 de diciembre");

        jLabel171.setText("- El que determinen las leyes federales y locales electorales, en el caso de elecciones ordinarias, para efectuar la jornada electoral");

        Pbs.setBackground(new java.awt.Color(204, 255, 255));

        jLabel40.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel40.setText("Descuentos varios:");

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

        ADN.setText("0");
        ADN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ADNKeyReleased(evt);
            }
        });

        jLabel44.setText("Concepto");

        javax.swing.GroupLayout PbsLayout = new javax.swing.GroupLayout(Pbs);
        Pbs.setLayout(PbsLayout);
        PbsLayout.setHorizontalGroup(
            PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PbsLayout.createSequentialGroup()
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PbsLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(jLabel40))
                    .addGroup(PbsLayout.createSequentialGroup()
                        .addComponent(jLabel89)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DVT))
                    .addGroup(PbsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel75)
                            .addComponent(jLabel82)
                            .addComponent(jLabel85)
                            .addComponent(jLabel77)
                            .addComponent(jLabel80)
                            .addComponent(jLabel83)
                            .addComponent(jLabel86)
                            .addComponent(jLabel78)
                            .addComponent(jLabel81)
                            .addComponent(jLabel84)
                            .addComponent(jLabel167))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Credencial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Playera, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Corbata, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ADN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PbsLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel44)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PbsLayout.setVerticalGroup(
            PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PbsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel40)
                .addGap(8, 8, 8)
                .addComponent(jLabel44)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel75)
                    .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel86)
                    .addComponent(Credencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel78)
                    .addComponent(Bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel81)
                    .addComponent(Playera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(Corbata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel167)
                    .addComponent(ADN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PbsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(DVT))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel160))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel50))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel91))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel127))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel169))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel157))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel155))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel168))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel170))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel171))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(Pbs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel91)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel127)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel155)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel157)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel160)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel168)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel169)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel170)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel171)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel51.setText("Observaciones:");

        obs.setColumns(20);
        obs.setLineWrap(true);
        obs.setRows(5);
        jScrollPane27.setViewportView(obs);

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
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(18, 18, 18)
                                                .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Clean))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
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
                                                .addGap(118, 118, 118)
                                                .addComponent(CS)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(67, 67, 67)
                                                        .addComponent(jLabel51)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel52)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtro1)
                            .addComponent(BNameNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(CS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(PH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clean)))
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel51)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nomina Semanal", jScrollPane1);

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));

        FApT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApTKeyReleased(evt);
            }
        });

        LabelBS.setText("Buscar Servicio:");

        FAmT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmTKeyReleased(evt);
            }
        });

        FiltroSnomina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnominaItemStateChanged(evt);
            }
        });

        botonWeb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb1.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ.setText("Buscar Semana:");

        FiltroQuincenanomina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        LabelBE.setText("Buscar Empleado:");

        FiltrosTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTDItemStateChanged(evt);
            }
        });

        Nominab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NominabKeyReleased(evt);
            }
        });

        LabelBNDF.setText("Buscar por # Lista");

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        FiltroNDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDFKeyReleased(evt);
            }
        });

        CS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS2.setText("Cerrar sesion");
        CS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS2ActionPerformed(evt);
            }
        });

        Tnom.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TnomMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(Tnom);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CS2)
                    .addGroup(jPanel6Layout.createSequentialGroup()
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
                        .addComponent(FiltroNDF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE)
                    .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar)
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane7.setViewportView(jPanel6);

        PestanañasND.addTab("Foraneos acapulco", jScrollPane7);

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));

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

        botonWeb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb3.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ1.setText("Buscar Semana:");

        FiltroQuincenanomina1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel66.setText("Filtros:");

        LabelBE1.setText("Buscar Empleado:");

        FiltrosTD1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD1ItemStateChanged(evt);
            }
        });

        Nominab1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab1KeyReleased(evt);
            }
        });

        LabelBNDF1.setText("Buscar por # Lista");

        Eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar1.setText("Eliminar");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
            }
        });

        FiltroNDF1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF1KeyReleased(evt);
            }
        });

        CS4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS4.setText("Cerrar sesion");
        CS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS4ActionPerformed(evt);
            }
        });

        Tnom1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom1MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tnom1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(Eliminar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS4)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE1)
                    .addComponent(Nominab1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar1)
                    .addComponent(LabelBS1)
                    .addComponent(FiltroSnomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ1)
                    .addComponent(FiltroQuincenanomina1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ1)
                    .addComponent(FZservicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel66)
                    .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF1)
                    .addComponent(FiltroNDF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane8.setViewportView(jPanel7);

        PestanañasND.addTab("Foraneos Puebla", jScrollPane8);

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        FApT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT2KeyReleased(evt);
            }
        });

        LabelBS2.setText("Buscar Servicio:");

        FAmT2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT2KeyReleased(evt);
            }
        });

        FiltroSnomina2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina2ItemStateChanged(evt);
            }
        });

        botonWeb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb4.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ2.setText("Buscar Semana:");

        FiltroQuincenanomina2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel67.setText("Filtros:");

        LabelBE2.setText("Buscar Empleado:");

        FiltrosTD2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD2ItemStateChanged(evt);
            }
        });

        Nominab2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab2KeyReleased(evt);
            }
        });

        LabelBNDF2.setText("Buscar por # Lista");

        Eliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar2.setText("Eliminar");
        Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar2ActionPerformed(evt);
            }
        });

        FiltroNDF2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF2KeyReleased(evt);
            }
        });

        CS5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS5.setText("Cerrar sesion");
        CS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS5ActionPerformed(evt);
            }
        });

        Tnom2.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom2MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Tnom2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Eliminar2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS5)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE2)
                    .addComponent(Nominab2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar2)
                    .addComponent(LabelBS2)
                    .addComponent(FiltroSnomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ2)
                    .addComponent(FiltroQuincenanomina2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ2)
                    .addComponent(FZservicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF2)
                    .addComponent(FiltroNDF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane9.setViewportView(jPanel10);

        PestanañasND.addTab("Foraneos Toluca", jScrollPane9);

        jPanel14.setBackground(new java.awt.Color(204, 255, 255));

        FApT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT3KeyReleased(evt);
            }
        });

        LabelBS3.setText("Buscar Servicio:");

        FAmT3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT3KeyReleased(evt);
            }
        });

        FiltroSnomina3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina3ItemStateChanged(evt);
            }
        });

        botonWeb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb5.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ3.setText("Buscar Semana:");

        FiltroQuincenanomina3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel68.setText("Filtros:");

        LabelBE3.setText("Buscar Empleado:");

        FiltrosTD3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD3ItemStateChanged(evt);
            }
        });

        Nominab3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab3KeyReleased(evt);
            }
        });

        LabelBNDF3.setText("Buscar por # Lista");

        Eliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar3.setText("Eliminar");
        Eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar3ActionPerformed(evt);
            }
        });

        FiltroNDF3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF3KeyReleased(evt);
            }
        });

        CS6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS6.setText("Cerrar sesion");
        CS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS6ActionPerformed(evt);
            }
        });

        Tnom3.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom3MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(Tnom3);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(Eliminar3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS6)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE3)
                    .addComponent(Nominab3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar3)
                    .addComponent(LabelBS3)
                    .addComponent(FiltroSnomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ3)
                    .addComponent(FiltroQuincenanomina3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ3)
                    .addComponent(FZservicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel68)
                    .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF3)
                    .addComponent(FiltroNDF3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane12.setViewportView(jPanel14);

        PestanañasND.addTab("Norte", jScrollPane12);

        jPanel15.setBackground(new java.awt.Color(204, 255, 255));

        FApT4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT4KeyReleased(evt);
            }
        });

        LabelBS4.setText("Buscar Servicio:");

        FAmT4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT4KeyReleased(evt);
            }
        });

        FiltroSnomina4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina4ItemStateChanged(evt);
            }
        });

        botonWeb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb6.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ4.setText("Buscar Semana:");

        FiltroQuincenanomina4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel69.setText("Filtros:");

        LabelBE4.setText("Buscar Empleado:");

        FiltrosTD4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD4ItemStateChanged(evt);
            }
        });

        Nominab4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab4KeyReleased(evt);
            }
        });

        LabelBNDF4.setText("Buscar por # Lista");

        Eliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar4.setText("Eliminar");
        Eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar4ActionPerformed(evt);
            }
        });

        FiltroNDF4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF4KeyReleased(evt);
            }
        });

        CS7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS7.setText("Cerrar sesion");
        CS7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS7ActionPerformed(evt);
            }
        });

        Tnom4.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom4MouseClicked(evt);
            }
        });
        jScrollPane15.setViewportView(Tnom4);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(Eliminar4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel69)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS7)))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE4)
                    .addComponent(Nominab4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar4)
                    .addComponent(LabelBS4)
                    .addComponent(FiltroSnomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ4)
                    .addComponent(FiltroQuincenanomina4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ4)
                    .addComponent(FZservicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF4)
                    .addComponent(FiltroNDF4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane14.setViewportView(jPanel15);

        PestanañasND.addTab("Oficina", jScrollPane14);

        jPanel16.setBackground(new java.awt.Color(204, 255, 255));

        FApT5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT5KeyReleased(evt);
            }
        });

        LabelBS5.setText("Buscar Servicio:");

        FAmT5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT5KeyReleased(evt);
            }
        });

        FiltroSnomina5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina5ItemStateChanged(evt);
            }
        });

        botonWeb7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb7.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ5.setText("Buscar Semana:");

        FiltroQuincenanomina5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel70.setText("Filtros:");

        LabelBE5.setText("Buscar Empleado:");

        FiltrosTD5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD5ItemStateChanged(evt);
            }
        });

        Nominab5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab5KeyReleased(evt);
            }
        });

        LabelBNDF5.setText("Buscar por # Lista");

        Eliminar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar5.setText("Eliminar");
        Eliminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar5ActionPerformed(evt);
            }
        });

        FiltroNDF5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF5KeyReleased(evt);
            }
        });

        CS8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS8.setText("Cerrar sesion");
        CS8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS8ActionPerformed(evt);
            }
        });

        Tnom5.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom5MouseClicked(evt);
            }
        });
        jScrollPane17.setViewportView(Tnom5);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(Eliminar5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS8)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE5)
                    .addComponent(Nominab5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar5)
                    .addComponent(LabelBS5)
                    .addComponent(FiltroSnomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ5)
                    .addComponent(FiltroQuincenanomina5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ5)
                    .addComponent(FZservicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF5)
                    .addComponent(FiltroNDF5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane16.setViewportView(jPanel16);

        PestanañasND.addTab("Poniente", jScrollPane16);

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));

        FApT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT6KeyReleased(evt);
            }
        });

        LabelBS6.setText("Buscar Servicio:");

        FAmT6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT6KeyReleased(evt);
            }
        });

        FiltroSnomina6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina6ItemStateChanged(evt);
            }
        });

        botonWeb8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb8.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ6.setText("Buscar Semana:");

        FiltroQuincenanomina6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel71.setText("Filtros:");

        LabelBE6.setText("Buscar Empleado:");

        FiltrosTD6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD6ItemStateChanged(evt);
            }
        });

        Nominab6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab6KeyReleased(evt);
            }
        });

        LabelBNDF6.setText("Buscar por # Lista");

        Eliminar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar6.setText("Eliminar");
        Eliminar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar6ActionPerformed(evt);
            }
        });

        FiltroNDF6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF6KeyReleased(evt);
            }
        });

        CS9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS9.setText("Cerrar sesion");
        CS9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS9ActionPerformed(evt);
            }
        });

        Tnom6.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom6MouseClicked(evt);
            }
        });
        jScrollPane19.setViewportView(Tnom6);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(Eliminar6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel71)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS9)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE6)
                    .addComponent(Nominab6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar6)
                    .addComponent(LabelBS6)
                    .addComponent(FiltroSnomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ6)
                    .addComponent(FiltroQuincenanomina6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ6)
                    .addComponent(FZservicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF6)
                    .addComponent(FiltroNDF6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane18.setViewportView(jPanel17);

        PestanañasND.addTab("Sur 1", jScrollPane18);

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));

        FApT7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT7KeyReleased(evt);
            }
        });

        LabelBS7.setText("Buscar Servicio:");

        FAmT7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT7KeyReleased(evt);
            }
        });

        FiltroSnomina7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina7ItemStateChanged(evt);
            }
        });

        botonWeb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb9.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ7.setText("Buscar Semana:");

        FiltroQuincenanomina7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel72.setText("Filtros:");

        LabelBE7.setText("Buscar Empleado:");

        FiltrosTD7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD7ItemStateChanged(evt);
            }
        });

        Nominab7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab7KeyReleased(evt);
            }
        });

        LabelBNDF7.setText("Buscar por # Lista");

        Eliminar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar7.setText("Eliminar");
        Eliminar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar7ActionPerformed(evt);
            }
        });

        FiltroNDF7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF7KeyReleased(evt);
            }
        });

        CS10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS10.setText("Cerrar sesion");
        CS10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS10ActionPerformed(evt);
            }
        });

        Tnom7.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom7MouseClicked(evt);
            }
        });
        jScrollPane21.setViewportView(Tnom7);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(Eliminar7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS10)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE7)
                    .addComponent(Nominab7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar7)
                    .addComponent(LabelBS7)
                    .addComponent(FiltroSnomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ7)
                    .addComponent(FiltroQuincenanomina7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ7)
                    .addComponent(FZservicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF7)
                    .addComponent(FiltroNDF7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane20.setViewportView(jPanel18);

        PestanañasND.addTab("Sur 2", jScrollPane20);

        jPanel19.setBackground(new java.awt.Color(204, 255, 255));

        FApT8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApT8KeyReleased(evt);
            }
        });

        LabelBS8.setText("Buscar Servicio:");

        FAmT8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmT8KeyReleased(evt);
            }
        });

        FiltroSnomina8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnomina8ItemStateChanged(evt);
            }
        });

        botonWeb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb10.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        LabelBQ8.setText("Buscar Semana:");

        FiltroQuincenanomina8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
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

        jLabel74.setText("Filtros:");

        LabelBE8.setText("Buscar Empleado:");

        FiltrosTD8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
        FiltrosTD8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTD8ItemStateChanged(evt);
            }
        });

        Nominab8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Nominab8KeyReleased(evt);
            }
        });

        LabelBNDF8.setText("Buscar por # Lista");

        Eliminar8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar8.setText("Eliminar");
        Eliminar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar8ActionPerformed(evt);
            }
        });

        FiltroNDF8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDF8KeyReleased(evt);
            }
        });

        CS11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS11.setText("Cerrar sesion");
        CS11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS11ActionPerformed(evt);
            }
        });

        Tnom8.setModel(new javax.swing.table.DefaultTableModel(
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
        Tnom8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tnom8MouseClicked(evt);
            }
        });
        jScrollPane23.setViewportView(Tnom8);

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addComponent(Eliminar8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosTD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonWeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(CS11)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 4489, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE8)
                    .addComponent(Nominab8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar8)
                    .addComponent(LabelBS8)
                    .addComponent(FiltroSnomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ8)
                    .addComponent(FiltroQuincenanomina8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ8)
                    .addComponent(FZservicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel74)
                    .addComponent(FiltrosTD8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF8)
                    .addComponent(FiltroNDF8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CS11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane22.setViewportView(jPanel19);

        PestanañasND.addTab("Santander semanal", jScrollPane22);

        NomDetallada.setViewportView(PestanañasND);

        jTabbedPane1.addTab("Nominas detalladas", NomDetallada);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        pago.setModel(new javax.swing.table.DefaultTableModel(
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

        LabelBQP.setText("Buscar semana:");

        FiltroQP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQPItemStateChanged(evt);
            }
        });

        jLabel64.setText("Filtrar:");

        FiltrosP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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
        botonWeb2.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel30.setText("Monto total en fila deposito:");

        MTDsum.setText("0");

        Imprimir.setText("Imprimir tabla");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

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
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(CS3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1967, Short.MAX_VALUE))
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
                    .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CS3)
                    .addComponent(jLabel30)
                    .addComponent(MTDsum)
                    .addComponent(Imprimir))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos.setViewportView(jPanel3);

        PestañasPagos.addTab("Foraneos Acapulco", TPagos);

        jPanel29.setBackground(new java.awt.Color(204, 255, 255));

        jScrollPane29.setToolTipText("");

        pago1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane29.setViewportView(pago1);

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

        LabelBQP1.setText("Buscar semana:");

        FiltroQP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP1ItemStateChanged(evt);
            }
        });

        jLabel159.setText("Filtrar:");

        FiltrosP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb16.setToolTipText("");
        botonWeb16.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel31.setText("Monto total en fila deposito:");

        MTDsum1.setText("0");

        Imprimir1.setText("Imprimir tabla");
        Imprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel159)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(CS15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir1))
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2048, Short.MAX_VALUE))
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
                    .addComponent(jLabel159)
                    .addComponent(FiltrosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel31)
                        .addComponent(MTDsum1)
                        .addComponent(Imprimir1))
                    .addComponent(CS15))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos1.setViewportView(jPanel29);

        PestañasPagos.addTab("Foraneos puebla", TPagos1);

        jPanel30.setBackground(new java.awt.Color(204, 255, 255));

        pago2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane30.setViewportView(pago2);

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

        LabelBQP2.setText("Buscar semana:");

        FiltroQP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP2ItemStateChanged(evt);
            }
        });

        jLabel176.setText("Filtrar:");

        FiltrosP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb17.setToolTipText("");
        botonWeb17.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel33.setText("Monto total en fila deposito:");

        MTDsum2.setText("0");

        Imprimir2.setText("Imprimir tabla");
        Imprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel176)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(CS16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir2))
                    .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2048, Short.MAX_VALUE))
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
                    .addComponent(botonWeb17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane30, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel33)
                        .addComponent(MTDsum2)
                        .addComponent(Imprimir2))
                    .addComponent(CS16))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos2.setViewportView(jPanel30);

        PestañasPagos.addTab("Foraneo toluca", TPagos2);

        jPanel31.setBackground(new java.awt.Color(204, 255, 255));

        pago3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane31.setViewportView(pago3);

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

        LabelBQP3.setText("Buscar semana:");

        FiltroQP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP3ItemStateChanged(evt);
            }
        });

        jLabel177.setText("Filtrar:");

        FiltrosP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb18.setToolTipText("");
        botonWeb18.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel34.setText("Monto total en fila deposito:");

        MTDsum3.setText("0");

        Imprimir3.setText("Imprimir tabla");
        Imprimir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(CS17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir3))
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2048, Short.MAX_VALUE))
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
                    .addComponent(botonWeb18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(MTDsum3)
                        .addComponent(Imprimir3))
                    .addComponent(CS17))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos3.setViewportView(jPanel31);

        PestañasPagos.addTab("Norte", TPagos3);

        jPanel32.setBackground(new java.awt.Color(204, 255, 255));

        pago4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane32.setViewportView(pago4);

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

        LabelBQP4.setText("Buscar semana:");

        FiltroQP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP4ItemStateChanged(evt);
            }
        });

        jLabel178.setText("Filtrar:");

        FiltrosP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb19.setToolTipText("");
        botonWeb19.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel35.setText("Monto total en fila deposito:");

        MTDsum4.setText("0");

        Imprimir4.setText("Imprimir tabla");
        Imprimir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(jLabel178)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addComponent(CS18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir4))
                    .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2024, Short.MAX_VALUE))
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
                    .addComponent(botonWeb19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane32, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(MTDsum4)
                        .addComponent(Imprimir4))
                    .addComponent(CS18))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos4.setViewportView(jPanel32);

        PestañasPagos.addTab("Poniente", TPagos4);

        jPanel33.setBackground(new java.awt.Color(204, 255, 255));

        pago5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane33.setViewportView(pago5);

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

        LabelBQP5.setText("Buscar semana:");

        FiltroQP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP5ItemStateChanged(evt);
            }
        });

        jLabel179.setText("Filtrar:");

        FiltrosP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb20.setToolTipText("");
        botonWeb20.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        Imprimir5.setText("Imprimir tabla");
        Imprimir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir5ActionPerformed(evt);
            }
        });

        jLabel36.setText("Monto total en fila deposito:");

        MTDsum5.setText("0");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel179)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(CS19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir5))
                    .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2048, Short.MAX_VALUE))
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
                    .addComponent(botonWeb20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane33, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(MTDsum5)
                        .addComponent(Imprimir5))
                    .addComponent(CS19))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos5.setViewportView(jPanel33);

        PestañasPagos.addTab("Oficina", TPagos5);

        jPanel34.setBackground(new java.awt.Color(204, 255, 255));

        pago6.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane34.setViewportView(pago6);

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

        LabelBQP6.setText("Buscar semana:");

        FiltroQP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP6ItemStateChanged(evt);
            }
        });

        jLabel180.setText("Filtrar:");

        FiltrosP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb21.setToolTipText("");
        botonWeb21.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel37.setText("Monto total en fila deposito:");

        MTDsum6.setText("0");

        Imprimir6.setText("Imprimir tabla");
        Imprimir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(jLabel180)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel34Layout.createSequentialGroup()
                        .addComponent(CS20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir6))
                    .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2048, Short.MAX_VALUE))
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
                    .addComponent(botonWeb21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane34, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel37)
                        .addComponent(MTDsum6)
                        .addComponent(Imprimir6))
                    .addComponent(CS20))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos6.setViewportView(jPanel34);

        PestañasPagos.addTab("Sur 1", TPagos6);

        jPanel35.setBackground(new java.awt.Color(204, 255, 255));

        pago7.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane35.setViewportView(pago7);

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

        LabelBQP7.setText("Buscar semana:");

        FiltroQP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP7ItemStateChanged(evt);
            }
        });

        jLabel181.setText("Filtrar:");

        FiltrosP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb22.setToolTipText("");
        botonWeb22.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel38.setText("Monto total en fila deposito:");

        MTDsum7.setText("0");

        Imprimir7.setText("Imprimir tabla");
        Imprimir7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel35Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(jLabel181)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                    .addGroup(jPanel35Layout.createSequentialGroup()
                        .addComponent(CS21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir7))
                    .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2048, Short.MAX_VALUE))
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
                    .addComponent(botonWeb22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane35, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel38)
                        .addComponent(MTDsum7)
                        .addComponent(Imprimir7))
                    .addComponent(CS21))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos7.setViewportView(jPanel35);

        PestañasPagos.addTab("Sur 2", TPagos7);

        jPanel38.setBackground(new java.awt.Color(204, 255, 255));

        pago8.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane36.setViewportView(pago8);

        LabelBEP8.setText("Buscar empleado:");

        busp8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                busp8KeyReleased(evt);
            }
        });

        CS24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS24.setText("Cerrar sesion");
        CS24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS24ActionPerformed(evt);
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

        LabelBQP8.setText("Buscar semana:");

        FiltroQP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP8ItemStateChanged(evt);
            }
        });

        jLabel186.setText("Filtrar:");

        FiltrosP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por # Lista" }));
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

        botonWeb25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb25.setToolTipText("");
        botonWeb25.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        jLabel39.setText("Monto total en fila deposito:");

        MTDsum8.setText("0");

        Imprimir9.setText("Imprimir tabla");
        Imprimir9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(jLabel186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addComponent(CS24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir9))
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(jLabel186)
                    .addComponent(FiltrosP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(MTDsum8)
                        .addComponent(Imprimir9))
                    .addComponent(CS24))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos8.setViewportView(jPanel38);

        PestañasPagos.addTab("Santander corporativo semanal", TPagos8);

        NomPagos.setViewportView(PestañasPagos);

        jTabbedPane1.addTab("Tablas de pagos", NomPagos);

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

        CDA3.setText("Caja de ahorro");
        CDA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDA3ActionPerformed(evt);
            }
        });
        jMenu7.add(CDA3);

        ODT2.setText("Ordenes de taller");
        ODT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODT2ActionPerformed(evt);
            }
        });
        jMenu7.add(ODT2);

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

        jMenu3.setText("Cambiar a:");

        jMenu10.setText("Semanal");

        NomSemGen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        NomSemGen.setText("Nomina Semanal IMSS");
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

        CDA2.setText("Caja de ahorro");
        CDA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDA2ActionPerformed(evt);
            }
        });
        jMenu10.add(CDA2);

        ODT3.setText("Ordenes de taller");
        ODT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ODT3ActionPerformed(evt);
            }
        });
        jMenu10.add(ODT3);

        jMenu3.add(jMenu10);

        jMenu11.setText("Nomina quincenal");

        ODT.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
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

        CDA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA.setText("Caja de ahorro");
        CDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDAActionPerformed(evt);
            }
        });
        jMenu11.add(CDA);

        PRES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRES.setText("Prestamos");
        PRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESActionPerformed(evt);
            }
        });
        jMenu11.add(PRES);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem4.setText("Nomina General");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem4);

        jMenu3.add(jMenu11);

        LDA.setText("Listas de asistencia");
        LDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LDAActionPerformed(evt);
            }
        });
        jMenu3.add(LDA);

        jMenuBar1.add(jMenu3);

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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Agregar pago ODT
    public void AgregarPagoODT() {

        String SQL = "INSERT INTO `nominasem.pagos.odt` (`#Lista`, `# de orden`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Semana`, `# Semana`, `pagado`, `pendiente`, "
                + "`Pago de odt`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NODTnom.getText()));
            pst.setInt(3, Integer.parseInt(NE.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, Semana.getSelectedItem().toString());
            pst.setString(10, NSODTnom.getText());
            pst.setString(11, PagODTnom.getText());
            pst.setString(12, PenODTnom.getText());
            pst.setString(13, Odtp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de orden en agregado");

        } catch (HeadlessException | SQLException error_agregar_pdodt) {
            JOptionPane.showMessageDialog(null, "Error al agregar pago de orden: " + error_agregar_pdodt.getMessage());
        }
    }

//Agregar pago CDA
    public void AgregarPagoCDA() {

        String SQL = "INSERT INTO `nominasem.pagos.cda` (`#Lista`, `#caja`, `#empleado`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Semana`, `Caja de ahorro`,"
                + " `Observaciones`, `Sem aportadas`, `# de recibo de pago`) VALUES (?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, '', ?, '')";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NCDANom.getText()));
            pst.setInt(3, Integer.parseInt(NE.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, Semana.getSelectedItem().toString());
            pst.setString(10, cda.getText());
            pst.setString(11, QAcdanom.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de caja de ahorro en agregado");

        } catch (HeadlessException | SQLException error_add_pdcda) {
            JOptionPane.showMessageDialog(null, "Error al agregar pago de caja de ahorro: " + error_add_pdcda.getMessage());
        }
    }

//auto ODT
    public void PagoODT() {
        String Otropagoodt = PenODTnom.getText();

        if (Otropagoodt.equals("0.0")) {
            String SQL = "UPDATE `nominasem.odt` SET `Status` = 'Pagado', `Sem pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `nominasem.odt`.`idTaller` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, PagODTnom.getText());
                pst.setString(2, PenODTnom.getText());
                pst.setString(3, NSODTnom.getText());
                pst.setInt(4, Integer.parseInt(NODTnom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de orden de taller agregado.");

            } catch (HeadlessException | SQLException error_auto_odt) {
                JOptionPane.showMessageDialog(null, "Error al abonar orden de taller: " + error_auto_odt.getMessage());
            }
        } else if (Otropagoodt.equals(PenODTnom.getText())) {
            String SQL = "UPDATE `nominasem.odt` SET `Status` = 'Debe', `Pagado` = ?, `Pendiente` = ?, "
                    + "`Quincenas pagadas` = ? WHERE `nominasem.odt`.`idTaller` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, PagODTnom.getText());
                pst.setString(2, PenODTnom.getText());
                pst.setString(3, NSODTnom.getText());
                pst.setInt(4, Integer.parseInt(NODTnom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de orden de taller en agregado.");

            } catch (HeadlessException | SQLException error_auto_odt) {
                JOptionPane.showMessageDialog(null, "Error al abonar orden de taller en: " + error_auto_odt.getMessage());
            }
        }

    }

    public void shareODTnom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Por Semana`, `Semanas pagadas`, `Pagado`, `Pendiente` FROM `nominasem.odt`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por Semana`, `Semanas pagadas`, `Pagado`, `Pendiente` FROM `nominasem.odt`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Por Semana`, `Semanas pagadas`, `Pagado`, `Pendiente` FROM `nominasem.odt`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Por Semana`,"
                    + " `Semanas pagadas`, `Pagado`, `Pendiente` FROM `nominasem.odt`"
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
            ps.isClosed();
            rs.isClosed();
        } catch (SQLException error_sh_odt) {
            JOptionPane.showMessageDialog(null, "Error al compartir ordenes de taller con nomina: " + error_sh_odt.getMessage());

        }

    }

    public void editarCDAdnom() {

        String SQL = "UPDATE `nominasem.cajadeahorro` SET "
                + " `Semanas Ahorradas` = ?, `Total Ahorrado` = ? WHERE `nominasem.cajadeahorro`.`#caja` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, QAcdanom.getText());
            pst.setString(2, TACDANOM.getText());
            pst.setInt(3, Integer.parseInt(NCDANom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Abono de caja de ahorro en agregado");

        } catch (HeadlessException | SQLException error_auto_cda) {
            JOptionPane.showMessageDialog(null, "Error al abonar Caja de ahorro: " + error_auto_cda.getMessage());
        }
    }

    public void sharecdanom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Ahorro por semana`, `Semanas Ahorradas`, `Total Ahorrado` "
                + " FROM `nominasem.cajadeahorro`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Ahorro por semana`, `Semanas Ahorradas`, `Total Ahorrado`"
                    + "  FROM `nomina.cajadeahorro`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Ahorro por semana`, `Semanas Ahorradas`, `Total Ahorrado` "
                    + " FROM `nominasem.cajadeahorro`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `#caja`, `Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Ahorro por semana`, `Semanas Ahorradas`, `Total Ahorrado` "
                    + " FROM `nominasem.cajadeahorro`"
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
            ps.isClosed();
            rs.isClosed();
        } catch (SQLException error_sh_cda_nom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir datos de caja de ahorro en nomina: " + error_sh_cda_nom.getMessage());

        }

    }

    public void utilJTablePrint(JTable jTable, String header, String footer, boolean showPrintDialog) {
        boolean fitWidth = true;
        boolean interactive = true;
        // We define the print mode (Definimos el modo de impresión)
        JTable.PrintMode mode = fitWidth ? JTable.PrintMode.FIT_WIDTH : JTable.PrintMode.NORMAL;
        try {
            // Print the table (Imprimo la tabla)             
            boolean complete = jTable.print(mode,
                    new MessageFormat(header),
                    new MessageFormat(footer),
                    showPrintDialog,
                    null,
                    interactive);
            if (complete) {
                // Mostramos el mensaje de impresión existosa
                JOptionPane.showMessageDialog(jTable,
                        "Print complete (Impresión completa)",
                        "Print result (Resultado de la impresión)",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                // Mostramos un mensaje indicando que la impresión fue cancelada                 
                JOptionPane.showMessageDialog(jTable,
                        "Print canceled (Impresión cancelada)",
                        "Print result (Resultado de la impresión)",
                        JOptionPane.WARNING_MESSAGE);
            }
        } catch (PrinterException pe) {
            JOptionPane.showMessageDialog(jTable,
                    "Print fail (Fallo de impresión): " + pe.getMessage(),
                    "Print result (Resultado de la impresión)",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void MDNCSQ() {
        //Buscar empleado
        String FiltroN = Nominab8.getText();
        String SQL = "select * from `nominasem.corporativo santander semanal.simss`";
        String FAPNom = FApT8.getText();
        String FAMNom = FAmT8.getText();
        String FiltroSnom = FiltroSnomina8.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina8.getSelectedItem().toString();
        String FiltroFol = FiltroNDF8.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.corporativo santander semanal.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.corporativo santander semanal.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.corporativo santander semanal.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.corporativo santander semanal.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.corporativo santander semanal.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.corporativo santander semanal.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();
        } catch (SQLException error_ND_SCQ) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Santader corp Semanal: " + error_ND_SCQ.getMessage());

        }

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
        double desv12 = Double.parseDouble(this.ADN.getText());

        double total = desv1 + desv2 + desv3 + desv4 + desv5 + desv6 + desv7
                + desv8 + desv9 + desv10 + desv11 + desv12;
        this.DVT.setText("" + total + "");
    }

//descanso sin gose de sueldo
    public void DSGS() {

        double total = DSGS1 + DSGS2 + DSGS3 + DSGS4 + DSGS5 + DSGS6 + DSGS7;
        this.DSGS.setText("" + total + "");
    }
// Dia laborado

    public void DL() {
        double total = DL1 + DL2 + DL3 + DL4 + DL5 + DL6 + DL7;
        DL.setText("" + total + "");

    }
//descanso trabajado

    public void DT() {

        double total = dt1 + dt2 + dt3 + dt4 + dt5 + dt6 + dt7;
        this.dt.setText("" + total + "");
    }
//falta

    public void F() {

        double total = F1 + F2 + F3 + F4 + F5 + F6 + F7;
        this.F.setText("" + total + "");
    }
//Falta justificada

    public void FJ() {
        double total = FJ1 + FJ2 + FJ3 + FJ4 + FJ5 + FJ6 + FJ7;
        this.FJ.setText("" + total + "");
    }
//retardos

    public void R() {

        double total = R1 + R2 + R3 + R4 + R5 + R6 + R7;
        this.R.setText("" + total + "");
    }
//Descanso otorgado

    public void DO() {

        double total = DO1 + DO2 + DO3 + DO4 + DO5 + DO6 + DO7;
        this.DO.setText("" + total + "");
    }

    public void MDPagosnomCSS() {

        //Nombre persona del pago
        String FiltroN = busp8.getText();
        String FAPpago = BAppag8.getText();
        String FAMpago = Bampag8.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.corporativo santander semanal.simss`";
        String FiltroSpago = FiltroServP8.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP8.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP8.getText();
        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.corporativo santander semanal.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.corporativo santander semanal.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.corporativo santander semanal.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.corporativo santander semanal.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.corporativo santander semanal.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones`  FROM `nominasem.detallada.corporativo santander semanal.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago8.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago8.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }
            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_SCQ) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Corporativo quincenal: " + error_pagos_SCQ.getMessage());
        }
    }

    public void AgregarPagoPres() {

        String SQL = "INSERT INTO `nomina.pagos.prestamosem` (`#Lista`, `#prestamo`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Semana`, `# semana`, `pagado`, `pendiente`, "
                + "`Pago de prestamo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NumPrenom.getText()));
            pst.setInt(3, Integer.parseInt(NE.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, Semana.getSelectedItem().toString());
            pst.setString(10, NSprenom.getText());
            pst.setString(11, Pagadoprenom.getText());
            pst.setString(12, Pendienteprenom.getText());
            pst.setString(13, Presp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de prestamo registrado");

        } catch (HeadlessException | SQLException Error_PdPrestamo) {
            JOptionPane.showMessageDialog(null, "Error al registrar pago de prestamo: " + Error_PdPrestamo.getMessage());
        }
    }

    //AUTO PRES
    public void Pagopres() {

        String SQL = "UPDATE `nominasem.prestamosem` SET  `Semanaspagadas` = ?,"
                + " `Pagado` = ?, `Pendiente` = ? WHERE `nominasem.prestamosem`.`idprestamos` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, NSprenom.getText());
            pst.setString(2, Pagadoprenom.getText());
            pst.setString(3, Pendienteprenom.getText());
            pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Abono de prestamo agregado.");

        } catch (HeadlessException | SQLException error_auto_pres) {
            JOptionPane.showMessageDialog(null, "Error al abonar prestamo: " + error_auto_pres.getMessage());
        }
    }

    public void sharepresnom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `nominasem.prestamosem`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `nominasem.prestamosem`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `nominasem.prestamosem`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `nominasem.prestamosem`"
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
            modelo.addColumn("Pago por Sem");
            modelo.addColumn("Sems pagadas");//6
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//8

//ANCHOS
            int[] anchos = {/*NP*/50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*PPS*/ 50,
                /*SP*/ 50, /*PAG*/ 60, /*PEN*/ 50};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_sh_pre_nom) {
            JOptionPane.showMessageDialog(null, "Error al compartir prestamos con nomina: " + error_sh_pre_nom.getMessage());

        }

    }

    public void eliminarnom() {

        try {

            int filaseleccionada = Tnom.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + ".simss` where #lista=" + Tnom.getValueAt(filaseleccionada, 0);
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
    public void MDNFA() {
        //Buscar empleado
        String FiltroN = Nominab.getText();
        String SQL = "select * from `nominasem.detallada.foraneos acapulco.simss`";
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.foraneos acapulco.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.foraneos acapulco.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.foraneos acapulco.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.foraneos acapulco.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.foraneos acapulco.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.foraneos acapulco.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();
        } catch (SQLException error_ND_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos Acapulco: " + error_ND_FA.getMessage());

        }

    }

    public void MDNFP() {
        //Buscar empleado
        String FiltroN = Nominab1.getText();
        String SQL = "select * from `nominasem.detallada.foraneos puebla.simss`";
        String FAPNom = FApT1.getText();
        String FAMNom = FAmT1.getText();
        String FiltroSnom = FiltroSnomina1.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina1.getSelectedItem().toString();
        String FiltroFol = FiltroNDF1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.foraneos puebla.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.foraneos puebla.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.foraneos puebla.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.foraneos puebla.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.foraneos puebla.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.foraneos puebla.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_ND_FP) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos puebla: " + error_ND_FP.getMessage());

        }

    }

    public void MDNFT() {
        //Buscar empleado
        String FiltroN = Nominab2.getText();
        String SQL = "select * from `nominasem.detallada.foraneos toluca.simss`";
        String FAPNom = FApT2.getText();
        String FAMNom = FAmT2.getText();
        String FiltroSnom = FiltroSnomina2.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina2.getSelectedItem().toString();
        String FiltroFol = FiltroNDF2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.foraneos toluca.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.foraneos toluca.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.foraneos toluca.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.foraneos toluca.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.foraneos toluca.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.foraneos toluca.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();
        } catch (SQLException error_ND_FT) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Foraneos toluca: " + error_ND_FT.getMessage());

        }

    }

    public void MDNNor() {
        //Buscar empleado
        String FiltroN = Nominab3.getText();
        String where = "select * from `nominasem.detallada.norte.simss`";
        String FAPNom = FApT3.getText();
        String FAMNom = FAmT3.getText();
        String FiltroSnom = FiltroSnomina3.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina3.getSelectedItem().toString();
        String FiltroFol = FiltroNDF3.getText();

        if (!"".equals(FiltroN)) {
            where = "Select * from `nominasem.detallada.norte.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            where = "select * from `nominasem.detallada.norte.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            where = "select * from `nominasem.detallada.norte.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            where = "select * from `nominasem.detallada.norte.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            where = "select * from `nominasem.detallada.norte.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            where = "select * from `nominasem.detallada.norte.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_ND_norte) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de norte: " + error_ND_norte.getMessage());

        }

    }

    public void MDNOfi() {
        //Buscar empleado
        String FiltroN = Nominab4.getText();
        String SQL = "select * from `nominasem.detallada.oficina.simss`";
        String FAPNom = FApT4.getText();
        String FAMNom = FAmT4.getText();
        String FiltroSnom = FiltroSnomina4.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina4.getSelectedItem().toString();
        String FiltroFol = FiltroNDF4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.oficina.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.oficina.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.oficina.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.oficina.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.oficina.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.oficina.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_ND_ofi) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Oficina: " + error_ND_ofi.getMessage());

        }

    }

    public void MDNPon() {
        //Buscar empleado
        String FiltroN = Nominab5.getText();
        String SQL = "select * from `nominasem.detallada.poniente.simss`";
        String FAPNom = FApT5.getText();
        String FAMNom = FAmT5.getText();
        String FiltroSnom = FiltroSnomina5.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina5.getSelectedItem().toString();
        String FiltroFol = FiltroNDF5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.poniente.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.poniente.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.poniente.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.poniente.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.poniente.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.poniente.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_ND_pon) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Poniente: " + error_ND_pon.getMessage());

        }

    }

    public void MDNS1() {
        //Buscar empleado
        String FiltroN = Nominab6.getText();
        String SQL = "select * from `nominasem.detallada.sur 1.simss`";
        String FAPNom = FApT6.getText();
        String FAMNom = FAmT6.getText();
        String FiltroSnom = FiltroSnomina6.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina6.getSelectedItem().toString();
        String FiltroFol = FiltroNDF6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.sur 1.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.sur 1.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.sur 1.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.sur 1.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.sur 1.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.sur 1.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_ND_S1) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Sur 1: " + error_ND_S1.getMessage());

        }

    }

    public void MDNS2() {
        //Buscar empleado
        String FiltroN = Nominab7.getText();
        String SQL = "select * from `nominasem.detallada.sur 2.simss`";
        String FAPNom = FApT7.getText();
        String FAMNom = FAmT7.getText();
        String FiltroSnom = FiltroSnomina7.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina7.getSelectedItem().toString();
        String FiltroFol = FiltroNDF7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "Select * from `nominasem.detallada.sur 2.simss` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "select * from `nominasem.detallada.sur 2.simss` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "select * from `nominasem.detallada.sur 2.simss` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "select * from `nominasem.detallada.sur 2.simss` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "select * from `nominasem.detallada.sur 2.simss` Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "select * from `nominasem.detallada.sur 2.simss` Where `Semana` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("# Empleado");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Dias con retardos");
            modelo.addColumn("Pago con retardos");//32
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("Pago de seguro");//34
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Pago de dias de vacaciones");//36
            modelo.addColumn("Dias descansados");
            modelo.addColumn("Pago de dias descansados");//36
            modelo.addColumn("Dias Laborados");
            modelo.addColumn("Pago de dias laborados");//38
            modelo.addColumn("Descansos Trabajados");
            modelo.addColumn("Pago de descansos trabajados");//40
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de dias de DSGS");//42
            modelo.addColumn("Faltas Justificadas");
            modelo.addColumn("Descanso Otorgado");//44
            modelo.addColumn("Dias festivos");
            modelo.addColumn("Pago por dias festivos");//46
            modelo.addColumn("Dias festivos trabajados");
            modelo.addColumn("Pago por dias festivos trabajados");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("total de horas extra");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Lugar");//46
            modelo.addColumn("Adicionales");//48
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total de horas extra");
            modelo.addColumn("Faltas");
            modelo.addColumn("Descuento por faltas");//50
            modelo.addColumn("Desc IMSS");
            modelo.addColumn("Infonavit");//12
            modelo.addColumn("Fonacot");//12
            modelo.addColumn("ISR");
            modelo.addColumn("Pago de prestamo");//66
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Orden de taller");//68
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
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NL*/, 50/*NE*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 25/*FDP*/, 25/*FDP*/, /*DDI*/ 120, /*PDS*/ 120, /*DDV*/ 100, /*PDDDV*/ 120,
                /*DD*/ 100, /*PDD*/ 120, /*DL*/ 100, /*PDDL*/ 120, /*DT*/ 130, /*PDDT*/ 130,
                /*DSGS*/ 130, /*PDDDDSGS*/ 150, /*FJ*/ 90, /*DO*/ 90, /*DF*/ 80, 100,/*DFT*/ 80, /*HE*/ 80, /*PHE*/ 80, 100,/*RETARDOS*/ 65,
                /*PCR*/ 100, /*APY*/ 50, /*LUGAR*/ 75, /*REMBOLSO*/ 55, /*AD*/ 65, /*FALT*/ 45,
                /*DPF*/ 120, /*DI*/ 50, /*RI*/ 80,/*FON*/ 80,/*FDB*/ 80, /*ISR*/ 80, /*SAN*/ 45, /*CHAM*/ 50, /*CHAL*/ 45,
                /*FDE*/ 120, /*GRUA*/ 35, /*PAN*/ 50, /*CRED*/ 50, /*BP*/ 100, /*PLAY*/ 45,
                /*COR*/ 50, /*AdN*/ 60, /*TDDV*/ 60, /*PDP*/ 100, /*CDA*/ 75, /*ODT*/ 75, 600/*Obs*/};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_ND_S2) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Sur 2: " + error_ND_S2.getMessage());

        }

    }

    public void sumaDep() {
        double t = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0;
        double p, p1, p2, p3, p4, p5, p6, p7, p8;
        if (pago.getRowCount() > 0) {
            for (int i = 0; i < pago.getRowCount(); i++) {
                p = Double.parseDouble(pago.getValueAt(i, 10).toString());
                t += p;
            }
            MTDsum.setText("" + t);
        } else {

        }
        if (pago1.getRowCount() > 0) {
            for (int i = 0; i < pago1.getRowCount(); i++) {
                p1 = Double.parseDouble(pago1.getValueAt(i, 10).toString());
                t1 += p1;
            }
            MTDsum1.setText("" + t1);
        } else {

        }
        if (pago2.getRowCount() > 0) {
            for (int i = 0; i < pago2.getRowCount(); i++) {
                p2 = Double.parseDouble(pago2.getValueAt(i, 10).toString());
                t2 += p2;
            }
            MTDsum2.setText("" + t2);
        } else {

        }
        if (pago3.getRowCount() > 0) {
            for (int i = 0; i < pago3.getRowCount(); i++) {
                p3 = Double.parseDouble(pago3.getValueAt(i, 10).toString());
                t3 += p3;
            }
            MTDsum3.setText("" + t3);
        } else {

        }
        if (pago4.getRowCount() > 0) {
            for (int i = 0; i < pago4.getRowCount(); i++) {
                p4 = Double.parseDouble(pago4.getValueAt(i, 10).toString());
                t4 += p4;
            }
            MTDsum4.setText("" + t4);
        } else {

        }
        if (pago5.getRowCount() > 0) {
            for (int i = 0; i < pago5.getRowCount(); i++) {
                p5 = Double.parseDouble(pago5.getValueAt(i, 10).toString());
                t5 += p5;
            }
            MTDsum5.setText("" + t5);
        } else {

        }
        if (pago6.getRowCount() > 0) {
            for (int i = 0; i < pago6.getRowCount(); i++) {
                p6 = Double.parseDouble(pago6.getValueAt(i, 10).toString());
                t6 += p6;
            }
            MTDsum6.setText("" + t6);
        } else {

        }
        if (pago7.getRowCount() > 0) {
            for (int i = 0; i < pago7.getRowCount(); i++) {
                p7 = Double.parseDouble(pago7.getValueAt(i, 10).toString());
                t7 += p7;
            }
            MTDsum7.setText("" + t7);
        } else {

        }
        if (pago8.getRowCount() > 0) {
            for (int i = 0; i < pago8.getRowCount(); i++) {
                p8 = Double.parseDouble(pago8.getValueAt(i, 10).toString());
                t8 += p8;
            }
            MTDsum8.setText("" + t8);
        } else {

        }
    }

//mostrar datos pagos nomina
    public void MDPagosnomFA() {
        //Nombre persona del pago
        String FiltroN = busp.getText();
        String FAPpago = BAppag.getText();
        String FAMpago = Bampag.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + " `Cuenta de banco`, `Servicio`,"
                + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`";
        String FiltroSpago = FiltroServP.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos acapulco.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

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
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Foraneos acapulco: " + error_pagos_FA.getMessage());

        }

    }

    public void FunMD() {
        MDPagosnomFA();
        MDPagosnomFP();
        MDPagosnomFT();
        MDPagosnomOfi();
        MDPagosnomS1();
        MDPagosnomPon();
        MDPagosnomS2();
        MDPagosnomNor();
        MDPagosnomCSS();
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

    public void MDPagosnomFP() {
        //Nombre persona del pago
        String FiltroN = busp1.getText();
        String FAPpago = BAppag1.getText();
        String FAMpago = Bampag1.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`";
        String FiltroSpago = FiltroServP1.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP1.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos puebla.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//1
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//3
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//8
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//11
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//11

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Foraneos puebla: " + error_pagos_FA.getMessage());

        }

    }

    public void MDPagosnomFT() {
        //Nombre persona del pago
        String FiltroN = busp2.getText();
        String FAPpago = BAppag2.getText();
        String FAMpago = Bampag2.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`";
        String FiltroSpago = FiltroServP2.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP2.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.foraneos toluca.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago2.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_FT) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Foraneos toluca: " + error_pagos_FT.getMessage());

        }

    }

    public void MDPagosnomNor() {
        //Nombre persona del pago
        String FiltroN = busp3.getText();
        String FAPpago = BAppag3.getText();
        String FAMpago = Bampag3.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nominasem.detallada.norte.simss`";
        String FiltroSpago = FiltroServP3.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP3.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP3.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.norte.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.norte.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.norte.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.norte.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.norte.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.norte.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago3.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago3.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_norte) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en norte: " + error_pagos_norte.getMessage());

        }

    }

    public void MDPagosnomPon() {
        //Nombre persona del pago
        String FiltroN = busp4.getText();
        String FAPpago = BAppag4.getText();
        String FAMpago = Bampag4.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`";
        String FiltroSpago = FiltroServP4.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP4.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.poniente.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago4.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago4.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_poniente) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Poniente: " + error_pagos_poniente.getMessage());

        }

    }

    public void MDPagosnomOfi() {
        //Nombre persona del pago
        String FiltroN = busp5.getText();
        String FAPpago = BAppag5.getText();
        String FAMpago = Bampag5.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`";
        String FiltroSpago = FiltroServP5.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP5.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.oficina.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago5.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago5.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_oficina) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en oficina: " + error_pagos_oficina.getMessage());

        }

    }

    public void MDPagosnomS1() {
        //Nombre persona del pago
        String FiltroN = busp6.getText();
        String FAPpago = BAppag6.getText();
        String FAMpago = Bampag6.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`";
        String FiltroSpago = FiltroServP6.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP6.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 1.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago6.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago6.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_sur1) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en sur 1: " + error_pagos_sur1.getMessage());

        }

    }

    public void MDPagosnomS2() {
        //Nombre persona del pago
        String FiltroN = busp7.getText();
        String FAPpago = BAppag7.getText();
        String FAMpago = Bampag7.getText();
        String SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`";
        String FiltroSpago = FiltroServP7.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP7.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Cuenta de banco`, `Servicio`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` FROM `nominasem.detallada.sur 2.simss`"
                    + " Where `Semana` LIKE '%" + FiltroQuinpago + "%'";
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
            pago7.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30, /*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago7.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            rs.isClosed();
            ps.isClosed();

        } catch (SQLException error_pagos_sur2) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en sur 2: " + error_pagos_sur2.getMessage());

        }

    }

// nomina semanal
    public void editarNS() {

        String SQL = "UPDATE `nominasem.detallada." + Zon.getText() + ".simss` SET"
                + " `#Lista` = ?, `#Empleado` = ?, `Nombre(s)` = ?, `Apellido P` = ?, "
                + "`Apellido M` = ?, `Bono` = ?, `Cuenta de banco` = ?, `Banco` = ?, `Zona` = ?,"
                + " `Servicio` = ?, `Sueldo` = ?, `Por dia` = ?, `Por hora` = ?, `año` = ?,"
                + " `Semana` = ?, `Fecha sabado` = ?, `Fecha domingo` = ?, `Fecha lunes` = ?, "
                + "`Fecha martes` = ?, `Fecha miercoles` = ?, `Fecha jueves` = ?, `Fecha viernes` = ?,"
                + " `Sabado` = ?, `Domingo` = ?, `Lunes` = ?, `Martes` = ?, `Miercoles` = ?, `Jueves` = ?, "
                + "`Viernes` = ?, `Fecha de pago` = ?, `Dias con retardos` = ?, `Pago con retardos` = ?,"
                + " `Dias de incapacidad` = ?, `Pago de seguro` = ?, `Dias de vacaciones` = ?,"
                + " `Pago de Dias de vacaciones` = ?, `Dias descansados` = ?, `Pago de dias descansados` = ?,"
                + " `Dias Laborados` = ?, `Pago de dias laborados` = ?, `Descansos trabajados` = ?, "
                + "`Pago de Descansos trabajados` = ?, `Dias de DSGS` = ?, `Pago de Dias de DSGS` = ?, "
                + "`Faltas justificadas` = ?, `Descanso otorgado` = ?, `Dias festivos` = ?, "
                + "`Pago de Dias festivos` = ?, `Dias festivos trabajados` = ?, `Pago de Dias festivos trabajados` = ?, "
                + "`Apoyo` = ?, `Rembolso` = ?, `Lugar` = ?, `Adicionales` = ?, `Horas extra` = ?, "
                + "`Total de horas extra` = ?, `Dias con faltas` = ?, `pago de Dias con faltas` = ?, `"
                + "IMSS` = ?, `Infonavit` = ?, `Fonacot` = ?, `ISR` = ?, `Pago de prestamo` = ?, "
                + "`Caja de ahorro` = ?, `Pago de ODT` = ?, `Faltantes de boleto` = ?, `Sancion` = ?, "
                + "`Chamarra` = ?, `Chaleco` = ?, `Faltante de efectivo` = ?, `Grua` = ?, `Pantalon` = ?, "
                + "`Credencial` = ?, `Boleto perdido` = ?, `Playera` = ?, `Corbata` = ?, `Adelanto de Nomina` = ?, `Total de descuentos` = ?, `Deposito` = ?, `Observaciones` = ?"
                + " WHERE `nominasem.detallada." + Zon.getText() + ".simss`.`#Lista` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NE.getText()));
            pst.setString(3, Ap.getText());
            pst.setString(4, am.getText());
            pst.setString(5, name.getText());
            pst.setString(6, Bono1.getText());
            pst.setString(7, cta.getText());
            pst.setString(8, ban.getText());
            pst.setString(9, Zon.getText());
            pst.setString(10, ServN.getText());
            pst.setString(11, sueldo.getText());
            pst.setString(12, pd.getText());
            pst.setString(13, PH.getText());
            pst.setString(14, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(15, Semana.getSelectedItem().toString());
            pst.setString(16, ((JTextField) Fsab.getDateEditor().getUiComponent()).getText());
            pst.setString(17, ((JTextField) FDom.getDateEditor().getUiComponent()).getText());
            pst.setString(18, ((JTextField) FLun.getDateEditor().getUiComponent()).getText());
            pst.setString(19, ((JTextField) Fmar.getDateEditor().getUiComponent()).getText());
            pst.setString(20, ((JTextField) Fmier.getDateEditor().getUiComponent()).getText());
            pst.setString(21, ((JTextField) FJuev.getDateEditor().getUiComponent()).getText());
            pst.setString(22, ((JTextField) Fvier.getDateEditor().getUiComponent()).getText());
            pst.setString(23, SabT.getSelectedItem().toString());
            pst.setString(24, DomT.getSelectedItem().toString());
            pst.setString(25, LunT.getSelectedItem().toString());
            pst.setString(26, MarT.getSelectedItem().toString());
            pst.setString(27, MierT.getSelectedItem().toString());
            pst.setString(28, JueT.getSelectedItem().toString());
            pst.setString(29, VieT.getSelectedItem().toString());
            pst.setString(30, ((JTextField) FDP.getDateEditor().getUiComponent()).getText());
            pst.setString(31, R.getText());
            pst.setString(32, PCR.getText());
            pst.setString(33, Dpi.getText());
            pst.setString(34, pds.getText());
            pst.setString(35, Ddv.getText());
            pst.setString(36, PDDDV.getText());
            pst.setString(37, DD.getText());
            pst.setString(38, PDDD.getText());
            pst.setString(39, DL.getText());
            pst.setString(40, PDDL.getText());
            pst.setString(41, dt.getText());
            pst.setString(42, PDDT.getText());
            pst.setString(43, DSGS.getText());
            pst.setString(44, PDDDDSGS.getText());
            pst.setString(45, FJ.getText());
            pst.setString(46, DO.getText());
            pst.setString(47, DF.getText());
            pst.setString(48, PDDF.getText());
            pst.setString(49, DFT.getText());
            pst.setString(50, PDDFT.getText());
            pst.setString(51, apy.getText());
            pst.setString(52, Rembolso.getText());
            pst.setString(53, Lugar.getText());
            pst.setString(54, ADD.getText());
            pst.setString(55, HE.getText());
            pst.setString(56, THE.getText());
            pst.setString(57, F.getText());
            pst.setString(58, DPF.getText());
            pst.setString(59, DI.getText());
            pst.setString(60, RI.getText());
            pst.setString(61, RF.getText());
            pst.setString(62, ISR.getText());
            pst.setString(63, Presp.getText());
            pst.setString(64, cda.getText());
            pst.setString(65, Odtp.getText());
            pst.setString(66, Fdb.getText());
            pst.setString(67, Sancion.getText());
            pst.setString(68, Chamarra.getText());
            pst.setString(69, Chaleco.getText());
            pst.setString(70, Fde.getText());
            pst.setString(71, Grua.getText());
            pst.setString(72, Pantalon.getText());
            pst.setString(73, Credencial.getText());
            pst.setString(74, Bp.getText());
            pst.setString(75, Playera.getText());
            pst.setString(76, Corbata.getText());
            pst.setString(77, ADN.getText());
            pst.setString(78, DVT.getText());
            pst.setString(79, deposito.getText());
            pst.setString(80, obs.getText());
            pst.setInt(81, Integer.parseInt(NDL.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Modificada");

            DAB.clearSelection();
            ISR.setText("0");
            RI.setText("0");
            RF.setText("0");
            PH.setText("0");
            HE.setText("0");
            THE.setText("0");
            DAB.clearSelection();
            NSprenom.setText("0");
            ADN.setText("0");
            QAcdanom.setText("0");
            NODTnom.setText("0");
            NCDANom.setText("0");
            NCDANom.setText("0");
            NDL.setText("0");
            NE.setText("0");
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
            NSprenom.setText("0");
            Pagadoprenom.setText("0");
            Pendienteprenom.setText("0");
            TACDANOM.setText("0");
            NODTnom.setText("0");
            NSODTnom.setText("0");
            PagODTnom.setText("0");
            PenODTnom.setText("0");
            QAcdanom.setText("0");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar nomina: " + e.getMessage());
        }
    }

//Agregar nomina semanal
    public void AgregarNs() {

        String SQL = "INSERT INTO `nominasem.detallada." + Zon.getText() + ".simss` "
                + "(`#Lista`, `#Empleado`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                + " `Bono`, `Cuenta de banco`, `Banco`, `Zona`, `Servicio`, `Sueldo`, "
                + "`Por dia`, `Por hora`, `año`, `Semana`, `Fecha sabado`, `Fecha domingo`, "
                + "`Fecha lunes`, `Fecha martes`, `Fecha miercoles`, `Fecha jueves`, "
                + "`Fecha viernes`, `Sabado`, `Domingo`, `Lunes`, `Martes`, `Miercoles`, "
                + "`Jueves`, `Viernes`, `Fecha de pago`, `Dias con retardos`, `Pago con retardos`, "
                + "`Dias de incapacidad`, `Pago de seguro`, `Dias de vacaciones`,"
                + " `Pago de Dias de vacaciones`, `Dias descansados`, `Pago de dias descansados`,"
                + " `Dias Laborados`, `Pago de dias laborados`, `Descansos trabajados`, "
                + "`Pago de Descansos trabajados`, `Dias de DSGS`, `Pago de Dias de DSGS`,"
                + " `Faltas justificadas`, `Descanso otorgado`, `Dias festivos`, "
                + "`Pago de Dias festivos`, `Dias festivos trabajados`, `Pago de Dias festivos trabajados`,"
                + " `Apoyo`, `Rembolso`, `Lugar`, `Adicionales`, `Horas extra`, `Total de horas extra`,"
                + " `Dias con faltas`, `pago de Dias con faltas`, `IMSS`, `Infonavit`,"
                + " `Fonacot`, `ISR`, `Pago de prestamo`, `Caja de ahorro`, `Pago de ODT`,"
                + " `Faltantes de boleto`, `Sancion`, `Chamarra`, `Chaleco`, `Faltante de efectivo`,"
                + " `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, "
                + "`Adelanto de Nomina`, `Total de descuentos`, `Deposito`, `Observaciones`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NE.getText()));
            pst.setString(3, Ap.getText());
            pst.setString(4, am.getText());
            pst.setString(5, name.getText());
            pst.setString(6, Bono1.getText());
            pst.setString(7, cta.getText());
            pst.setString(8, ban.getText());
            pst.setString(9, Zon.getText());
            pst.setString(10, ServN.getText());
            pst.setString(11, sueldo.getText());
            pst.setString(12, pd.getText());
            pst.setString(13, PH.getText());
            pst.setString(14, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(15, Semana.getSelectedItem().toString());
            pst.setString(16, ((JTextField) Fsab.getDateEditor().getUiComponent()).getText());
            pst.setString(17, ((JTextField) FDom.getDateEditor().getUiComponent()).getText());
            pst.setString(18, ((JTextField) FLun.getDateEditor().getUiComponent()).getText());
            pst.setString(19, ((JTextField) Fmar.getDateEditor().getUiComponent()).getText());
            pst.setString(20, ((JTextField) Fmier.getDateEditor().getUiComponent()).getText());
            pst.setString(21, ((JTextField) FJuev.getDateEditor().getUiComponent()).getText());
            pst.setString(22, ((JTextField) Fvier.getDateEditor().getUiComponent()).getText());
            pst.setString(23, SabT.getSelectedItem().toString());
            pst.setString(24, DomT.getSelectedItem().toString());
            pst.setString(25, LunT.getSelectedItem().toString());
            pst.setString(26, MarT.getSelectedItem().toString());
            pst.setString(27, MierT.getSelectedItem().toString());
            pst.setString(28, JueT.getSelectedItem().toString());
            pst.setString(29, VieT.getSelectedItem().toString());
            pst.setString(30, ((JTextField) FDP.getDateEditor().getUiComponent()).getText());
            pst.setString(31, R.getText());
            pst.setString(32, PCR.getText());
            pst.setString(33, Dpi.getText());
            pst.setString(34, pds.getText());
            pst.setString(35, Ddv.getText());
            pst.setString(36, PDDDV.getText());
            pst.setString(37, DD.getText());
            pst.setString(38, PDDD.getText());
            pst.setString(39, DL.getText());
            pst.setString(40, PDDL.getText());
            pst.setString(41, dt.getText());
            pst.setString(42, PDDT.getText());
            pst.setString(43, DSGS.getText());
            pst.setString(44, PDDDDSGS.getText());
            pst.setString(45, FJ.getText());
            pst.setString(46, DO.getText());
            pst.setString(47, DF.getText());
            pst.setString(48, PDDF.getText());
            pst.setString(49, DFT.getText());
            pst.setString(50, PDDFT.getText());
            pst.setString(51, apy.getText());
            pst.setString(52, Rembolso.getText());
            pst.setString(53, Lugar.getText());
            pst.setString(54, ADD.getText());
            pst.setString(55, HE.getText());
            pst.setString(56, THE.getText());
            pst.setString(57, F.getText());
            pst.setString(58, DPF.getText());
            pst.setString(59, DI.getText());
            pst.setString(60, RI.getText());
            pst.setString(61, RF.getText());
            pst.setString(62, ISR.getText());
            pst.setString(63, Presp.getText());
            pst.setString(64, cda.getText());
            pst.setString(65, Odtp.getText());
            pst.setString(66, Fdb.getText());
            pst.setString(67, Sancion.getText());
            pst.setString(68, Chamarra.getText());
            pst.setString(69, Chaleco.getText());
            pst.setString(70, Fde.getText());
            pst.setString(71, Grua.getText());
            pst.setString(72, Pantalon.getText());
            pst.setString(73, Credencial.getText());
            pst.setString(74, Bp.getText());
            pst.setString(75, Playera.getText());
            pst.setString(76, Corbata.getText());
            pst.setString(77, ADN.getText());
            pst.setString(78, DVT.getText());
            pst.setString(79, deposito.getText());
            pst.setString(80, obs.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Semanal Agregada");

            //operacion para pago de Pres
            double QPREP = Double.parseDouble(this.NSprenom.getText());
            double QPREPT = QPREP + 1;
            NSprenom.setText("" + QPREPT);
            double PPN = Double.parseDouble(this.Pagadoprenom.getText());
            double PENPN = Double.parseDouble(this.Pendienteprenom.getText());
            double PP = Double.parseDouble(this.Presp.getText());
            double TP = PPN + PP;
            Pagadoprenom.setText("" + TP);
            double TPEN = PENPN - PP;
            Pendienteprenom.setText("" + TPEN);

            //Operacion para pago ODT
            double QODTP = Double.parseDouble(this.NSODTnom.getText());
            double QODTPT = QODTP + 1;
            NSODTnom.setText("" + QODTPT);
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
            AgregarPagoODT();
            editarCDAdnom();
            AgregarPagoCDA();
            AgregarPagoPres();
            Pagopres();
            PagoODT();
            shareODTnom();
            sharepresnom();
            sharecdanom();
            FunMD();

            DAB.clearSelection();
            ISR.setText("0");
            RI.setText("0");
            RF.setText("0");
            PH.setText("0");
            HE.setText("0");
            THE.setText("0");
            DAB.clearSelection();
            NSprenom.setText("0");
            ADN.setText("0");
            QAcdanom.setText("0");
            NODTnom.setText("0");
            NCDANom.setText("0");
            NCDANom.setText("0");
            NDL.setText("0");
            NE.setText("0");
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
            NSprenom.setText("0");
            Pagadoprenom.setText("0");
            Pendienteprenom.setText("0");
            TACDANOM.setText("0");
            NODTnom.setText("0");
            NSODTnom.setText("0");
            PagODTnom.setText("0");
            PenODTnom.setText("0");
            QAcdanom.setText("0");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Nomina: " + e.getMessage());
        }
    }

//compartir empleados
    public void shareN() {
        //Buscar empleado
        String Share = BNameNom.getText();
        String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();
        String where = "SELECT `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`,`Cuenta bancaria`,`Zona`, `Servicio`, `Sueldo`, `Bono` FROM `rh.empleados`"
                + " where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`,`Cuenta bancaria`,`Zona`, `Servicio`, `Sueldo`, `Bono`  "
                    + "from `rh.empleados` WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`,`Cuenta bancaria`,`Zona`, `Servicio`, `Sueldo`, `Bono`  "
                    + "from `rh.empleados` WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `# Exp`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`,`Cuenta bancaria`,`Zona`, `Servicio`, `Sueldo`, `Bono`  "
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
            ps.isClosed();
            rs.isClosed();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + e.getMessage());

        }

    }

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
                + Double.parseDouble(RF.getText()) + Double.parseDouble(ISR.getText()));

        DecimalFormat dDeposito = new DecimalFormat("#.00");
        this.deposito.setText(dDeposito.format(Ingresos - Egresos));

    }

    private void BAPNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAPNomKeyReleased
        sharepresnom();

        shareN();
    }//GEN-LAST:event_BAPNomKeyReleased

    private void BAMNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAMNomKeyReleased
        sharepresnom();

        shareN();
    }//GEN-LAST:event_BAMNomKeyReleased

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

    private void CSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CSActionPerformed

    private void shareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shareMouseClicked

        int seleccionar = share.getSelectedRow();
        NE.setText(String.valueOf(share.getValueAt(seleccionar, 0)));
        Ap.setText(String.valueOf(share.getValueAt(seleccionar, 1)));
        am.setText(String.valueOf(share.getValueAt(seleccionar, 2)));
        name.setText(String.valueOf(share.getValueAt(seleccionar, 3)));
        ban.setText(String.valueOf(share.getValueAt(seleccionar, 4)));
        cta.setText(String.valueOf(share.getValueAt(seleccionar, 5)));
        Zon.setText(String.valueOf(share.getValueAt(seleccionar, 6)));
        ServN.setText(String.valueOf(share.getValueAt(seleccionar, 7)));
        sueldo.setText(String.valueOf(share.getValueAt(seleccionar, 8)));
        Bono1.setText(String.valueOf(share.getValueAt(seleccionar, 9)));
        double d1 = Double.parseDouble(sueldo.getText());
        double Pordia = d1 / 7;
        pd.setText("" + Pordia + "");
        double Porhora = Pordia / 8;
        PH.setText("" + Porhora + "");

    }//GEN-LAST:event_shareMouseClicked

    private void BNameNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BNameNomKeyReleased
        sharepresnom();
        shareN();
    }//GEN-LAST:event_BNameNomKeyReleased

    private void AgregarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNPActionPerformed

        AgregarNs();
        FunMD();
    }//GEN-LAST:event_AgregarNPActionPerformed

    private void ModmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModmActionPerformed
        editarNS();
        FunMD();

    }//GEN-LAST:event_ModmActionPerformed

    private void BnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnoActionPerformed
        Bono.setText("0");
        deposito();
    }//GEN-LAST:event_BnoActionPerformed

    private void BsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsiActionPerformed

        String Bonosi = Bono1.getText();
        Bono.setText(Bonosi);
        deposito();
    }//GEN-LAST:event_BsiActionPerformed

    private void SemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SemanaItemStateChanged
        double d1 = Double.parseDouble(sueldo.getText());
        double Pordia = d1 / 7;
        pd.setText("" + Pordia + "");
        double Porhora = Pordia / 8;
        PH.setText("" + Porhora + "");

    }//GEN-LAST:event_SemanaItemStateChanged

    private void LSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LSActionPerformed
        Semana.setSelectedIndex(0);
        SabT.setSelectedIndex(0);
        DomT.setSelectedIndex(0);
        LunT.setSelectedIndex(0);
        MarT.setSelectedIndex(0);
        MierT.setSelectedIndex(0);
        JueT.setSelectedIndex(0);
        VieT.setSelectedIndex(0);
        Fsab.setCalendar(null);
        FDom.setCalendar(null);
        FLun.setCalendar(null);
        Fmar.setCalendar(null);
        Fmier.setCalendar(null);
        FJuev.setCalendar(null);
        Fvier.setCalendar(null);
        FDP.setCalendar(null);
    }//GEN-LAST:event_LSActionPerformed

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDFKeyReleased

    private void buspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buspKeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroServPItemStateChanged

    private void filtroNDFPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFPKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFPKeyReleased

    private void FiltroQPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQPItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppagKeyReleased

    private void BampagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BampagKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_BampagKeyReleased

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        int FP = FiltrosP.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro Apellido P "
                    + BAppag.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro Apellido M "
                    + Bampag.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro Nombre(s) "
                    + busp.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total del servicio "
                    + FiltroServP.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total de la "
                    + FiltroQP.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void busp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp1KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP1ItemStateChanged

    private void FiltroServP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP1ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP1ItemStateChanged

    private void filtroNDFP1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP1KeyReleased

    private void FiltroQP1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP1ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag1KeyReleased

    private void Bampag1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag1KeyReleased

    private void Imprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir1ActionPerformed
        int FP = FiltrosP1.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro Apellido P "
                    + BAppag1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro Apellido M "
                    + Bampag1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro Nombre(s) "
                    + busp1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total del servicio "
                    + FiltroServP1.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total de la "
                    + FiltroQP1.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro # Lista "
                    + filtroNDFP1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
    }//GEN-LAST:event_Imprimir1ActionPerformed

    private void busp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp2KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP2ItemStateChanged

    private void FiltroServP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP2ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP2ItemStateChanged

    private void filtroNDFP2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP2KeyReleased

    private void FiltroQP2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP2ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP2.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag2KeyReleased

    private void Bampag2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag2KeyReleased

    private void Imprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir2ActionPerformed
        int FP = FiltrosP2.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro Apellido P "
                    + BAppag2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro Apellido M "
                    + Bampag2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro Nombre(s) "
                    + busp2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total del servicio "
                    + FiltroServP2.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total de la "
                    + FiltroQP2.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro # Lista "
                    + filtroNDFP2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
    }//GEN-LAST:event_Imprimir2ActionPerformed

    private void busp3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp3KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP3ItemStateChanged

    private void FiltroServP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP3ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP3ItemStateChanged

    private void filtroNDFP3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP3KeyReleased

    private void FiltroQP3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP3ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP3.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag3KeyReleased

    private void Bampag3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag3KeyReleased

    private void Imprimir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir3ActionPerformed
        int FP = FiltrosP3.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total con filtro Apellido P "
                    + BAppag3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total con filtro Apellido M "
                    + Bampag3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total con filtro Nombre(s) "
                    + busp3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total del servicio "
                    + FiltroServP3.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total de la "
                    + FiltroQP3.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago3, getTitle() + " Norte", "Monto total con filtro # Lista "
                    + filtroNDFP3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
    }//GEN-LAST:event_Imprimir3ActionPerformed

    private void busp4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp4KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP4ItemStateChanged

    private void FiltroServP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP4ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP4ItemStateChanged

    private void filtroNDFP4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP4KeyReleased

    private void FiltroQP4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP4ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag4KeyReleased

    private void Bampag4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag4KeyReleased

    private void Imprimir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir4ActionPerformed

        int FP = FiltrosP4.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total con filtro Apellido P "
                    + BAppag4.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total con filtro Apellido M "
                    + Bampag4.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total con filtro Nombre(s) "
                    + busp4.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total del servicio "
                    + FiltroServP4.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total de la "
                    + FiltroQP5.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago4, getTitle() + " Poniente", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
    }//GEN-LAST:event_Imprimir4ActionPerformed

    private void busp5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp5KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP5ItemStateChanged

    private void FiltroServP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP5ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP5ItemStateChanged

    private void filtroNDFP5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP5KeyReleased

    private void FiltroQP5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP5ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag5KeyReleased

    private void Bampag5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag5KeyReleased

    private void Imprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir5ActionPerformed
        int FP = FiltrosP5.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total con filtro Apellido P "
                    + BAppag5.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total con filtro Apellido M "
                    + Bampag5.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total con filtro Nombre(s) "
                    + busp5.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total del servicio "
                    + FiltroServP5.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total de la "
                    + FiltroQP5.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago5, getTitle() + " Oficina", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
    }//GEN-LAST:event_Imprimir5ActionPerformed

    private void busp6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp6KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP6ItemStateChanged

    private void FiltroServP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP6ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP6ItemStateChanged

    private void filtroNDFP6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP6KeyReleased

    private void FiltroQP6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP6ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP6.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag6KeyReleased

    private void Bampag6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag6KeyReleased

    private void Imprimir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir6ActionPerformed
        int FP = FiltrosP6.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total con filtro Apellido P "
                    + BAppag6.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total con filtro Apellido M "
                    + Bampag6.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total con filtro Nombre(s) "
                    + busp6.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total del servicio "
                    + FiltroServP6.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total de la "
                    + FiltroQP6.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago6, getTitle() + " Sur 1", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
    }//GEN-LAST:event_Imprimir6ActionPerformed

    private void busp7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp7KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroSZP7ItemStateChanged

    private void FiltroServP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP7ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP7ItemStateChanged

    private void filtroNDFP7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP7KeyReleased

    private void FiltroQP7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP7ItemStateChanged
        FunMD();
        sumaDep();
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
        if (FP.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_BAppag7KeyReleased

    private void Bampag7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag7KeyReleased

    private void Imprimir7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir7ActionPerformed
        int FP = FiltrosP7.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 1) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total con filtro Apellido P "
                    + BAppag7.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 2) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total con filtro Apellido M "
                    + Bampag7.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 3) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total con filtro Nombre(s) "
                    + busp7.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 4) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total del servicio "
                    + FiltroServP7.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 5) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total de la "
                    + FiltroQP7.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 6) {
            utilJTablePrint(pago7, getTitle() + " Sur 2", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
    }//GEN-LAST:event_Imprimir7ActionPerformed

    private void busp8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp8KeyReleased
        FunMD();
    }//GEN-LAST:event_busp8KeyReleased

    private void CS24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS24ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS24ActionPerformed

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
        if (FP.equals("Filtrar por semana")) {
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

    private void Imprimir9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir9ActionPerformed
        DecimalFormat dimp = new DecimalFormat("#.00");
        utilJTablePrint(pago8, getTitle(), "Monto total de la " + FiltroQP.getSelectedItem().toString() + " en Santander corporativo quincenal: " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
    }//GEN-LAST:event_Imprimir9ActionPerformed

    private void sueldoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyReleased
        deposito();
        double d1 = Double.parseDouble(sueldo.getText());
        double Pordia = d1 / 7;
        pd.setText("" + Pordia + "");
        double Porhora = Pordia / 8;
        PH.setText("" + Porhora + "");
    }//GEN-LAST:event_sueldoKeyReleased

    private void Bono1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bono1KeyReleased
        deposito();
        double d1 = Double.parseDouble(sueldo.getText());
        double Pordia = d1 / 7;
        pd.setText("" + Pordia + "");
        double Porhora = Pordia / 8;
        PH.setText("" + Porhora + "");
    }//GEN-LAST:event_Bono1KeyReleased

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        try {

            int filaseleccionada = Tnom.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_EliminarActionPerformed

    private void NominabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NominabKeyReleased

        FunMD();
    }//GEN-LAST:event_NominabKeyReleased

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
        if (FTD.equals("Filtrar por semana")) {
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
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmTKeyReleased

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApTKeyReleased

    private void FApT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT1KeyReleased

    private void FAmT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT1KeyReleased

    private void FiltroSnomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina1ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina1ItemStateChanged

    private void FiltroQuincenanomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina1ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina1ItemStateChanged

    private void FZservicio1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio1.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina1.setModel(modelServicio);
        }    }//GEN-LAST:event_FZservicio1ItemStateChanged

    private void FiltrosTD1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD1ItemStateChanged

        String FTD = (String) FiltrosTD1.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
            FiltroNDF1.setVisible(false);
            LabelBNDF1.setVisible(false);
            FunMD();

        }
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab1KeyReleased

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        try {

            int filaseleccionada = Tnom1.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom1.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar1ActionPerformed

    private void FiltroNDF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF1KeyReleased

    private void CS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS4ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS4ActionPerformed

    private void FApT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT2KeyReleased

    private void FAmT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT2KeyReleased

    private void FiltroSnomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina2ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina2ItemStateChanged

    private void FiltroQuincenanomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina2ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina2ItemStateChanged

    private void FZservicio2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio2ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio2.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina2.setModel(modelServicio);
        }    }//GEN-LAST:event_FZservicio2ItemStateChanged

    private void FiltrosTD2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD2ItemStateChanged

        String FTD = (String) FiltrosTD2.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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
        }    }//GEN-LAST:event_FiltrosTD2ItemStateChanged

    private void Nominab2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab2KeyReleased

    private void Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar2ActionPerformed
        try {

            int filaseleccionada = Tnom2.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom2.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar2ActionPerformed

    private void FiltroNDF2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF2KeyReleased

    private void CS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS5ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS5ActionPerformed

    private void FApT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT3KeyReleased

    private void FAmT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT3KeyReleased

    private void FiltroSnomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina3ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina3ItemStateChanged

    private void FiltroQuincenanomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina3ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina3ItemStateChanged

    private void FZservicio3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio3ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio3.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina3.setModel(modelServicio);
        }    }//GEN-LAST:event_FZservicio3ItemStateChanged

    private void FiltrosTD3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD3ItemStateChanged

        String FTD = (String) FiltrosTD3.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab3KeyReleased

    private void Eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar3ActionPerformed
        try {

            int filaseleccionada = Tnom3.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom3.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar3ActionPerformed

    private void FiltroNDF3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF3KeyReleased

    private void CS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS6ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS6ActionPerformed

    private void FApT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT4KeyReleased

    private void FAmT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT4KeyReleased

    private void FiltroSnomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina4ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina4ItemStateChanged

    private void FiltroQuincenanomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina4ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina4ItemStateChanged

    private void FZservicio4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio4ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio4.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina4.setModel(modelServicio);
        }    }//GEN-LAST:event_FZservicio4ItemStateChanged

    private void FiltrosTD4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD4ItemStateChanged

        String FTD = (String) FiltrosTD4.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab4KeyReleased

    private void Eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar4ActionPerformed
        try {

            int filaseleccionada = Tnom4.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom4.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar4ActionPerformed

    private void FiltroNDF4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF4KeyReleased

    private void CS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS7ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS7ActionPerformed

    private void FApT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT5KeyReleased

    private void FAmT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT5KeyReleased

    private void FiltroSnomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina5ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina5ItemStateChanged

    private void FiltroQuincenanomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina5ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina5ItemStateChanged

    private void FZservicio5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio5ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio5.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina5.setModel(modelServicio);
        }
    }//GEN-LAST:event_FZservicio5ItemStateChanged

    private void FiltrosTD5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD5ItemStateChanged

        String FTD = (String) FiltrosTD5.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab5KeyReleased

    private void Eliminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar5ActionPerformed
        try {

            int filaseleccionada = Tnom5.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom5.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar5ActionPerformed

    private void FiltroNDF5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF5KeyReleased

    private void CS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS8ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS8ActionPerformed

    private void FApT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT6KeyReleased

    private void FAmT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT6KeyReleased

    private void FiltroSnomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina6ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina6ItemStateChanged

    private void FiltroQuincenanomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina6ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina6ItemStateChanged

    private void FZservicio6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio6ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio6.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina6.setModel(modelServicio);
        }
    }//GEN-LAST:event_FZservicio6ItemStateChanged

    private void FiltrosTD6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD6ItemStateChanged

        String FTD = (String) FiltrosTD6.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab6KeyReleased

    private void Eliminar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar6ActionPerformed
        try {

            int filaseleccionada = Tnom6.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom6.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar6ActionPerformed

    private void FiltroNDF6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF6KeyReleased

    private void CS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS9ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS9ActionPerformed

    private void FApT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT7KeyReleased

    private void FAmT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT7KeyReleased

    private void FiltroSnomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina7ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina7ItemStateChanged

    private void FiltroQuincenanomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina7ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina7ItemStateChanged

    private void FZservicio7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio7ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio7.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina7.setModel(modelServicio);
        }
    }//GEN-LAST:event_FZservicio7ItemStateChanged

    private void FiltrosTD7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD7ItemStateChanged

        String FTD = (String) FiltrosTD7.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab7KeyReleased

    private void Eliminar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar7ActionPerformed
        try {

            int filaseleccionada = Tnom7.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom7.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar7ActionPerformed

    private void FiltroNDF7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF7KeyReleased

    private void CS10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS10ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS10ActionPerformed

    private void FApT8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT8KeyReleased

    private void FAmT8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT8KeyReleased

    private void FiltroSnomina8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina8ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina8ItemStateChanged

    private void FiltroQuincenanomina8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina8ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina8ItemStateChanged

    private void FZservicio8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicio8ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio8.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina8.setModel(modelServicio);
        }
    }//GEN-LAST:event_FZservicio8ItemStateChanged

    private void FiltrosTD8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTD8ItemStateChanged

        String FTD = (String) FiltrosTD8.getSelectedItem();
        if (FTD.equals("Selecciona filtro")) {
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
        if (FTD.equals("Filtrar por Apellido P")) {
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
        if (FTD.equals("Filtrar por Apellido M")) {
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
        if (FTD.equals("Filtrar por Nombre(s)")) {
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
        if (FTD.equals("Filtrar por Servicio")) {
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
        if (FTD.equals("Filtrar por semana")) {
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
        if (FTD.equals("Filtrar por # Lista")) {
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

    private void Nominab8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Nominab8KeyReleased

    private void Eliminar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar8ActionPerformed
        try {

            int filaseleccionada = Tnom8.getSelectedRow();
            String sql = "delete from `nominasem.detallada." + Zon.getText() + "` where #lista=" + Tnom8.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
    }//GEN-LAST:event_Eliminar8ActionPerformed

    private void FiltroNDF8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroNDF8KeyReleased

    private void CS11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS11ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS11ActionPerformed

    private void Tnom2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom2MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom2.getModel();

            int fila = Tnom2.getSelectedRow();
            NDL.setText(String.valueOf(Tnom2.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom2.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom2.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom2.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom2.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom2.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom2.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom2.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom2.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom2.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom2.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom2.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom2.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom2.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom2.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom2.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom2.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom2.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom2.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom2.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom2.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom2.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom2.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom2.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom2MouseClicked

    private void Tnom3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom3MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom3.getModel();

            int fila = Tnom3.getSelectedRow();
            NDL.setText(String.valueOf(Tnom3.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom3.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom3.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom3.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom3.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom3.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom3.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom3.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom3.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom3.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom3.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom3.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom3.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom3.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom3.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom3.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom3.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom3.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom3.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom3.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom3.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom3.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom3.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom3.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom3MouseClicked

    private void Tnom1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom1MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom1.getModel();

            int fila = Tnom1.getSelectedRow();
            NDL.setText(String.valueOf(Tnom1.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom1.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom1.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom1.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom1.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom1.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom1.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom1.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom1.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom1.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom1.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom1.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom1.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom1.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom1.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom1.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom1.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom1.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom1.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom1.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom1.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom1.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom1.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom1.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom1MouseClicked

    private void TnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TnomMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom.getModel();

            int fila = Tnom.getSelectedRow();
            NDL.setText(String.valueOf(Tnom.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void Tnom4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom4MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom4.getModel();

            int fila = Tnom4.getSelectedRow();
            NDL.setText(String.valueOf(Tnom4.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom4.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom4.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom4.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom4.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom4.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom4.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom4.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom4.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom4.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom4.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom4.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom4.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom4.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom4.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom4.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom4.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom4.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom4.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom4.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom4.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom4.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom4.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom4.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom4MouseClicked

    private void Tnom5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom5MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom5.getModel();

            int fila = Tnom5.getSelectedRow();
            NDL.setText(String.valueOf(Tnom5.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom5.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom5.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom5.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom5.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom5.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom5.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom5.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom5.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom5.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom5.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom5.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom5.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom5.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom5.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom5.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom5.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom5.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom5.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom5.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom5.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom5.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom5.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom5.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom5MouseClicked

    private void Tnom6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom6MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom6.getModel();

            int fila = Tnom6.getSelectedRow();
            NDL.setText(String.valueOf(Tnom6.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom6.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom6.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom6.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom6.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom6.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom6.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom6.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom6.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom6.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom6.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom6.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom6.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom6.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom6.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom6.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom6.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom6.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom6.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom6.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom6.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom6.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom6.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom6.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom6MouseClicked

    private void Tnom7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom7MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom7.getModel();

            int fila = Tnom7.getSelectedRow();
            NDL.setText(String.valueOf(Tnom7.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom7.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom7.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom7.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom7.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom7.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom7.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom7.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom7.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom7.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom7.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom7.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom7.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom7.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom7.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom7.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom7.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom7.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom7.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom7.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom7.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom7.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom7.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom7.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom7MouseClicked

    private void Tnom8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tnom8MouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom8.getModel();

            int fila = Tnom8.getSelectedRow();
            NDL.setText(String.valueOf(Tnom8.getValueAt(fila, 0)));
            NE.setText(String.valueOf(Tnom8.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tnom8.getValueAt(fila, 3)));
            am.setText(String.valueOf(Tnom8.getValueAt(fila, 4)));
            name.setText(String.valueOf(Tnom8.getValueAt(fila, 2)));
            Bono.setText(String.valueOf(Tnom8.getValueAt(fila, 5)));
            Bono1.setText(String.valueOf(Tnom8.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom8.getValueAt(fila, 6)));
            ban.setText(String.valueOf(Tnom8.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(Tnom8.getValueAt(fila, 8)));
            ServN.setText(String.valueOf(Tnom8.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(Tnom8.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom8.getValueAt(fila, 11)));
            PH.setText(String.valueOf(Tnom8.getValueAt(fila, 12)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 21));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 29));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom8.getValueAt(fila, 30)));
            THE.setText(String.valueOf(Tnom8.getValueAt(fila, 31)));
            RI.setText(String.valueOf(Tnom8.getValueAt(fila, 32)));
            ISR.setText(String.valueOf(Tnom.getValueAt(fila, 33)));
            RF.setText(String.valueOf(Tnom8.getValueAt(fila, 34)));
            ADN.setText(String.valueOf(Tnom8.getValueAt(fila, 35)));
            Presp.setText(String.valueOf(Tnom8.getValueAt(fila, 36)));
            Rembolso.setText(String.valueOf(Tnom8.getValueAt(fila, 37)));
            deposito.setText(String.valueOf(Tnom8.getValueAt(fila, 38)));
            obs.setText(String.valueOf(Tnom8.getValueAt(fila, 39)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_simss_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom8MouseClicked

    private void CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanActionPerformed
        DAB.clearSelection();
        ISR.setText("0");
        RI.setText("0");
        RF.setText("0");
        PH.setText("0");
        HE.setText("0");
        THE.setText("0");
        DAB.clearSelection();
        NSprenom.setText("0");
        ADN.setText("0");
        QAcdanom.setText("0");
        NODTnom.setText("0");
        NCDANom.setText("0");
        NCDANom.setText("0");
        NDL.setText("0");
        NE.setText("0");
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
        NSprenom.setText("0");
        Pagadoprenom.setText("0");
        Pendienteprenom.setText("0");
        TACDANOM.setText("0");
        NODTnom.setText("0");
        NSODTnom.setText("0");
        PagODTnom.setText("0");
        PenODTnom.setText("0");
        QAcdanom.setText("0");
        DAB.clearSelection();
        ISR.setText("0");
        ADN.setText("0");
        RF.setText("0");
        NDL.setText("0");
        Ap.setText("");
        am.setText("");
        name.setText("");
        Bono.setText("0");
        cta.setText("");
        ban.setText("");
        Zon.setText("");
        ServN.setText("");
        sueldo.setText("0");
        pd.setText("0");
        PH.setText("0");
        HE.setText("0");
        THE.setText("0");
        RI.setText("0");
        Presp.setText("0");
        obs.setText("");
        Rembolso.setText("0");
        deposito.setText("0");
        NumPrenom.setText("0");
        Pagadoprenom.setText("0");
        Pagadoprenom.setText("0");
        Pendienteprenom.setText("0");
    }//GEN-LAST:event_CleanActionPerformed

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
        NominaS_simss_5 regr = new NominaS_simss_5(usr, LP);
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
        Listas_5 regr = new Listas_5(usr, LP);
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
        Inturbide_4 regr = new Inturbide_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        Tehueantepec_4 regr = new Tehueantepec_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        PT_4 regr = new PT_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        Depositos_4 regr = new Depositos_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void ZYSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZYSActionPerformed
        AltasZyS_3 regr = new AltasZyS_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ZYSActionPerformed

    private void NomSemGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomSemGenActionPerformed
        NominaS_5 regr = new NominaS_5(usr, LP);
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

    private void PRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESActionPerformed
        PresQ_5 regr = new PresQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PRESActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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

    private void CNQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNQActionPerformed
        NominaQ_5 regr = new NominaQ_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CNQActionPerformed

    private void ADMV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADMV2ActionPerformed
        VentanaADM_3 regr = new VentanaADM_3(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ADMV2ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        RepNomSem_7 regr = new RepNomSem_7();
        regr.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void SabTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SabTItemStateChanged
        String D1 = (String) SabT.getSelectedItem();

        if (D1.equals(".")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("A")) {
            DL1 = 1;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("D")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 1;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("V")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 1;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("I")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 1;
            df = 0;
            dft = 0;

        }
        if (D1.equals("F")) {
            DL1 = 0;
            F1 = 1;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("FJ")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 1;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("DT")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 1;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals(" ")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 1;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("R")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 1;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("DSGS")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 1;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("DF")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 1;
            dft = 0;

        }
        if (D1.equals("DFT")) {
            DL1 = 0;
            F1 = 0;
            FJ1 = 0;
            dt1 = 0;
            DO1 = 0;
            R1 = 0;
            DSGS1 = 0;
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_SabTItemStateChanged

    private void MierTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MierTItemStateChanged
        String D5 = (String) MierT.getSelectedItem();

        if (D5.equals(".")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("A")) {
            DL5 = 1;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("D")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 1;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("V")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 1;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("I")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 1;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("F")) {
            DL5 = 0;
            F5 = 1;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("FJ")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 1;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("DT")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 1;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals(" ")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 1;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("R")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 1;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("DSGS")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 1;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("DF")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 1;
            dft5 = 0;

        }
        if (D5.equals("DFT")) {
            DL5 = 0;
            F5 = 0;
            FJ5 = 0;
            dt5 = 0;
            DO5 = 0;
            R5 = 0;
            DSGS5 = 0;
            dv5 = 0;
            dd5 = 0;
            in5 = 0;
            df5 = 0;
            dft5 = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        deposito();
    }//GEN-LAST:event_MierTItemStateChanged

    private void VieTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_VieTItemStateChanged
        String D7 = (String) VieT.getSelectedItem();

        if (D7.equals(".")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("A")) {
            DL7 = 1;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("D")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 1;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("V")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 1;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("I")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 1;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("F")) {
            DL7 = 0;
            F7 = 1;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("FJ")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 1;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("DT")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 1;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals(" ")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 1;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("R")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 1;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("DSGS")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 1;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("DF")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 1;
            dft7 = 0;

        }
        if (D7.equals("DFT")) {
            DL7 = 0;
            F7 = 0;
            FJ7 = 0;
            dt7 = 0;
            DO7 = 0;
            R7 = 0;
            DSGS7 = 0;
            dv7 = 0;
            dd7 = 0;
            in7 = 0;
            df7 = 0;
            dft7 = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_VieTItemStateChanged

    private void JueTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JueTItemStateChanged
        String D6 = (String) JueT.getSelectedItem();

        if (D6.equals(".")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("A")) {
            DL6 = 1;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("D")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 1;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("V")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 1;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("I")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 1;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("F")) {
            DL6 = 0;
            F6 = 1;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("FJ")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 1;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DT")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 1;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals(" ")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 1;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("R")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 1;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DSGS")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 1;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DF")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 1;
            dft6 = 0;

        }
        if (D6.equals("DFT")) {
            DL6 = 0;
            F6 = 0;
            FJ6 = 0;
            dt6 = 0;
            DO6 = 0;
            R6 = 0;
            DSGS6 = 0;
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_JueTItemStateChanged

    private void LunTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LunTItemStateChanged
        String D3 = (String) LunT.getSelectedItem();

        if (D3.equals(".")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("A")) {
            DL3 = 1;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("D")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 1;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("V")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 1;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("I")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 1;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("F")) {
            DL3 = 0;
            F3 = 1;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("FJ")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 1;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("DT")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 1;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals(" ")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 1;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("R")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 1;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("DSGS")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 1;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("DF")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 1;
            dft3 = 0;

        }
        if (D3.equals("DFT")) {
            DL3 = 0;
            F3 = 0;
            FJ3 = 0;
            dt3 = 0;
            DO3 = 0;
            R3 = 0;
            DSGS3 = 0;
            dv3 = 0;
            dd3 = 0;
            in3 = 0;
            df3 = 0;
            dft3 = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_LunTItemStateChanged

    private void DomTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DomTItemStateChanged
        String D2 = (String) DomT.getSelectedItem();

        if (D2.equals(".")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("A")) {
            DL2 = 1;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("D")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 1;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("V")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 1;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("I")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 1;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("F")) {
            DL2 = 0;
            F2 = 1;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("FJ")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 1;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("DT")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 1;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals(" ")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 1;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("R")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 1;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("DSGS")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 1;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("DF")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 1;
            dft2 = 0;

        }
        if (D2.equals("DFT")) {
            DL2 = 0;
            F2 = 0;
            FJ2 = 0;
            dt2 = 0;
            DO2 = 0;
            R2 = 0;
            DSGS2 = 0;
            dv2 = 0;
            dd2 = 0;
            in2 = 0;
            df2 = 0;
            dft2 = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_DomTItemStateChanged

    private void MarTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MarTItemStateChanged
        String D4 = (String) MarT.getSelectedItem();

        if (D4.equals(".")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("A")) {
            DL4 = 1;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("D")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 1;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("V")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 1;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("I")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 1;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("F")) {
            DL4 = 0;
            F4 = 1;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("FJ")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 1;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("DT")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 1;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals(" ")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 1;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("R")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 1;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("DSGS")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 1;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("DF")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 1;
            dft4 = 0;

        }
        if (D4.equals("DFT")) {
            DL4 = 0;
            F4 = 0;
            FJ4 = 0;
            dt4 = 0;
            DO4 = 0;
            R4 = 0;
            DSGS4 = 0;
            dv4 = 0;
            dd4 = 0;
            in4 = 0;
            df4 = 0;
            dft4 = 1;

        }
        double totaldv = dv + dv2 + dv3 + dv4 + dv5 + dv6 + dv7;
        Ddv.setText("" + totaldv);
        double totaldd = dd + dd2 + dd3 + dd4 + dd5 + dd6 + dd7;
        DD.setText("" + totaldd);
        double totalin = in + in2 + in3 + in4 + in5 + in6 + in7;
        Dpi.setText(("" + totalin));
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_MarTItemStateChanged

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

    private void HEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HEKeyReleased

        deposito();
    }//GEN-LAST:event_HEKeyReleased

    private void DIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIActionPerformed

    }//GEN-LAST:event_DIActionPerformed

    private void DIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIKeyReleased
        deposito();
    }//GEN-LAST:event_DIKeyReleased

    private void SHPresnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHPresnomMouseClicked
        int fila = SHPresnom.getSelectedRow();
        NumPrenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 0)));
        Presp.setText(String.valueOf(SHPresnom.getValueAt(fila, 4)));
        NSprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 5)));
        Pagadoprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 6)));
        Pendienteprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 7)));
        deposito();
    }//GEN-LAST:event_SHPresnomMouseClicked

    private void SHCDAnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHCDAnomMouseClicked
        int fila = SHCDAnom.getSelectedRow();
        NCDANom.setText(String.valueOf(SHCDAnom.getValueAt(fila, 0)));
        cda.setText(String.valueOf(SHCDAnom.getValueAt(fila, 4)));
        QAcdanom.setText(String.valueOf(SHCDAnom.getValueAt(fila, 5)));
        TACDANOM.setText(String.valueOf(SHCDAnom.getValueAt(fila, 6)));
        deposito();
    }//GEN-LAST:event_SHCDAnomMouseClicked

    private void cdaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdaKeyReleased
        deposito();
    }//GEN-LAST:event_cdaKeyReleased

    private void SHODTnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHODTnomMouseClicked
        int fila = SHODTnom.getSelectedRow();
        NODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 0)));
        Odtp.setText(String.valueOf(SHODTnom.getValueAt(fila, 4)));
        NSODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 5)));
        PagODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 6)));
        PenODTnom.setText(String.valueOf(SHODTnom.getValueAt(fila, 7)));
        deposito();
    }//GEN-LAST:event_SHODTnomMouseClicked

    private void OdtpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OdtpKeyReleased
        deposito();
    }//GEN-LAST:event_OdtpKeyReleased

    private void PrespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrespKeyReleased
        deposito();
    }//GEN-LAST:event_PrespKeyReleased

    private void RIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RIKeyReleased
        deposito();
    }//GEN-LAST:event_RIKeyReleased

    private void RFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFKeyReleased
        deposito();
    }//GEN-LAST:event_RFKeyReleased

    private void FdbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdbKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_FdbKeyReleased

    private void SancionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SancionKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_SancionKeyReleased

    private void ChamarraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChamarraKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ChamarraKeyReleased

    private void ChalecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChalecoKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ChalecoKeyReleased

    private void FdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdeKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_FdeKeyReleased

    private void GruaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GruaKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_GruaKeyReleased

    private void PantalonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PantalonKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_PantalonKeyReleased

    private void CredencialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CredencialKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_CredencialKeyReleased

    private void BpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BpKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_BpKeyReleased

    private void PlayeraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayeraKeyReleased

        desv();
        deposito();
    }//GEN-LAST:event_PlayeraKeyReleased

    private void CorbataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorbataKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_CorbataKeyReleased

    private void ADNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADNKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_ADNKeyReleased

    private void CDA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA2ActionPerformed
        CDAS_5 regr = new CDAS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDA2ActionPerformed

    private void CDA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDA3ActionPerformed
        CDAS_5 regr = new CDAS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDA3ActionPerformed

    private void ODT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODT2ActionPerformed
        ODTS_5 regr = new ODTS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODT2ActionPerformed

    private void ODT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODT3ActionPerformed
        ODTS_5 regr = new ODTS_5(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODT3ActionPerformed

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
            java.util.logging.Logger.getLogger(NominaS_simss_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NominaS_simss_5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD;
    private javax.swing.JMenuItem ADMV2;
    private javax.swing.JTextField ADN;
    private javax.swing.JButton AgregarNP;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField BAMNom;
    private javax.swing.JTextField BAPNom;
    private javax.swing.JTextField BAppag;
    private javax.swing.JTextField BAppag1;
    private javax.swing.JTextField BAppag2;
    private javax.swing.JTextField BAppag3;
    private javax.swing.JTextField BAppag4;
    private javax.swing.JTextField BAppag5;
    private javax.swing.JTextField BAppag6;
    private javax.swing.JTextField BAppag7;
    private javax.swing.JTextField BAppag8;
    private javax.swing.JTextField BNameNom;
    private javax.swing.JTextField Bampag;
    private javax.swing.JTextField Bampag1;
    private javax.swing.JTextField Bampag2;
    private javax.swing.JTextField Bampag3;
    private javax.swing.JTextField Bampag4;
    private javax.swing.JTextField Bampag5;
    private javax.swing.JTextField Bampag6;
    private javax.swing.JTextField Bampag7;
    private javax.swing.JTextField Bampag8;
    private javax.swing.JRadioButton Bno;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField Bono1;
    private javax.swing.JTextField Bp;
    private javax.swing.JRadioButton Bsi;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CDA1;
    private javax.swing.JMenuItem CDA2;
    private javax.swing.JMenuItem CDA3;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JMenuItem CNQ1;
    private javax.swing.JButton CS;
    private javax.swing.JButton CS10;
    private javax.swing.JButton CS11;
    private javax.swing.JButton CS15;
    private javax.swing.JButton CS16;
    private javax.swing.JButton CS17;
    private javax.swing.JButton CS18;
    private javax.swing.JButton CS19;
    private javax.swing.JButton CS2;
    private javax.swing.JButton CS20;
    private javax.swing.JButton CS21;
    private javax.swing.JButton CS24;
    private javax.swing.JButton CS3;
    private javax.swing.JButton CS4;
    private javax.swing.JButton CS5;
    private javax.swing.JButton CS6;
    private javax.swing.JButton CS7;
    private javax.swing.JButton CS8;
    private javax.swing.JButton CS9;
    private javax.swing.JTextField Chaleco;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JButton Clean;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
    private javax.swing.JLabel DD;
    private javax.swing.JLabel DF;
    private javax.swing.JLabel DFT;
    private javax.swing.JTextField DI;
    private javax.swing.JLabel DL;
    private javax.swing.JLabel DO;
    private javax.swing.JLabel DPF;
    private javax.swing.JLabel DSGS;
    private javax.swing.JLabel DVT;
    private javax.swing.JLabel Ddv;
    private javax.swing.JMenu Depositos;
    private javax.swing.JComboBox<String> DomT;
    private javax.swing.JLabel Dpi;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JButton Eliminar2;
    private javax.swing.JButton Eliminar3;
    private javax.swing.JButton Eliminar4;
    private javax.swing.JButton Eliminar5;
    private javax.swing.JButton Eliminar6;
    private javax.swing.JButton Eliminar7;
    private javax.swing.JButton Eliminar8;
    private javax.swing.JMenuItem Estadias;
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
    private javax.swing.JTextField FApT;
    private javax.swing.JTextField FApT1;
    private javax.swing.JTextField FApT2;
    private javax.swing.JTextField FApT3;
    private javax.swing.JTextField FApT4;
    private javax.swing.JTextField FApT5;
    private javax.swing.JTextField FApT6;
    private javax.swing.JTextField FApT7;
    private javax.swing.JTextField FApT8;
    private com.toedter.calendar.JDateChooser FDP;
    private com.toedter.calendar.JDateChooser FDom;
    private javax.swing.JLabel FJ;
    private com.toedter.calendar.JDateChooser FJuev;
    private com.toedter.calendar.JDateChooser FLun;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JComboBox<String> FZservicio1;
    private javax.swing.JComboBox<String> FZservicio2;
    private javax.swing.JComboBox<String> FZservicio3;
    private javax.swing.JComboBox<String> FZservicio4;
    private javax.swing.JComboBox<String> FZservicio5;
    private javax.swing.JComboBox<String> FZservicio6;
    private javax.swing.JComboBox<String> FZservicio7;
    private javax.swing.JComboBox<String> FZservicio8;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JLabel Filtro1;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JTextField FiltroNDF1;
    private javax.swing.JTextField FiltroNDF2;
    private javax.swing.JTextField FiltroNDF3;
    private javax.swing.JTextField FiltroNDF4;
    private javax.swing.JTextField FiltroNDF5;
    private javax.swing.JTextField FiltroNDF6;
    private javax.swing.JTextField FiltroNDF7;
    private javax.swing.JTextField FiltroNDF8;
    private javax.swing.JComboBox<String> FiltroQP;
    private javax.swing.JComboBox<String> FiltroQP1;
    private javax.swing.JComboBox<String> FiltroQP2;
    private javax.swing.JComboBox<String> FiltroQP3;
    private javax.swing.JComboBox<String> FiltroQP4;
    private javax.swing.JComboBox<String> FiltroQP5;
    private javax.swing.JComboBox<String> FiltroQP6;
    private javax.swing.JComboBox<String> FiltroQP7;
    private javax.swing.JComboBox<String> FiltroQP8;
    private javax.swing.JComboBox<String> FiltroQuincenanomina;
    private javax.swing.JComboBox<String> FiltroQuincenanomina1;
    private javax.swing.JComboBox<String> FiltroQuincenanomina2;
    private javax.swing.JComboBox<String> FiltroQuincenanomina3;
    private javax.swing.JComboBox<String> FiltroQuincenanomina4;
    private javax.swing.JComboBox<String> FiltroQuincenanomina5;
    private javax.swing.JComboBox<String> FiltroQuincenanomina6;
    private javax.swing.JComboBox<String> FiltroQuincenanomina7;
    private javax.swing.JComboBox<String> FiltroQuincenanomina8;
    private javax.swing.JComboBox<String> FiltroSZP;
    private javax.swing.JComboBox<String> FiltroSZP1;
    private javax.swing.JComboBox<String> FiltroSZP2;
    private javax.swing.JComboBox<String> FiltroSZP3;
    private javax.swing.JComboBox<String> FiltroSZP4;
    private javax.swing.JComboBox<String> FiltroSZP5;
    private javax.swing.JComboBox<String> FiltroSZP6;
    private javax.swing.JComboBox<String> FiltroSZP7;
    private javax.swing.JComboBox<String> FiltroSZP8;
    private javax.swing.JComboBox<String> FiltroServP;
    private javax.swing.JComboBox<String> FiltroServP1;
    private javax.swing.JComboBox<String> FiltroServP2;
    private javax.swing.JComboBox<String> FiltroServP3;
    private javax.swing.JComboBox<String> FiltroServP4;
    private javax.swing.JComboBox<String> FiltroServP5;
    private javax.swing.JComboBox<String> FiltroServP6;
    private javax.swing.JComboBox<String> FiltroServP7;
    private javax.swing.JComboBox<String> FiltroServP8;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroSnomina1;
    private javax.swing.JComboBox<String> FiltroSnomina2;
    private javax.swing.JComboBox<String> FiltroSnomina3;
    private javax.swing.JComboBox<String> FiltroSnomina4;
    private javax.swing.JComboBox<String> FiltroSnomina5;
    private javax.swing.JComboBox<String> FiltroSnomina6;
    private javax.swing.JComboBox<String> FiltroSnomina7;
    private javax.swing.JComboBox<String> FiltroSnomina8;
    private javax.swing.JComboBox<String> FiltrosNom;
    private javax.swing.JComboBox<String> FiltrosP;
    private javax.swing.JComboBox<String> FiltrosP1;
    private javax.swing.JComboBox<String> FiltrosP2;
    private javax.swing.JComboBox<String> FiltrosP3;
    private javax.swing.JComboBox<String> FiltrosP4;
    private javax.swing.JComboBox<String> FiltrosP5;
    private javax.swing.JComboBox<String> FiltrosP6;
    private javax.swing.JComboBox<String> FiltrosP7;
    private javax.swing.JComboBox<String> FiltrosP8;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JComboBox<String> FiltrosTD1;
    private javax.swing.JComboBox<String> FiltrosTD2;
    private javax.swing.JComboBox<String> FiltrosTD3;
    private javax.swing.JComboBox<String> FiltrosTD4;
    private javax.swing.JComboBox<String> FiltrosTD5;
    private javax.swing.JComboBox<String> FiltrosTD6;
    private javax.swing.JComboBox<String> FiltrosTD7;
    private javax.swing.JComboBox<String> FiltrosTD8;
    private com.toedter.calendar.JDateChooser Fmar;
    private com.toedter.calendar.JDateChooser Fmier;
    private com.toedter.calendar.JDateChooser Fsab;
    private com.toedter.calendar.JDateChooser Fvier;
    private javax.swing.JMenuItem General;
    private javax.swing.JTextField Grua;
    private javax.swing.JTextField HE;
    private javax.swing.JTextField ISR;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Imprimir1;
    private javax.swing.JButton Imprimir2;
    private javax.swing.JButton Imprimir3;
    private javax.swing.JButton Imprimir4;
    private javax.swing.JButton Imprimir5;
    private javax.swing.JButton Imprimir6;
    private javax.swing.JButton Imprimir7;
    private javax.swing.JButton Imprimir9;
    private javax.swing.JComboBox<String> JueT;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JButton LS;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBE1;
    private javax.swing.JLabel LabelBE2;
    private javax.swing.JLabel LabelBE3;
    private javax.swing.JLabel LabelBE4;
    private javax.swing.JLabel LabelBE5;
    private javax.swing.JLabel LabelBE6;
    private javax.swing.JLabel LabelBE7;
    private javax.swing.JLabel LabelBE8;
    private javax.swing.JLabel LabelBEP;
    private javax.swing.JLabel LabelBEP1;
    private javax.swing.JLabel LabelBEP2;
    private javax.swing.JLabel LabelBEP3;
    private javax.swing.JLabel LabelBEP4;
    private javax.swing.JLabel LabelBEP5;
    private javax.swing.JLabel LabelBEP6;
    private javax.swing.JLabel LabelBEP7;
    private javax.swing.JLabel LabelBEP8;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBNDF1;
    private javax.swing.JLabel LabelBNDF2;
    private javax.swing.JLabel LabelBNDF3;
    private javax.swing.JLabel LabelBNDF4;
    private javax.swing.JLabel LabelBNDF5;
    private javax.swing.JLabel LabelBNDF6;
    private javax.swing.JLabel LabelBNDF7;
    private javax.swing.JLabel LabelBNDF8;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQ1;
    private javax.swing.JLabel LabelBQ2;
    private javax.swing.JLabel LabelBQ3;
    private javax.swing.JLabel LabelBQ4;
    private javax.swing.JLabel LabelBQ5;
    private javax.swing.JLabel LabelBQ6;
    private javax.swing.JLabel LabelBQ7;
    private javax.swing.JLabel LabelBQ8;
    private javax.swing.JLabel LabelBQP;
    private javax.swing.JLabel LabelBQP1;
    private javax.swing.JLabel LabelBQP2;
    private javax.swing.JLabel LabelBQP3;
    private javax.swing.JLabel LabelBQP4;
    private javax.swing.JLabel LabelBQP5;
    private javax.swing.JLabel LabelBQP6;
    private javax.swing.JLabel LabelBQP7;
    private javax.swing.JLabel LabelBQP8;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBS1;
    private javax.swing.JLabel LabelBS2;
    private javax.swing.JLabel LabelBS3;
    private javax.swing.JLabel LabelBS4;
    private javax.swing.JLabel LabelBS5;
    private javax.swing.JLabel LabelBS6;
    private javax.swing.JLabel LabelBS7;
    private javax.swing.JLabel LabelBS8;
    private javax.swing.JLabel LabelBSP;
    private javax.swing.JLabel LabelBSP1;
    private javax.swing.JLabel LabelBSP2;
    private javax.swing.JLabel LabelBSP3;
    private javax.swing.JLabel LabelBSP4;
    private javax.swing.JLabel LabelBSP5;
    private javax.swing.JLabel LabelBSP6;
    private javax.swing.JLabel LabelBSP7;
    private javax.swing.JLabel LabelBSP8;
    private javax.swing.JLabel LabelDSGS;
    private javax.swing.JLabel LabelNDFP;
    private javax.swing.JLabel LabelNDFP1;
    private javax.swing.JLabel LabelNDFP2;
    private javax.swing.JLabel LabelNDFP3;
    private javax.swing.JLabel LabelNDFP4;
    private javax.swing.JLabel LabelNDFP5;
    private javax.swing.JLabel LabelNDFP6;
    private javax.swing.JLabel LabelNDFP7;
    private javax.swing.JLabel LabelNDFP8;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZ1;
    private javax.swing.JLabel LabelSZ2;
    private javax.swing.JLabel LabelSZ3;
    private javax.swing.JLabel LabelSZ4;
    private javax.swing.JLabel LabelSZ5;
    private javax.swing.JLabel LabelSZ6;
    private javax.swing.JLabel LabelSZ7;
    private javax.swing.JLabel LabelSZ8;
    private javax.swing.JLabel LabelSZP;
    private javax.swing.JLabel LabelSZP1;
    private javax.swing.JLabel LabelSZP2;
    private javax.swing.JLabel LabelSZP3;
    private javax.swing.JLabel LabelSZP4;
    private javax.swing.JLabel LabelSZP5;
    private javax.swing.JLabel LabelSZP6;
    private javax.swing.JLabel LabelSZP7;
    private javax.swing.JLabel LabelSZP8;
    private javax.swing.JTextField Lugar;
    private javax.swing.JComboBox<String> LunT;
    private javax.swing.JLabel MTDsum;
    private javax.swing.JLabel MTDsum1;
    private javax.swing.JLabel MTDsum2;
    private javax.swing.JLabel MTDsum3;
    private javax.swing.JLabel MTDsum4;
    private javax.swing.JLabel MTDsum5;
    private javax.swing.JLabel MTDsum6;
    private javax.swing.JLabel MTDsum7;
    private javax.swing.JLabel MTDsum8;
    private javax.swing.JComboBox<String> MarT;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JComboBox<String> MierT;
    private javax.swing.JButton Modm;
    private javax.swing.JTextField NCDANom;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NE;
    private javax.swing.JTextField NODTnom;
    private javax.swing.JTextField NSODTnom;
    private javax.swing.JTextField NSprenom;
    private javax.swing.JScrollPane NomDetallada;
    private javax.swing.JScrollPane NomPagos;
    private javax.swing.JMenuItem NomSemGen;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Nominab1;
    private javax.swing.JTextField Nominab2;
    private javax.swing.JTextField Nominab3;
    private javax.swing.JTextField Nominab4;
    private javax.swing.JTextField Nominab5;
    private javax.swing.JTextField Nominab6;
    private javax.swing.JTextField Nominab7;
    private javax.swing.JTextField Nominab8;
    private javax.swing.JTextField NumPrenom;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT1;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JMenuItem ODT3;
    private javax.swing.JTextField Odtp;
    private javax.swing.JLabel PCR;
    private javax.swing.JLabel PDDD;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JLabel PDDDV;
    private javax.swing.JLabel PDDF;
    private javax.swing.JLabel PDDFT;
    private javax.swing.JLabel PDDL;
    private javax.swing.JLabel PDDT;
    private javax.swing.JTextField PH;
    private javax.swing.JMenuItem PRES;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JTextField PagODTnom;
    private javax.swing.JTextField Pagadoprenom;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JPanel Pbs;
    private javax.swing.JTextField PenODTnom;
    private javax.swing.JTextField Pendienteprenom;
    private javax.swing.JTabbedPane PestanañasND;
    private javax.swing.JTabbedPane PestañasPagos;
    private javax.swing.JTextField Playera;
    private javax.swing.JMenuItem PresSem;
    private javax.swing.JTextField Presp;
    private javax.swing.JTextField QAcdanom;
    private javax.swing.JLabel R;
    private javax.swing.JTextField RF;
    private javax.swing.JTextField RI;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JMenu Reportes;
    private javax.swing.JTable SHCDAnom;
    private javax.swing.JTable SHODTnom;
    private javax.swing.JTable SHPresnom;
    private javax.swing.JComboBox<String> SabT;
    private javax.swing.JTextField Sancion;
    private javax.swing.JComboBox<String> Semana;
    private javax.swing.JTextField ServN;
    private javax.swing.JTextField TACDANOM;
    private javax.swing.JTextField THE;
    private javax.swing.JScrollPane TPagos;
    private javax.swing.JScrollPane TPagos1;
    private javax.swing.JScrollPane TPagos2;
    private javax.swing.JScrollPane TPagos3;
    private javax.swing.JScrollPane TPagos4;
    private javax.swing.JScrollPane TPagos5;
    private javax.swing.JScrollPane TPagos6;
    private javax.swing.JScrollPane TPagos7;
    private javax.swing.JScrollPane TPagos8;
    private javax.swing.JTable Tnom;
    private javax.swing.JTable Tnom1;
    private javax.swing.JTable Tnom2;
    private javax.swing.JTable Tnom3;
    private javax.swing.JTable Tnom4;
    private javax.swing.JTable Tnom5;
    private javax.swing.JTable Tnom6;
    private javax.swing.JTable Tnom7;
    private javax.swing.JTable Tnom8;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JComboBox<String> VieT;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private botones.BotonWeb botonWeb1;
    private botones.BotonWeb botonWeb10;
    private botones.BotonWeb botonWeb16;
    private botones.BotonWeb botonWeb17;
    private botones.BotonWeb botonWeb18;
    private botones.BotonWeb botonWeb19;
    private botones.BotonWeb botonWeb2;
    private botones.BotonWeb botonWeb20;
    private botones.BotonWeb botonWeb21;
    private botones.BotonWeb botonWeb22;
    private botones.BotonWeb botonWeb25;
    private botones.BotonWeb botonWeb3;
    private botones.BotonWeb botonWeb4;
    private botones.BotonWeb botonWeb5;
    private botones.BotonWeb botonWeb6;
    private botones.BotonWeb botonWeb7;
    private botones.BotonWeb botonWeb8;
    private botones.BotonWeb botonWeb9;
    private javax.swing.JTextField busp;
    private javax.swing.JTextField busp1;
    private javax.swing.JTextField busp2;
    private javax.swing.JTextField busp3;
    private javax.swing.JTextField busp4;
    private javax.swing.JTextField busp5;
    private javax.swing.JTextField busp6;
    private javax.swing.JTextField busp7;
    private javax.swing.JTextField busp8;
    private javax.swing.JTextField cda;
    private javax.swing.JTextField cta;
    private javax.swing.JLabel deposito;
    private javax.swing.JLabel dt;
    private javax.swing.JTextField filtroNDFP;
    private javax.swing.JTextField filtroNDFP1;
    private javax.swing.JTextField filtroNDFP2;
    private javax.swing.JTextField filtroNDFP3;
    private javax.swing.JTextField filtroNDFP4;
    private javax.swing.JTextField filtroNDFP5;
    private javax.swing.JTextField filtroNDFP6;
    private javax.swing.JTextField filtroNDFP7;
    private javax.swing.JTextField filtroNDFP8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
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
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel261;
    private javax.swing.JLabel jLabel262;
    private javax.swing.JLabel jLabel263;
    private javax.swing.JLabel jLabel264;
    private javax.swing.JLabel jLabel265;
    private javax.swing.JLabel jLabel266;
    private javax.swing.JLabel jLabel267;
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
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel6;
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
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
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
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
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
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
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
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea obs;
    private javax.swing.JTable pago;
    private javax.swing.JTable pago1;
    private javax.swing.JTable pago2;
    private javax.swing.JTable pago3;
    private javax.swing.JTable pago4;
    private javax.swing.JTable pago5;
    private javax.swing.JTable pago6;
    private javax.swing.JTable pago7;
    private javax.swing.JTable pago8;
    private javax.swing.JTextField pd;
    private javax.swing.JLabel pds;
    private javax.swing.JTable share;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
