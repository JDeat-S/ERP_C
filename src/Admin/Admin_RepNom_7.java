package Admin;

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
public class Admin_RepNom_7 extends javax.swing.JFrame {

    public Admin_RepNom_7() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CbxTDR = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxQuincena = new javax.swing.JComboBox<>();
        BBVAISI = new javax.swing.JCheckBox();
        IDBBVA = new javax.swing.JCheckBox();
        IDSant = new javax.swing.JCheckBox();
        IDeEfec = new javax.swing.JCheckBox();
        IDbaj = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbxZona = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        SantanderISI = new javax.swing.JCheckBox();
        EfectivoISI = new javax.swing.JCheckBox();
        BajasISI = new javax.swing.JCheckBox();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Reportes Nomina.");

        jLabel1.setText("Tipo de reporte:");

        CbxTDR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Completo", "Quincenal" }));

        jLabel2.setText("Quincena:");

        cbxQuincena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));

        BBVAISI.setText("Incluir sin imss");

        IDBBVA.setText("Incluir depositos BBVA");

        IDSant.setText("Incluir depositos Santander");

        IDeEfec.setText("Incluir depositos en efectivo");

        IDbaj.setText("Incluir bajas");

        jLabel4.setText("Zona:");

        cbxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        SantanderISI.setText("Incluir sin imss");

        EfectivoISI.setText("Incluir sin imss");

        BajasISI.setText("Incluir sin imss");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IDeEfec))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(CbxTDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbxZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDBBVA)
                                    .addComponent(IDSant)
                                    .addComponent(IDbaj))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(BajasISI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5))
                                    .addComponent(SantanderISI)
                                    .addComponent(BBVAISI)
                                    .addComponent(EfectivoISI))))))
                .addContainerGap(347, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CbxTDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDBBVA)
                    .addComponent(BBVAISI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDSant)
                    .addComponent(SantanderISI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDeEfec)
                    .addComponent(EfectivoISI))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IDbaj)
                            .addComponent(BajasISI)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)))
                .addGap(0, 254, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Nom. Quincenal", jScrollPane2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 479, Short.MAX_VALUE)
        );

        jScrollPane3.setViewportView(jPanel2);

        jTabbedPane1.addTab("Nom. Semanal", jScrollPane3);

        jScrollPane1.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        if (CbxTDR.getSelectedIndex() == 0) {
            JOptionPane.showConfirmDialog(null, "Selecciona tipo de reporte");
        }
        if (CbxTDR.getSelectedIndex() == 1) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
            chooser.setSelectedFile(new File("Reporte de todas las quincenas de la zona " + cbxZona.getSelectedItem().toString()));
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
                        "jdbc:mysql://192.168.1.170:3306/confort",
                        "Servidor",
                        "Confort1022"
                );

                try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                    XSSFWorkbook libro = new XSSFWorkbook();
                    XSSFSheet spreadsheet = libro.createSheet(("Nominas Quincenales"));

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

