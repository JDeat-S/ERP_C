package Admin;

import ColoresT.ColorNSD;
import ColoresT.ColorSDS;
import Conexion.ConexionSQL;
import Filtros.FiltrosZonas;
import ColoresT.ColorZyS;
import java.sql.ResultSetMetaData;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class AltasZyS_3 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    ButtonGroup Fil;
    ColorZyS colores = new ColorZyS();
    ColorNSD colorNSD = new ColorNSD();
    ColorSDS colorSDS = new ColorSDS();

    /**
     * Creates new form AltasZyS_3
     */
    public AltasZyS_3() {
        initComponents();

        this.setExtendedState(6);
        this.setLocationRelativeTo(null);
        IDS.setVisible(false);
        IDZ.setVisible(false);
        idZona.setVisible(false);
        NZS.setVisible(false);
        Filtros.setVisible(false);
        SabadoT.setEnabled(false);
        DomingoT.setEnabled(false);
        Otrotxt.setEnabled(false);
        Costo.setVisible(false);
        Fil = new ButtonGroup();
        Fil.add(FPNDS);
        Fil.add(FPNDZ);
        Costo.setVisible(false);
        //El combobox jala datos de la base de datos
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FiltroZ.setModel(modelzonas);
        mostrarzonas();
        mostrarServicios();
        compartirZ();
        ContarServ();
        nds();
        SDS();
        TNDS.setDefaultRenderer(TNDS.getColumnClass(0), colorNSD);
        TServ.setDefaultRenderer(TServ.getColumnClass(0), colores);
        TStatusServ.setDefaultRenderer(TStatusServ.getColumnClass(0), colorSDS);
        setIconImage(new ImageIcon(AltasZyS_3.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());

    }

    
    @SuppressWarnings("unchecked")
//Contar filas
    public void ContarServ() {
        int filas = TServ.getRowCount();
        TdServ.setText("Total de servicios: " + filas);
    }

//Modificar Servicio
    public void modS() {
        String Costov = "";
        String Q = (String) Cbxcosto.getSelectedItem();
        if (Q.equals(",")) {
            Costov = "";
        }
        if (Q.equals("Con costo")) {
            Costov = Costo.getText();

        }
        if (Q.equals("Sin costo")) {
            Costov = "Sin costo";
        }
        if (Q.equals(".")) {
            Costov = "";
        }
        String horarioSMOD;
        if (Sab.isSelected() == true) {
            //Entre Semana Sabado
            horarioSMOD = SabadoT.getText();

        } else {
            boolean name = Sab.isSelected() == false;
            horarioSMOD = "OFF";
        }
        String horarioDMOD;
        if (Dom.isSelected() == true) {
            //Entre semana Domingo
            horarioDMOD = DomingoT.getText();
        } else {
            boolean name = Dom.isSelected() == false;
            horarioDMOD = "OFF";
        }
        //Todo el dia modificacion
        String TEDMOD;
        if (Allday.isSelected() == true) {
            horarioDMOD = "";
            horarioSMOD = "";
            TEDMOD = "24 HRS";

        } else {
            boolean name = Allday.isSelected() == false;
            TEDMOD = "";
        }
        String OtroMOD;
        if (Otro.isSelected() == true) {
            OtroMOD = Otrotxt.getText();
            horarioDMOD = "";
            horarioSMOD = "";

        } else {
            boolean name = Otro.isSelected() == false;
            OtroMOD = "";

        }
        String TDs = TDS.getSelectedItem().toString();

        int id = Integer.parseInt(IDS.getText());
        String SQL = "UPDATE `servicio` SET `idZona` = ?, `Nombre Zona` = ?, `Supervisor` = ?, `Servicio` = ?,"
                + " `Horario` = ?, `Abre` = ?, `Cierra` = ?,"
                + " `Sabado` = ?, `Domingo` = ?, `Otro` = ?, `Tipo de valet` = ?, `Costo` = ?, `Status` = ? WHERE"
                + " `servicio`.`idServ` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, idZona.getText());
            pst.setString(2, NZS.getText());
            pst.setString(3, Supervisor.getText());
            pst.setString(4, NS.getText());
            pst.setString(5, Horario.getText() + TEDMOD);
            pst.setString(6, Abre.getText());
            pst.setString(7, Cierra.getText());
            pst.setString(8, horarioSMOD);
            pst.setString(9, horarioDMOD);
            pst.setString(10, OtroMOD);
            pst.setString(11, TDs);
            pst.setString(12, Costov);
            pst.setString(13, StatusServ.getSelectedItem().toString());
            pst.setInt(14, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Servicio Modificado");
            mostrarServicios();
            ContarServ();
            nds();
            SDS();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage());
        }
    }

