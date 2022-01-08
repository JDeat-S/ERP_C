package Pruebas;

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
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.PaperSize;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pruebas {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Semanal"));
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

            Statement statementscc = connect.createStatement();
            Statement statementpen = connect.createStatement();
            Statement statementgast = connect.createStatement();
            Statement statementval = connect.createStatement();
            Statement statementNsem = connect.createStatement();
            ResultSet scc = statementscc.executeQuery("SELECT * FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = 4");
            ResultSet pen = statementpen.executeQuery("SELECT * FROM `rh.semanal.inturbide.pen` WHERE `Semanal` = 4");
            ResultSet gast = statementgast.executeQuery("SELECT * FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = 4");
            ResultSet val = statementval.executeQuery("SELECT * FROM `rh.semanal.inturbide.val` WHERE `Semanal` = 4");
            ResultSet NSem = statementNsem.executeQuery("SELECT * FROM `rh.semanal.inturbide.nsem` WHERE `#Nsem` = 4");

            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet(("Semanal"));

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
                    cell.setCellValue("SERVICIO C/COBRO PUENTE TITLA");
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
                    cell = row.createCell(6);
                    cell.setCellValue("# REPORTE");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue("# IMPORTE");
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(3);
                    cell = row.createCell(6);
                    cell.setCellValue(NSem.getString("#Nsem"));

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
                    NSem.isClosed();
                }
                int i = 9;
                while (scc.next()) {
                    row = spreadsheet.createRow(i);
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

                    
                    int x=i+i-9;
                    
                    while (pen.next()) {
                         
                         

                        row = spreadsheet.createRow(x);
                        cell = row.createCell(0);
                        cell.setCellValue(pen.getString("Fecha"));
                        cell.setCellStyle(Contenido);
                        spreadsheet.addMergedRegion(
                                new CellRangeAddress(
                                        x, //first row (0-based)
                                        x, //last row (0-based)
                                        1, //first column (0-based)
                                        3 //last column (0-based)
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
                        cell = row.createCell(5);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(6);
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(7);
                        cell.setCellValue(pen.getString("# de padron"));
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
                }

                spreadsheet.getPrintSetup();
                spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                spreadsheet.getPrintSetup().setLandscape(true); // Dirección de impresión, true: horizontal, false: vertical
                spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.49); // Margen (abajo)  
                spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.1); // Margen (arriba)
                spreadsheet.setMargin(HSSFSheet.FooterMargin, (double) 0.1);
                spreadsheet.setMargin(HSSFSheet.HeaderMargin, (double) 0.1);

                spreadsheet.setHorizontallyCenter(true); // Establecer la página impresa para que se centre horizontalmente
                libro.write(archivo);
            }
            Desktop.getDesktop().open(archivoXLS);
        } catch (IOException | NumberFormatException e) {

            try {
                throw e;
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
