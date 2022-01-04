package Nomina;

import Conexion.ConexionSQL;
import Inicio.Login_2;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class ODTQ_5 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    ButtonGroup IAT;
    int Q01 = 1, Q02 = 2, Q03 = 3, Q04 = 4, Q05 = 5,
            Q06 = 6, Q07 = 7, Q08 = 8, Q09 = 9,
            Q010 = 10, Q011 = 11, Q012 = 12, Q013 = 13,
            Q014 = 14, Q015 = 15, Q016 = 16, Q017 = 17,
            Q018 = 18, Q019 = 19, Q020 = 20, Q021 = 21,
            Q022 = 22, Q023 = 23, Q024 = 24;

    public ODTQ_5() {
        initComponents();
        MDT();
        LabelODT1.setVisible(false);
        BusnameODT.setVisible(false);
        BusnameODT.setText("");
        BusapshODT.setText("");
        BusapshODT.setVisible(false);
        BusamshODT.setText("");
        BusamshODT.setVisible(false);
        IAT = new ButtonGroup();
        IAT.add(Si);
        IAT.add(no);
        Labelfilodt.setVisible(false);
        Fnameodt.setVisible(false);
        FilApodt.setVisible(false);
        FilAmodt.setVisible(false);
        LabelfilPODT.setVisible(false);
        FilnamePODT.setVisible(false);
        FilApPODT.setVisible(false);
        FilAmPODT.setVisible(false);
        MDTPODT();
        sharetp();
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        setIconImage(new ImageIcon(ODTQ_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());

    }

    public void sharetp() {
        //Buscar empleado
        String Share = BusnameODT.getText();
        String ShareAP = BusapshODT.getText();
        String ShareAM = BusamshODT.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
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
            share2.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Servicio");
            modelo.addColumn("Zona");

//Anchos
            int[] anchos = {50, 50, 100, 75, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                share2.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_odt) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con orden de taller: " + error_sh_odt.getMessage());

        }

    }

    public void DAR() {
        double Dar1 = Double.parseDouble(this.CT.getText());

        double igual = Dar1;

        this.Iad.setText("" + igual + "");
    }

    public void DAR1() {
        double d1 = Double.parseDouble(this.CT.getText());
        double d2 = Double.parseDouble(this.Pagado.getText());
        double d3 = d1 - d2;
        double total = d3;

        this.Pendiente.setText("" + total + "");
    }

    public void AgregarT() {

        String Iat;
        if (Si.isSelected() == true) {
            Iat = "Si";
        } else if (no.isSelected() == true) {
            Iat = "No";
        } else {
            Iat = ".";
        }
        String SQL = "INSERT INTO `nomina.odt` (`idTaller`, `Fecha de expedicion`,"
                + " `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`,"
                + " `Marca`, `Modelo`, `Placas`, `Color`, `# de piezas`, `Daño`,"
                + " `Costo total`, `Ingreso a taller`, `Status`, `Pago a`, `Importe a descontar`, `Quincenas a pagar`,"
                + " `Pagado`, `Pendiente`, `Por quincenas`, `Forma de pago`, `Quincenas pagadas`, `Observaciones`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Ndo.getText()));
            pst.setString(2, FE.getText());
            pst.setString(3, ApTaller.getText());
            pst.setString(4, Amtaller.getText());
            pst.setString(5, NameTaller.getText());
            pst.setString(6, Zona1.getText());
            pst.setString(7, Serv1.getText());
            pst.setString(8, Marca.getText());
            pst.setString(9, Modelo.getText());
            pst.setString(10, Placas.getText());
            pst.setString(11, Color.getText());
            pst.setString(12, ndp.getText());
            pst.setString(13, Daño.getText());
            pst.setString(14, CT.getText());
            pst.setString(15, Iat);
            pst.setString(16, Statusodt.getSelectedItem().toString());
            pst.setString(17, Paodt.getSelectedItem().toString());
            pst.setString(18, Iad.getText());
            pst.setString(19, QAP.getSelectedItem().toString());
            pst.setString(20, Pagado.getText());
            pst.setString(21, Pendiente.getText());
            pst.setString(22, PQT.getText());
            pst.setString(23, Fdp.getSelectedItem().toString());
            pst.setString(24, QPodt.getText());
            pst.setString(25, Observaciones.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orden de Taller Agregada");

            //limpiar campos
            Ndo.setText("0");
            IAT.clearSelection();
            FE.setText("");
            NameTaller.setText("");
            ApTaller.setText("");
            Amtaller.setText("");
            Zona1.setText("");
            Marca.setText("");
            Serv1.setText("");
            ndp.setText("");
            Daño.setText("");
            CT.setText("0");
            Statusodt.setSelectedIndex(0);
            Paodt.setSelectedIndex(0);
            Iad.setText("0");
            QAP.setSelectedIndex(0);
            PQT.setText("");
            Marca.setText("");
            Modelo.setText("");
            Color.setText("");
            Placas.setText("");
            Pagado.setText("");
            Pendiente.setText("");
            Fdp.setSelectedIndex(0);
            Observaciones.setText("");
            QPodt.setText("0");

        } catch (HeadlessException | SQLException Ex_Taller) {
            JOptionPane.showMessageDialog(null, "Error al agregar orden de taller: " + Ex_Taller.getMessage());
        }
    }

    public void editarT() {
        int id = Integer.parseInt(Ndo.getText());
        String Iat;
        if (Si.isSelected() == true) {
            Iat = "Si";
        } else if (no.isSelected() == true) {
            Iat = "No";
        } else {
            Iat = "Si";
        }
        String SQL = "UPDATE `nomina.odt` SET `idTaller` = ?, "
                + "`Fecha de expedicion` = ?, `Apellido P` = ?,"
                + " `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?,"
                + " `Servicio` = ?, `Marca` = ?, `Modelo` = ?, `Placas` = ?,"
                + " `Color` = ?, `# de piezas` = ?, `Daño` = ?, `Costo total` = ?,"
                + " `Ingreso a taller` = ?, `Status` = ?, `Pago a` = ?, `Importe a descontar` = ?, `Quincenas a pagar` = ?, "
                + " `Pagado` = ?, `Pendiente` = ?, `Por quincenas` = ?, `Forma de pago` = ?,"
                + " `Quincenas pagadas` = ?, `Observaciones` = ? WHERE `nomina.odt`.`idTaller` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Ndo.getText()));
            pst.setString(2, FE.getText());
            pst.setString(3, ApTaller.getText());
            pst.setString(4, Amtaller.getText());
            pst.setString(5, NameTaller.getText());
            pst.setString(6, Zona1.getText());
            pst.setString(7, Serv1.getText());
            pst.setString(8, Marca.getText());
            pst.setString(9, Modelo.getText());
            pst.setString(10, Placas.getText());
            pst.setString(11, Color.getText());
            pst.setString(12, ndp.getText());
            pst.setString(13, Daño.getText());
            pst.setString(14, CT.getText());
            pst.setString(15, Iat);
            pst.setString(16, Statusodt.getSelectedItem().toString());
            pst.setString(17, Paodt.getSelectedItem().toString());
            pst.setString(18, Iad.getText());
            pst.setString(19, QAP.getSelectedItem().toString());
            pst.setString(20, Pagado.getText());
            pst.setString(21, Pendiente.getText());
            pst.setString(22, PQT.getText());
            pst.setString(23, Fdp.getSelectedItem().toString());
            pst.setString(24, QPodt.getText());
            pst.setString(25, Observaciones.getText());
            pst.setInt(26, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orden Modificada");

            //limpiar campos
            Ndo.setText("0");
            IAT.clearSelection();
            FE.setText("");
            NameTaller.setText("");
            ApTaller.setText("");
            Amtaller.setText("");
            Zona1.setText("");
            Marca.setText("");
            Serv1.setText("");
            ndp.setText("");
            Daño.setText("");
            CT.setText("0");
            Statusodt.setSelectedIndex(0);
            Paodt.setSelectedIndex(0);
            Iad.setText("0");
            QAP.setSelectedIndex(0);
            PQT.setText("");
            Marca.setText("");
            Modelo.setText("");
            Color.setText("");
            Placas.setText("");
            Pagado.setText("");
            Pendiente.setText("");
            Fdp.setSelectedIndex(0);
            Observaciones.setText("");
            QPodt.setText("0");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error modificar Orden" + e.getMessage());
        }
    }

    public void MDT() {
        //Buscar empleado
        String Share = Fnameodt.getText();
        String ShareAP = FilApodt.getText();
        String ShareAM = FilAmodt.getText();
        String where = "select * from `nomina.odt`";

        if (!"".equals(Share)) {
            where = " select * from `nomina.odt` WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select * from `nomina.odt` WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * from `nomina.odt` WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
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
            OdT.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# de orden");//1
            modelo.addColumn("Fecha de expedicion");//
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//5
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//7
            modelo.addColumn("Marca");
            modelo.addColumn("Modelo");//9
            modelo.addColumn("Placas");
            modelo.addColumn("Color");//11
            modelo.addColumn("# de piezas");
            modelo.addColumn("Daño");//13
            modelo.addColumn("Costo total");
            modelo.addColumn("Ingreso a taller");//15
            modelo.addColumn("Status");
            modelo.addColumn("Pago a");
            modelo.addColumn("Importe a descontar");//17
            modelo.addColumn("Quincenas a pagar");
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//19
            modelo.addColumn("Pago por quincena");
            modelo.addColumn("Forma de pago");//21
            modelo.addColumn("Quincenas pagadas");
            modelo.addColumn("Observaciones");//23

//Anchos
            int[] anchos = {/*ndo*/35, /*fde*/ 50, /*ap*/ 55, /*am*/ 55, /*nom*/ 150,
                /*Zon*/ 60, /*serv*/ 75, /*Marca*/ 60, /*Modelo*/ 60, /*Placas*/ 60, /*Color*/ 60,
                /*NDP*/ 50, /*Daño*/ 500,
                /*CT*/ 55, /*IAT*/ 60, /*Status*/ 60, /*pago a*/ 70, /*IAD*/ 60, /*QAP*/ 60, /*PAGA*/ 55,
                /*PENDIENTE*/ 55, /*PPQ*/ 70, /*FDP*/ 65, /*QP*/ 50, /*obs*/ 1000};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                OdT.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de taller: " + e.getMessage());

        }

    }

    public void PQt() {
        double d1 = Double.parseDouble(this.Q1.getText());
        double d2 = Double.parseDouble(this.Q2.getText());
        double d3 = Double.parseDouble(this.Q3.getText());
        double d4 = Double.parseDouble(this.Q4.getText());
        double d5 = Double.parseDouble(this.Q5.getText());
        double d6 = Double.parseDouble(this.Q6.getText());
        double d7 = Double.parseDouble(this.Q7.getText());
        double d8 = Double.parseDouble(this.Q8.getText());
        double d9 = Double.parseDouble(this.Q9.getText());
        double d10 = Double.parseDouble(this.Q10.getText());
        double d11 = Double.parseDouble(this.Q11.getText());
        double d12 = Double.parseDouble(this.Q12.getText());
        double d13 = Double.parseDouble(this.Q13.getText());
        double d14 = Double.parseDouble(this.Q14.getText());
        double d15 = Double.parseDouble(this.Q15.getText());
        double d16 = Double.parseDouble(this.Q16.getText());
        double d17 = Double.parseDouble(this.Q17.getText());
        double d18 = Double.parseDouble(this.Q18.getText());
        double d19 = Double.parseDouble(this.Q19.getText());
        double d20 = Double.parseDouble(this.Q20.getText());
        double d21 = Double.parseDouble(this.Q21.getText());
        double d22 = Double.parseDouble(this.Q22.getText());
        double d23 = Double.parseDouble(this.Q23.getText());
        double d24 = Double.parseDouble(this.Q24.getText());
        double d25 = Double.parseDouble(this.Iad.getText());

        double total = d25 / (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13
                + d14 + d15 + d16 + d17 + d18 + d19 + d20 + d21 + d22 + d23 + d24);
        this.PQT.setText("" + total + "");
    }

    public void eliminarT() {

        try {

            int filaseleccionada = OdT.getSelectedRow();
            String sql = "delete from `nomina.odt` where idtaller=" + OdT.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Orden eliminada.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar orden: " + e.getMessage());

        }

    }

    public void MDTPODT() {
        String FiltroN = FilnamePODT.getText();
        String FAP = FilApPODT.getText();
        String FAM = FilAmPODT.getText();
        String where = "SELECT * FROM `nomina.pagos.odt`";

        if (!"".equals(FiltroN)) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT * FROM `nomina.pagos.odt`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT * FROM `nomina.pagos.odt`"
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
            TPODT.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# Lista");
            modelo.addColumn("# de orden");//2
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//8
            modelo.addColumn("Quincena");
            modelo.addColumn("# quincena");//10
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//12
            modelo.addColumn("Pago de orden de taller");

//ANCHOS
            int[] anchos = {/*NF*/50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*ZON*/ 50,
                /*SERV*/ 50, /*QUIN*/ 60, /*NQ*/ 50, /*PAG*/ 60, /*PEN*/ 60,/*PDODT*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TPODT.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mpdodt) {
            JOptionPane.showMessageDialog(null, "Error al motrar pagos de ordenes de taller: " + error_mpdodt.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Q11 = new javax.swing.JLabel();
        Q10 = new javax.swing.JLabel();
        Q9 = new javax.swing.JLabel();
        Q7 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        Q1 = new javax.swing.JLabel();
        Q24 = new javax.swing.JLabel();
        Q23 = new javax.swing.JLabel();
        Q22 = new javax.swing.JLabel();
        Q21 = new javax.swing.JLabel();
        Q20 = new javax.swing.JLabel();
        Q19 = new javax.swing.JLabel();
        Q18 = new javax.swing.JLabel();
        Q17 = new javax.swing.JLabel();
        Q16 = new javax.swing.JLabel();
        Q15 = new javax.swing.JLabel();
        Q14 = new javax.swing.JLabel();
        Q13 = new javax.swing.JLabel();
        Q12 = new javax.swing.JLabel();
        Q6 = new javax.swing.JLabel();
        Q8 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        PestañasPrin = new javax.swing.JTabbedPane();
        Talleres = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        CT = new javax.swing.JTextField();
        Si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        Paodt = new javax.swing.JComboBox<>();
        Iad = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        Pagado = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        Pendiente = new javax.swing.JTextField();
        Fdp = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Observaciones = new javax.swing.JTextArea();
        Ndo = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        share2 = new javax.swing.JTable();
        LabelODT1 = new javax.swing.JLabel();
        BusnameODT = new javax.swing.JTextField();
        Agregartaller = new javax.swing.JButton();
        Modificartaller = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Daño = new javax.swing.JTextArea();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        Zona1 = new javax.swing.JTextField();
        Serv1 = new javax.swing.JTextField();
        ndp = new javax.swing.JTextField();
        ApTaller = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        Amtaller = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        NameTaller = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        Modelo = new javax.swing.JTextField();
        Placas = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        QAP = new javax.swing.JComboBox<>();
        jLabel72 = new javax.swing.JLabel();
        PQT = new javax.swing.JTextField();
        FE = new javax.swing.JTextField();
        CS6 = new javax.swing.JButton();
        FshT = new javax.swing.JComboBox<>();
        BusapshODT = new javax.swing.JTextField();
        BusamshODT = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        QPodt = new javax.swing.JTextField();
        Statusodt = new javax.swing.JComboBox<>();
        jLabel168 = new javax.swing.JLabel();
        TTalleres = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        Labelfilodt = new javax.swing.JLabel();
        Fnameodt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        OdT = new javax.swing.JTable();
        EliminarT = new javax.swing.JButton();
        CS7 = new javax.swing.JButton();
        botonWeb4 = new botones.BotonWeb();
        jLabel161 = new javax.swing.JLabel();
        FiltrosTODT = new javax.swing.JComboBox<>();
        FilApodt = new javax.swing.JTextField();
        FilAmodt = new javax.swing.JTextField();
        TDPODT = new javax.swing.JScrollPane();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        TPODT = new javax.swing.JTable();
        jLabel153 = new javax.swing.JLabel();
        FiltrosPDODT = new javax.swing.JComboBox<>();
        LabelfilPODT = new javax.swing.JLabel();
        FilnamePODT = new javax.swing.JTextField();
        FilApPODT = new javax.swing.JTextField();
        FilAmPODT = new javax.swing.JTextField();
        botonWeb6 = new botones.BotonWeb();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        CNQ = new javax.swing.JMenuItem();
        CDA = new javax.swing.JMenuItem();
        PRESQ = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        Q11.setText("0");

        Q10.setText("0");

        Q9.setText("0");

        Q7.setText("0");

        Q5.setText("0");

        Q3.setText("0");

        Q1.setText("0");

        Q24.setText("0");

        Q23.setText("0");

        Q22.setText("0");

        Q21.setText("0");

        Q20.setText("0");

        Q19.setText("0");

        Q18.setText("0");

        Q17.setText("0");

        Q16.setText("0");

        Q15.setText("0");

        Q14.setText("0");

        Q13.setText("0");

        Q12.setText("0");

        Q6.setText("0");

        Q8.setText("0");

        Q2.setText("0");

        Q4.setText("0");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ordenes de taller");

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jLabel49.setText("# De orden:");

        jLabel50.setText("Fecha de Expedicion:");

        jLabel51.setText("Costo total");

        jLabel52.setText("Ingreso a taller:");

        jLabel53.setText("Status");

        jLabel54.setText("Importe a descontar");

        jLabel55.setText("Descuento a responsable");

        jLabel56.setText("Forma de pago:");

        jLabel57.setText("Observaciones:");

        CT.setText("0");
        CT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CTKeyReleased(evt);
            }
        });

        Si.setText("Si");

        no.setText("No");

        Paodt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Pago a cliente", "Pago a cerrajeria", "Vencida", "Pago a taller" }));

        Iad.setText("0");

        jLabel59.setText("Pagado:");

        Pagado.setText("0");
        Pagado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PagadoKeyReleased(evt);
            }
        });

        jLabel60.setText("Pendiente:");

        Fdp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Deposito", "Efectivo", "Transferencia" }));

        Observaciones.setColumns(20);
        Observaciones.setLineWrap(true);
        Observaciones.setRows(5);
        jScrollPane4.setViewportView(Observaciones);

        Ndo.setText("0");

        share2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        share2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                share2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(share2);

        LabelODT1.setText("Buscar empleado:");

        BusnameODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusnameODTKeyReleased(evt);
            }
        });

        Agregartaller.setText("Agregar");
        Agregartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregartallerActionPerformed(evt);
            }
        });

        Modificartaller.setText("Modificar");
        Modificartaller.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificartallerActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel62.setText("Daño:");

        jLabel63.setText("Responsable");

        Daño.setColumns(20);
        Daño.setLineWrap(true);
        Daño.setRows(5);
        jScrollPane7.setViewportView(Daño);

        jLabel66.setText("Apellido P:");

        jLabel67.setText("Zona:");

        jLabel68.setText("Servicio:");

        jLabel69.setText("Datos vehiculo");

        jLabel70.setText("# De piezas:");

        jLabel61.setText("Apellido M:");

        jLabel92.setText("Nombre(s)");

        jLabel93.setText("Marca:");

        jLabel94.setText("Modelo:");

        jLabel95.setText("Placas:");

        jLabel96.setText("Color:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel63))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70)
                            .addComponent(jLabel68)
                            .addComponent(jLabel67)
                            .addComponent(jLabel66)
                            .addComponent(jLabel61)
                            .addComponent(jLabel92)
                            .addComponent(jLabel62)
                            .addComponent(jLabel96)
                            .addComponent(jLabel95)
                            .addComponent(jLabel94)
                            .addComponent(jLabel93))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7)
                            .addComponent(ndp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zona1)
                            .addComponent(Serv1)
                            .addComponent(ApTaller)
                            .addComponent(Amtaller)
                            .addComponent(NameTaller)
                            .addComponent(Marca)
                            .addComponent(Modelo)
                            .addComponent(Placas)
                            .addComponent(Color))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel69)
                .addGap(86, 86, 86))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel63)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(ApTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(Amtaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(NameTaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(Zona1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(Serv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel69)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel93)
                    .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(Placas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(ndp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel62))
                .addGap(16, 16, 16))
        );

        jLabel71.setText("Quincenas a pagar:");

        QAP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "1 Quincena", "2 Quincenas", "3 Quincenas", "4 Quincenas", "5 Quincenas", "6 Quincenas", "7 Quincenas", "8 Quincenas", "9 Quincenas", "10 Quincenas", "11 Quincenas", "12 Quincenas", "13 Quincenas", "14 Quincenas", "15 Quincenas", "16 Quincenas", "17 Quincenas", "18 Quincenas", "19 Quincenas", "20 Quincenas", "21 Quincenas", "22 Quincenas", "23 Quincenas", "24 Quincenas" }));
        QAP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                QAPItemStateChanged(evt);
            }
        });

        jLabel72.setText("Por Quincena:");

        CS6.setText("Cerrar sesion");
        CS6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS6ActionPerformed(evt);
            }
        });

        FshT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FshT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FshTItemStateChanged(evt);
            }
        });

        BusapshODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusapshODTKeyReleased(evt);
            }
        });

        BusamshODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusamshODTKeyReleased(evt);
            }
        });

        jLabel32.setText("Filtros:");

        jLabel151.setText("Quincenas pagadas:");

        QPodt.setText("0");

        Statusodt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Debe", "Pagado", "Baja" }));

        jLabel168.setText("Pago a:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel51)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel53)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel57))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Agregartaller)
                                            .addComponent(Modificartaller)))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Si)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Fdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)
                                        .addComponent(jLabel55))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Iad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel59)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pagado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel60)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel151)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QPodt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Statusodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel168)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Paodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PQT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FshT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelODT1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BusnameODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BusapshODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BusamshODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CS6)
                                        .addGap(0, 381, Short.MAX_VALUE))
                                    .addComponent(jScrollPane5)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ndo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(Ndo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(FshT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelODT1)
                    .addComponent(BusnameODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusapshODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BusamshODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CS6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel50)
                            .addComponent(FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addComponent(Modificartaller)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Agregartaller))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel51)
                                        .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel52)
                                        .addComponent(Si)
                                        .addComponent(no)))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(4, 4, 4)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel71)
                                        .addComponent(QAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel72)
                                        .addComponent(Paodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel53)
                                        .addComponent(PQT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Statusodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel168))))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel56)
                                .addComponent(Fdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel55))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel54)
                                .addComponent(Iad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel59)
                                .addComponent(Pagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel60)
                                .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel151)
                                .addComponent(QPodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel57)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(319, Short.MAX_VALUE))
        );

        Talleres.setViewportView(jPanel6);

        PestañasPrin.addTab("Registro/Modificacion", Talleres);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        Labelfilodt.setText("Buscar Orden de taller por nombre:");

        Fnameodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FnameodtKeyReleased(evt);
            }
        });

        OdT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18", "Title 19", "Title 20"
            }
        ));
        OdT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OdTMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(OdT);

        EliminarT.setText("Eliminar");
        EliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTActionPerformed(evt);
            }
        });

        CS7.setText("Cerrar sesion");
        CS7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS7ActionPerformed(evt);
            }
        });

        botonWeb4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb4.setToolTipText("");
        botonWeb4.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCOdTaller.php");

        jLabel161.setText("Filtros:");

        FiltrosTODT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosTODT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTODTItemStateChanged(evt);
            }
        });

        FilApodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilApodtKeyReleased(evt);
            }
        });

        FilAmodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAmodtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel161)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Labelfilodt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fnameodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilApodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAmodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EliminarT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CS7))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 4964, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Labelfilodt)
                    .addComponent(Fnameodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarT)
                    .addComponent(CS7)
                    .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel161)
                    .addComponent(FiltrosTODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilApodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FilAmodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        TTalleres.setViewportView(jPanel8);

        PestañasPrin.addTab("Tabla talleres", TTalleres);

        TPODT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(TPODT);

        jLabel153.setText("Filtros:");

        FiltrosPDODT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosPDODT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosPDODTItemStateChanged(evt);
            }
        });

        LabelfilPODT.setText("jLabel154");

        FilnamePODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilnamePODTKeyReleased(evt);
            }
        });

        FilApPODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilApPODTKeyReleased(evt);
            }
        });

        FilAmPODT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilAmPODTKeyReleased(evt);
            }
        });

        botonWeb6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb6.setToolTipText("");
        botonWeb6.setLink("http://192.168.3.10/Reportes/ReportesNominaQuin/EPCPagosPrestamosQuin.php");

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosPDODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelfilPODT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilnamePODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilApPODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilAmPODT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1038, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel153)
                        .addComponent(FiltrosPDODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelfilPODT)
                        .addComponent(FilnamePODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilApPODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilAmPODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonWeb6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        TDPODT.setViewportView(jPanel19);

        PestañasPrin.addTab("Tabla pagos de ODT", TDPODT);

        jMenu1.setText("Cambiar a:");

        jMenu2.setText("Nomina quincenal");

        CNQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CNQ.setText("Nomina IMSS");
        CNQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CNQActionPerformed(evt);
            }
        });
        jMenu2.add(CNQ);

        CDA.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        CDA.setText("Caja de ahorro");
        CDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDAActionPerformed(evt);
            }
        });
        jMenu2.add(CDA);

        PRESQ.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        PRESQ.setText("Prestamos");
        PRESQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PRESQActionPerformed(evt);
            }
        });
        jMenu2.add(PRESQ);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem2.setText("Nomina General");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenu1.add(jMenu2);

        jMenu3.setText("Semanal");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Nomina Semanal IMSS");
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

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem4.setText("Nomina Semanal General");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuItem7.setText("Listas de asistencia");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 1640, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PestañasPrin, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTKeyReleased

        DAR();
    }//GEN-LAST:event_CTKeyReleased

    private void PagadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagadoKeyReleased

        DAR1();
    }//GEN-LAST:event_PagadoKeyReleased

    private void share2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share2MouseClicked

        int seleccionar = share2.getSelectedRow();
        ApTaller.setText(String.valueOf(share2.getValueAt(seleccionar, 0)));
        Amtaller.setText(String.valueOf(share2.getValueAt(seleccionar, 1)));
        NameTaller.setText(String.valueOf(share2.getValueAt(seleccionar, 2)));
        Zona1.setText(String.valueOf(share2.getValueAt(seleccionar, 3)));
        Serv1.setText(String.valueOf(share2.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share2MouseClicked

    private void BusnameODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusnameODTKeyReleased

        sharetp();
    }//GEN-LAST:event_BusnameODTKeyReleased

    private void AgregartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregartallerActionPerformed

        AgregarT();
        MDT();
    }//GEN-LAST:event_AgregartallerActionPerformed

    private void ModificartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificartallerActionPerformed

        editarT();
        MDT();
    }//GEN-LAST:event_ModificartallerActionPerformed

    private void QAPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_QAPItemStateChanged

        String dt = (String) QAP.getSelectedItem();
        if (dt.equals(".")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("1 Quincena")) {
            Q1.setText("" + Q01 + "");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("2 Quincenas")) {
            Q1.setText("0");
            Q2.setText("" + Q02 + "");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("3 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("" + Q03 + "");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }

        if (dt.equals("4 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("" + Q04 + "");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("5 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("" + Q05 + "");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("6 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("" + Q06 + "");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("7 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("" + Q07 + "");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("8 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("" + Q08 + "");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("9 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("" + Q09 + "");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("10 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("" + Q010 + "");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("11 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("" + Q011 + "");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("12 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("" + Q012 + "");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("13 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("" + Q013 + "");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("14 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("" + Q014 + "");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("15 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("" + Q015 + "");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("16 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("" + Q016 + "");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("17 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("" + Q017 + "");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("18 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("" + Q018 + "");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("19 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("" + Q019 + "");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("20 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("" + Q020 + "");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("21 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("" + Q021 + "");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("22 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("" + Q022 + "");
            Q23.setText("0");
            Q24.setText("0");
        }
        if (dt.equals("23 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("" + Q023 + "");
            Q24.setText("0");
        }
        if (dt.equals("24 Quincenas")) {
            Q1.setText("0");
            Q2.setText("0");
            Q3.setText("0");
            Q4.setText("0");
            Q5.setText("0");
            Q6.setText("0");
            Q7.setText("0");
            Q8.setText("0");
            Q9.setText("0");
            Q10.setText("0");
            Q11.setText("0");
            Q12.setText("0");
            Q13.setText("0");
            Q14.setText("0");
            Q15.setText("0");
            Q16.setText("0");
            Q17.setText("0");
            Q18.setText("0");
            Q19.setText("0");
            Q20.setText("0");
            Q21.setText("0");
            Q22.setText("0");
            Q23.setText("0");
            Q24.setText("" + Q024 + "");
        }
        PQt();
    }//GEN-LAST:event_QAPItemStateChanged

    private void CS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS6ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS6ActionPerformed

    private void FshTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FshTItemStateChanged

        String dt = (String) FshT.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            LabelODT1.setVisible(false);
            BusnameODT.setVisible(false);
            BusnameODT.setText("");
            BusapshODT.setText("");
            BusapshODT.setVisible(false);
            BusamshODT.setText("");
            BusamshODT.setVisible(false);
            sharetp();
        }
        if (dt.equals("Apellido P")) {
            LabelODT1.setVisible(true);
            LabelODT1.setText("Buscar por Apellido P:");
            BusnameODT.setVisible(false);
            BusnameODT.setText("");
            BusapshODT.setText("");
            BusapshODT.setVisible(true);
            BusamshODT.setText("");
            BusamshODT.setVisible(false);
            sharetp();
        }
        if (dt.equals("Apellido M")) {
            LabelODT1.setVisible(true);
            LabelODT1.setText("Buscar por Apellido M:");
            BusnameODT.setVisible(false);
            BusnameODT.setText("");
            BusapshODT.setText("");
            BusapshODT.setVisible(false);
            BusamshODT.setText("");
            BusamshODT.setVisible(true);
            sharetp();
        }
        if (dt.equals("Nombre(s)")) {
            LabelODT1.setVisible(true);
            LabelODT1.setText("Buscar por Nombre(s):");
            BusnameODT.setVisible(true);
            BusnameODT.setText("");
            BusapshODT.setText("");
            BusapshODT.setVisible(false);
            BusamshODT.setText("");
            BusamshODT.setVisible(false);
            sharetp();

        }
    }//GEN-LAST:event_FshTItemStateChanged

    private void BusapshODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusapshODTKeyReleased

        sharetp();
    }//GEN-LAST:event_BusapshODTKeyReleased

    private void BusamshODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusamshODTKeyReleased

        sharetp();
    }//GEN-LAST:event_BusamshODTKeyReleased

    private void FnameodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FnameodtKeyReleased
        MDT();
    }//GEN-LAST:event_FnameodtKeyReleased

    private void OdTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OdTMouseClicked

        DefaultTableModel model = (DefaultTableModel) OdT.getModel();
        try {

            int fila = OdT.getSelectedRow();
            Ndo.setText(String.valueOf(OdT.getValueAt(fila, 0)));
            FE.setText(String.valueOf(OdT.getValueAt(fila, 1)));
            ApTaller.setText(String.valueOf(OdT.getValueAt(fila, 2)));
            Amtaller.setText(String.valueOf(OdT.getValueAt(fila, 3)));
            NameTaller.setText(String.valueOf(OdT.getValueAt(fila, 4)));
            Zona1.setText(String.valueOf(OdT.getValueAt(fila, 5)));
            Serv1.setText(String.valueOf(OdT.getValueAt(fila, 6)));
            Marca.setText(String.valueOf(OdT.getValueAt(fila, 7)));
            Modelo.setText(String.valueOf(OdT.getValueAt(fila, 8)));
            Placas.setText(String.valueOf(OdT.getValueAt(fila, 9)));
            Color.setText(String.valueOf(OdT.getValueAt(fila, 10)));
            ndp.setText(String.valueOf(OdT.getValueAt(fila, 11)));
            Daño.setText(String.valueOf(OdT.getValueAt(fila, 12)));
            CT.setText(String.valueOf(OdT.getValueAt(fila, 13)));

            Iad.setText(String.valueOf(OdT.getValueAt(fila, 17)));

            Pagado.setText(String.valueOf(OdT.getValueAt(fila, 19)));
            Pendiente.setText(String.valueOf(OdT.getValueAt(fila, 20)));
            PQT.setText(String.valueOf(OdT.getValueAt(fila, 21)));

            Observaciones.setText(String.valueOf(OdT.getValueAt(fila, 24)));

            String combo4 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Statusodt.getItemCount(); i++) {
                if (Statusodt.getItemAt(i).equalsIgnoreCase(combo4)) {
                    Statusodt.setSelectedIndex(i);
                }
            }

            String combo1 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < Paodt.getItemCount(); i++) {
                if (Paodt.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Paodt.setSelectedIndex(i);
                }
            }

            String combo3 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < QAP.getItemCount(); i++) {
                if (QAP.getItemAt(i).equalsIgnoreCase(combo3)) {
                    QAP.setSelectedIndex(i);
                }
            }
            String combo2 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < Fdp.getItemCount(); i++) {
                if (Fdp.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Fdp.setSelectedIndex(i);
                }
            }
            int id = Integer.parseInt(OdT.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from `nomina.odt` where idTaller =?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {
                if (rs.getString("Ingreso a taller").equals("Si")) {
                    Si.setSelected(true);
                } else if (rs.getString("Ingreso a taller").equals("No")) {
                    no.setSelected(true);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }


    }//GEN-LAST:event_OdTMouseClicked

    private void EliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTActionPerformed

        eliminarT();
        MDT();
    }//GEN-LAST:event_EliminarTActionPerformed

    private void CS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS7ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS7ActionPerformed

    private void FiltrosTODTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTODTItemStateChanged
        String FTP = (String) FiltrosTODT.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            Labelfilodt.setVisible(false);
            Fnameodt.setVisible(false);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(false);
            FilAmodt.setText("");
            FilAmodt.setVisible(false);
            MDT();
        }
        if (FTP.equals("Apellido P")) {
            Labelfilodt.setVisible(true);
            Labelfilodt.setText("Buscar por Apellido P:");
            Fnameodt.setVisible(false);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(true);
            FilAmodt.setText("");
            FilAmodt.setVisible(false);
            MDT();
        }
        if (FTP.equals("Apellido M")) {
            Labelfilodt.setVisible(true);
            Labelfilodt.setText("Buscar por Apellido M:");
            Fnameodt.setVisible(false);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(false);
            FilAmodt.setText("");
            FilAmodt.setVisible(true);
            MDT();
        }
        if (FTP.equals("Nombre(s)")) {
            Labelfilodt.setVisible(true);
            Labelfilodt.setText("Buscar por Nombre(s):");
            Fnameodt.setVisible(true);
            Fnameodt.setText("");
            FilApodt.setText("");
            FilApodt.setVisible(false);
            FilAmodt.setText("");
            FilAmodt.setVisible(false);
            MDT();

        }
    }//GEN-LAST:event_FiltrosTODTItemStateChanged

    private void FilApodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilApodtKeyReleased
        MDT();
    }//GEN-LAST:event_FilApodtKeyReleased

    private void FilAmodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAmodtKeyReleased
        MDT();
    }//GEN-LAST:event_FilAmodtKeyReleased

    private void FiltrosPDODTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPDODTItemStateChanged
        String FTP = (String) FiltrosPDODT.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            LabelfilPODT.setVisible(false);
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("Apellido P")) {
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Apellido P:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(true);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();
        }
        if (FTP.equals("Apellido M")) {
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Apellido M:");
            FilnamePODT.setVisible(false);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(true);
            MDTPODT();
        }
        if (FTP.equals("Nombre(s)")) {
            LabelfilPODT.setVisible(true);
            LabelfilPODT.setText("Buscar por Nombre(s):");
            FilnamePODT.setVisible(true);
            FilnamePODT.setText("");
            FilApPODT.setText("");
            FilApPODT.setVisible(false);
            FilAmPODT.setText("");
            FilAmPODT.setVisible(false);
            MDTPODT();

        }
    }//GEN-LAST:event_FiltrosPDODTItemStateChanged

    private void FilnamePODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilnamePODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilnamePODTKeyReleased

    private void FilApPODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilApPODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilApPODTKeyReleased

    private void FilAmPODTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilAmPODTKeyReleased
        MDTPODT();
    }//GEN-LAST:event_FilAmPODTKeyReleased

    private void CNQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CNQActionPerformed
        NominaQ_5 regr = new NominaQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CNQActionPerformed

    private void CDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDAActionPerformed
        CDAQ_5 regr = new CDAQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CDAActionPerformed

    private void PRESQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PRESQActionPerformed
        PresQ_5 regr = new PresQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PRESQActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        NominaQSiMSS_5 regr = new NominaQSiMSS_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NominaS_5 regr = new NominaS_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PresS_5 regr = new PresS_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        NominaS_simss_5 regr = new NominaS_simss_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Listas_5 regr = new Listas_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

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
            java.util.logging.Logger.getLogger(ODTQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ODTQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ODTQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ODTQ_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ODTQ_5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregartaller;
    private javax.swing.JTextField Amtaller;
    private javax.swing.JTextField ApTaller;
    private javax.swing.JTextField BusamshODT;
    private javax.swing.JTextField BusapshODT;
    private javax.swing.JTextField BusnameODT;
    private javax.swing.JMenuItem CDA;
    private javax.swing.JMenuItem CNQ;
    private javax.swing.JButton CS6;
    private javax.swing.JButton CS7;
    private javax.swing.JTextField CT;
    private javax.swing.JTextField Color;
    private javax.swing.JTextArea Daño;
    private javax.swing.JButton EliminarT;
    private javax.swing.JTextField FE;
    private javax.swing.JComboBox<String> Fdp;
    private javax.swing.JTextField FilAmPODT;
    private javax.swing.JTextField FilAmodt;
    private javax.swing.JTextField FilApPODT;
    private javax.swing.JTextField FilApodt;
    private javax.swing.JTextField FilnamePODT;
    private javax.swing.JComboBox<String> FiltrosPDODT;
    private javax.swing.JComboBox<String> FiltrosTODT;
    private javax.swing.JTextField Fnameodt;
    private javax.swing.JComboBox<String> FshT;
    private javax.swing.JTextField Iad;
    private javax.swing.JLabel LabelODT1;
    private javax.swing.JLabel LabelfilPODT;
    private javax.swing.JLabel Labelfilodt;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Modelo;
    private javax.swing.JButton Modificartaller;
    private javax.swing.JTextField NameTaller;
    private javax.swing.JTextField Ndo;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JTable OdT;
    private javax.swing.JTextField PQT;
    private javax.swing.JMenuItem PRESQ;
    private javax.swing.JTextField Pagado;
    private javax.swing.JComboBox<String> Paodt;
    private javax.swing.JTextField Pendiente;
    private javax.swing.JTabbedPane PestañasPrin;
    private javax.swing.JTextField Placas;
    private javax.swing.JLabel Q1;
    private javax.swing.JLabel Q10;
    private javax.swing.JLabel Q11;
    private javax.swing.JLabel Q12;
    private javax.swing.JLabel Q13;
    private javax.swing.JLabel Q14;
    private javax.swing.JLabel Q15;
    private javax.swing.JLabel Q16;
    private javax.swing.JLabel Q17;
    private javax.swing.JLabel Q18;
    private javax.swing.JLabel Q19;
    private javax.swing.JLabel Q2;
    private javax.swing.JLabel Q20;
    private javax.swing.JLabel Q21;
    private javax.swing.JLabel Q22;
    private javax.swing.JLabel Q23;
    private javax.swing.JLabel Q24;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel Q6;
    private javax.swing.JLabel Q7;
    private javax.swing.JLabel Q8;
    private javax.swing.JLabel Q9;
    private javax.swing.JComboBox<String> QAP;
    private javax.swing.JTextField QPodt;
    private javax.swing.JTextField Serv1;
    private javax.swing.JRadioButton Si;
    private javax.swing.JComboBox<String> Statusodt;
    private javax.swing.JScrollPane TDPODT;
    private javax.swing.JTable TPODT;
    private javax.swing.JScrollPane TTalleres;
    private javax.swing.JScrollPane Talleres;
    private javax.swing.JTextField Zona1;
    private botones.BotonWeb botonWeb4;
    private botones.BotonWeb botonWeb6;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField ndp;
    private javax.swing.JRadioButton no;
    private javax.swing.JTable share2;
    // End of variables declaration//GEN-END:variables
}
