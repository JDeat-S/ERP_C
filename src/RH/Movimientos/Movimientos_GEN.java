package RH.Movimientos;

import RH.*;
import Filtros.FiltrosZonas;
import Logicas.*;
import Logicas.BDRH.Logica_bd_RH;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class Movimientos_GEN extends javax.swing.JFrame {

    int xMouse, yMouse;
    Logica_usuarios usr;
    Logica_permisos LP;

    public Movimientos_GEN() {
        initComponents();
        this.setLocationRelativeTo(null);
        LabelZona.setVisible(false);
        cbxZona.setVisible(false);
        btnExcel.setVisible(false);
        LabelStatus.setVisible(false);
        cbxStatus.setVisible(false);
        FiltrosZonas zz8 = new FiltrosZonas();
        DefaultComboBoxModel contenido = new DefaultComboBoxModel(zz8.mostrarzonas());
        cbxZona.setModel(contenido);
    }

    public Movimientos_GEN(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        this.setLocationRelativeTo(null);
        cbxZona.setVisible(false);
        LabelZona.setVisible(false);
        btnExcel.setVisible(false);
        LabelStatus.setVisible(false);
        cbxStatus.setVisible(false);
        FiltrosZonas zz8 = new FiltrosZonas();
        DefaultComboBoxModel contenido = new DefaultComboBoxModel(zz8.mostrarzonas());
        cbxZona.setModel(contenido);
    }

    public void Reporte2() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Reporte de Datos BD"));
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xlsx"); //extención del archivo excel
        }
        try {
            String ruta = chooser.getSelectedFile().toString().concat(".xlsx");
            File archivoXLS = new File(ruta);
            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            archivoXLS.createNewFile();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://192.168.1.170:3306/confort2022",
                    "Servidor",
                    "Confort1022"
            );
            Statement RHstatement = connect.createStatement();
            ResultSet resultSetRH = RHstatement.executeQuery("SELECT * FROM `rh.empleados` WHERE `Zona` LIKE '%" + cbxZona.getSelectedItem().toString()
                    + "%' AND `Status` LIKE '%" + cbxStatus.getSelectedItem().toString() + "%'");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Datos RH");

                XSSFCellStyle Encabezado = libro.createCellStyle();
                Encabezado.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                Encabezado.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

                XSSFCellStyle Stilodd = libro.createCellStyle();

                Stilodd.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                Stilodd.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                Stilodd.setBorderTop(XSSFCellStyle.BORDER_THIN);
                Stilodd.setAlignment(XSSFCellStyle.ALIGN_CENTER_SELECTION);
                Stilodd.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                XSSFCellStyle StiloEEEE = libro.createCellStyle();

                StiloEEEE.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                StiloEEEE.setBorderRight(XSSFCellStyle.BORDER_THIN);
                StiloEEEE.setBorderTop(XSSFCellStyle.BORDER_THIN);
                StiloEEEE.setAlignment(XSSFCellStyle.ALIGN_JUSTIFY);
                StiloEEEE.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                XSSFCellStyle Contenido = libro.createCellStyle();
                Contenido.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                Contenido.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
                Contenido.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                Contenido.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                Contenido.setBorderRight(XSSFCellStyle.BORDER_THIN);
                Contenido.setBorderTop(XSSFCellStyle.BORDER_THIN);
                XSSFRow row = spreadsheet.createRow((short) 0);
                XSSFCell cell = (XSSFCell) row.createCell((short) 0);
                cell.setCellValue("Consecutivo RH");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                0, //first row (0-based)
                                0, //last row (0-based)
                                0, //first column (0-based)
                                5 //last column (0-based)
                        )
                );
                row = spreadsheet.createRow(1);
                cell = row.createCell(0);
                cell.setCellValue("# Exp");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("Entra IMSS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("Apellido P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Apellido M");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Nombre(s)");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("# Celular");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("# Casa");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("# Recados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Forma de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Sueldo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Bono");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Banco");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Cuenta bancaria");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Status");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Fecha entrevista");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Fecha de ingreso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Fecha ultimo dia laborado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Fecha firma baja");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Baja Firmada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("Finiquito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Años de antiguedad");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("RFC");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
                cell.setCellValue("NSS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(25);
                cell.setCellValue("CURP");
                cell.setCellStyle(Contenido);
                cell = row.createCell(26);
                cell.setCellValue("Correo electronico");
                cell.setCellStyle(Contenido);
                cell = row.createCell(27);
                cell.setCellValue("Calle");
                cell.setCellStyle(Contenido);
                cell = row.createCell(28);
                cell.setCellValue("# Exterior");
                cell.setCellStyle(Contenido);
                cell = row.createCell(29);
                cell.setCellValue("# Interior");
                cell.setCellStyle(Contenido);
                cell = row.createCell(30);
                cell.setCellValue("Colonia");
                cell.setCellStyle(Contenido);
                cell = row.createCell(31);
                cell.setCellValue("DLG o Mun");
                cell.setCellStyle(Contenido);
                cell = row.createCell(32);
                cell.setCellValue("C.P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(33);
                cell.setCellValue("Documentos originales");
                cell.setCellStyle(Contenido);
                cell = row.createCell(34);
                cell.setCellValue("Documentos faltantes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(35);
                cell.setCellValue("Documentos entregados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(36);
                cell.setCellValue("# Recepcion");
                cell.setCellStyle(Contenido);
                cell = row.createCell(37);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);

                int i = 2;

                while (resultSetRH.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSetRH.getInt("# Exp"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSetRH.getString("Entra a IMSS"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(resultSetRH.getString("Apellido P"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(resultSetRH.getString("Apellido M"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(resultSetRH.getString("Nombre(s)"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(resultSetRH.getString("# Celular"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(resultSetRH.getString("# Casa"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(resultSetRH.getString("# Recados"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(resultSetRH.getString("Forma de pago"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(resultSetRH.getString("Sueldo"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(resultSetRH.getString("Bono"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(resultSetRH.getString("Banco"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(resultSetRH.getString("Cuenta bancaria"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(resultSetRH.getString("Zona"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(resultSetRH.getString("Servicio"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(resultSetRH.getString("Status"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(16);
                    cell.setCellValue(resultSetRH.getString("Fecha entrevista"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(resultSetRH.getString("Fecha de ingreso"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(resultSetRH.getString("Fecha ultimo dia laborado"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(resultSetRH.getString("Fecha firma baja"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(resultSetRH.getString("Baja Firmada"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(resultSetRH.getString("Finiquito"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(resultSetRH.getString("Años de antiguedad"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(23);
                    cell.setCellValue(resultSetRH.getString("RFC"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(24);
                    cell.setCellValue(resultSetRH.getString("NSS"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(25);
                    cell.setCellValue(resultSetRH.getString("CURP"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(26);
                    cell.setCellValue(resultSetRH.getString("Correo electronico"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(27);
                    cell.setCellValue(resultSetRH.getString("Calle"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(28);
                    cell.setCellValue(resultSetRH.getString("# Exterior"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(29);
                    cell.setCellValue(resultSetRH.getString("# Interior"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(30);
                    cell.setCellValue(resultSetRH.getString("Colonia"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(31);
                    cell.setCellValue(resultSetRH.getString("DLG o Mun"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(32);
                    cell.setCellValue(resultSetRH.getString("C.P"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(33);
                    cell.setCellValue(resultSetRH.getString("Documentos originales"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(34);
                    cell.setCellValue(resultSetRH.getString("Documentos faltantes"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(35);
                    cell.setCellValue(resultSetRH.getString("Documentos entregados"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(36);
                    cell.setCellValue(resultSetRH.getString("# Recepcion"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(37);
                    cell.setCellValue(resultSetRH.getString("Observaciones"));
                    cell.setCellStyle(Contenido);
                    i++;
                }

                spreadsheet.getPrintSetup();
                spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                spreadsheet.getPrintSetup().setLandscape(false); // Dirección de impresión, true: horizontal, false: vertical
                spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.1); // Margen (abajo)
                spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.1); // Margen (arriba)
                spreadsheet.setMargin(HSSFSheet.FooterMargin, (double) 0.1);
                spreadsheet.setMargin(HSSFSheet.HeaderMargin, (double) 0.1);

                spreadsheet.setVerticallyCenter(true);
                libro.write(archivo);
            }
            Desktop.getDesktop().open(archivoXLS);
        } catch (IOException | NumberFormatException e) {

            try {
                throw e;
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(Movimientos_GEN.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Movimientos_GEN.class.getName()).log(Level.SEVERE, null, ex);
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
        LabelStatus = new javax.swing.JLabel();
        LabelZona = new javax.swing.JLabel();
        btnExcel = new javax.swing.JLabel();
        CbxTDR = new javax.swing.JComboBox<>();
        cbxStatus = new javax.swing.JComboBox<>();
        cbxZona = new javax.swing.JComboBox<>();
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

        jLabel1.setText("Tipo de reporte:");

        LabelStatus.setText("Status");

        LabelZona.setText("Zona:");

        btnExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        btnExcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnExcelMousePressed(evt);
            }
        });

        CbxTDR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "General", "Por Zona" }));
        CbxTDR.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxTDRItemStateChanged(evt);
            }
        });

        cbxStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "BAJA", "PENDIENTE", "EN ESPERA", "RECHAZADO", "TEMPORAL", "VIGENTE", "BOLETINADO", "DEPURADO", "RECHAZADO/DEPURADO", "NO CONTRATAR/DEPURADO", "BOLETINADO/DEPURADO", "BAJA/DEPURADO", "NO CONTRATAR" }));

        cbxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelZona)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CbxTDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(cbxZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelStatus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnExcel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CbxTDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelStatus)
                        .addComponent(cbxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelZona)
                        .addComponent(cbxZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcel)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Generar reporte", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 630, 360));

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
            .addGroup(btnexitLayout.createSequentialGroup()
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnexitLayout.createSequentialGroup()
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

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
        Move.setText("Reporte Empleados Consecutivo");
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
            .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

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

    private void btnExcelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcelMousePressed

        if (CbxTDR.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona tipo de reporte");
        }
        if (CbxTDR.getSelectedIndex() == 1) {
            Logica_bd_RH obj = new Logica_bd_RH();
            obj.BDRH();
        }
        if (CbxTDR.getSelectedIndex() == 2) {
            Reporte2();

        }

    }//GEN-LAST:event_btnExcelMousePressed

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

    private void CbxTDRItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxTDRItemStateChanged
        if (CbxTDR.getSelectedIndex() == 0) {
            btnExcel.setVisible(false);
            LabelZona.setVisible(false);
            cbxZona.setVisible(false);
            LabelStatus.setVisible(false);
            cbxStatus.setVisible(false);
        }
        if (CbxTDR.getSelectedIndex() == 1) {
            btnExcel.setVisible(true);
            LabelZona.setVisible(false);
            cbxZona.setVisible(false);
            LabelStatus.setVisible(false);
            cbxStatus.setVisible(false);
        }
        if (CbxTDR.getSelectedIndex() == 2) {
            btnExcel.setVisible(true);
            LabelZona.setVisible(true);
            cbxZona.setVisible(true);
            LabelStatus.setVisible(true);
            cbxStatus.setVisible(true);
        }
    }//GEN-LAST:event_CbxTDRItemStateChanged

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
            java.util.logging.Logger.getLogger(Movimientos_GEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Movimientos_GEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Movimientos_GEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Movimientos_GEN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
            new Movimientos_GEN().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxTDR;
    private javax.swing.JPanel Harder1;
    private javax.swing.JLabel LabelStatus;
    private javax.swing.JLabel LabelZona;
    private javax.swing.JLabel Move;
    private javax.swing.JLabel btnExcel;
    private javax.swing.JPanel btnexit;
    private javax.swing.JComboBox<String> cbxStatus;
    private javax.swing.JComboBox<String> cbxZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtbtnexit;
    // End of variables declaration//GEN-END:variables
}
