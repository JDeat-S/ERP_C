package Logicas;

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
public class Logica_bd_NomCDA {

    public void BDRH() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Reporte de Caja"));
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
            ResultSet resultSetRH = RHstatement.executeQuery("SELECT * FROM `nomina.cajadeahorro`");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Datos CDA");

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
                cell.setCellValue("Consecutivo Caja de ahorro");
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
                cell.setCellValue("# Caja");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("# Empleado");
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
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Servicios");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Ahorro Por quincena");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Quincenas ahorradas");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Total ahorrado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("caja anticipada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Total a pagar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("% interes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Interes a pagar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("por final a pagar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Status");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Observacion 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                int i = 2;

                while (resultSetRH.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSetRH.getInt("#caja"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSetRH.getString("#exp_Empleado"));
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
                    cell.setCellValue(resultSetRH.getString("Zona"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(resultSetRH.getString("Servicio"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(resultSetRH.getString("Ahorro por quincena"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(resultSetRH.getString("Quincenas Ahorradas"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(resultSetRH.getString("Total Ahorrado"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(resultSetRH.getString("caja anticipada"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(resultSetRH.getString("total a pagar"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(resultSetRH.getString("% interes"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(resultSetRH.getString("interes a pagar"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(resultSetRH.getString("Por final pagar"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(resultSetRH.getString("Status"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(16);
                    cell.setCellValue(resultSetRH.getString(17));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(resultSetRH.getString(18));
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
                Logger.getLogger(Logica_bd_NomCDA.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica_bd_NomCDA.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
