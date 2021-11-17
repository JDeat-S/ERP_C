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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class Admin_V_Principal extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    /*
     * Creates new form V_Principal
     */
    public Admin_V_Principal() {
        initComponents();
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        zona.setModel(MODELFZS);
        Inventarionum();
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

    }

    public void OperacionBlocksB() {
        int d1 = Integer.parseInt(BlocksEboletaje.getText());
        int d2 = Integer.parseInt(FEmpieza.getText());
        int d3 = 100;
        int total = ((d1 * d3) + d2) - 1;
        Ftermina.setText("" + total + "");
    }

    public void OperacionBlocksP() {
        int d1 = Integer.parseInt(BlocksEboletaje.getText());
        int d2 = Integer.parseInt(FEmpieza.getText());
        int d3 = 50;
        int total = ((d1 * d3) + d2) - 1;
        Ftermina.setText("" + total + "");
    }

    public void Inventarionum() {
        String SQLRT = "SELECT `Cantidad` FROM `almacen.articulos` where `Articulo` LIKE '%Rollo termico%'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQLRT);
            while (rs.next()) {

                LabelRD.setText(rs.getString("Cantidad"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar cantidad de rollos termicos: " + e);

        }
        String SQLBP = "SELECT `Cantidad` FROM `almacen.articulos` where `Articulo` LIKE '%Blocks Padrones%'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQLBP);
            while (rs.next()) {

                LabelPD.setText(rs.getString("Cantidad"));

            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al mostrar cantidad de Block de padrones: " + e);

        }

    }

    public void MDAlm() {
        String SQL = "Select * from `almacen.articulos`";

        if (!"".equals(Filcanart.getText())) {
            SQL = "select * from `almacen.articulos` where `Cantidad` LIKE '%" + Filcanart.getText() + "%'";
        } else if (!"".equals(FilArticulos.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos` where `Articulo` LIKE '%" + FilArticulos.getSelectedItem().toString() + "%'";
        } else if (!" ".equals(FilZonAlm.getSelectedItem().toString())) {
            SQL = "select * from `almacen.articulos` where `Zona` LIKE '%" + FilZonAlm.getSelectedItem().toString() + "%'";
        } else if (!" ".equals(FilServAlm.getSelectedItem().toString())) {
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

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25};
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

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25};
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

            int[] anchos = {/*#A*/10, /*Art*/ 50, /*Zona*/ 70, /*Serv*/ 70, /*Can*/ 25};
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
        String SQL = "INSERT INTO `confort`.`almacen.articulos` (`idArticulo`, `Articulo`,"
                + "`Zona`, `Servicio`, `Cantidad`) VALUES (?, ?, ?, ?, ?)";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        zona = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        Serv = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        LabelCDL = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BlocksEboletaje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        FEmpieza = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Ftermina = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        AccionBR = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        LabelPD = new javax.swing.JLabel();
        LabelRD = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        AgregarS = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        AgregarZ = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SeleccionarArt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Articulo", "Blocks Boletaje", "Blocks Padrones", "Blocks RDV", "Blocks RDB", "Rollo termico" }));
        SeleccionarArt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeleccionarArtItemStateChanged(evt);
            }
        });

        jLabel22.setText("Articulo:");

        jLabel23.setText("Cantidad:");

        jLabel24.setText("Tabla de Almacen");

        jLabel25.setText("Filtrar por:");

        FilTalm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Zona", "Servicio", "Articulo", "Cantidad" }));
        FilTalm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FilTalmActionPerformed(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addGap(0, 99, Short.MAX_VALUE)))
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
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
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
                                .addComponent(Servcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                    .addComponent(Servcbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Almacen", jScrollPane2);

        jLabel1.setText("Zona:");

        zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        zona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                zonaItemStateChanged(evt);
            }
        });

        jLabel2.setText("Servicio:");

        Serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        Serv.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ServItemStateChanged(evt);
            }
        });

        jLabel3.setText("Blocks boletaje Disponibles");

        LabelCDL.setText("0");

        jLabel4.setText("Fecha:");

        jLabel5.setText("Cantidad");

        BlocksEboletaje.setText("0");

        jLabel6.setText("Folio:");

        FEmpieza.setText("0");
        FEmpieza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FEmpiezaKeyReleased(evt);
            }
        });

        jLabel7.setText("Empieza.");

        Ftermina.setText("0");

        jLabel8.setText("Termina");

        jLabel15.setText("Blocks RDV Disponibles:");

        jLabel16.setText("Blocks RDB Disponibles:");

        jCheckBox1.setText("Desactivar iniciales.");

        AccionBR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Articulo", "Blocks Padrones", "Blocks RDV", "Blocks RDB", "Blocks Boletaje", "Rollo termico" }));

        jLabel17.setText("0");

        jLabel18.setText("0");

        jLabel19.setText("Blocks Padrones Disponibles:");

        LabelPD.setText("0");

        LabelRD.setText("0");

        jLabel9.setText("Rollos Termicos Disponibles:");

        jLabel10.setText("Color:");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Serie:");

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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelCDL))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPD))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox6, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(FEmpieza, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(17, 17, 17))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel8))
                                            .addComponent(Ftermina, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap(458, Short.MAX_VALUE))
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
                        .addGap(0, 614, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BlocksEboletaje, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(AccionBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AccionBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(BlocksEboletaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(AgregarZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21)
                            .addComponent(AgregarS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(FEmpieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ftermina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(LabelRD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(LabelPD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(LabelCDL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

        jTabbedPane1.addTab("Entradas", jScrollPane1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jScrollPane5.setViewportView(jPanel4);

        jTabbedPane2.addTab("Entradas", jScrollPane5);
        jTabbedPane2.addTab("Salidas", jScrollPane6);

        jScrollPane4.setViewportView(jTabbedPane2);

        jTabbedPane1.addTab("Blocks de voletaje", jScrollPane4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jScrollPane8.setViewportView(jPanel5);

        jTabbedPane3.addTab("Entradas", jScrollPane8);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jScrollPane9.setViewportView(jPanel6);

        jTabbedPane3.addTab("Salidas", jScrollPane9);

        jScrollPane7.setViewportView(jTabbedPane3);

        jTabbedPane1.addTab("Blocks Padrones", jScrollPane7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
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

    private void FEmpiezaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FEmpiezaKeyReleased
        // TODO add your handling code here:
        String dt = (String) AccionBR.getSelectedItem();
        if (dt.equals("Selecciona Articulo")) {

        }
        if (dt.equals("Blocks Padrones")) {
            OperacionBlocksP();
        }
        if (dt.equals("Blocks RDV")) {

        }
        if (dt.equals("Blocks RDB")) {
        }
        if (dt.equals("Blocks Boletaje")) {
            OperacionBlocksB();

        }
        if (dt.equals("Rollo termico")) {
        }
    }//GEN-LAST:event_FEmpiezaKeyReleased

    private void ServItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ServItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ServItemStateChanged

    private void zonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_zonaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) zona.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            Serv.setModel(modelServicio);
        }
        //int xd = zona.getSelectedIndex();
    }//GEN-LAST:event_zonaItemStateChanged

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

    private void FilTalmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FilTalmActionPerformed
        if (FilTalm.getSelectedItem().toString().equals("Selecciona filtro")) {
            LabelFilZon.setVisible(false);
            FilZonAlm.setVisible(false);
            Filart.setVisible(false);
            FilServAlm.setVisible(false);
            FilArticulos.setVisible(false);
            Filcanart.setVisible(false);
        }
        if (FilTalm.getSelectedItem().toString().equals("Zona")) {
            LabelFilZon.setVisible(true);
            FilZonAlm.setVisible(true);
            Filart.setVisible(false);
            FilServAlm.setVisible(false);
            FilArticulos.setVisible(false);
            Filcanart.setVisible(false);
        }
        if (FilTalm.getSelectedItem().toString().equals("Servicio")) {
            LabelFilZon.setVisible(true);
            FilZonAlm.setVisible(true);
            Filart.setVisible(true);
            Filart.setText("Selecciona servicio:");
            FilServAlm.setVisible(true);
            FilArticulos.setVisible(false);
            Filcanart.setVisible(false);
        }
        if (FilTalm.getSelectedItem().toString().equals("Articulo")) {
            LabelFilZon.setVisible(false);
            FilZonAlm.setVisible(false);
            Filart.setVisible(true);
            Filart.setText("Selecciona Articulo:");
            FilServAlm.setVisible(false);
            FilArticulos.setVisible(true);
            Filcanart.setVisible(false);
        }
        if (FilTalm.getSelectedItem().toString().equals("Cantidad")) {
            LabelFilZon.setVisible(false);
            FilZonAlm.setVisible(false);
            Filart.setVisible(true);
            Filart.setText("Escribe cantidad:");
            FilServAlm.setVisible(false);
            FilArticulos.setVisible(false);
            Filcanart.setVisible(true);
        }

    }//GEN-LAST:event_FilTalmActionPerformed

    private void FilServAlmItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FilServAlmItemStateChanged
        FilServalm();

    }//GEN-LAST:event_FilServAlmItemStateChanged

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
            java.util.logging.Logger.getLogger(Admin_V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_V_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_V_Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AccionBR;
    private javax.swing.JComboBox<String> AgregarS;
    private javax.swing.JComboBox<String> AgregarZ;
    private javax.swing.JTextField BlocksEboletaje;
    private javax.swing.JTextField CanArt;
    private javax.swing.JTextField FEmpieza;
    private javax.swing.JComboBox<String> FilArticulos;
    private javax.swing.JComboBox<String> FilServAlm;
    private javax.swing.JComboBox<String> FilTalm;
    private javax.swing.JComboBox<String> FilZonAlm;
    private javax.swing.JLabel Filart;
    private javax.swing.JTextField Filcanart;
    private javax.swing.JTextField Ftermina;
    private javax.swing.JLabel LabelCDL;
    private javax.swing.JLabel LabelFilZon;
    private javax.swing.JLabel LabelPD;
    private javax.swing.JLabel LabelRD;
    private javax.swing.JTextField NArt;
    private javax.swing.JComboBox<String> SeleccionarArt;
    private javax.swing.JComboBox<String> Serv;
    private javax.swing.JLabel Servart;
    private javax.swing.JComboBox<String> Servcbx;
    private javax.swing.JTable TArticulos;
    private javax.swing.JComboBox<String> Zonacbx;
    private javax.swing.JLabel Zonart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables
}
