/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public class AltasZyS_3 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    /**
     * Creates new form AltasZyS_3
     */
    public AltasZyS_3() {
        initComponents();
        IDS.setVisible(false);
        IDZ.setVisible(false);
        Zona.setVisible(false);
        mostrarZonas();
        mostrarServicios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void modS() {
        int id = Integer.parseInt(IDS.getText());
        String SQL = "UPDATE servicio SET `Servico` = ?, `idZona`= ? WHERE (`idZona` = ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, NS.getText());
            pst.setString(2, Zona.getText());
            pst.setInt(3, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Servicio Modificado");
            mostrarServicios();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage());
        }
    }

    public void modZ() {
        int id = Integer.parseInt(IDZ.getText());
        String SQL = "UPDATE zona SET `Zonas` = ? WHERE (`idZona` = ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, NZ.getText());
            pst.setInt(2, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Zona Modificada.");
            mostrarZonas();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage());
        }
    }

    public void eliminarS() {

        try {

            int filaseleccionada = TServ.getSelectedRow();
            String sql = "delete from servicio where idServ=" + TServ.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "El servicio a sido eliminado.");
                mostrarServicios();
                clearServ();
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Servicio: " + e.getMessage());

        }

    }

    public void eliminarZ() {

        try {

            int filaseleccionada = TablaZona.getSelectedRow();
            String sql = "delete from zona where idZona=" + TablaZona.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "La Zona a sido eliminada.");
                mostrarZonas();
                clearzone();
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Zona: " + e.getMessage());

        }

    }

    public void AgregarZ() {

        String SQL = "INSERT INTO `confort`.`zona` (`Zonas`) VALUES (?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, NZ.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Zona agregada.");
            mostrarZonas();
            clearzone();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar: " + e.getMessage());
        }
    }

    public void AgregarS() {

        String SQL = "INSERT INTO `confort`.`servicio` (`idZona`, `Servicio`) VALUES (?, ?);";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, Zona.getText());
            pst.setString(2, NS.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Servicio agregado.");
            mostrarServicios();
            clearServ();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar: " + e.getMessage());
        }
    }

    private void clearServ() {
        NS.setText("");
        IDS.setText("");
        Zona.setText("");
    }

    private void clearzone() {
        NZ.setText("");
        IDZ.setText("");
    }

    private void mostrarServicios() {
        String[] titulos = {"ID Servicio", "Zona", "Servicio"};

        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "select * from servicio ";

        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("idServ");
                registros[1] = rs.getString("idZona");
                registros[2] = rs.getString("Servicio");

                modelo.addRow(registros);
            }
            TServ.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos " + e.getMessage());
        }

    }

    private void mostrarZonas() {
        String[] titulos = {"ID de Zona", "Nombre de Zona"};

        String[] registros = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "select * from zona ";

        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("idZona");
                registros[1] = rs.getString("Zonas");

                modelo.addRow(registros);
            }
            TablaZona.setModel(modelo);
            ZSh.setModel(modelo);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos " + e.getMessage());
        }

    }

    private void buscarS(String buscar) {
        String[] titulos = {"ID Serv", "Zona", "Servicio"};
        String[] registros = new String[3];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "SELECT * FROM servicio WHERE `Servicio` LIKE '%" + buscar + "%'";
        //+ " OR `Apellido_P_E` LIKE '%" + buscar + "%' OR `Apellido_M_E` LIKE '%" + buscar + "%'"; este es para buscar por 2+ filtros
        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("idServ");
                registros[1] = rs.getString("idZona");
                registros[2] = rs.getString("Servicio");

                modelo.addRow(registros);
            }
            TServ.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos: " + e.getMessage());
        }

    }

    private void buscarZh(String buscar) {
        String[] titulos = {"ID zona", "Nombre Zona"};
        String[] registros = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "SELECT * FROM zona WHERE `Zonas` LIKE '%" + buscar + "%'";
        //+ " OR `Apellido_P_E` LIKE '%" + buscar + "%' OR `Apellido_M_E` LIKE '%" + buscar + "%'"; este es para buscar por 2+ filtros
        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("idZona");
                registros[1] = rs.getString("Zonas");

                modelo.addRow(registros);
            }
            ZSh.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos: " + e.getMessage());
        }

    }

    private void buscarZ(String buscar) {
        String[] titulos = {"ID zona", "Nombre Zona"};
        String[] registros = new String[2];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "SELECT * FROM zona WHERE `Zonas` LIKE '%" + buscar + "%'";
        //+ " OR `Apellido_P_E` LIKE '%" + buscar + "%' OR `Apellido_M_E` LIKE '%" + buscar + "%'"; este es para buscar por 2+ filtros
        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("idZona");
                registros[1] = rs.getString("Zonas");

                modelo.addRow(registros);
            }
            TablaZona.setModel(modelo);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos: " + e.getMessage());
        }

    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AgregarZ = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaZona = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        BZ = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        NZ = new javax.swing.JTextArea();
        IDZ = new javax.swing.JTextField();
        EliminarZ = new javax.swing.JButton();
        ModZ = new javax.swing.JButton();
        Volver1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ZSh = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        IDS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        BZS = new javax.swing.JTextField();
        AgrergarS = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        NS = new javax.swing.JTextArea();
        ModS = new javax.swing.JButton();
        Zona = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TServ = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        BS = new javax.swing.JTextField();
        EliminarS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de la zona:");

        AgregarZ.setText("Agregar Zona");
        AgregarZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarZActionPerformed(evt);
            }
        });

        TablaZona.setModel(new javax.swing.table.DefaultTableModel(
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
        TablaZona.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaZonaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TablaZona);

        jLabel2.setText("Buscar Zona:");

        BZ.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BZKeyReleased(evt);
            }
        });

        NZ.setColumns(20);
        NZ.setLineWrap(true);
        NZ.setRows(5);
        jScrollPane5.setViewportView(NZ);

        EliminarZ.setText("Eliminar");
        EliminarZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarZActionPerformed(evt);
            }
        });

        ModZ.setText("Modificar");
        ModZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModZActionPerformed(evt);
            }
        });

        Volver1.setText("Volver");
        Volver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(IDZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Volver1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(AgregarZ)
                        .addGap(30, 30, 30)
                        .addComponent(ModZ)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BZ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarZ))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(EliminarZ))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(IDZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ModZ)
                                    .addComponent(AgregarZ))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volver1)))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Alta de Zonas", jScrollPane1);

        ZSh.setModel(new javax.swing.table.DefaultTableModel(
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
        ZSh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ZShMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ZSh);

        jLabel3.setText("Nombre del servicio:");

        jLabel4.setText("Buscar Zona:");

        BZS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BZSKeyReleased(evt);
            }
        });

        AgrergarS.setText("Agregar Servicio");
        AgrergarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrergarSActionPerformed(evt);
            }
        });

        NS.setColumns(20);
        NS.setRows(5);
        jScrollPane6.setViewportView(NS);

        ModS.setText("Modificar");
        ModS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModSActionPerformed(evt);
            }
        });

        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(AgrergarS)
                        .addGap(18, 18, 18)
                        .addComponent(ModS))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Volver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BZS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BZS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AgrergarS)
                            .addComponent(ModS))
                        .addGap(299, 299, 299)
                        .addComponent(Volver))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 98, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Alta de Servicios", jScrollPane2);

        TServ.setModel(new javax.swing.table.DefaultTableModel(
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
        TServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TServMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TServ);

        jLabel5.setText("Buscar Servicio:");

        BS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BSKeyReleased(evt);
            }
        });

        EliminarS.setText("Eliminar");
        EliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarS)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane8.setViewportView(jPanel3);

        jTabbedPane1.addTab("Tabla servicios", jScrollPane8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarZActionPerformed
        // TODO add your handling code here:
        AgregarZ();
    }//GEN-LAST:event_AgregarZActionPerformed

    private void BZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BZKeyReleased
        // TODO add your handling code here:
        buscarZ(BZ.getText());
    }//GEN-LAST:event_BZKeyReleased

    private void BZSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BZSKeyReleased
        // TODO add your handling code here:
        buscarZh(BZS.getText());
    }//GEN-LAST:event_BZSKeyReleased

    private void ModZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModZActionPerformed
        // TODO add your handling code here:
        modZ();
    }//GEN-LAST:event_ModZActionPerformed

    private void EliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarSActionPerformed
        // TODO add your handling code here:
        eliminarS();
    }//GEN-LAST:event_EliminarSActionPerformed

    private void EliminarZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarZActionPerformed
        // TODO add your handling code here:
        eliminarZ();
    }//GEN-LAST:event_EliminarZActionPerformed

    private void BSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BSKeyReleased
        // TODO add your handling code here:
        buscarS(BS.getText());
    }//GEN-LAST:event_BSKeyReleased

    private void TablaZonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaZonaMouseClicked
        // TODO add your handling code here:
        int seleccionar = TablaZona.getSelectedRow();
        IDZ.setText(String.valueOf(TablaZona.getValueAt(seleccionar, 0)));
        NZ.setText(String.valueOf(TablaZona.getValueAt(seleccionar, 1)));

    }//GEN-LAST:event_TablaZonaMouseClicked

    private void ZShMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZShMouseClicked
        // TODO add your handling code here:
        int seleccionar = ZSh.getSelectedRow();
        Zona.setText(String.valueOf(ZSh.getValueAt(seleccionar, 0)));
        
    }//GEN-LAST:event_ZShMouseClicked

    private void TServMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TServMouseClicked
        // TODO add your handling code here:
        int seleccionar = TServ.getSelectedRow();
        IDS.setText(String.valueOf(TServ.getValueAt(seleccionar, 0)));
        Zona.setText(String.valueOf(TServ.getValueAt(seleccionar, 1)));
        NS.setText(String.valueOf(TServ.getValueAt(seleccionar, 2)));

    }//GEN-LAST:event_TServMouseClicked

    private void AgrergarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrergarSActionPerformed
        // TODO add your handling code here:
        AgregarS();
    }//GEN-LAST:event_AgrergarSActionPerformed

    private void ModSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModSActionPerformed
        // TODO add your handling code here:
        modS();
    }//GEN-LAST:event_ModSActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        Administradores_3 Form = new Administradores_3();
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VolverActionPerformed

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        Administradores_3 Form = new Administradores_3();
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Volver1ActionPerformed

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
            java.util.logging.Logger.getLogger(AltasZyS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltasZyS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltasZyS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltasZyS_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AltasZyS_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarZ;
    private javax.swing.JButton AgrergarS;
    private javax.swing.JTextField BS;
    private javax.swing.JTextField BZ;
    private javax.swing.JTextField BZS;
    private javax.swing.JButton EliminarS;
    private javax.swing.JButton EliminarZ;
    private javax.swing.JTextField IDS;
    private javax.swing.JTextField IDZ;
    private javax.swing.JButton ModS;
    private javax.swing.JButton ModZ;
    private javax.swing.JTextArea NS;
    private javax.swing.JTextArea NZ;
    private javax.swing.JTable TServ;
    private javax.swing.JTable TablaZona;
    private javax.swing.JButton Volver;
    private javax.swing.JButton Volver1;
    private javax.swing.JTable ZSh;
    private javax.swing.JTextField Zona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