//Modificar Zona
    public void modZ() {
        int id = Integer.parseInt(IDZ.getText());
        String SQL = "UPDATE zona SET `Zonas` = ? WHERE (`idZona` = ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, NZ.getText());
            pst.setInt(2, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Zona Modificada.");
            mostrarzonas();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar: " + e.getMessage());
        }
    }

//Eliminar Servicio
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

//Eliminar Zona
    public void eliminarZ() {

        try {

            int filaseleccionada = TablaZona.getSelectedRow();
            String sql = "delete from zona where idZona=" + TablaZona.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "La Zona a sido eliminada.");
                mostrarzonas();
                compartirZ();
                clearzone();
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Zona: " + e.getMessage());

        }

    }
//Agregar Zona

    public void AgregarZ() {

        String SQL = "INSERT INTO `confort`.`zona` (`Zonas`) VALUES (?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, NZ.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Zona agregada.");
            mostrarzonas();
            compartirZ();
            clearzone();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar: " + e.getMessage());
        }
    }

//Agregar Servicio
    public void AgregarS() {
        String Costov = "";
        String Q = (String) Cbxcosto.getSelectedItem();
        if (Q.equals(",")) {
            Costov = "";
        }
        if (Q.equals("Con costo")) {
            Costov = Costo.getText();
        }
        if (Q.equals("Sin costo")) {
            Costov = "Sin costo";
        }
        if (Q.equals(".")) {
            Costov = "";
        }
        String horarioS;
        if (Sab.isSelected() == true) {
            //Entre Semana Sabado
            horarioS = SabadoT.getText();

        } else {
            boolean name = Sab.isSelected() == false;
            horarioS = "OFF";
        }
        String horarioD;
        if (Dom.isSelected() == true) {
            //Entre semana Domingo
            horarioD = DomingoT.getText();
        } else {
            boolean name = Dom.isSelected() == false;
            horarioD = "OFF";
        }
        //otro semana
        String OtroS;
        if (Otro.isSelected() == true) {
            OtroS = Otrotxt.getText();
            horarioD = "";
            horarioS = "";
        } else {
            boolean name = Otro.isSelected() == false;
            OtroS = "";

        }
        //Todo el dia
        String TED;
        if (Allday.isSelected() == true) {

            TED = "24 HRS";
            horarioD = "";
            horarioS = "";
        } else {
            boolean name = Allday.isSelected() == false;
            TED = "";
        }
        String TDs = TDS.getSelectedItem().toString();

        String SQL = "INSERT INTO `servicio` (`idZona`, `Nombre Zona`,"
                + " `Supervisor`, `Servicio`, `Horario`, `Abre`, `Cierra`, `Sabado`,"
                + " `Domingo`, `Otro`, `Tipo de valet`, `Costo`, `Status`) VALUES (?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, idZona.getText());
            //Nombre de Zona para Servicio
            pst.setString(2, NZS.getText());
            pst.setString(3, Supervisor.getText());
            //Nombre Servicio
            pst.setString(4, NS.getText());
            pst.setString(5, Horario.getText() + TED);
            pst.setString(6, Abre.getText());
            pst.setString(7, Cierra.getText());
            pst.setString(8, horarioS);
            pst.setString(9, horarioD);
            pst.setString(10, OtroS);
            pst.setString(11, TDs);
            pst.setString(12, Costov);
            pst.setString(13, StatusServ.getSelectedItem().toString());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Servicio agregado.");
            mostrarServicios();
            clearServ();
            nds();
            SDS();
            ContarServ();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar: " + e.getMessage());
        }

    }

    private void clearServ() {
        NS.setText("");
        IDS.setText("");
        idZona.setText("");
        NZS.setText("");
        Supervisor.setText("");
        Horario.setText("L a V");
        TDS.setSelectedIndex(0);
        SabadoT.setText("");
        DomingoT.setText("");
        Otrotxt.setText("");
        Abre.setText("08:30");
        Cierra.setText("16:00");
        Sab.setSelected(false);
        Dom.setSelected(false);
        Allday.setSelected(false);
        Otro.setSelected(false);
        Horario.setEnabled(true);
        Abre.setEnabled(true);
        Cierra.setEnabled(true);
        SabadoT.setEnabled(false);
        DomingoT.setEnabled(false);
        Otrotxt.setEnabled(false);
        Cbxcosto.setSelectedIndex(0);
        Costo.setText("");
        Costo.setVisible(false);
    }

    private void clearzone() {
        NZ.setText("");
        IDZ.setText("");
    }

    //Mostrar Status de servicios
    private void SDS() {
        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };
