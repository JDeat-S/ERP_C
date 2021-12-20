package Admin;

import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import Inicio.Login_2;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.MessageFormat;
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
import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class Admin_NominaQ_5 extends javax.swing.JFrame {

    int a = 1, Pa = 10, b = 15, c = 20, D = 25, e = 2,
            f = 4, g = 6, h = 8;
    ButtonGroup DAB;
    double dd, in, dv, df, dft,
            dd2, in2, dv2, df2, dft2,
            dd3, in3, dv3, df3, dft3,
            dd4, in4, dv4, df4, dft4,
            dd5, in5, dv5, df5, dft5,
            dd6, in6, dv6, df6, dft6,
            dd7, in7, dv7, df7, dft7,
            dd8, in8, dv8, df8, dft8,
            dd9, in9, dv9, df9, dft9,
            dd10, in10, dv10, df10, dft10,
            dd11, in11, dv11, df11, dft11,
            dd12, in12, dv12, df12, dft12,
            dd13, in13, dv13, df13, dft13,
            dd14, in14, dv14, df14, dft14,
            dd15, in15, dv15, df15, dft15,
            dd16, in16, dv16, df16, dft16;

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    public Admin_NominaQ_5() {
        initComponents();
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
        FiltrosZonas FSZP8 = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP8 = new DefaultComboBoxModel(FSZP8.mostrarzonas());
        FiltroSZP8.setModel(modelFSZP8);
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
        shareN();
        FunMD();
        Bono.setVisible(false);
        DAB = new ButtonGroup();
        DAB.add(Bsi);
        DAB.add(Bno);
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
        Filtro1.setVisible(false);
        BNameNom.setVisible(false);
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        BAppag.setVisible(false);
        Bampag.setVisible(false);
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
        sumaDep();
        setIconImage(new ImageIcon(Admin_NominaQ_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        sharecdanom();
        sharepresnom();
        shareODTnom();
    }

    @SuppressWarnings("unchecked")

    public void sumaDep() {
        double t = 0, t1 = 0, t2 = 0, t3 = 0, t4 = 0, t5 = 0, t6 = 0, t7 = 0, t8 = 0;
        double p, p1, p2, p3, p4, p5, p6, p7, p8;
        if (pago.getRowCount() > 0) {
            for (int i = 0; i < pago.getRowCount(); i++) {
                p = Double.parseDouble(pago.getValueAt(i, 7).toString());
                t += p;
            }
            MTDsum.setText("" + t);
        } else {

        }
        if (pago1.getRowCount() > 0) {
            for (int i = 0; i < pago1.getRowCount(); i++) {
                p1 = Double.parseDouble(pago1.getValueAt(i, 7).toString());
                t1 += p1;
            }
            MTDsum1.setText("" + t1);
        } else {

        }
        if (pago2.getRowCount() > 0) {
            for (int i = 0; i < pago2.getRowCount(); i++) {
                p2 = Double.parseDouble(pago2.getValueAt(i, 7).toString());
                t2 += p2;
            }
            MTDsum2.setText("" + t2);
        } else {

        }
        if (pago3.getRowCount() > 0) {
            for (int i = 0; i < pago3.getRowCount(); i++) {
                p3 = Double.parseDouble(pago3.getValueAt(i, 7).toString());
                t3 += p3;
            }
            MTDsum3.setText("" + t3);
        } else {

        }
        if (pago4.getRowCount() > 0) {
            for (int i = 0; i < pago4.getRowCount(); i++) {
                p4 = Double.parseDouble(pago4.getValueAt(i, 7).toString());
                t4 += p4;
            }
            MTDsum4.setText("" + t4);
        } else {

        }
        if (pago5.getRowCount() > 0) {
            for (int i = 0; i < pago5.getRowCount(); i++) {
                p5 = Double.parseDouble(pago5.getValueAt(i, 7).toString());
                t5 += p5;
            }
            MTDsum5.setText("" + t5);
        } else {

        }
        if (pago6.getRowCount() > 0) {
            for (int i = 0; i < pago6.getRowCount(); i++) {
                p6 = Double.parseDouble(pago6.getValueAt(i, 7).toString());
                t6 += p6;
            }
            MTDsum6.setText("" + t6);
        } else {

        }
        if (pago7.getRowCount() > 0) {
            for (int i = 0; i < pago7.getRowCount(); i++) {
                p7 = Double.parseDouble(pago7.getValueAt(i, 7).toString());
                t7 += p7;
            }
            MTDsum7.setText("" + t7);
        } else {

        }
        if (pago8.getRowCount() > 0) {
            for (int i = 0; i < pago8.getRowCount(); i++) {
                p8 = Double.parseDouble(pago8.getValueAt(i, 7).toString());
                t8 += p8;
            }
            MTDsum8.setText("" + t8);
        } else {

        }
    }

    public void Funimprimir(JTable jTable, String header, String footer, boolean showPrintDialog) {
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

    //Agregar pago Pres
    public void AgregarPagoPres() {

        String SQL = "INSERT INTO `nomina.pagos.prestamos` (`#Lista`, `#prestamo`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Quincena`, `# quincena`, `pagado`, `pendiente`, "
                + "`Pago de prestamo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NumPrenom.getText()));
            pst.setInt(3, Integer.parseInt(NEnom.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, Quincenas.getSelectedItem().toString());
            pst.setString(10, NQprenom.getText());
            pst.setString(11, Pagadoprenom.getText());
            pst.setString(12, Pendienteprenom.getText());
            pst.setString(13, Presp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de prestamo en registrado");

        } catch (HeadlessException | SQLException Error_PdPrestamo) {
            JOptionPane.showMessageDialog(null, "Error al registrar pago de prestamo: " + Error_PdPrestamo.getMessage());
        }
    }

    //Agregar pago ODT
    public void AgregarPagoODT() {

        String SQL = "INSERT INTO `nomina.pagos.odt` (`#Lista`, `# de orden`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Quincena`, `# quincena`, `pagado`, `pendiente`, "
                + "`Pago de odt`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NODTnom.getText()));
            pst.setInt(3, Integer.parseInt(NEnom.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, Quincenas.getSelectedItem().toString());
            pst.setString(10, NQODTnom.getText());
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

        String SQL = "INSERT INTO `nomina.pagos.cda` (`#Lista`, `#caja`, `#empleado`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Quincena`, `Caja de ahorro`,"
                + " `Observaciones`, `Qnas aportadas`, `# de recibo de pago`) VALUES (?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, '', ?, '')";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NCDANom.getText()));
            pst.setInt(3, Integer.parseInt(NEnom.getText()));
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, ServN.getText());
            pst.setString(9, Quincenas.getSelectedItem().toString());
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
            String SQL = "UPDATE `nomina.odt` SET `Status` = 'Pagado', `Quincenas pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `nomina.odt`.`idTaller` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, PagODTnom.getText());
                pst.setString(2, PenODTnom.getText());
                pst.setString(3, NQODTnom.getText());
                pst.setInt(4, Integer.parseInt(NODTnom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de orden de taller agregado.");

            } catch (HeadlessException | SQLException error_auto_odt) {
                JOptionPane.showMessageDialog(null, "Error al abonar orden de taller: " + error_auto_odt.getMessage());
            }
        } else if (Otropagoodt.equals(PenODTnom.getText())) {
            String SQL = "UPDATE `nomina.odt` SET `Status` = 'Debe', `Pagado` = ?, `Pendiente` = ?, "
                    + "`Quincenas pagadas` = ? WHERE `nomina.odt`.`idTaller` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, PagODTnom.getText());
                pst.setString(2, PenODTnom.getText());
                pst.setString(3, NQODTnom.getText());
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
                + " `Por quincenas`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.odt`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincenas`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.odt`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`, "
                    + "`Por quincenas`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.odt`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idTaller`,`Apellido P`, `Apellido M`, `Nombre(s)`, `Por quincenas`,"
                    + " `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.odt`"
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
            String SQL = "UPDATE `nomina.prestamos` SET `Status` = 'Pagado', `Quincenas pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `nomina.prestamos`.`idprestamos` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, NQprenom.getText());
                pst.setString(2, Pagadoprenom.getText());
                pst.setString(3, Pendienteprenom.getText());
                pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de prestamo en agregado.");

            } catch (HeadlessException | SQLException error_auto_pres) {
                JOptionPane.showMessageDialog(null, "Error al abonar prestamo en: " + error_auto_pres.getMessage());
            }
        } else if (otroprestamo.equals(Pendienteprenom.getText())) {

            String SQL = "UPDATE `nomina.prestamos` SET `Status` = 'Debe', `Quincenas pagadas` = ?,"
                    + " `Pagado` = ?, `Pendiente` = ? WHERE `nomina.prestamos`.`idprestamos` = ?";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);

                pst.setString(1, NQprenom.getText());
                pst.setString(2, Pagadoprenom.getText());
                pst.setString(3, Pendienteprenom.getText());
                pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Abono de prestamo en agregado.");

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
                + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.prestamos`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.prestamos`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.prestamos`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%' AND `Status` LIKE '%Debe%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por quincena`, `Quincenas pagadas`, `Pagado`, `Pendiente` FROM `nomina.prestamos`"
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
        double Ret = Double.parseDouble(this.R1.getText());
        double Ret2 = Double.parseDouble(this.R2.getText());
        double Ret3 = Double.parseDouble(this.R3.getText());
        double Ret4 = Double.parseDouble(this.R4.getText());
        double Ret5 = Double.parseDouble(this.R5.getText());
        double Ret6 = Double.parseDouble(this.R6.getText());
        double Ret7 = Double.parseDouble(this.R7.getText());
        double Ret8 = Double.parseDouble(this.R8.getText());
        double Ret9 = Double.parseDouble(this.R9.getText());
        double Ret10 = Double.parseDouble(this.R10.getText());
        double Ret11 = Double.parseDouble(this.R11.getText());
        double Ret12 = Double.parseDouble(this.R12.getText());
        double Ret13 = Double.parseDouble(this.R13.getText());
        double Ret14 = Double.parseDouble(this.R14.getText());
        double Ret15 = Double.parseDouble(this.R15.getText());
        double Ret16 = Double.parseDouble(this.R16.getText());

        double total = Ret + Ret2 + Ret3 + Ret4 + Ret5 + Ret6 + Ret7 + Ret8
                + Ret9 + Ret10 + Ret11 + Ret12 + Ret13 + Ret14 + Ret15 + Ret16;
        this.R.setText("" + total + "");
    }
//Descanso otorgado

    public void DO() {
        double DesO1 = Double.parseDouble(this.DO1.getText());
        double DesO2 = Double.parseDouble(this.DO2.getText());
        double DesO3 = Double.parseDouble(this.DO3.getText());
        double DesO4 = Double.parseDouble(this.DO4.getText());
        double DesO5 = Double.parseDouble(this.DO5.getText());
        double DesO6 = Double.parseDouble(this.DO6.getText());
        double DesO7 = Double.parseDouble(this.DO7.getText());
        double DesO8 = Double.parseDouble(this.DO8.getText());
        double DesO9 = Double.parseDouble(this.DO9.getText());
        double DesO10 = Double.parseDouble(this.DO10.getText());
        double DesO11 = Double.parseDouble(this.DO11.getText());
        double DesO12 = Double.parseDouble(this.DO12.getText());
        double DesO13 = Double.parseDouble(this.DO13.getText());
        double DesO14 = Double.parseDouble(this.DO14.getText());
        double DesO15 = Double.parseDouble(this.DO15.getText());
        double DesO16 = Double.parseDouble(this.DO16.getText());

        double total = DesO1 + DesO2 + DesO3 + DesO4 + DesO5 + DesO6 + DesO7 + DesO8 + DesO9
                + DesO10 + DesO11 + DesO12 + DesO13 + DesO14 + DesO15 + DesO16;
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
        } catch (SQLException error_sharenom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + error_sharenom.getMessage());

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
        MDNFA();
        MDNFP();
        MDNFT();
        MDNNor();
        MDNOfi();
        MDNPon();
        MDNS1();
        MDNS2();
    }

//mostrar datos pagos nomina
    public void MDPagosnomFA() {
        //Nombre persona del pago
        String FiltroN = busp.getText();
        String FAPpago = BAppag.getText();
        String FAMpago = Bampag.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`";
        String FiltroSpago = FiltroServP.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`,  `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos acapulco`"
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

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Foraneos acapulco: " + error_pagos_FA.getMessage());

        }

    }

    public void MDPagosnomFP() {
        //Nombre persona del pago
        String FiltroN = busp1.getText();
        String FAPpago = BAppag1.getText();
        String FAMpago = Bampag1.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos puebla`";
        String FiltroSpago = FiltroServP1.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP1.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP1.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`,`Sueldo`, `Deposito`, FROM `nomina.detallada.foraneos puebla`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos puebla`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos puebla`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos puebla`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos puebla`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos puebla`"
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
            pago1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_FA) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Foraneos puebla: " + error_pagos_FA.getMessage());

        }

    }

    public void MDPagosnomFT() {
        //Nombre persona del pago
        String FiltroN = busp2.getText();
        String FAPpago = BAppag2.getText();
        String FAMpago = Bampag2.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`";
        String FiltroSpago = FiltroServP2.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP2.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP2.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.foraneos toluca`"
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
            pago2.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
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
                pago2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
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
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`";
        String FiltroSpago = FiltroServP3.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP3.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP3.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.norte`"
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
            pago3.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_norte) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en norte: " + error_pagos_norte.getMessage());

        }

    }

    public void MDPagosnomPon() {
        //Nombre persona del pago
        String FiltroN = busp4.getText();
        String FAPpago = BAppag4.getText();
        String FAMpago = Bampag4.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`";
        String FiltroSpago = FiltroServP4.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP4.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP4.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.poniente`"
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
            pago4.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_poniente) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en Poniente: " + error_pagos_poniente.getMessage());

        }

    }

    public void MDPagosnomOfi() {
        //Nombre persona del pago
        String FiltroN = busp5.getText();
        String FAPpago = BAppag5.getText();
        String FAMpago = Bampag5.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`";
        String FiltroSpago = FiltroServP5.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP5.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP5.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.oficina`"
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
            pago5.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*BONO*/ 50, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_oficina) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en oficina: " + error_pagos_oficina.getMessage());

        }

    }

    public void MDPagosnomS1() {
        //Nombre persona del pago
        String FiltroN = busp6.getText();
        String FAPpago = BAppag6.getText();
        String FAMpago = Bampag6.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`";
        String FiltroSpago = FiltroServP6.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP6.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP6.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 1`"
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
            pago6.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_sur1) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en sur 1: " + error_pagos_sur1.getMessage());

        }

    }

    public void MDPagosnomS2() {
        //Nombre persona del pago
        String FiltroN = busp7.getText();
        String FAPpago = BAppag7.getText();
        String FAMpago = Bampag7.getText();
        String SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + "`Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`";
        String FiltroSpago = FiltroServP7.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP7.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP7.getText();

        if (!"".equals(FiltroN)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`"
                    + " Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`"
                    + " Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`, "
                    + "`Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroSpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`,`Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            SQL = "SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                    + " `Cuenta de banco`, `Sueldo`, `Deposito` FROM `nomina.detallada.sur 2`"
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
            pago7.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Banco");
            modelo.addColumn("Cuenta de banco");//5
            modelo.addColumn("Sueldo Quincenal");//8
            modelo.addColumn("Deposito");

//ANCHOS
            int[] anchos = {/*NL*/50, /*NAME*/ 150, /*AP*/ 50, /*AM*/ 50, /*ban*/ 50, /*CDB*/ 50,
                /*SQ*/ 60, /*DEP*/ 60};

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
        } catch (SQLException error_pagos_sur2) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos en sur 2: " + error_pagos_sur2.getMessage());

        }

    }

