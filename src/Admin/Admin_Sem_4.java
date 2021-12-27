package Admin;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author JDeat
 */
public class Admin_Sem_4 extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Sem_4
     */
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    public Admin_Sem_4() {
        initComponents();
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        Folio1.setVisible(false);
        NPadron1.setVisible(false);
        NPadron2.setVisible(false);
        NPadron3.setVisible(false);
        NPadron4.setVisible(false);
        NPadron5.setVisible(false);
        NPadron6.setVisible(false);
        NPadron7.setVisible(false);
        NPadron8.setVisible(false);
        NPadron9.setVisible(false);
        Fecha1.setVisible(false);
        Servicio1.setVisible(false);
        Importe1.setVisible(false);
        Folio2.setVisible(false);
        Fecha2.setVisible(false);
        Servicio2.setVisible(false);
        Importe2.setVisible(false);
        Folio3.setVisible(false);
        Fecha3.setVisible(false);
        Servicio3.setVisible(false);
        Importe3.setVisible(false);
        Mas1.setVisible(false);
        Mas2.setVisible(false);
        Menos.setVisible(false);
        Menos1.setVisible(false);
        Menos2.setVisible(false);
        Mas3.setVisible(false);
        Mas4.setVisible(false);
        Mas5.setVisible(false);
        Mas6.setVisible(false);
        Mas7.setVisible(false);
        Mas8.setVisible(false);
        Menos3.setVisible(false);
        Menos4.setVisible(false);
        Menos5.setVisible(false);
        Menos6.setVisible(false);
        Menos7.setVisible(false);
        Menos8.setVisible(false);
        Folio9.setVisible(false);
        Fecha9.setVisible(false);
        Servicio9.setVisible(false);
        Importe9.setVisible(false);
        Folio8.setVisible(false);
        Fecha8.setVisible(false);
        Servicio8.setVisible(false);
        Importe8.setVisible(false);
        Folio7.setVisible(false);
        Fecha7.setVisible(false);
        Servicio7.setVisible(false);
        Importe7.setVisible(false);
        Folio6.setVisible(false);
        Fecha6.setVisible(false);
        Servicio6.setVisible(false);
        Importe6.setVisible(false);
        Folio5.setVisible(false);
        Fecha5.setVisible(false);
        Servicio5.setVisible(false);
        Importe5.setVisible(false);
        Folio4.setVisible(false);
        Fecha4.setVisible(false);
        Servicio4.setVisible(false);
        Importe4.setVisible(false);
        Menos9.setVisible(false);
        Menos10.setVisible(false);
        Menos11.setVisible(false);
        Menos12.setVisible(false);
        Menos13.setVisible(false);
        Menos14.setVisible(false);
        Menos15.setVisible(false);
        Menos16.setVisible(false);
        Menos17.setVisible(false);
        Mas10.setVisible(false);
        Mas11.setVisible(false);
        Mas12.setVisible(false);
        Mas13.setVisible(false);
        Mas14.setVisible(false);
        Mas15.setVisible(false);
        Mas16.setVisible(false);
        Mas17.setVisible(false);
        Folio11.setVisible(false);
        Fecha11.setVisible(false);
        Servicio11.setVisible(false);
        Importe11.setVisible(false);
        Folio12.setVisible(false);
        Fecha12.setVisible(false);
        Servicio12.setVisible(false);
        Importe12.setVisible(false);
        Folio13.setVisible(false);
        Fecha13.setVisible(false);
        Servicio13.setVisible(false);
        Importe13.setVisible(false);
        Folio19.setVisible(false);
        Fecha19.setVisible(false);
        Servicio19.setVisible(false);
        Importe19.setVisible(false);
        Folio18.setVisible(false);
        Fecha18.setVisible(false);
        Servicio18.setVisible(false);
        Importe18.setVisible(false);
        Folio17.setVisible(false);
        Fecha17.setVisible(false);
        Servicio17.setVisible(false);
        Importe17.setVisible(false);
        Folio16.setVisible(false);
        Fecha16.setVisible(false);
        Servicio16.setVisible(false);
        Importe16.setVisible(false);
        Folio15.setVisible(false);
        Fecha15.setVisible(false);
        Servicio15.setVisible(false);
        Importe15.setVisible(false);
        Folio14.setVisible(false);
        Fecha14.setVisible(false);
        Servicio14.setVisible(false);
        Importe14.setVisible(false);
        Menos18.setVisible(false);
        Menos19.setVisible(false);
        Menos20.setVisible(false);
        Menos21.setVisible(false);
        Menos22.setVisible(false);
        Menos23.setVisible(false);
        Menos24.setVisible(false);
        Menos25.setVisible(false);
        Menos26.setVisible(false);
        Mas19.setVisible(false);
        Mas20.setVisible(false);
        Mas21.setVisible(false);
        Mas22.setVisible(false);
        Mas23.setVisible(false);
        Mas24.setVisible(false);
        Mas25.setVisible(false);
        Mas26.setVisible(false);
        Folio21.setVisible(false);
        Fecha21.setVisible(false);
        Servicio21.setVisible(false);
        Importe21.setVisible(false);
        Folio22.setVisible(false);
        Fecha22.setVisible(false);
        Servicio22.setVisible(false);
        Importe22.setVisible(false);
        Folio23.setVisible(false);
        Fecha23.setVisible(false);
        Servicio23.setVisible(false);
        Importe23.setVisible(false);
        Folio29.setVisible(false);
        Fecha29.setVisible(false);
        Servicio29.setVisible(false);
        Importe29.setVisible(false);
        Folio28.setVisible(false);
        Fecha28.setVisible(false);
        Servicio28.setVisible(false);
        Importe28.setVisible(false);
        Folio27.setVisible(false);
        Fecha27.setVisible(false);
        Servicio27.setVisible(false);
        Importe27.setVisible(false);
        Folio26.setVisible(false);
        Fecha26.setVisible(false);
        Servicio26.setVisible(false);
        Importe26.setVisible(false);
        Folio25.setVisible(false);
        Fecha25.setVisible(false);
        Servicio25.setVisible(false);
        Importe25.setVisible(false);
        Folio24.setVisible(false);
        Fecha24.setVisible(false);
        Servicio24.setVisible(false);
        Importe24.setVisible(false);
        LDA1.setVisible(false);
        LDA2.setVisible(false);
        LDA3.setVisible(false);
        LDA4.setVisible(false);
        LDA5.setVisible(false);
        LDA6.setVisible(false);
        LDA7.setVisible(false);
        LDA8.setVisible(false);
        LDA9.setVisible(false);
        // </editor-fold>                        

    }

    public void Imtotal() {
        // <editor-fold defaultstate="collapsed" desc="Suma Servicios">
        double ImServ1 = Double.parseDouble(Importe.getText());
        double ImServ2 = Double.parseDouble(Importe1.getText());
        double ImServ3 = Double.parseDouble(Importe2.getText());
        double ImServ4 = Double.parseDouble(Importe3.getText());
        double ImServ5 = Double.parseDouble(Importe4.getText());
        double ImServ6 = Double.parseDouble(Importe5.getText());
        double ImServ7 = Double.parseDouble(Importe6.getText());
        double ImServ8 = Double.parseDouble(Importe7.getText());
        double ImServ9 = Double.parseDouble(Importe8.getText());
        double ImServ10 = Double.parseDouble(Importe9.getText());

        double TotalServ = ImServ1 + ImServ2 + ImServ3 + ImServ4 + ImServ5 + ImServ6 + ImServ7
                + ImServ8 + ImServ9 + ImServ10;
        this.TDIDS.setText("" + TotalServ + "");
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Suma Pensiones">
        double ImPen1 = Double.parseDouble(Importe10.getText());
        double ImPen2 = Double.parseDouble(Importe11.getText());
        double ImPen3 = Double.parseDouble(Importe12.getText());
        double ImPen4 = Double.parseDouble(Importe13.getText());
        double ImPen5 = Double.parseDouble(Importe14.getText());
        double ImPen6 = Double.parseDouble(Importe15.getText());
        double ImPen7 = Double.parseDouble(Importe16.getText());
        double ImPen8 = Double.parseDouble(Importe17.getText());
        double ImPen9 = Double.parseDouble(Importe18.getText());
        double ImPen10 = Double.parseDouble(Importe19.getText());

        double TotalPen = ImPen1 + ImPen2 + ImPen3 + ImPen4 + ImPen5 + ImPen6 + ImPen7 + ImPen8
                + ImPen9 + ImPen10;
        TDIDP.setText("" + TotalPen);
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Suma Gastos">
        double Gasto1 = Double.parseDouble(Importe20.getText());
        double Gasto2 = Double.parseDouble(Importe21.getText());
        double Gasto3 = Double.parseDouble(Importe22.getText());
        double Gasto4 = Double.parseDouble(Importe23.getText());
        double Gasto5 = Double.parseDouble(Importe24.getText());
        double Gasto6 = Double.parseDouble(Importe25.getText());
        double Gasto7 = Double.parseDouble(Importe26.getText());
        double Gasto8 = Double.parseDouble(Importe27.getText());
        double Gasto9 = Double.parseDouble(Importe28.getText());
        double Gasto10 = Double.parseDouble(Importe29.getText());

        double TotalGas = Gasto1 + Gasto2 + Gasto3 + Gasto4 + Gasto5 + Gasto6 + Gasto7 + Gasto8
                + Gasto9 + Gasto10;
        TDG.setText("" + TotalGas);
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Total SYP">
        double TDSYP1 = Double.parseDouble(TDIDS.getText());
        double TDSYP2 = Double.parseDouble(TDIDP.getText());

        double TotalSYP = TDSYP1 + TDSYP2;
        TDSYP.setText("" + TotalSYP);
        //</editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Diferencia TG y Gastos">
        double DIF1 = Double.parseDouble(TDSYP.getText());
        double DIF2 = Double.parseDouble(TDG.getText());

        double TotalDif = DIF1 - DIF2;
        DE.setText("" + TotalDif);
        //</editor-fold>

    }

    public void AddEst() {
        if (Mas.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas1.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas2.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas3.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal:  " + error_semanal);

            }
        }
        if (Mas4.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());
                pst.setInt(21, Integer.parseInt(Folio4.getText()));
                pst.setString(22, DateFormat.getDateInstance().format(Fecha4.getDate()));
                pst.setString(23, Servicio4.getSelectedItem().toString());
                pst.setString(24, Importe4.getText());
                pst.setString(25, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas5.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());
                pst.setInt(21, Integer.parseInt(Folio4.getText()));
                pst.setString(22, DateFormat.getDateInstance().format(Fecha4.getDate()));
                pst.setString(23, Servicio4.getSelectedItem().toString());
                pst.setString(24, Importe4.getText());
                pst.setString(25, TDIDS.getText());
                pst.setInt(26, Integer.parseInt(Folio5.getText()));
                pst.setString(27, DateFormat.getDateInstance().format(Fecha5.getDate()));
                pst.setString(28, Servicio5.getSelectedItem().toString());
                pst.setString(29, Importe5.getText());
                pst.setString(30, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas6.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());
                pst.setInt(21, Integer.parseInt(Folio4.getText()));
                pst.setString(22, DateFormat.getDateInstance().format(Fecha4.getDate()));
                pst.setString(23, Servicio4.getSelectedItem().toString());
                pst.setString(24, Importe4.getText());
                pst.setString(25, TDIDS.getText());
                pst.setInt(26, Integer.parseInt(Folio5.getText()));
                pst.setString(27, DateFormat.getDateInstance().format(Fecha5.getDate()));
                pst.setString(28, Servicio5.getSelectedItem().toString());
                pst.setString(29, Importe5.getText());
                pst.setString(30, TDIDS.getText());
                pst.setInt(31, Integer.parseInt(Folio6.getText()));
                pst.setString(32, DateFormat.getDateInstance().format(Fecha6.getDate()));
                pst.setString(33, Servicio6.getSelectedItem().toString());
                pst.setString(34, Importe6.getText());
                pst.setString(35, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas7.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());
                pst.setInt(21, Integer.parseInt(Folio4.getText()));
                pst.setString(22, DateFormat.getDateInstance().format(Fecha4.getDate()));
                pst.setString(23, Servicio4.getSelectedItem().toString());
                pst.setString(24, Importe4.getText());
                pst.setString(25, TDIDS.getText());
                pst.setInt(26, Integer.parseInt(Folio5.getText()));
                pst.setString(27, DateFormat.getDateInstance().format(Fecha5.getDate()));
                pst.setString(28, Servicio5.getSelectedItem().toString());
                pst.setString(29, Importe5.getText());
                pst.setString(30, TDIDS.getText());
                pst.setInt(31, Integer.parseInt(Folio6.getText()));
                pst.setString(32, DateFormat.getDateInstance().format(Fecha6.getDate()));
                pst.setString(33, Servicio6.getSelectedItem().toString());
                pst.setString(34, Importe6.getText());
                pst.setString(35, TDIDS.getText());
                pst.setInt(36, Integer.parseInt(Folio7.getText()));
                pst.setString(37, DateFormat.getDateInstance().format(Fecha7.getDate()));
                pst.setString(38, Servicio7.getSelectedItem().toString());
                pst.setString(39, Importe7.getText());
                pst.setString(40, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Mas8.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());
                pst.setInt(21, Integer.parseInt(Folio4.getText()));
                pst.setString(22, DateFormat.getDateInstance().format(Fecha4.getDate()));
                pst.setString(23, Servicio4.getSelectedItem().toString());
                pst.setString(24, Importe4.getText());
                pst.setString(25, TDIDS.getText());
                pst.setInt(26, Integer.parseInt(Folio5.getText()));
                pst.setString(27, DateFormat.getDateInstance().format(Fecha5.getDate()));
                pst.setString(28, Servicio5.getSelectedItem().toString());
                pst.setString(29, Importe5.getText());
                pst.setString(30, TDIDS.getText());
                pst.setInt(31, Integer.parseInt(Folio6.getText()));
                pst.setString(32, DateFormat.getDateInstance().format(Fecha6.getDate()));
                pst.setString(33, Servicio6.getSelectedItem().toString());
                pst.setString(34, Importe6.getText());
                pst.setString(35, TDIDS.getText());
                pst.setInt(36, Integer.parseInt(Folio7.getText()));
                pst.setString(37, DateFormat.getDateInstance().format(Fecha7.getDate()));
                pst.setString(38, Servicio7.getSelectedItem().toString());
                pst.setString(39, Importe7.getText());
                pst.setString(40, TDIDS.getText());
                pst.setInt(41, Integer.parseInt(Folio8.getText()));
                pst.setString(42, DateFormat.getDateInstance().format(Fecha8.getDate()));
                pst.setString(43, Servicio8.getSelectedItem().toString());
                pst.setString(44, Importe8.getText());
                pst.setString(45, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
        if (Menos8.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`, `Total`) VALUES (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?), (?, ?, ?, ?, ?)"
                    + ", (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, DateFormat.getDateInstance().format(Fecha.getDate()));
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setString(5, TDIDS.getText());
                pst.setInt(6, Integer.parseInt(Folio1.getText()));
                pst.setString(7, DateFormat.getDateInstance().format(Fecha1.getDate()));
                pst.setString(8, Servicio1.getSelectedItem().toString());
                pst.setString(9, Importe1.getText());
                pst.setString(10, TDIDS.getText());
                pst.setInt(11, Integer.parseInt(Folio.getText()));
                pst.setString(12, DateFormat.getDateInstance().format(Fecha2.getDate()));
                pst.setString(13, Servicio2.getSelectedItem().toString());
                pst.setString(14, Importe2.getText());
                pst.setString(15, TDIDS.getText());
                pst.setInt(16, Integer.parseInt(Folio3.getText()));
                pst.setString(17, DateFormat.getDateInstance().format(Fecha3.getDate()));
                pst.setString(18, Servicio3.getSelectedItem().toString());
                pst.setString(19, Importe3.getText());
                pst.setString(20, TDIDS.getText());
                pst.setInt(21, Integer.parseInt(Folio4.getText()));
                pst.setString(22, DateFormat.getDateInstance().format(Fecha4.getDate()));
                pst.setString(23, Servicio4.getSelectedItem().toString());
                pst.setString(24, Importe4.getText());
                pst.setString(25, TDIDS.getText());
                pst.setInt(26, Integer.parseInt(Folio5.getText()));
                pst.setString(27, DateFormat.getDateInstance().format(Fecha5.getDate()));
                pst.setString(28, Servicio5.getSelectedItem().toString());
                pst.setString(29, Importe5.getText());
                pst.setString(30, TDIDS.getText());
                pst.setInt(31, Integer.parseInt(Folio6.getText()));
                pst.setString(32, DateFormat.getDateInstance().format(Fecha6.getDate()));
                pst.setString(33, Servicio6.getSelectedItem().toString());
                pst.setString(34, Importe6.getText());
                pst.setString(35, TDIDS.getText());
                pst.setInt(36, Integer.parseInt(Folio7.getText()));
                pst.setString(37, DateFormat.getDateInstance().format(Fecha7.getDate()));
                pst.setString(38, Servicio7.getSelectedItem().toString());
                pst.setString(39, Importe7.getText());
                pst.setString(40, TDIDS.getText());
                pst.setInt(41, Integer.parseInt(Folio8.getText()));
                pst.setString(42, DateFormat.getDateInstance().format(Fecha8.getDate()));
                pst.setString(43, Servicio8.getSelectedItem().toString());
                pst.setString(44, Importe8.getText());
                pst.setString(45, TDIDS.getText());
                pst.setInt(46, Integer.parseInt(Folio9.getText()));
                pst.setString(47, DateFormat.getDateInstance().format(Fecha9.getDate()));
                pst.setString(48, Servicio9.getSelectedItem().toString());
                pst.setString(49, Importe9.getText());
                pst.setString(50, TDIDS.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "Error al agregar reporte semanal: " + error_semanal);

            }
        }
    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        Importe = new javax.swing.JTextField();
        Servicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TDIDS = new javax.swing.JLabel();
        Folio1 = new javax.swing.JTextField();
        Folio2 = new javax.swing.JTextField();
        Folio3 = new javax.swing.JTextField();
        Folio4 = new javax.swing.JTextField();
        Folio5 = new javax.swing.JTextField();
        Folio6 = new javax.swing.JTextField();
        Folio7 = new javax.swing.JTextField();
        Folio8 = new javax.swing.JTextField();
        Folio9 = new javax.swing.JTextField();
        Servicio1 = new javax.swing.JComboBox<>();
        Servicio2 = new javax.swing.JComboBox<>();
        Servicio3 = new javax.swing.JComboBox<>();
        Servicio4 = new javax.swing.JComboBox<>();
        Servicio5 = new javax.swing.JComboBox<>();
        Servicio6 = new javax.swing.JComboBox<>();
        Servicio7 = new javax.swing.JComboBox<>();
        Servicio8 = new javax.swing.JComboBox<>();
        Servicio9 = new javax.swing.JComboBox<>();
        Importe1 = new javax.swing.JTextField();
        Importe2 = new javax.swing.JTextField();
        Importe3 = new javax.swing.JTextField();
        Importe4 = new javax.swing.JTextField();
        Importe5 = new javax.swing.JTextField();
        Importe6 = new javax.swing.JTextField();
        Importe7 = new javax.swing.JTextField();
        Importe8 = new javax.swing.JTextField();
        Importe9 = new javax.swing.JTextField();
        Mas = new javax.swing.JButton();
        Menos2 = new javax.swing.JButton();
        Menos1 = new javax.swing.JButton();
        Mas1 = new javax.swing.JButton();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        Fecha3 = new com.toedter.calendar.JDateChooser();
        Fecha4 = new com.toedter.calendar.JDateChooser();
        Fecha5 = new com.toedter.calendar.JDateChooser();
        Fecha6 = new com.toedter.calendar.JDateChooser();
        Fecha7 = new com.toedter.calendar.JDateChooser();
        Fecha8 = new com.toedter.calendar.JDateChooser();
        Fecha9 = new com.toedter.calendar.JDateChooser();
        Menos = new javax.swing.JButton();
        Mas2 = new javax.swing.JButton();
        Mas3 = new javax.swing.JButton();
        Menos3 = new javax.swing.JButton();
        Menos4 = new javax.swing.JButton();
        Mas4 = new javax.swing.JButton();
        Mas5 = new javax.swing.JButton();
        Menos6 = new javax.swing.JButton();
        Mas6 = new javax.swing.JButton();
        Menos7 = new javax.swing.JButton();
        Menos5 = new javax.swing.JButton();
        Mas7 = new javax.swing.JButton();
        Menos8 = new javax.swing.JButton();
        Mas8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Panel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        Fecha10 = new com.toedter.calendar.JDateChooser();
        Importe10 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Folio10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        TDIDP = new javax.swing.JLabel();
        Mas9 = new javax.swing.JButton();
        Menos11 = new javax.swing.JButton();
        Menos10 = new javax.swing.JButton();
        Mas10 = new javax.swing.JButton();
        Menos9 = new javax.swing.JButton();
        Mas11 = new javax.swing.JButton();
        Mas12 = new javax.swing.JButton();
        Menos12 = new javax.swing.JButton();
        Menos13 = new javax.swing.JButton();
        Mas13 = new javax.swing.JButton();
        Mas14 = new javax.swing.JButton();
        Menos15 = new javax.swing.JButton();
        Mas15 = new javax.swing.JButton();
        Menos16 = new javax.swing.JButton();
        Menos14 = new javax.swing.JButton();
        Mas16 = new javax.swing.JButton();
        Menos17 = new javax.swing.JButton();
        Mas17 = new javax.swing.JButton();
        Servicio10 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        Folio11 = new javax.swing.JTextField();
        Folio12 = new javax.swing.JTextField();
        Folio13 = new javax.swing.JTextField();
        Folio14 = new javax.swing.JTextField();
        Folio15 = new javax.swing.JTextField();
        Folio16 = new javax.swing.JTextField();
        Folio17 = new javax.swing.JTextField();
        Folio18 = new javax.swing.JTextField();
        Folio19 = new javax.swing.JTextField();
        Servicio11 = new javax.swing.JTextField();
        Servicio12 = new javax.swing.JTextField();
        Servicio13 = new javax.swing.JTextField();
        Servicio14 = new javax.swing.JTextField();
        Servicio15 = new javax.swing.JTextField();
        Servicio16 = new javax.swing.JTextField();
        Servicio17 = new javax.swing.JTextField();
        Servicio18 = new javax.swing.JTextField();
        Servicio19 = new javax.swing.JTextField();
        Fecha11 = new com.toedter.calendar.JDateChooser();
        Fecha12 = new com.toedter.calendar.JDateChooser();
        Fecha13 = new com.toedter.calendar.JDateChooser();
        Fecha14 = new com.toedter.calendar.JDateChooser();
        Fecha15 = new com.toedter.calendar.JDateChooser();
        Fecha16 = new com.toedter.calendar.JDateChooser();
        Fecha17 = new com.toedter.calendar.JDateChooser();
        Fecha18 = new com.toedter.calendar.JDateChooser();
        Fecha19 = new com.toedter.calendar.JDateChooser();
        Importe11 = new javax.swing.JTextField();
        Importe12 = new javax.swing.JTextField();
        Importe13 = new javax.swing.JTextField();
        Importe14 = new javax.swing.JTextField();
        Importe15 = new javax.swing.JTextField();
        Importe16 = new javax.swing.JTextField();
        Importe17 = new javax.swing.JTextField();
        Importe18 = new javax.swing.JTextField();
        Importe19 = new javax.swing.JTextField();
        NPadron1 = new javax.swing.JTextField();
        NPadron2 = new javax.swing.JTextField();
        NPadron3 = new javax.swing.JTextField();
        NPadron4 = new javax.swing.JTextField();
        NPadron5 = new javax.swing.JTextField();
        NPadron6 = new javax.swing.JTextField();
        NPadron7 = new javax.swing.JTextField();
        NPadron8 = new javax.swing.JTextField();
        NPadron9 = new javax.swing.JTextField();
        NPadron = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        Fecha30 = new com.toedter.calendar.JDateChooser();
        Importe20 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        Folio20 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Servicio20 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Folio21 = new javax.swing.JTextField();
        Folio22 = new javax.swing.JTextField();
        Folio23 = new javax.swing.JTextField();
        Folio24 = new javax.swing.JTextField();
        Folio25 = new javax.swing.JTextField();
        Folio26 = new javax.swing.JTextField();
        Folio27 = new javax.swing.JTextField();
        Folio28 = new javax.swing.JTextField();
        Folio29 = new javax.swing.JTextField();
        Servicio21 = new javax.swing.JTextField();
        Servicio22 = new javax.swing.JTextField();
        Servicio23 = new javax.swing.JTextField();
        Servicio24 = new javax.swing.JTextField();
        Servicio25 = new javax.swing.JTextField();
        Servicio26 = new javax.swing.JTextField();
        Servicio27 = new javax.swing.JTextField();
        Servicio28 = new javax.swing.JTextField();
        Servicio29 = new javax.swing.JTextField();
        Fecha21 = new com.toedter.calendar.JDateChooser();
        Fecha22 = new com.toedter.calendar.JDateChooser();
        Fecha23 = new com.toedter.calendar.JDateChooser();
        Fecha24 = new com.toedter.calendar.JDateChooser();
        Fecha25 = new com.toedter.calendar.JDateChooser();
        Fecha26 = new com.toedter.calendar.JDateChooser();
        Fecha27 = new com.toedter.calendar.JDateChooser();
        Fecha28 = new com.toedter.calendar.JDateChooser();
        Fecha29 = new com.toedter.calendar.JDateChooser();
        Importe21 = new javax.swing.JTextField();
        Importe22 = new javax.swing.JTextField();
        Importe23 = new javax.swing.JTextField();
        Importe24 = new javax.swing.JTextField();
        Importe25 = new javax.swing.JTextField();
        Importe26 = new javax.swing.JTextField();
        Importe27 = new javax.swing.JTextField();
        Importe28 = new javax.swing.JTextField();
        Importe29 = new javax.swing.JTextField();
        LDA6 = new javax.swing.JTextField();
        LDA7 = new javax.swing.JTextField();
        LDA8 = new javax.swing.JTextField();
        LDA9 = new javax.swing.JTextField();
        LDA1 = new javax.swing.JTextField();
        LDA2 = new javax.swing.JTextField();
        LDA3 = new javax.swing.JTextField();
        LDA4 = new javax.swing.JTextField();
        LDA5 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LDA = new javax.swing.JTextField();
        Menos18 = new javax.swing.JButton();
        Mas18 = new javax.swing.JButton();
        Mas19 = new javax.swing.JButton();
        Menos19 = new javax.swing.JButton();
        Menos20 = new javax.swing.JButton();
        Mas20 = new javax.swing.JButton();
        Mas21 = new javax.swing.JButton();
        Menos21 = new javax.swing.JButton();
        Mas22 = new javax.swing.JButton();
        Menos22 = new javax.swing.JButton();
        Menos23 = new javax.swing.JButton();
        Mas23 = new javax.swing.JButton();
        Menos24 = new javax.swing.JButton();
        Mas24 = new javax.swing.JButton();
        Mas25 = new javax.swing.JButton();
        Menos25 = new javax.swing.JButton();
        Menos26 = new javax.swing.JButton();
        Mas26 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TDG = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TDSYP = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DE = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TDG1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Folio30 = new javax.swing.JTextField();
        ObsV = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        Folio31 = new javax.swing.JTextField();
        Folio32 = new javax.swing.JTextField();
        Folio33 = new javax.swing.JTextField();
        Folio34 = new javax.swing.JTextField();
        Folio35 = new javax.swing.JTextField();
        Folio36 = new javax.swing.JTextField();
        Folio37 = new javax.swing.JTextField();
        Folio38 = new javax.swing.JTextField();
        Folio39 = new javax.swing.JTextField();
        ObsV1 = new javax.swing.JTextField();
        ObsV2 = new javax.swing.JTextField();
        ObsV3 = new javax.swing.JTextField();
        ObsV4 = new javax.swing.JTextField();
        ObsV5 = new javax.swing.JTextField();
        ObsV6 = new javax.swing.JTextField();
        ObsV7 = new javax.swing.JTextField();
        ObsV8 = new javax.swing.JTextField();
        ObsV9 = new javax.swing.JTextField();
        Fecha31 = new com.toedter.calendar.JDateChooser();
        Fecha32 = new com.toedter.calendar.JDateChooser();
        Fecha33 = new com.toedter.calendar.JDateChooser();
        Fecha34 = new com.toedter.calendar.JDateChooser();
        Fecha35 = new com.toedter.calendar.JDateChooser();
        Fecha36 = new com.toedter.calendar.JDateChooser();
        Fecha37 = new com.toedter.calendar.JDateChooser();
        Fecha38 = new com.toedter.calendar.JDateChooser();
        Fecha39 = new com.toedter.calendar.JDateChooser();
        Importe30 = new javax.swing.JTextField();
        Importe31 = new javax.swing.JTextField();
        Importe32 = new javax.swing.JTextField();
        Importe33 = new javax.swing.JTextField();
        Importe34 = new javax.swing.JTextField();
        Importe35 = new javax.swing.JTextField();
        Importe36 = new javax.swing.JTextField();
        Importe37 = new javax.swing.JTextField();
        Importe38 = new javax.swing.JTextField();
        Fecha40 = new com.toedter.calendar.JDateChooser();
        Importe39 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        Menos27 = new javax.swing.JButton();
        Mas27 = new javax.swing.JButton();
        Menos28 = new javax.swing.JButton();
        Mas28 = new javax.swing.JButton();
        Mas29 = new javax.swing.JButton();
        Menos29 = new javax.swing.JButton();
        Menos30 = new javax.swing.JButton();
        Mas30 = new javax.swing.JButton();
        Menos31 = new javax.swing.JButton();
        Menos32 = new javax.swing.JButton();
        Mas31 = new javax.swing.JButton();
        Menos33 = new javax.swing.JButton();
        Mas32 = new javax.swing.JButton();
        Mas33 = new javax.swing.JButton();
        Menos34 = new javax.swing.JButton();
        Menos35 = new javax.swing.JButton();
        Mas34 = new javax.swing.JButton();
        Mas35 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Servicios c/cobro ITURBIDE");

        Fecha.setDateFormatString("dd MMM yyyy ");

        Importe.setText("0");
        Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImporteKeyReleased(evt);
            }
        });

        Servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        jLabel1.setText("Folio");

        Folio.setText("0");

        jLabel2.setText("Fecha");

        jLabel3.setText("Servicio");

        jLabel4.setText("Importe");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Total de importe de servicios:");

        TDIDS.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TDIDS.setText("0");

        Folio1.setText("0");

        Folio2.setText("0");

        Folio3.setText("0");

        Folio4.setText("0");

        Folio5.setText("0");

        Folio6.setText("0");

        Folio7.setText("0");

        Folio8.setText("0");

        Folio9.setText("0");

        Servicio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Servicio9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Importe1.setText("0");
        Importe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe1KeyReleased(evt);
            }
        });

        Importe2.setText("0");
        Importe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe2KeyReleased(evt);
            }
        });

        Importe3.setText("0");
        Importe3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe3KeyReleased(evt);
            }
        });

        Importe4.setText("0");
        Importe4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe4KeyReleased(evt);
            }
        });

        Importe5.setText("0");
        Importe5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe5KeyReleased(evt);
            }
        });

        Importe6.setText("0");
        Importe6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe6KeyReleased(evt);
            }
        });

        Importe7.setText("0");
        Importe7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Importe7KeyPressed(evt);
            }
        });

        Importe8.setText("0");
        Importe8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe8KeyReleased(evt);
            }
        });

        Importe9.setText("0");
        Importe9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe9KeyReleased(evt);
            }
        });

        Mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasActionPerformed(evt);
            }
        });

        Menos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos2ActionPerformed(evt);
            }
        });

        Menos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos1ActionPerformed(evt);
            }
        });

        Mas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas1ActionPerformed(evt);
            }
        });

        Fecha1.setDateFormatString("dd MMM yyyy ");

        Fecha2.setDateFormatString("dd MMM yyyy ");

        Fecha3.setDateFormatString("dd MMM yyyy ");

        Fecha4.setDateFormatString("dd MMM yyyy ");

        Fecha5.setDateFormatString("dd MMM yyyy ");

        Fecha6.setDateFormatString("dd MMM yyyy ");

        Fecha7.setDateFormatString("dd MMM yyyy ");

        Fecha8.setDateFormatString("dd MMM yyyy ");

        Fecha9.setDateFormatString("dd MMM yyyy ");

        Menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });

        Mas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas2ActionPerformed(evt);
            }
        });

        Mas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas3ActionPerformed(evt);
            }
        });

        Menos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos3ActionPerformed(evt);
            }
        });

        Menos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos4ActionPerformed(evt);
            }
        });

        Mas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas4ActionPerformed(evt);
            }
        });

        Mas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas5ActionPerformed(evt);
            }
        });

        Menos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos6ActionPerformed(evt);
            }
        });

        Mas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas6ActionPerformed(evt);
            }
        });

        Menos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos7ActionPerformed(evt);
            }
        });

        Menos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos5ActionPerformed(evt);
            }
        });

        Mas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas7ActionPerformed(evt);
            }
        });

        Menos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos8ActionPerformed(evt);
            }
        });

        Mas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel10))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Folio1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Folio4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Folio5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fecha5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Servicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Servicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Servicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Servicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Servicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(Servicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Importe4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(Servicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Importe3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(Servicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4)
                                            .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(Servicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TDIDS))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(Mas)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas8))
                                    .addGroup(PanelLayout.createSequentialGroup()
                                        .addComponent(Menos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos8)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(TDIDS))
                            .addComponent(jLabel3))
                        .addGap(3, 3, 3)))
                .addGap(3, 3, 3)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mas)
                            .addComponent(Mas1)
                            .addComponent(Mas2)
                            .addComponent(Mas3)
                            .addComponent(Mas4)
                            .addComponent(Mas5)
                            .addComponent(Mas6)
                            .addComponent(Mas7)
                            .addComponent(Mas8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Menos2)
                            .addComponent(Menos1)
                            .addComponent(Menos)
                            .addComponent(Menos3)
                            .addComponent(Menos4)
                            .addComponent(Menos6)
                            .addComponent(Menos7)
                            .addComponent(Menos5)
                            .addComponent(Menos8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(Panel);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Pensiones");

        Fecha10.setDateFormatString("dd MMM yyyy ");

        Importe10.setText("0");
        Importe10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe10KeyReleased(evt);
            }
        });

        jLabel14.setText("Folio");

        Folio10.setText("0");

        jLabel15.setText("Fecha");

        jLabel16.setText("Servicio");

        jLabel17.setText("Importe");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel18.setText("Total de importe de pensiones:");

        TDIDP.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TDIDP.setText("0");

        Mas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas9ActionPerformed(evt);
            }
        });

        Menos11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos11ActionPerformed(evt);
            }
        });

        Menos10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos10ActionPerformed(evt);
            }
        });

        Mas10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas10ActionPerformed(evt);
            }
        });

        Menos9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos9ActionPerformed(evt);
            }
        });

        Mas11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas11ActionPerformed(evt);
            }
        });

        Mas12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas12ActionPerformed(evt);
            }
        });

        Menos12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos12ActionPerformed(evt);
            }
        });

        Menos13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos13ActionPerformed(evt);
            }
        });

        Mas13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas13ActionPerformed(evt);
            }
        });

        Mas14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas14ActionPerformed(evt);
            }
        });

        Menos15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos15ActionPerformed(evt);
            }
        });

        Mas15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas15ActionPerformed(evt);
            }
        });

        Menos16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos16ActionPerformed(evt);
            }
        });

        Menos14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos14ActionPerformed(evt);
            }
        });

        Mas16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas16ActionPerformed(evt);
            }
        });

        Menos17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos17ActionPerformed(evt);
            }
        });

        Mas17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas17ActionPerformed(evt);
            }
        });

        Folio11.setText("0");

        Folio12.setText("0");

        Folio13.setText("0");

        Folio14.setText("0");

        Folio15.setText("0");

        Folio16.setText("0");

        Folio17.setText("0");

        Folio18.setText("0");

        Folio19.setText("0");

        Fecha11.setDateFormatString("dd MMM yyyy ");

        Fecha12.setDateFormatString("dd MMM yyyy ");

        Fecha13.setDateFormatString("dd MMM yyyy ");

        Fecha14.setDateFormatString("dd MMM yyyy ");

        Fecha15.setDateFormatString("dd MMM yyyy ");

        Fecha16.setDateFormatString("dd MMM yyyy ");

        Fecha17.setDateFormatString("dd MMM yyyy ");

        Fecha18.setDateFormatString("dd MMM yyyy ");

        Fecha19.setDateFormatString("dd MMM yyyy ");

        Importe11.setText("0");
        Importe11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe11KeyReleased(evt);
            }
        });

        Importe12.setText("0");
        Importe12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe12KeyReleased(evt);
            }
        });

        Importe13.setText("0");
        Importe13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe13KeyReleased(evt);
            }
        });

        Importe14.setText("0");
        Importe14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe14KeyReleased(evt);
            }
        });

        Importe15.setText("0");
        Importe15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe15KeyReleased(evt);
            }
        });

        Importe16.setText("0");
        Importe16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe16KeyReleased(evt);
            }
        });

        Importe17.setText("0");
        Importe17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Importe17KeyPressed(evt);
            }
        });

        Importe18.setText("0");
        Importe18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe18KeyReleased(evt);
            }
        });

        Importe19.setText("0");
        Importe19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe19KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Folio19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Importe19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Servicio11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NPadron1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Servicio11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NPadron2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NPadron3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Servicio13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(NPadron4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Servicio14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Fecha14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Servicio15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Servicio16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servicio17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel26.setText("# De padron");

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Folio10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(Servicio10, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NPadron, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(Importe10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDIDP))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(Mas9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas17))
                            .addGroup(Panel2Layout.createSequentialGroup()
                                .addComponent(Menos9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos17))))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel13)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(jLabel18)
                                .addComponent(TDIDP)
                                .addComponent(jLabel26))
                            .addComponent(jLabel16))
                        .addGap(3, 3, 3)))
                .addGap(3, 3, 3)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NPadron, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mas9)
                            .addComponent(Mas10)
                            .addComponent(Mas11)
                            .addComponent(Mas12)
                            .addComponent(Mas13)
                            .addComponent(Mas14)
                            .addComponent(Mas15)
                            .addComponent(Mas16)
                            .addComponent(Mas17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Menos11)
                            .addComponent(Menos10)
                            .addComponent(Menos9)
                            .addComponent(Menos12)
                            .addComponent(Menos13)
                            .addComponent(Menos15)
                            .addComponent(Menos16)
                            .addComponent(Menos14)
                            .addComponent(Menos17)))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(Panel2);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Gastos");

        Fecha30.setDateFormatString("dd MMM yyyy ");

        Importe20.setText("0");
        Importe20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe20KeyReleased(evt);
            }
        });

        jLabel20.setText("Folio");

        Folio20.setText("0");

        jLabel21.setText("Fecha");

        Folio21.setText("0");

        Folio22.setText("0");

        Folio23.setText("0");

        Folio24.setText("0");

        Folio25.setText("0");

        Folio26.setText("0");

        Folio27.setText("0");

        Folio28.setText("0");

        Folio29.setText("0");

        Fecha21.setDateFormatString("dd MMM yyyy ");

        Fecha22.setDateFormatString("dd MMM yyyy ");

        Fecha23.setDateFormatString("dd MMM yyyy ");

        Fecha24.setDateFormatString("dd MMM yyyy ");

        Fecha25.setDateFormatString("dd MMM yyyy ");

        Fecha26.setDateFormatString("dd MMM yyyy ");

        Fecha27.setDateFormatString("dd MMM yyyy ");

        Fecha28.setDateFormatString("dd MMM yyyy ");

        Fecha29.setDateFormatString("dd MMM yyyy ");

        Importe21.setText("0");
        Importe21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe21KeyReleased(evt);
            }
        });

        Importe22.setText("0");
        Importe22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe22KeyReleased(evt);
            }
        });

        Importe23.setText("0");
        Importe23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe23KeyReleased(evt);
            }
        });

        Importe24.setText("0");
        Importe24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe24KeyReleased(evt);
            }
        });

        Importe25.setText("0");
        Importe25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe25KeyReleased(evt);
            }
        });

        Importe26.setText("0");
        Importe26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe26KeyReleased(evt);
            }
        });

        Importe27.setText("0");
        Importe27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Importe27KeyPressed(evt);
            }
        });

        Importe28.setText("0");
        Importe28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe28KeyReleased(evt);
            }
        });

        Importe29.setText("0");
        Importe29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe29KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha24, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha25, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha26, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha27, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Folio29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha29, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio22, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe22, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio23, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe23, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio24, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe24, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio25, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio26, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe26, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio27, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe27, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio28, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe28, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio29, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe29, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Servicio21, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe21, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDA1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LDA9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Folio22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Servicio22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importe22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Fecha22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Folio23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Servicio23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Importe23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Fecha23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Folio24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Servicio24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Importe24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(Fecha24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Folio25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Servicio25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Fecha25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Importe25)
                                .addGap(6, 6, 6)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(LDA1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LDA9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel22.setText("Concepto");

        jLabel23.setText("Importe");

        jLabel6.setText("Lista de asistencia");

        Menos18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos18ActionPerformed(evt);
            }
        });

        Mas18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas18ActionPerformed(evt);
            }
        });

        Mas19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas19ActionPerformed(evt);
            }
        });

        Menos19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos19ActionPerformed(evt);
            }
        });

        Menos20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos20ActionPerformed(evt);
            }
        });

        Mas20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas20ActionPerformed(evt);
            }
        });

        Mas21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas21ActionPerformed(evt);
            }
        });

        Menos21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos21ActionPerformed(evt);
            }
        });

        Mas22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas22ActionPerformed(evt);
            }
        });

        Menos22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos22ActionPerformed(evt);
            }
        });

        Menos23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos23ActionPerformed(evt);
            }
        });

        Mas23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas23ActionPerformed(evt);
            }
        });

        Menos24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos24ActionPerformed(evt);
            }
        });

        Mas24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas24ActionPerformed(evt);
            }
        });

        Mas25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas25ActionPerformed(evt);
            }
        });

        Menos25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos25ActionPerformed(evt);
            }
        });

        Menos26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos26ActionPerformed(evt);
            }
        });

        Mas26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas26ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Total de Gastos:");

        TDG.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TDG.setText("0");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Folio20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(Servicio20, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TDG))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Importe20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LDA, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel23)
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel6))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Mas25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Mas24))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Menos18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos23)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Menos24)))))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(TDG)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(jLabel6))
                            .addComponent(jLabel22))
                        .addGap(3, 3, 3)))
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mas25)
                            .addComponent(Mas26)
                            .addComponent(Mas18)
                            .addComponent(Mas19)
                            .addComponent(Mas20)
                            .addComponent(Mas21)
                            .addComponent(Mas22)
                            .addComponent(Mas23)
                            .addComponent(Mas24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Menos25)
                            .addComponent(Menos26)
                            .addComponent(Menos18)
                            .addComponent(Menos19)
                            .addComponent(Menos20)
                            .addComponent(Menos21)
                            .addComponent(Menos22)
                            .addComponent(Menos23)
                            .addComponent(Menos24))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel3);

        jLabel8.setText("Total Servicios y Pensiones:");

        TDSYP.setText("0");

        jLabel9.setText("Debe entregar.");

        DE.setText("0");

        jLabel24.setText("Folio");

        jLabel25.setText("Fecha");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setText("Vales");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel12.setText("Total de Vales:");

        TDG1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        TDG1.setText("0");

        jLabel29.setText("Importe");

        Folio30.setText("0");

        Folio31.setText("0");

        Folio32.setText("0");

        Folio33.setText("0");

        Folio34.setText("0");

        Folio35.setText("0");

        Folio36.setText("0");

        Folio37.setText("0");

        Folio38.setText("0");

        Folio39.setText("0");

        Fecha31.setDateFormatString("dd MMM yyyy ");

        Fecha32.setDateFormatString("dd MMM yyyy ");

        Fecha33.setDateFormatString("dd MMM yyyy ");

        Fecha34.setDateFormatString("dd MMM yyyy ");

        Fecha35.setDateFormatString("dd MMM yyyy ");

        Fecha36.setDateFormatString("dd MMM yyyy ");

        Fecha37.setDateFormatString("dd MMM yyyy ");

        Fecha38.setDateFormatString("dd MMM yyyy ");

        Fecha39.setDateFormatString("dd MMM yyyy ");

        Importe30.setText("0");
        Importe30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe30KeyReleased(evt);
            }
        });

        Importe31.setText("0");
        Importe31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe31KeyReleased(evt);
            }
        });

        Importe32.setText("0");
        Importe32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe32KeyReleased(evt);
            }
        });

        Importe33.setText("0");
        Importe33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe33KeyReleased(evt);
            }
        });

        Importe34.setText("0");
        Importe34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe34KeyReleased(evt);
            }
        });

        Importe35.setText("0");
        Importe35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe35KeyReleased(evt);
            }
        });

        Importe36.setText("0");
        Importe36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Importe36KeyPressed(evt);
            }
        });

        Importe37.setText("0");
        Importe37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe37KeyReleased(evt);
            }
        });

        Importe38.setText("0");
        Importe38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe38KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha31, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha32, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha33, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha34, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha35, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha36, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha37, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha38, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Folio39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha39, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe31, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe32, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe33, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe34, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV6, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe35, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV7, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe36, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe37, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe38, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(ObsV1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(137, 137, 137))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsV1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ObsV2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ObsV3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Importe32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Folio34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ObsV4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Importe33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Fecha34, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Folio35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ObsV5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(Importe34)
                        .addGap(6, 6, 6)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsV6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsV7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsV8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Folio39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsV9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Importe38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Fecha39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Fecha40.setDateFormatString("dd MMM yyyy ");

        Importe39.setText("0");
        Importe39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe39KeyReleased(evt);
            }
        });

        jLabel11.setText("Observaciones");

        Menos27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos27ActionPerformed(evt);
            }
        });

        Mas27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas27ActionPerformed(evt);
            }
        });

        Menos28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos28ActionPerformed(evt);
            }
        });

        Mas28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas28ActionPerformed(evt);
            }
        });

        Mas29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas29ActionPerformed(evt);
            }
        });

        Menos29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos29ActionPerformed(evt);
            }
        });

        Menos30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos30ActionPerformed(evt);
            }
        });

        Mas30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas30ActionPerformed(evt);
            }
        });

        Menos31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos31ActionPerformed(evt);
            }
        });

        Menos32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos32ActionPerformed(evt);
            }
        });

        Mas31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas31ActionPerformed(evt);
            }
        });

        Menos33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos33ActionPerformed(evt);
            }
        });

        Mas32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas32ActionPerformed(evt);
            }
        });

        Mas33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas33ActionPerformed(evt);
            }
        });

        Menos34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos34ActionPerformed(evt);
            }
        });

        Menos35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos35ActionPerformed(evt);
            }
        });

        Mas34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas34ActionPerformed(evt);
            }
        });

        Mas35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas35ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel28)
                                        .addGap(170, 170, 170)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TDG1))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(195, 195, 195)
                                        .addComponent(jLabel11)
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel29))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(Folio30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(Fecha40, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ObsV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Importe39, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Mas29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mas28))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Menos33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Menos28)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLabel12)
                    .addComponent(TDG1))
                .addGap(1, 1, 1)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel29)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ObsV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Mas29)
                            .addComponent(Mas30)
                            .addComponent(Mas32)
                            .addComponent(Mas33)
                            .addComponent(Mas34)
                            .addComponent(Mas35)
                            .addComponent(Mas31)
                            .addComponent(Mas27)
                            .addComponent(Mas28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Menos29)
                            .addComponent(Menos30)
                            .addComponent(Menos33)
                            .addComponent(Menos34)
                            .addComponent(Menos35)
                            .addComponent(Menos32)
                            .addComponent(Menos31)
                            .addComponent(Menos27)
                            .addComponent(Menos28))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane5.setViewportView(jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDSYP))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DE)))))
                .addContainerGap(368, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TDSYP))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(DE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 939, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasActionPerformed
        Folio1.setVisible(true);
        Fecha1.setVisible(true);
        Servicio1.setVisible(true);
        Importe1.setVisible(true);
        Menos.setVisible(true);
        Mas.setVisible(false);
        Mas1.setVisible(true);

    }//GEN-LAST:event_MasActionPerformed

    private void Mas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas1ActionPerformed
        Folio2.setVisible(true);
        Fecha2.setVisible(true);
        Servicio2.setVisible(true);
        Importe2.setVisible(true);
        Menos.setVisible(false);
        Menos1.setVisible(true);
        Mas1.setVisible(false);
        Mas2.setVisible(true);

    }//GEN-LAST:event_Mas1ActionPerformed

    private void Mas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas2ActionPerformed
        Folio3.setVisible(true);
        Fecha3.setVisible(true);
        Servicio3.setVisible(true);
        Importe3.setVisible(true);
        Menos1.setVisible(false);
        Menos2.setVisible(true);
        Mas2.setVisible(false);
        Mas3.setVisible(true);

    }//GEN-LAST:event_Mas2ActionPerformed

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
        Folio1.setVisible(false);
        Fecha1.setVisible(false);
        Servicio1.setVisible(false);
        Importe1.setVisible(false);
        Menos.setVisible(false);
        Mas.setVisible(true);
        Mas1.setVisible(false);
    }//GEN-LAST:event_MenosActionPerformed

    private void Menos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos1ActionPerformed
        Folio2.setVisible(false);
        Fecha2.setVisible(false);
        Servicio2.setVisible(false);
        Importe2.setVisible(false);
        Menos.setVisible(true);
        Menos1.setVisible(false);
        Mas1.setVisible(true);
        Mas2.setVisible(false);
    }//GEN-LAST:event_Menos1ActionPerformed

    private void Menos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos2ActionPerformed
        Folio3.setVisible(false);
        Fecha3.setVisible(false);
        Servicio3.setVisible(false);
        Importe3.setVisible(false);
        Menos1.setVisible(true);
        Menos2.setVisible(false);
        Mas2.setVisible(true);
        Mas3.setVisible(false);

    }//GEN-LAST:event_Menos2ActionPerformed

    private void Mas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas3ActionPerformed
        Folio4.setVisible(true);
        Fecha4.setVisible(true);
        Servicio4.setVisible(true);
        Importe4.setVisible(true);
        Menos2.setVisible(false);
        Menos3.setVisible(true);
        Mas3.setVisible(false);
        Mas4.setVisible(true);
    }//GEN-LAST:event_Mas3ActionPerformed

    private void Mas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas4ActionPerformed
        Folio5.setVisible(true);
        Fecha5.setVisible(true);
        Servicio5.setVisible(true);
        Importe5.setVisible(true);
        Menos3.setVisible(false);
        Menos4.setVisible(true);
        Mas4.setVisible(false);
        Mas5.setVisible(true);
    }//GEN-LAST:event_Mas4ActionPerformed

    private void Menos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos3ActionPerformed
        Folio4.setVisible(false);
        Fecha4.setVisible(false);
        Servicio4.setVisible(false);
        Importe4.setVisible(false);
        Menos2.setVisible(true);
        Menos3.setVisible(false);
        Mas3.setVisible(true);
        Mas4.setVisible(false);
    }//GEN-LAST:event_Menos3ActionPerformed

    private void Menos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos4ActionPerformed
        Folio5.setVisible(false);
        Fecha5.setVisible(false);
        Servicio5.setVisible(false);
        Importe5.setVisible(false);
        Menos3.setVisible(true);
        Menos4.setVisible(false);
        Mas4.setVisible(true);
        Mas5.setVisible(false);
    }//GEN-LAST:event_Menos4ActionPerformed

    private void Mas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas5ActionPerformed
        Folio6.setVisible(true);
        Fecha6.setVisible(true);
        Servicio6.setVisible(true);
        Importe6.setVisible(true);
        Menos4.setVisible(false);
        Menos5.setVisible(true);
        Mas5.setVisible(false);
        Mas6.setVisible(true);
    }//GEN-LAST:event_Mas5ActionPerformed

    private void Mas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas6ActionPerformed
        Folio7.setVisible(true);
        Fecha7.setVisible(true);
        Servicio7.setVisible(true);
        Importe7.setVisible(true);
        Menos5.setVisible(false);
        Menos6.setVisible(true);
        Mas6.setVisible(false);
        Mas7.setVisible(true);
    }//GEN-LAST:event_Mas6ActionPerformed

    private void Menos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos5ActionPerformed
        Folio6.setVisible(false);
        Fecha6.setVisible(false);
        Servicio6.setVisible(false);
        Importe6.setVisible(false);
        Menos4.setVisible(true);
        Menos5.setVisible(false);
        Mas5.setVisible(true);
        Mas6.setVisible(false);
    }//GEN-LAST:event_Menos5ActionPerformed

    private void Mas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas7ActionPerformed
        Folio8.setVisible(true);
        Fecha8.setVisible(true);
        Servicio8.setVisible(true);
        Importe8.setVisible(true);
        Menos6.setVisible(false);
        Menos7.setVisible(true);
        Mas7.setVisible(false);
        Mas8.setVisible(true);
    }//GEN-LAST:event_Mas7ActionPerformed

    private void Mas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas8ActionPerformed
        Folio9.setVisible(true);
        Fecha9.setVisible(true);
        Servicio9.setVisible(true);
        Importe9.setVisible(true);
        Menos7.setVisible(false);
        Menos8.setVisible(true);
        Mas8.setVisible(false);
        //Mas9.setVisible(true);
    }//GEN-LAST:event_Mas8ActionPerformed

    private void Menos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos6ActionPerformed
        Folio7.setVisible(false);
        Fecha7.setVisible(false);
        Servicio7.setVisible(false);
        Importe7.setVisible(false);
        Menos5.setVisible(true);
        Menos6.setVisible(false);
        Mas6.setVisible(true);
        Mas7.setVisible(false);
    }//GEN-LAST:event_Menos6ActionPerformed

    private void Menos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos7ActionPerformed
        Folio8.setVisible(false);
        Fecha8.setVisible(false);
        Servicio8.setVisible(false);
        Importe8.setVisible(false);
        Menos6.setVisible(true);
        Menos7.setVisible(false);
        Mas7.setVisible(true);
        Mas8.setVisible(false);
    }//GEN-LAST:event_Menos7ActionPerformed

    private void Menos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos8ActionPerformed
        Folio9.setVisible(false);
        Fecha9.setVisible(false);
        Servicio9.setVisible(false);
        Importe9.setVisible(false);
        Menos7.setVisible(true);
        Menos8.setVisible(false);
        Mas8.setVisible(true);
        //Mas9.setVisible(false);
    }//GEN-LAST:event_Menos8ActionPerformed

    private void ImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyReleased
        Imtotal();
    }//GEN-LAST:event_ImporteKeyReleased

    private void Importe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe1KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe1KeyReleased

    private void Importe2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe2KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe2KeyReleased

    private void Importe3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe3KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe3KeyReleased

    private void Importe4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe4KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe4KeyReleased

    private void Importe5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe5KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe5KeyReleased

    private void Importe6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe6KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe6KeyReleased

    private void Importe7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe7KeyPressed
        Imtotal();

    }//GEN-LAST:event_Importe7KeyPressed

    private void Importe8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe8KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe8KeyReleased

    private void Importe9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe9KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe9KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddEst();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Importe10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe10KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe10KeyReleased

    private void Importe11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe11KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe11KeyReleased

    private void Importe12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe12KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe12KeyReleased

    private void Importe13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe13KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe13KeyReleased

    private void Importe14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe14KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe14KeyReleased

    private void Importe15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe15KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe15KeyReleased

    private void Importe16KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe16KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe16KeyReleased

    private void Importe17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe17KeyPressed
        Imtotal();
    }//GEN-LAST:event_Importe17KeyPressed

    private void Importe18KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe18KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe18KeyReleased

    private void Importe19KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe19KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe19KeyReleased

    private void Mas9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas9ActionPerformed
        Folio11.setVisible(true);
        NPadron1.setVisible(true);
        Fecha11.setVisible(true);
        Servicio11.setVisible(true);
        Importe11.setVisible(true);
        Menos9.setVisible(true);
        Mas9.setVisible(false);
        Mas10.setVisible(true);
    }//GEN-LAST:event_Mas9ActionPerformed

    private void Menos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos11ActionPerformed
        NPadron3.setVisible(false);
        Folio13.setVisible(false);
        Fecha13.setVisible(false);
        Servicio13.setVisible(false);
        Importe13.setVisible(false);
        Menos10.setVisible(true);
        Menos11.setVisible(false);
        Mas11.setVisible(true);
        Mas12.setVisible(false);
    }//GEN-LAST:event_Menos11ActionPerformed

    private void Menos10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos10ActionPerformed
        NPadron2.setVisible(false);
        Folio12.setVisible(false);
        Fecha12.setVisible(false);
        Servicio12.setVisible(false);
        Importe12.setVisible(false);
        Menos9.setVisible(true);
        Menos10.setVisible(false);
        Mas10.setVisible(true);
        Mas11.setVisible(false);
    }//GEN-LAST:event_Menos10ActionPerformed

    private void Mas10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas10ActionPerformed
        NPadron2.setVisible(true);
        Folio12.setVisible(true);
        Fecha12.setVisible(true);
        Servicio12.setVisible(true);
        Importe12.setVisible(true);
        Menos9.setVisible(false);
        Menos10.setVisible(true);
        Mas10.setVisible(false);
        Mas11.setVisible(true);
    }//GEN-LAST:event_Mas10ActionPerformed

    private void Menos9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos9ActionPerformed
        NPadron1.setVisible(false);
        Folio11.setVisible(false);
        Fecha11.setVisible(false);
        Servicio11.setVisible(false);
        Importe11.setVisible(false);
        Menos9.setVisible(false);
        Mas9.setVisible(true);
        Mas10.setVisible(false);
    }//GEN-LAST:event_Menos9ActionPerformed

    private void Mas11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas11ActionPerformed
        NPadron3.setVisible(true);
        Folio13.setVisible(true);
        Fecha13.setVisible(true);
        Servicio13.setVisible(true);
        Importe13.setVisible(true);
        Menos10.setVisible(false);
        Menos11.setVisible(true);
        Mas11.setVisible(false);
        Mas12.setVisible(true);
    }//GEN-LAST:event_Mas11ActionPerformed

    private void Mas12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas12ActionPerformed
        NPadron4.setVisible(true);
        Folio14.setVisible(true);
        Fecha14.setVisible(true);
        Servicio14.setVisible(true);
        Importe14.setVisible(true);
        Menos11.setVisible(false);
        Menos12.setVisible(true);
        Mas12.setVisible(false);
        Mas13.setVisible(true);
    }//GEN-LAST:event_Mas12ActionPerformed

    private void Menos12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos12ActionPerformed
        NPadron4.setVisible(false);
        Folio14.setVisible(false);
        Fecha14.setVisible(false);
        Servicio14.setVisible(false);
        Importe14.setVisible(false);
        Menos11.setVisible(true);
        Menos12.setVisible(false);
        Mas12.setVisible(true);
        Mas13.setVisible(false);
    }//GEN-LAST:event_Menos12ActionPerformed

    private void Menos13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos13ActionPerformed
        NPadron5.setVisible(false);
        Folio15.setVisible(false);
        Fecha15.setVisible(false);
        Servicio15.setVisible(false);
        Importe15.setVisible(false);
        Menos12.setVisible(true);
        Menos13.setVisible(false);
        Mas13.setVisible(true);
        Mas14.setVisible(false);
    }//GEN-LAST:event_Menos13ActionPerformed

    private void Mas13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas13ActionPerformed
        NPadron5.setVisible(true);
        Folio15.setVisible(true);
        Fecha15.setVisible(true);
        Servicio15.setVisible(true);
        Importe15.setVisible(true);
        Menos12.setVisible(false);
        Menos13.setVisible(true);
        Mas13.setVisible(false);
        Mas14.setVisible(true);
    }//GEN-LAST:event_Mas13ActionPerformed

    private void Mas14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas14ActionPerformed
        NPadron6.setVisible(true);
        Folio16.setVisible(true);
        Fecha16.setVisible(true);
        Servicio16.setVisible(true);
        Importe16.setVisible(true);
        Menos13.setVisible(false);
        Menos14.setVisible(true);
        Mas14.setVisible(false);
        Mas15.setVisible(true);
    }//GEN-LAST:event_Mas14ActionPerformed

    private void Menos15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos15ActionPerformed
        NPadron7.setVisible(false);
        Folio17.setVisible(false);
        Fecha17.setVisible(false);
        Servicio17.setVisible(false);
        Importe17.setVisible(false);
        Menos14.setVisible(true);
        Menos15.setVisible(false);
        Mas15.setVisible(true);
        Mas16.setVisible(false);
    }//GEN-LAST:event_Menos15ActionPerformed

    private void Mas15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas15ActionPerformed
        NPadron7.setVisible(true);
        Folio17.setVisible(true);
        Fecha17.setVisible(true);
        Servicio17.setVisible(true);
        Importe17.setVisible(true);
        Menos14.setVisible(false);
        Menos15.setVisible(true);
        Mas15.setVisible(false);
        Mas16.setVisible(true);
    }//GEN-LAST:event_Mas15ActionPerformed

    private void Menos16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos16ActionPerformed
        NPadron8.setVisible(false);
        Folio18.setVisible(false);
        Fecha18.setVisible(false);
        Servicio18.setVisible(false);
        Importe18.setVisible(false);
        Menos15.setVisible(true);
        Menos16.setVisible(false);
        Mas16.setVisible(true);
        Mas17.setVisible(false);
    }//GEN-LAST:event_Menos16ActionPerformed

    private void Menos14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos14ActionPerformed
        NPadron6.setVisible(false);
        Folio16.setVisible(false);
        Fecha16.setVisible(false);
        Servicio16.setVisible(false);
        Importe16.setVisible(false);
        Menos13.setVisible(true);
        Menos14.setVisible(false);
        Mas14.setVisible(true);
        Mas15.setVisible(false);
    }//GEN-LAST:event_Menos14ActionPerformed

    private void Mas16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas16ActionPerformed
        NPadron8.setVisible(true);
        Folio18.setVisible(true);
        Fecha18.setVisible(true);
        Servicio18.setVisible(true);
        Importe18.setVisible(true);
        Menos15.setVisible(false);
        Menos16.setVisible(true);
        Mas16.setVisible(false);
        Mas17.setVisible(true);
    }//GEN-LAST:event_Mas16ActionPerformed

    private void Menos17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos17ActionPerformed
        NPadron9.setVisible(false);
        Folio19.setVisible(false);
        Fecha19.setVisible(false);
        Servicio19.setVisible(false);
        Importe19.setVisible(false);
        Menos16.setVisible(true);
        Menos17.setVisible(false);
        Mas17.setVisible(true);
        //Mas18.setVisible(false);
    }//GEN-LAST:event_Menos17ActionPerformed

    private void Mas17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas17ActionPerformed
        NPadron9.setVisible(true);
        Folio19.setVisible(true);
        Fecha19.setVisible(true);
        Servicio19.setVisible(true);
        Importe19.setVisible(true);
        Menos16.setVisible(false);
        Menos17.setVisible(true);
        Mas17.setVisible(false);
        //Mas18.setVisible(true);
    }//GEN-LAST:event_Mas17ActionPerformed

    private void Importe20KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe20KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe20KeyReleased

    private void Importe21KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe21KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe21KeyReleased

    private void Importe22KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe22KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe22KeyReleased

    private void Importe23KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe23KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe23KeyReleased

    private void Importe24KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe24KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe24KeyReleased

    private void Importe25KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe25KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe25KeyReleased

    private void Importe26KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe26KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe26KeyReleased

    private void Importe27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe27KeyPressed
        Imtotal();
    }//GEN-LAST:event_Importe27KeyPressed

    private void Importe28KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe28KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe28KeyReleased

    private void Importe29KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe29KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe29KeyReleased

    private void Menos18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos18ActionPerformed
        Folio21.setVisible(false);
        Fecha21.setVisible(false);
        Servicio21.setVisible(false);
        Importe21.setVisible(false);
        LDA1.setVisible(false);
        Menos18.setVisible(false);
        Mas18.setVisible(true);
        Mas19.setVisible(false);
    }//GEN-LAST:event_Menos18ActionPerformed

    private void Mas18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas18ActionPerformed
        Folio21.setVisible(true);
        Fecha21.setVisible(true);
        Servicio21.setVisible(true);
        Importe21.setVisible(true);
        LDA1.setVisible(true);
        Menos18.setVisible(true);
        Mas18.setVisible(false);
        Mas19.setVisible(true);
    }//GEN-LAST:event_Mas18ActionPerformed

    private void Mas19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas19ActionPerformed
        Folio22.setVisible(true);
        Fecha22.setVisible(true);
        Servicio22.setVisible(true);
        Importe22.setVisible(true);
        LDA2.setVisible(true);
        Menos18.setVisible(false);
        Menos19.setVisible(true);
        Mas19.setVisible(false);
        Mas20.setVisible(true);
    }//GEN-LAST:event_Mas19ActionPerformed

    private void Menos19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos19ActionPerformed
        Folio22.setVisible(false);
        Fecha22.setVisible(false);
        Servicio22.setVisible(false);
        Importe22.setVisible(false);
        LDA2.setVisible(false);
        Menos18.setVisible(true);
        Menos19.setVisible(false);
        Mas19.setVisible(true);
        Mas20.setVisible(false);
    }//GEN-LAST:event_Menos19ActionPerformed

    private void Menos20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos20ActionPerformed
        Folio23.setVisible(false);
        Fecha23.setVisible(false);
        Servicio23.setVisible(false);
        Importe23.setVisible(false);
        LDA3.setVisible(false);
        Menos19.setVisible(true);
        Menos20.setVisible(false);
        Mas20.setVisible(true);
        Mas21.setVisible(false);
    }//GEN-LAST:event_Menos20ActionPerformed

    private void Mas20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas20ActionPerformed
        Folio23.setVisible(true);
        Fecha23.setVisible(true);
        Servicio23.setVisible(true);
        Importe23.setVisible(true);
        LDA3.setVisible(true);
        Menos19.setVisible(false);
        Menos20.setVisible(true);
        Mas20.setVisible(false);
        Mas21.setVisible(true);
    }//GEN-LAST:event_Mas20ActionPerformed

    private void Mas21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas21ActionPerformed
        Folio24.setVisible(true);
        Fecha24.setVisible(true);
        Servicio24.setVisible(true);
        Importe24.setVisible(true);
        LDA4.setVisible(true);
        Menos20.setVisible(false);
        Menos21.setVisible(true);
        Mas21.setVisible(false);
        Mas22.setVisible(true);
    }//GEN-LAST:event_Mas21ActionPerformed

    private void Menos21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos21ActionPerformed
        Folio24.setVisible(false);
        Fecha24.setVisible(false);
        Servicio24.setVisible(false);
        Importe24.setVisible(false);
        LDA4.setVisible(false);
        Menos20.setVisible(true);
        Menos21.setVisible(false);
        Mas21.setVisible(true);
        Mas22.setVisible(false);
    }//GEN-LAST:event_Menos21ActionPerformed

    private void Mas22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas22ActionPerformed
        Folio25.setVisible(true);
        Fecha25.setVisible(true);
        Servicio25.setVisible(true);
        Importe25.setVisible(true);
        LDA5.setVisible(true);
        Menos21.setVisible(false);
        Menos22.setVisible(true);
        Mas22.setVisible(false);
        Mas23.setVisible(true);
    }//GEN-LAST:event_Mas22ActionPerformed

    private void Menos22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos22ActionPerformed
        Folio25.setVisible(false);
        Fecha25.setVisible(false);
        Servicio25.setVisible(false);
        Importe25.setVisible(false);
        LDA5.setVisible(false);
        Menos21.setVisible(true);
        Menos22.setVisible(false);
        Mas22.setVisible(true);
        Mas23.setVisible(false);
    }//GEN-LAST:event_Menos22ActionPerformed

    private void Menos23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos23ActionPerformed
        Folio26.setVisible(false);
        Fecha26.setVisible(false);
        Servicio26.setVisible(false);
        Importe26.setVisible(false);
        LDA6.setVisible(false);
        Menos22.setVisible(true);
        Menos23.setVisible(false);
        Mas23.setVisible(true);
        Mas24.setVisible(false);
    }//GEN-LAST:event_Menos23ActionPerformed

    private void Mas23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas23ActionPerformed
        Folio26.setVisible(true);
        Fecha26.setVisible(true);
        Servicio26.setVisible(true);
        Importe26.setVisible(true);
        LDA6.setVisible(true);
        Menos22.setVisible(false);
        Menos23.setVisible(true);
        Mas23.setVisible(false);
        Mas24.setVisible(true);
    }//GEN-LAST:event_Mas23ActionPerformed

    private void Menos24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos24ActionPerformed
        Folio27.setVisible(false);
        Fecha27.setVisible(false);
        Servicio27.setVisible(false);
        Importe27.setVisible(false);
        LDA7.setVisible(false);
        Menos23.setVisible(true);
        Menos24.setVisible(false);
        Mas24.setVisible(true);
        Mas25.setVisible(false);
    }//GEN-LAST:event_Menos24ActionPerformed

    private void Mas24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas24ActionPerformed
        Folio27.setVisible(true);
        Fecha27.setVisible(true);
        Servicio27.setVisible(true);
        Importe27.setVisible(true);
        LDA7.setVisible(true);
        Menos23.setVisible(false);
        Menos24.setVisible(true);
        Mas24.setVisible(false);
        Mas25.setVisible(true);
    }//GEN-LAST:event_Mas24ActionPerformed

    private void Mas25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas25ActionPerformed
        Folio28.setVisible(true);
        Fecha28.setVisible(true);
        Servicio28.setVisible(true);
        Importe28.setVisible(true);
        LDA8.setVisible(true);
        Menos24.setVisible(false);
        Menos25.setVisible(true);
        Mas25.setVisible(false);
        Mas26.setVisible(true);
    }//GEN-LAST:event_Mas25ActionPerformed

    private void Menos25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos25ActionPerformed
        Folio28.setVisible(false);
        Fecha28.setVisible(false);
        Servicio28.setVisible(false);
        Importe28.setVisible(false);
        LDA8.setVisible(false);
        Menos24.setVisible(true);
        Menos25.setVisible(false);
        Mas25.setVisible(true);
        Mas26.setVisible(false);
    }//GEN-LAST:event_Menos25ActionPerformed

    private void Menos26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos26ActionPerformed
        Folio29.setVisible(false);
        Fecha29.setVisible(false);
        Servicio29.setVisible(false);
        Importe29.setVisible(false);
        LDA9.setVisible(false);
        Menos25.setVisible(true);
        Menos26.setVisible(false);
        Mas26.setVisible(true);
        //Mas27.setVisible(false);
    }//GEN-LAST:event_Menos26ActionPerformed

    private void Mas26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas26ActionPerformed
        Folio29.setVisible(true);
        Fecha29.setVisible(true);
        Servicio29.setVisible(true);
        Importe29.setVisible(true);
        LDA9.setVisible(true);
        Menos25.setVisible(false);
        Menos26.setVisible(true);
        Mas26.setVisible(false);
        //Mas27.setVisible(true);
    }//GEN-LAST:event_Mas26ActionPerformed

    private void Importe30KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe30KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe30KeyReleased

    private void Importe31KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe31KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe31KeyReleased

    private void Importe32KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe32KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe32KeyReleased

    private void Importe33KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe33KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe33KeyReleased

    private void Importe34KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe34KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe34KeyReleased

    private void Importe35KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe35KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe35KeyReleased

    private void Importe36KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe36KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe36KeyPressed

    private void Importe37KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe37KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe37KeyReleased

    private void Importe38KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe38KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe38KeyReleased

    private void Importe39KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe39KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Importe39KeyReleased

    private void Menos27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos27ActionPerformed

    private void Mas27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas27ActionPerformed

    private void Menos28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos28ActionPerformed

    private void Mas28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas28ActionPerformed

    private void Mas29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas29ActionPerformed

    private void Menos29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos29ActionPerformed

    private void Menos30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos30ActionPerformed

    private void Mas30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas30ActionPerformed

    private void Menos31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos31ActionPerformed

    private void Menos32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos32ActionPerformed

    private void Mas31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas31ActionPerformed

    private void Menos33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos33ActionPerformed

    private void Mas32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas32ActionPerformed

    private void Mas33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas33ActionPerformed

    private void Menos34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos34ActionPerformed

    private void Menos35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Menos35ActionPerformed

    private void Mas34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas34ActionPerformed

    private void Mas35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mas35ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Sem_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DE;
    private com.toedter.calendar.JDateChooser Fecha;
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha10;
    private com.toedter.calendar.JDateChooser Fecha11;
    private com.toedter.calendar.JDateChooser Fecha12;
    private com.toedter.calendar.JDateChooser Fecha13;
    private com.toedter.calendar.JDateChooser Fecha14;
    private com.toedter.calendar.JDateChooser Fecha15;
    private com.toedter.calendar.JDateChooser Fecha16;
    private com.toedter.calendar.JDateChooser Fecha17;
    private com.toedter.calendar.JDateChooser Fecha18;
    private com.toedter.calendar.JDateChooser Fecha19;
    private com.toedter.calendar.JDateChooser Fecha2;
    private com.toedter.calendar.JDateChooser Fecha21;
    private com.toedter.calendar.JDateChooser Fecha22;
    private com.toedter.calendar.JDateChooser Fecha23;
    private com.toedter.calendar.JDateChooser Fecha24;
    private com.toedter.calendar.JDateChooser Fecha25;
    private com.toedter.calendar.JDateChooser Fecha26;
    private com.toedter.calendar.JDateChooser Fecha27;
    private com.toedter.calendar.JDateChooser Fecha28;
    private com.toedter.calendar.JDateChooser Fecha29;
    private com.toedter.calendar.JDateChooser Fecha3;
    private com.toedter.calendar.JDateChooser Fecha30;
    private com.toedter.calendar.JDateChooser Fecha31;
    private com.toedter.calendar.JDateChooser Fecha32;
    private com.toedter.calendar.JDateChooser Fecha33;
    private com.toedter.calendar.JDateChooser Fecha34;
    private com.toedter.calendar.JDateChooser Fecha35;
    private com.toedter.calendar.JDateChooser Fecha36;
    private com.toedter.calendar.JDateChooser Fecha37;
    private com.toedter.calendar.JDateChooser Fecha38;
    private com.toedter.calendar.JDateChooser Fecha39;
    private com.toedter.calendar.JDateChooser Fecha4;
    private com.toedter.calendar.JDateChooser Fecha40;
    private com.toedter.calendar.JDateChooser Fecha5;
    private com.toedter.calendar.JDateChooser Fecha6;
    private com.toedter.calendar.JDateChooser Fecha7;
    private com.toedter.calendar.JDateChooser Fecha8;
    private com.toedter.calendar.JDateChooser Fecha9;
    private javax.swing.JTextField Folio;
    private javax.swing.JTextField Folio1;
    private javax.swing.JTextField Folio10;
    private javax.swing.JTextField Folio11;
    private javax.swing.JTextField Folio12;
    private javax.swing.JTextField Folio13;
    private javax.swing.JTextField Folio14;
    private javax.swing.JTextField Folio15;
    private javax.swing.JTextField Folio16;
    private javax.swing.JTextField Folio17;
    private javax.swing.JTextField Folio18;
    private javax.swing.JTextField Folio19;
    private javax.swing.JTextField Folio2;
    private javax.swing.JTextField Folio20;
    private javax.swing.JTextField Folio21;
    private javax.swing.JTextField Folio22;
    private javax.swing.JTextField Folio23;
    private javax.swing.JTextField Folio24;
    private javax.swing.JTextField Folio25;
    private javax.swing.JTextField Folio26;
    private javax.swing.JTextField Folio27;
    private javax.swing.JTextField Folio28;
    private javax.swing.JTextField Folio29;
    private javax.swing.JTextField Folio3;
    private javax.swing.JTextField Folio30;
    private javax.swing.JTextField Folio31;
    private javax.swing.JTextField Folio32;
    private javax.swing.JTextField Folio33;
    private javax.swing.JTextField Folio34;
    private javax.swing.JTextField Folio35;
    private javax.swing.JTextField Folio36;
    private javax.swing.JTextField Folio37;
    private javax.swing.JTextField Folio38;
    private javax.swing.JTextField Folio39;
    private javax.swing.JTextField Folio4;
    private javax.swing.JTextField Folio5;
    private javax.swing.JTextField Folio6;
    private javax.swing.JTextField Folio7;
    private javax.swing.JTextField Folio8;
    private javax.swing.JTextField Folio9;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Importe1;
    private javax.swing.JTextField Importe10;
    private javax.swing.JTextField Importe11;
    private javax.swing.JTextField Importe12;
    private javax.swing.JTextField Importe13;
    private javax.swing.JTextField Importe14;
    private javax.swing.JTextField Importe15;
    private javax.swing.JTextField Importe16;
    private javax.swing.JTextField Importe17;
    private javax.swing.JTextField Importe18;
    private javax.swing.JTextField Importe19;
    private javax.swing.JTextField Importe2;
    private javax.swing.JTextField Importe20;
    private javax.swing.JTextField Importe21;
    private javax.swing.JTextField Importe22;
    private javax.swing.JTextField Importe23;
    private javax.swing.JTextField Importe24;
    private javax.swing.JTextField Importe25;
    private javax.swing.JTextField Importe26;
    private javax.swing.JTextField Importe27;
    private javax.swing.JTextField Importe28;
    private javax.swing.JTextField Importe29;
    private javax.swing.JTextField Importe3;
    private javax.swing.JTextField Importe30;
    private javax.swing.JTextField Importe31;
    private javax.swing.JTextField Importe32;
    private javax.swing.JTextField Importe33;
    private javax.swing.JTextField Importe34;
    private javax.swing.JTextField Importe35;
    private javax.swing.JTextField Importe36;
    private javax.swing.JTextField Importe37;
    private javax.swing.JTextField Importe38;
    private javax.swing.JTextField Importe39;
    private javax.swing.JTextField Importe4;
    private javax.swing.JTextField Importe5;
    private javax.swing.JTextField Importe6;
    private javax.swing.JTextField Importe7;
    private javax.swing.JTextField Importe8;
    private javax.swing.JTextField Importe9;
    private javax.swing.JTextField LDA;
    private javax.swing.JTextField LDA1;
    private javax.swing.JTextField LDA2;
    private javax.swing.JTextField LDA3;
    private javax.swing.JTextField LDA4;
    private javax.swing.JTextField LDA5;
    private javax.swing.JTextField LDA6;
    private javax.swing.JTextField LDA7;
    private javax.swing.JTextField LDA8;
    private javax.swing.JTextField LDA9;
    private javax.swing.JButton Mas;
    private javax.swing.JButton Mas1;
    private javax.swing.JButton Mas10;
    private javax.swing.JButton Mas11;
    private javax.swing.JButton Mas12;
    private javax.swing.JButton Mas13;
    private javax.swing.JButton Mas14;
    private javax.swing.JButton Mas15;
    private javax.swing.JButton Mas16;
    private javax.swing.JButton Mas17;
    private javax.swing.JButton Mas18;
    private javax.swing.JButton Mas19;
    private javax.swing.JButton Mas2;
    private javax.swing.JButton Mas20;
    private javax.swing.JButton Mas21;
    private javax.swing.JButton Mas22;
    private javax.swing.JButton Mas23;
    private javax.swing.JButton Mas24;
    private javax.swing.JButton Mas25;
    private javax.swing.JButton Mas26;
    private javax.swing.JButton Mas27;
    private javax.swing.JButton Mas28;
    private javax.swing.JButton Mas29;
    private javax.swing.JButton Mas3;
    private javax.swing.JButton Mas30;
    private javax.swing.JButton Mas31;
    private javax.swing.JButton Mas32;
    private javax.swing.JButton Mas33;
    private javax.swing.JButton Mas34;
    private javax.swing.JButton Mas35;
    private javax.swing.JButton Mas4;
    private javax.swing.JButton Mas5;
    private javax.swing.JButton Mas6;
    private javax.swing.JButton Mas7;
    private javax.swing.JButton Mas8;
    private javax.swing.JButton Mas9;
    private javax.swing.JButton Menos;
    private javax.swing.JButton Menos1;
    private javax.swing.JButton Menos10;
    private javax.swing.JButton Menos11;
    private javax.swing.JButton Menos12;
    private javax.swing.JButton Menos13;
    private javax.swing.JButton Menos14;
    private javax.swing.JButton Menos15;
    private javax.swing.JButton Menos16;
    private javax.swing.JButton Menos17;
    private javax.swing.JButton Menos18;
    private javax.swing.JButton Menos19;
    private javax.swing.JButton Menos2;
    private javax.swing.JButton Menos20;
    private javax.swing.JButton Menos21;
    private javax.swing.JButton Menos22;
    private javax.swing.JButton Menos23;
    private javax.swing.JButton Menos24;
    private javax.swing.JButton Menos25;
    private javax.swing.JButton Menos26;
    private javax.swing.JButton Menos27;
    private javax.swing.JButton Menos28;
    private javax.swing.JButton Menos29;
    private javax.swing.JButton Menos3;
    private javax.swing.JButton Menos30;
    private javax.swing.JButton Menos31;
    private javax.swing.JButton Menos32;
    private javax.swing.JButton Menos33;
    private javax.swing.JButton Menos34;
    private javax.swing.JButton Menos35;
    private javax.swing.JButton Menos4;
    private javax.swing.JButton Menos5;
    private javax.swing.JButton Menos6;
    private javax.swing.JButton Menos7;
    private javax.swing.JButton Menos8;
    private javax.swing.JButton Menos9;
    private javax.swing.JTextField NPadron;
    private javax.swing.JTextField NPadron1;
    private javax.swing.JTextField NPadron2;
    private javax.swing.JTextField NPadron3;
    private javax.swing.JTextField NPadron4;
    private javax.swing.JTextField NPadron5;
    private javax.swing.JTextField NPadron6;
    private javax.swing.JTextField NPadron7;
    private javax.swing.JTextField NPadron8;
    private javax.swing.JTextField NPadron9;
    private javax.swing.JTextField ObsV;
    private javax.swing.JTextField ObsV1;
    private javax.swing.JTextField ObsV2;
    private javax.swing.JTextField ObsV3;
    private javax.swing.JTextField ObsV4;
    private javax.swing.JTextField ObsV5;
    private javax.swing.JTextField ObsV6;
    private javax.swing.JTextField ObsV7;
    private javax.swing.JTextField ObsV8;
    private javax.swing.JTextField ObsV9;
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel Panel2;
    private javax.swing.JComboBox<String> Servicio;
    private javax.swing.JComboBox<String> Servicio1;
    private javax.swing.JTextField Servicio10;
    private javax.swing.JTextField Servicio11;
    private javax.swing.JTextField Servicio12;
    private javax.swing.JTextField Servicio13;
    private javax.swing.JTextField Servicio14;
    private javax.swing.JTextField Servicio15;
    private javax.swing.JTextField Servicio16;
    private javax.swing.JTextField Servicio17;
    private javax.swing.JTextField Servicio18;
    private javax.swing.JTextField Servicio19;
    private javax.swing.JComboBox<String> Servicio2;
    private javax.swing.JTextField Servicio20;
    private javax.swing.JTextField Servicio21;
    private javax.swing.JTextField Servicio22;
    private javax.swing.JTextField Servicio23;
    private javax.swing.JTextField Servicio24;
    private javax.swing.JTextField Servicio25;
    private javax.swing.JTextField Servicio26;
    private javax.swing.JTextField Servicio27;
    private javax.swing.JTextField Servicio28;
    private javax.swing.JTextField Servicio29;
    private javax.swing.JComboBox<String> Servicio3;
    private javax.swing.JComboBox<String> Servicio4;
    private javax.swing.JComboBox<String> Servicio5;
    private javax.swing.JComboBox<String> Servicio6;
    private javax.swing.JComboBox<String> Servicio7;
    private javax.swing.JComboBox<String> Servicio8;
    private javax.swing.JComboBox<String> Servicio9;
    private javax.swing.JLabel TDG;
    private javax.swing.JLabel TDG1;
    private javax.swing.JLabel TDIDP;
    private javax.swing.JLabel TDIDS;
    private javax.swing.JLabel TDSYP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    // End of variables declaration//GEN-END:variables
}
