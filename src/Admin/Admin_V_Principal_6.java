package Admin;

import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import ZyS.Servicios;
import ZyS.Zonas;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSetMetaData;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class Admin_V_Principal_6 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    /*
     * Creates new form V_Principal
     */
    public Admin_V_Principal_6() {
        initComponents();
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        ZonaBb.setModel(MODELFZS);
        MuestraBb();
        Zonas zz = new Zonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        AgregarZ.setModel(modelzonas);
        FiltrosZonas SeleccionZ = new FiltrosZonas();
        DefaultComboBoxModel SZon = new DefaultComboBoxModel(SeleccionZ.mostrarzonas());
        Zonacbx.setModel(SZon);
        FiltrosZonas FilZ = new FiltrosZonas();
        DefaultComboBoxModel Fzon = new DefaultComboBoxModel(FilZ.mostrarzonas());
        FilZonAlm.setModel(Fzon);

        MDAlm();
        Servart.setVisible(false);
        Servcbx.setVisible(false);
        Zonart.setVisible(false);
        Zonacbx.setVisible(false);
        LabelFilZon.setVisible(false);
        FilZonAlm.setVisible(false);
        Filart.setVisible(false);
        FilServAlm.setVisible(false);
        FilArticulos.setVisible(false);
        Filcanart.setVisible(false);
        AgregarBb.setVisible(false);
        ModBb.setVisible(false);
        ServBb1.setVisible(false);
        NumBb1.setVisible(false);
        MDEntradasBb();
        MDsalidaBb();
    }

    //mostrar entradas de la bd, cambiar .entradas.Bb, falta darle funcion y que muestre los folios disponibles revisar libreta
    public void MDEntradasBb() {
        String SQL = "Select * from `almacen.articulos.entrada.blocks boletaje`";

        if (!"".equals(FilNREntradasBb.getText())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `#registro` like '%" + FilNREntradasBb.getText() + "%'";

        } else if (!"".equals(FilZonEntradasBb.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `Zona` like '%" + FilZonEntradasBb.getSelectedItem().toString() + "%'";

        } else if (!"".equals(FilServEntradasBb.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `Servicio` like '%" + FilServEntradasBb.getSelectedItem().toString() + "%'";

        } else if (!"".equals(((JTextField) FilFechaEntradasBb.getDateEditor().getUiComponent()).getText())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `Fecha` like '%" + ((JTextField) FilFechaEntradasBb.getDateEditor().getUiComponent()).getText() + "%'";

        } else if (!"".equals(FilCanEntradasBb.getText())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `Cantidad` like '%" + FilCanEntradasBb.getText() + "%'";

        } else if (!"".equals(FilFEBb.getText())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `FolioE` like '%" + FilFEBb.getText() + "%'";

        } else if (!"".equals(FilFTBb.getText())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `FolioT` like '%" + FilFTBb.getText() + "%'";

        } else if (!"".equals(FilColorEntradasBb.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos.entrada.blocks boletaje` where `Color` like '%" + FilColorEntradasBb.getSelectedItem().toString() + "%'";

        } else if (!"".equals(FilSerieEntradasBb.getText())) {
            SQL = "select * from ´almacen.articulos.entrada.blocks boletaje´ where `Serie` like '%" + FilSerieEntradasBb.getText() + "%'";

        }

        try {
            DefaultTableModel Tablaarticulos = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };

            TEntradasbb.setModel(Tablaarticulos);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            Tablaarticulos.addColumn("# registro");//1
            Tablaarticulos.addColumn("Zona");
            Tablaarticulos.addColumn("Servicio");
            Tablaarticulos.addColumn("Fecha");
            Tablaarticulos.addColumn("Cantidad");
            Tablaarticulos.addColumn("Primer Folio");
            Tablaarticulos.addColumn("Ultimo Folio");
            Tablaarticulos.addColumn("Color");
            Tablaarticulos.addColumn("Serie");

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25, /*PFD*/ 100, /*UFD*/ 100,
                50, 50};
            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TEntradasbb.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                Tablaarticulos.addRow(filas);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Articulos " + e.getMessage());

        }

    }

    public void MDsalidaBb() {
        String SQL = "Select * from `almacen.articulos.salida.blocks boletaje`";

        if (!"".equals(FilNRSalidasBb.getText())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `#registro` like '%" + FilNRSalidasBb.getText() + "%'";

        } else if (!"".equals(FilZonSalidasBb.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `Zona` like '%" + FilZonSalidasBb.getSelectedItem().toString() + "%'";

        } else if (!"".equals(FilServSalidasBb.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `Servicio` like '%" + FilServSalidasBb.getSelectedItem().toString() + "%'";

        } else if (!"".equals(((JTextField) FilFechaSalidasBb.getDateEditor().getUiComponent()).getText())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `Fecha` like '%" + ((JTextField) FilFechaSalidasBb.getDateEditor().getUiComponent()).getText() + "%'";

        } else if (!"".equals(FilCanSalidasBb.getText())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `Cantidad` like '%" + FilCanSalidasBb.getText() + "%'";

        } else if (!"".equals(FilFEBb.getText())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `FolioE` like '%" + FilFEBb.getText() + "%'";

        } else if (!"".equals(FilFTBb.getText())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `FolioT` like '%" + FilFTBb.getText() + "%'";

        } else if (!"".equals(FilColorSalidasBb.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos.salida.blocks boletaje` where `Color` like '%" + FilColorSalidasBb.getSelectedItem().toString() + "%'";

        } else if (!"".equals(FilSerieSalidasBb.getText())) {
            SQL = "select * from ´almacen.articulos.salida.blocks boletaje´ where `Serie` like '%" + FilSerieSalidasBb.getText() + "%'";

        }

        try {
            DefaultTableModel Tablaarticulos = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };

            Tsalidabb.setModel(Tablaarticulos);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            Tablaarticulos.addColumn("# registro");//1
            Tablaarticulos.addColumn("Zona");
            Tablaarticulos.addColumn("Servicio");
            Tablaarticulos.addColumn("Fecha");
            Tablaarticulos.addColumn("Cantidad");
            Tablaarticulos.addColumn("Primer Folio");
            Tablaarticulos.addColumn("Ultimo Folio");
            Tablaarticulos.addColumn("Color");
            Tablaarticulos.addColumn("Serie");

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25, /*PFD*/ 100, /*UFD*/ 100,
                50, 50};
            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tsalidabb.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                Tablaarticulos.addRow(filas);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Articulos " + e.getMessage());

        }

    }

    public void AgregarEBocksb() {
        String SQL = "INSERT INTO `almacen.articulos." + TRBlocksb.getSelectedItem().toString() + ".blocks boletaje` (`#registro`, `Zona`, "
                + "`Servicio`, `Fecha`, `Cantidad`, `FolioE`, `FolioT`, `Color`, `Serie`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NFBb.getText()));
            pst.setString(2, ZonaBb.getSelectedItem().toString());
            pst.setString(3, ServBb.getSelectedItem().toString());
            pst.setString(4, ((JTextField) FechaBb.getDateEditor().getUiComponent()).getText());
            pst.setString(5, CanBb.getText());
            pst.setString(6, FEBb.getText());
            pst.setString(7, FTBb.getText());
            pst.setString(8, ColorBb.getSelectedItem().toString());
            pst.setString(9, SerieBb.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, TRBlocksb.getSelectedItem().toString() + " agregada.");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar " + TRBlocksb.getSelectedItem().toString() + ": " + e.getMessage());
        }
    }

    public void OperacionBlocksB() {
        int d1 = Integer.parseInt(CanBb.getText());
        int d2 = Integer.parseInt(FEBb.getText());
        int d3 = 100;
        int total = ((d1 * d3) + d2) - 1;
        FTBb.setText("" + total + "");
    }

    public void OperacionBlocksP() {

        int d1 = Integer.parseInt(CanBb.getText());
        int d2 = Integer.parseInt(FEBb.getText());
        int d3 = 50;
        int total = ((d1 * d3) + d2) - 1;
        FTBb.setText("" + total + "");
    }

    public void MuestraBb() {
        String SQL = "SELECT `Cantidad`, `PrimerFolioDisponible`, `UltimoFolioDisponible`"
                + " FROM `almacen.articulos` WHERE `Articulo` LIKE '%Blocks Boletaje%' AND `Zona` LIKE '%" + ZonaBb.getSelectedItem().toString()
                + "%' AND `Servicio` LIKE '%" + ServBb.getSelectedItem().toString() + "%'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                NumBb1.setText(rs.getString("Cantidad"));
                PFDBb.setText(rs.getString("PrimerFolioDisponible"));
                UFDBb.setText(rs.getString("UltimoFolioDisponible"));
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar cantidad de rollos termicos: " + e);

        }

    }

    public void MDAlm() {
        String SQL = "Select * from `almacen.articulos`";

        if (!"".equals(Filcanart.getText())) {
            SQL = "select * from `almacen.articulos` where `Cantidad` LIKE '%" + Filcanart.getText() + "%'";
        } else if (!"".equals(FilArticulos.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos` where `Articulo` LIKE '%" + FilArticulos.getSelectedItem().toString() + "%'";
        }

        try {
            DefaultTableModel Tablaarticulos = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };

            TArticulos.setModel(Tablaarticulos);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            Tablaarticulos.addColumn("# Articulo");//1
            Tablaarticulos.addColumn("Articulo");
            Tablaarticulos.addColumn("Zona");
            Tablaarticulos.addColumn("Servicio");
            Tablaarticulos.addColumn("Cantidad");
            Tablaarticulos.addColumn("Primer Folio Disponible");
            Tablaarticulos.addColumn("Ultimo Folio Disponible");
            Tablaarticulos.addColumn("Siglas");
            Tablaarticulos.addColumn("Serie");

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25, /*PFD*/ 100, /*UFD*/ 100, 100, 100};
            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TArticulos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                Tablaarticulos.addRow(filas);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Articulos " + e.getMessage());

        }
    }

    public void FilZonalm() {
        String SQL = "Select * from `almacen.articulos`";

        if (!"".equals(FilZonAlm.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos` where `Zona` LIKE '%" + FilZonAlm.getSelectedItem().toString() + "%'";
        }
        try {
            DefaultTableModel Tablaarticulos = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };

            TArticulos.setModel(Tablaarticulos);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            Tablaarticulos.addColumn("# Articulo");//1
            Tablaarticulos.addColumn("Articulo");
            Tablaarticulos.addColumn("Zona");
            Tablaarticulos.addColumn("Servicio");
            Tablaarticulos.addColumn("Cantidad");
            Tablaarticulos.addColumn("Primer Folio Disponible");
            Tablaarticulos.addColumn("Ultimo Folio Disponible");

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25, /*PFD*/ 100, /*UFD*/ 100};
            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TArticulos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                Tablaarticulos.addRow(filas);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Articulos " + e.getMessage());

        }
    }

    public void FilServalm() {
        String SQL = "Select * from `almacen.articulos`";

        if (!"".equals(FilServAlm.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos` where `Servicio` LIKE '%" + FilServAlm.getSelectedItem().toString() + "%'";
        }
        try {
            DefaultTableModel Tablaarticulos = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };

            TArticulos.setModel(Tablaarticulos);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            Tablaarticulos.addColumn("# Articulo");//1
            Tablaarticulos.addColumn("Articulo");
            Tablaarticulos.addColumn("Zona");
            Tablaarticulos.addColumn("Servicio");
            Tablaarticulos.addColumn("Cantidad");
            Tablaarticulos.addColumn("Primer Folio Disponible");
            Tablaarticulos.addColumn("Ultimo Folio Disponible");

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25, /*PFD*/ 100, /*UFD*/ 100};
            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TArticulos.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                Tablaarticulos.addRow(filas);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Articulos " + e.getMessage());

        }
    }

    public void ModAr() {
        String SQL = "UPDATE `almacen.articulos` SET `idArticulo` = ?, `Articulo` = ?, `Zona` = ?, "
                + "`Servicio` = ?, `Cantidad` = ? WHERE `almacen.articulos`.`idArticulo` = ?";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NArt.getText()));
            pst.setString(2, SeleccionarArt.getSelectedItem().toString());
            pst.setString(3, Zonacbx.getSelectedItem().toString());
            pst.setString(4, Servcbx.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(CanArt.getText()));
            pst.setInt(6, Integer.parseInt(NArt.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Articulo Modificado");

            NArt.setText("0");
            SeleccionarArt.setSelectedIndex(0);
            CanArt.setText("");
            Zonacbx.setSelectedIndex(0);
            Servcbx.setSelectedIndex(0);
            MDAlm();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar articulo: " + e);

        }

    }

    public void AgregarAr() {
        String SQL = "INSERT INTO `almacen.articulos` (`idArticulo`, `Articulo`, "
                + "`Zona`, `Servicio`, `Cantidad`, `PrimerFolioDisponible`, `UltimoFolioDisponible`) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NArt.getText()));
            pst.setString(2, SeleccionarArt.getSelectedItem().toString());
            pst.setString(3, Zonacbx.getSelectedItem().toString());
            pst.setString(4, Servcbx.getSelectedItem().toString());
            pst.setInt(5, Integer.parseInt(CanArt.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Articulo agregado");

            /*limpiar*/
            NArt.setText("0");
            SeleccionarArt.setSelectedIndex(0);
            CanArt.setText("");
            Zonacbx.setSelectedIndex(0);
            Servcbx.setSelectedIndex(0);
            MDAlm();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar articulo: " + e);

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        SeleccionarArt = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        CanArt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        FilTalm = new javax.swing.JComboBox<>();
        Filart = new javax.swing.JLabel();
        FilArticulos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TArticulos = new javax.swing.JTable();
        Filcanart = new javax.swing.JTextField();
        LabelFilZon = new javax.swing.JLabel();
        FilZonAlm = new javax.swing.JComboBox<>();
        FilServAlm = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        NArt = new javax.swing.JTextField();
        Zonart = new javax.swing.JLabel();
        Zonacbx = new javax.swing.JComboBox<>();
        Servart = new javax.swing.JLabel();
        Servcbx = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        PFDart = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        UFDArt = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        EntradasBv = new javax.swing.JScrollPane();
        PanelEBv = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        FechaBb = new com.toedter.calendar.JDateChooser();
        jLabel26 = new javax.swing.JLabel();
        ZonaBb = new javax.swing.JComboBox<>();
        ServBb = new javax.swing.JComboBox<>();
        AgregarBb = new javax.swing.JButton();
        FTBb = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SerieBb = new javax.swing.JTextField();
        ColorBb = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        CanBb = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FEBb = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TRBlocksb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        NFBb = new javax.swing.JTextField();
        ModBb = new javax.swing.JButton();
        ServBb1 = new javax.swing.JLabel();
        NumBb1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        PFDBb = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        UFDBb = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        FilFechaEntradasBb = new com.toedter.calendar.JDateChooser();
        Fil2Bb = new javax.swing.JLabel();
        FilNREntradasBb = new javax.swing.JTextField();
        FilSerieEntradasBb = new javax.swing.JTextField();
        Fil1Bb = new javax.swing.JLabel();
        FilTablaEnBb = new javax.swing.JComboBox<>();
        FilFTBb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FilFEBb = new javax.swing.JTextField();
        FilCanEntradasBb = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        TEntradasbb = new javax.swing.JTable();
        FilColorEntradasBb = new javax.swing.JComboBox<>();
        FilZonEntradasBb = new javax.swing.JComboBox<>();
        FilServEntradasBb = new javax.swing.JComboBox<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        FilFechaSalidasBb = new com.toedter.calendar.JDateChooser();
        FilSalidas2Bb = new javax.swing.JLabel();
        FilNRSalidasBb = new javax.swing.JTextField();
        FilSerieSalidasBb = new javax.swing.JTextField();
        FilSal1Bb = new javax.swing.JLabel();
        FilTablaSalBb = new javax.swing.JComboBox<>();
        FilSalidaFTBb = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        FilSalFEBb = new javax.swing.JTextField();
        FilCanSalidasBb = new javax.swing.JTextField();
        jScrollPane11 = new javax.swing.JScrollPane();
        Tsalidabb = new javax.swing.JTable();
        FilColorSalidasBb = new javax.swing.JComboBox<>();
        FilZonSalidasBb = new javax.swing.JComboBox<>();
        FilServSalidasBb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LabelPD = new javax.swing.JLabel();
        LabelRD = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        AgregarS = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        AgregarZ = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SeleccionarArt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Articulo", "Blocks Boletaje", "Blocks Padrones", "Blocks RDV", "Blocks RDB", "Rollo termico" }));
        SeleccionarArt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeleccionarArtItemStateChanged(evt);
            }
        });

        jLabel22.setText("Articulo:");

        jLabel23.setText("Cantidad:");

        CanArt.setText("0");
        CanArt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CanArtKeyReleased(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel24.setText("Tabla de Almacen");

        jLabel25.setText("Filtrar por:");

        FilTalm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Zona", "Servicio", "Articulo", "Cantidad" }));
        FilTalm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilTalmItemStateChanged(evt);
            }
        });

        Filart.setText("jLabel26");

        FilArticulos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Blocks Padrones", "Blocks RDV", "Blocks RDB", "Blocks Boletaje", "Rollo termico" }));
        FilArticulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilArticulosItemStateChanged(evt);
            }
        });

        TArticulos.setModel(new javax.swing.table.DefaultTableModel(
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
        TArticulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TArticulosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TArticulos);

        Filcanart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilcanartKeyReleased(evt);
            }
        });

        LabelFilZon.setText("Selecciona Zona:");

        FilZonAlm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        FilZonAlm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilZonAlmItemStateChanged(evt);
            }
        });

        FilServAlm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FilServAlm.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FilServAlmItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilTalm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFilZon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilZonAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilServAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filcanart, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(FilTalm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filart)
                    .addComponent(FilArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filcanart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(LabelFilZon)
                    .addComponent(FilZonAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilServAlm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");

        jLabel12.setText("# Articulo");

        NArt.setText("0");

        Zonart.setText("Zona:");

        Zonacbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Zonacbx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ZonacbxItemStateChanged(evt);
            }
        });

        Servart.setText("Servicio:");

        Servcbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        jLabel36.setText("Primer folio disponible:");

        PFDart.setText("0");

        jLabel38.setText("Ultimo folio disponible:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Zonart)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NArt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(SeleccionarArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CanArt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Zonacbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Servart)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Servcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PFDart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UFDArt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 489, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(SeleccionarArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(CanArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jLabel12)
                    .addComponent(NArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zonart)
                    .addComponent(Zonacbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Servart)
                    .addComponent(Servcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(PFDart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38)
                    .addComponent(UFDArt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Almacen", jScrollPane2);

        jLabel14.setText("Zona:");

        jLabel20.setText("Fecha:");

        jLabel26.setText("Servicio:");

        ZonaBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        ZonaBb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ZonaBbItemStateChanged(evt);
            }
        });

        ServBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        ServBb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ServBbItemStateChanged(evt);
            }
        });

        AgregarBb.setText("Agregar registro");
        AgregarBb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarBbActionPerformed(evt);
            }
        });

        FTBb.setEditable(false);
        FTBb.setText("0");

        jLabel7.setText("Empieza.");

        jLabel8.setText("Termina");

        ColorBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gris", "Gris/Azul", "Negro/Gris", "Verde/Blanco", "Verde", "Rosa", "Azul Marino", "Azul/Verde", "Lila", "Gris/Blanco", "Rojo", "Rojo/Gris", "Rosa/Gris", "Blanco/Azul", "Naranja" }));

        jLabel11.setText("Serie:");

        CanBb.setText("0");
        CanBb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CanBbKeyReleased(evt);
            }
        });

        jLabel5.setText("Cantidad");

        FEBb.setText("0");
        FEBb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FEBbKeyReleased(evt);
            }
        });

        jLabel6.setText("Folio:");

        jLabel10.setText("Color:");

        jLabel1.setText("Tipo de registro");

        TRBlocksb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "entrada", "salida" }));
        TRBlocksb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TRBlocksbItemStateChanged(evt);
            }
        });

        jLabel2.setText("# Registro");

        NFBb.setEditable(false);
        NFBb.setText("0");

        ModBb.setText("Modificar registro");

        ServBb1.setText("Blocks de");

        NumBb1.setText("0");

        jLabel4.setText("Primer folio disponible:");

        PFDBb.setText("0");

        jLabel37.setText("Ultimo folio disponible:");

        UFDBb.setText("0");

        Fil2Bb.setText("jLabel36");

        Fil1Bb.setText("jLabel4");

        FilTablaEnBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "# Registro", "Zona", "Servicio", "Fecha de registro", "Cantidad", "Folio incio", "Folio termino", "Color", "Serie" }));

        jLabel3.setText("Filtrar por:");

        TEntradasbb.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(TEntradasbb);

        FilColorEntradasBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Gris", "Gris/Azul", "Negro/Gris", "Verde/Blanco", "Verde", "Rosa", "Azul Marino", "Azul/Verde", "Lila", "Gris/Blanco", "Rojo", "Rojo/Gris", "Rosa/Gris", "Blanco/Azul", "Naranja" }));

        FilZonEntradasBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        FilServEntradasBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilTablaEnBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fil1Bb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilNREntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilZonEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilFechaEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilCanEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilFEBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilFTBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilColorEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilSerieEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fil2Bb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilServEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 154, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(FilTablaEnBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fil1Bb)
                        .addComponent(FilNREntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Fil2Bb)
                        .addComponent(FilCanEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilFEBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilFTBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilSerieEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilColorEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilZonEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilServEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FilFechaEntradasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane7.setViewportView(jPanel5);

        jTabbedPane3.addTab("Entradas", jScrollPane7);

        FilSalidas2Bb.setText("jLabel36");

        FilSal1Bb.setText("jLabel4");

        FilTablaSalBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar filtro", "# Registro", "Zona", "Servicio", "Fecha de registro", "Cantidad", "Folio incio", "Folio termino", "Color", "Serie" }));

        jLabel27.setText("Filtrar por:");

        Tsalidabb.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(Tsalidabb);

        FilColorSalidasBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Gris", "Gris/Azul", "Negro/Gris", "Verde/Blanco", "Verde", "Rosa", "Azul Marino", "Azul/Verde", "Lila", "Gris/Blanco", "Rojo", "Rojo/Gris", "Rosa/Gris", "Blanco/Azul", "Naranja" }));

        FilZonSalidasBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        FilServSalidasBb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1082, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilTablaSalBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilSal1Bb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilNRSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilZonSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilFechaSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilCanSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilSalFEBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilSalidaFTBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilColorSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilSerieSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilSalidas2Bb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilServSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel27)
                        .addComponent(FilTablaSalBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilSal1Bb)
                        .addComponent(FilNRSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilSalidas2Bb)
                        .addComponent(FilCanSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilSalFEBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilSalidaFTBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilSerieSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilColorSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilZonSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilServSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FilFechaSalidasBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane10.setViewportView(jPanel7);

        jTabbedPane3.addTab("Salidas", jScrollPane10);

        javax.swing.GroupLayout PanelEBvLayout = new javax.swing.GroupLayout(PanelEBv);
        PanelEBv.setLayout(PanelEBvLayout);
        PanelEBvLayout.setHorizontalGroup(
            PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEBvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEBvLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NFBb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ZonaBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ServBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FechaBb, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelEBvLayout.createSequentialGroup()
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEBvLayout.createSequentialGroup()
                                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEBvLayout.createSequentialGroup()
                                        .addComponent(FEBb, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEBvLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)))
                                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEBvLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel8))
                                    .addComponent(FTBb, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(297, 297, 297)
                                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ServBb1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumBb1)
                                    .addComponent(PFDBb)
                                    .addComponent(UFDBb)))
                            .addGroup(PanelEBvLayout.createSequentialGroup()
                                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(SerieBb, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ColorBb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AgregarBb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ModBb))))
                    .addGroup(PanelEBvLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CanBb, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TRBlocksb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelEBvLayout.createSequentialGroup()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        PanelEBvLayout.setVerticalGroup(
            PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEBvLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(ZonaBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel26)
                        .addComponent(ServBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20)
                        .addComponent(jLabel2)
                        .addComponent(NFBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(FechaBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEBvLayout.createSequentialGroup()
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(CanBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(TRBlocksb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(FEBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FTBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEBvLayout.createSequentialGroup()
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumBb1)
                            .addComponent(ServBb1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(PFDBb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(UFDBb))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ColorBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEBvLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SerieBb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(AgregarBb)
                    .addComponent(ModBb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        EntradasBv.setViewportView(PanelEBv);

        jTabbedPane2.addTab("Registro", EntradasBv);

        jScrollPane4.setViewportView(jTabbedPane2);

        jTabbedPane1.addTab("Blocks de Boletaje", jScrollPane4);

        jLabel15.setText("Blocks RDV Disponibles:");

        jLabel16.setText("Blocks RDB Disponibles:");

        jCheckBox1.setText("Desactivar iniciales.");

        jLabel17.setText("0");

        jLabel18.setText("0");

        jLabel19.setText("Blocks Padrones Disponibles:");

        LabelPD.setText("0");

        LabelRD.setText("0");

        jLabel9.setText("Rollos Termicos Disponibles:");

        jLabel21.setText("Servicio:");

        AgregarS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setText("Zona:");

        AgregarZ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        AgregarZ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AgregarZItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(814, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AgregarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPD)))
                        .addContainerGap(936, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelRD)))
                        .addGap(0, 1054, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(AgregarZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(AgregarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 438, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(LabelRD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(LabelPD))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel17))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel18))
                .addGap(15, 15, 15))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Rollos termicos", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1242, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarZItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AgregarZItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Zonas zon = (Zonas) AgregarZ.getSelectedItem();
            Servicios serv = new Servicios();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            AgregarS.setModel(modelServicio);
        }
    }//GEN-LAST:event_AgregarZItemStateChanged

    private void SeleccionarArtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SeleccionarArtItemStateChanged
        if (SeleccionarArt.getSelectedItem().toString().equals("Selecciona Articulo")) {
            Servart.setVisible(false);
            Servcbx.setVisible(false);
            Zonart.setVisible(false);
            Zonacbx.setVisible(false);
        }
        if (SeleccionarArt.getSelectedItem().toString().equals("Blocks Boletaje")) {
            Servart.setVisible(true);
            Servcbx.setVisible(true);
            Zonart.setVisible(true);
            Zonacbx.setVisible(true);
        }
        if (SeleccionarArt.getSelectedItem().toString().equals("Blocks Padrones")) {
            Servart.setVisible(true);
            Servcbx.setVisible(true);
            Zonart.setVisible(true);
            Zonacbx.setVisible(true);
        }
        if (SeleccionarArt.getSelectedItem().toString().equals("Blocks RDV")) {
            Servart.setVisible(false);
            Servcbx.setVisible(false);
            Zonart.setVisible(false);
            Zonacbx.setVisible(false);
        }
        if (SeleccionarArt.getSelectedItem().toString().equals("Blocks RDB")) {
            Servart.setVisible(false);
            Servcbx.setVisible(false);
            Zonart.setVisible(false);
            Zonacbx.setVisible(false);
        }
        if (SeleccionarArt.getSelectedItem().toString().equals("Rollo termico")) {
            Servart.setVisible(false);
            Servcbx.setVisible(false);
            Zonart.setVisible(false);
            Zonacbx.setVisible(false);
        }

    }//GEN-LAST:event_SeleccionarArtItemStateChanged

    private void FEBbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FEBbKeyReleased
        OperacionBlocksB();

    }//GEN-LAST:event_FEBbKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        AgregarAr();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void FilArticulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilArticulosItemStateChanged
        MDAlm();
    }//GEN-LAST:event_FilArticulosItemStateChanged

    private void FilcanartKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilcanartKeyReleased
        MDAlm();
    }//GEN-LAST:event_FilcanartKeyReleased

    private void TArticulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TArticulosMouseClicked
        DefaultTableModel model = (DefaultTableModel) TArticulos.getModel();
        int fila = TArticulos.getSelectedRow();
        NArt.setText(String.valueOf(TArticulos.getValueAt(fila, 0)));
        String Artcbx = model.getValueAt(fila, 1).toString();
        for (int i = 0; i < SeleccionarArt.getItemCount(); i++) {
            if (SeleccionarArt.getItemAt(i).equalsIgnoreCase(Artcbx)) {
                SeleccionarArt.setSelectedIndex(i);
            }
        }

        CanArt.setText(String.valueOf(TArticulos.getValueAt(fila, 4)));
    }//GEN-LAST:event_TArticulosMouseClicked

    private void ZonacbxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ZonacbxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) Zonacbx.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            Servcbx.setModel(modelServicio);
        }
    }//GEN-LAST:event_ZonacbxItemStateChanged

    private void FilZonAlmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilZonAlmItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FilZonAlm.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FilServAlm.setModel(modelServicio);
        }
        FilZonalm();
    }//GEN-LAST:event_FilZonAlmItemStateChanged

    private void FilServAlmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilServAlmItemStateChanged
        FilServalm();

    }//GEN-LAST:event_FilServAlmItemStateChanged

    private void FilTalmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilTalmItemStateChanged
        if (FilTalm.getSelectedItem().toString().equals("Selecciona filtro")) {
            LabelFilZon.setVisible(false);
            FilZonAlm.setVisible(false);
            Filart.setVisible(false);
            FilServAlm.setVisible(false);
            FilArticulos.setVisible(false);
            Filcanart.setVisible(false);
            FilZonAlm.setSelectedIndex(0);
            FilServAlm.setSelectedIndex(0);
            Filcanart.setText("");
            FilArticulos.setSelectedIndex(0);

        }
        if (FilTalm.getSelectedItem().toString().equals("Zona")) {
            LabelFilZon.setVisible(true);
            FilZonAlm.setVisible(true);
            FilZonAlm.setSelectedIndex(0);
            Filart.setVisible(false);
            FilServAlm.setVisible(false);
            FilServAlm.setSelectedIndex(0);
            FilArticulos.setVisible(false);
            FilArticulos.setSelectedIndex(0);
            Filcanart.setVisible(false);
            Filcanart.setText("");
        }
        if (FilTalm.getSelectedItem().toString().equals("Servicio")) {
            LabelFilZon.setVisible(true);
            FilZonAlm.setVisible(true);
            Filart.setVisible(true);
            Filart.setText("Selecciona servicio:");
            FilServAlm.setVisible(true);
            FilZonAlm.setSelectedIndex(0);
            FilServAlm.setSelectedIndex(0);
            FilArticulos.setVisible(false);
            FilArticulos.setSelectedIndex(0);
            Filcanart.setVisible(false);
            Filcanart.setText("");
        }
        if (FilTalm.getSelectedItem().toString().equals("Articulo")) {
            LabelFilZon.setVisible(false);
            FilZonAlm.setVisible(false);
            Filart.setVisible(true);
            Filart.setText("Selecciona Articulo:");
            FilServAlm.setVisible(false);
            FilZonAlm.setSelectedIndex(0);
            FilServAlm.setSelectedIndex(0);
            FilArticulos.setVisible(true);
            FilArticulos.setSelectedIndex(0);
            Filcanart.setVisible(false);
            Filcanart.setText("");
        }
        if (FilTalm.getSelectedItem().toString().equals("Cantidad")) {
            LabelFilZon.setVisible(false);
            FilZonAlm.setVisible(false);
            Filart.setVisible(true);
            Filart.setText("Escribe cantidad:");
            FilServAlm.setVisible(false);
            FilZonAlm.setSelectedIndex(0);
            FilServAlm.setSelectedIndex(0);
            FilArticulos.setVisible(false);
            FilArticulos.setSelectedIndex(0);
            Filcanart.setVisible(true);
            Filcanart.setText("");
        }

    }//GEN-LAST:event_FilTalmItemStateChanged

    private void ZonaBbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ZonaBbItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) ZonaBb.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            ServBb.setModel(modelServicio);
        }
        ServBb1.setVisible(false);
        NumBb1.setVisible(false);
    }//GEN-LAST:event_ZonaBbItemStateChanged

    private void ServBbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ServBbItemStateChanged
        ServBb1.setVisible(true);
        ServBb1.setText("Blocks de " + ServBb.getSelectedItem().toString() + ": ");
        ServBb1.setVisible(true);
        NumBb1.setVisible(true);
        MuestraBb();

    }//GEN-LAST:event_ServBbItemStateChanged

    private void CanBbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CanBbKeyReleased
        OperacionBlocksB();
    }//GEN-LAST:event_CanBbKeyReleased

    private void AgregarBbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarBbActionPerformed
        AgregarEBocksb();
    }//GEN-LAST:event_AgregarBbActionPerformed

    private void TRBlocksbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TRBlocksbItemStateChanged
        if (TRBlocksb.getSelectedItem().toString().equals(".")) {
            AgregarBb.setVisible(false);
            ModBb.setVisible(false);

        }
        if (TRBlocksb.getSelectedItem().toString().equals("entrada")) {
            AgregarBb.setText("Agregar " + TRBlocksb.getSelectedItem().toString());
            AgregarBb.setVisible(true);
            ModBb.setVisible(true);
            ModBb.setText("Modificar " + TRBlocksb.getSelectedItem().toString());

        }
        if (TRBlocksb.getSelectedItem().toString().equals("salida")) {
            AgregarBb.setText("Agregar " + TRBlocksb.getSelectedItem().toString());
            AgregarBb.setVisible(true);
            ModBb.setVisible(true);
            ModBb.setText("Modificar " + TRBlocksb.getSelectedItem().toString());
        }
    }//GEN-LAST:event_TRBlocksbItemStateChanged

    private void CanArtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CanArtKeyReleased
        int d1 = Integer.parseInt(CanArt.getText());
        int d2 = Integer.parseInt(PFDart.getText());
        int d3 = 100;
        int total = ((d1 * d3) + d2) - 1;
        UFDArt.setText("" + total + "");
    }//GEN-LAST:event_CanArtKeyReleased

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
            java.util.logging.Logger.getLogger(Admin_V_Principal_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_V_Principal_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_V_Principal_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_V_Principal_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_V_Principal_6().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarBb;
    private javax.swing.JComboBox<String> AgregarS;
    private javax.swing.JComboBox<String> AgregarZ;
    private javax.swing.JTextField CanArt;
    private javax.swing.JTextField CanBb;
    private javax.swing.JComboBox<String> ColorBb;
    private javax.swing.JScrollPane EntradasBv;
    private javax.swing.JTextField FEBb;
    private javax.swing.JTextField FTBb;
    private com.toedter.calendar.JDateChooser FechaBb;
    private javax.swing.JLabel Fil1Bb;
    private javax.swing.JLabel Fil2Bb;
    private javax.swing.JComboBox<String> FilArticulos;
    private javax.swing.JTextField FilCanEntradasBb;
    private javax.swing.JTextField FilCanSalidasBb;
    private javax.swing.JComboBox<String> FilColorEntradasBb;
    private javax.swing.JComboBox<String> FilColorSalidasBb;
    private javax.swing.JTextField FilFEBb;
    private javax.swing.JTextField FilFTBb;
    private com.toedter.calendar.JDateChooser FilFechaEntradasBb;
    private com.toedter.calendar.JDateChooser FilFechaSalidasBb;
    private javax.swing.JTextField FilNREntradasBb;
    private javax.swing.JTextField FilNRSalidasBb;
    private javax.swing.JLabel FilSal1Bb;
    private javax.swing.JTextField FilSalFEBb;
    private javax.swing.JTextField FilSalidaFTBb;
    private javax.swing.JLabel FilSalidas2Bb;
    private javax.swing.JTextField FilSerieEntradasBb;
    private javax.swing.JTextField FilSerieSalidasBb;
    private javax.swing.JComboBox<String> FilServAlm;
    private javax.swing.JComboBox<String> FilServEntradasBb;
    private javax.swing.JComboBox<String> FilServSalidasBb;
    private javax.swing.JComboBox<String> FilTablaEnBb;
    private javax.swing.JComboBox<String> FilTablaSalBb;
    private javax.swing.JComboBox<String> FilTalm;
    private javax.swing.JComboBox<String> FilZonAlm;
    private javax.swing.JComboBox<String> FilZonEntradasBb;
    private javax.swing.JComboBox<String> FilZonSalidasBb;
    private javax.swing.JLabel Filart;
    private javax.swing.JTextField Filcanart;
    private javax.swing.JLabel LabelFilZon;
    private javax.swing.JLabel LabelPD;
    private javax.swing.JLabel LabelRD;
    private javax.swing.JButton ModBb;
    private javax.swing.JTextField NArt;
    private javax.swing.JTextField NFBb;
    private javax.swing.JLabel NumBb1;
    private javax.swing.JLabel PFDBb;
    private javax.swing.JTextField PFDart;
    private javax.swing.JPanel PanelEBv;
    private javax.swing.JComboBox<String> SeleccionarArt;
    private javax.swing.JTextField SerieBb;
    private javax.swing.JComboBox<String> ServBb;
    private javax.swing.JLabel ServBb1;
    private javax.swing.JLabel Servart;
    private javax.swing.JComboBox<String> Servcbx;
    private javax.swing.JTable TArticulos;
    private javax.swing.JTable TEntradasbb;
    private javax.swing.JComboBox<String> TRBlocksb;
    private javax.swing.JTable Tsalidabb;
    private javax.swing.JTextField UFDArt;
    private javax.swing.JLabel UFDBb;
    private javax.swing.JComboBox<String> ZonaBb;
    private javax.swing.JComboBox<String> Zonacbx;
    private javax.swing.JLabel Zonart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    // End of variables declaration//GEN-END:variables
}