//  int i = 2;
                    while (NSem.next()) {

                        cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                        cell.setCellStyle(Encabezado);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        0, //first row (0-based)
                                        0, //last row (0-based)
                                        0, //first column (0-based)
                                        5 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellValue(NSem.getString("MMM/YY"));

                        row = spreadsheet.createRow(1);
                        cell = row.createCell(2);
                        cell.setCellValue("Reporte General de Zona");
                        cell.setCellStyle(Encabezado);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        1, //first row (0-based)
                                        1, //last row (0-based)
                                        2, //first column (0-based)
                                        5 //last column (0-based)
                                )
                        );

                        row = spreadsheet.createRow(2);
                        cell = row.createCell(2);
                        cell.setCellValue("Zona Sur 1");
                        cell.setCellStyle(Encabezado);

                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        2, //first row (0-based)
                                        2, //last row (0-based)
                                        2, //first column (0-based)
                                        5 //last column (0-based)
                                )
                        );

                        row = spreadsheet.createRow(7);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        7, //first row (0-based)
                                        7, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("SERVICIO C/COBRO INTURBIDE");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(8);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        8, //first row (0-based)
                                        8, //last row (0-based)
                                        1, //first column (0-based)
                                        3 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("SERVICIO");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(4);
                        cell.setCellValue("INICIO");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue("TERMINO");
                        cell.setCellStyle(Contenido);
                        spreadsheet.setColumnWidth(6, 3000);
                        cell = row.createCell(6);
                        cell.setCellValue("# REPORTE");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("IMPORTE");
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(8);
                        cell.setCellValue("Total de servicios y pensiones");
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(9);
                        cell.setCellValue(NSem.getString("Total de servicios y pensiones"));
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(11);
                        cell.setCellValue("el entrega");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(12);
                        cell.setCellValue(NSem.getString("el entrega"));
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(3);
                        cell = row.createCell(6);
                        cell.setCellValue(NSem.getString("#Nsem"));
                        cell = row.createCell(8);
                        cell.setCellValue("Total restando gastos");
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(9);
                        cell.setCellValue(NSem.getString("Total restando gastos"));
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(11);
                        cell.setCellValue("Debe");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(12);
                        cell.setCellValue(NSem.getString("Debe"));
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(4);
                        cell = row.createCell(3);
                        cell.setCellValue("FECHA: ");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        4, //first row (0-based)
                                        4, //last row (0-based)
                                        4, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );

                        cell = row.createCell(4);
                        cell.setCellValue(NSem.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(8);
                        cell.setCellValue("Total restando gastos");
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(9);
                        cell.setCellValue(NSem.getString("Total restando gastos"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(11);

                        row = spreadsheet.createRow(5);
                        cell = row.createCell(3);
                        cell.setCellValue("HORA: ");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        5, //first row (0-based)
                                        5, //last row (0-based)
                                        4, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(4);
                        cell.setCellValue(NSem.getString("hora"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(8);
                        cell.setCellValue("Debe entregar");
                        cell.setCellStyle(Contenido);

                        cell = row.createCell(9);
                        cell.setCellValue(NSem.getString("Debe entregar"));
                        cell.setCellStyle(Contenido);

                        NSem.isClosed();
                    }
                    int i = 9;
                    while (scc.next()) {
                        row = spreadsheet.createRow(i);
                        spreadsheet.setColumnWidth(0, 3500);
                        cell = row.createCell(0);
                        cell.setCellValue(scc.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        i, //first row (0-based)
                                        i, //last row (0-based)
                                        1, //first column (0-based)
                                        3 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(scc.getString("Servicio"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(scc.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        i++;

                        row = spreadsheet.createRow(i);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(scc.getString("Total"));
                        cell.setCellStyle(Contenido);
                        scc.isClosed();
                        statementscc.isClosed();

                    }
                    int x = 22;

                    while (pen.next()) {
                        row = spreadsheet.createRow(20);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        20, //first row (0-based)
                                        20, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("PENSIONES");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(21);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        21, //first row (0-based)
                                        21, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("SERVICIO");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue("# de padron");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        21, //first row (0-based)
                                        21, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("IMPORTE");
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(pen.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(pen.getString("Servicio"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("# de padron");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(5);
                        cell.setCellValue(pen.getString("# de padron"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(pen.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        x++;

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(pen.getString("Total"));
                        cell.setCellStyle(Contenido);
                        pen.isClosed();

                    }
                    x = 35;

                    while (gast.next()) {
                        row = spreadsheet.createRow(33);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        33, //first row (0-based)
                                        33, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("GASTOS");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(34);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        34, //first row (0-based)
                                        34, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("Concepto");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue("Importe");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        34, //first row (0-based)
                                        34, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("# LISTA");
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(gast.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(gast.getString("Concepto"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue(gast.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(gast.getString("#Lista"));
                        cell.setCellStyle(Contenido);
                        x++;

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(gast.getString("Total"));
                        cell.setCellStyle(Contenido);
                        gast.isClosed();

                    }
                    x = 48;

                    while (val.next()) {
                        row = spreadsheet.createRow(46);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        46, //first row (0-based)
                                        46, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("VALES");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(47);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        47, //first row (0-based)
                                        47, //last row (0-based)
                                        1, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("Observaciones");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("Importe");
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(val.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(val.getString("Observaciones"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(val.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        x++;

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(val.getString("Total"));
                        cell.setCellStyle(Contenido);
                        pen.isClosed();

                    }

                    spreadsheet.getPrintSetup();
                    spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                    spreadsheet.getPrintSetup().setLandscape(false); // Dirección de impresión, true: horizontal, false: vertical
                    spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.49); // Margen (abajo)  
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
                    Logger.getLogger(Admin_RepNom_7.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Admin_RepNom_7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (CbxTDR.getSelectedIndex() == 2) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
            chooser.setSelectedFile(new File("Nomina de la " + cbxQuincena.getSelectedItem().toString() + " de la " + cbxZona.getSelectedItem().toString()));
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
                        "jdbc:mysql://192.168.1.170:3306/confort",
                        "Servidor",
                        "Confort1022"
                );

                try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                    XSSFWorkbook libro = new XSSFWorkbook();
                    XSSFSheet spreadsheet = libro.createSheet(("" + cbxQuincena.getSelectedItem().toString()));

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
                    if (IDBBVA.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIBBVA = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%BANCOMER%'");
                        int i = 3;
                        while (CIBBVA.next()) {

                            cell.setCellValue("Nomina de la " + cbxZona.getSelectedItem().toString());
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
                            cell.setCellValue("BANCOMER");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            0, //first column (0-based)
                                            5 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(1);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(2);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(3);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(4);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(5);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.createRow(2);
                            cell = row.createCell(0);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(1);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(2);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(3);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(4);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(5);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(6);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(7);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.createRow(i);
                            cell = row.createCell(0);
                            cell.setCellValue(CIBBVA.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(1);
                            cell.setCellValue(CIBBVA.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(2);
                            cell.setCellValue(CIBBVA.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(3);
                            cell.setCellValue(CIBBVA.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(4);
                            cell.setCellValue(CIBBVA.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(5);
                            cell.setCellValue(CIBBVA.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(6);
                            cell.setCellValue(CIBBVA.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(7);
                            cell.setCellValue(CIBBVA.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CIBBVA.isClosed();
                            CI.isClosed();
                        }
                    }
                    if (IDSant.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CISant = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%SANTANDER%'");
                        int i = 3;
                        while (CISant.next()) {

                            row = spreadsheet.createRow(1);
                            cell = row.createCell(0);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            8, //first column (0-based)
                                            13 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(1);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(2);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(3);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(4);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(5);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.createRow(2);
                            cell = row.createCell(0);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(1);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(2);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(3);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(4);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(5);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(6);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(7);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.createRow(i);
                            cell = row.createCell(0);
                            cell.setCellValue(CIBBVA.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(1);
                            cell.setCellValue(CIBBVA.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(2);
                            cell.setCellValue(CIBBVA.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(3);
                            cell.setCellValue(CIBBVA.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(4);
                            cell.setCellValue(CIBBVA.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(5);
                            cell.setCellValue(CIBBVA.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(6);
                            cell.setCellValue(CIBBVA.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(7);
                            cell.setCellValue(CIBBVA.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CIBBVA.isClosed();
                            CI.isClosed();
                        }
                    }
                    if (IDeEfec.isSelected() == true) {
                        Statement SI = connect.createStatement();
                        ResultSet SIfdp = SI.executeQuery("SELECT * FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%EFECTIVO%'");
                    }
                    if (IDbaj.isSelected() == true) {
                        Statement SI = connect.createStatement();
                        ResultSet SIfdp = SI.executeQuery("SELECT * FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BAJA%'");
                    }
                    if (BBVAISI.isSelected() == true) {
                        Statement SI = connect.createStatement();
                        ResultSet SIfdp = SI.executeQuery("SELECT * FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BANCOMER%'");
                    }
                    if (IDSant.isSelected() == true) {
                        Statement SI = connect.createStatement();
                        ResultSet SIfdp = SI.executeQuery("SELECT * FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%SANTANDER%'");
                    }
                    if (IDeEfec.isSelected() == true) {
                        Statement SI = connect.createStatement();
                        ResultSet SIfdp = SI.executeQuery("SELECT * FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%EFECTIVO%'");
                    }
                    if (IDbaj.isSelected() == true) {
                        Statement SI = connect.createStatement();
                        ResultSet SIfdp = SI.executeQuery("SELECT * FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BAJA%'");
                    }
//  int i = 2;

                    int i = 9;
                    while (scc.next()) {
                        row = spreadsheet.createRow(i);
                        spreadsheet.setColumnWidth(0, 3500);
                        cell = row.createCell(0);
                        cell.setCellValue(scc.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        i, //first row (0-based)
                                        i, //last row (0-based)
                                        1, //first column (0-based)
                                        3 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(scc.getString("Servicio"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(scc.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        i++;

                        row = spreadsheet.createRow(i);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(scc.getString("Total"));
                        cell.setCellStyle(Contenido);
                        scc.isClosed();
                        statementscc.isClosed();

                    }
                    int x = 22;

                    while (pen.next()) {
                        row = spreadsheet.createRow(20);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        20, //first row (0-based)
                                        20, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("PENSIONES");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(21);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        21, //first row (0-based)
                                        21, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("SERVICIO");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue("# de padron");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        21, //first row (0-based)
                                        21, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("IMPORTE");
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(pen.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(pen.getString("Servicio"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("# de padron");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(5);
                        cell.setCellValue(pen.getString("# de padron"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(pen.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        x++;

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(pen.getString("Total"));
                        cell.setCellStyle(Contenido);
                        pen.isClosed();

                    }
                    x = 35;

                    while (gast.next()) {
                        row = spreadsheet.createRow(33);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        33, //first row (0-based)
                                        33, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("GASTOS");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(34);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        34, //first row (0-based)
                                        34, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("Concepto");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue("Importe");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        34, //first row (0-based)
                                        34, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("# LISTA");
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(gast.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        4 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(gast.getString("Concepto"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellValue(gast.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        5, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(gast.getString("#Lista"));
                        cell.setCellStyle(Contenido);
                        x++;

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(gast.getString("Total"));
                        cell.setCellStyle(Contenido);
                        gast.isClosed();

                    }
                    x = 48;

                    while (val.next()) {
                        row = spreadsheet.createRow(46);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        46, //first row (0-based)
                                        46, //last row (0-based)
                                        0, //first column (0-based)
                                        7 //last column (0-based)
                                )
                        );
                        cell = row.createCell(0);
                        cell.setCellValue("VALES");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(1);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(47);
                        cell = row.createCell(0);
                        cell.setCellValue("FECHA");
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        47, //first row (0-based)
                                        47, //last row (0-based)
                                        1, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue("Observaciones");
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue("Importe");
                        cell.setCellStyle(Contenido);

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(val.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        6 //last column (0-based)
                                )
                        );
                        cell = row.createCell(1);
                        cell.setCellValue(val.getString("Observaciones"));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(2);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(3);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(4);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(val.getString("Importe"));
                        cell.setCellStyle(Contenido);
                        x++;

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell.setCellValue("TOTAL: ");
                        cell = row.createCell(7);
                        cell.setCellValue(val.getString("Total"));
                        cell.setCellStyle(Contenido);
                        pen.isClosed();

                    }

                    spreadsheet.getPrintSetup();
                    spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                    spreadsheet.getPrintSetup().setLandscape(false); // Dirección de impresión, true: horizontal, false: vertical
                    spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.49); // Margen (abajo)  
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
                    Logger.getLogger(Admin_RepNom_7.class.getName()).log(Level.SEVERE, null, ex);
                }

            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(Admin_RepNom_7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_jLabel5MousePressed

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
            java.util.logging.Logger.getLogger(Admin_RepNom_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_RepNom_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_RepNom_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_RepNom_7.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_RepNom_7().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox BBVAISI;
    private javax.swing.JCheckBox BajasISI;
    private javax.swing.JComboBox<String> CbxTDR;
    private javax.swing.JCheckBox EfectivoISI;
    private javax.swing.JCheckBox IDBBVA;
    private javax.swing.JCheckBox IDSant;
    private javax.swing.JCheckBox IDbaj;
    private javax.swing.JCheckBox IDeEfec;
    private javax.swing.JCheckBox SantanderISI;
    private javax.swing.JComboBox<String> cbxQuincena;
    private javax.swing.JComboBox<String> cbxZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
