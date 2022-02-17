package Logicas.BDSemIturbide;

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

/**
 *
 * @author JDeat
 */
public class Logica_Sempen {
    
    public void Gastosgen() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Pensiones Inturbide"));
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
            ResultSet RSSem = RHstatement.executeQuery("SELECT * FROM `rh.semanal.inturbide.pen`");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Gastos semanales");
                
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
                cell.setCellValue("Pensiones iturbide");
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
                cell.setCellValue("# Registro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("# Semanal");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("Fecha");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("# Padron");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Importe");
                cell.setCellStyle(Contenido);


                
                int i = 2;
                
                while (RSSem.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(RSSem.getInt(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(RSSem.getInt(2));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(RSSem.getString(3));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(RSSem.getString(4));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(RSSem.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(RSSem.getDouble(6));
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
                Logger.getLogger(Logica_Sempen.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica_Sempen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