//Nombre de la tabla
            TStatusServ.setModel(modelo);
            PreparedStatement ps ;
            ResultSet rs ;

            String sql = "select `Status`, COUNT(`Status`) as sts FROM `servicio`"
                    + " GROUP BY 1 HAVING COUNT(`Status`) > 1;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Status de Servicio");
            modelo.addColumn("#");

//Anchos
            int[] anchos = {210, 10};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TStatusServ.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos: " + e.getMessage());

        }

    }

    //Mostrar numero de servicios
    private void nds() {
        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };
//Nombre de la tabla
            TNDS.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "select `Tipo de valet`, COUNT(`Tipo de valet`)"
                    + " as xd FROM `servicio` GROUP BY 1 HAVING COUNT(`Tipo de valet`) > 1;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Tipo de Servicio");
            modelo.addColumn("#");

//Anchos
            int[] anchos = {210, 10};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TNDS.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos " + e.getMessage());

        }

    }

//Mostrar Servicios
    private void mostrarServicios() {
        //Buscar servicio
        String NombreS = BS.getText();
        String where = "";
        //Filtro Zona
        String Filtro2 = FiltroZ.getSelectedItem().toString();
        //Filtros
        if (!"".equals(NombreS)) {
            where = " WHERE `Servicio` LIKE '%" + NombreS + "%'";
        } else if (!"".equals(Filtro2)) {
            where = " Where `Nombre Zona` LIKE '%" + Filtro2 + "%'";
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
            TServ.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            String sql = "select * from servicio" + where;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Num. servicio");//1
            modelo.addColumn("Num. Zona");
            modelo.addColumn("Zona");//3
            modelo.addColumn("Supervisor");
            modelo.addColumn("Nombre Servicio");//5
            modelo.addColumn("Horario");
            modelo.addColumn("Abre");//7
            modelo.addColumn("Cierra");
            modelo.addColumn("Sabado");//9
            modelo.addColumn("Domingo");
            modelo.addColumn("Otro horario");//11
            modelo.addColumn("Tipo de Servicio");
            modelo.addColumn("Costo");//13
            modelo.addColumn("Status");

//Anchos
            int[] anchos = {10, 10, 50, 150, 150, 30, 20, 20, 30, 30, 225,
                75, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TServ.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos " + e.getMessage());

        }

    }

    public void mostrarzonas() {
        //Buscar Zonas
        String NombreZ = BZ.getText();
        String where = "";
        if (!"".equals(NombreZ)) {
            where = " WHERE `Zonas` LIKE '%" + NombreZ + "%'";

        }

        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };
//nombre tabla
            TablaZona.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "select * from zona" + where;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID de Zona");
            modelo.addColumn("Nombre de Zona");

//Anchos
            int[] anchos = {30, 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //nombre tabla
                TablaZona.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos " + e.getMessage());

        }
    }

    public void compartirZ() {
        //Buscar Zonas
        String NombreZ = BZS.getText();
        String where = "";
        if (!"".equals(NombreZ)) {
            where = " WHERE `Zonas` LIKE '%" + NombreZ + "%'";

        }

        try {
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }
            };

            ZSh.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;

            String sql = "select * from zona" + where;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID de Zona");
            modelo.addColumn("Nombre de Zona");

