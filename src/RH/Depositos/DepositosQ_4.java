package RH.Depositos;

import RH.Depositos.Santander.*;
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
        FiltrosZonas FSZP8 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP8 = new DefaultComboBoxModel(FSZP8.mostrarzonas());
        Zon.setModel(modelFSZP8);
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
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
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
        //</editor-fold>
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(DepositosQ_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        MDepFA();
    }

    public DepositosQ_4(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        FunMD();
        // <editor-fold defaultstate="collapsed" desc="Fil Servicios">
        FiltrosZonas FSZP8 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP8 = new DefaultComboBoxModel(FSZP8.mostrarzonas());
        Zon.setModel(modelFSZP8);
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
        //</editor-fold>
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
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
        //</editor-fold>
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(DepositosQ_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        MDepFA();
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
        String SQL = "UPDATE `rh.depositos." + Zon.getSelectedItem().toString() + "` SET `#Folio` = '" + Integer.parseInt(NFnom.getText()) + "',"
                + " `#Lista` = '" + NDL.getText() + "', `Apellido P` = '" + Ap.getText() + "',"
                + " `Apellido M` = '" + am.getText() + "', `Nombre(s)` = '" + name.getText() + "',`Servicio` = '" + ServN.getText() + "',"
                + " `Quincena` = '" + Quincenas.getSelectedItem().toString() + "',  `Dias laborados` = '" + DL.getText() + "',"
                + " `Descanso trabajado` = '" + dt.getText() + "', `Dias de vacaciones` = '" + Ddv.getText() + "',"
                + " `Dias de incapacidades` = '" + Dpi.getText() + "', `Dias de descanso sin goce de sueldo` = '" + DSGS.getText() + "',"
                + " `Faltas justificadas` = '" + FJ.getText() + "', "
                + " `Sueldo Quincenal` = '" + sueldo.getText() + "', `Bono` = '" + Bono.getText() + "', `Apoyo` = '" + apy.getText() + "',"
                + " `Lugar` = '" + Lugar.getText() + "', `Rembolso` = '" + Rembolso.getText() + "',"
                + " `Adicionales` = '" + ADD.getText() + "', `Pago de vacaciones` = '" + PDDDV.getText() + "',"
                + " `Festivo` = '" + PDDF.getText() + "', "
                + "`Dias de desanso sin goce de sueldo` = '" + PDDDDSGS.getText() + "',"
                + " `pago real` = '" + TotalR.getText() + "', `Orden de taller` = '" + Odtp.getText() + "',"
                + " `Faltas` = '" + DPF.getText() + "', `Adelanto de nomina` = '" + AdN.getText() + "',"
                + " `Prestamo` = '" + Presp.getText() + "', `faltante de boleto` = '" + Fdb.getText() + "',"
                + " `faltante de efectivo` = '" + Fde.getText() + "', `boleto perdido` = '" + Bp.getText() + "', `sancion` = '" + Sancion.getText() + "',"
                + " `retardos` = '" + PCR.getText() + "', `grua` = '" + Grua.getText() + "',"
                + " `IMSS` = '" + DI.getText() + "',`ISR` = '" + ISR.getText() + "',`Fonacot` = '" + RF.getText() + "',`Infonavit` = '" + RI.getText() + "',"
                + " `playera` = '" + Playera.getText() + "',"
                + " `chamarra` = '" + Chamarra.getText() + "', `pantalon` = '" + Pantalon.getText() + "', "
                + "`corbata` = '" + Corbata.getText() + "',"
                + " `credencial` = '" + Credencial.getText() + "', `caja de ahorro` = '" + cda.getText() + "',"
                + " `Deposito` = '" + deposito.getText() + "', `Fecha de deposito` = '" + ((JTextField) FDD.getDateEditor().getUiComponent()).getText() + "',"
                + " `Mes de pago` = '" + MDP.getSelectedItem().toString() + "', `Forma de pago` = '" + FDP.getText() + "', "
                + "`Observaciones` = '" + Obsdeposito.getText() + "' WHERE `rh.depositos." + Zon.getSelectedItem().toString() + "`.`#Folio` = '" + Integer.parseInt(NFnom.getText()) + "'";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito Modificado.");

            Cleardeposito();
            FunMD();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar deposito: " + e.getMessage());
        }
    }

    public void FunMD() {
        MDepFA();
        MDepFT();
        MDepFP();
        MDepOfi();
        MDepNor();
        MDepPon();
        MDepS1();
        MDepS2();
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
        double desv11 = Double.parseDouble(this.Credencial.getText());
        double desv12 = Double.parseDouble(this.AdN.getText());

        double total = desv1 + desv2 + desv3 + desv4 + desv5 + desv6 + desv7
                + desv8 + desv9 + desv11 + desv12;
        this.DVT.setText("" + total + "");
    }

    public void Cleardeposito() {
        NFnom.setText("0");
        NDL.setText("");
        Ap.setText("");
        am.setText("");
        name.setText("");
        Zon.setSelectedIndex(0);
        ServN.setText("");
        sueldo.setText("0");
        Bono.setText("0");
        Quincenas.setSelectedIndex(0);
        Dpi.setText("0");
        Ddv.setText("0");
        PDDDV.setText("0");
        DL.setText("0");
        dt.setText("0");
        DSGS.setText("0");
        PDDDDSGS.setText("0");
        FJ.setText("0");
        PCR.setText("0");
        apy.setText("0");
        Lugar.setText("");
        Rembolso.setText("0");
        ADD.setText("0");
        DPF.setText("0");
        Fdb.setText("0");
        Sancion.setText("0");
        Chamarra.setText("0");
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
        DI.setText("0");
        PDDF.setText("0");
        TotalR.setText("0");
    }

    public void Agregardeposito() {
        String SQL = "INSERT INTO `rh.depositos." + Zon.getSelectedItem().toString() + "` (`#Folio`, `#Lista`,"
                + " `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Quincena`,"
                + " `Dias laborados`, `Dias de vacaciones`, `Dias de incapacidades`, `Dias de descanso sin goce de sueldo`,"
                + " `Sueldo Quincenal`, `Bono`, `Apoyo`, `Lugar`, `Descanso trabajado`, `Doblete`, `Festivo`, `Rembolso`, `adicionales`,"
                + " `Pago de vacaciones`, `Pago real`, `Orden de taller`, `Faltas`, `Faltas Justificadas`, `Dias de desanso sin goce de sueldo`,"
                + " `Prestamo`, `Adelanto de nomina`, `faltante de boleto`, `faltante de efectivo`, `boleto perdido`, `sancion`, `retardos`, "
                + "`grua`, `IMSS`, `ISR`,`Fonacot`,`Infonavit`, `playera`, `chamarra`, `corbata`, `pantalon`, `credencial`, `caja de ahorro`, `deposito`, `fecha de deposito`,"
                + " `mes de pago`, `forma de pago`, `Observaciones`) VALUES (NULL, '" + NDL.getText() + "', '" + Ap.getText() + "',"
                + " '" + am.getText() + "', '" + name.getText() + "', '" + Zon.getSelectedItem().toString() + "',"
                + " '" + ServN.getText() + "', '" + Quincenas.getSelectedItem().toString() + "',"
                + " '" + DL.getText() + "', '" + Ddv.getText() + "', '" + Dpi.getText() + "', '" + DSGS.getText() + "', '" + sueldo.getText() + "',"
                + " '" + Bono.getText() + "', '" + apy.getText() + "', '" + Lugar.getText() + "', '" + dt.getText() + "', '" + Dobletes.getText() + "', "
                + "'" + PDDF.getText() + "', '" + Rembolso.getText() + "', '" + ADD.getText() + "', '" + PDDDV.getText() + "', '" + TotalR.getText() + "',"
                + " '" + Odtp.getText() + "', '" + DPF.getText() + "', '" + FJ.getText() + "', '" + PDDDDSGS.getText() + "', '" + Presp.getText() + "',"
                + " '" + AdN.getText() + "', '" + Fdb.getText() + "', '" + Fde.getText() + "', '" + Bp.getText() + "', '" + Sancion.getText() + "',"
                + " '" + PCR.getText() + "', '" + Grua.getText() + "', '" + DI.getText() + "','" + ISR.getText() + "','" + RF.getText() + "',"
                + "'" + RI.getText() + "', '" + Playera.getText() + "', '" + Chamarra.getText() + "', '" + Corbata.getText() + "',"
                + " '" + Pantalon.getText() + "', '" + Credencial.getText() + "', '" + cda.getText() + "', '" + deposito.getText() + "',"
                + " '" + ((JTextField) FDD.getDateEditor().getUiComponent()).getText() + "', '" + MDP.getSelectedItem().toString() + "'"
                + ", '" + FDP.getText() + "', '" + Obsdeposito.getText() + "')";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deposito agregado.");

            Cleardeposito();
            FunMD();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar deposito: " + e.getMessage());
        }
    }

    public void MDepS2() {
        String SQL = "SELECT * FROM `rh.depositos.sur 2`";
        String FiltroN = busp7.getText();
        String FAPNom = BAppag7.getText();
        String FAMNom = Bampag7.getText();
        String FiltroSnom = FiltroServP7.getSelectedItem().toString();
        String FiltroQuin = FiltroQP7.getSelectedItem().toString();
        String FiltroFol = filtroNDFP7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.sur 2` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
                /*DO*/ 50, /*DF*/ 90,/*PDF*/ 90,/*DFT*/ 90,/*PDFT*/ 90, /*RET*/ 50, /*PCRET*/ 50, /*APY*/ 50, /*LUG*/ 50,
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
        String SQL = "SELECT * FROM `rh.depositos.sur 1`";
        String FiltroN = busp6.getText();
        String FAPNom = BAppag6.getText();
        String FAMNom = Bampag6.getText();
        String FiltroSnom = FiltroServP6.getSelectedItem().toString();
        String FiltroQuin = FiltroQP6.getSelectedItem().toString();
        String FiltroFol = filtroNDFP6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.sur 1` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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
        String SQL = "SELECT * FROM `rh.depositos.oficina`";
        String FiltroN = busp5.getText();
        String FAPNom = BAppag5.getText();
        String FAMNom = Bampag5.getText();
        String FiltroSnom = FiltroServP5.getSelectedItem().toString();
        String FiltroQuin = FiltroQP5.getSelectedItem().toString();
        String FiltroFol = filtroNDFP5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.oficina`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.oficina` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.oficina` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.oficina` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.oficina`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.oficina` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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
        String SQL = "SELECT * FROM `rh.depositos.poniente`";
        String FiltroN = busp4.getText();
        String FAPNom = BAppag4.getText();
        String FAMNom = Bampag4.getText();
        String FiltroSnom = FiltroServP4.getSelectedItem().toString();
        String FiltroQuin = FiltroQP4.getSelectedItem().toString();
        String FiltroFol = filtroNDFP4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.poniente`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.poniente` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.poniente` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.poniente` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.poniente`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.poniente` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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
        String SQL = "SELECT * FROM `rh.depositos.norte`";
        String FiltroN = busp3.getText();
        String FAPNom = BAppag3.getText();
        String FAMNom = Bampag3.getText();
        String FiltroSnom = FiltroServP3.getSelectedItem().toString();
        String FiltroQuin = FiltroQP3.getSelectedItem().toString();
        String FiltroFol = filtroNDFP3.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.norte`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.norte` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.norte` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.norte` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.norte`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.norte` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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
        String SQL = "SELECT * FROM `rh.depositos.foraneos toluca`";
        String FiltroN = busp2.getText();
        String FAPNom = BAppag2.getText();
        String FAMNom = Bampag2.getText();
        String FiltroSnom = FiltroServP2.getSelectedItem().toString();
        String FiltroQuin = FiltroQP2.getSelectedItem().toString();
        String FiltroFol = filtroNDFP2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos toluca` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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
        String SQL = "SELECT * FROM `rh.depositos.foraneos puebla`";
        String FiltroN = busp1.getText();
        String FAPNom = BAppag1.getText();
        String FAMNom = Bampag1.getText();
        String FiltroSnom = FiltroServP1.getSelectedItem().toString();
        String FiltroQuin = FiltroQP1.getSelectedItem().toString();
        String FiltroFol = filtroNDFP1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELE CT * FROM `rh.depositos.foraneos puebla` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos puebla` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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
        String SQL = "SELECT * FROM `rh.depositos.foraneos acapulco`";
        String FiltroN = busp.getText();
        String FAPNom = BAppag.getText();
        String FAMNom = Bampag.getText();
        String FiltroSnom = FiltroServP.getSelectedItem().toString();
        String FiltroQuin = FiltroQP.getSelectedItem().toString();
        String FiltroFol = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco` Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco` Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco` Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco`"
                    + " Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            SQL = "SELECT * FROM `rh.depositos.foraneos acapulco` Where `Quincena` LIKE '%" + FiltroQuin + "%'";
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
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena");
            modelo.addColumn("Dias laborados");
            modelo.addColumn("Dias de vacaciones");
            modelo.addColumn("Dias de incapacidad");
            modelo.addColumn("DSGS");
            modelo.addColumn("Sueldo quincenal");
            modelo.addColumn("Bono");
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");
            modelo.addColumn("Pago de Descansos trabajados");
            modelo.addColumn("Doblete");
            modelo.addColumn("Festivo");
            modelo.addColumn("Rembolso");
            modelo.addColumn("Adicionales");
            modelo.addColumn("Pago de vacaciones");
            modelo.addColumn("Pago real");
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Descuento por faltas");
            modelo.addColumn("Faltas justificadas");
            modelo.addColumn("DSGS");
            modelo.addColumn("Pago de prestamo");
            modelo.addColumn("Adelanto de nomina");
            modelo.addColumn("Faltantes de boleto");
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto perdido");
            modelo.addColumn("Sancion");
            modelo.addColumn("Retardos");
            modelo.addColumn("Grua");
            modelo.addColumn("IMSS");
            modelo.addColumn("ISR");
            modelo.addColumn("Fonacot");
            modelo.addColumn("Infonavit");
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");
            modelo.addColumn("Corbata");
            modelo.addColumn("Pantalon");
            modelo.addColumn("Credencial");
            modelo.addColumn("Caja de ahorro");
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
                /*DT*/ 50, /*PDDT*/ 50, /*DSGS*/ 50, /*PDDDDSGS*/ 50, /*FJ*/ 50, 50,
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

        double Pagoreal = (Double.parseDouble(PDDDDSGS.getText())
                + Double.parseDouble(Bono.getText()) + Double.parseDouble(Rembolso.getText())
                + Double.parseDouble(ADD.getText())
                + Double.parseDouble(apy.getText())
                + Double.parseDouble(PCR.getText())
                + Double.parseDouble(PDDF.getText())
                + Double.parseDouble(PDDDV.getText()) + Double.parseDouble(sueldo.getText())
                + Double.parseDouble(Dobletes.getText()));
        DecimalFormat PR = new DecimalFormat("#.00");
        TotalR.setText(PR.format(Pagoreal));

        double Egresos = (Double.parseDouble(DVT.getText())
                + Double.parseDouble(Odtp.getText())
                + Double.parseDouble(Presp.getText()) + Double.parseDouble(cda.getText())
                + Double.parseDouble(DPF.getText()) + Double.parseDouble(DI.getText()));

        DecimalFormat dDeposito = new DecimalFormat("#.00");
        this.deposito.setText(dDeposito.format(Pagoreal - Egresos));

    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RH = new javax.swing.JTabbedPane();
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
        DPF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        FJ = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        PDDDDSGS = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        PCR = new javax.swing.JTextField();
        RI = new javax.swing.JTextField();
        ISR = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        RF = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        Quincenas = new javax.swing.JComboBox<>();
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
        ServN = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        Zon = new javax.swing.JComboBox<>();
        Datgen = new javax.swing.JPanel();
        jLabel97 = new javax.swing.JLabel();
        NDL = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel159 = new javax.swing.JLabel();
        NFnom = new javax.swing.JTextField();
        jLabel133 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel105 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        LabelDSGS = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        apy = new javax.swing.JTextField();
        Rembolso = new javax.swing.JTextField();
        ADD = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        Dpi = new javax.swing.JTextField();
        Ddv = new javax.swing.JTextField();
        DL = new javax.swing.JTextField();
        dt = new javax.swing.JTextField();
        DSGS = new javax.swing.JTextField();
        PDDDV = new javax.swing.JTextField();
        PDDF = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Lugar = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TotalR = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        Bono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Dobletes = new javax.swing.JTextField();
        FDP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        deposito = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        jLabel3 = new javax.swing.JLabel();
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
        jLabel4 = new javax.swing.JLabel();
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
        jLabel6 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
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
        jLabel8 = new javax.swing.JLabel();
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
        jLabel10 = new javax.swing.JLabel();
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
        jLabel11 = new javax.swing.JLabel();
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
        Depositos2 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        Semanales = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Depositos C/ IMSS");

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

        DPF.setText("0");

        jLabel19.setText("Faltas Justificadas:");

        FJ.setText("0");

        jLabel136.setText("Pago de dias de DSGS:");

        PDDDDSGS.setText("0");
        PDDDDSGS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PDDDDSGSKeyReleased(evt);
            }
        });

        jLabel20.setText("Retardos");

        PCR.setText("0");

        RI.setText("0");
        RI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RIKeyReleased(evt);
            }
        });

        ISR.setText("0");

        jLabel45.setText("ISR");

        RF.setText("0");
        RF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RFKeyReleased(evt);
            }
        });

        jLabel39.setText("fonacot:");

        jLabel32.setText("Retencion infonavit:");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel84)
                    .addComponent(jLabel60)
                    .addComponent(jLabel26)
                    .addComponent(jLabel85)
                    .addComponent(jLabel136))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel61))
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addComponent(DPF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel32))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(FJ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel39))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel20))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel16Layout.createSequentialGroup()
                                .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel45)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cda, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(PCR, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(RI)
                    .addComponent(RF)
                    .addComponent(ISR))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel61)
                    .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(DPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(FJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(RF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(ISR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(PCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Quincenas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona una Quincena", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));

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
                                .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel86))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel134))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel135, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel139, javax.swing.GroupLayout.Alignment.TRAILING))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(DVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.setBackground(new java.awt.Color(204, 255, 204));

        jLabel91.setText("Servicio:");

        jLabel92.setText("Zona:");

        Zon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        Zon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ZonItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel92)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ServN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Datgen.setBackground(new java.awt.Color(204, 255, 204));

        jLabel97.setText("# Lista:");

        jLabel98.setText("Apellido P:");

        jLabel99.setText("Apellido M:");

        jLabel100.setText("Nombre(s):");

        jLabel159.setText("# Folio:");

        NFnom.setText("0");
        NFnom.setEnabled(false);

        javax.swing.GroupLayout DatgenLayout = new javax.swing.GroupLayout(Datgen);
        Datgen.setLayout(DatgenLayout);
        DatgenLayout.setHorizontalGroup(
            DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatgenLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel159)
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

        jLabel15.setText("Dias Laborados:");

        jLabel16.setText("Descansos Trabajados:");

        LabelDSGS.setText("Descanso sin goce de sueldo:");

        jLabel142.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel142.setText("Ingresos:");

        jLabel9.setText("Pago de vacaciones:");

        apy.setText("0");
        apy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apyKeyReleased(evt);
            }
        });

        Rembolso.setText("0");
        Rembolso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RembolsoKeyReleased(evt);
            }
        });

        ADD.setText("0");
        ADD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ADDKeyReleased(evt);
            }
        });

        jLabel25.setText("Adicionales:");

        jLabel182.setText("Dias festivos:");

        Dpi.setText("0");

        Ddv.setText("0");

        DL.setText("0");

        dt.setText("0");

        DSGS.setText("0");

        PDDDV.setText("0");

        PDDF.setText("0");

        jLabel17.setText("Apoyo:");

        jLabel76.setText("Lugar:");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel12.setText("Pago total:");

        TotalR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TotalR.setText("0");

        jLabel87.setText("Rembolso:");

        jLabel95.setText("Sueldo quincenal:");

        sueldo.setText("0");

        jLabel93.setText("Bono:");

        Bono.setText("0");

        jLabel5.setText("Dobletes:");

        Dobletes.setText("0");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addComponent(jLabel142)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel76))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(LabelDSGS)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel107)
                                        .addComponent(jLabel105))
                                    .addComponent(jLabel95, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel93, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Lugar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(DSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel87))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                                .addComponent(Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel182))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(Ddv, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(DL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dobletes, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PDDF, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PDDDV, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TotalR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel142)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(DL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel107)
                    .addComponent(Ddv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Dobletes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel105)
                    .addComponent(Dpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel182)
                    .addComponent(PDDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDSGS)
                    .addComponent(DSGS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel87)
                    .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(PDDDV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel95)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel93)
                    .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(TotalR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Quincena:");

        deposito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deposito.setText("0");

        jButton1.setText("Rembolso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar Campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
                                .addComponent(Datgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel106)
                                    .addComponent(jLabel102)
                                    .addComponent(jLabel109)
                                    .addComponent(jLabel110))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(FDD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(Adddeposito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Moddeposito)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton1))
                                    .addComponent(jButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel133)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel123)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Datgen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
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
                            .addComponent(Moddeposito)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
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
        Tdep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TdepMousePressed(evt);
            }
        });
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
                        .addGap(0, 7194, Short.MAX_VALUE)))
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
        Tdep1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep1MousePressed(evt);
            }
        });
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

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
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
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane29))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel29Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel161)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
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
                            .addComponent(CS15))
                        .addGap(0, 7114, Short.MAX_VALUE)))
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
                    .addComponent(jLabel3))
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
        Tdep2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep2MousePressed(evt);
            }
        });
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

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
                                .addGap(80, 80, 80)
                                .addComponent(jLabel176)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
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
                            .addComponent(CS16))
                        .addGap(0, 7114, Short.MAX_VALUE)))
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
                    .addComponent(jLabel4))
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
        Tdep3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep3MousePressed(evt);
            }
        });
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

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
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
                        .addGap(80, 80, 80)
                        .addComponent(jLabel177)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
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
                    .addComponent(CS17)
                    .addComponent(jScrollPane31, javax.swing.GroupLayout.PREFERRED_SIZE, 8176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(415, Short.MAX_VALUE))
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
                    .addComponent(jLabel6))
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
        Tdep4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep4MousePressed(evt);
            }
        });
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

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

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
                                .addGap(80, 80, 80)
                                .addComponent(jLabel178)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
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
                            .addComponent(CS18))
                        .addGap(0, 7114, Short.MAX_VALUE)))
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
                    .addComponent(jLabel7))
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
        Tdep5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep5MousePressed(evt);
            }
        });
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

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });

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
                                .addGap(80, 80, 80)
                                .addComponent(jLabel179)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
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
                            .addComponent(CS19))
                        .addGap(0, 7114, Short.MAX_VALUE)))
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
                    .addComponent(jLabel8))
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
        Tdep6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep6MousePressed(evt);
            }
        });
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

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });

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
                                .addGap(80, 80, 80)
                                .addComponent(jLabel180)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
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
                            .addComponent(CS20))
                        .addGap(0, 7114, Short.MAX_VALUE)))
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
                    .addComponent(jLabel10))
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
        Tdep7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Tdep7MousePressed(evt);
            }
        });
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

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });

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
                                .addComponent(jLabel181)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltrosP7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
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
                            .addComponent(CS21))
                        .addGap(0, 7194, Short.MAX_VALUE)))
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
                    .addComponent(jLabel11))
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

        Depositos2.setText("Depositos");

        jMenu11.setText("Quincenales");

        jMenuItem19.setText("Depositos C/ IMSS");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem19);

        jMenuItem20.setText("Depositos S/ IMSS");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem20);

        jMenuItem28.setText("Santander Depositos C/ IMSS");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem28);

        jMenuItem29.setText("Santander Depositos S/ IMSS");
        jMenuItem29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem29ActionPerformed(evt);
            }
        });
        jMenu11.add(jMenuItem29);

        Depositos2.add(jMenu11);

        jMenu12.setText("Semanales");

        jMenuItem21.setText("Depositos C/ IMSS");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem21);

        jMenuItem22.setText("Depositos S/ IMSS");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem22);

        jMenuItem30.setText("Santander Depositos C/ IMSS");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem30);

        jMenuItem31.setText("Santander Depositos S/ IMSS");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem31);

        Depositos2.add(jMenu12);

        jMenu1.add(Depositos2);

        jMenuBar1.add(jMenu1);

        Semanales.setText("Semanales");

        jMenuItem2.setText("Iturbide");
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

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        Logica_BDDep_FA obj = new Logica_BDDep_FA();
        obj.BDRH();
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        Logica_BDDep_FP obj = new Logica_BDDep_FP();
        obj.BDRH();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MousePressed
        Logica_BDDep_FT obj = new Logica_BDDep_FT();
        obj.BDRH();
    }//GEN-LAST:event_jLabel4MousePressed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        Logica_BDDep_Nor obj = new Logica_BDDep_Nor();
        obj.BDRH();
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        Logica_BDDep_Pon obj = new Logica_BDDep_Pon();
        obj.BDRH();
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        Logica_BDDep_Ofi obj = new Logica_BDDep_Ofi();
        obj.BDRH();
    }//GEN-LAST:event_jLabel8MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        Logica_BDDep_S1 obj = new Logica_BDDep_S1();
        obj.BDRH();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        Logica_BDDep_S2 obj = new Logica_BDDep_S2();
        obj.BDRH();
    }//GEN-LAST:event_jLabel11MousePressed

    private void TdepMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TdepMousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep.getModel();

            int fila = Tdep.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_TdepMousePressed

    private void Tdep1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep1MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep1.getModel();

            int fila = Tdep1.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep1.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep1.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep1.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep1.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep1.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep1.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep1.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep1.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep1.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep1.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep1.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep1.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep1.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep1.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep1.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep1.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep1.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep1.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep1.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep1.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep1.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep1.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep1.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep1.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep1.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep1.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep1.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep1.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep1.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep1.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep1.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep1.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep1.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep1.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep1.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep1.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep1.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep1.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep1.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep1.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep1.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep1.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep1.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep1MousePressed

    private void Tdep2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep2MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep2.getModel();

            int fila = Tdep2.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep2.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep2.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep2.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep2.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep2.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep2.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep2.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep2.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep2.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep2.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep2.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep2.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep2.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep2.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep2.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep2.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep2.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep2.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep2.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep2.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep2.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep2.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep2.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep2.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep2.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep2.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep2.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep2.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep2.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep2.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep2.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep2.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep2.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep2.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep2.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep2.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep2.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep2.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep2.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep2.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep2.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep2.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep2.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep2MousePressed

    private void Tdep3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep3MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep3.getModel();

            int fila = Tdep3.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep3.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep3.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep3.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep3.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep3.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep3.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep3.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep3.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep3.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep3.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep3.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep3.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep3.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep3.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep3.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep3.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep3.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep3.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep3.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep3.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep3.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep3.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep3.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep3.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep3.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep3.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep3.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep3.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep3.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep3.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep3.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep3.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep3.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep3.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep3.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep3.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep3.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep3.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep3.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep3.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep3.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep3.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep3.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep3MousePressed

    private void Tdep4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep4MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep4.getModel();

            int fila = Tdep4.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep4.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep4.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep4.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep4.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep4.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep4.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep4.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep4.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep4.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep4.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep4.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep4.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep4.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep4.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep4.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep4.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep4.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep4.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep4.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep4.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep4.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep4.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep4.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep4.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep4.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep4.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep4.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep4.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep4.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep4.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep4.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep4.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep4.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep4.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep4.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep4.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep4.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep4.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep4.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep4.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep4.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep4.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep4.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep4MousePressed

    private void Tdep5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep5MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep5.getModel();

            int fila = Tdep5.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep5.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep5.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep5.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep5.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep5.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep5.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep5.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep5.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep5.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep5.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep5.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep5.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep5.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep5.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep5.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep5.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep5.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep5.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep5.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep5.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep5.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep5.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep5.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep5.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep5.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep5.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep5.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep5.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep5.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep5.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep5.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep5.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep5.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep5.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep5.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep5.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep5.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep5.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep5.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep5.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep5.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep5.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep5.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep5MousePressed

    private void Tdep6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep6MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep6.getModel();

            int fila = Tdep6.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep6.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep6.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep6.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep6.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep6.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep6.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep6.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep6.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep6.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep6.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep6.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep6.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep6.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep6.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep6.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep6.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep6.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep6.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep6.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep6.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep6.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep6.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep6.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep6.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep6.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep6.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep6.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep6.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep6.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep6.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep6.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep6.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep6.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep6.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep6.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep6.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep6.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep6.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep6.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep6.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep6.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep6.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep6.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep6MousePressed

    private void Tdep7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tdep7MousePressed
        try {

            DefaultTableModel model = (DefaultTableModel) Tdep7.getModel();

            int fila = Tdep7.getSelectedRow();
            NFnom.setText(String.valueOf(Tdep7.getValueAt(fila, 0)));
            NDL.setText(String.valueOf(Tdep7.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(Tdep7.getValueAt(fila, 2)));
            am.setText(String.valueOf(Tdep7.getValueAt(fila, 3)));
            name.setText(String.valueOf(Tdep7.getValueAt(fila, 4)));
            ServN.setText(String.valueOf(Tdep7.getValueAt(fila, 6)));
            String Quinc = model.getValueAt(fila, 7).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(Quinc)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            DL.setText(String.valueOf(Tdep7.getValueAt(fila, 8)));
            Ddv.setText(String.valueOf(Tdep7.getValueAt(fila, 9)));
            Dpi.setText(String.valueOf(Tdep7.getValueAt(fila, 10)));
            DSGS.setText(String.valueOf(Tdep7.getValueAt(fila, 11)));
            sueldo.setText(String.valueOf(Tdep7.getValueAt(fila, 12)));
            Bono.setText(String.valueOf(Tdep7.getValueAt(fila, 13)));
            apy.setText(String.valueOf(Tdep7.getValueAt(fila, 14)));
            Lugar.setText(String.valueOf(Tdep7.getValueAt(fila, 15)));
            dt.setText(String.valueOf(Tdep7.getValueAt(fila, 16)));
            Dobletes.setText(String.valueOf(Tdep7.getValueAt(fila, 17)));
            PDDF.setText(String.valueOf(Tdep7.getValueAt(fila, 18)));
            Rembolso.setText(String.valueOf(Tdep7.getValueAt(fila, 19)));
            ADD.setText(String.valueOf(Tdep7.getValueAt(fila, 20)));
            PDDDV.setText(String.valueOf(Tdep7.getValueAt(fila, 21)));
            TotalR.setText(String.valueOf(Tdep7.getValueAt(fila, 22)));
            Odtp.setText(String.valueOf(Tdep7.getValueAt(fila, 23)));
            DPF.setText(String.valueOf(Tdep7.getValueAt(fila, 24)));
            FJ.setText(String.valueOf(Tdep7.getValueAt(fila, 25)));
            PDDDDSGS.setText(String.valueOf(Tdep7.getValueAt(fila, 26)));
            Presp.setText(String.valueOf(Tdep7.getValueAt(fila, 27)));
            AdN.setText(String.valueOf(Tdep7.getValueAt(fila, 28)));
            Fdb.setText(String.valueOf(Tdep7.getValueAt(fila, 29)));
            Fde.setText(String.valueOf(Tdep7.getValueAt(fila, 30)));
            Bp.setText(String.valueOf(Tdep7.getValueAt(fila, 31)));
            Sancion.setText(String.valueOf(Tdep7.getValueAt(fila, 32)));
            PCR.setText(String.valueOf(Tdep7.getValueAt(fila, 33)));
            Grua.setText(String.valueOf(Tdep7.getValueAt(fila, 34)));
            DI.setText(String.valueOf(Tdep7.getValueAt(fila, 35)));
            Playera.setText(String.valueOf(Tdep7.getValueAt(fila, 36)));
            Chamarra.setText(String.valueOf(Tdep7.getValueAt(fila, 37)));
            Corbata.setText(String.valueOf(Tdep7.getValueAt(fila, 38)));
            Pantalon.setText(String.valueOf(Tdep7.getValueAt(fila, 39)));
            Credencial.setText(String.valueOf(Tdep7.getValueAt(fila, 40)));
            cda.setText(String.valueOf(Tdep7.getValueAt(fila, 41)));
            deposito.setText(String.valueOf(Tdep7.getValueAt(fila, 42)));
            Date date1 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 43));
            FDD.setDate(date1);
            String Mes = model.getValueAt(fila, 44).toString();
            for (int i = 0; i < MDP.getItemCount(); i++) {
                if (MDP.getItemAt(i).equalsIgnoreCase(Mes)) {
                    MDP.setSelectedIndex(i);
                }
            }
            FDP.setText(String.valueOf(Tdep7.getValueAt(fila, 45)));
            Obsdeposito.setText(String.valueOf(Tdep7.getValueAt(fila, 46)));

        } catch (ParseException ex) {
            Logger.getLogger(DepositosQ_4.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        desv();
    }//GEN-LAST:event_Tdep7MousePressed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Dpi.setText("0");
        Ddv.setText("0");
        PDDDV.setText("0");
        DL.setText("0");
        dt.setText("0");
        Bono.setText("0");
        sueldo.setText("0");
        DSGS.setText("0");
        PDDDDSGS.setText("0");
        FJ.setText("0");
        PCR.setText("0");
        apy.setText("0");
        Lugar.setText("");
        ADD.setText("0");
        DPF.setText("0");
        Fdb.setText("0");
        Sancion.setText("0");
        Chamarra.setText("0");
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
        deposito();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        DepositosQ_4 regr = new DepositosQ_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        DepositosQ_4 regr = new DepositosQ_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        DepositosQ_SIMSS_4 regr = new DepositosQ_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        DepositosQSan_4 regr = new DepositosQSan_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem29ActionPerformed
        DepositosQsan_SIMSS_4 regr = new DepositosQsan_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem29ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        DepositosS_4 regr = new DepositosS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        DepositosS_SIMSS_4 regr = new DepositosS_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        DepositosSSan_4 regr = new DepositosSSan_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        DepositosSSan_SIMSS_4 regr = new DepositosSSan_SIMSS_4(usr, LP);
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void ADDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADDKeyReleased
        deposito();
    }//GEN-LAST:event_ADDKeyReleased

    private void RembolsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RembolsoKeyReleased
        deposito();
    }//GEN-LAST:event_RembolsoKeyReleased

    private void apyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apyKeyReleased
        deposito();
    }//GEN-LAST:event_apyKeyReleased

    private void ZonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ZonItemStateChanged
        if (Quincenas.getSelectedIndex() == 0) {
            String SQL = "SELECT `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Bono`, `quincena del mes` FROM `nomina.detallada." + Zon.getSelectedItem().toString() + "`"
                    + " WHERE `#lista` =" + NDL.getText() + "";

            try {
                PreparedStatement ps;
                ResultSet rs;

                ps = con.prepareStatement(SQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    Ap.setText(rs.getString(1));
                    am.setText(rs.getString(2));
                    name.setText(rs.getString(3));
                    ServN.setText(rs.getString(4));
                    Bono.setText(rs.getString(5));
                    for (int i = 0; i < Quincenas.getItemCount(); i++) {
                        if (Quincenas.getItemAt(i).equalsIgnoreCase(rs.getString(6))) {
                            Quincenas.setSelectedIndex(i);
                        }
                    }
                }
                ps.isClosed();
                rs.isClosed();
            } catch (SQLException error_sharenom) {
                JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

            }
            SQL = "SELECT `Dias descansados`, `Dias Laborados`, `Pago de dias descansados`, `Pago de dias laborados`, "
                    + " `Dias de vacaciones`, `Dias de incapacidad`, `Descanso sin goce de sueldo`, `Apoyo`, `Lugar`, `Pago de dias trabajados`, "
                    + " `Pago de dias festivos`, `Pago de dias festivos trabajados`, `Rembolso`, `Adicionales`, `Pago de dias de vacaciones` "
                    + "FROM `nomina.detallada." + Zon.getSelectedItem().toString() + "`"
                    + " WHERE `#lista` =" + NDL.getText() + "";

            try {
                PreparedStatement ps;
                ResultSet rs;

                ps = con.prepareStatement(SQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    double DDMDL = Double.parseDouble(rs.getString(1)) + Double.parseDouble(rs.getString(2));
                    DL.setText("" + DDMDL);
                    double PDDMDL = Double.parseDouble(rs.getString(3)) + Double.parseDouble(rs.getString(4));
                    sueldo.setText("" + PDDMDL);
                    Ddv.setText(rs.getString(5));
                    Dpi.setText(rs.getString(6));
                    DSGS.setText(rs.getString(7));
                    apy.setText(rs.getString(8));
                    Lugar.setText(rs.getString(9));
                    dt.setText(rs.getString(10));
                    double PDFMDFT = Double.parseDouble(rs.getString(11)) + Double.parseDouble(rs.getString(12));
                    PDDF.setText("" + PDFMDFT);
                    Rembolso.setText(rs.getString(13));
                    ADD.setText(rs.getString(14));
                    PDDDV.setText(rs.getString(15));
                }
                ps.isClosed();
                rs.isClosed();
            } catch (SQLException error_sharenom) {
                JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

            }
            SQL = "SELECT `Dias descansados`, `Dias Laborados`, `Pago de dias descansados`, `Pago de dias laborados`, "
                    + " `Dias de vacaciones`, `Dias de incapacidad`, `Descanso sin goce de sueldo`, `Apoyo`, `Lugar`, `Pago de dias trabajados`, "
                    + " `Pago de dias festivos`, `Pago de dias festivos trabajados`, `Rembolso`, `Adicionales`, `Pago de dias de vacaciones`, "
                    + "`Dias festivos trabajados`, `Dias festivos` "
                    + "FROM `nomina.detallada." + Zon.getSelectedItem().toString() + "`"
                    + " WHERE `#lista` =" + NDL.getText() + "";

            try {
                PreparedStatement ps;
                ResultSet rs;

                ps = con.prepareStatement(SQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    double DDMDL = (Double.parseDouble(rs.getString(1)) + Double.parseDouble(rs.getString(2)) + (Double.parseDouble(rs.getString(16)) + Double.parseDouble(rs.getString(17))));
                    DL.setText("" + DDMDL);
                    double PDDMDL = Double.parseDouble(rs.getString(3)) + Double.parseDouble(rs.getString(4));
                    sueldo.setText("" + PDDMDL);
                    Ddv.setText(rs.getString(5));
                    Dpi.setText(rs.getString(6));
                    DSGS.setText(rs.getString(7));
                    apy.setText(rs.getString(8));
                    Lugar.setText(rs.getString(9));
                    dt.setText(rs.getString(10));
                    double PDFMDFT = Double.parseDouble(rs.getString(11)) + Double.parseDouble(rs.getString(12));
                    PDDF.setText("" + PDFMDFT);
                    Rembolso.setText(rs.getString(13));
                    ADD.setText(rs.getString(14));
                    PDDDV.setText(rs.getString(15));
                }
                ps.isClosed();
                rs.isClosed();
            } catch (SQLException error_sharenom) {
                JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

            }

            SQL = "SELECT `Faltantes de boleto`, `Sancion`, `Chamarra`, `Faltante de efectivo`, "
                    + "`Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, `Playera`, `Corbata`, `Adelanto de nomina` "
                    + "FROM `nomina.detallada." + Zon.getSelectedItem().toString() + "`"
                    + " WHERE `#lista` =" + NDL.getText() + "";

            try {
                PreparedStatement ps;
                ResultSet rs;

                ps = con.prepareStatement(SQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    Fdb.setText(rs.getString(1));
                    Sancion.setText(rs.getString(2));
                    Chamarra.setText(rs.getString(3));
                    Fde.setText(rs.getString(4));
                    Grua.setText(rs.getString(5));
                    Pantalon.setText(rs.getString(6));
                    Credencial.setText(rs.getString(7));
                    Bp.setText(rs.getString(8));
                    Playera.setText(rs.getString(9));
                    Corbata.setText(rs.getString(10));
                    AdN.setText(rs.getString(11));
                    desv();
                }
                ps.isClosed();
                rs.isClosed();
            } catch (SQLException error_sharenom) {
                JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

            }
            SQL = "SELECT `Orden de taller`, `Descuento por faltas`, `Faltas Justificadas`, `Pago de dias de DSGS`, `Pago de prestamo`, "
                    + " `Caja de ahorro`, `Pago con retardos`, `Desc IMSS`, `Infonavit`, `fonacot`, `ISR`"
                    + "FROM `nomina.detallada." + Zon.getSelectedItem().toString() + "`"
                    + " WHERE `#lista` =" + NDL.getText() + "";

            try {
                PreparedStatement ps;
                ResultSet rs;

                ps = con.prepareStatement(SQL);
                rs = ps.executeQuery();

                while (rs.next()) {
                    Odtp.setText(rs.getString(1));
                    DPF.setText(rs.getString(2));
                    FJ.setText(rs.getString(3));
                    PDDDDSGS.setText(rs.getString(4));
                    Presp.setText(rs.getString(5));
                    cda.setText(rs.getString(6));
                    PCR.setText(rs.getString(7));
                    DI.setText(rs.getString(8));
                    RI.setText(rs.getString(9));
                    RF.setText(rs.getString(10));
                    ISR.setText(rs.getString(11));
                }
                ps.isClosed();
                rs.isClosed();
            } catch (SQLException error_sharenom) {
                JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

            }

            deposito();
        }
    }//GEN-LAST:event_ZonItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Cleardeposito();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RFKeyReleased
        deposito();
    }//GEN-LAST:event_RFKeyReleased

    private void RIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RIKeyReleased
        deposito();
    }//GEN-LAST:event_RIKeyReleased

    private void PDDDDSGSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PDDDDSGSKeyReleased
        deposito();
    }//GEN-LAST:event_PDDDDSGSKeyReleased

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
    private javax.swing.JButton CS15;
    private javax.swing.JButton CS16;
    private javax.swing.JButton CS17;
    private javax.swing.JButton CS18;
    private javax.swing.JButton CS19;
    private javax.swing.JButton CS20;
    private javax.swing.JButton CS21;
    private javax.swing.JButton CS3;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
    private javax.swing.JTextField DI;
    private javax.swing.JTextField DL;
    private javax.swing.JTextField DPF;
    private javax.swing.JTextField DSGS;
    private javax.swing.JTextField DVT;
    private javax.swing.JPanel Datgen;
    private javax.swing.JTextField Ddv;
    private javax.swing.JMenu Depositos1;
    private javax.swing.JMenu Depositos2;
    private javax.swing.JTextField Dobletes;
    private javax.swing.JTextField Dpi;
    private javax.swing.JMenuItem EmpleadosT;
    private javax.swing.JMenuItem Estadias;
    private com.toedter.calendar.JDateChooser FDD;
    private javax.swing.JTextField FDP;
    private javax.swing.JTextField FJ;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JComboBox<String> FiltroQP;
    private javax.swing.JComboBox<String> FiltroQP1;
    private javax.swing.JComboBox<String> FiltroQP2;
    private javax.swing.JComboBox<String> FiltroQP3;
    private javax.swing.JComboBox<String> FiltroQP4;
    private javax.swing.JComboBox<String> FiltroQP5;
    private javax.swing.JComboBox<String> FiltroQP6;
    private javax.swing.JComboBox<String> FiltroQP7;
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
    private javax.swing.JComboBox<String> FiltrosP;
    private javax.swing.JComboBox<String> FiltrosP1;
    private javax.swing.JComboBox<String> FiltrosP2;
    private javax.swing.JComboBox<String> FiltrosP3;
    private javax.swing.JComboBox<String> FiltrosP4;
    private javax.swing.JComboBox<String> FiltrosP5;
    private javax.swing.JComboBox<String> FiltrosP6;
    private javax.swing.JComboBox<String> FiltrosP7;
    private javax.swing.JMenuItem General;
    private javax.swing.JMenuItem General1;
    private javax.swing.JTextField Grua;
    private javax.swing.JTextField ISR;
    private javax.swing.JMenuItem LDA;
    private javax.swing.JMenuItem LDA3;
    private javax.swing.JLabel LabelBEP;
    private javax.swing.JLabel LabelBEP1;
    private javax.swing.JLabel LabelBEP2;
    private javax.swing.JLabel LabelBEP3;
    private javax.swing.JLabel LabelBEP4;
    private javax.swing.JLabel LabelBEP5;
    private javax.swing.JLabel LabelBEP6;
    private javax.swing.JLabel LabelBEP7;
    private javax.swing.JLabel LabelBQP;
    private javax.swing.JLabel LabelBQP1;
    private javax.swing.JLabel LabelBQP2;
    private javax.swing.JLabel LabelBQP3;
    private javax.swing.JLabel LabelBQP4;
    private javax.swing.JLabel LabelBQP5;
    private javax.swing.JLabel LabelBQP6;
    private javax.swing.JLabel LabelBQP7;
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
    private javax.swing.JButton Moddeposito;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NFnom;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JMenuItem ODT2;
    private javax.swing.JTextArea Obsdeposito;
    private javax.swing.JTextField Odtp;
    private javax.swing.JTextField PCR;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JTextField PDDDV;
    private javax.swing.JTextField PDDF;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JTabbedPane PestañasPagos;
    private javax.swing.JTextField Playera;
    private javax.swing.JTextField Presp;
    private javax.swing.JComboBox<String> Quincenas;
    private javax.swing.JTextField RF;
    private javax.swing.JTabbedPane RH;
    private javax.swing.JTextField RI;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JTextField Sancion;
    private javax.swing.JMenu Semanales;
    private javax.swing.JTextField ServN;
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
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JTextField TotalR;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JComboBox<String> Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private javax.swing.JTextField busp;
    private javax.swing.JTextField busp1;
    private javax.swing.JTextField busp2;
    private javax.swing.JTextField busp3;
    private javax.swing.JTextField busp4;
    private javax.swing.JTextField busp5;
    private javax.swing.JTextField busp6;
    private javax.swing.JTextField busp7;
    private javax.swing.JTextField cda;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
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
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
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
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
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
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane30;
    private javax.swing.JScrollPane jScrollPane31;
    private javax.swing.JScrollPane jScrollPane32;
    private javax.swing.JScrollPane jScrollPane33;
    private javax.swing.JScrollPane jScrollPane34;
    private javax.swing.JScrollPane jScrollPane35;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextField name;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
