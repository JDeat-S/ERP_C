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
        Fecha15 = new com.toedter.calendar.JDateChooser();
        Importe11 = new javax.swing.JTextField();
        Importe12 = new javax.swing.JTextField();
        Importe13 = new javax.swing.JTextField();
        Importe14 = new javax.swing.JTextField();
        Importe15 = new javax.swing.JTextField();
        Servicio13 = new javax.swing.JTextField();
        Servicio14 = new javax.swing.JTextField();
        Servicio15 = new javax.swing.JTextField();
        Fecha11 = new com.toedter.calendar.JDateChooser();
        Fecha12 = new com.toedter.calendar.JDateChooser();
        Fecha13 = new com.toedter.calendar.JDateChooser();
        Fecha14 = new com.toedter.calendar.JDateChooser();
        Fecha16 = new com.toedter.calendar.JDateChooser();
        Fecha17 = new com.toedter.calendar.JDateChooser();
        Fecha18 = new com.toedter.calendar.JDateChooser();
        Fecha19 = new com.toedter.calendar.JDateChooser();
        Importe16 = new javax.swing.JTextField();
        Importe17 = new javax.swing.JTextField();
        Servicio16 = new javax.swing.JTextField();
        Servicio17 = new javax.swing.JTextField();
        Servicio18 = new javax.swing.JTextField();
        Servicio19 = new javax.swing.JTextField();
        Importe18 = new javax.swing.JTextField();
        Importe19 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("SERVICIOS C/COBRO ITURBIDE");

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

        jLabel5.setText("Total de importe de servicios:");

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

        jLabel18.setText("Total de importe de pensiones:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Folio11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Folio19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Servicio12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servicio11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Folio11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servicio11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Folio12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servicio12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Folio19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

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
                                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(TDIDP))
                            .addComponent(jLabel16))
                        .addGap(3, 3, 3)))
                .addGap(3, 3, 3)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
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

        Fecha15.setDateFormatString("dd MMM yyyy ");

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

        Fecha11.setDateFormatString("dd MMM yyyy ");

        Fecha12.setDateFormatString("dd MMM yyyy ");

        Fecha13.setDateFormatString("dd MMM yyyy ");

        Fecha14.setDateFormatString("dd MMM yyyy ");

        Fecha16.setDateFormatString("dd MMM yyyy ");

        Fecha17.setDateFormatString("dd MMM yyyy ");

        Fecha18.setDateFormatString("dd MMM yyyy ");

        Fecha19.setDateFormatString("dd MMM yyyy ");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(Fecha11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Fecha12, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Fecha13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Fecha14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Fecha15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(Importe11, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(Importe12, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Servicio13, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Servicio14, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Importe14, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Importe13, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Servicio15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Importe15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Fecha16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Fecha17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Fecha18, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(Fecha19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Servicio16, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Servicio17, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Servicio18, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Servicio19, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Importe19, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Importe18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Importe17, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Importe16, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Importe11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Importe12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Fecha12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Fecha18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        Fecha11.setVisible(true);
        Servicio11.setVisible(true);
        Importe11.setVisible(true);
        Menos9.setVisible(true);
        Mas9.setVisible(false);
        Mas10.setVisible(true);
    }//GEN-LAST:event_Mas9ActionPerformed

    private void Menos11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos11ActionPerformed
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
        Folio11.setVisible(false);
        Fecha11.setVisible(false);
        Servicio11.setVisible(false);
        Importe11.setVisible(false);
        Menos9.setVisible(false);
        Mas9.setVisible(true);
        Mas10.setVisible(false);
    }//GEN-LAST:event_Menos9ActionPerformed

    private void Mas11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas11ActionPerformed
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
        Folio19.setVisible(true);
        Fecha19.setVisible(true);
        Servicio19.setVisible(true);
        Importe19.setVisible(true);
        Menos16.setVisible(false);
        Menos17.setVisible(true);
        Mas17.setVisible(false);
        //Mas18.setVisible(true);
    }//GEN-LAST:event_Mas17ActionPerformed

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
    private com.toedter.calendar.JDateChooser Fecha3;
    private com.toedter.calendar.JDateChooser Fecha4;
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
    private javax.swing.JTextField Folio3;
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
    private javax.swing.JTextField Importe3;
    private javax.swing.JTextField Importe4;
    private javax.swing.JTextField Importe5;
    private javax.swing.JTextField Importe6;
    private javax.swing.JTextField Importe7;
    private javax.swing.JTextField Importe8;
    private javax.swing.JTextField Importe9;
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
    private javax.swing.JButton Mas2;
    private javax.swing.JButton Mas3;
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
    private javax.swing.JButton Menos2;
    private javax.swing.JButton Menos3;
    private javax.swing.JButton Menos4;
    private javax.swing.JButton Menos5;
    private javax.swing.JButton Menos6;
    private javax.swing.JButton Menos7;
    private javax.swing.JButton Menos8;
    private javax.swing.JButton Menos9;
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
    private javax.swing.JComboBox<String> Servicio3;
    private javax.swing.JComboBox<String> Servicio4;
    private javax.swing.JComboBox<String> Servicio5;
    private javax.swing.JComboBox<String> Servicio6;
    private javax.swing.JComboBox<String> Servicio7;
    private javax.swing.JComboBox<String> Servicio8;
    private javax.swing.JComboBox<String> Servicio9;
    private javax.swing.JLabel TDIDP;
    private javax.swing.JLabel TDIDS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