//Anchos
            int[] anchos = {30, 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                ZSh.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);
            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos " + e.getMessage());

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
        idZona = new javax.swing.JTextField();
        Volver = new javax.swing.JButton();
        NZS = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Otrotxt = new javax.swing.JTextField();
        HorarioSYD = new javax.swing.JLabel();
        Sab = new javax.swing.JRadioButton();
        Horario = new javax.swing.JTextField();
        Dom = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        Abre = new javax.swing.JTextField();
        Cierra = new javax.swing.JTextField();
        Allday = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        Otro = new javax.swing.JRadioButton();
        Supervisor = new javax.swing.JTextField();
        SabadoT = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        DomingoT = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Costo = new javax.swing.JTextField();
        Cbxcosto = new javax.swing.JComboBox<>();
        TDS = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        StatusServ = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        PNDS = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        TServ = new javax.swing.JTable();
        Volver2 = new javax.swing.JButton();
        FPNDS = new javax.swing.JRadioButton();
        FPNDZ = new javax.swing.JRadioButton();
        Filtros = new javax.swing.JPanel();
        BStext = new javax.swing.JLabel();
        BS = new javax.swing.JTextField();
        BZtext = new javax.swing.JLabel();
        FiltroZ = new javax.swing.JComboBox<>();
        EliminarServ = new javax.swing.JButton();
        botonWeb2 = new botones.BotonWeb();
        TdServ = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TNDS = new javax.swing.JTable();
        jScrollPane10 = new javax.swing.JScrollPane();
        TStatusServ = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zonas y Servicios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Nombre de la zona");

        AgregarZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AgregarZ.setText("Agregar Zona");
        AgregarZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarZActionPerformed(evt);
            }
        });

        TablaZona.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID de Zona", "Nombre Zona"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
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

        EliminarZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        EliminarZ.setText("Eliminar");
        EliminarZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarZActionPerformed(evt);
            }
        });

        ModZ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        ModZ.setText("Modificar");
        ModZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModZActionPerformed(evt);
            }
        });

        Volver1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
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
                        .addComponent(IDZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(AgregarZ)
                        .addGap(30, 30, 30)
                        .addComponent(ModZ)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BZ, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Volver1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 376, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 270, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(BZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(EliminarZ)
                    .addComponent(Volver1))
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
                            .addComponent(AgregarZ)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
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

        AgrergarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AgrergarS.setText("Agregar Servicio");
        AgrergarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgrergarSActionPerformed(evt);
            }
        });

        NS.setColumns(20);
        NS.setLineWrap(true);
        NS.setRows(5);
        jScrollPane6.setViewportView(NS);

        ModS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        ModS.setText("Modificar");
        ModS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModSActionPerformed(evt);
            }
        });

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        Volver.setText(" Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        HorarioSYD.setText("Horario:");

        Sab.setText("Sabado");
        Sab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabActionPerformed(evt);
            }
        });

        Horario.setText("L a V");

        Dom.setText("Domingo");
        Dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DomActionPerformed(evt);
            }
        });

        jLabel11.setText("Cierra");

        Abre.setText("08:30");

        Cierra.setText("16:00");

        Allday.setText("24 Hrs");
        Allday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlldayActionPerformed(evt);
            }
        });

        jLabel14.setText("Supervisor:");

        Otro.setText("Otro horario");
        Otro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OtroActionPerformed(evt);
            }
        });

        jLabel15.setText("Horario");

        jLabel16.setText("Abre");

        jLabel12.setText("Detalles de Servicio");

        jLabel5.setText("Tipo de Servicio:");

        jLabel6.setText("Costo:");

        Cbxcosto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Con costo", "Sin costo" }));
        Cbxcosto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxcostoItemStateChanged(evt);
            }
        });

        TDS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "SANTANDER CDMX", "SANTANDER FORANEOS", "EVENTOS", "SERVICIOS VP", "ESTACIONAMIENTOS CDMX", "ESTACIONAMIENTOS FORANEOS", "NO APLICA" }));

        jLabel7.setText("Status:");

        StatusServ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Abierto", "Cerrado por Contingencia", "NO APLICA" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)))
                    .addComponent(jLabel11)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HorarioSYD, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SabadoT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Dom)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Allday))
                            .addComponent(DomingoT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Otrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Otro)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Abre, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Cierra, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Cbxcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StatusServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Supervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Horario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(Allday)
                    .addComponent(Otro)
                    .addComponent(Sab)
                    .addComponent(Dom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SabadoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DomingoT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HorarioSYD)
                    .addComponent(Otrotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Abre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Cierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cbxcosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(StatusServ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(IDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NZS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(AgrergarS)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ModS))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(279, 279, 279))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BZS, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Volver))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(BZS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Volver))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(idZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(NZS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgrergarS)
                            .addComponent(ModS))
                        .addGap(53, 53, 53)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 121, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel2);

        jTabbedPane1.addTab("Alta de Servicios", jScrollPane2);

        TServ.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13"
            }
        ));
        TServ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TServMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(TServ);

        Volver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        Volver2.setText("Volver");
        Volver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Volver2ActionPerformed(evt);
            }
        });

        FPNDS.setText("Filtrar por nombre de servicio");
        FPNDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPNDSActionPerformed(evt);
            }
        });

        FPNDZ.setText("Filtrar por Zonas");
        FPNDZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FPNDZActionPerformed(evt);
            }
        });

        BStext.setText("Buscar Servicio:");

        BS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BSKeyReleased(evt);
            }
        });

        BZtext.setText("Filtrar por Zonas:");

        FiltroZ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroZ.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZItemStateChanged(evt);
            }
        });

        EliminarServ.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        EliminarServ.setText("Eliminar");
        EliminarServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarServActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FiltrosLayout = new javax.swing.GroupLayout(Filtros);
        Filtros.setLayout(FiltrosLayout);
        FiltrosLayout.setHorizontalGroup(
            FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FiltrosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(EliminarServ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BStext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BZtext)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FiltroZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        FiltrosLayout.setVerticalGroup(
            FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FiltrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(FiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BStext)
                    .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BZtext)
                    .addComponent(FiltroZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarServ))
                .addContainerGap())
        );

        botonWeb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb2.setLink("http://192.168.3.10/Reportes/Reporteservicios/EPCServicios.php");

        TdServ.setText("Total de servicios: ");

        TNDS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        jScrollPane7.setViewportView(TNDS);

        TStatusServ.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane10.setViewportView(TStatusServ);

        javax.swing.GroupLayout PNDSLayout = new javax.swing.GroupLayout(PNDS);
        PNDS.setLayout(PNDSLayout);
        PNDSLayout.setHorizontalGroup(
            PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNDSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNDSLayout.createSequentialGroup()
                        .addComponent(Filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(FPNDS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FPNDZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(Volver2)
                        .addContainerGap(2051, Short.MAX_VALUE))
                    .addGroup(PNDSLayout.createSequentialGroup()
                        .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addGroup(PNDSLayout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(TdServ)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 2726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        PNDSLayout.setVerticalGroup(
            PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PNDSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Filtros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Volver2)
                            .addComponent(FPNDS)
                            .addComponent(FPNDZ))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PNDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PNDSLayout.createSequentialGroup()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TdServ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(393, 393, 393))
                    .addGroup(PNDSLayout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jScrollPane8.setViewportView(PNDS);

        jTabbedPane1.addTab("Tabla Detallada de servicios", jScrollPane8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1260, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FiltroZItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZItemStateChanged
        // TODO add your handling code here:
        mostrarServicios();
    }//GEN-LAST:event_FiltroZItemStateChanged

    private void BSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BSKeyReleased
        // TODO add your handling code here:
        mostrarServicios();
    }//GEN-LAST:event_BSKeyReleased

    private void FPNDZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPNDZActionPerformed
        // TODO add your handling code here:
        Filtros.setVisible(true);
        BZtext.setVisible(true);
        FiltroZ.setVisible(true);
        FiltroZ.setSelectedIndex(0);
        BS.setVisible(false);
        BS.setText("");
        BStext.setVisible(false);
    }//GEN-LAST:event_FPNDZActionPerformed

    private void FPNDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FPNDSActionPerformed
        // TODO add your handling code here:
        Filtros.setVisible(true);
        BZtext.setVisible(false);
        FiltroZ.setVisible(false);
        FiltroZ.setSelectedIndex(0);
        BS.setVisible(true);
        BS.setText("");
        BStext.setVisible(true);
    }//GEN-LAST:event_FPNDSActionPerformed

    private void Volver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver2ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres a la ventana de administrador?");
        if (i == 0) {
            VentanaADM_3 regr = new VentanaADM_3();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Volver2ActionPerformed

    private void TServMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TServMouseClicked
        try {
            // TODO add your handling code here:
            int seleccionar = TServ.getSelectedRow();
            IDS.setText(String.valueOf(TServ.getValueAt(seleccionar, 0)));
            idZona.setText(String.valueOf(TServ.getValueAt(seleccionar, 1)));
            NZS.setText(String.valueOf(TServ.getValueAt(seleccionar, 2)));
            Supervisor.setText(String.valueOf(TServ.getValueAt(seleccionar, 3)));
            NS.setText(String.valueOf(TServ.getValueAt(seleccionar, 4)));
            Horario.setText(String.valueOf(TServ.getValueAt(seleccionar, 5)));
            Abre.setText(String.valueOf(TServ.getValueAt(seleccionar, 6)));
            Cierra.setText(String.valueOf(TServ.getValueAt(seleccionar, 7)));
            SabadoT.setText(String.valueOf(TServ.getValueAt(seleccionar, 8)));
            DomingoT.setText(String.valueOf(TServ.getValueAt(seleccionar, 9)));
            Otrotxt.setText(String.valueOf(TServ.getValueAt(seleccionar, 10)));
            DefaultTableModel model = (DefaultTableModel) TServ.getModel();

            String combo1 = model.getValueAt(seleccionar, 11).toString();
            for (int i = 0; i < TDS.getItemCount(); i++) {
                if (TDS.getItemAt(i).equalsIgnoreCase(combo1)) {
                    TDS.setSelectedIndex(i);
                }
            }

            Costo.setText(String.valueOf(TServ.getValueAt(seleccionar, 12)));

            String combo3 = model.getValueAt(seleccionar, 13).toString();
            for (int i = 0; i < StatusServ.getItemCount(); i++) {
                if (StatusServ.getItemAt(i).equalsIgnoreCase(combo3)) {
                    StatusServ.setSelectedIndex(i);
                }
            }

            int id = Integer.parseInt(TServ.getValueAt(seleccionar, 0).toString());
            String SabadoB = SabadoT.getText();
            String DomingoB = DomingoT.getText();
            String OtroB = Otrotxt.getText();
            String CostoB = Costo.getText();

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from servicio where idServ =?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {

                if (rs.getString("Sabado").equals("OFF")) {
                    Sab.setSelected(false);
                    SabadoT.setEnabled(false);
                } else if (rs.getString("Sabado").equals(SabadoB)) {
                    Sab.setSelected(true);
                    SabadoT.setEnabled(true);
                    Horario.setEnabled(true);
                    Cierra.setEnabled(true);
                    Abre.setEnabled(true);
                } else if (rs.getString("Sabado").equals("")) {
                    Sab.setSelected(false);
                    SabadoT.setEnabled(false);
                }
                if (rs.getString("Domingo").equals("OFF")) {
                    Dom.setSelected(false);
                    DomingoT.setEnabled(false);
                } else if (rs.getString("Domingo").equals(DomingoB)) {
                    Dom.setSelected(true);
                    DomingoT.setEnabled(true);
                    Horario.setEnabled(true);
                    Cierra.setEnabled(true);
                    Abre.setEnabled(true);
                } else if (rs.getString("Domingo").equals("")) {
                    Dom.setSelected(false);
                    DomingoT.setEnabled(false);
                }
                if (rs.getString("Horario").equals("24 HRS")) {
                    Allday.setSelected(true);
                    Otro.setSelected(false);
                    Otrotxt.setEnabled(false);
                    Otrotxt.setText("");
                    Dom.setSelected(false);
                    DomingoT.setEnabled(false);
                    DomingoT.setText("");
                    Sab.setSelected(false);
                    SabadoT.setEnabled(false);
                    SabadoT.setText("");
                    Horario.setText("");
                    Horario.setEnabled(false);
                    Abre.setText("");
                    Cierra.setText("");
                    Abre.setEnabled(false);
                    Cierra.setEnabled(false);
                }
                if (rs.getString("Otro").equals("")) {
                    Otro.setSelected(false);
                    Otrotxt.setEnabled(false);
                } else if (rs.getString("Otro").equals(OtroB)) {
                    Otro.setSelected(true);
                    Otrotxt.setEnabled(true);
                    Allday.setSelected(false);
                    Dom.setSelected(false);
                    DomingoT.setEnabled(false);
                    DomingoT.setText("");
                    Sab.setSelected(false);
                    SabadoT.setEnabled(false);
                    SabadoT.setText("");
                    Horario.setText("");
                    Horario.setEnabled(false);
                    Abre.setText("");
                    Cierra.setText("");
                    Abre.setEnabled(false);
                    Cierra.setEnabled(false);
                }
                if (rs.getString("Costo").equals("Sin costo")) {
                    Cbxcosto.setSelectedIndex(2);
                    Costo.setEnabled(false);
                    Costo.setText("");
                } else if (rs.getString("Costo").equals("")) {
                    Cbxcosto.setSelectedIndex(0);
                    Costo.setEnabled(false);
                } else if (rs.getString("Costo").equals(CostoB)) {
                    Cbxcosto.setSelectedIndex(1);
                    Costo.setEnabled(true);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(AltasZyS_3.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_TServMouseClicked

    private void OtroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OtroActionPerformed
        // TODO add your handling code here:
        if (Otro.isSelected() == true) {
            Otrotxt.setEnabled(true);
            Dom.setSelected(false);
            DomingoT.setEnabled(false);
            DomingoT.setText("");
            Sab.setSelected(false);
            SabadoT.setEnabled(false);
            SabadoT.setText("");
            Allday.setSelected(false);
            Horario.setText("");
            Abre.setText("");
            Cierra.setText("");
            Abre.setEnabled(false);
            Cierra.setEnabled(false);
            Horario.setEnabled(false);
        } else if (Otro.isSelected() == false) {
            Otrotxt.setEnabled(false);
            Horario.setEnabled(true);
            Horario.setText("L a V");
            Abre.setEnabled(true);
            Cierra.setEnabled(true);
        }
    }//GEN-LAST:event_OtroActionPerformed

    private void AlldayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlldayActionPerformed
        // TODO add your handling code here:
        if (Allday.isSelected() == true) {
            Otro.setSelected(false);
            Otrotxt.setEnabled(false);
            Otrotxt.setText("");
            Dom.setSelected(false);
            DomingoT.setEnabled(false);
            DomingoT.setText("");
            Sab.setSelected(false);
            SabadoT.setEnabled(false);
            SabadoT.setText("");
            Horario.setText("");
            Horario.setEnabled(false);
            Abre.setText("");
            Cierra.setText("");
            Abre.setEnabled(false);
            Cierra.setEnabled(false);
        } else if (Allday.isSelected() == false) {
            Otrotxt.setEnabled(false);
            Horario.setEnabled(true);
            Horario.setText("L a V");
            Abre.setEnabled(true);
            Cierra.setEnabled(true);
        }
    }//GEN-LAST:event_AlldayActionPerformed

    private void DomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DomActionPerformed
        // TODO add your handling code here:
        if (Dom.isSelected() == true) {
            DomingoT.setEnabled(true);
            Otro.setSelected(false);
            Otrotxt.setEnabled(false);
            Allday.setSelected(false);
            Otrotxt.setText("");
            Horario.setEnabled(true);
            Horario.setText("L a V");
            Abre.setEnabled(true);
            Cierra.setEnabled(true);
        } else if (Dom.isSelected() == false) {
            DomingoT.setEnabled(false);
            Horario.setEnabled(true);
            Horario.setText("L a V");
            DomingoT.setText("");

        }
    }//GEN-LAST:event_DomActionPerformed

    private void SabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabActionPerformed
        // TODO add your handling code here:
        if (Sab.isSelected() == true) {
            SabadoT.setEnabled(true);
            Otro.setSelected(false);
            Otrotxt.setEnabled(false);
            Allday.setSelected(false);
            Otrotxt.setText("");
            Horario.setEnabled(true);
            Horario.setText("L a V");
            Abre.setEnabled(true);
            Cierra.setEnabled(true);

        } else if (Sab.isSelected() == false) {
            SabadoT.setEnabled(false);
            Horario.setEnabled(true);
            Horario.setText("L a V");
            SabadoT.setText("");

        }

    }//GEN-LAST:event_SabActionPerformed

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres a la ventana de administrador?");
        if (i == 0) {
            VentanaADM_3 regr = new VentanaADM_3();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_VolverActionPerformed

    private void ModSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModSActionPerformed
        // TODO add your handling code here:
        modS();
        clearServ();
    }//GEN-LAST:event_ModSActionPerformed

    private void AgrergarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgrergarSActionPerformed
        // TODO add your handling code here:
        AgregarS();
        clearServ();
    }//GEN-LAST:event_AgrergarSActionPerformed

    private void BZSKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BZSKeyReleased
        // TODO add your handling code here:
        compartirZ();
    }//GEN-LAST:event_BZSKeyReleased

    private void ZShMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ZShMouseClicked
        // TODO add your handling code here:
        int seleccionar = ZSh.getSelectedRow();
        idZona.setText(String.valueOf(ZSh.getValueAt(seleccionar, 0)));
        NZS.setText(String.valueOf(ZSh.getValueAt(seleccionar, 1)));
    }//GEN-LAST:event_ZShMouseClicked

    private void Volver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Volver1ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres a la ventana de administrador?");
        if (i == 0) {
            VentanaADM_3 regr = new VentanaADM_3();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_Volver1ActionPerformed

    private void ModZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModZActionPerformed
        // TODO add your handling code here:
        modZ();
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FiltroZ.setModel(modelzonas);
    }//GEN-LAST:event_ModZActionPerformed

    private void EliminarZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarZActionPerformed
        // TODO add your handling code here:
        eliminarZ();
    }//GEN-LAST:event_EliminarZActionPerformed

    private void BZKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BZKeyReleased
        // TODO add your handling code here:
        mostrarzonas();
    }//GEN-LAST:event_BZKeyReleased

    private void TablaZonaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaZonaMouseClicked
        // TODO add your handling code here:
        int seleccionar = TablaZona.getSelectedRow();
        IDZ.setText(String.valueOf(TablaZona.getValueAt(seleccionar, 0)));
        NZ.setText(String.valueOf(TablaZona.getValueAt(seleccionar, 1)));
    }//GEN-LAST:event_TablaZonaMouseClicked

    private void AgregarZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarZActionPerformed
        // TODO add your handling code here:
        AgregarZ();
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FiltroZ.setModel(modelzonas);
    }//GEN-LAST:event_AgregarZActionPerformed

    private void EliminarServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarServActionPerformed
        // TODO add your handling code here:
        eliminarS();
    }//GEN-LAST:event_EliminarServActionPerformed

    private void CbxcostoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxcostoItemStateChanged
        // TODO add your handling code here:
        String Q = (String) Cbxcosto.getSelectedItem();
        if (Q.equals(",")) {
            Costo.setVisible(false);
            Costo.setText("");

        }
        if (Q.equals("Con costo")) {
            Costo.setVisible(true);
            Costo.setText("");

        }
        if (Q.equals("Sin costo")) {
            Costo.setVisible(false);
            Costo.setText("");
        }
    }//GEN-LAST:event_CbxcostoItemStateChanged

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
            java.util.logging.Logger.getLogger(AltasZyS_3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltasZyS_3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltasZyS_3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltasZyS_3.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextField Abre;
    private javax.swing.JButton AgregarZ;
    private javax.swing.JButton AgrergarS;
    private javax.swing.JRadioButton Allday;
    private javax.swing.JTextField BS;
    private javax.swing.JLabel BStext;
    private javax.swing.JTextField BZ;
    private javax.swing.JTextField BZS;
    private javax.swing.JLabel BZtext;
    private javax.swing.JComboBox<String> Cbxcosto;
    private javax.swing.JTextField Cierra;
    private javax.swing.JTextField Costo;
    private javax.swing.JRadioButton Dom;
    private javax.swing.JTextField DomingoT;
    private javax.swing.JButton EliminarServ;
    private javax.swing.JButton EliminarZ;
    private javax.swing.JRadioButton FPNDS;
    private javax.swing.JRadioButton FPNDZ;
    private javax.swing.JComboBox<String> FiltroZ;
    private javax.swing.JPanel Filtros;
    private javax.swing.JTextField Horario;
    private javax.swing.JLabel HorarioSYD;
    private javax.swing.JTextField IDS;
    private javax.swing.JTextField IDZ;
    private javax.swing.JButton ModS;
    private javax.swing.JButton ModZ;
    private javax.swing.JTextArea NS;
    private javax.swing.JTextArea NZ;
    private javax.swing.JTextField NZS;
    private javax.swing.JRadioButton Otro;
    private javax.swing.JTextField Otrotxt;
    private javax.swing.JPanel PNDS;
    private javax.swing.JRadioButton Sab;
    private javax.swing.JTextField SabadoT;
    private javax.swing.JComboBox<String> StatusServ;
    private javax.swing.JTextField Supervisor;
    private javax.swing.JComboBox<String> TDS;
    private javax.swing.JTable TNDS;
    private javax.swing.JTable TServ;
    private javax.swing.JTable TStatusServ;
    private javax.swing.JTable TablaZona;
    private javax.swing.JLabel TdServ;
    private javax.swing.JButton Volver;
    private javax.swing.JButton Volver1;
    private javax.swing.JButton Volver2;
    private javax.swing.JTable ZSh;
    private botones.BotonWeb botonWeb2;
    private javax.swing.JTextField idZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
