/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//
package Admin;

import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import Inicio.Login_2;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class Admin_Nomina_5 extends javax.swing.JFrame {

    int a = 1;
    int Pa = 10;
    int b = 15;
    int c = 20;
    int D = 25;
    int e = 2;
    int f = 4;
    int g = 6;
    int h = 8;
    ButtonGroup IAT;
    ButtonGroup DAB;
    int Q01 = 1;
    int Q02 = 2;
    int Q03 = 3;
    int Q04 = 4;
    int Q05 = 5;
    int Q06 = 6;
    int Q07 = 7;
    int Q08 = 8;
    int Q09 = 9;
    int Q010 = 10;
    int Q011 = 11;
    int Q012 = 12;
    int Q013 = 13;
    int Q014 = 14;
    int Q015 = 15;
    int Q016 = 16;
    int Q017 = 17;
    int Q018 = 18;
    int Q019 = 19;
    int Q020 = 20;
    int Q021 = 21;
    int Q022 = 22;
    int Q023 = 23;
    int Q024 = 24;
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    /**
     * Creates new form Nomina_4
     */
    public Admin_Nomina_5() {
        initComponents();
        LabelPrestamos.setVisible(false);
        BE.setVisible(false);
        BE.setText("");
        Busapshpre.setText("");
        Busapshpre.setVisible(false);
        Busamshpre.setText("");
        Busamshpre.setVisible(false);
        LabelPrestamos1.setVisible(false);
        BE1.setVisible(false);
        BE1.setText("");
        Busapshpre1.setText("");
        Busapshpre1.setVisible(false);
        Busamshpre1.setText("");
        Busamshpre1.setVisible(false);
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FiltroZnomina.setModel(modelzonas);
        FiltrosZonas FZP = new FiltrosZonas();
        DefaultComboBoxModel modelFZP = new DefaultComboBoxModel(FZP.mostrarzonas());
        FiltroZP.setModel(modelFZP);
        FiltrosZonas FSZP = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP = new DefaultComboBoxModel(FSZP.mostrarzonas());
        FiltroSZP.setModel(modelFSZP);
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        FZservicio.setModel(MODELFZS);
        año.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        shareprestamo();
        shareN();
        sharetp();
        mostrardatos();
        pagos();
        txtid.setVisible(false);
        Bono.setVisible(false);
        MDP();
        IAT = new ButtonGroup();
        IAT.add(Si);
        IAT.add(no);
        DAB = new ButtonGroup();
        DAB.add(Bsi);
        DAB.add(Bno);
        MDT();
        LabelBE.setVisible(false);
        LabelBQ.setVisible(false);
        LabelBS.setVisible(false);
        LabelBZ.setVisible(false);
        LabelSZ.setVisible(false);
        Nominab.setText("");
        Nominab.setVisible(false);
        FiltroZnomina.setVisible(false);
        FiltroZnomina.setSelectedIndex(0);
        FiltroSnomina.setVisible(false);
        FiltroSnomina.setSelectedIndex(0);
        FZservicio.setVisible(false);
        FZservicio.setSelectedIndex(0);
        FiltroQuincenanomina.setVisible(false);
        FiltroQuincenanomina.setSelectedIndex(0);
        FiltroNDF.setText("");
        FiltroNDF.setVisible(false);
        LabelBNDF.setVisible(false);
        busp.setVisible(false);
        LabelBEP.setVisible(false);
        FiltroQP.setVisible(false);
        FiltroServP.setVisible(false);
        FiltroZP.setVisible(false);
        FiltroSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelBQP.setVisible(false);
        LabelBSP.setVisible(false);
        LabelSZP.setVisible(false);
        LabelNDFP.setVisible(false);
        LabelBZP.setVisible(false);
        Filtro1.setVisible(false);
        Filtro1.setText("");
        search.setVisible(false);
        search.setText("");
        BAPNom.setText("");
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        BAMNom.setText("");
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        Volver.setVisible(false);
        setIconImage(new ImageIcon(Admin_Nomina_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    public void limpiarnom() {
        DAB.clearSelection();
        fol.setText("");
        Ap.setText("");
        am.setText("");
        name.setText("");
        txtid.setText("");
        Bono.setText("0");
        cta.setText("");
        ban.setText("");
        Zon.setText("");
        lug.setText("");
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
        Quincenas.setSelectedIndex(0);
        DT.setSelectedIndex(0);
        DT1.setSelectedIndex(0);
        DT2.setSelectedIndex(0);
        DT3.setSelectedIndex(0);
        DT4.setSelectedIndex(0);
        DT5.setSelectedIndex(0);
        DT6.setSelectedIndex(0);
        DT7.setSelectedIndex(0);
        DT8.setSelectedIndex(0);
        DT9.setSelectedIndex(0);
        DT10.setSelectedIndex(0);
        DT11.setSelectedIndex(0);
        DT12.setSelectedIndex(0);
        DT13.setSelectedIndex(0);
        DT14.setSelectedIndex(0);
        DT15.setSelectedIndex(0);
    }
//Descuentos varios

    public void dv() {
        double d1 = Double.parseDouble(this.Fdb.getText());
        double d2 = Double.parseDouble(this.Fde.getText());
        double d3 = Double.parseDouble(this.Bp.getText());
        double d4 = Double.parseDouble(this.Sancion.getText());
        double d5 = Double.parseDouble(this.Grua.getText());
        double d6 = Double.parseDouble(this.Playera.getText());
        double d7 = Double.parseDouble(this.Chamarra.getText());
        double d8 = Double.parseDouble(this.Corbata.getText());
        double d9 = Double.parseDouble(this.Pantalon.getText());
        double d10 = Double.parseDouble(this.Chaleco.getText());
        double d11 = Double.parseDouble(this.Credencial.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11;
        this.DVT.setText("" + total + "");
    }

//Compartir con talleres
    public void sharetp() {
        //Buscar empleado
        String Share = BE1.getText();
        String ShareAP = Busapshpre1.getText();
        String ShareAM = Busamshpre1.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share2.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con talleres: " + e.getMessage());

        }

    }
//compartir con prestamos

    public void shareprestamo() {
        //Buscar empleado
        String Share = BE.getText();
        String ShareAP = Busapshpre.getText();
        String ShareAM = Busamshpre.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Servicio`, `Zona` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share1.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

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
                share1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con prestamos: " + e.getMessage());

        }

    }

//descanso sin gose de sueldo
    public void DSGS() {
        double d1 = Double.parseDouble(this.DSGS1.getText());
        double d2 = Double.parseDouble(this.DSGS2.getText());
        double d3 = Double.parseDouble(this.DSGS3.getText());
        double d4 = Double.parseDouble(this.DSGS4.getText());
        double d5 = Double.parseDouble(this.DSGS5.getText());
        double d6 = Double.parseDouble(this.DSGS6.getText());
        double d7 = Double.parseDouble(this.DSGS7.getText());
        double d8 = Double.parseDouble(this.DSGS8.getText());
        double d9 = Double.parseDouble(this.DSGS9.getText());
        double d10 = Double.parseDouble(this.DSGS10.getText());
        double d11 = Double.parseDouble(this.DSGS11.getText());
        double d12 = Double.parseDouble(this.DSGS12.getText());
        double d13 = Double.parseDouble(this.DSGS13.getText());
        double d14 = Double.parseDouble(this.DSGS14.getText());
        double d15 = Double.parseDouble(this.DSGS15.getText());
        double d16 = Double.parseDouble(this.DSGS16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.DSGS.setText("" + total + "");
    }
// Dia laborado

    public void DL() {
        String d1 = DL1.getText();
        String d2 = DL2.getText();
        String d3 = DL3.getText();
        String d4 = DL4.getText();
        String d5 = DL5.getText();
        String d6 = DL6.getText();
        String d7 = DL7.getText();
        String d8 = DL8.getText();
        String d9 = DL9.getText();
        String d10 = DL10.getText();
        String d11 = DL11.getText();
        String d12 = DL12.getText();
        String d13 = DL13.getText();
        String d14 = DL14.getText();
        String d15 = DL15.getText();
        String d16 = DL16.getText();
        int D1 = Integer.parseInt(d1);
        int D2 = Integer.parseInt(d2);
        int D3 = Integer.parseInt(d3);
        int D4 = Integer.parseInt(d4);
        int D5 = Integer.parseInt(d5);
        int D6 = Integer.parseInt(d6);
        int D7 = Integer.parseInt(d7);
        int D8 = Integer.parseInt(d8);
        int D9 = Integer.parseInt(d9);
        int D10 = Integer.parseInt(d10);
        int D11 = Integer.parseInt(d11);
        int D12 = Integer.parseInt(d12);
        int D13 = Integer.parseInt(d13);
        int D14 = Integer.parseInt(d14);
        int D15 = Integer.parseInt(d15);
        int D16 = Integer.parseInt(d16);
        double total = D1 + D2 + D3 + D4 + D5 + D6 + D7 + D8 + D9 + D10 + D11 + D12 + D13 + D14 + D15 + D16;
        DL.setText("" + total + "");

    }
//descanso trabajado

    public void DT() {
        double d1 = Double.parseDouble(this.dt1.getText());
        double d2 = Double.parseDouble(this.dt2.getText());
        double d3 = Double.parseDouble(this.dt3.getText());
        double d4 = Double.parseDouble(this.dt4.getText());
        double d5 = Double.parseDouble(this.dt5.getText());
        double d6 = Double.parseDouble(this.dt6.getText());
        double d7 = Double.parseDouble(this.dt7.getText());
        double d8 = Double.parseDouble(this.dt8.getText());
        double d9 = Double.parseDouble(this.dt9.getText());
        double d10 = Double.parseDouble(this.dt10.getText());
        double d11 = Double.parseDouble(this.dt11.getText());
        double d12 = Double.parseDouble(this.dt12.getText());
        double d13 = Double.parseDouble(this.dt13.getText());
        double d14 = Double.parseDouble(this.dt14.getText());
        double d15 = Double.parseDouble(this.dt15.getText());
        double d16 = Double.parseDouble(this.dt16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.dt.setText("" + total + "");
    }
//falta

    public void F() {
        double d1 = Double.parseDouble(this.F1.getText());
        double d2 = Double.parseDouble(this.F2.getText());
        double d3 = Double.parseDouble(this.F3.getText());
        double d4 = Double.parseDouble(this.F4.getText());
        double d5 = Double.parseDouble(this.F5.getText());
        double d6 = Double.parseDouble(this.F6.getText());
        double d7 = Double.parseDouble(this.F7.getText());
        double d8 = Double.parseDouble(this.F8.getText());
        double d9 = Double.parseDouble(this.F9.getText());
        double d10 = Double.parseDouble(this.F10.getText());
        double d11 = Double.parseDouble(this.F11.getText());
        double d12 = Double.parseDouble(this.F12.getText());
        double d13 = Double.parseDouble(this.F13.getText());
        double d14 = Double.parseDouble(this.F14.getText());
        double d15 = Double.parseDouble(this.F15.getText());
        double d16 = Double.parseDouble(this.F16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.F.setText("" + total + "");
    }
//Falta justificada

    public void FJ() {
        double d1 = Double.parseDouble(this.FJ1.getText());
        double d2 = Double.parseDouble(this.FJ2.getText());
        double d3 = Double.parseDouble(this.FJ3.getText());
        double d4 = Double.parseDouble(this.FJ4.getText());
        double d5 = Double.parseDouble(this.FJ5.getText());
        double d6 = Double.parseDouble(this.FJ6.getText());
        double d7 = Double.parseDouble(this.FJ7.getText());
        double d8 = Double.parseDouble(this.FJ8.getText());
        double d9 = Double.parseDouble(this.FJ9.getText());
        double d10 = Double.parseDouble(this.FJ10.getText());
        double d11 = Double.parseDouble(this.FJ11.getText());
        double d12 = Double.parseDouble(this.FJ12.getText());
        double d13 = Double.parseDouble(this.FJ13.getText());
        double d14 = Double.parseDouble(this.FJ14.getText());
        double d15 = Double.parseDouble(this.FJ15.getText());
        double d16 = Double.parseDouble(this.FJ16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.FJ.setText("" + total + "");
    }
//retardos

    public void R() {
        double d1 = Double.parseDouble(this.R1.getText());
        double d2 = Double.parseDouble(this.R2.getText());
        double d3 = Double.parseDouble(this.R3.getText());
        double d4 = Double.parseDouble(this.R4.getText());
        double d5 = Double.parseDouble(this.R5.getText());
        double d6 = Double.parseDouble(this.R6.getText());
        double d7 = Double.parseDouble(this.R7.getText());
        double d8 = Double.parseDouble(this.R8.getText());
        double d9 = Double.parseDouble(this.R9.getText());
        double d10 = Double.parseDouble(this.R10.getText());
        double d11 = Double.parseDouble(this.R11.getText());
        double d12 = Double.parseDouble(this.R12.getText());
        double d13 = Double.parseDouble(this.R13.getText());
        double d14 = Double.parseDouble(this.R14.getText());
        double d15 = Double.parseDouble(this.R15.getText());
        double d16 = Double.parseDouble(this.R16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.R.setText("" + total + "");
    }
//Descanso otorgado

    public void DO() {
        double d1 = Double.parseDouble(this.DO1.getText());
        double d2 = Double.parseDouble(this.DO2.getText());
        double d3 = Double.parseDouble(this.DO3.getText());
        double d4 = Double.parseDouble(this.DO4.getText());
        double d5 = Double.parseDouble(this.DO5.getText());
        double d6 = Double.parseDouble(this.DO6.getText());
        double d7 = Double.parseDouble(this.DO7.getText());
        double d8 = Double.parseDouble(this.DO8.getText());
        double d9 = Double.parseDouble(this.DO9.getText());
        double d10 = Double.parseDouble(this.DO10.getText());
        double d11 = Double.parseDouble(this.DO11.getText());
        double d12 = Double.parseDouble(this.DO12.getText());
        double d13 = Double.parseDouble(this.DO13.getText());
        double d14 = Double.parseDouble(this.DO14.getText());
        double d15 = Double.parseDouble(this.DO15.getText());
        double d16 = Double.parseDouble(this.DO16.getText());

        double total = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16;
        this.DO.setText("" + total + "");
    }

    public void shareN() {
        //Buscar empleado
        String Share = search.getText();
        String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();
        String where = "select `Apellido P`, `Apellido M`, `Nombre(s)`, `Sueldo`, `Servicio`, `Cuenta banco`, `Banco`, `Zona`, `Caja de ahorro`,"
                + " `Bono` from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Sueldo`, `Servicio`, `Cuenta banco`, `Banco`, `Zona`, `Caja de ahorro`, `Bono` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Sueldo`, `Servicio`, `Cuenta banco`, `Banco`, `Zona`, `Caja de ahorro`, `Bono` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `Apellido P`, `Apellido M`, `Nombre(s)`, `Sueldo`, `Servicio`, `Cuenta banco`, `Banco`, `Zona`, `Caja de ahorro`, `Bono` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Sueldo");
            modelo.addColumn("Servicio");//5
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Caja de ahorro");//9
            modelo.addColumn("Bono");

//Anchos
            int[] anchos = {50, 50, 100, 50, 175, 100, 60, 60, 40, 40};

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + e.getMessage());

        }

    }

//pago por quincena (division)
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

        double total = d25 / (d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10 + d11 + d12 + d13 + d14 + d15 + d16 + d17 + d18 + d19 + d20 + d21 + d22 + d23 + d24);
        this.PQT.setText("" + total + "");
    }

    public void eliminarT() {

        try {

            int filaseleccionada = OdT.getSelectedRow();
            String sql = "delete from taller where idtaller=" + OdT.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Orden eliminada.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar orden: " + e.getMessage());

        }

    }

//Mostrar orden de taller
    public void MDT() {
        //Buscar empleado
        String Share = Bodt.getText();
        /*String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();*/
        String where = "select * from taller";

        if (!"".equals(Share)) {
            where = " select * from taller WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        }
        /*else if (!"".equals(ShareAP)) {
            where = " select * from taller WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * from taller WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }*/

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            OdT.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

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
            modelo.addColumn("Importe a descontar");//17
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//19
            modelo.addColumn("Pago por quincena");
            modelo.addColumn("Forma de pago");//21
            modelo.addColumn("Observaciones");

//Anchos
            int[] anchos = {/*ndo*/35, /*fde*/ 50, /*ap*/ 55, /*am*/ 55, /*nom*/ 150,
                /*Zon*/ 60, /*serv*/ 75, /*Marca*/ 60, /*Modelo*/ 60, /*Placas*/ 60, /*Color*/ 60,
                /*NDP*/ 50, /*Dano*/ 500,
                /*CT*/ 55, /*IAT*/ 60, /*Status*/ 60, /*IAD*/ 60, /*PAGA*/ 55,
                /*PENDIENTE*/ 55, /*PPQ*/ 70, /*FDP*/ 65,/*obs*/ 1000};

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
//Editar orden de taller

    public void editarT() {
        int id = Integer.parseInt(Ndo.getText());
        String Item = Statustaller.getSelectedItem().toString();
        String Item1 = Fdp.getSelectedItem().toString();
        String Iat;
        if (Si.isSelected() == true) {
            Iat = "Si";
        } else if (no.isSelected() == true) {
            Iat = "No";
        } else {
            Iat = "Si";
        }
        String SQL = "UPDATE `taller` SET `Fecha de expedicion` = ?,"
                + " `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?,"
                + " `Zona` = ?, `Servicio` = ?, `Marca` = ?, `Modelo` = ?,"
                + " `Placas` = ?, `Color` = ?, `# de piezas` = ?, `Daño` = ?,"
                + " `Costo total` = ?, `Ingreso a taller` = ?, `Status` = ?,"
                + " `Importe a descontar` = ?, `Cobrado` = ?, `Pagado` = ?,"
                + " `Pendiente` = ?, `Por quincenas` = ?, `Forma de pago` = ?,"
                + " `Observaciones` = ? WHERE `taller`.`idTaller` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, FE.getText());
            pst.setString(2, ApTaller.getText());
            pst.setString(3, Amtaller.getText());
            pst.setString(4, NameTaller.getText());
            pst.setString(5, Zona1.getText());
            pst.setString(6, Serv1.getText());
            pst.setString(7, Marca.getText());
            pst.setString(8, Modelo.getText());
            pst.setString(9, Placas.getText());
            pst.setString(10, Color.getText());
            pst.setString(11, ndp.getText());
            pst.setString(12, Daño.getText());
            pst.setString(13, CT.getText());
            pst.setString(14, Iat);
            pst.setString(15, Item);
            pst.setString(16, Iad.getText());
            pst.setString(17, Pagado.getText());
            pst.setString(18, Pendiente.getText());
            pst.setString(19, PQT.getText());
            pst.setString(20, Item1);
            pst.setString(21, Observaciones.getText());
            pst.setInt(22, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orden Modificada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error modificar Orden" + e.getMessage());
        }
    }

    public void limpiarT() {
        Ndo.setText("");
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
        Statustaller.setSelectedIndex(0);
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
        DetallepagoNQodt.setSelectedIndex(0);
        DetallepagoQodt.setSelectedIndex(0);
        Detallespagoodt.setText("");
        OcultoODT.setText("");
    }

    public void limpiarP() {
        Num.setText("");
        FS.setText("");
        Namepres.setText("");
        Appres.setText("");
        Ampres.setText("");
        Zona.setText("");
        Serv.setText("");
        Cantidad.setText("0");
        interes.setText("0");
        Interes.setSelectedIndex(0);
        Mes.setSelectedIndex(0);
        PQ.setText("0");
        MT.setText("0");
        Carpeta.setText("");
        FL.setText("");
        Status.setText("");
        Metodo.setText("");

    }

    //agregar orden de taller
    public void AgregarT() {
        int ndo = Integer.parseInt(Ndo.getText());
        String Item = Statustaller.getSelectedItem().toString();
        String Item1 = Fdp.getSelectedItem().toString();
        String Iat;
        if (Si.isSelected() == true) {
            Iat = "Si";
        } else if (no.isSelected() == true) {
            Iat = "No";
        } else {
            Iat = ".";
        }
        String SQL = "INSERT INTO `taller` (`idTaller`, `Fecha de expedicion`,"
                + " `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`,"
                + " `Marca`, `Modelo`, `Placas`, `Color`, `# de piezas`, `Daño`,"
                + " `Costo total`, `Ingreso a taller`, `Status`, `Importe a descontar`,"
                + " `Pagado`, `Pendiente`, `Por quincenas`, `Forma de pago`, `Detalles de pago`, `Observaciones`) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            
            pst.setInt(1, ndo);
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
            pst.setString(16, Item);
            pst.setString(17, Iad.getText());
            pst.setString(18, Pagado.getText());
            pst.setString(19, Pendiente.getText());
            pst.setString(20, PQT.getText());
            pst.setString(21, Item1);
            pst.setString(22, Detallespagoodt.getText());
            pst.setString(23, Observaciones.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Orden de Taller Agregada");

        } catch (HeadlessException | SQLException Ex_Taller) {
            JOptionPane.showMessageDialog(null, "Error al agregar orden de taller: " + Ex_Taller.getMessage());
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

//mostrar datos prestamos
    public void MDP() {
        //Buscar empleado
        String Share = BP.getText();
        /*String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();*/
        String where = "select * from prestamos";

        if (!"".equals(Share)) {
            where = " select * from prestamos WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        }
        /*else if (!"".equals(ShareAP)) {
            where = " select * from taller WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * from taller WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }*/

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Pre.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# de prestamo");//1
            modelo.addColumn("Fecha de solicitud");//
            modelo.addColumn("Mes");//3
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//5
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");//7
            modelo.addColumn("Servicio");
            modelo.addColumn("Cantidad");//9
            modelo.addColumn("Interes");
            modelo.addColumn("Monto total");//11
            modelo.addColumn("Pago por quincena");
            modelo.addColumn("Carpeta de descuentos");//13
            modelo.addColumn("Fecha liberado");
            modelo.addColumn("Status");//15
            modelo.addColumn("Metodo");

//Anchos
            int[] anchos = {/*ndp*/35, /*fds*/ 50, /*mes*/ 45, /*ap*/ 55, /*am*/ 55, /*Nom*/ 125, /*zon*/ 65, /*Serv*/ 80, /*Cantidad*/ 55, /*inte*/ 50,
                /*MT*/ 55, /*PQ*/ 75, /*CDD*/ 250, /*FL*/ 55, /*STATUS*/ 70, /*METODO*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Pre.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

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

    public void MTo() {
        double d1 = Double.parseDouble(this.Cantidad.getText());
        double d2 = Double.parseDouble(this.interes.getText());
        double total = (d1 + d2);
        this.MT.setText("" + total + "");
    }
//por quincena

    public void pq() {
        double d1 = Double.parseDouble(this.Q2.getText());
        double d2 = Double.parseDouble(this.Q4.getText());
        double d3 = Double.parseDouble(this.Q6.getText());
        double d4 = Double.parseDouble(this.Q8.getText());

        double d6 = Double.parseDouble(this.MT.getText());

        double total = d6 / (d1 + d2 + d3 + d4);
        this.PQ.setText("" + total + "");
    }

    public void interes1() {
        double d1 = Double.parseDouble(this.M1.getText());
        double d2 = Double.parseDouble(this.M2.getText());
        double d3 = Double.parseDouble(this.M3.getText());
        double d4 = Double.parseDouble(this.M4.getText());
        double d5 = Double.parseDouble(this.Cantidad.getText());
        double d7 = (d1 * d5) / 100;
        double d8 = (d2 * d5) / 100;
        double d9 = ((d3 * d5) / 100);
        double d10 = ((d4 * d5) / 100);
        double total = (d7 + d8 + d9 + d10);
        this.interes.setText("" + total + "");
    }

    public void eliminarpre() {

        try {

            int filaseleccionada = Pre.getSelectedRow();
            String sql = "delete from prestamos where idprestamos=" + Pre.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Prestamo eliminado.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar prestamo: " + e.getMessage());

        }

    }

    public void editarpre() {
        int id = Integer.parseInt(Num.getText());
        String Item = Mes.getSelectedItem().toString();
        String SQL = "UPDATE prestamos SET `Fecha de solicitud` = ?, `Mes` = ?, "
                + "`Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Zona` = ?, "
                + "`Servicio` = ?, `Cantidad` = ?, `Interes` = ?, `Monto total` = ?,"
                + " `Por quincena` = ?, `Carpeta de descuentos` = ?, `Fecha liberado` = ?,"
                + " `Status` = ?, `Metodo` = ? WHERE (`idprestamos` = ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, FS.getText());
            pst.setString(2, Item);
            pst.setString(3, Appres.getText());
            pst.setString(4, Ampres.getText());
            pst.setString(5, Namepres.getText());
            pst.setString(6, Zona.getText());
            pst.setString(7, Serv.getText());
            pst.setString(8, Cantidad.getText());
            pst.setString(9, interes.getText());
            pst.setString(10, MT.getText());
            pst.setString(11, PQ.getText());
            pst.setString(12, Carpeta.getText());
            pst.setString(13, FL.getText());
            pst.setString(14, Status.getText());
            pst.setString(15, Metodo.getText());
            pst.setInt(16, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Modificado");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Prestamo: " + e.getMessage());
        }
    }

    public void AgregarPre() {

        String Item = Mes.getSelectedItem().toString();
        String SQL = "insert into prestamos (`Fecha de solicitud`, `Mes`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`, `Cantidad`,"
                + " `Interes`, `Monto total`, `Por quincena`, `Carpeta de descuentos`,"
                + " `Fecha liberado`, `Status`, `Metodo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, FS.getText());
            pst.setString(2, Item);
            pst.setString(3, Appres.getText());
            pst.setString(4, Ampres.getText());
            pst.setString(5, Namepres.getText());
            pst.setString(6, Zona.getText());
            pst.setString(7, Serv.getText());
            pst.setString(8, Cantidad.getText());
            pst.setString(9, interes.getText());
            pst.setString(10, MT.getText());
            pst.setString(11, PQ.getText());
            pst.setString(12, Carpeta.getText());
            pst.setString(13, FL.getText());
            pst.setString(14, Status.getText());
            pst.setString(15, Metodo.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Agregado");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar prestamo: " + e.getMessage());
        }
    }

    public void pagos() {
        //Nombre persona del pago
        String FiltroN = busp.getText();
        String FAPpago = BAppag.getText();
        String FAMpago = Bampag.getText();
        String where = "select * from pago";
        String FiltroZpago = FiltroZP.getSelectedItem().toString();
        String FiltroSpago = FiltroServP.getSelectedItem().toString();
        String FiltroQuinpago = FiltroQP.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            where = "Select * from pago where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            where = "select * from pago Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            where = "select * from pago Where `Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            where = "select * from pago Where `# Folio` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroZpago)) {
            where = "select * from pago where `Zona` LIKE '%" + FiltroZpago + "%'";
        } else if (!"".equals(FiltroSpago)) {
            where = "select * from pago where `Servicio` LIKE '%" + FiltroSpago + "%'";
        } else if (!"".equals(FiltroQuinpago)) {
            where = "select * from pago Where `Quincena` LIKE '%" + FiltroQuinpago + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            pago.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID BD");//1
            modelo.addColumn("# Folio");
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//5
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");//7
            modelo.addColumn("Banco");
            modelo.addColumn("Zona");//9
            modelo.addColumn("Servicio");
            modelo.addColumn("Quincena del mes");//11
            modelo.addColumn("Año");
            modelo.addColumn("Sueldo Quincenal");//13
            modelo.addColumn("Deposito");

//Anchos hasta año
            int[] anchos = {50, 50, 50, 50, 150, 35, 65, 55, 60, 80, 150, 15,
                //anchos hasta Deposito
                150, 75};

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla Nomina: " + e.getMessage());

        }

    }

    public void agregarP() {
        String Item = Quincenas.getSelectedItem().toString();

        String SQL = "INSERT INTO `confort`.`pago` (`# Folio`, `Apellido P`, `Apellido M`, "
                + "`Nombre(s)`, `Bono`, `Cuenta`, `Banco`, `Zona`, `Servicio`, `Quincena`, `Año`, `Sueldo Quincenal`,"
                + " `Deposito`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, fol.getText());
            pst.setString(2, Ap.getText());
            pst.setString(3, am.getText());
            pst.setString(4, name.getText());
            pst.setString(5, Bono.getText());
            pst.setString(6, cta.getText());
            pst.setString(7, ban.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, lug.getText());
            pst.setString(10, Item);
            pst.setString(11, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(12, sueldo.getText());
            pst.setString(13, deposito.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago agregado.");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar Pago: " + e.getMessage());
        }

    }

    public void editarp() {
        int id = Integer.parseInt(txtid.getText());
        String Item = Quincenas.getSelectedItem().toString();
        String SQL = "UPDATE `confort`.`pago` SET `# Folio` = ?,`Apellido P` = ?, `Apellido M` = ?,"
                + " `Nombre(s)` = ?, `Bono` = ?, `Cuenta` = ?, `Banco` = ?, `Zona` = ?,"
                + "`Servicio` = ?, `Quincena` = ?, `Año` = ?, `Sueldo Quincenal` = ?, `Deposito` = ? WHERE (`idPago` = ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, fol.getText());
            pst.setString(2, Ap.getText());
            pst.setString(3, am.getText());
            pst.setString(4, name.getText());
            pst.setString(5, Bono.getText());
            pst.setString(6, cta.getText());
            pst.setString(7, ban.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, lug.getText());
            pst.setString(10, Item);
            pst.setString(11, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(12, sueldo.getText());
            pst.setString(13, deposito.getText());
            pst.setInt(14, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago Modificado");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar pago: " + e.getMessage());
        }
    }
//editar nomina

    public void editar() {
        int id = Integer.parseInt(txtid.getText());
        String Item = Quincenas.getSelectedItem().toString();
        String Item2 = DT.getSelectedItem().toString();
        String Item3 = DT1.getSelectedItem().toString();
        String Item4 = DT2.getSelectedItem().toString();
        String Item5 = DT3.getSelectedItem().toString();
        String Item6 = DT4.getSelectedItem().toString();
        String Item7 = DT5.getSelectedItem().toString();
        String Item8 = DT6.getSelectedItem().toString();
        String Item9 = DT7.getSelectedItem().toString();
        String Item10 = DT8.getSelectedItem().toString();
        String Item11 = DT9.getSelectedItem().toString();
        String Item12 = DT10.getSelectedItem().toString();
        String Item13 = DT11.getSelectedItem().toString();
        String Item14 = DT12.getSelectedItem().toString();
        String Item15 = DT13.getSelectedItem().toString();
        String Item16 = DT14.getSelectedItem().toString();
        String Item17 = DT15.getSelectedItem().toString();

        String SQL = "UPDATE `confort`.`nomina` SET `#_Folio` = ?,`Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?,"
                + "`Cuenta_Nom` = ?, `Banco_Nom` = ?, `Zona_Nom` = ?, `Servicio_Nom` = ?, "
                + "`Sueldo_Nom` = ?, `Pd` = ?, `Quincena` = ?, `Año` = ?, `Dia 1 o 16` = ?, `Dia 2 o 17` = ?, `Dia 3 o 18` = ?,"
                + " `Dia 4 o 19` = ?, `Dia 5 o 20` = ?, `Dia 6 o 21` = ?, `Dia 7 o 22` = ?, `Dia 8 o 23` = ?, `Dia 9 o 24` = ?,"
                + " `Dia 10 o 25` = ?, `Dia 11 o 26` = ?, `Dia 12 o 27` = ?, `Dia 13 o 28` = ?, `Dia 14 o 29` = ?, `Dia 15 o 30` = ?, `Dia 31` = ?,"
                + " `Observaciones` = ?, `Desc_v` = ?, `Desc_IMSS` = ?,"
                + " `Apoyo` = ?, `Lugar` = ?, `Caja` = ?, `add` = ?, `Bono` = ?, `Faltantes de boleto` = ?,"
                + " `Faltante de efectivo` = ?, `Boleto perdido` = ?, `Sancion` = ?, `Grua` = ?, `Playera` = ?, "
                + "`Chamarra` = ?, `Pantalon` = ?, `Corbata` = ?, `Chaleco` = ?, `Credencial` = ?, `Orden de taller` = ?, "
                + "`Prestamos` = ?, `Rembolso` = ?, `Deposito` = ? WHERE (`idNomina` = ?);";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, fol.getText());
            pst.setString(2, Ap.getText());
            pst.setString(3, am.getText());
            pst.setString(4, name.getText());
            pst.setString(5, cta.getText());
            pst.setString(6, ban.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, lug.getText());
            pst.setString(9, sueldo.getText());
            pst.setString(10, pd.getText());
            pst.setString(11, Item);
            pst.setString(12, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(13, Item2);
            pst.setString(14, Item3);
            pst.setString(15, Item4);
            pst.setString(16, Item5);
            pst.setString(17, Item6);
            pst.setString(18, Item7);
            pst.setString(19, Item8);
            pst.setString(20, Item9);
            pst.setString(21, Item10);
            pst.setString(22, Item11);
            pst.setString(23, Item12);
            pst.setString(24, Item13);
            pst.setString(25, Item14);
            pst.setString(26, Item15);
            pst.setString(27, Item16);
            pst.setString(28, Item17);
            pst.setString(29, DVT.getText());
            pst.setString(30, DI.getText());
            pst.setString(31, apy.getText());
            pst.setString(32, Lugar.getText());
            pst.setString(33, cda.getText());
            pst.setString(34, ADD.getText());
            pst.setString(35, Bono1.getText());
            pst.setString(36, Fdb.getText());
            pst.setString(37, Fde.getText());
            pst.setString(38, Bp.getText());
            pst.setString(39, Sancion.getText());
            pst.setString(40, Grua.getText());
            pst.setString(41, Playera.getText());
            pst.setString(42, Chamarra.getText());
            pst.setString(43, Pantalon.getText());
            pst.setString(44, Corbata.getText());
            pst.setString(45, Chaleco.getText());
            pst.setString(46, Credencial.getText());
            pst.setString(47, Odtp.getText());
            pst.setString(48, Presp.getText());
            pst.setString(49, Rembolso.getText());
            pst.setString(50, deposito.getText());
            pst.setString(51, obs.getText());
            pst.setInt(52, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Modificada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar nomina: " + e.getMessage());
        }
    }

    public void eliminarnom() {

        try {

            int filaseleccionada = Tnom.getSelectedRow();
            String sql = "delete from nomina where idNomina=" + Tnom.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }

    }

    public void eliminarp() {

        try {

            int filaseleccionada = pago.getSelectedRow();
            String sql = "delete from pago where idPago=" + pago.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Pago eliminado.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar pago: " + e.getMessage());

        }

    }

    public void mostrardatos() {
        //Buscar empleado
        String FiltroN = Nominab.getText();
        String where = "select * from nomina";
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroZnom = FiltroZnomina.getSelectedItem().toString();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroQuin = FiltroQuincenanomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            where = "Select * from nomina where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            where = "select * from nomina Where `#_Folio` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            where = "select * from nomina Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            where = "select * from nomina Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroZnom)) {
            where = "select * from nomina where `Zona_Nom` LIKE '%" + FiltroZnom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            where = "select * from nomina Where `Servicio_Nom` LIKE '%" + FiltroSnom + "%'";
        } else if (!"".equals(FiltroQuin)) {
            where = "select * from nomina Where `Quincena` LIKE '%" + FiltroQuin + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Tnom.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("ID BD");//1
            modelo.addColumn("# Folio");
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//5
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Quincena del mes");
            modelo.addColumn("Año");//13
            modelo.addColumn("Dia 1 o 16");
            modelo.addColumn("Dia 2 o 17");//15
            modelo.addColumn("Dia 3 o 18");
            modelo.addColumn("Dia 4 o 19");//17
            modelo.addColumn("Dia 5 o 20");
            modelo.addColumn("Dia 6 o 21");//19
            modelo.addColumn("Dia 7 o 22");
            modelo.addColumn("Dia 8 o 23");//21
            modelo.addColumn("Dia 9 o 24");
            modelo.addColumn("Dia 10 o 25");//23
            modelo.addColumn("Dia 11 o 26");
            modelo.addColumn("Dia 12 o 27");//25
            modelo.addColumn("Dia 13 o 28");
            modelo.addColumn("Dia 14 o 29");//27
            modelo.addColumn("Dia 15 o 30");
            modelo.addColumn("Dia 31");//29
            modelo.addColumn("Desc.  Varios");
            modelo.addColumn("Desc. IMSS");//31
            modelo.addColumn("Apoyo");
            modelo.addColumn("Lugar");//33
            modelo.addColumn("Caja de ahorro");
            modelo.addColumn("Adicionales");//35
            modelo.addColumn("Bono");
            modelo.addColumn("Faltantes de boleto");//37
            modelo.addColumn("Faltante de efectivo");
            modelo.addColumn("Boleto Perdido");//39
            modelo.addColumn("Sancion");
            modelo.addColumn("Grua");//41
            modelo.addColumn("Playera");
            modelo.addColumn("Chamarra");//43
            modelo.addColumn("Pantalon");
            modelo.addColumn("Corbata");//45
            modelo.addColumn("Chaleco");
            modelo.addColumn("Credencial");//47
            modelo.addColumn("Orden de taller");
            modelo.addColumn("Prestamos");//49
            modelo.addColumn("Rembolso");
            modelo.addColumn("Deposito");//51
            modelo.addColumn("Observaciones");

//Anchos hasta quincena
            int[] anchos = {50, 50, 60, 60, 150, 60, 60, 60, 50, 35, 55, 150,
                //anchos hasta 9-24
                25, 35, 35, 35, 35, 35, 35, 35, 35, 35,
                //anchos hasta apoyo
                35, 35, 35, 35, 35, 35, 25, 55, 40, 50,
                //anchos hasta Playera
                50, 75, 55, 35, 100, 90, 60, 55, 60, 60,
                //anchos hasta observaciones
                55, 60, 55, 60, 65, 75, 65, 65, 65, 600};

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
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla Nomina: " + e.getMessage());

        }

    }

    public void AgregarN() {

        String Item = Quincenas.getSelectedItem().toString();
        String Item2 = DT.getSelectedItem().toString();
        String Item3 = DT1.getSelectedItem().toString();
        String Item4 = DT2.getSelectedItem().toString();
        String Item5 = DT3.getSelectedItem().toString();
        String Item6 = DT4.getSelectedItem().toString();
        String Item7 = DT5.getSelectedItem().toString();
        String Item8 = DT6.getSelectedItem().toString();
        String Item9 = DT7.getSelectedItem().toString();
        String Item10 = DT8.getSelectedItem().toString();
        String Item11 = DT9.getSelectedItem().toString();
        String Item12 = DT10.getSelectedItem().toString();
        String Item13 = DT11.getSelectedItem().toString();
        String Item14 = DT12.getSelectedItem().toString();
        String Item15 = DT13.getSelectedItem().toString();
        String Item16 = DT14.getSelectedItem().toString();
        String Item17 = DT15.getSelectedItem().toString();

        String SQL = "Insert INTO `confort`.`nomina` (`#_Folio`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Cuenta_Nom`,"
                + " `Banco_Nom`, `Zona_Nom`, `Servicio_Nom`, `Sueldo_Nom`, `Pd`, `Quincena`, `Año`,"
                + " `Dia 1 o 16`, `Dia 2 o 17`, `Dia 3 o 18`, `Dia 4 o 19`, `Dia 5 o 20`, `Dia 6 o 21`, `Dia 7 o 22`,"
                + " `Dia 8 o 23`, `Dia 9 o 24`, `Dia 10 o 25`, `Dia 11 o 26`, `Dia 12 o 27`, `Dia 13 o 28`, `Dia 14 o 29`,"
                + " `Dia 15 o 30`, `Dia 31`, `Desc_v`, `Desc_IMSS`, `Apoyo`, `Lugar`, `Caja`, `add`, `Bono`, `Faltantes de boleto`,"
                + " `Faltante de efectivo`, `Boleto perdido`, `Sancion`, `Grua`, `Playera`, `Chamarra`, `Pantalon`, `Corbata`, `Chaleco`,"
                + " `Credencial`, `Orden de taller`, `Prestamos`, `Rembolso`, `Deposito`, `Observaciones`) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, fol.getText());
            pst.setString(2, Ap.getText());
            pst.setString(3, am.getText());
            pst.setString(4, name.getText());
            pst.setString(5, cta.getText());
            pst.setString(6, ban.getText());
            pst.setString(7, Zon.getText());
            pst.setString(8, lug.getText());
            pst.setString(9, sueldo.getText());
            pst.setString(10, pd.getText());
            pst.setString(11, Item);
            pst.setString(12, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(13, Item2);
            pst.setString(14, Item3);
            pst.setString(15, Item4);
            pst.setString(16, Item5);
            pst.setString(17, Item6);
            pst.setString(18, Item7);
            pst.setString(19, Item8);
            pst.setString(20, Item9);
            pst.setString(21, Item10);
            pst.setString(22, Item11);
            pst.setString(23, Item12);
            pst.setString(24, Item13);
            pst.setString(25, Item14);
            pst.setString(26, Item15);
            pst.setString(27, Item16);
            pst.setString(28, Item17);
            pst.setString(29, DVT.getText());
            pst.setString(30, DI.getText());
            pst.setString(31, apy.getText());
            pst.setString(32, Lugar.getText());
            pst.setString(33, cda.getText());
            pst.setString(34, ADD.getText());
            pst.setString(35, Bono1.getText());
            pst.setString(36, Fdb.getText());
            pst.setString(37, Fde.getText());
            pst.setString(38, Bp.getText());
            pst.setString(39, Sancion.getText());
            pst.setString(40, Grua.getText());
            pst.setString(41, Playera.getText());
            pst.setString(42, Chamarra.getText());
            pst.setString(43, Pantalon.getText());
            pst.setString(44, Corbata.getText());
            pst.setString(45, Chaleco.getText());
            pst.setString(46, Credencial.getText());
            pst.setString(47, Odtp.getText());
            pst.setString(48, Presp.getText());
            pst.setString(49, Rembolso.getText());
            pst.setString(50, deposito.getText());
            pst.setString(51, obs.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Agregada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Nomina: " + e.getMessage());
        }
    }

    public void pago() {
        double d1 = Double.parseDouble(this.DL.getText());
        double d2 = Double.parseDouble(this.dt.getText());
        double d3 = Double.parseDouble(this.F.getText());
        double d4 = Double.parseDouble(this.FJ.getText());
        double d5 = Double.parseDouble(this.DO.getText());
        double d6 = Double.parseDouble(this.R.getText());
        double d7 = Double.parseDouble(this.pd.getText());
        double d11 = Double.parseDouble(this.DSGS.getText());
        double d8 = d6 * 50;
        double d9 = d6 * d7;
        double d10 = d9 - d8;
        double total = ((-250 * d3) + (d7 * d1) + (0 * d11) + ((2 * d7) * (d2)) + (0 * d5) + (0 * d4) + (d10));
        this.Pago.setText("" + total + "");
    }

    public void deposito() {
        double d1 = Double.parseDouble(this.DVT.getText());
        double d2 = Double.parseDouble(this.DI.getText());
        double d3 = Double.parseDouble(this.ADD.getText());
        double d4 = Double.parseDouble(this.cda.getText());
        double d5 = Double.parseDouble(this.apy.getText());
        double d6 = Double.parseDouble(this.Pago.getText());
        double d7 = Double.parseDouble(this.Odtp.getText());
        double d8 = Double.parseDouble(this.Presp.getText());
        double d9 = Double.parseDouble(this.Rembolso.getText());
        double d10 = Double.parseDouble(this.Bono.getText());
        double d11 = (d10 + d9 + d6 + d3 + d5);
        double d12 = (d1 + d2 + d7 + d8 + d4);
        double total = d11 - d12;
        this.deposito.setText("" + total + "");
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
        M1 = new javax.swing.JLabel();
        M2 = new javax.swing.JLabel();
        M3 = new javax.swing.JLabel();
        M4 = new javax.swing.JLabel();
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
        Q6 = new javax.swing.JLabel();
        Q8 = new javax.swing.JLabel();
        Q2 = new javax.swing.JLabel();
        Q4 = new javax.swing.JLabel();
        Q11 = new javax.swing.JLabel();
        Q10 = new javax.swing.JLabel();
        Q9 = new javax.swing.JLabel();
        Q25 = new javax.swing.JLabel();
        Q7 = new javax.swing.JLabel();
        Q26 = new javax.swing.JLabel();
        Q5 = new javax.swing.JLabel();
        Q27 = new javax.swing.JLabel();
        Q3 = new javax.swing.JLabel();
        Q28 = new javax.swing.JLabel();
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Nomina = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        share = new javax.swing.JTable();
        Filtro1 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pd = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Quincenas = new javax.swing.JComboBox<>();
        d = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d3 = new javax.swing.JLabel();
        DL = new javax.swing.JLabel();
        d4 = new javax.swing.JLabel();
        dt = new javax.swing.JLabel();
        d5 = new javax.swing.JLabel();
        d6 = new javax.swing.JLabel();
        d7 = new javax.swing.JLabel();
        d8 = new javax.swing.JLabel();
        F = new javax.swing.JLabel();
        FJ = new javax.swing.JLabel();
        R = new javax.swing.JLabel();
        Pago = new javax.swing.JLabel();
        d9 = new javax.swing.JLabel();
        d10 = new javax.swing.JLabel();
        d11 = new javax.swing.JLabel();
        d12 = new javax.swing.JLabel();
        d13 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        d14 = new javax.swing.JLabel();
        DO = new javax.swing.JLabel();
        d15 = new javax.swing.JLabel();
        DT = new javax.swing.JComboBox<>();
        DT1 = new javax.swing.JComboBox<>();
        DT2 = new javax.swing.JComboBox<>();
        DT3 = new javax.swing.JComboBox<>();
        DT4 = new javax.swing.JComboBox<>();
        DT5 = new javax.swing.JComboBox<>();
        DT6 = new javax.swing.JComboBox<>();
        DT7 = new javax.swing.JComboBox<>();
        DT8 = new javax.swing.JComboBox<>();
        DT9 = new javax.swing.JComboBox<>();
        DT10 = new javax.swing.JComboBox<>();
        DT11 = new javax.swing.JComboBox<>();
        DT12 = new javax.swing.JComboBox<>();
        DT13 = new javax.swing.JComboBox<>();
        DT14 = new javax.swing.JComboBox<>();
        DT15 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        DSGS = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        año = new com.toedter.calendar.JDateChooser();
        jPanel10 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        Fdb = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        Fde = new javax.swing.JTextField();
        Bp = new javax.swing.JTextField();
        Grua = new javax.swing.JTextField();
        Sancion = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        Playera = new javax.swing.JTextField();
        Chamarra = new javax.swing.JTextField();
        Pantalon = new javax.swing.JTextField();
        Corbata = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        Chaleco = new javax.swing.JTextField();
        Credencial = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        DVT = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        Lugar = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        deposito = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        obs = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ADD = new javax.swing.JTextField();
        DI = new javax.swing.JTextField();
        cda = new javax.swing.JTextField();
        apy = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        Odtp = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        Presp = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        Rembolso = new javax.swing.JTextField();
        modP = new javax.swing.JButton();
        AgregarNP = new javax.swing.JButton();
        Modm = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Bono1 = new javax.swing.JTextField();
        Ap = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Zon = new javax.swing.JTextField();
        ban = new javax.swing.JTextField();
        lug = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        CS = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Bsi = new javax.swing.JRadioButton();
        Bno = new javax.swing.JRadioButton();
        Bono = new javax.swing.JTextField();
        BAPNom = new javax.swing.JTextField();
        BAMNom = new javax.swing.JTextField();
        FiltrosNom = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        Volver = new javax.swing.JButton();
        TDnomina = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tnom = new javax.swing.JTable();
        LabelBE = new javax.swing.JLabel();
        Nominab = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        CS2 = new javax.swing.JButton();
        LabelBZ = new javax.swing.JLabel();
        FiltroZnomina = new javax.swing.JComboBox<>();
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
        TPagos = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pago = new javax.swing.JTable();
        LabelBEP = new javax.swing.JLabel();
        busp = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        CS3 = new javax.swing.JButton();
        LabelBZP = new javax.swing.JLabel();
        FiltroZP = new javax.swing.JComboBox<>();
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
        Prestamos = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Num = new javax.swing.JTextField();
        Mes = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        Interes = new javax.swing.JComboBox<>();
        interes = new javax.swing.JTextField();
        MT = new javax.swing.JTextField();
        Carpeta = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        Metodo = new javax.swing.JTextField();
        LabelPrestamos = new javax.swing.JLabel();
        BE = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        share1 = new javax.swing.JTable();
        Zona = new javax.swing.JTextField();
        Serv = new javax.swing.JTextField();
        Agregarprestamo = new javax.swing.JButton();
        modprestamo = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        PQ = new javax.swing.JTextField();
        FS = new javax.swing.JTextField();
        FL = new javax.swing.JTextField();
        CS4 = new javax.swing.JButton();
        Busapshpre = new javax.swing.JTextField();
        Filtrosshp = new javax.swing.JComboBox<>();
        Busamshpre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Appres = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Ampres = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Namepres = new javax.swing.JTextField();
        Tprestamos = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        BP = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        Pre = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        CS5 = new javax.swing.JButton();
        botonWeb3 = new botones.BotonWeb();
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
        Statustaller = new javax.swing.JComboBox<>();
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
        LabelPrestamos1 = new javax.swing.JLabel();
        BE1 = new javax.swing.JTextField();
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
        Busapshpre1 = new javax.swing.JTextField();
        Busamshpre1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Detallespagoodt = new javax.swing.JTextArea();
        jLabel58 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        DetallepagoNQodt = new javax.swing.JComboBox<>();
        DetallepagoQodt = new javax.swing.JComboBox<>();
        OcultoODT = new javax.swing.JTextField();
        TTalleres = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        Bodt = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        OdT = new javax.swing.JTable();
        EliminarT = new javax.swing.JButton();
        CS7 = new javax.swing.JButton();
        botonWeb4 = new botones.BotonWeb();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menuadm = new javax.swing.JMenu();
        Nomina1 = new javax.swing.JMenuItem();
        Administradores = new javax.swing.JMenuItem();
        ZYS = new javax.swing.JMenuItem();
        UsuariosRH = new javax.swing.JMenuItem();
        General = new javax.swing.JMenuItem();
        Estadias = new javax.swing.JMenuItem();
        Torteria = new javax.swing.JMenuItem();

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

        M1.setText("0");

        M2.setText("0");

        M3.setText("0");

        M4.setText("0");

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

        Q6.setText("0");

        Q8.setText("0");

        Q2.setText("0");

        Q4.setText("0");

        Q11.setText("0");

        Q10.setText("0");

        Q9.setText("0");

        Q25.setText("0");

        Q7.setText("0");

        Q26.setText("0");

        Q5.setText("0");

        Q27.setText("0");

        Q3.setText("0");

        Q28.setText("0");

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

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

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        jLabel9.setText("Datos generales");

        pd.setText("0");

        jLabel26.setText("Por dia:");

        jPanel9.setBackground(new java.awt.Color(204, 255, 255));

        jLabel18.setText("Faltas:");

        jLabel19.setText("Faltas Justificadas:");

        jLabel20.setText("Retardos:");

        jLabel21.setForeground(new java.awt.Color(255, 51, 51));
        jLabel21.setText("Pago:");

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

        DL.setText("0");
        DL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DLMouseClicked(evt);
            }
        });
        DL.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                DLKeyReleased(evt);
            }
        });

        d4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d4.setText("0");

        dt.setText("0");

        d5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d5.setText("0");

        d6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d6.setText("0");

        d7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d7.setText("0");

        d8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d8.setText("0");

        F.setText("0");

        FJ.setText("0");

        R.setText("0");

        Pago.setForeground(new java.awt.Color(255, 51, 51));
        Pago.setText("0");
        Pago.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                PagoMouseMoved(evt);
            }
        });
        Pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PagoMouseClicked(evt);
            }
        });
        Pago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PagoKeyReleased(evt);
            }
        });

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

        jLabel31.setText("Descanso Otorgado:");

        d14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d14.setText("0");

        DO.setText("0");

        d15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d15.setText("0");

        DT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DTItemStateChanged(evt);
            }
        });

        DT1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT1ItemStateChanged(evt);
            }
        });

        DT2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT2ItemStateChanged(evt);
            }
        });

        DT3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT3ItemStateChanged(evt);
            }
        });

        DT4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT4ItemStateChanged(evt);
            }
        });

        DT5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT5.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT5ItemStateChanged(evt);
            }
        });

        DT6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT6.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT6ItemStateChanged(evt);
            }
        });

        DT7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT7ItemStateChanged(evt);
            }
        });

        DT8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT8ItemStateChanged(evt);
            }
        });

        DT9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT9.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT9ItemStateChanged(evt);
            }
        });

        DT10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT10.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT10ItemStateChanged(evt);
            }
        });

        DT11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT11.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT11ItemStateChanged(evt);
            }
        });

        DT12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT12.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT12ItemStateChanged(evt);
            }
        });

        DT13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT13.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT13ItemStateChanged(evt);
            }
        });

        DT14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT14.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT14ItemStateChanged(evt);
            }
        });

        DT15.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D", "V", "I", "F", "FJ", "DT", " ", "R", "DSGS" }));
        DT15.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DT15ItemStateChanged(evt);
            }
        });

        jLabel15.setText("Dias Laborados:");

        jLabel16.setText("Descansos Trabajados:");

        jLabel10.setText("Nomina");

        jLabel88.setText("Descanso sin goce de sueldo:");

        DSGS.setText("0");

        jLabel91.setText("Año:");

        año.setDateFormatString("yyyy");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addComponent(DT, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DT1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DT2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DT3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DT4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(DT5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT11, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT12, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT13, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT14, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DT15, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(DL))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dt)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(F)
                                    .addComponent(R))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(DO)
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pago))
                                    .addGroup(jPanel9Layout.createSequentialGroup()
                                        .addComponent(FJ)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel88)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DSGS))))))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel10))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(Quincenas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel91)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                        .addComponent(DT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DT, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(DL))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(dt)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(F)
                            .addComponent(jLabel19)
                            .addComponent(FJ)
                            .addComponent(jLabel88)
                            .addComponent(DSGS))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(R)
                            .addComponent(jLabel31)
                            .addComponent(DO)))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Pago)
                            .addComponent(jLabel21))))
                .addGap(13, 13, 13))
        );

        jPanel10.setBackground(new java.awt.Color(204, 255, 255));

        jLabel75.setText("Faltantes de bolteto:");

        jLabel23.setText("Desc. varios:");

        Fdb.setText("0");
        Fdb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FdbKeyReleased(evt);
            }
        });

        jLabel77.setText("Faltante de efectivo:");

        jLabel78.setText("Boleto perdido:");

        jLabel79.setText("Sancion:");

        jLabel80.setText("Grua:");

        jLabel81.setText("Playera:");

        jLabel82.setText("Chamarra:");

        jLabel83.setText("Pantalon:");

        Fde.setText("0");
        Fde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FdeKeyReleased(evt);
            }
        });

        Bp.setText("0");
        Bp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BpKeyReleased(evt);
            }
        });

        Grua.setText("0");
        Grua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                GruaKeyReleased(evt);
            }
        });

        Sancion.setText("0");
        Sancion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SancionKeyReleased(evt);
            }
        });

        jLabel84.setText("Corbata:");

        jLabel85.setText("Chaleco:");

        Playera.setText("0");
        Playera.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PlayeraKeyReleased(evt);
            }
        });

        Chamarra.setText("0");
        Chamarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChamarraKeyReleased(evt);
            }
        });

        Pantalon.setText("0");
        Pantalon.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PantalonKeyReleased(evt);
            }
        });

        Corbata.setText("0");
        Corbata.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CorbataKeyReleased(evt);
            }
        });

        jLabel86.setText("Credencial:");

        Chaleco.setText("0");
        Chaleco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ChalecoKeyReleased(evt);
            }
        });

        Credencial.setText("0");
        Credencial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CredencialKeyReleased(evt);
            }
        });

        jLabel89.setText("Total:");

        DVT.setText("0");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Bp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel81)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Playera, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel79)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel83))
                            .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel82, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Corbata, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jLabel86)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Credencial, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel85)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                        .addComponent(jLabel89)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(DVT, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jLabel23)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(9, 9, 9)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel75)
                                .addComponent(Fdb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel79)
                                .addComponent(Sancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel77)
                                .addComponent(Fde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel80)
                                .addComponent(Grua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel78)
                                .addComponent(Bp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel81)
                                .addComponent(Playera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel10Layout.createSequentialGroup()
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel85)
                                .addComponent(Chaleco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel86)
                                .addComponent(Credencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel89)
                                .addComponent(DVT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(Chamarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(Pantalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(Corbata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));

        jLabel76.setText("Lugar:");

        jLabel17.setText("Apoyo:");

        deposito.setText("0");
        deposito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                depositoKeyReleased(evt);
            }
        });

        jLabel11.setText("Deposito");

        obs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                obsActionPerformed(evt);
            }
        });

        jLabel12.setText("Observaciones:");

        ADD.setText("0");
        ADD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ADDKeyReleased(evt);
            }
        });

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

        cda.setText("0");
        cda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdaActionPerformed(evt);
            }
        });
        cda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cdaKeyReleased(evt);
            }
        });

        apy.setText("0");
        apy.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                apyKeyReleased(evt);
            }
        });

        jLabel29.setText("Orden de taller:");

        Odtp.setText("0");
        Odtp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OdtpKeyReleased(evt);
            }
        });

        jLabel74.setText("Prestamos:");

        jLabel22.setText("Caja de ahorro:");

        Presp.setText("0");
        Presp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrespKeyReleased(evt);
            }
        });

        jLabel24.setText("Desc IMSS:");

        jLabel25.setText("Adicionales:");

        jLabel87.setText("Rembolso:");

        Rembolso.setText("0");
        Rembolso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RembolsoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel74))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addGap(99, 99, 99)
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel87)
                                            .addComponent(jLabel25))
                                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel11Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                                .addGap(4, 4, 4)
                                                .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(obs)))
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel24)
                        .addComponent(DI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12)
                        .addComponent(obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(apy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel76)
                    .addComponent(Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Odtp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel87)
                    .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        modP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        modP.setText("Modificar Pago");
        modP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPActionPerformed(evt);
            }
        });

        AgregarNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AgregarNP.setText("Agregar");
        AgregarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNPActionPerformed(evt);
            }
        });

        Modm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        Modm.setText("Modificar Nomina");
        Modm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModmActionPerformed(evt);
            }
        });

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("# Lista:");

        fol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                folActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido P:");

        jLabel90.setText("Bono:");

        Bono1.setText("0");

        jLabel4.setText("Apellido M:");

        jLabel27.setText("Nombres(s):");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel90))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fol, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Ap)
                    .addComponent(am)
                    .addComponent(name)
                    .addComponent(Bono1))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(Bono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));

        jLabel6.setText("Servicio:");

        jLabel7.setText("Sueldo:");

        jLabel14.setText("Zona:");

        jLabel13.setText("Banco:");

        sueldo.setText("0");

        jLabel5.setText("Cuenta de Banco:");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lug, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lug, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        CS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS.setText("Cerrar sesion");
        CS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSActionPerformed(evt);
            }
        });

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

        BAPNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAPNomKeyReleased(evt);
            }
        });

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

        Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/volver.png"))); // NOI18N
        Volver.setText("Volver");
        Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bsi)
                            .addComponent(Bno)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel3))
                            .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AgregarNP)
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Modm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(modP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(18, 18, 18)
                                        .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Filtro1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Volver)
                                        .addGap(3, 3, 3)
                                        .addComponent(CS)))
                                .addGap(0, 820, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtro1)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(CS)
                            .addComponent(Volver))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bsi)
                        .addGap(8, 8, 8)
                        .addComponent(Bno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Modm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modP)
                            .addComponent(AgregarNP)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        Nomina.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nomina", Nomina);

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

        LabelBZ.setText("Buscar Zona");

        FiltroZnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZnominaItemStateChanged(evt);
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

        FiltrosTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por Folio" }));
        FiltrosTD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTDItemStateChanged(evt);
            }
        });

        LabelBNDF.setText("Buscar # de folio");

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
        botonWeb1.setLink("http://192.168.3.10/Reportes/ReporteNomina/EPCNomina.php");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
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
                        .addComponent(LabelBZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroZnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(CS2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 5657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE)
                    .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar)
                    .addComponent(LabelBZ)
                    .addComponent(FiltroZnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS2)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        TDnomina.setViewportView(jPanel2);

        jTabbedPane1.addTab("Tabla Detallada", TDnomina);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        pago.setModel(new javax.swing.table.DefaultTableModel(
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
        pago.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pagoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(pago);

        LabelBEP.setText("Buscar empleado:");

        busp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buspKeyReleased(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        CS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS3.setText("Cerrar sesion");
        CS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS3ActionPerformed(evt);
            }
        });

        LabelBZP.setText("Buscar zona:");

        FiltroZP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroZP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZPItemStateChanged(evt);
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

        LabelNDFP.setText("# de folio");

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

        FiltrosP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por quincena", "Filtrar por Folio" }));
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
        botonWeb2.setLink("http://192.168.3.10/Reportes/ReporteNomina/EPCpagos.php");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                .addComponent(LabelBZP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FiltroZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 188, Short.MAX_VALUE))
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP)
                    .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(LabelBZP)
                    .addComponent(FiltroZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(CS3)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        TPagos.setViewportView(jPanel3);

        jTabbedPane1.addTab("Tabla Pagos", TPagos);

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel30.setText("Apellido P:");

        jLabel34.setText("Zona:");

        jLabel35.setText("Servicio:");

        jLabel36.setText("Cantidad:");

        jLabel37.setText("Interes:");

        jLabel38.setText("Monto total:");

        jLabel39.setText("Carpeta:");

        jLabel40.setText("Fecha liberado:");

        jLabel41.setText("Mes:");

        jLabel42.setText("Fecha solicitud");

        jLabel43.setText("Numero:");

        jLabel44.setText("Status:");

        jLabel45.setText("Metodo:");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        Mes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MesActionPerformed(evt);
            }
        });

        Cantidad.setText("0");

        Interes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "1 Mes 10%", "2 Meses 15%", "3 Meses 20%", "4 Meses 25%" }));
        Interes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                InteresItemStateChanged(evt);
            }
        });

        interes.setText("0");

        MT.setText("0");

        LabelPrestamos.setText("Buscar empleado:");

        BE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BEKeyReleased(evt);
            }
        });

        share1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        share1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                share1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(share1);

        Agregarprestamo.setText("Agregar");
        Agregarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarprestamoActionPerformed(evt);
            }
        });

        modprestamo.setText("Modificar");
        modprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modprestamoActionPerformed(evt);
            }
        });

        jLabel47.setText("Por quincena:");

        PQ.setText("0");

        FS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSActionPerformed(evt);
            }
        });

        CS4.setText("Cerrar sesion");
        CS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS4ActionPerformed(evt);
            }
        });

        Busapshpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusapshpreKeyReleased(evt);
            }
        });

        Filtrosshp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        Filtrosshp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosshpItemStateChanged(evt);
            }
        });

        Busamshpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusamshpreKeyReleased(evt);
            }
        });

        jLabel8.setText("Filtros:");

        jLabel33.setText("Apellido M:");

        jLabel46.setText("Nombre(s):");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel30)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Agregarprestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modprestamo))
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Carpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(FL, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addComponent(jLabel47))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PQ, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 894, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Namepres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Zona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Mes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Appres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ampres, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(161, 161, 161)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filtrosshp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPrestamos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busapshpre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busamshpre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CS4)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrestamos)
                    .addComponent(Busapshpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtrosshp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busamshpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CS4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(Appres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(Ampres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Namepres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PQ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(MT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Carpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(FL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregarprestamo)
                    .addComponent(modprestamo))
                .addContainerGap(329, Short.MAX_VALUE))
        );

        Prestamos.setViewportView(jPanel4);

        jTabbedPane1.addTab("Prestamos", Prestamos);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel48.setText("Buscar prestamos:");

        BP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BPKeyReleased(evt);
            }
        });

        Pre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        Pre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Pre);

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        CS5.setText("Cerrar sesion");
        CS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS5ActionPerformed(evt);
            }
        });

        botonWeb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb3.setLink("http://192.168.3.10/Reportes/ReporteNomina/EPCprestamos.php");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CS5))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 2401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(CS5)
                    .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        Tprestamos.setViewportView(jPanel5);

        jTabbedPane1.addTab("Tabla prestamos", Tprestamos);

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

        Statustaller.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Pago a cliente", "Pago a cerrajeria", "Vencida", "Pago a taller" }));

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

        LabelPrestamos1.setText("Buscar empleado:");

        BE1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BE1KeyReleased(evt);
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

        Busapshpre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Busapshpre1KeyReleased(evt);
            }
        });

        Busamshpre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Busamshpre1KeyReleased(evt);
            }
        });

        jLabel32.setText("Filtros:");

        Detallespagoodt.setColumns(20);
        Detallespagoodt.setLineWrap(true);
        Detallespagoodt.setRows(5);
        jScrollPane1.setViewportView(Detallespagoodt);

        jLabel58.setText("Detalles de pagos:");

        jLabel97.setText("Numero de quincena:");

        jLabel98.setText("Quincena:");

        DetallepagoNQodt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));

        DetallepagoQodt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));
        DetallepagoQodt.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DetallepagoQodtItemStateChanged(evt);
            }
        });

        OcultoODT.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel53)
                            .addComponent(jLabel52)
                            .addComponent(jLabel51)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Statustaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Si)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(no)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel32)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FshT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LabelPrestamos1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BE1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Busapshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Busamshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(CS6)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(11, 11, 11))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(Fdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(106, 106, 106)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(50, 50, 50)
                                                .addComponent(jLabel55)
                                                .addGap(217, 217, 217)
                                                .addComponent(jLabel58))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jLabel59)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pagado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel60)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(OcultoODT, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel98)
                                                            .addComponent(jLabel97))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(DetallepagoQodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(DetallepagoNQodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(Iad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(QAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel72)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PQT, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Agregartaller)
                                .addGap(51, 51, 51)
                                .addComponent(Modificartaller)))
                        .addContainerGap(84, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel49))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ndo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(FE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(CT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel52)
                                    .addComponent(Si)
                                    .addComponent(no))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel53)
                                    .addComponent(Statustaller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel56)
                            .addComponent(Fdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel54)
                            .addComponent(Iad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel71)
                            .addComponent(QAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PQT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel59)
                                    .addComponent(Pagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel60)
                                    .addComponent(Pendiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel57)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Agregartaller)
                                        .addComponent(Modificartaller))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel97)
                                    .addComponent(DetallepagoNQodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel98)
                                    .addComponent(DetallepagoQodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(Ndo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LabelPrestamos1)
                                .addComponent(Busapshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Busamshpre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CS6))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel50)
                                .addComponent(FE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32)
                                .addComponent(FshT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(197, 197, 197)
                                .addComponent(OcultoODT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(265, Short.MAX_VALUE))
        );

        Talleres.setViewportView(jPanel6);

        jTabbedPane1.addTab("Talleres", Talleres);

        jPanel8.setBackground(new java.awt.Color(255, 204, 204));

        jLabel73.setText("Buscar Orden de taller:");

        Bodt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BodtKeyReleased(evt);
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
        botonWeb4.setLink("http://192.168.3.10/Reportes/ReporteNomina/EPCodtaller.php");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel73)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bodt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(EliminarT)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CS7))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 4538, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(Bodt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarT)
                    .addComponent(CS7)
                    .addComponent(botonWeb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        TTalleres.setViewportView(jPanel8);

        jTabbedPane1.addTab("Tabla talleres", TTalleres);

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

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1319, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 807, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTActionPerformed

        eliminarT();
        MDT();
        limpiarT();
    }//GEN-LAST:event_EliminarTActionPerformed

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
            //ingreso a taller 14
            Iad.setText(String.valueOf(OdT.getValueAt(fila, 16)));
            Pagado.setText(String.valueOf(OdT.getValueAt(fila, 17)));
            Pendiente.setText(String.valueOf(OdT.getValueAt(fila, 18)));
            PQT.setText(String.valueOf(OdT.getValueAt(fila, 19)));
            Odtp.setText(String.valueOf(OdT.getValueAt(fila, 19)));
            Observaciones.setText(String.valueOf(OdT.getValueAt(fila, 21)));

            String combo1 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < Statustaller.getItemCount(); i++) {
                if (Statustaller.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Statustaller.setSelectedIndex(i);
                }
            }
            //Combobo2
            String combo2 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < Fdp.getItemCount(); i++) {
                if (Fdp.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Fdp.setSelectedIndex(i);
                }
            }
            int id = Integer.parseInt(OdT.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from taller where idTaller =?");
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
        deposito();
    }//GEN-LAST:event_OdTMouseClicked

    private void BodtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BodtKeyReleased


    }//GEN-LAST:event_BodtKeyReleased

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

    private void ModificartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificartallerActionPerformed

        editarT();
        MDT();
        limpiarT();
    }//GEN-LAST:event_ModificartallerActionPerformed

    private void AgregartallerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregartallerActionPerformed

        AgregarT();
        MDT();
        limpiarT();
    }//GEN-LAST:event_AgregartallerActionPerformed

    private void BE1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BE1KeyReleased

        sharetp();
    }//GEN-LAST:event_BE1KeyReleased

    private void share2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share2MouseClicked

        int seleccionar = share2.getSelectedRow();
        ApTaller.setText(String.valueOf(share2.getValueAt(seleccionar, 0)));
        Amtaller.setText(String.valueOf(share2.getValueAt(seleccionar, 1)));
        NameTaller.setText(String.valueOf(share2.getValueAt(seleccionar, 2)));
        Zona1.setText(String.valueOf(share2.getValueAt(seleccionar, 3)));
        Serv1.setText(String.valueOf(share2.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share2MouseClicked

    private void PagadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagadoKeyReleased

        DAR1();
    }//GEN-LAST:event_PagadoKeyReleased

    private void CTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CTKeyReleased

        DAR();
    }//GEN-LAST:event_CTKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        eliminarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void PreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreMouseClicked

        DefaultTableModel model = (DefaultTableModel) Pre.getModel();
        int seleccionar = Pre.getSelectedRow();
        Num.setText(String.valueOf(Pre.getValueAt(seleccionar, 0)));
        FS.setText(String.valueOf(Pre.getValueAt(seleccionar, 1)));
        String combo1 = model.getValueAt(seleccionar, 2).toString();
        for (int i = 0; i < Mes.getItemCount(); i++) {
            if (Mes.getItemAt(i).toString().equalsIgnoreCase(combo1)) {
                Mes.setSelectedIndex(i);
            }
        }
        Appres.setText(String.valueOf(Pre.getValueAt(seleccionar, 3)));
        Ampres.setText(String.valueOf(Pre.getValueAt(seleccionar, 4)));
        Namepres.setText(String.valueOf(Pre.getValueAt(seleccionar, 5)));
        Zona.setText(String.valueOf(Pre.getValueAt(seleccionar, 6)));
        Serv.setText(String.valueOf(Pre.getValueAt(seleccionar, 7)));
        Cantidad.setText(String.valueOf(Pre.getValueAt(seleccionar, 8)));
        interes.setText(String.valueOf(Pre.getValueAt(seleccionar, 9)));
        MT.setText(String.valueOf(Pre.getValueAt(seleccionar, 10)));
        PQ.setText(String.valueOf(Pre.getValueAt(seleccionar, 11)));
        Presp.setText(String.valueOf(Pre.getValueAt(seleccionar, 11)));
        Carpeta.setText(String.valueOf(Pre.getValueAt(seleccionar, 12)));
        FL.setText(String.valueOf(Pre.getValueAt(seleccionar, 13)));
        Status.setText(String.valueOf(Pre.getValueAt(seleccionar, 14)));
        Metodo.setText(String.valueOf(Pre.getValueAt(seleccionar, 15)));
        deposito();
    }//GEN-LAST:event_PreMouseClicked

    private void BPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BPKeyReleased

        MDP();
    }//GEN-LAST:event_BPKeyReleased

    private void FSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSActionPerformed

    }//GEN-LAST:event_FSActionPerformed

    private void modprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modprestamoActionPerformed

        editarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_modprestamoActionPerformed

    private void AgregarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarprestamoActionPerformed

        AgregarPre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_AgregarprestamoActionPerformed

    private void share1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share1MouseClicked

        int seleccionar = share1.getSelectedRow();
        Appres.setText(String.valueOf(share1.getValueAt(seleccionar, 0)));
        Ampres.setText(String.valueOf(share1.getValueAt(seleccionar, 1)));
        Namepres.setText(String.valueOf(share1.getValueAt(seleccionar, 2)));
        Zona.setText(String.valueOf(share1.getValueAt(seleccionar, 3)));
        Serv.setText(String.valueOf(share1.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share1MouseClicked

    private void BEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BEKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BEKeyReleased

    private void InteresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_InteresItemStateChanged

        String dt = (String) Interes.getSelectedItem();
        if (dt.equals(".")) {
            M1.setText("0");
            M2.setText("0");
            M3.setText("0");
            M4.setText("0");
            Q2.setText("0");
            Q4.setText("0");
            Q6.setText("0");
            Q8.setText("0");
        }
        if (dt.equals("1 Mes 10%")) {
            M1.setText("" + Pa + "");
            M2.setText("0");
            M3.setText("0");
            M4.setText("0");
            Q2.setText("" + e + "");
            Q4.setText("0");
            Q6.setText("0");
            Q8.setText("0");
        }
        if (dt.equals("2 Meses 15%")) {
            M2.setText("" + b + "");
            M1.setText("0");
            M3.setText("0");
            M4.setText("0");
            Q2.setText("0");
            Q4.setText("" + f + "");
            Q6.setText("0");
            Q8.setText("0");
        }
        if (dt.equals("3 Meses 20%")) {
            M3.setText("" + c + "");
            M2.setText("0");
            M1.setText("0");
            M4.setText("0");
            Q2.setText("0");
            Q4.setText("0");
            Q6.setText("" + g + "");
            Q8.setText("0");
        }

        if (dt.equals("4 Meses 25%")) {
            M4.setText("" + D + "");
            M2.setText("0");
            M3.setText("0");
            M1.setText("0");
            Q2.setText("0");
            Q4.setText("0");
            Q6.setText("0");
            Q8.setText("" + h + "");
        }
        interes1();
        MTo();
        pq();
    }//GEN-LAST:event_InteresItemStateChanged

    private void MesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MesActionPerformed

    }//GEN-LAST:event_MesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        eliminarp();
        pagos();
        limpiarnom();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void pagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pagoMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) pago.getModel();

            int fila = pago.getSelectedRow();
            txtid.setText(String.valueOf(pago.getValueAt(fila, 0)));
            fol.setText(String.valueOf(pago.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(pago.getValueAt(fila, 2)));
            am.setText(String.valueOf(pago.getValueAt(fila, 3)));
            name.setText(String.valueOf(pago.getValueAt(fila, 4)));
            Bono.setText(String.valueOf(pago.getValueAt(fila, 5)));
            Bono.setText(String.valueOf(pago.getValueAt(fila, 5)));
            cta.setText(String.valueOf(pago.getValueAt(fila, 6)));
            ban.setText(String.valueOf(pago.getValueAt(fila, 7)));
            Zon.setText(String.valueOf(pago.getValueAt(fila, 8)));
            lug.setText(String.valueOf(pago.getValueAt(fila, 9)));
            sueldo.setText(String.valueOf(pago.getValueAt(fila, 12)));
            deposito.setText(String.valueOf(pago.getValueAt(fila, 13)));
            String combo1 = model.getValueAt(fila, 10).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 11));
            año.setDate(date);

        } catch (ParseException ex) {
            Logger.getLogger(Admin_Nomina_5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_pagoMouseClicked

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        eliminarnom();
        mostrardatos();
        limpiarnom();
    }//GEN-LAST:event_EliminarActionPerformed

    private void NominabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NominabKeyReleased

        mostrardatos();
    }//GEN-LAST:event_NominabKeyReleased

    private void TnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TnomMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom.getModel();

            int fila = Tnom.getSelectedRow();
            txtid.setText(String.valueOf(Tnom.getValueAt(fila, 0)));
            fol.setText(String.valueOf(Tnom.getValueAt(fila, 1)));
            Ap.setText(String.valueOf(pago.getValueAt(fila, 2)));
            am.setText(String.valueOf(pago.getValueAt(fila, 3)));
            name.setText(String.valueOf(pago.getValueAt(fila, 4)));
            cta.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            ban.setText(String.valueOf(Tnom.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            lug.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            String combo1 = model.getValueAt(fila, 11).toString();
            for (int i = 0; i < Quincenas.getItemCount(); i++) {
                if (Quincenas.getItemAt(i).toString().equalsIgnoreCase(combo1)) {
                    Quincenas.setSelectedIndex(i);
                }
            }

            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 12));
            año.setDate(date);
            String combo2 = model.getValueAt(fila, 13).toString();
            for (int i = 0; i < DT.getItemCount(); i++) {
                if (DT.getItemAt(i).toString().equalsIgnoreCase(combo2)) {
                    DT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 14).toString();
            for (int i = 0; i < DT1.getItemCount(); i++) {
                if (DT1.getItemAt(i).toString().equalsIgnoreCase(combo3)) {
                    DT1.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 15).toString();
            for (int i = 0; i < DT2.getItemCount(); i++) {
                if (DT2.getItemAt(i).toString().equalsIgnoreCase(combo4)) {
                    DT2.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 16).toString();
            for (int i = 0; i < DT3.getItemCount(); i++) {
                if (DT3.getItemAt(i).toString().equalsIgnoreCase(combo5)) {
                    DT3.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 17).toString();
            for (int i = 0; i < DT4.getItemCount(); i++) {
                if (DT4.getItemAt(i).toString().equalsIgnoreCase(combo6)) {
                    DT4.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 18).toString();
            for (int i = 0; i < DT5.getItemCount(); i++) {
                if (DT5.getItemAt(i).toString().equalsIgnoreCase(combo7)) {
                    DT5.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 19).toString();
            for (int i = 0; i < DT6.getItemCount(); i++) {
                if (DT6.getItemAt(i).toString().equalsIgnoreCase(combo8)) {
                    DT6.setSelectedIndex(i);
                }
            }
            String combo9 = model.getValueAt(fila, 20).toString();
            for (int i = 0; i < DT7.getItemCount(); i++) {
                if (DT7.getItemAt(i).toString().equalsIgnoreCase(combo9)) {
                    DT7.setSelectedIndex(i);
                }
            }
            String combo10 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < DT8.getItemCount(); i++) {
                if (DT8.getItemAt(i).toString().equalsIgnoreCase(combo10)) {
                    DT8.setSelectedIndex(i);
                }
            }
            String combo11 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < DT9.getItemCount(); i++) {
                if (DT9.getItemAt(i).toString().equalsIgnoreCase(combo11)) {
                    DT9.setSelectedIndex(i);
                }
            }
            String combo12 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < DT10.getItemCount(); i++) {
                if (DT10.getItemAt(i).toString().equalsIgnoreCase(combo12)) {
                    DT10.setSelectedIndex(i);
                }
            }
            String combo13 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < DT11.getItemCount(); i++) {
                if (DT11.getItemAt(i).toString().equalsIgnoreCase(combo13)) {
                    DT11.setSelectedIndex(i);
                }
            }
            String combo14 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < DT12.getItemCount(); i++) {
                if (DT12.getItemAt(i).toString().equalsIgnoreCase(combo14)) {
                    DT12.setSelectedIndex(i);
                }
            }
            String combo15 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < DT13.getItemCount(); i++) {
                if (DT13.getItemAt(i).toString().equalsIgnoreCase(combo15)) {
                    DT13.setSelectedIndex(i);
                }
            }
            String combo16 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < DT14.getItemCount(); i++) {
                if (DT14.getItemAt(i).toString().equalsIgnoreCase(combo16)) {
                    DT14.setSelectedIndex(i);
                }
            }
            String combo17 = model.getValueAt(fila, 28).toString();
            for (int i = 0; i < DT15.getItemCount(); i++) {
                if (DT15.getItemAt(i).toString().equalsIgnoreCase(combo17)) {
                    DT15.setSelectedIndex(i);
                }
            }
            DVT.setText(String.valueOf(Tnom.getValueAt(fila, 29)));
            DI.setText(String.valueOf(Tnom.getValueAt(fila, 30)));
            apy.setText(String.valueOf(Tnom.getValueAt(fila, 31)));
            Lugar.setText(String.valueOf(Tnom.getValueAt(fila, 32)));
            cda.setText(String.valueOf(Tnom.getValueAt(fila, 33)));
            ADD.setText(String.valueOf(Tnom.getValueAt(fila, 34)));
            Bono.setText(String.valueOf(Tnom.getValueAt(fila, 35)));
            Bono1.setText(String.valueOf(Tnom.getValueAt(fila, 35)));
            Fdb.setText(String.valueOf(Tnom.getValueAt(fila, 36)));
            Fde.setText(String.valueOf(Tnom.getValueAt(fila, 37)));
            Bp.setText(String.valueOf(Tnom.getValueAt(fila, 38)));
            Sancion.setText(String.valueOf(Tnom.getValueAt(fila, 39)));
            Grua.setText(String.valueOf(Tnom.getValueAt(fila, 40)));
            Playera.setText(String.valueOf(Tnom.getValueAt(fila, 41)));
            Chamarra.setText(String.valueOf(Tnom.getValueAt(fila, 42)));
            Pantalon.setText(String.valueOf(Tnom.getValueAt(fila, 43)));
            Corbata.setText(String.valueOf(Tnom.getValueAt(fila, 44)));
            Chaleco.setText(String.valueOf(Tnom.getValueAt(fila, 45)));
            Credencial.setText(String.valueOf(Tnom.getValueAt(fila, 46)));
            Odtp.setText(String.valueOf(Tnom.getValueAt(fila, 47)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 48)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 49)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 50)));
            obs.setText(String.valueOf(Tnom.getValueAt(fila, 51)));

        } catch (ParseException ex) {
            Logger.getLogger(Admin_Nomina_5.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void ModmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModmActionPerformed

        editar();
        pagos();
        mostrardatos();
        limpiarnom();
    }//GEN-LAST:event_ModmActionPerformed

    private void AgregarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNPActionPerformed

        agregarP();
        AgregarN();
        pagos();
        mostrardatos();
        limpiarnom();
    }//GEN-LAST:event_AgregarNPActionPerformed

    private void modPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPActionPerformed

        editarp();
        pagos();
        mostrardatos();
        limpiarnom();
    }//GEN-LAST:event_modPActionPerformed

    private void RembolsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RembolsoKeyReleased

        deposito();
    }//GEN-LAST:event_RembolsoKeyReleased

    private void PrespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrespKeyReleased

        deposito();
    }//GEN-LAST:event_PrespKeyReleased

    private void OdtpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OdtpKeyReleased

        deposito();
    }//GEN-LAST:event_OdtpKeyReleased

    private void apyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apyKeyReleased

        deposito();
    }//GEN-LAST:event_apyKeyReleased

    private void cdaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cdaKeyReleased

        deposito();
    }//GEN-LAST:event_cdaKeyReleased

    private void cdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdaActionPerformed

    }//GEN-LAST:event_cdaActionPerformed

    private void DIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DIKeyReleased

        deposito();
    }//GEN-LAST:event_DIKeyReleased

    private void DIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIActionPerformed

    }//GEN-LAST:event_DIActionPerformed

    private void ADDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ADDKeyReleased

        deposito();
    }//GEN-LAST:event_ADDKeyReleased

    private void obsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_obsActionPerformed

    }//GEN-LAST:event_obsActionPerformed

    private void depositoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_depositoKeyReleased

        deposito();
    }//GEN-LAST:event_depositoKeyReleased

    private void CredencialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CredencialKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_CredencialKeyReleased

    private void ChalecoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChalecoKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_ChalecoKeyReleased

    private void CorbataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CorbataKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_CorbataKeyReleased

    private void PantalonKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PantalonKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_PantalonKeyReleased

    private void ChamarraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ChamarraKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_ChamarraKeyReleased

    private void PlayeraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PlayeraKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_PlayeraKeyReleased

    private void SancionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SancionKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_SancionKeyReleased

    private void GruaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GruaKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_GruaKeyReleased

    private void BpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BpKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_BpKeyReleased

    private void FdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdeKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_FdeKeyReleased

    private void FdbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FdbKeyReleased

        dv();
        deposito();
    }//GEN-LAST:event_FdbKeyReleased

    private void DT15ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT15ItemStateChanged

        String dt = (String) DT15.getSelectedItem();
        if (dt.equals(".")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("A")) {
            DL16.setText("" + a + "");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("D")) {
            DL16.setText("" + a + "");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("V")) {
            DL16.setText("" + a + "");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("I")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("F")) {
            DL16.setText("0");
            F16.setText("" + a + "");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("FJ")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("" + a + "");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("DT")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("" + a + "");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals(" ")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("" + a + "");
            R16.setText("0");
            DSGS16.setText("0");
        }
        if (dt.equals("R")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("" + a + "");
            DSGS16.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL16.setText("0");
            F16.setText("0");
            FJ16.setText("0");
            this.dt16.setText("0");
            DO16.setText("0");
            R16.setText("0");
            DSGS16.setText("" + a + "");
        }
        DSGS();
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        pago();
    }//GEN-LAST:event_DT15ItemStateChanged

    private void DT14ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT14ItemStateChanged

        String dt = (String) DT14.getSelectedItem();
        if (dt.equals(".")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("A")) {
            DL15.setText("" + a + "");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("D")) {
            DL15.setText("" + a + "");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("V")) {
            DL15.setText("" + a + "");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("I")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("F")) {
            DL15.setText("0");
            F15.setText("" + a + "");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("FJ")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("" + a + "");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("DT")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("" + a + "");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals(" ")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("" + a + "");
            R15.setText("0");
            DSGS15.setText("0");
        }
        if (dt.equals("R")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("" + a + "");
            DSGS15.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL15.setText("0");
            F15.setText("0");
            FJ15.setText("0");
            this.dt15.setText("0");
            DO15.setText("0");
            R15.setText("0");
            DSGS15.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT14ItemStateChanged

    private void DT13ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT13ItemStateChanged

        String dt = (String) DT13.getSelectedItem();
        if (dt.equals(".")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("A")) {
            DL14.setText("" + a + "");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("D")) {
            DL14.setText("" + a + "");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("V")) {
            DL14.setText("" + a + "");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("I")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("F")) {
            DL14.setText("0");
            F14.setText("" + a + "");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("FJ")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("" + a + "");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("DT")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("" + a + "");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals(" ")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("" + a + "");
            R14.setText("0");
            DSGS14.setText("0");
        }
        if (dt.equals("R")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("" + a + "");
            DSGS14.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL14.setText("0");
            F14.setText("0");
            FJ14.setText("0");
            this.dt14.setText("0");
            DO14.setText("0");
            R14.setText("0");
            DSGS14.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT13ItemStateChanged

    private void DT12ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT12ItemStateChanged

        String dt = (String) DT12.getSelectedItem();
        if (dt.equals(".")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("A")) {
            DL13.setText("" + a + "");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("D")) {
            DL13.setText("" + a + "");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("V")) {
            DL13.setText("" + a + "");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("I")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("F")) {
            DL13.setText("0");
            F13.setText("" + a + "");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("FJ")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("" + a + "");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("DT")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("" + a + "");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals(" ")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("" + a + "");
            R13.setText("0");
            DSGS13.setText("0");
        }
        if (dt.equals("R")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("" + a + "");
            DSGS13.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL13.setText("0");
            F13.setText("0");
            FJ13.setText("0");
            this.dt13.setText("0");
            DO13.setText("0");
            R13.setText("0");
            DSGS13.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT12ItemStateChanged

    private void DT11ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT11ItemStateChanged

        String dt = (String) DT11.getSelectedItem();
        if (dt.equals(".")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("A")) {
            DL12.setText("" + a + "");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("D")) {
            DL12.setText("" + a + "");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("V")) {
            DL12.setText("" + a + "");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("I")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("F")) {
            DL12.setText("0");
            F12.setText("" + a + "");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("FJ")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("" + a + "");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("DT")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("" + a + "");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals(" ")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("" + a + "");
            R12.setText("0");
            DSGS12.setText("0");
        }
        if (dt.equals("R")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("" + a + "");
            DSGS12.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL12.setText("0");
            F12.setText("0");
            FJ12.setText("0");
            this.dt12.setText("0");
            DO12.setText("0");
            R12.setText("0");
            DSGS12.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT11ItemStateChanged

    private void DT10ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT10ItemStateChanged

        String dt = (String) DT10.getSelectedItem();
        if (dt.equals(".")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("A")) {
            DL11.setText("" + a + "");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("D")) {
            DL11.setText("" + a + "");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("V")) {
            DL11.setText("" + a + "");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("I")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("F")) {
            DL11.setText("0");
            F11.setText("" + a + "");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("FJ")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("" + a + "");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("DT")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("" + a + "");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals(" ")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("" + a + "");
            R11.setText("0");
            DSGS11.setText("0");
        }
        if (dt.equals("R")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("" + a + "");
            DSGS11.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL11.setText("0");
            F11.setText("0");
            FJ11.setText("0");
            this.dt11.setText("0");
            DO11.setText("0");
            R11.setText("0");
            DSGS11.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT10ItemStateChanged

    private void DT9ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT9ItemStateChanged

        String dt = (String) DT9.getSelectedItem();
        if (dt.equals(".")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("A")) {
            DL10.setText("" + a + "");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("D")) {
            DL10.setText("" + a + "");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("V")) {
            DL10.setText("" + a + "");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("I")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("F")) {
            DL10.setText("0");
            F10.setText("" + a + "");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("FJ")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("" + a + "");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("DT")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("" + a + "");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals(" ")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("" + a + "");
            R10.setText("0");
            DSGS10.setText("0");
        }
        if (dt.equals("R")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("" + a + "");
            DSGS10.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL10.setText("0");
            F10.setText("0");
            FJ10.setText("0");
            this.dt10.setText("0");
            DO10.setText("0");
            R10.setText("0");
            DSGS10.setText("" + a + "");
        }

        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT9ItemStateChanged

    private void DT8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT8ItemStateChanged

        String dt = (String) DT8.getSelectedItem();
        if (dt.equals(".")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("A")) {
            DL9.setText("" + a + "");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("D")) {
            DL9.setText("" + a + "");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("V")) {
            DL9.setText("" + a + "");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("I")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("F")) {
            DL9.setText("0");
            F9.setText("" + a + "");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("FJ")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("" + a + "");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("DT")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("" + a + "");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals(" ")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("" + a + "");
            R9.setText("0");
            DSGS9.setText("0");
        }
        if (dt.equals("R")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("" + a + "");
            DSGS9.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL9.setText("0");
            F9.setText("0");
            FJ9.setText("0");
            this.dt9.setText("0");
            DO9.setText("0");
            R9.setText("0");
            DSGS9.setText("" + a + "");
        }

        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT8ItemStateChanged

    private void DT7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT7ItemStateChanged

        String dt = (String) DT7.getSelectedItem();
        if (dt.equals(".")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("A")) {
            DL8.setText("" + a + "");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("D")) {
            DL8.setText("" + a + "");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("V")) {
            DL8.setText("" + a + "");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("I")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("F")) {
            DL8.setText("0");
            F8.setText("" + a + "");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("FJ")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("" + a + "");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("DT")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("" + a + "");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals(" ")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("" + a + "");
            R8.setText("0");
            DSGS8.setText("0");
        }
        if (dt.equals("R")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("" + a + "");
            DSGS8.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL8.setText("0");
            F8.setText("0");
            FJ8.setText("0");
            this.dt8.setText("0");
            DO8.setText("0");
            R8.setText("0");
            DSGS8.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT7ItemStateChanged

    private void DT6ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT6ItemStateChanged

        String dt = (String) DT6.getSelectedItem();
        if (dt.equals(".")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("A")) {
            DL7.setText("" + a + "");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("D")) {
            DL7.setText("" + a + "");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("V")) {
            DL7.setText("" + a + "");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("I")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("F")) {
            DL7.setText("0");
            F7.setText("" + a + "");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("FJ")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("" + a + "");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("DT")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("" + a + "");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals(" ")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("" + a + "");
            R7.setText("0");
            DSGS7.setText("0");
        }
        if (dt.equals("R")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("" + a + "");
            DSGS7.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL7.setText("0");
            F7.setText("0");
            FJ7.setText("0");
            this.dt7.setText("0");
            DO7.setText("0");
            R7.setText("0");
            DSGS7.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT6ItemStateChanged

    private void DT5ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT5ItemStateChanged

        String dt = (String) DT5.getSelectedItem();
        if (dt.equals(".")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("A")) {
            DL6.setText("" + a + "");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("D")) {
            DL6.setText("" + a + "");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("V")) {
            DL6.setText("" + a + "");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("I")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("F")) {
            DL6.setText("0");
            F6.setText("" + a + "");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("FJ")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("" + a + "");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("DT")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("" + a + "");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals(" ")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("" + a + "");
            R6.setText("0");
            DSGS6.setText("0");
        }
        if (dt.equals("R")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("" + a + "");
            DSGS6.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL6.setText("0");
            F6.setText("0");
            FJ6.setText("0");
            this.dt6.setText("0");
            DO6.setText("0");
            R6.setText("0");
            DSGS6.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT5ItemStateChanged

    private void DT4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT4ItemStateChanged

        String dt = (String) DT4.getSelectedItem();
        if (dt.equals(".")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("A")) {
            DL5.setText("" + a + "");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("D")) {
            DL5.setText("" + a + "");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("V")) {
            DL5.setText("" + a + "");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("I")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("F")) {
            DL5.setText("0");
            F5.setText("" + a + "");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("FJ")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("" + a + "");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("DT")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("" + a + "");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals(" ")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("" + a + "");
            R5.setText("0");
            DSGS5.setText("0");
        }
        if (dt.equals("R")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("" + a + "");
            DSGS5.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL5.setText("0");
            F5.setText("0");
            FJ5.setText("0");
            this.dt5.setText("0");
            DO5.setText("0");
            R5.setText("0");
            DSGS5.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT4ItemStateChanged

    private void DT3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT3ItemStateChanged

        String dt = (String) DT3.getSelectedItem();
        if (dt.equals(".")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("A")) {
            DL4.setText("" + a + "");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("D")) {
            DL4.setText("" + a + "");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("V")) {
            DL4.setText("" + a + "");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("I")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("F")) {
            DL4.setText("0");
            F4.setText("" + a + "");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("FJ")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("" + a + "");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("DT")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("" + a + "");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals(" ")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("" + a + "");
            R4.setText("0");
            DSGS4.setText("0");
        }
        if (dt.equals("R")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("" + a + "");
            DSGS4.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL4.setText("0");
            F4.setText("0");
            FJ4.setText("0");
            this.dt4.setText("0");
            DO4.setText("0");
            R4.setText("0");
            DSGS4.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT3ItemStateChanged

    private void DT2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT2ItemStateChanged

        String dt = (String) DT2.getSelectedItem();
        if (dt.equals(".")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("A")) {
            DL3.setText("" + a + "");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("D")) {
            DL3.setText("" + a + "");
            F3.setText("0");
            FJ3.setText("0");
            this.dt1.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("V")) {
            DL3.setText("" + a + "");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("I")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("F")) {
            DL3.setText("0");
            F3.setText("" + a + "");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("FJ")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("" + a + "");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("DT")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("" + a + "");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals(" ")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("" + a + "");
            R3.setText("0");
            DSGS3.setText("0");
        }
        if (dt.equals("R")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("" + a + "");
            DSGS3.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL3.setText("0");
            F3.setText("0");
            FJ3.setText("0");
            this.dt3.setText("0");
            DO3.setText("0");
            R3.setText("0");
            DSGS3.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT2ItemStateChanged

    private void DT1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DT1ItemStateChanged

        String dt = (String) DT1.getSelectedItem();
        if (dt.equals(".")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("A")) {
            DL2.setText("" + a + "");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("D")) {
            DL2.setText("" + a + "");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("V")) {
            DL2.setText("" + a + "");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("I")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("F")) {
            DL2.setText("0");
            F2.setText("" + a + "");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("FJ")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("" + a + "");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");
        }
        if (dt.equals("DT")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("" + a + "");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("0");

        }
        if (dt.equals(" ")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("" + a + "");
            R2.setText("0");
            DSGS2.setText("0");

        }
        if (dt.equals("R")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("" + a + "");
            DSGS2.setText("0");

        }
        if (dt.equals("DSGS")) {
            DL2.setText("0");
            F2.setText("0");
            FJ2.setText("0");
            this.dt2.setText("0");
            DO2.setText("0");
            R2.setText("0");
            DSGS2.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DT1ItemStateChanged

    private void DTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DTItemStateChanged

        String dt = (String) DT.getSelectedItem();
        if (dt.equals(".")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals("A")) {
            DL1.setText("" + a + "");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals("D")) {
            DL1.setText("" + a + "");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals("V")) {
            DL1.setText("" + a + "");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");
        }
        if (dt.equals("I")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals("F")) {
            DL1.setText("0");
            F1.setText("" + a + "");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
        }
        if (dt.equals("FJ")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("" + a + "");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals("DT")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("" + a + "");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals(" ")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("" + a + "");
            R1.setText("0");
            DSGS1.setText("0");

        }
        if (dt.equals("R")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("" + a + "");
            DSGS1.setText("0");
        }
        if (dt.equals("DSGS")) {
            DL1.setText("0");
            F1.setText("0");
            FJ1.setText("0");
            this.dt1.setText("0");
            DO1.setText("0");
            R1.setText("0");
            DSGS1.setText("" + a + "");
        }
        DL();
        DT();
        F();
        FJ();
        R();
        DO();
        DSGS();
        pago();
    }//GEN-LAST:event_DTItemStateChanged

    private void PagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PagoKeyReleased

    }//GEN-LAST:event_PagoKeyReleased

    private void PagoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMouseClicked

    }//GEN-LAST:event_PagoMouseClicked

    private void PagoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagoMouseMoved

    }//GEN-LAST:event_PagoMouseMoved

    private void DLKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DLKeyReleased

    }//GEN-LAST:event_DLKeyReleased

    private void DLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DLMouseClicked

    }//GEN-LAST:event_DLMouseClicked

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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT15.setVisible(true);
            d13.setVisible(true);
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT15.setVisible(false);
            d13.setVisible(true);
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(false);
            d14.setVisible(false);
            DT14.setVisible(false);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 13;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d13.setVisible(true);
            d14.setVisible(false);
            DT14.setVisible(false);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 14;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT15.setVisible(false);
            d13.setVisible(true);
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            d15.setText("31");
            d13.setVisible(true);
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(false);
            DT15.setVisible(false);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 15;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
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
            DT13.setVisible(true);
            d14.setVisible(true);
            DT14.setVisible(true);
            d15.setVisible(true);
            DT15.setVisible(true);
            DT.setSelectedIndex(0);
            DT1.setSelectedIndex(0);
            DT2.setSelectedIndex(0);
            DT3.setSelectedIndex(0);
            DT4.setSelectedIndex(0);
            DT5.setSelectedIndex(0);
            DT6.setSelectedIndex(0);
            DT7.setSelectedIndex(0);
            DT8.setSelectedIndex(0);
            DT9.setSelectedIndex(0);
            DT10.setSelectedIndex(0);
            DT11.setSelectedIndex(0);
            DT12.setSelectedIndex(0);
            DT13.setSelectedIndex(0);
            DT14.setSelectedIndex(0);
            DT15.setSelectedIndex(0);
            double b = 16;
            double d1 = Double.parseDouble(sueldo.getText());
            double total = d1 / b;
            pd.setText("" + total + "");
        }
    }//GEN-LAST:event_QuincenasItemStateChanged

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

        shareN();
    }//GEN-LAST:event_searchKeyReleased

    private void shareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shareMouseClicked

        int seleccionar = share.getSelectedRow();
        Ap.setText(String.valueOf(share.getValueAt(seleccionar, 0)));
        am.setText(String.valueOf(share.getValueAt(seleccionar, 1)));
        name.setText(String.valueOf(share.getValueAt(seleccionar, 2)));
        cta.setText(String.valueOf(share.getValueAt(seleccionar, 3)));
        ban.setText(String.valueOf(share.getValueAt(seleccionar, 4)));
        Zon.setText(String.valueOf(share.getValueAt(seleccionar, 5)));
        lug.setText(String.valueOf(share.getValueAt(seleccionar, 6)));
        sueldo.setText(String.valueOf(share.getValueAt(seleccionar, 7)));
        cda.setText(String.valueOf(share.getValueAt(seleccionar, 8)));
        Bono.setText(String.valueOf(share.getValueAt(seleccionar, 9)));
        Bono1.setText(String.valueOf(share.getValueAt(seleccionar, 10)));


    }//GEN-LAST:event_shareMouseClicked

    private void folActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_folActionPerformed

    }//GEN-LAST:event_folActionPerformed

    private void CS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS4ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS4ActionPerformed

    private void CS6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS6ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS6ActionPerformed

    private void buspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buspKeyReleased

        pagos();
    }//GEN-LAST:event_buspKeyReleased

    private void BsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsiActionPerformed

        String Bonosi = Bono1.getText();
        Bono.setText(Bonosi);
    }//GEN-LAST:event_BsiActionPerformed

    private void BnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnoActionPerformed

        Bono.setText("0");
    }//GEN-LAST:event_BnoActionPerformed

    private void CSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CSActionPerformed

    private void CS7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS7ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS7ActionPerformed

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void CS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS3ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS3ActionPerformed

    private void CS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS5ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS5ActionPerformed

    private void FiltroQuincenanominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQuincenanominaItemStateChanged

        mostrardatos();
    }//GEN-LAST:event_FiltroQuincenanominaItemStateChanged

    private void FZservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicioItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina.setModel(modelServicio);
        }
        mostrardatos();
    }//GEN-LAST:event_FZservicioItemStateChanged

    private void FiltroZnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZnominaItemStateChanged

        mostrardatos();
    }//GEN-LAST:event_FiltroZnominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged

        mostrardatos();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void FiltrosTDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTDItemStateChanged

        String dt = (String) FiltrosTD.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();

        }
        if (dt.equals("Filtrar por Apellido P")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido P:");
            FApT.setText("");
            FApT.setVisible(true);
            FAmT.setVisible(false);
            FAmT.setText("");
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();
        }
        if (dt.equals("Filtrar por Apellido M")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido M:");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(true);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();
        }
        if (dt.equals("Filtrar por Nombre(s)")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Nombre(s):");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(true);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();
        }
        if (dt.equals("Filtrar por Zona")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(true);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(true);
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
            mostrardatos();
        }
        if (dt.equals("Filtrar por Servicio")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();
        }
        if (dt.equals("Filtrar por quincena")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();
        }
        if (dt.equals("Filtrar por Folio")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
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
            mostrardatos();
        }
    }//GEN-LAST:event_FiltrosTDItemStateChanged

    private void FiltrosPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPItemStateChanged

        String dt = (String) FiltrosP.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();

        }
        if (dt.equals("Filtrar por Nombre(s)")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Apellido P")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Apellido M")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Zona")) {
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
            FiltroZP.setVisible(true);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(true);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Servicio")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(true);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(true);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por quincena")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Folio")) {
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
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(true);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(true);
            pagos();
        }

    }//GEN-LAST:event_FiltrosPItemStateChanged

    private void FiltroSZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZPItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP.setModel(modelServicio);
        }
        pagos();
    }//GEN-LAST:event_FiltroSZPItemStateChanged

    private void FiltroZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZPItemStateChanged

        pagos();
    }//GEN-LAST:event_FiltroZPItemStateChanged

    private void FiltroServPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServPItemStateChanged

        pagos();
    }//GEN-LAST:event_FiltroServPItemStateChanged

    private void FiltroQPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQPItemStateChanged

        pagos();
    }//GEN-LAST:event_FiltroQPItemStateChanged

    private void filtroNDFPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFPKeyReleased

        pagos();
    }//GEN-LAST:event_filtroNDFPKeyReleased

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased

        mostrardatos();
    }//GEN-LAST:event_FiltroNDFKeyReleased

    private void BAPNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAPNomKeyReleased

        shareN();
    }//GEN-LAST:event_BAPNomKeyReleased

    private void BAMNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAMNomKeyReleased

        shareN();
    }//GEN-LAST:event_BAMNomKeyReleased

    private void FiltrosNomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosNomItemStateChanged

        String dt = (String) FiltrosNom.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Filtro1.setVisible(false);
            Filtro1.setText("");
            search.setVisible(false);
            search.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido P")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido P:");
            search.setVisible(false);
            search.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(true);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido M")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido M:");
            search.setVisible(false);
            search.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(true);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Nombre(s)")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Nombre(s):");
            search.setVisible(true);
            search.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
    }//GEN-LAST:event_FiltrosNomItemStateChanged

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased

        mostrardatos();
    }//GEN-LAST:event_FApTKeyReleased

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased

        mostrardatos();
    }//GEN-LAST:event_FAmTKeyReleased

    private void BusapshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusapshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusapshpreKeyReleased

    private void BusamshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusamshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusamshpreKeyReleased

    private void FiltrosshpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosshpItemStateChanged

        String dt = (String) Filtrosshp.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            LabelPrestamos.setVisible(false);
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();
        }
        if (dt.equals("Apellido P")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Apellido P:");
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(true);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();
        }
        if (dt.equals("Apellido M")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Apellido M:");
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(true);
            shareprestamo();
        }
        if (dt.equals("Nombre(s)")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Nombre(s):");
            BE.setVisible(true);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();

        }
    }//GEN-LAST:event_FiltrosshpItemStateChanged

    private void FshTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FshTItemStateChanged

        String dt = (String) FshT.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            LabelPrestamos1.setVisible(false);
            BE1.setVisible(false);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(false);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(false);
            sharetp();
        }
        if (dt.equals("Apellido P")) {
            LabelPrestamos1.setVisible(true);
            LabelPrestamos1.setText("Buscar por Apellido P:");
            BE1.setVisible(false);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(true);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(false);
            sharetp();
        }
        if (dt.equals("Apellido M")) {
            LabelPrestamos1.setVisible(true);
            LabelPrestamos1.setText("Buscar por Apellido M:");
            BE1.setVisible(false);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(false);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(true);
            sharetp();
        }
        if (dt.equals("Nombre(s)")) {
            LabelPrestamos1.setVisible(true);
            LabelPrestamos1.setText("Buscar por Nombre(s):");
            BE1.setVisible(true);
            BE1.setText("");
            Busapshpre1.setText("");
            Busapshpre1.setVisible(false);
            Busamshpre1.setText("");
            Busamshpre1.setVisible(false);
            sharetp();

        }
    }//GEN-LAST:event_FshTItemStateChanged

    private void Busapshpre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busapshpre1KeyReleased

        sharetp();
    }//GEN-LAST:event_Busapshpre1KeyReleased

    private void Busamshpre1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Busamshpre1KeyReleased

        sharetp();
    }//GEN-LAST:event_Busamshpre1KeyReleased

    private void BAppagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppagKeyReleased

        pagos();
    }//GEN-LAST:event_BAppagKeyReleased

    private void BampagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BampagKeyReleased

        pagos();
    }//GEN-LAST:event_BampagKeyReleased

    private void VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres a ventana administrador?");
        if (i == 0) {
            Administradores_3 regr = new Administradores_3();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_VolverActionPerformed

    private void Nomina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nomina1ActionPerformed

        Admin_Nomina_5 regr = new Admin_Nomina_5();
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

    private void DetallepagoQodtItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DetallepagoQodtItemStateChanged
        String D1 = OcultoODT.getText();
        String DPNQ = DetallepagoNQodt.getSelectedItem().toString();
        String DPQODT = DetallepagoQodt.getSelectedItem().toString();
        Detallespagoodt.setText(D1 + ", " + "Quincena " + DPNQ + " " + DPQODT);
    }//GEN-LAST:event_DetallepagoQodtItemStateChanged

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
            java.util.logging.Logger.getLogger(Admin_Nomina_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Nomina_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Nomina_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Nomina_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Nomina_5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ADD;
    private javax.swing.JMenuItem Administradores;
    private javax.swing.JButton AgregarNP;
    private javax.swing.JButton Agregarprestamo;
    private javax.swing.JButton Agregartaller;
    private javax.swing.JTextField Ampres;
    private javax.swing.JTextField Amtaller;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField ApTaller;
    private javax.swing.JTextField Appres;
    private javax.swing.JTextField BAMNom;
    private javax.swing.JTextField BAPNom;
    private javax.swing.JTextField BAppag;
    private javax.swing.JTextField BE;
    private javax.swing.JTextField BE1;
    private javax.swing.JTextField BP;
    private javax.swing.JTextField Bampag;
    private javax.swing.JRadioButton Bno;
    private javax.swing.JTextField Bodt;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField Bono1;
    private javax.swing.JTextField Bp;
    private javax.swing.JRadioButton Bsi;
    private javax.swing.JTextField Busamshpre;
    private javax.swing.JTextField Busamshpre1;
    private javax.swing.JTextField Busapshpre;
    private javax.swing.JTextField Busapshpre1;
    private javax.swing.JButton CS;
    private javax.swing.JButton CS2;
    private javax.swing.JButton CS3;
    private javax.swing.JButton CS4;
    private javax.swing.JButton CS5;
    private javax.swing.JButton CS6;
    private javax.swing.JButton CS7;
    private javax.swing.JTextField CT;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Carpeta;
    private javax.swing.JTextField Chaleco;
    private javax.swing.JTextField Chamarra;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Corbata;
    private javax.swing.JTextField Credencial;
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
    private javax.swing.JComboBox<String> DT;
    private javax.swing.JComboBox<String> DT1;
    private javax.swing.JComboBox<String> DT10;
    private javax.swing.JComboBox<String> DT11;
    private javax.swing.JComboBox<String> DT12;
    private javax.swing.JComboBox<String> DT13;
    private javax.swing.JComboBox<String> DT14;
    private javax.swing.JComboBox<String> DT15;
    private javax.swing.JComboBox<String> DT2;
    private javax.swing.JComboBox<String> DT3;
    private javax.swing.JComboBox<String> DT4;
    private javax.swing.JComboBox<String> DT5;
    private javax.swing.JComboBox<String> DT6;
    private javax.swing.JComboBox<String> DT7;
    private javax.swing.JComboBox<String> DT8;
    private javax.swing.JComboBox<String> DT9;
    private javax.swing.JTextField DVT;
    private javax.swing.JTextArea Daño;
    private javax.swing.JComboBox<String> DetallepagoNQodt;
    private javax.swing.JComboBox<String> DetallepagoQodt;
    private javax.swing.JTextArea Detallespagoodt;
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton EliminarT;
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
    private javax.swing.JTextField FApT;
    private javax.swing.JTextField FE;
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
    private javax.swing.JTextField FL;
    private javax.swing.JTextField FS;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JTextField Fdb;
    private javax.swing.JTextField Fde;
    private javax.swing.JComboBox<String> Fdp;
    private javax.swing.JLabel Filtro1;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JComboBox<String> FiltroQP;
    private javax.swing.JComboBox<String> FiltroQuincenanomina;
    private javax.swing.JComboBox<String> FiltroSZP;
    private javax.swing.JComboBox<String> FiltroServP;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroZP;
    private javax.swing.JComboBox<String> FiltroZnomina;
    private javax.swing.JComboBox<String> FiltrosNom;
    private javax.swing.JComboBox<String> FiltrosP;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JComboBox<String> Filtrosshp;
    private javax.swing.JComboBox<String> FshT;
    private javax.swing.JMenuItem General;
    private javax.swing.JTextField Grua;
    private javax.swing.JTextField Iad;
    private javax.swing.JComboBox<String> Interes;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBEP;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQP;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBSP;
    private javax.swing.JLabel LabelBZ;
    private javax.swing.JLabel LabelBZP;
    private javax.swing.JLabel LabelNDFP;
    private javax.swing.JLabel LabelPrestamos;
    private javax.swing.JLabel LabelPrestamos1;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZP;
    private javax.swing.JTextField Lugar;
    private javax.swing.JLabel M1;
    private javax.swing.JLabel M2;
    private javax.swing.JLabel M3;
    private javax.swing.JLabel M4;
    private javax.swing.JTextField MT;
    private javax.swing.JTextField Marca;
    private javax.swing.JMenu Menuadm;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextField Metodo;
    private javax.swing.JTextField Modelo;
    private javax.swing.JButton Modificartaller;
    private javax.swing.JButton Modm;
    private javax.swing.JTextField NameTaller;
    private javax.swing.JTextField Namepres;
    private javax.swing.JTextField Ndo;
    private javax.swing.JScrollPane Nomina;
    private javax.swing.JMenuItem Nomina1;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Num;
    private javax.swing.JTextArea Observaciones;
    private javax.swing.JTextField OcultoODT;
    private javax.swing.JTable OdT;
    private javax.swing.JTextField Odtp;
    private javax.swing.JTextField PQ;
    private javax.swing.JTextField PQT;
    private javax.swing.JTextField Pagado;
    private javax.swing.JLabel Pago;
    private javax.swing.JTextField Pantalon;
    private javax.swing.JTextField Pendiente;
    private javax.swing.JTextField Placas;
    private javax.swing.JTextField Playera;
    private javax.swing.JTable Pre;
    private javax.swing.JTextField Presp;
    private javax.swing.JScrollPane Prestamos;
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
    private javax.swing.JLabel Q25;
    private javax.swing.JLabel Q26;
    private javax.swing.JLabel Q27;
    private javax.swing.JLabel Q28;
    private javax.swing.JLabel Q3;
    private javax.swing.JLabel Q4;
    private javax.swing.JLabel Q5;
    private javax.swing.JLabel Q6;
    private javax.swing.JLabel Q7;
    private javax.swing.JLabel Q8;
    private javax.swing.JLabel Q9;
    private javax.swing.JComboBox<String> QAP;
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
    private javax.swing.JTextField Sancion;
    private javax.swing.JTextField Serv;
    private javax.swing.JTextField Serv1;
    private javax.swing.JRadioButton Si;
    private javax.swing.JTextField Status;
    private javax.swing.JComboBox<String> Statustaller;
    private javax.swing.JScrollPane TDnomina;
    private javax.swing.JScrollPane TPagos;
    private javax.swing.JScrollPane TTalleres;
    private javax.swing.JScrollPane Talleres;
    private javax.swing.JTable Tnom;
    private javax.swing.JMenuItem Torteria;
    private javax.swing.JScrollPane Tprestamos;
    private javax.swing.JMenuItem UsuariosRH;
    private javax.swing.JButton Volver;
    private javax.swing.JMenuItem ZYS;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField Zona;
    private javax.swing.JTextField Zona1;
    private javax.swing.JTextField am;
    private javax.swing.JTextField apy;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private botones.BotonWeb botonWeb1;
    private botones.BotonWeb botonWeb2;
    private botones.BotonWeb botonWeb3;
    private botones.BotonWeb botonWeb4;
    private javax.swing.JTextField busp;
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
    private javax.swing.JTextField fol;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
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
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
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
    private javax.swing.JTextField lug;
    private javax.swing.JButton modP;
    private javax.swing.JButton modprestamo;
    private javax.swing.JTextField name;
    private javax.swing.JTextField ndp;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField obs;
    private javax.swing.JTable pago;
    private javax.swing.JTextField pd;
    private javax.swing.JTextField search;
    private javax.swing.JTable share;
    private javax.swing.JTable share1;
    private javax.swing.JTable share2;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