//Modificar nomina
    public void MODN() {

        String SQL = "UPDATE `nomina.detallada." + Zon.getText() + "` SET `#lista` = ?, `#empleado` = ?,"
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
                + "`Descanso Otorgado` = ?, `Dias festivos` = ?, `Pago de dias festivos` = ?, `Dias festivos trabajados` = ?,"
                + "`Pago de dias festivos trabajados` = ?, `Retardos` = ?, `Pago con retardos` = ?, `Apoyo` = ?, `Lugar` = ?,"
                + " `Rembolso` = ?, `Adicionales` = ?, `Faltas` = ?, `Descuento por faltas` = ?, `Desc IMSS` = ?,  "
                + " `Faltantes de boleto` = ?, `Sancion` = ?, `Chamarra` = ?, `Chaleco` = ?, `Faltante de efectivo` = ?, `Grua` = ?, `Pantalon` = ?, "
                + "`Credencial` = ?, `Adelanto de nomina` = ?, `Boleto perdido` = ?, `Playera` = ?, `Corbata` = ?, "
                + "`Total de DV` = ?, `Pago de prestamo` = ?, `Caja de ahorro` = ?, "
                + "`Orden de taller` = ?, `Deposito` = ?, `Observaciones` = ? WHERE "
                + "`nomina.detallada." + Zon.getText() + "`.`#lista` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NEnom.getText()));
            pst.setString(3, Ap.getText());
            pst.setString(4, am.getText());
            pst.setString(5, name.getText());
            pst.setString(6, ban.getText());
            pst.setString(7, cta.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, ServN.getText());
            pst.setString(10, sueldo.getText());
            pst.setString(11, Bono1.getText());
            pst.setString(12, pd.getText());
            pst.setString(13, Quincenas.getSelectedItem().toString());
            pst.setString(14, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(15, Dia1.getSelectedItem().toString());
            pst.setString(16, Dia2.getSelectedItem().toString());
            pst.setString(17, Dia3.getSelectedItem().toString());
            pst.setString(18, Dia4.getSelectedItem().toString());
            pst.setString(19, Dia5.getSelectedItem().toString());
            pst.setString(20, Dia6.getSelectedItem().toString());
            pst.setString(21, Dia7.getSelectedItem().toString());
            pst.setString(22, Dia8.getSelectedItem().toString());
            pst.setString(23, Dia9.getSelectedItem().toString());
            pst.setString(24, Dia10.getSelectedItem().toString());
            pst.setString(25, Dia11.getSelectedItem().toString());
            pst.setString(26, Dia12.getSelectedItem().toString());
            pst.setString(27, Dia13.getSelectedItem().toString());
            pst.setString(28, Dia14.getSelectedItem().toString());
            pst.setString(29, Dia15.getSelectedItem().toString());
            pst.setString(30, Dia16.getSelectedItem().toString());
            pst.setString(31, Dpi.getText());
            pst.setString(32, pds.getText());
            pst.setString(33, Ddv.getText());
            pst.setString(34, PDDDV.getText());
            pst.setString(35, DD.getText());
            pst.setString(36, PDDD.getText());
            pst.setString(37, DL.getText());
            pst.setString(38, PDDL.getText());
            pst.setString(39, dt.getText());
            pst.setString(40, PDDT.getText());
            pst.setString(41, DSGS.getText());
            pst.setString(42, PDDDDSGS.getText());
            pst.setString(43, FJ.getText());
            pst.setString(44, DO.getText());
            pst.setString(45, DF.getText());
            pst.setString(46, PDDF.getText());
            pst.setString(47, DFT.getText());
            pst.setString(48, PDDFT.getText());
            pst.setString(49, R.getText());
            pst.setString(50, PCR.getText());
            pst.setString(51, apy.getText());
            pst.setString(52, Lugar.getText());
            pst.setString(53, Rembolso.getText());
            pst.setString(54, ADD.getText());
            pst.setString(55, F.getText());
            pst.setString(56, DPF.getText());
            pst.setString(57, DI.getText());
            pst.setString(58, Fdb.getText());
            pst.setString(59, Sancion.getText());
            pst.setString(60, Chamarra.getText());
            pst.setString(61, Chaleco.getText());
            pst.setString(62, Fde.getText());
            pst.setString(63, Grua.getText());
            pst.setString(64, Pantalon.getText());
            pst.setString(65, Credencial.getText());
            pst.setString(66, Bp.getText());
            pst.setString(67, Playera.getText());
            pst.setString(68, Corbata.getText());
            pst.setString(69, AdN.getText());
            pst.setString(70, DVT.getText());
            pst.setString(71, Presp.getText());
            pst.setString(72, cda.getText());
            pst.setString(73, Odtp.getText());
            pst.setString(74, deposito.getText());
            pst.setString(75, obs.getText());
            pst.setInt(76, Integer.parseInt(NDL.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Modificad.");

            //limpiar campos
            DAB.clearSelection();
            NQprenom.setText("0");
            AdN.setText("0");
            QAcdanom.setText("0");
            NODTnom.setText("0");
            NCDANom.setText("0");
            NCDANom.setText("0");
            NDL.setText("0");
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
            Dia2.setSelectedIndex(0);
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

        } catch (HeadlessException | SQLException error_add_nom) {
            JOptionPane.showMessageDialog(null, "Error al modificar nomina en: " + error_add_nom.getMessage());
        }
    }

    // mostrar datos de nomina
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

//Agregar nomina
    public void AgregarN() {

        String SQL = "INSERT INTO `nomina.detallada." + Zon.getText() + "` (`#lista`, `#empleado`, `Apellido P`, "
                + "`Apellido M`, `Nombre(s)`, `Banco`, `Cuenta de banco`, `Zona`, `Servicio`, "
                + "`Sueldo`, `Bono`, `por dia`, `quincena del mes`, `año`, `1/16`, `2/17`,"
                + " `3/18`, `4/19`, `5/20`, `6/21`, `7/22`, `8/23`, `9/24`, `10/25`, `11/26`, "
                + "`12/27`, `13/28`, `14/29`, `15/30`, `31`, `Dias de incapacidad`, `Pago de seguro`,"
                + " `Dias de vacaciones`, `Pago de dias de vacaciones`, `Dias descansados`, "
                + "`Pago de dias descansados`, `Dias Laborados`, `Pago de dias laborados`, "
                + "`Descansos Trabajados`, `Pago de dias trabajados`, `Descanso sin goce de sueldo`, "
                + "`Pago de dias de DSGS`, `Faltas Justificadas`, `Descanso Otorgado`, `Dias festivos`, `Pago de dias festivos`, "
                + " `Dias festivos trabajados`, `Pago de dias festivos trabajados`, `Retardos`, `Pago con retardos`, `Apoyo`, "
                + " `Lugar`, `Rembolso`, `Adicionales`, `Faltas`, `Descuento por faltas`,  `Desc IMSS`, `Faltantes de boleto`, `Sancion`, `Chamarra`,"
                + " `Chaleco`, `Faltante de efectivo`, `Grua`, `Pantalon`, `Credencial`, `Boleto perdido`, "
                + "`Playera`, `Corbata`, `Adelanto de nomina`, `Total de DV`, `Pago de prestamo`, `Caja de ahorro`, `Orden de taller`, "
                + "`Deposito`, `Observaciones`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NDL.getText()));
            pst.setInt(2, Integer.parseInt(NEnom.getText()));
            pst.setString(3, Ap.getText());
            pst.setString(4, am.getText());
            pst.setString(5, name.getText());
            pst.setString(6, ban.getText());
            pst.setString(7, cta.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, ServN.getText());
            pst.setString(10, sueldo.getText());
            pst.setString(11, Bono1.getText());
            pst.setString(12, pd.getText());
            pst.setString(13, Quincenas.getSelectedItem().toString());
            pst.setString(14, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(15, Dia1.getSelectedItem().toString());
            pst.setString(16, Dia2.getSelectedItem().toString());
            pst.setString(17, Dia3.getSelectedItem().toString());
            pst.setString(18, Dia4.getSelectedItem().toString());
            pst.setString(19, Dia5.getSelectedItem().toString());
            pst.setString(20, Dia6.getSelectedItem().toString());
            pst.setString(21, Dia7.getSelectedItem().toString());
            pst.setString(22, Dia8.getSelectedItem().toString());
            pst.setString(23, Dia9.getSelectedItem().toString());
            pst.setString(24, Dia10.getSelectedItem().toString());
            pst.setString(25, Dia11.getSelectedItem().toString());
            pst.setString(26, Dia12.getSelectedItem().toString());
            pst.setString(27, Dia13.getSelectedItem().toString());
            pst.setString(28, Dia14.getSelectedItem().toString());
            pst.setString(29, Dia15.getSelectedItem().toString());
            pst.setString(30, Dia16.getSelectedItem().toString());
            pst.setString(31, Dpi.getText());
            pst.setString(32, pds.getText());
            pst.setString(33, Ddv.getText());
            pst.setString(34, PDDDV.getText());
            pst.setString(35, DD.getText());
            pst.setString(36, PDDD.getText());
            pst.setString(37, DL.getText());
            pst.setString(38, PDDL.getText());
            pst.setString(39, dt.getText());
            pst.setString(40, PDDT.getText());
            pst.setString(41, DSGS.getText());
            pst.setString(42, PDDDDSGS.getText());
            pst.setString(43, FJ.getText());
            pst.setString(44, DO.getText());
            pst.setString(45, DF.getText());
            pst.setString(46, PDDF.getText());
            pst.setString(47, DFT.getText());
            pst.setString(48, PDDFT.getText());
            pst.setString(49, R.getText());
            pst.setString(50, PCR.getText());
            pst.setString(51, apy.getText());
            pst.setString(52, Lugar.getText());
            pst.setString(53, Rembolso.getText());
            pst.setString(54, ADD.getText());
            pst.setString(55, F.getText());
            pst.setString(56, DPF.getText());
            pst.setString(57, DI.getText());
            pst.setString(58, Fdb.getText());
            pst.setString(59, Sancion.getText());
            pst.setString(60, Chamarra.getText());
            pst.setString(61, Chaleco.getText());
            pst.setString(62, Fde.getText());
            pst.setString(63, Grua.getText());
            pst.setString(64, Pantalon.getText());
            pst.setString(65, Credencial.getText());
            pst.setString(66, Bp.getText());
            pst.setString(67, Playera.getText());
            pst.setString(68, Corbata.getText());
            pst.setString(69, AdN.getText());
            pst.setString(70, DVT.getText());
            pst.setString(71, Presp.getText());
            pst.setString(72, cda.getText());
            pst.setString(73, Odtp.getText());
            pst.setString(74, deposito.getText());
            pst.setString(75, obs.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina en agregada");
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
            //limpiar campos
            DAB.clearSelection();
            NQprenom.setText("0");
            AdN.setText("0");
            QAcdanom.setText("0");
            NODTnom.setText("0");
            NCDANom.setText("0");
            NCDANom.setText("0");
            NDL.setText("0");
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
            Dia2.setSelectedIndex(0);
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

        } catch (HeadlessException | SQLException error_add_ND) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Nomina: " + error_add_ND.getMessage());
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

        //Dia festivo
        double DIAF = Double.parseDouble(this.DF.getText());
        double totalDF = DIAF * PD;
        PDDF.setText("" + totalDF);

        //dia festivo laborado
        double DiaDFT = Double.parseDouble(this.DFT.getText());
        double totaldt = (2 * PD) * DiaDFT;
        PDDFT.setText("" + totaldt);

//descanso
        double DEST = Double.parseDouble(this.dt.getText());
        double totaldft = (2 * PD) * DEST;
        PDDT.setText("" + totaldft);
//faltas
        double FAL = Double.parseDouble(this.F.getText());
        double totalFAL = ((350 * FAL) - (PD * FAL));
        DPF.setText("" + totalFAL);
//retardo
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
        double IN8 = Double.parseDouble(this.PDDFT.getText());
        double IN7 = Double.parseDouble(this.PDDF.getText());
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

        double Ingresos = (IN13 + IN10 + IN9 + IN6 + IN3 + IN5 + IN14 + IN15 + IN8 + IN7 + +IN1 + IN2);
        double Egresos = (EG1 + EG2 + EG7 + EG8 + EG4 + EG16);
        DecimalFormat dDeposito = new DecimalFormat("#.00");
        this.deposito.setText(dDeposito.format(Ingresos - Egresos));

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
        PestañasPrin = new javax.swing.JTabbedPane();
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
        Dia2 = new javax.swing.JComboBox<>();
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
        Zon = new javax.swing.JTextField();
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
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        DF = new javax.swing.JLabel();
        DFT = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        PDDF = new javax.swing.JLabel();
        PDDFT = new javax.swing.JLabel();
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
        jButton2 = new javax.swing.JButton();
        NomDetallada = new javax.swing.JScrollPane();
        PestanañasND = new javax.swing.JTabbedPane();
        TDFA = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tnom = new javax.swing.JTable();
        LabelBE = new javax.swing.JLabel();
        Nominab = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
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
        TDFA1 = new javax.swing.JScrollPane();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane21 = new javax.swing.JScrollPane();
        Tnom1 = new javax.swing.JTable();
        LabelBE1 = new javax.swing.JLabel();
        Nominab1 = new javax.swing.JTextField();
        Eliminar1 = new javax.swing.JButton();
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
        botonWeb9 = new botones.BotonWeb();
        TDFA2 = new javax.swing.JScrollPane();
        jPanel23 = new javax.swing.JPanel();
        jScrollPane22 = new javax.swing.JScrollPane();
        Tnom2 = new javax.swing.JTable();
        LabelBE2 = new javax.swing.JLabel();
        Nominab2 = new javax.swing.JTextField();
        Eliminar2 = new javax.swing.JButton();
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
        botonWeb10 = new botones.BotonWeb();
        TDFA3 = new javax.swing.JScrollPane();
        jPanel24 = new javax.swing.JPanel();
        k = new javax.swing.JScrollPane();
        Tnom3 = new javax.swing.JTable();
        LabelBE3 = new javax.swing.JLabel();
        Nominab3 = new javax.swing.JTextField();
        Eliminar3 = new javax.swing.JButton();
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
        botonWeb11 = new botones.BotonWeb();
        TDFA4 = new javax.swing.JScrollPane();
        jPanel25 = new javax.swing.JPanel();
        jScrollPane24 = new javax.swing.JScrollPane();
        Tnom4 = new javax.swing.JTable();
        LabelBE4 = new javax.swing.JLabel();
        Nominab4 = new javax.swing.JTextField();
        Eliminar4 = new javax.swing.JButton();
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
        botonWeb12 = new botones.BotonWeb();
        TDFA5 = new javax.swing.JScrollPane();
        jPanel26 = new javax.swing.JPanel();
        jScrollPane25 = new javax.swing.JScrollPane();
        Tnom5 = new javax.swing.JTable();
        LabelBE5 = new javax.swing.JLabel();
        Nominab5 = new javax.swing.JTextField();
        Eliminar5 = new javax.swing.JButton();
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
        botonWeb13 = new botones.BotonWeb();
        TDFA6 = new javax.swing.JScrollPane();
        jPanel27 = new javax.swing.JPanel();
        jScrollPane26 = new javax.swing.JScrollPane();
        Tnom6 = new javax.swing.JTable();
        LabelBE6 = new javax.swing.JLabel();
        Nominab6 = new javax.swing.JTextField();
        Eliminar6 = new javax.swing.JButton();
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
        botonWeb14 = new botones.BotonWeb();
        TDFA7 = new javax.swing.JScrollPane();
        jPanel28 = new javax.swing.JPanel();
        jScrollPane27 = new javax.swing.JScrollPane();
        Tnom7 = new javax.swing.JTable();
        LabelBE7 = new javax.swing.JLabel();
        Nominab7 = new javax.swing.JTextField();
        Eliminar7 = new javax.swing.JButton();
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
        botonWeb15 = new botones.BotonWeb();
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
        jLabel8 = new javax.swing.JLabel();
        MTDsum = new javax.swing.JLabel();
        Imprimir = new javax.swing.JButton();
        FFDPpag8 = new javax.swing.JComboBox<>();
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
        jLabel30 = new javax.swing.JLabel();
        MTDsum1 = new javax.swing.JLabel();
        Imprimir1 = new javax.swing.JButton();
        FFDPpag1 = new javax.swing.JComboBox<>();
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
        FFDPpag2 = new javax.swing.JComboBox<>();
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
        FFDPpag3 = new javax.swing.JComboBox<>();
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
        FFDPpag4 = new javax.swing.JComboBox<>();
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
        FFDPpag5 = new javax.swing.JComboBox<>();
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
        FFDPpag6 = new javax.swing.JComboBox<>();
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
        FFDPpag7 = new javax.swing.JComboBox<>();
        TPagos8 = new javax.swing.JScrollPane();
        jPanel36 = new javax.swing.JPanel();
        jScrollPane36 = new javax.swing.JScrollPane();
        pago8 = new javax.swing.JTable();
        LabelBEP8 = new javax.swing.JLabel();
        busp8 = new javax.swing.JTextField();
        CS22 = new javax.swing.JButton();
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
        botonWeb23 = new botones.BotonWeb();
        jLabel39 = new javax.swing.JLabel();
        MTDsum8 = new javax.swing.JLabel();
        Imprimir8 = new javax.swing.JButton();
        jComboBox18 = new javax.swing.JComboBox<>();
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
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ODT = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
        PRES = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina Quincenal IMSS");

        jPanel17.setBackground(new java.awt.Color(204, 255, 255));

        jLabel133.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel133.setText("Datos del empleado.");

        Datgen.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("# Lista:");

        NDL.setText("0");

        jLabel2.setText("Apellido P:");

        jLabel4.setText("Apellido M:");

        jLabel27.setText("Nombre(s):");

        jLabel127.setText("# empleado:");

        NEnom.setText("0");

        javax.swing.GroupLayout DatgenLayout = new javax.swing.GroupLayout(Datgen);
        Datgen.setLayout(DatgenLayout);
        DatgenLayout.setHorizontalGroup(
            DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatgenLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                    .addComponent(NEnom, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addContainerGap())
        );
        DatgenLayout.setVerticalGroup(
            DatgenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DatgenLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        Dia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia1ItemStateChanged(evt);
            }
        });

        Dia2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia2ItemStateChanged(evt);
            }
        });

        Dia3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia3ItemStateChanged(evt);
            }
        });

        Dia4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia4ItemStateChanged(evt);
            }
        });

        Dia5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia5ItemStateChanged(evt);
            }
        });

        Dia6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia6ItemStateChanged(evt);
            }
        });

        Dia7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia7ItemStateChanged(evt);
            }
        });

        Dia8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia8ItemStateChanged(evt);
            }
        });

        Dia9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia9ItemStateChanged(evt);
            }
        });

        Dia10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia10ItemStateChanged(evt);
            }
        });

        Dia11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia11ItemStateChanged(evt);
            }
        });

        Dia12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia12ItemStateChanged(evt);
            }
        });

        Dia13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia13ItemStateChanged(evt);
            }
        });

        Dia14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia14ItemStateChanged(evt);
            }
        });

        Dia15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
        Dia15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Dia15ItemStateChanged(evt);
            }
        });

        Dia16.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS", "DF", "DFT" }));
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
                        .addComponent(Dia2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(Dia2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ServN, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(sueldo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(ban, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(cta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(Zon))))
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

        jLabel182.setText("Dias festivos:");

        jLabel183.setText("Dias festivos trabajados:");

        DF.setText("0");

        DFT.setText("0");

        jLabel184.setText("Pago de dias festivos:");

        jLabel185.setText("Pago de dias festivos trabajados:");

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
                            .addComponent(jLabel183))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(ADD)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DFT)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel185))
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addComponent(DF)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel184))
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
                                                .addComponent(jLabel138)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PDDDV)
                                    .addComponent(PDDD)
                                    .addComponent(pds)
                                    .addComponent(PDDL)
                                    .addComponent(PDDT)
                                    .addComponent(PCR)
                                    .addComponent(PDDDDSGS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PDDF)
                                    .addComponent(PDDFT)))))
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
                            .addComponent(jLabel182)
                            .addComponent(DF)
                            .addComponent(jLabel184)
                            .addComponent(PDDF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel183)
                            .addComponent(DFT)
                            .addComponent(jLabel185)
                            .addComponent(PDDFT))
                        .addGap(19, 19, 19)
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

        jButton2.setText("Limpiar campos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

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
                                        .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2))
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
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
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
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel26)
                                .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)))
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Datgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        PestañasPrin.addTab("Nomina Quincenal", Nomina);

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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar1.setText("Eliminar");
        Eliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar1ActionPerformed(evt);
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

        botonWeb9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb9.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(Eliminar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel169)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar1)
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
                    .addComponent(FAmT1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS8)
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar2.setText("Eliminar");
        Eliminar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar2ActionPerformed(evt);
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

        botonWeb10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb10.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(Eliminar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel170)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar2)
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
                    .addComponent(FAmT2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS9)
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar3.setText("Eliminar");
        Eliminar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar3ActionPerformed(evt);
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

        botonWeb11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb11.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(Eliminar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel171)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar3)
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
                    .addComponent(FAmT3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(k, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS10)
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar4.setText("Eliminar");
        Eliminar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar4ActionPerformed(evt);
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

        botonWeb12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb12.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(Eliminar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel172)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar4)
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
                    .addComponent(FAmT4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS11)
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar5.setText("Eliminar");
        Eliminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar5ActionPerformed(evt);
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

        botonWeb13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb13.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(Eliminar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel173)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar5)
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
                    .addComponent(FAmT5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS12)
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar6.setText("Eliminar");
        Eliminar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar6ActionPerformed(evt);
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

        botonWeb14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb14.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(Eliminar6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel174)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar6)
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
                    .addComponent(FAmT6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane26, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS13)
                .addContainerGap(167, Short.MAX_VALUE))
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

        Eliminar7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar7.setText("Eliminar");
        Eliminar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar7ActionPerformed(evt);
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

        botonWeb15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb15.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCNominaQuin.php");

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addComponent(Eliminar7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel175)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7974, Short.MAX_VALUE))
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
                    .addComponent(Eliminar7)
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
                    .addComponent(FAmT7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane27, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(CS14)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        TDFA7.setViewportView(jPanel28);

        PestanañasND.addTab("Sur 2", TDFA7);

        NomDetallada.setViewportView(PestanañasND);

        PestañasPrin.addTab("Nominas detalladas", NomDetallada);

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

        LabelBQP.setText("Buscar quincena:");

        FiltroQP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQPItemStateChanged(evt);
            }
        });

        jLabel64.setText("Filtrar:");

        FiltrosP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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

        jLabel8.setText("Monto total en fila deposito:");

        MTDsum.setText("0");

        Imprimir.setText("Imprimir tabla");
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        FFDPpag8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CS3)
                    .addComponent(jLabel8)
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

        LabelBQP1.setText("Buscar quincena:");

        FiltroQP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP1ItemStateChanged(evt);
            }
        });

        jLabel159.setText("Filtrar:");

        FiltrosP1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb16.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel30.setText("Monto total en fila deposito:");

        MTDsum1.setText("0");

        Imprimir1.setText("Imprimir tabla");
        Imprimir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir1ActionPerformed(evt);
            }
        });

        FFDPpag1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir1))
                    .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane29, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
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

        LabelBQP2.setText("Buscar quincena:");

        FiltroQP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP2ItemStateChanged(evt);
            }
        });

        jLabel176.setText("Filtrar:");

        FiltrosP2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb17.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel33.setText("Monto total en fila deposito:");

        MTDsum2.setText("0");

        Imprimir2.setText("Imprimir tabla");
        Imprimir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir2ActionPerformed(evt);
            }
        });

        FFDPpag2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBQP3.setText("Buscar quincena:");

        FiltroQP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP3ItemStateChanged(evt);
            }
        });

        jLabel177.setText("Filtrar:");

        FiltrosP3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb18.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel34.setText("Monto total en fila deposito:");

        MTDsum3.setText("0");

        Imprimir3.setText("Imprimir tabla");
        Imprimir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir3ActionPerformed(evt);
            }
        });

        FFDPpag3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBQP4.setText("Buscar quincena:");

        FiltroQP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP4ItemStateChanged(evt);
            }
        });

        jLabel178.setText("Filtrar:");

        FiltrosP4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb19.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel35.setText("Monto total en fila deposito:");

        MTDsum4.setText("0");

        Imprimir4.setText("Imprimir tabla");
        Imprimir4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir4ActionPerformed(evt);
            }
        });

        FFDPpag4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBQP5.setText("Buscar quincena:");

        FiltroQP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP5ItemStateChanged(evt);
            }
        });

        jLabel179.setText("Filtrar:");

        FiltrosP5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb20.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        Imprimir5.setText("Imprimir tabla");
        Imprimir5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir5ActionPerformed(evt);
            }
        });

        jLabel36.setText("Monto total en fila deposito:");

        MTDsum5.setText("0");

        FFDPpag5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBQP6.setText("Buscar quincena:");

        FiltroQP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP6ItemStateChanged(evt);
            }
        });

        jLabel180.setText("Filtrar:");

        FiltrosP6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb21.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel37.setText("Monto total en fila deposito:");

        MTDsum6.setText("0");

        Imprimir6.setText("Imprimir tabla");
        Imprimir6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir6ActionPerformed(evt);
            }
        });

        FFDPpag6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        LabelBQP7.setText("Buscar quincena:");

        FiltroQP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        FiltroQP7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQP7ItemStateChanged(evt);
            }
        });

        jLabel181.setText("Filtrar:");

        FiltrosP7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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
        botonWeb22.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel38.setText("Monto total en fila deposito:");

        MTDsum7.setText("0");

        Imprimir7.setText("Imprimir tabla");
        Imprimir7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir7ActionPerformed(evt);
            }
        });

        FFDPpag7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

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
                        .addComponent(FFDPpag7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(1898, Short.MAX_VALUE))
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
                    .addComponent(botonWeb22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FFDPpag7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        jPanel36.setBackground(new java.awt.Color(204, 255, 255));

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

        CS22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS22.setText("Cerrar sesion");
        CS22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS22ActionPerformed(evt);
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

        jLabel186.setText("Filtrar:");

        FiltrosP8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por # Lista", "Filtrar por Metodo de pago" }));
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

        botonWeb23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb23.setToolTipText("");
        botonWeb23.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosNomQuin.php");

        jLabel39.setText("Monto total en fila deposito:");

        MTDsum8.setText("0");

        Imprimir8.setText("Imprimir tabla");
        Imprimir8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Imprimir8ActionPerformed(evt);
            }
        });

        jComboBox18.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Santander", "Bancomer", "Efectivo", "Baja", "Retenida" }));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(jLabel186)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBEP8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busp8, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAppag8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bampag8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addGroup(jPanel36Layout.createSequentialGroup()
                        .addComponent(CS22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MTDsum8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Imprimir8))
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1898, Short.MAX_VALUE))
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                    .addComponent(botonWeb23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel39)
                        .addComponent(MTDsum8)
                        .addComponent(Imprimir8))
                    .addComponent(CS22))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        TPagos8.setViewportView(jPanel36);

        PestañasPagos.addTab("Santander corporativo quincenal", TPagos8);

        NomPagos.setViewportView(PestañasPagos);

        PestañasPrin.addTab("Tablas de pagos", NomPagos);

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

        jMenu3.setText("Semanal");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Nomina Semanal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem3.setText("Prestamos Semanales");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

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

        PRES.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRES.setText("Prestamos");
        PRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESActionPerformed(evt);
            }
        });
        jMenu2.add(PRES);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Nomina General");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 2356, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasPrin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 899, Short.MAX_VALUE)
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
        MDPagosnomFA();
        MDNFA();
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

        String D16 = (String) Dia16.getSelectedItem();

        if (D16.equals(".")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("A")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("D")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("V")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("I")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("F")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("FJ")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("DT")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals(" ")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("R")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("DSGS")) {
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
            df16 = 0;
            dft16 = 0;

        }
        if (D16.equals("DF")) {
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
            df16 = 1;
            dft16 = 0;

        }
        if (D16.equals("DFT")) {
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
            df16 = 0;
            dft16 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D15 = (String) Dia15.getSelectedItem();

        if (D15.equals(".")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("A")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("D")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("V")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("I")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("F")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("FJ")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("DT")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals(" ")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("R")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("DSGS")) {
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
            df15 = 0;
            dft15 = 0;

        }
        if (D15.equals("DF")) {
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
            df15 = 1;
            dft15 = 0;

        }
        if (D15.equals("DFT")) {
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
            df15 = 0;
            dft15 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D14 = (String) Dia14.getSelectedItem();

        if (D14.equals(".")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("A")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("D")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("V")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("I")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("F")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("FJ")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("DT")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals(" ")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("R")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("DSGS")) {
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
            df14 = 0;
            dft14 = 0;

        }
        if (D14.equals("DF")) {
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
            df14 = 1;
            dft14 = 0;

        }
        if (D14.equals("DFT")) {
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
            df14 = 0;
            dft14 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D13 = (String) Dia13.getSelectedItem();

        if (D13.equals(".")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("A")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("D")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("V")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("I")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("F")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("FJ")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("DT")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals(" ")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("R")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("DSGS")) {
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
            df13 = 0;
            dft13 = 0;

        }
        if (D13.equals("DF")) {
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
            df13 = 1;
            dft13 = 0;

        }
        if (D13.equals("DFT")) {
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
            df13 = 0;
            dft13 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D12 = (String) Dia12.getSelectedItem();

        if (D12.equals(".")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("A")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("D")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("V")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("I")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("F")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("FJ")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("DT")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals(" ")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("R")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("DSGS")) {
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
            df12 = 0;
            dft12 = 0;

        }
        if (D12.equals("DF")) {
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
            df12 = 1;
            dft12 = 0;

        }
        if (D12.equals("DFT")) {
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
            df12 = 0;
            dft12 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D11 = (String) Dia11.getSelectedItem();

        if (D11.equals(".")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("A")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("D")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("V")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("I")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("F")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("FJ")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("DT")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals(" ")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("R")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("DSGS")) {
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
            df11 = 0;
            dft11 = 0;

        }
        if (D11.equals("DF")) {
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
            df11 = 1;
            dft11 = 0;

        }
        if (D11.equals("DFT")) {
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
            df11 = 0;
            dft11 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D10 = (String) Dia10.getSelectedItem();

        if (D10.equals(".")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("A")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("D")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("V")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("I")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("F")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("FJ")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("DT")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals(" ")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("R")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("DSGS")) {
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
            df10 = 0;
            dft10 = 0;

        }
        if (D10.equals("DF")) {
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
            df10 = 1;
            dft10 = 0;

        }
        if (D10.equals("DFT")) {
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
            df10 = 0;
            dft10 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D9 = (String) Dia9.getSelectedItem();

        if (D9.equals(".")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("A")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("D")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("V")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("I")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("F")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("FJ")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("DT")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals(" ")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("R")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("DSGS")) {
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
            df9 = 0;
            dft9 = 0;

        }
        if (D9.equals("DF")) {
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
            df9 = 1;
            dft9 = 0;

        }
        if (D9.equals("DFT")) {
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
            df9 = 0;
            dft9 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D8 = (String) Dia8.getSelectedItem();

        if (D8.equals(".")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("A")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("D")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("V")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("I")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("F")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("FJ")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("DT")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals(" ")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("R")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("DSGS")) {
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
            df8 = 0;
            dft8 = 0;

        }
        if (D8.equals("DF")) {
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
            df8 = 1;
            dft8 = 0;

        }
        if (D8.equals("DFT")) {
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
            df8 = 0;
            dft8 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D7 = (String) Dia7.getSelectedItem();

        if (D7.equals(".")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("A")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("D")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("V")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("I")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("F")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("FJ")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("DT")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals(" ")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("R")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("DSGS")) {
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
            df7 = 0;
            dft7 = 0;

        }
        if (D7.equals("DF")) {
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
            df7 = 1;
            dft7 = 0;

        }
        if (D7.equals("DFT")) {
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
            df7 = 0;
            dft7 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D6 = (String) Dia6.getSelectedItem();

        if (D6.equals(".")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("A")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("D")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("V")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("I")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("F")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("FJ")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DT")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("" + a + "");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
            dv6 = 0;
            dd6 = 0;
            in6 = 0;
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals(" ")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("R")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DSGS")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DF")) {
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
            df6 = 0;
            dft6 = 0;

        }
        if (D6.equals("DFT")) {
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
            df6 = 0;
            dft6 = 0;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D5 = (String) Dia5.getSelectedItem();

        if (D5.equals(".")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("A")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("D")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("V")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("I")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("F")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("FJ")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("DT")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals(" ")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("R")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("DSGS")) {
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
            df5 = 0;
            dft5 = 0;

        }
        if (D5.equals("DF")) {
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
            df5 = 1;
            dft5 = 0;

        }
        if (D5.equals("DFT")) {
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
            df5 = 0;
            dft5 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D4 = (String) Dia4.getSelectedItem();

        if (D4.equals(".")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("A")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("D")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("V")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("I")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("F")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("FJ")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("DT")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals(" ")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("R")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("DSGS")) {
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
            df4 = 0;
            dft4 = 0;

        }
        if (D4.equals("DF")) {
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
            df4 = 1;
            dft4 = 0;

        }
        if (D4.equals("DFT")) {
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
            df4 = 0;
            dft4 = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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

        String D3 = (String) Dia3.getSelectedItem();

        if (D3.equals(".")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("A")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("D")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("V")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("I")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("F")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("FJ")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("DT")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals(" ")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("R")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("DSGS")) {
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
            df3 = 0;
            dft3 = 0;

        }
        if (D3.equals("DF")) {
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
            df3 = 1;
            dft3 = 0;

        }
        if (D3.equals("DFT")) {
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
            df3 = 1;
            dft3 = 0;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();
    }//GEN-LAST:event_Dia3ItemStateChanged

    private void Dia2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia2ItemStateChanged

        String D2 = (String) Dia2.getSelectedItem();

        if (D2.equals(".")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("A")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("D")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("V")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("I")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("F")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("FJ")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("DT")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals(" ")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("R")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("DSGS")) {
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
            df2 = 0;
            dft2 = 0;

        }
        if (D2.equals("DF")) {
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
            df2 = 1;
            dft2 = 0;

        }
        if (D2.equals("DFT")) {
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
            df2 = 0;
            dft2 = 1;
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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();

        deposito();

    }//GEN-LAST:event_Dia2ItemStateChanged

    private void Dia1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Dia1ItemStateChanged

        String D1 = (String) Dia1.getSelectedItem();

        if (D1.equals(".")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("A")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("D")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("V")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("I")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("F")) {
            DL1.setText("0");
            F1.setText("" + a + "");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            dv = 0;
            dd = 0;
            in = 0;
            df = 0;
            dft = 0;

        }
        if (D1.equals("FJ")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("DT")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals(" ")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("R")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("DSGS")) {
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
            df = 0;
            dft = 0;

        }
        if (D1.equals("DF")) {
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
            df = 1;
            dft = 0;

        }
        if (D1.equals("DFT")) {
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
            df = 0;
            dft = 1;

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
        double totaldf = df + df2 + df3 + df4 + df5 + df6 + df7 + df8
                + df9 + df10 + df11 + df12 + df13 + df14 + df15 + df16;
        DF.setText("" + totaldf);
        double totaldft = dft + dft2 + dft3 + dft4 + dft5 + dft6 + dft7 + dft8
                + dft9 + dft10 + dft11 + dft12 + dft13 + dft14 + dft15 + dft16;
        DFT.setText("" + totaldft);
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
            Dia2.setSelectedIndex(0);
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
            double Q1E = 15;
            double DIVE1 = Double.parseDouble(sueldo.getText());
            double total = DIVE1 / Q1E;
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
            Dia2.setSelectedIndex(0);
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
            double Q2E = 16;
            double divE2 = Double.parseDouble(sueldo.getText());
            double total = divE2 / Q2E;
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
            Dia2.setSelectedIndex(0);
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
            double Q1F = 15;
            double divF1 = Double.parseDouble(sueldo.getText());
            double total = divF1 / Q1F;
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
            Dia2.setSelectedIndex(0);
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
            double Q2F = 13;
            double DIVF2 = Double.parseDouble(sueldo.getText());
            double total = DIVF2 / Q2F;
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
            Dia2.setSelectedIndex(0);
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
            double Q2FB = 14;
            double DIVF2B = Double.parseDouble(sueldo.getText());
            double total = DIVF2B / Q2FB;
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
            Dia2.setSelectedIndex(0);
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
            double Q1MZ = 15;
            double DIV1MZ = Double.parseDouble(sueldo.getText());
            double total = DIV1MZ / Q1MZ;
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
            Dia2.setSelectedIndex(0);
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
            double Q2MZ = 16;
            double DIV2MZ = Double.parseDouble(sueldo.getText());
            double total = DIV2MZ / Q2MZ;
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
            Dia2.setSelectedIndex(0);
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
            double Q1ABL = 15;
            double DIV1ABL = Double.parseDouble(sueldo.getText());
            double total = DIV1ABL / Q1ABL;
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
            Dia2.setSelectedIndex(0);
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
            double Q2ABL = 15;
            double DIV2ABL = Double.parseDouble(sueldo.getText());
            double total = DIV2ABL / Q2ABL;
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
            Dia2.setSelectedIndex(0);
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
            double Q1MY = 15;
            double DIV1MY = Double.parseDouble(sueldo.getText());
            double total = DIV1MY / Q1MY;
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
            Dia2.setSelectedIndex(0);
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
            double Q2MY = 16;
            double DIV2MY = Double.parseDouble(sueldo.getText());
            double total = DIV2MY / Q2MY;
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
            Dia2.setSelectedIndex(0);
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
            double Q1JN = 15;
            double DIV1JN = Double.parseDouble(sueldo.getText());
            double total = DIV1JN / Q1JN;
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
            Dia2.setSelectedIndex(0);
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
            double Q2JN = 15;
            double DIV2JN = Double.parseDouble(sueldo.getText());
            double total = DIV2JN / Q2JN;
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
            Dia2.setSelectedIndex(0);
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
            double Q1JL = 15;
            double DIV1JL = Double.parseDouble(sueldo.getText());
            double total = DIV1JL / Q1JL;
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
            Dia2.setSelectedIndex(0);
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
            double Q2JL = 16;
            double DIV2JL = Double.parseDouble(sueldo.getText());
            double total = DIV2JL / Q2JL;
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
            Dia2.setSelectedIndex(0);
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
            double Q1A = 15;
            double DIV1A = Double.parseDouble(sueldo.getText());
            double total = DIV1A / Q1A;
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
            Dia2.setSelectedIndex(0);
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
            double Q2A = 16;
            double DIV2A = Double.parseDouble(sueldo.getText());
            double total = DIV2A / Q2A;
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
            Dia2.setSelectedIndex(0);
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
            double Q1S = 15;
            double DIV1S = Double.parseDouble(sueldo.getText());
            double total = DIV1S / Q1S;
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
            Dia2.setSelectedIndex(0);
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
            double Q2S = 15;
            double DIV1S = Double.parseDouble(sueldo.getText());
            double total = DIV1S / Q2S;
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
            Dia2.setSelectedIndex(0);
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
            double Q1O = 15;
            double DIV1O = Double.parseDouble(sueldo.getText());
            double total = DIV1O / Q1O;
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
            Dia2.setSelectedIndex(0);
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
            double Q2O = 16;
            double DIV2Q = Double.parseDouble(sueldo.getText());
            double total = DIV2Q / Q2O;
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
            Dia2.setSelectedIndex(0);
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
            double Q1N = 15;
            double DIV1N = Double.parseDouble(sueldo.getText());
            double total = DIV1N / Q1N;
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
            Dia2.setSelectedIndex(0);
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
            double Q2N = 15;
            double DIV2N = Double.parseDouble(sueldo.getText());
            double total = DIV2N / Q2N;
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
            Dia2.setSelectedIndex(0);
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
            double Q1D = 15;
            double DIV1D = Double.parseDouble(sueldo.getText());
            double total = DIV1D / Q1D;
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
            Dia2.setSelectedIndex(0);
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
            double Q2D = 16;
            double DIV2D = Double.parseDouble(sueldo.getText());
            double total = DIV2D / Q2D;
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
            Dia2.setSelectedIndex(0);
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
            double Q1E = 15;
            double DIVE1 = Double.parseDouble(sueldo.getText());
            double total = DIVE1 / Q1E;
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
            Dia2.setSelectedIndex(0);
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
            double Q2E = 16;
            double divE2 = Double.parseDouble(sueldo.getText());
            double total = divE2 / Q2E;
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
            Dia2.setSelectedIndex(0);
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
            double Q1F = 15;
            double divF1 = Double.parseDouble(sueldo.getText());
            double total = divF1 / Q1F;
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
            Dia2.setSelectedIndex(0);
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
            double Q2F = 13;
            double DIVF2 = Double.parseDouble(sueldo.getText());
            double total = DIVF2 / Q2F;
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
            Dia2.setSelectedIndex(0);
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
            double Q2FB = 14;
            double DIVF2B = Double.parseDouble(sueldo.getText());
            double total = DIVF2B / Q2FB;
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
            Dia2.setSelectedIndex(0);
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
            double Q1MZ = 15;
            double DIV1MZ = Double.parseDouble(sueldo.getText());
            double total = DIV1MZ / Q1MZ;
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
            Dia2.setSelectedIndex(0);
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
            double Q2MZ = 16;
            double DIV2MZ = Double.parseDouble(sueldo.getText());
            double total = DIV2MZ / Q2MZ;
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
            Dia2.setSelectedIndex(0);
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
            double Q1ABL = 15;
            double DIV1ABL = Double.parseDouble(sueldo.getText());
            double total = DIV1ABL / Q1ABL;
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
            Dia2.setSelectedIndex(0);
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
            double Q2ABL = 15;
            double DIV2ABL = Double.parseDouble(sueldo.getText());
            double total = DIV2ABL / Q2ABL;
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
            Dia2.setSelectedIndex(0);
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
            double Q1MY = 15;
            double DIV1MY = Double.parseDouble(sueldo.getText());
            double total = DIV1MY / Q1MY;
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
            Dia2.setSelectedIndex(0);
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
            double Q2MY = 16;
            double DIV2MY = Double.parseDouble(sueldo.getText());
            double total = DIV2MY / Q2MY;
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
            Dia2.setSelectedIndex(0);
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
            double Q1JN = 15;
            double DIV1JN = Double.parseDouble(sueldo.getText());
            double total = DIV1JN / Q1JN;
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
            Dia2.setSelectedIndex(0);
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
            double Q2JN = 15;
            double DIV2JN = Double.parseDouble(sueldo.getText());
            double total = DIV2JN / Q2JN;
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
            Dia2.setSelectedIndex(0);
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
            double Q1JL = 15;
            double DIV1JL = Double.parseDouble(sueldo.getText());
            double total = DIV1JL / Q1JL;
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
            Dia2.setSelectedIndex(0);
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
            double Q2JL = 16;
            double DIV2JL = Double.parseDouble(sueldo.getText());
            double total = DIV2JL / Q2JL;
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
            Dia2.setSelectedIndex(0);
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
            double Q1A = 15;
            double DIV1A = Double.parseDouble(sueldo.getText());
            double total = DIV1A / Q1A;
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
            Dia2.setSelectedIndex(0);
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
            double Q2A = 16;
            double DIV2A = Double.parseDouble(sueldo.getText());
            double total = DIV2A / Q2A;
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
            Dia2.setSelectedIndex(0);
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
            double Q1S = 15;
            double DIV1S = Double.parseDouble(sueldo.getText());
            double total = DIV1S / Q1S;
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
            Dia2.setSelectedIndex(0);
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
            double Q2S = 15;
            double DIV1S = Double.parseDouble(sueldo.getText());
            double total = DIV1S / Q2S;
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
            Dia2.setSelectedIndex(0);
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
            double Q1O = 15;
            double DIV1O = Double.parseDouble(sueldo.getText());
            double total = DIV1O / Q1O;
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
            Dia2.setSelectedIndex(0);
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
            double Q2O = 16;
            double DIV2Q = Double.parseDouble(sueldo.getText());
            double total = DIV2Q / Q2O;
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
            Dia2.setSelectedIndex(0);
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
            double Q1N = 15;
            double DIV1N = Double.parseDouble(sueldo.getText());
            double total = DIV1N / Q1N;
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
            Dia2.setSelectedIndex(0);
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
            double Q2N = 15;
            double DIV2N = Double.parseDouble(sueldo.getText());
            double total = DIV2N / Q2N;
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
            Dia2.setSelectedIndex(0);
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
            double Q1D = 15;
            double DIV1D = Double.parseDouble(sueldo.getText());
            double total = DIV1D / Q1D;
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
            Dia2.setSelectedIndex(0);
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
            double Q2D = 16;
            double DIV2D = Double.parseDouble(sueldo.getText());
            double total = DIV2D / Q2D;
            pd.setText("" + total + "");
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

    private void BampagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BampagKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_BampagKeyReleased

    private void BAppagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppagKeyReleased

        FunMD();
        sumaDep();
    }//GEN-LAST:event_BAppagKeyReleased

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

    private void FiltroQPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQPItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQPItemStateChanged

    private void filtroNDFPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFPKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFPKeyReleased

    private void FiltroServPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServPItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServPItemStateChanged

    private void FiltroSZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZPItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP.setModel(modelServicio);
        }
        FunMD();
    }//GEN-LAST:event_FiltroSZPItemStateChanged

    private void CS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS3ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS3ActionPerformed

    private void buspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buspKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_buspKeyReleased

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

    private void AdNKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AdNKeyReleased
        desv();
        deposito();
    }//GEN-LAST:event_AdNKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DAB.clearSelection();
        NQprenom.setText("0");
        AdN.setText("0");
        QAcdanom.setText("0");
        NODTnom.setText("0");
        NCDANom.setText("0");
        NCDANom.setText("0");
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
        Dia2.setSelectedIndex(0);
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void busp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp1KeyReleased

    private void CS15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS15ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag1KeyReleased

    private void Bampag1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag1KeyReleased

    private void busp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp2KeyReleased

    private void CS16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS16ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag2KeyReleased

    private void Bampag2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag2KeyReleased

    private void busp3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp3KeyReleased

    private void CS17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS17ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag3KeyReleased

    private void Bampag3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag3KeyReleased

    private void busp4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp4KeyReleased

    private void CS18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS18ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag4KeyReleased

    private void Bampag4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag4KeyReleased

    private void busp5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp5KeyReleased

    private void CS19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS19ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag5KeyReleased

    private void Bampag5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag5KeyReleased

    private void busp6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp6KeyReleased

    private void CS20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS20ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag6KeyReleased

    private void Bampag6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag6KeyReleased

    private void busp7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp7KeyReleased

    private void CS21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS21ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
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
        sumaDep();
    }//GEN-LAST:event_BAppag7KeyReleased

    private void Bampag7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag7KeyReleased

    private void busp8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_busp8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_busp8KeyReleased

    private void CS22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS22ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_CS22ActionPerformed

    private void FiltroSZP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZP8ItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP8.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP8.setModel(modelServicio);
        }
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSZP8ItemStateChanged

    private void FiltroServP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServP8ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroServP8ItemStateChanged

    private void filtroNDFP8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFP8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_filtroNDFP8KeyReleased

    private void FiltroQP8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQP8ItemStateChanged
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_BAppag8KeyReleased

    private void Bampag8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Bampag8KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Bampag8KeyReleased

    private void FAmT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT7KeyReleased

    private void FApT7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT7KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT7KeyReleased

    private void FiltroNDF7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF7KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio7ItemStateChanged

    private void FiltroQuincenanomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina7ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina7ItemStateChanged

    private void FiltroSnomina7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina7ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina7ItemStateChanged

    private void CS14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS14ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS14ActionPerformed

    private void Eliminar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar7ActionPerformed
        try {

            int filaseleccionada = Tnom7.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom7.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Eliminar7ActionPerformed

    private void Nominab7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab7KeyReleased
        FunMD();
        sumaDep();
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
            ban.setText(String.valueOf(Tnom7.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom7.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom7.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom7.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom7.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom7.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom7.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom7.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom7.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom7MouseClicked

    private void FAmT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT6KeyReleased

    private void FApT6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT6KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT6KeyReleased

    private void FiltroNDF6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF6KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio6ItemStateChanged

    private void FiltroQuincenanomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina6ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina6ItemStateChanged

    private void FiltroSnomina6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina6ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina6ItemStateChanged

    private void Eliminar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar6ActionPerformed
        try {

            int filaseleccionada = Tnom6.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom6.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Eliminar6ActionPerformed

    private void Nominab6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab6KeyReleased
        FunMD();
        sumaDep();
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
            ban.setText(String.valueOf(Tnom6.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom6.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom6.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom6.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom6.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom6.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom6.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom6.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom6.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom6MouseClicked

    private void FAmT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT5KeyReleased

    private void FApT5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT5KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT5KeyReleased

    private void FiltroNDF5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF5KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio5ItemStateChanged

    private void FiltroQuincenanomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina5ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina5ItemStateChanged

    private void FiltroSnomina5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina5ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina5ItemStateChanged

    private void CS12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS12ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS12ActionPerformed

    private void Eliminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar5ActionPerformed
        try {

            int filaseleccionada = Tnom5.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom5.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Eliminar5ActionPerformed

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
            ban.setText(String.valueOf(Tnom5.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom5.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom5.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom5.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom5.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom5.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom5.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom5.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom5.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom5MouseClicked

    private void FAmT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT4KeyReleased

    private void FApT4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT4KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT4KeyReleased

    private void FiltroNDF4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF4KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio4ItemStateChanged

    private void FiltroQuincenanomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina4ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina4ItemStateChanged

    private void FiltroSnomina4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina4ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina4ItemStateChanged

    private void CS11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS11ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS11ActionPerformed

    private void Eliminar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar4ActionPerformed
        try {

            int filaseleccionada = Tnom4.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom4.getValueAt(filaseleccionada, 0);
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

    private void Nominab4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab4KeyReleased
        FunMD();
        sumaDep();
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
            ban.setText(String.valueOf(Tnom4.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom4.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom4.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom4.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom4.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom4.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom4.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom4.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom4.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom4MouseClicked

    private void FAmT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT3KeyReleased

    private void FApT3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT3KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT3KeyReleased

    private void FiltroNDF3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF3KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio3ItemStateChanged

    private void FiltroQuincenanomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina3ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina3ItemStateChanged

    private void FiltroSnomina3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina3ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina3ItemStateChanged

    private void CS10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS10ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS10ActionPerformed

    private void Eliminar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar3ActionPerformed
        try {

            int filaseleccionada = Tnom3.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom3.getValueAt(filaseleccionada, 0);
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

    private void Nominab3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab3KeyReleased
        FunMD();
        sumaDep();
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
            ban.setText(String.valueOf(Tnom3.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom3.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom3.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom3.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom3.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom3.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom3.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom3.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom3.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom3MouseClicked

    private void FAmT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT2KeyReleased

    private void FApT2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT2KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT2KeyReleased

    private void FiltroNDF2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF2KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio2ItemStateChanged

    private void FiltroQuincenanomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina2ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina2ItemStateChanged

    private void FiltroSnomina2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina2ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina2ItemStateChanged

    private void CS9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS9ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS9ActionPerformed

    private void Eliminar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar2ActionPerformed
        try {

            int filaseleccionada = Tnom2.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom2.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }
        FunMD();
        sumaDep();
    }//GEN-LAST:event_Eliminar2ActionPerformed

    private void Nominab2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab2KeyReleased
        FunMD();
        sumaDep();
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
            ban.setText(String.valueOf(Tnom2.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom2.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom2.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom2.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom2.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom2.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom2.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom2.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom2.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom2MouseClicked

    private void FAmT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmT1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmT1KeyReleased

    private void FApT1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApT1KeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApT1KeyReleased

    private void FiltroNDF1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDF1KeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FZservicio1ItemStateChanged

    private void FiltroQuincenanomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanomina1ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanomina1ItemStateChanged

    private void FiltroSnomina1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnomina1ItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnomina1ItemStateChanged

    private void CS8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS8ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS8ActionPerformed

    private void Eliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar1ActionPerformed
        try {

            int filaseleccionada = Tnom1.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom1.getValueAt(filaseleccionada, 0);
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

    private void Nominab1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nominab1KeyReleased
        FunMD();
        sumaDep();
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
            ban.setText(String.valueOf(Tnom1.getValueAt(fila, 5)));
            cta.setText(String.valueOf(Tnom1.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom1.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom1.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom1.getValueAt(fila, 9)));
            Bono1.setText(String.valueOf(Tnom1.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom1.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom1.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom1.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Tnom1MouseClicked

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FAmTKeyReleased

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FApTKeyReleased

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased
        FunMD();
        sumaDep();
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
        sumaDep();
    }//GEN-LAST:event_FiltroQuincenanominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged
        FunMD();
        sumaDep();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        try {

            int filaseleccionada = Tnom.getSelectedRow();
            String sql = "delete from `nomina.detallada." + Zon.getText() + "` where #lista=" + Tnom.getValueAt(filaseleccionada, 0);
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
            Bono1.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            Bono.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            String combo1 = model.getValueAt(fila, 12).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 13));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < Dia1.getItemCount(); i++) {
                if (Dia1.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Dia1.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Dia2.getItemCount(); i++) {
                if (Dia2.getItemAt(i).equalsIgnoreCase(combo3)) {
                    Dia2.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Dia3.getItemCount(); i++) {
                if (Dia3.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Dia3.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < Dia4.getItemCount(); i++) {
                if (Dia4.getItemAt(i).equalsIgnoreCase(combo5)) {
                    Dia4.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < Dia5.getItemCount(); i++) {
                if (Dia5.getItemAt(i).equalsIgnoreCase(combo6)) {
                    Dia5.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < Dia6.getItemCount(); i++) {
                if (Dia6.getItemAt(i).equalsIgnoreCase(combo7)) {
                    Dia6.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Dia7.getItemCount(); i++) {
                if (Dia7.getItemAt(i).equalsIgnoreCase(combo8)) {
                    Dia7.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < Dia8.getItemCount(); i++) {
                if (Dia8.getItemAt(i).equalsIgnoreCase(combo9)) {
                    Dia8.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Dia9.getItemCount(); i++) {
                if (Dia9.getItemAt(i).equalsIgnoreCase(combo10)) {
                    Dia9.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < Dia10.getItemCount(); i++) {
                if (Dia10.getItemAt(i).equalsIgnoreCase(combo11)) {
                    Dia10.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < Dia11.getItemCount(); i++) {
                if (Dia11.getItemAt(i).equalsIgnoreCase(combo12)) {
                    Dia11.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < Dia12.getItemCount(); i++) {
                if (Dia12.getItemAt(i).equalsIgnoreCase(combo13)) {
                    Dia12.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < Dia13.getItemCount(); i++) {
                if (Dia13.getItemAt(i).equalsIgnoreCase(combo14)) {
                    Dia13.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < Dia14.getItemCount(); i++) {
                if (Dia14.getItemAt(i).equalsIgnoreCase(combo15)) {
                    Dia14.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < Dia15.getItemCount(); i++) {
                if (Dia15.getItemAt(i).equalsIgnoreCase(combo16)) {
                    Dia15.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 29).toString();
            for (int i = 0; i < Dia16.getItemCount(); i++) {
                if (Dia16.getItemAt(i).equalsIgnoreCase(combo17)) {
                    Dia16.setSelectedIndex(i);
                }
            }

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
            obs.setText(String.valueOf(Tnom.getValueAt(fila, 74)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_NominaQ_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void ODTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ODTActionPerformed
        Admin_ODTQ_5 regr = new Admin_ODTQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ODTActionPerformed

    private void CDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDAActionPerformed
        Admin_CDAQ_5 regr = new Admin_CDAQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDAActionPerformed

    private void PRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESActionPerformed
        Admin_PresQ_5 regr = new Admin_PresQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PRESActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
        int FP = FiltrosP.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro Apellido P "
                    + BAppag.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro Apellido M "
                    + Bampag.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro Nombre(s) "
                    + busp.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total del servicio "
                    + FiltroServP.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total de la "
                    + FiltroQP.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago, getTitle() + " Foraneos acapulco", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum.getText())), true);
        }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void Imprimir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir1ActionPerformed
        int FP = FiltrosP1.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro Apellido P "
                    + BAppag1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro Apellido M "
                    + Bampag1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro Nombre(s) "
                    + busp1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total del servicio "
                    + FiltroServP1.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total de la "
                    + FiltroQP1.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago1, getTitle() + " Foraneos puebla", "Monto total con filtro # Lista "
                    + filtroNDFP1.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum1.getText())), true);
        }
    }//GEN-LAST:event_Imprimir1ActionPerformed

    private void Imprimir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir2ActionPerformed
        int FP = FiltrosP2.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro Apellido P "
                    + BAppag2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro Apellido M "
                    + Bampag2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro Nombre(s) "
                    + busp2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total del servicio "
                    + FiltroServP2.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total de la "
                    + FiltroQP2.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago2, getTitle() + " Foraneos toluca", "Monto total con filtro # Lista "
                    + filtroNDFP2.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum2.getText())), true);
        }
    }//GEN-LAST:event_Imprimir2ActionPerformed

    private void Imprimir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir3ActionPerformed
        int FP = FiltrosP3.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total con filtro Apellido P "
                    + BAppag3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total con filtro Apellido M "
                    + Bampag3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total con filtro Nombre(s) "
                    + busp3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total del servicio "
                    + FiltroServP3.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total de la "
                    + FiltroQP3.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago3, getTitle() + " Norte", "Monto total con filtro # Lista "
                    + filtroNDFP3.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum3.getText())), true);
        }
    }//GEN-LAST:event_Imprimir3ActionPerformed

    private void Imprimir4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir4ActionPerformed

        int FP = FiltrosP4.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total con filtro Apellido P "
                    + BAppag4.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total con filtro Apellido M "
                    + Bampag4.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total con filtro Nombre(s) "
                    + busp4.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total del servicio "
                    + FiltroServP4.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum4.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total de la "
                    + FiltroQP5.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago4, getTitle() + " Poniente", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
    }//GEN-LAST:event_Imprimir4ActionPerformed

    private void Imprimir5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir5ActionPerformed
        int FP = FiltrosP5.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total con filtro Apellido P "
                    + BAppag5.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total con filtro Apellido M "
                    + Bampag5.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total con filtro Nombre(s) "
                    + busp5.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total del servicio "
                    + FiltroServP5.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total de la "
                    + FiltroQP5.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago5, getTitle() + " Oficina", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum5.getText())), true);
        }
    }//GEN-LAST:event_Imprimir5ActionPerformed

    private void Imprimir6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir6ActionPerformed
        int FP = FiltrosP6.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total con filtro Apellido P "
                    + BAppag6.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total con filtro Apellido M "
                    + Bampag6.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total con filtro Nombre(s) "
                    + busp6.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total del servicio "
                    + FiltroServP6.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total de la "
                    + FiltroQP6.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago6, getTitle() + " Sur 1", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum6.getText())), true);
        }
    }//GEN-LAST:event_Imprimir6ActionPerformed

    private void Imprimir7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir7ActionPerformed
        int FP = FiltrosP7.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total con filtro Apellido P "
                    + BAppag7.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total con filtro Apellido M "
                    + Bampag7.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total con filtro Nombre(s) "
                    + busp7.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total del servicio "
                    + FiltroServP7.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total de la "
                    + FiltroQP7.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago7, getTitle() + " Sur 2", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum7.getText())), true);
        }
    }//GEN-LAST:event_Imprimir7ActionPerformed

    private void Imprimir8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Imprimir8ActionPerformed
        int FP = FiltrosP8.getSelectedIndex();
        DecimalFormat dimp = new DecimalFormat("#.00");
        if (FP == 0) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total: "
                    + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
        if (FP == 1) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total con filtro Apellido P "
                    + BAppag8.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
        if (FP == 2) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total con filtro Apellido M "
                    + Bampag8.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
        if (FP == 3) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total con filtro Nombre(s) "
                    + busp8.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
        if (FP == 4) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total del servicio "
                    + FiltroServP8.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
        if (FP == 5) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total de la "
                    + FiltroQP8.getSelectedItem().toString() + ": " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
        if (FP == 6) {
            Funimprimir(pago8, getTitle() + " Santander corporativo quincenal", "Monto total con filtro # Lista "
                    + filtroNDFP.getText() + ": " + dimp.format(Double.parseDouble(this.MTDsum8.getText())), true);
        }
    }//GEN-LAST:event_Imprimir8ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Admin_NominaQSiMSS_5 regr = new Admin_NominaQSiMSS_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Admin_PresS_5 regr = new Admin_PresS_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void CS13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS13ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS13ActionPerformed

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
    private javax.swing.JTextField AdN;
    private javax.swing.JMenuItem Administradores;
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
    private javax.swing.JButton CS;
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
    private javax.swing.JButton CS22;
    private javax.swing.JButton CS3;
    private javax.swing.JButton CS8;
    private javax.swing.JButton CS9;
    private javax.swing.JTextField Chaleco;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
    private javax.swing.JLabel DD;
    private javax.swing.JLabel DF;
    private javax.swing.JLabel DFT;
    private javax.swing.JTextField DI;
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
    private javax.swing.JLabel Ddv;
    private javax.swing.JComboBox<String> Dia1;
    private javax.swing.JComboBox<String> Dia10;
    private javax.swing.JComboBox<String> Dia11;
    private javax.swing.JComboBox<String> Dia12;
    private javax.swing.JComboBox<String> Dia13;
    private javax.swing.JComboBox<String> Dia14;
    private javax.swing.JComboBox<String> Dia15;
    private javax.swing.JComboBox<String> Dia16;
    private javax.swing.JComboBox<String> Dia2;
    private javax.swing.JComboBox<String> Dia3;
    private javax.swing.JComboBox<String> Dia4;
    private javax.swing.JComboBox<String> Dia5;
    private javax.swing.JComboBox<String> Dia6;
    private javax.swing.JComboBox<String> Dia7;
    private javax.swing.JComboBox<String> Dia8;
    private javax.swing.JComboBox<String> Dia9;
    private javax.swing.JLabel Dpi;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Eliminar1;
    private javax.swing.JButton Eliminar2;
    private javax.swing.JButton Eliminar3;
    private javax.swing.JButton Eliminar4;
    private javax.swing.JButton Eliminar5;
    private javax.swing.JButton Eliminar6;
    private javax.swing.JButton Eliminar7;
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
    private javax.swing.JComboBox<String> FFDPpag1;
    private javax.swing.JComboBox<String> FFDPpag2;
    private javax.swing.JComboBox<String> FFDPpag3;
    private javax.swing.JComboBox<String> FFDPpag4;
    private javax.swing.JComboBox<String> FFDPpag5;
    private javax.swing.JComboBox<String> FFDPpag6;
    private javax.swing.JComboBox<String> FFDPpag7;
    private javax.swing.JComboBox<String> FFDPpag8;
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
    private javax.swing.JLabel Filtro1;
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
    private javax.swing.JComboBox<String> FiltroQP8;
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
    private javax.swing.JMenuItem General;
    private javax.swing.JTextField Grua;
    private javax.swing.JButton Imprimir;
    private javax.swing.JButton Imprimir1;
    private javax.swing.JButton Imprimir2;
    private javax.swing.JButton Imprimir3;
    private javax.swing.JButton Imprimir4;
    private javax.swing.JButton Imprimir5;
    private javax.swing.JButton Imprimir6;
    private javax.swing.JButton Imprimir7;
    private javax.swing.JButton Imprimir8;
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
    private javax.swing.JLabel LabelBEP8;
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
    private javax.swing.JLabel LabelBQP8;
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
    private javax.swing.JLabel MTDsum;
    private javax.swing.JLabel MTDsum1;
    private javax.swing.JLabel MTDsum2;
    private javax.swing.JLabel MTDsum3;
    private javax.swing.JLabel MTDsum4;
    private javax.swing.JLabel MTDsum5;
    private javax.swing.JLabel MTDsum6;
    private javax.swing.JLabel MTDsum7;
    private javax.swing.JLabel MTDsum8;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JButton Modm;
    private javax.swing.JTextField NCDANom;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NEnom;
    private javax.swing.JTextField NODTnom;
    private javax.swing.JTextField NQODTnom;
    private javax.swing.JTextField NQprenom;
    private javax.swing.JScrollPane NomDetallada;
    private javax.swing.JScrollPane NomPagos;
    private javax.swing.JScrollPane Nomina;
    private javax.swing.JMenuItem Nomina1;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Nominab1;
    private javax.swing.JTextField Nominab2;
    private javax.swing.JTextField Nominab3;
    private javax.swing.JTextField Nominab4;
    private javax.swing.JTextField Nominab5;
    private javax.swing.JTextField Nominab6;
    private javax.swing.JTextField Nominab7;
    private javax.swing.JTextField NumPrenom;
    private javax.swing.JMenuItem ODT;
    private javax.swing.JTextField Odtp;
    private javax.swing.JLabel PCR;
    private javax.swing.JLabel PDDD;
    private javax.swing.JTextField PDDDDSGS;
    private javax.swing.JLabel PDDDV;
    private javax.swing.JLabel PDDF;
    private javax.swing.JLabel PDDFT;
    private javax.swing.JLabel PDDL;
    private javax.swing.JLabel PDDT;
    private javax.swing.JMenuItem PRES;
    private javax.swing.JTextField PagODTnom;
    private javax.swing.JTextField Pagadoprenom;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JTextField PenODTnom;
    private javax.swing.JTextField Pendienteprenom;
    private javax.swing.JTabbedPane PestanañasND;
    private javax.swing.JTabbedPane PestañasPagos;
    private javax.swing.JTabbedPane PestañasPrin;
    private javax.swing.JTextField Playera;
    private javax.swing.JTextField Presp;
    private javax.swing.JTextField QAcdanom;
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
    private javax.swing.JTextField ServN;
    private javax.swing.JTextField TACDANOM;
    private javax.swing.JScrollPane TDFA;
    private javax.swing.JScrollPane TDFA1;
    private javax.swing.JScrollPane TDFA2;
    private javax.swing.JScrollPane TDFA3;
    private javax.swing.JScrollPane TDFA4;
    private javax.swing.JScrollPane TDFA5;
    private javax.swing.JScrollPane TDFA6;
    private javax.swing.JScrollPane TDFA7;
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
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JMenuItem UsuariosRH;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private botones.BotonWeb botonWeb1;
    private botones.BotonWeb botonWeb10;
    private botones.BotonWeb botonWeb11;
    private botones.BotonWeb botonWeb12;
    private botones.BotonWeb botonWeb13;
    private botones.BotonWeb botonWeb14;
    private botones.BotonWeb botonWeb15;
    private botones.BotonWeb botonWeb16;
    private botones.BotonWeb botonWeb17;
    private botones.BotonWeb botonWeb18;
    private botones.BotonWeb botonWeb19;
    private botones.BotonWeb botonWeb2;
    private botones.BotonWeb botonWeb20;
    private botones.BotonWeb botonWeb21;
    private botones.BotonWeb botonWeb22;
    private botones.BotonWeb botonWeb23;
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
    private javax.swing.JTextField filtroNDFP1;
    private javax.swing.JTextField filtroNDFP2;
    private javax.swing.JTextField filtroNDFP3;
    private javax.swing.JTextField filtroNDFP4;
    private javax.swing.JTextField filtroNDFP5;
    private javax.swing.JTextField filtroNDFP6;
    private javax.swing.JTextField filtroNDFP7;
    private javax.swing.JTextField filtroNDFP8;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
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
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
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
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
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
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane k;
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
