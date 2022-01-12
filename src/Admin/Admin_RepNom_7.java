package Admin;

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

    int xMouse, yMouse;

    public Admin_RepNom_7() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CbxTDR = new javax.swing.JComboBox<>();
        cbxQuincena = new javax.swing.JComboBox<>();
        cbxZona = new javax.swing.JComboBox<>();
        BBVAISI = new javax.swing.JCheckBox();
        IDBBVA = new javax.swing.JCheckBox();
        IDSant = new javax.swing.JCheckBox();
        IDeEfec = new javax.swing.JCheckBox();
        IDbaj = new javax.swing.JCheckBox();
        SantanderISI = new javax.swing.JCheckBox();
        EfectivoISI = new javax.swing.JCheckBox();
        BajasISI = new javax.swing.JCheckBox();
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

        jLabel2.setText("Quincena:");

        jLabel4.setText("Zona:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        CbxTDR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Completo", "Quincenal" }));

        cbxQuincena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));

        cbxZona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        BBVAISI.setText("Incluir sin imss");

        IDBBVA.setText("Incluir depositos BBVA");

        IDSant.setText("Incluir depositos Santander");

        IDeEfec.setText("Incluir depositos en efectivo");

        IDbaj.setText("Incluir bajas");

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
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(SantanderISI)
                                    .addComponent(BBVAISI)
                                    .addComponent(EfectivoISI))))))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
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
                .addContainerGap(87, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Nom. Quincenal", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 48, 620, 350));

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
        Move.setText("Reportes Nomina.");
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

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        if (CbxTDR.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona tipo de reporte");
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
                    XSSFSheet spreadsheet = libro.createSheet(("Nominas de " + cbxZona.getSelectedItem().toString()));

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
                    cell.setCellValue("Nomina de la Zona " + cbxZona.getSelectedItem().toString());
                    cell.setCellStyle(Encabezado);

                    spreadsheet.createRow(1);
                    spreadsheet.createRow(2);
                    spreadsheet.createRow(2);
                    spreadsheet.createRow(3);
                    spreadsheet.createRow(4);
                    spreadsheet.createRow(5);
                    spreadsheet.createRow(6);
                    spreadsheet.createRow(7);
                    spreadsheet.createRow(8);
                    spreadsheet.createRow(9);
                    spreadsheet.createRow(10);
                    spreadsheet.createRow(11);
                    spreadsheet.createRow(12);
                    spreadsheet.createRow(13);
                    spreadsheet.createRow(14);
                    spreadsheet.createRow(15);
                    spreadsheet.createRow(16);
                    spreadsheet.createRow(17);
                    spreadsheet.createRow(18);
                    spreadsheet.createRow(19);
                    spreadsheet.createRow(20);
                    spreadsheet.createRow(21);
                    spreadsheet.createRow(22);
                    spreadsheet.createRow(23);
                    spreadsheet.createRow(24);
                    spreadsheet.createRow(25);
                    spreadsheet.createRow(26);
                    spreadsheet.createRow(27);
                    spreadsheet.createRow(28);
                    spreadsheet.createRow(29);
                    spreadsheet.createRow(30);
                    spreadsheet.createRow(31);
                    spreadsheet.createRow(32);
                    spreadsheet.createRow(33);
                    spreadsheet.createRow(34);
                    spreadsheet.createRow(35);
                    spreadsheet.createRow(36);
                    spreadsheet.createRow(37);
                    spreadsheet.createRow(38);
                    spreadsheet.createRow(39);
                    spreadsheet.createRow(40);
                    spreadsheet.createRow(41);
                    spreadsheet.createRow(42);
                    spreadsheet.createRow(43);
                    spreadsheet.createRow(44);
                    spreadsheet.createRow(45);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    0, //first row (0-based)
                                    0, //last row (0-based)
                                    0, //first column (0-based)
                                    5 //last column (0-based)
                            )
                    );
                    //lista
                    spreadsheet.setColumnWidth(0, 2400);
                    spreadsheet.setColumnWidth(9, 2400);
                    spreadsheet.setColumnWidth(19, 2400);
                    spreadsheet.setColumnWidth(28, 2400);
                    //names
                    spreadsheet.setColumnWidth(1, 4800);
                    spreadsheet.setColumnWidth(10, 4800);
                    spreadsheet.setColumnWidth(20, 4800);
                    spreadsheet.setColumnWidth(29, 4800);

                    //AP
                    spreadsheet.setColumnWidth(2, 2800);
                    spreadsheet.setColumnWidth(11, 2800);
                    spreadsheet.setColumnWidth(21, 2800);
                    spreadsheet.setColumnWidth(30, 2800);
                    //AM
                    spreadsheet.setColumnWidth(3, 3200);
                    spreadsheet.setColumnWidth(12, 3200);
                    spreadsheet.setColumnWidth(22, 3200);
                    spreadsheet.setColumnWidth(31, 3200);
                    //BAN
                    spreadsheet.setColumnWidth(4, 3200);
                    spreadsheet.setColumnWidth(13, 3200);
                    spreadsheet.setColumnWidth(23, 3200);
                    spreadsheet.setColumnWidth(32, 3200);
                    //CTA
                    spreadsheet.setColumnWidth(5, 4000);
                    spreadsheet.setColumnWidth(14, 4000);
                    spreadsheet.setColumnWidth(24, 4000);
                    spreadsheet.setColumnWidth(33, 4000);

                    if (IDBBVA.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIBBVA = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%BANCOMER%'");
                        int i = 3;
                        while (CIBBVA.next()) {

                            row = spreadsheet.getRow(1);
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

                            row = spreadsheet.getRow(2);
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

                            row = spreadsheet.getRow(i);
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
                            CIBBVA.isClosed();
                            CI.isClosed();
                            i++;

                        }
                        if (BBVAISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BANCOMER%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
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

                                row = spreadsheet.getRow(2);
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

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(0);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(1);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(2);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(3);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(4);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(5);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(6);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(7);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
                    }

                    if (IDSant.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CISant = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%SANTANDER%'");

                        int i = 3;
                        while (CISant.next()) {

                            row = spreadsheet.getRow(1);
                            cell = row.createCell(9);
                            cell.setCellValue("SANTANDER");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            9, //first column (0-based)
                                            14 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(10);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(11);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(12);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(13);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(14);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.getRow(2);
                            cell = row.createCell(9);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(10);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(11);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(12);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(13);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(14);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(15);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(16);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.getRow(i);
                            cell = row.createCell(9);
                            cell.setCellValue(CISant.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(10);
                            cell.setCellValue(CISant.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(11);
                            cell.setCellValue(CISant.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(12);
                            cell.setCellValue(CISant.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(13);
                            cell.setCellValue(CISant.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(14);
                            cell.setCellValue(CISant.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(15);
                            cell.setCellValue(CISant.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(16);
                            cell.setCellValue(CISant.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CISant.isClosed();
                            CI.isClosed();
                        }
                        if (SantanderISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%SANTANDER%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
                                cell = row.createCell(9);
                                cell.setCellValue("SANTANDER");
                                cell.setCellStyle(Encabezado);
                                spreadsheet.addMergedRegion(
                                        new CellRangeAddress(
                                                1, //first row (0-based)
                                                1, //last row (0-based)
                                                9, //first column (0-based)
                                                14 //last column (0-based)
                                        )
                                );
                                cell = row.createCell(10);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(11);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(12);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(13);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(14);
                                cell.setCellStyle(Encabezado);

                                row = spreadsheet.getRow(2);
                                cell = row.createCell(9);
                                cell.setCellValue("# Lista");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(10);
                                cell.setCellValue("Nombre(s)");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(11);
                                cell.setCellValue("Apellido P");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(12);
                                cell.setCellValue("Apellido M");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(13);
                                cell.setCellValue("Banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(14);
                                cell.setCellValue("Cuenta de banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(15);
                                cell.setCellValue("Sueldo");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(16);
                                cell.setCellValue("Deposito");
                                cell.setCellStyle(Contenido);

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(9);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(10);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(11);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(12);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(13);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(14);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(15);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(16);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
                    }
                    if (IDeEfec.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIEfec = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%EFECTIVO%'");

                        int i = 3;
                        while (CIEfec.next()) {

                            row = spreadsheet.getRow(1);
                            cell = row.createCell(19);
                            cell.setCellValue("EFECTIVO");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            19, //first column (0-based)
                                            24 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(20);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(21);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(22);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(23);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(24);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.getRow(2);
                            cell = row.createCell(19);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(20);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(21);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(22);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(23);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(24);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(25);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(26);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.getRow(i);
                            cell = row.createCell(19);
                            cell.setCellValue(CIEfec.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(20);
                            cell.setCellValue(CIEfec.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(21);
                            cell.setCellValue(CIEfec.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(22);
                            cell.setCellValue(CIEfec.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(23);
                            cell.setCellValue(CIEfec.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(24);
                            cell.setCellValue(CIEfec.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(25);
                            cell.setCellValue(CIEfec.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(26);
                            cell.setCellValue(CIEfec.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CIEfec.isClosed();
                            CI.isClosed();
                        }
                        if (SantanderISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%EFECTIVO%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
                                cell = row.createCell(19);
                                cell.setCellValue("EFECTIVO");
                                cell.setCellStyle(Encabezado);
                                spreadsheet.addMergedRegion(
                                        new CellRangeAddress(
                                                1, //first row (0-based)
                                                1, //last row (0-based)
                                                19, //first column (0-based)
                                                24 //last column (0-based)
                                        )
                                );
                                cell = row.createCell(20);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(21);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(22);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(23);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(24);
                                cell.setCellStyle(Encabezado);

                                row = spreadsheet.getRow(2);
                                cell = row.createCell(19);
                                cell.setCellValue("# Lista");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(20);
                                cell.setCellValue("Nombre(s)");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(21);
                                cell.setCellValue("Apellido P");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(22);
                                cell.setCellValue("Apellido M");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(23);
                                cell.setCellValue("Banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(24);
                                cell.setCellValue("Cuenta de banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(25);
                                cell.setCellValue("Sueldo");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(26);
                                cell.setCellValue("Deposito");
                                cell.setCellStyle(Contenido);

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(19);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(20);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(21);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(22);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(23);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(24);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(25);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(26);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
                    }
                    if (IDbaj.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIBajas = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%BAJA%'");

                        int i = 3;
                        while (CIBajas.next()) {

                            row = spreadsheet.getRow(1);
                            cell = row.createCell(28);
                            cell.setCellValue("BAJAS");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            28, //first column (0-based)
                                            33 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(29);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(30);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(31);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(32);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(33);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.getRow(2);
                            cell = row.createCell(28);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(29);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(30);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(31);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(32);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(33);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(34);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(35);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.getRow(i);
                            cell = row.createCell(28);
                            cell.setCellValue(CIBajas.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(29);
                            cell.setCellValue(CIBajas.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(30);
                            cell.setCellValue(CIBajas.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(31);
                            cell.setCellValue(CIBajas.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(32);
                            cell.setCellValue(CIBajas.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(33);
                            cell.setCellValue(CIBajas.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(34);
                            cell.setCellValue(CIBajas.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(35);
                            cell.setCellValue(CIBajas.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CIBajas.isClosed();
                            CI.isClosed();
                        }
                        if (SantanderISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BAJA%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
                                cell = row.createCell(28);
                                cell.setCellValue("BAJAS");
                                cell.setCellStyle(Encabezado);
                                spreadsheet.addMergedRegion(
                                        new CellRangeAddress(
                                                1, //first row (0-based)
                                                1, //last row (0-based)
                                                28, //first column (0-based)
                                                33 //last column (0-based)
                                        )
                                );
                                cell = row.createCell(29);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(30);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(31);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(32);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(33);
                                cell.setCellStyle(Encabezado);

                                row = spreadsheet.getRow(2);
                                cell = row.createCell(28);
                                cell.setCellValue("# Lista");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(29);
                                cell.setCellValue("Nombre(s)");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(30);
                                cell.setCellValue("Apellido P");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(31);
                                cell.setCellValue("Apellido M");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(32);
                                cell.setCellValue("Banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(33);
                                cell.setCellValue("Cuenta de banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(34);
                                cell.setCellValue("Sueldo");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(35);
                                cell.setCellValue("Deposito");
                                cell.setCellStyle(Contenido);

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(28);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(29);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(30);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(31);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(32);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(33);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(34);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(35);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
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
            chooser.setSelectedFile(new File("Nomina de la " + cbxQuincena.getSelectedItem().toString() + " de la Zona " + cbxZona.getSelectedItem().toString()));
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
                    cell.setCellValue("Nomina de la Zona " + cbxZona.getSelectedItem().toString());
                    cell.setCellStyle(Encabezado);

                    spreadsheet.createRow(1);
                    spreadsheet.createRow(2);
                    spreadsheet.createRow(2);
                    spreadsheet.createRow(3);
                    spreadsheet.createRow(4);
                    spreadsheet.createRow(5);
                    spreadsheet.createRow(6);
                    spreadsheet.createRow(7);
                    spreadsheet.createRow(8);
                    spreadsheet.createRow(9);
                    spreadsheet.createRow(10);
                    spreadsheet.createRow(11);
                    spreadsheet.createRow(12);
                    spreadsheet.createRow(13);
                    spreadsheet.createRow(14);
                    spreadsheet.createRow(15);
                    spreadsheet.createRow(16);
                    spreadsheet.createRow(17);
                    spreadsheet.createRow(18);
                    spreadsheet.createRow(19);
                    spreadsheet.createRow(20);
                    spreadsheet.createRow(21);
                    spreadsheet.createRow(22);
                    spreadsheet.createRow(23);
                    spreadsheet.createRow(24);
                    spreadsheet.createRow(25);
                    spreadsheet.createRow(26);
                    spreadsheet.createRow(27);
                    spreadsheet.createRow(28);
                    spreadsheet.createRow(29);
                    spreadsheet.createRow(30);
                    spreadsheet.createRow(31);
                    spreadsheet.createRow(32);
                    spreadsheet.createRow(33);
                    spreadsheet.createRow(34);
                    spreadsheet.createRow(35);
                    spreadsheet.createRow(36);
                    spreadsheet.createRow(37);
                    spreadsheet.createRow(38);
                    spreadsheet.createRow(39);
                    spreadsheet.createRow(40);
                    spreadsheet.createRow(41);
                    spreadsheet.createRow(42);
                    spreadsheet.createRow(43);
                    spreadsheet.createRow(44);
                    spreadsheet.createRow(45);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    0, //first row (0-based)
                                    0, //last row (0-based)
                                    0, //first column (0-based)
                                    5 //last column (0-based)
                            )
                    );
                    //lista
                    spreadsheet.setColumnWidth(0, 2400);
                    spreadsheet.setColumnWidth(9, 2400);
                    spreadsheet.setColumnWidth(19, 2400);
                    spreadsheet.setColumnWidth(28, 2400);
                    //names
                    spreadsheet.setColumnWidth(1, 4800);
                    spreadsheet.setColumnWidth(10, 4800);
                    spreadsheet.setColumnWidth(20, 4800);
                    spreadsheet.setColumnWidth(29, 4800);

                    //AP
                    spreadsheet.setColumnWidth(2, 2800);
                    spreadsheet.setColumnWidth(11, 2800);
                    spreadsheet.setColumnWidth(21, 2800);
                    spreadsheet.setColumnWidth(30, 2800);
                    //AM
                    spreadsheet.setColumnWidth(3, 3200);
                    spreadsheet.setColumnWidth(12, 3200);
                    spreadsheet.setColumnWidth(22, 3200);
                    spreadsheet.setColumnWidth(31, 3200);
                    //BAN
                    spreadsheet.setColumnWidth(4, 3200);
                    spreadsheet.setColumnWidth(13, 3200);
                    spreadsheet.setColumnWidth(23, 3200);
                    spreadsheet.setColumnWidth(32, 3200);
                    //CTA
                    spreadsheet.setColumnWidth(5, 4000);
                    spreadsheet.setColumnWidth(14, 4000);
                    spreadsheet.setColumnWidth(24, 4000);
                    spreadsheet.setColumnWidth(33, 4000);

                    if (IDBBVA.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIBBVA = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%BANCOMER%'"
                                + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                        int i = 3;
                        while (CIBBVA.next()) {

                            row = spreadsheet.getRow(1);
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

                            row = spreadsheet.getRow(2);
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

                            row = spreadsheet.getRow(i);
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
                            CIBBVA.isClosed();
                            CI.isClosed();
                            i++;

                        }
                        if (BBVAISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BANCOMER%' AND "
                                    + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
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

                                row = spreadsheet.getRow(2);
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

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(0);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(1);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(2);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(3);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(4);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(5);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(6);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(7);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
                    }

                    if (IDSant.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CISant = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%SANTANDER%'"
                                + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");

                        int i = 3;
                        while (CISant.next()) {

                            row = spreadsheet.getRow(1);
                            cell = row.createCell(9);
                            cell.setCellValue("SANTANDER");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            9, //first column (0-based)
                                            14 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(10);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(11);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(12);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(13);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(14);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.getRow(2);
                            cell = row.createCell(9);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(10);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(11);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(12);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(13);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(14);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(15);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(16);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.getRow(i);
                            cell = row.createCell(9);
                            cell.setCellValue(CISant.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(10);
                            cell.setCellValue(CISant.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(11);
                            cell.setCellValue(CISant.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(12);
                            cell.setCellValue(CISant.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(13);
                            cell.setCellValue(CISant.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(14);
                            cell.setCellValue(CISant.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(15);
                            cell.setCellValue(CISant.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(16);
                            cell.setCellValue(CISant.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CISant.isClosed();
                            CI.isClosed();
                        }
                        if (SantanderISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%SANTANDER%' AND "
                                    + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
                                cell = row.createCell(9);
                                cell.setCellValue("SANTANDER");
                                cell.setCellStyle(Encabezado);
                                spreadsheet.addMergedRegion(
                                        new CellRangeAddress(
                                                1, //first row (0-based)
                                                1, //last row (0-based)
                                                9, //first column (0-based)
                                                14 //last column (0-based)
                                        )
                                );
                                cell = row.createCell(10);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(11);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(12);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(13);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(14);
                                cell.setCellStyle(Encabezado);

                                row = spreadsheet.getRow(2);
                                cell = row.createCell(9);
                                cell.setCellValue("# Lista");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(10);
                                cell.setCellValue("Nombre(s)");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(11);
                                cell.setCellValue("Apellido P");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(12);
                                cell.setCellValue("Apellido M");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(13);
                                cell.setCellValue("Banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(14);
                                cell.setCellValue("Cuenta de banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(15);
                                cell.setCellValue("Sueldo");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(16);
                                cell.setCellValue("Deposito");
                                cell.setCellStyle(Contenido);

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(9);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(10);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(11);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(12);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(13);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(14);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(15);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(16);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
                    }
                    if (IDeEfec.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIEfec = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%EFECTIVO%'"
                                + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");

                        int i = 3;
                        while (CIEfec.next()) {

                            row = spreadsheet.getRow(1);
                            cell = row.createCell(19);
                            cell.setCellValue("EFECTIVO");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            19, //first column (0-based)
                                            24 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(20);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(21);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(22);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(23);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(24);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.getRow(2);
                            cell = row.createCell(19);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(20);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(21);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(22);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(23);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(24);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(25);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(26);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.getRow(i);
                            cell = row.createCell(19);
                            cell.setCellValue(CIEfec.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(20);
                            cell.setCellValue(CIEfec.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(21);
                            cell.setCellValue(CIEfec.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(22);
                            cell.setCellValue(CIEfec.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(23);
                            cell.setCellValue(CIEfec.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(24);
                            cell.setCellValue(CIEfec.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(25);
                            cell.setCellValue(CIEfec.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(26);
                            cell.setCellValue(CIEfec.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CIEfec.isClosed();
                            CI.isClosed();
                        }
                        if (SantanderISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%EFECTIVO%' AND "
                                    + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
                                cell = row.createCell(19);
                                cell.setCellValue("EFECTIVO");
                                cell.setCellStyle(Encabezado);
                                spreadsheet.addMergedRegion(
                                        new CellRangeAddress(
                                                1, //first row (0-based)
                                                1, //last row (0-based)
                                                19, //first column (0-based)
                                                24 //last column (0-based)
                                        )
                                );
                                cell = row.createCell(20);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(21);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(22);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(23);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(24);
                                cell.setCellStyle(Encabezado);

                                row = spreadsheet.getRow(2);
                                cell = row.createCell(19);
                                cell.setCellValue("# Lista");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(20);
                                cell.setCellValue("Nombre(s)");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(21);
                                cell.setCellValue("Apellido P");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(22);
                                cell.setCellValue("Apellido M");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(23);
                                cell.setCellValue("Banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(24);
                                cell.setCellValue("Cuenta de banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(25);
                                cell.setCellValue("Sueldo");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(26);
                                cell.setCellValue("Deposito");
                                cell.setCellStyle(Contenido);

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(19);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(20);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(21);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(22);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(23);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(24);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(25);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(26);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
                    }
                    if (IDbaj.isSelected() == true) {
                        Statement CI = connect.createStatement();
                        ResultSet CIBajas = CI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, `Banco`,"
                                + " `Cuenta de banco`, `Sueldo`, `Deposito`"
                                + " FROM `nomina.detallada." + cbxZona.getSelectedItem().toString() + "` WHERE `Banco` LIKE '%BAJA%'"
                                + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");

                        int i = 3;
                        while (CIBajas.next()) {

                            row = spreadsheet.getRow(1);
                            cell = row.createCell(28);
                            cell.setCellValue("BAJAS");
                            cell.setCellStyle(Encabezado);
                            spreadsheet.addMergedRegion(
                                    new CellRangeAddress(
                                            1, //first row (0-based)
                                            1, //last row (0-based)
                                            28, //first column (0-based)
                                            33 //last column (0-based)
                                    )
                            );
                            cell = row.createCell(29);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(30);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(31);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(32);
                            cell.setCellStyle(Encabezado);
                            cell = row.createCell(33);
                            cell.setCellStyle(Encabezado);

                            row = spreadsheet.getRow(2);
                            cell = row.createCell(28);
                            cell.setCellValue("# Lista");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(29);
                            cell.setCellValue("Nombre(s)");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(30);
                            cell.setCellValue("Apellido P");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(31);
                            cell.setCellValue("Apellido M");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(32);
                            cell.setCellValue("Banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(33);
                            cell.setCellValue("Cuenta de banco");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(34);
                            cell.setCellValue("Sueldo");
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(35);
                            cell.setCellValue("Deposito");
                            cell.setCellStyle(Contenido);

                            row = spreadsheet.getRow(i);
                            cell = row.createCell(28);
                            cell.setCellValue(CIBajas.getString("#lista"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(29);
                            cell.setCellValue(CIBajas.getString("Nombre(s)"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(30);
                            cell.setCellValue(CIBajas.getString("Apellido P"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(31);
                            cell.setCellValue(CIBajas.getString("Apellido M"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(32);
                            cell.setCellValue(CIBajas.getString("Banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(33);
                            cell.setCellValue(CIBajas.getString("Cuenta de banco"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(34);
                            cell.setCellValue(CIBajas.getString("Sueldo"));
                            cell.setCellStyle(Contenido);
                            cell = row.createCell(35);
                            cell.setCellValue(CIBajas.getString("Deposito"));
                            cell.setCellStyle(Contenido);
                            i++;
                            CIBajas.isClosed();
                            CI.isClosed();
                        }
                        if (SantanderISI.isSelected() == true) {
                            Statement SI = connect.createStatement();
                            ResultSet SIfdp = SI.executeQuery("SELECT `#lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                                    + " `Banco`, `Cuenta de banco`, `Sueldo`, `Deposito` FROM "
                                    + "`nomina.detallada." + cbxZona.getSelectedItem().toString() + ".simss` WHERE `Banco` LIKE '%BAJA%' AND "
                                    + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                            while (SIfdp.next()) {
                                row = spreadsheet.getRow(1);
                                cell = row.createCell(28);
                                cell.setCellValue("BAJAS");
                                cell.setCellStyle(Encabezado);
                                spreadsheet.addMergedRegion(
                                        new CellRangeAddress(
                                                1, //first row (0-based)
                                                1, //last row (0-based)
                                                28, //first column (0-based)
                                                33 //last column (0-based)
                                        )
                                );
                                cell = row.createCell(29);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(30);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(31);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(32);
                                cell.setCellStyle(Encabezado);
                                cell = row.createCell(33);
                                cell.setCellStyle(Encabezado);

                                row = spreadsheet.getRow(2);
                                cell = row.createCell(28);
                                cell.setCellValue("# Lista");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(29);
                                cell.setCellValue("Nombre(s)");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(30);
                                cell.setCellValue("Apellido P");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(31);
                                cell.setCellValue("Apellido M");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(32);
                                cell.setCellValue("Banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(33);
                                cell.setCellValue("Cuenta de banco");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(34);
                                cell.setCellValue("Sueldo");
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(35);
                                cell.setCellValue("Deposito");
                                cell.setCellStyle(Contenido);

                                row = spreadsheet.getRow(i);
                                cell = row.createCell(28);
                                cell.setCellValue(SIfdp.getString("#lista"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(29);
                                cell.setCellValue(SIfdp.getString("Nombre(s)"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(30);
                                cell.setCellValue(SIfdp.getString("Apellido P"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(31);
                                cell.setCellValue(SIfdp.getString("Apellido M"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(32);
                                cell.setCellValue(SIfdp.getString("Banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(33);
                                cell.setCellValue(SIfdp.getString("Cuenta de banco"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(34);
                                cell.setCellValue(SIfdp.getString("Sueldo"));
                                cell.setCellStyle(Contenido);
                                cell = row.createCell(35);
                                cell.setCellValue(SIfdp.getString("Deposito"));
                                cell.setCellStyle(Contenido);
                                SIfdp.isClosed();
                                SI.isClosed();
                                i++;
                            }
                        }
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

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

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
    private javax.swing.JPanel Harder1;
    private javax.swing.JCheckBox IDBBVA;
    private javax.swing.JCheckBox IDSant;
    private javax.swing.JCheckBox IDbaj;
    private javax.swing.JCheckBox IDeEfec;
    private javax.swing.JLabel Move;
    private javax.swing.JCheckBox SantanderISI;
    private javax.swing.JPanel btnexit;
    private javax.swing.JComboBox<String> cbxQuincena;
    private javax.swing.JComboBox<String> cbxZona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtbtnexit;
    // End of variables declaration//GEN-END:variables
}
