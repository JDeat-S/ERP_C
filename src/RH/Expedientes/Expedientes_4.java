package RH.Expedientes;

import Conexion.ConexionSQL;
import Logicas.*;
import ZyS.Servicios;
import ZyS.Zonas;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.PaperSize;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author JDEAT
 */
public final class Expedientes_4 extends javax.swing.JFrame {

    int xMouse, yMouse;
    Logica_usuarios usr;
    Logica_permisos LP;
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    public Expedientes_4() {
        initComponents();
        this.setLocationRelativeTo(null);
        Zonas zz = new Zonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        zona.setModel(modelzonas);
        
    }

    public Expedientes_4(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        this.setLocationRelativeTo(null);
    }


    public void MDMov() {
        String where = "SELECT `tipo de registro`, `Año`, `#Empleado`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Sueldo`, `bono`, `Zona`, `Servicio`,"
                + " `Aguinaldo`, `PTU`,  `Vacaciones`, `Periodoini`,"
                + " `periodofin`, `observaciones`, `reingreso`, `baja`, `tipo de baja`, `Acta administrativa`, "
                + " `Fecha actaadm`, `fecha de registro`, `registrado por` FROM `rh.empleados.movimientos`"
                + " where `Apellido P` LIKE '%%' AND `Apellido M` LIKE '%%'"
                + "AND `Nombre(s)` LIKE '%%'";

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Tmov.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("Tipo de registro");
            modelo.addColumn("Año");
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Sueldo");//3
            modelo.addColumn("Fecha alta");//3
            modelo.addColumn("Bono");//3
            modelo.addColumn("Zona");//3
            modelo.addColumn("Servicio");//3
            modelo.addColumn("Aguinaldo");//3
            modelo.addColumn("PTU");//3
            modelo.addColumn("Vacaciones");//3
            modelo.addColumn("inicio vacaciones");//3
            modelo.addColumn("Fin vacaciones");//3
            modelo.addColumn("observacinses de vacaciones");//3
            modelo.addColumn("re-ingreso");//3
            modelo.addColumn("Baja");//3
            modelo.addColumn("Tipo de baja");//3
            modelo.addColumn("Acta administrativa");//3
            modelo.addColumn("Fecha acta");//3
            modelo.addColumn("Fecha de registro");//3
            modelo.addColumn("registrado por");//3

//Anchos
            int[] anchos = {/*numR*/35,/*numE*/ 35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 50,/*Fecha baja*/ 50,
                /*Tipo baja*/ 50, /*Fecha de registro*/ 50, /*Registrado por*/ 50, 50, 50, 50, 50,
                50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tmov.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            ps.isClosed();
            rs.isClosed();
        } catch (SQLException error_sharenom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar registros: " + error_sharenom.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TDM = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        NExp = new javax.swing.JTextField();
        APgen = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        AMgen = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        NameGen = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Sueldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Bono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Serv = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        zona = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        FI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Aguinaldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Vacaciones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PeriodoIni = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        PeriodoFin = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        PTU = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Actadm = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        fechacta = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        FBaja = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TDB = new javax.swing.JComboBox<>();
        ADDreg = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Obs = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        Año = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tmov = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        FDI = new com.toedter.calendar.JDateChooser();
        btnexit = new javax.swing.JPanel();
        txtbtnexit = new javax.swing.JLabel();
        Harder1 = new javax.swing.JPanel();
        Move = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tipo de modificacion:");

        TDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Alta", "Baja", "Reingreso", "Cambio de salario", "Cambio de zona y/o Servicio", "Aguinaldo", "Vacaciones", "PTU", "Acta administrativa" }));
        TDM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TDMItemStateChanged(evt);
            }
        });

        jLabel7.setText("# Expediente");

        NExp.setEnabled(false);

        APgen.setEnabled(false);

        jLabel44.setText("Apellido M:");

        AMgen.setEnabled(false);

        jLabel62.setText("Nombre(s):");

        NameGen.setEnabled(false);

        jLabel17.setText("Apellido P:");

        Sueldo.setText("0");
        Sueldo.setEnabled(false);

        jLabel12.setText("Sueldo");

        Bono.setText("0");
        Bono.setEnabled(false);

        jLabel13.setText("Bono");

        Serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        Serv.setEnabled(false);

        jLabel14.setText("Zona");

        jLabel15.setText("Servicio");

        zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        zona.setEnabled(false);
        zona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                zonaItemStateChanged(evt);
            }
        });

        jLabel66.setText("Fecha re-ingreso:");

        FI.setEnabled(false);

        jLabel2.setText("Vacaciones:");

        Aguinaldo.setEnabled(false);

        jLabel8.setText("Aguinaldo:");

        Vacaciones.setEnabled(false);

        jLabel9.setText("Periodo:");

        jLabel10.setText("Inicio:");

        PeriodoIni.setEnabled(false);

        jLabel11.setText("Fin:");

        PeriodoFin.setEnabled(false);

        jLabel16.setText("PTU:");

        PTU.setEnabled(false);

        jLabel18.setText("Acta administrativa:");

        Actadm.setEnabled(false);

        jLabel20.setText("Fecha:");

        fechacta.setEnabled(false);

        jLabel21.setText("Fecha de baja:");

        FBaja.setEnabled(false);

        jLabel19.setText("Tipo de baja:");

        TDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "BAJA", "BOLETINADO" }));
        TDB.setEnabled(false);

        ADDreg.setText("Agregar registro");
        ADDreg.setEnabled(false);
        ADDreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDregActionPerformed(evt);
            }
        });

        jLabel22.setText("Observaciones:");

        Obs.setEditable(false);
        Obs.setColumns(20);
        Obs.setRows(5);
        jScrollPane5.setViewportView(Obs);

        jLabel23.setText("Año");

        Año.setDateFormatString("yyyy");

        Tmov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(Tmov);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 4089, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane6.setViewportView(jPanel1);

        jLabel24.setText("Fecha ingreso:");

        FDI.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel44)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADDreg))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Sueldo)
                                            .addComponent(NExp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(APgen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AMgen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NameGen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bono)
                                            .addComponent(TDM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(48, 48, 48)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel16)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel24)))))
                                    .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PeriodoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PeriodoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(Aguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(82, 82, 82)
                                                .addComponent(jLabel23)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Año, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(PTU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(Actadm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jLabel20)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(fechacta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(FDI, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(248, 248, 248)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(TDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Aguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(NExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)
                            .addComponent(PTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(APgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)
                                    .addComponent(Actadm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel44)
                                        .addComponent(AMgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24))
                                    .addComponent(FDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel62)
                                    .addComponent(NameGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(fechacta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PeriodoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PeriodoIni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(FBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADDreg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Movimientos y modificaciones", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 1190, 610));

        btnexit.setBackground(new java.awt.Color(255, 255, 255));

        txtbtnexit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtbtnexit.setForeground(new java.awt.Color(0, 0, 0));
        txtbtnexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnexit.setText("x");
        txtbtnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnexitLayout = new javax.swing.GroupLayout(btnexit);
        btnexit.setLayout(btnexitLayout);
        btnexitLayout.setHorizontalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, -1, -1));

        Harder1.setBackground(new java.awt.Color(255, 255, 255));
        Harder1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Harder1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Harder1MouseDragged(evt);
            }
        });
        Harder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Harder1MousePressed(evt);
            }
        });

        Move.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Move.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move.setText("Movimientos/Modificaciones de empleados");
        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
        });
        Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Harder1Layout = new javax.swing.GroupLayout(Harder1);
        Harder1.setLayout(Harder1Layout);
        Harder1Layout.setHorizontalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtbtnexitMouseClicked

    private void txtbtnexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseEntered
        btnexit.setBackground(Color.red);
        txtbtnexit.setForeground(Color.white);
    }//GEN-LAST:event_txtbtnexitMouseEntered

    private void txtbtnexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseExited
        btnexit.setBackground(Color.white);
        txtbtnexit.setForeground(Color.black);
    }//GEN-LAST:event_txtbtnexitMouseExited

    private void Harder1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Harder1MouseDragged

    private void Harder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Harder1MousePressed

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

    private void zonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_zonaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Zonas zon = (Zonas) zona.getSelectedItem();
            Servicios serv = new Servicios();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            Serv.setModel(modelServicio);
        }
    }//GEN-LAST:event_zonaItemStateChanged

    private void TDMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TDMItemStateChanged
        NExp.setText("0");
        APgen.setText("");
        AMgen.setText("");
        NameGen.setText("");
        FBaja.setText("");
        TDB.setSelectedIndex(0);
        FI.setText("");
        Sueldo.setText("0");
        Bono.setText("0");
        Aguinaldo.setText("");
        zona.setSelectedIndex(0);
        Serv.setSelectedIndex(0);
        NExp.setText("0");
        APgen.setText("");
        AMgen.setText("");
        NameGen.setText("");
        Vacaciones.setText("");
        Obs.setText("");
        PeriodoIni.setDate(null);
        PeriodoFin.setDate(null);
        PTU.setText("");
        Actadm.setText("");
        fechacta.setDate(null);
        FDI.setDate(null);

        if (TDM.getSelectedIndex() == 0) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(false);
            Obs.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 1) {
            NExp.setEnabled(true);
            APgen.setEnabled(true);
            AMgen.setEnabled(true);
            NameGen.setEnabled(true);
            Sueldo.setEnabled(true);
            Bono.setEnabled(true);
            FDI.setEnabled(true);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 2) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(true);
            TDB.setEnabled(true);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 3) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(true);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 4) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(true);
            Bono.setEnabled(true);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 5) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(true);
            Serv.setEnabled(true);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 6) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(true);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 7) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(true);
            PeriodoIni.setEnabled(true);
            PeriodoFin.setEnabled(true);
            Obs.setEnabled(true);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            FDI.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 8) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(true);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 9) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(true);
            fechacta.setEnabled(true);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDI.setEnabled(false);

        }
        MDMov();
    }//GEN-LAST:event_TDMItemStateChanged

    private void ADDregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDregActionPerformed
        if (((JTextField) Año.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione el año");

        } else {
            if (TDM.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Selecciona tipo de movimiento");
            }
            if (TDM.getSelectedIndex() >= 1) {
                DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                String SQL = "INSERT INTO `rh.empleados.movimientos` (`#registro`, `tipo de registro`, `Año`,"
                        + " `#Empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Sueldo`,"
                        + " `bono`, `Fecha de ingreso`, `Zona`, `Servicio`, `Aguinaldo`, `PTU`, `Vacaciones`,"
                        + " `Periodoini`, `periodofin`, `observaciones`, `reingreso`, `baja`, `tipo de baja`,"
                        + " `Acta administrativa`, `Fecha actaadm`, `fecha de registro`, `registrado por`)"
                        + " VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try {
                    PreparedStatement pst = con.prepareStatement(SQL);
                    pst.setString(1, TDM.getSelectedItem().toString());
                    pst.setString(2, ((JTextField) Año.getDateEditor().getUiComponent()).getText());
                    pst.setString(3, NExp.getText());
                    pst.setString(4, APgen.getText());
                    pst.setString(5, AMgen.getText());
                    pst.setString(6, NameGen.getText());
                    pst.setString(7, Sueldo.getText());
                    pst.setString(8, Bono.getText());
                    pst.setString(9, ((JTextField) FDI.getDateEditor().getUiComponent()).getText());
                    pst.setString(10, zona.getSelectedItem().toString());
                    pst.setString(11, Serv.getSelectedItem().toString());
                    pst.setString(12, Aguinaldo.getText());
                    pst.setString(13, PTU.getText());
                    pst.setString(14, Vacaciones.getText());
                    pst.setString(15, ((JTextField) PeriodoIni.getDateEditor().getUiComponent()).getText());
                    pst.setString(16, ((JTextField) PeriodoFin.getDateEditor().getUiComponent()).getText());
                    pst.setString(17, Obs.getText());
                    pst.setString(18, FBaja.getText());
                    pst.setString(19, TDB.getSelectedItem().toString());
                    pst.setString(20, FI.getText());
                    pst.setString(21, Actadm.getText());
                    pst.setString(22, ((JTextField) fechacta.getDateEditor().getUiComponent()).getText());
                    pst.setString(23, dtf3.format(LocalDateTime.now()));
                    pst.setString(24, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "registro agregado.");
                    MDMov();

                    NExp.setText("0");
                    APgen.setText("");
                    AMgen.setText("");
                    NameGen.setText("");
                    FBaja.setText("");
                    TDB.setSelectedIndex(0);
                    FI.setText("");
                    Sueldo.setText("0");
                    Bono.setText("0");
                    Aguinaldo.setText("");
                    zona.setSelectedIndex(0);
                    Serv.setSelectedIndex(0);
                    NExp.setText("0");
                    APgen.setText("");
                    AMgen.setText("");
                    NameGen.setText("");
                    Vacaciones.setText("");
                    Obs.setText("");
                    PeriodoIni.setDate(null);
                    PeriodoFin.setDate(null);
                    FDI.setDate(null);
                    PTU.setText("");
                    Actadm.setText("");
                    fechacta.setDate(null);

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_ADDregActionPerformed

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
            java.util.logging.Logger.getLogger(Expedientes_4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Expedientes_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDreg;
    private javax.swing.JTextField AMgen;
    private javax.swing.JTextField APgen;
    private javax.swing.JTextField Actadm;
    private javax.swing.JTextField Aguinaldo;
    private com.toedter.calendar.JDateChooser Año;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField FBaja;
    private com.toedter.calendar.JDateChooser FDI;
    private javax.swing.JTextField FI;
    private javax.swing.JPanel Harder1;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NExp;
    private javax.swing.JTextField NameGen;
    private javax.swing.JTextArea Obs;
    private javax.swing.JTextField PTU;
    private com.toedter.calendar.JDateChooser PeriodoFin;
    private com.toedter.calendar.JDateChooser PeriodoIni;
    private javax.swing.JComboBox<String> Serv;
    private javax.swing.JTextField Sueldo;
    private javax.swing.JComboBox<String> TDB;
    private javax.swing.JComboBox<String> TDM;
    private javax.swing.JTable Tmov;
    private javax.swing.JTextField Vacaciones;
    private javax.swing.JPanel btnexit;
    private com.toedter.calendar.JDateChooser fechacta;
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
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables
}
