package Pensiones.Logicas;

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
public class LogicaPenptetitla {

    public void Pensiones() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Reporte de Pensiones "));
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
            ResultSet rs = RHstatement.executeQuery("SELECT * FROM `pensiones.puente titla`");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Pensiones ");

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
                cell.setCellValue("Pensiones ");
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
                cell.setCellValue("Apellido P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("Apellido M");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Nombre(s)");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Direccion");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Mail");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Placas 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Marca 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Modelo 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Color 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Año 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Importe 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Recargo 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("IVA 1");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Placas 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Marca 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Modelo 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Color 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Año 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Importe 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Recargo 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("IVA 2");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Placas 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("Marca 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
                cell.setCellValue("Modelo 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(25);
                cell.setCellValue("Color 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(26);
                cell.setCellValue("Año 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(27);
                cell.setCellValue("Importe 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(28);
                cell.setCellValue("Recargo 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(29);
                cell.setCellValue("IVA 3");
                cell.setCellStyle(Contenido);
                cell = row.createCell(30);
                cell.setCellValue("Tel Casa");
                cell.setCellStyle(Contenido);
                cell = row.createCell(31);
                cell.setCellValue("Tel Oficina");
                cell.setCellStyle(Contenido);
                cell = row.createCell(32);
                cell.setCellValue("Celular");
                cell.setCellStyle(Contenido);
                cell = row.createCell(33);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(34);
                cell.setCellValue("Clase de auto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(35);
                cell.setCellValue("Tipo de pension");
                cell.setCellStyle(Contenido);
                cell = row.createCell(36);
                cell.setCellValue("Status");
                cell.setCellStyle(Contenido);
                cell = row.createCell(37);
                cell.setCellValue("Mes de registro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(38);
                cell.setCellValue("Razon Social");
                cell.setCellStyle(Contenido);
                cell = row.createCell(39);
                cell.setCellValue("# Padron");
                cell.setCellStyle(Contenido);
                cell = row.createCell(40);
                cell.setCellValue("Dia inicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(41);
                cell.setCellValue("Mes inicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(42);
                cell.setCellValue("Dia Fin");
                cell.setCellStyle(Contenido);
                cell = row.createCell(43);
                cell.setCellValue("Mes Fin");
                cell.setCellStyle(Contenido);
                cell = row.createCell(44);
                cell.setCellValue("Total a pagar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(45);
                cell.setCellValue("Total pagado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(46);
                cell.setCellValue("Faltante");
                cell.setCellStyle(Contenido);
                cell = row.createCell(47);
                cell.setCellValue("Fecha de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(48);
                cell.setCellValue("Metodo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(49);
                cell.setCellValue("Metodo");
                cell.setCellStyle(Contenido);

                int i = 2;

                while (rs.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(rs.getInt(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(rs.getString(2));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(rs.getString(3));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(rs.getString(4));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(rs.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(rs.getString(6));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(rs.getString(7));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(rs.getString(8));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(rs.getString(9));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(rs.getString(10));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(rs.getString(11));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(rs.getDouble(12));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(rs.getDouble(13));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(rs.getDouble(14));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(rs.getString(15));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(rs.getString(16));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(16);
                    cell.setCellValue(rs.getString(17));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(rs.getString(18));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(rs.getString(19));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(rs.getDouble(20));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(rs.getDouble(21));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(rs.getDouble(22));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(rs.getDouble(23));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(23);
                    cell.setCellValue(rs.getString(24));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(24);
                    cell.setCellValue(rs.getString(25));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(25);
                    cell.setCellValue(rs.getString(26));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(26);
                    cell.setCellValue(rs.getString(27));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(27);
                    cell.setCellValue(rs.getDouble(28));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(28);
                    cell.setCellValue(rs.getDouble(29));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(29);
                    cell.setCellValue(rs.getDouble(30));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(30);
                    cell.setCellValue(rs.getString(31));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(31);
                    cell.setCellValue(rs.getString(32));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(32);
                    cell.setCellValue(rs.getString(33));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(33);
                    cell.setCellValue(rs.getString(34));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(34);
                    cell.setCellValue(rs.getString(35));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(35);
                    cell.setCellValue(rs.getString(36));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(36);
                    cell.setCellValue(rs.getString(37));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(37);
                    cell.setCellValue(rs.getString(38));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(38);
                    cell.setCellValue(rs.getString(39));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(39);
                    cell.setCellValue(rs.getString(40));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(40);
                    cell.setCellValue(rs.getString(41));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(41);
                    cell.setCellValue(rs.getString(42));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(42);
                    cell.setCellValue(rs.getString(43));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(43);
                    cell.setCellValue(rs.getString(44));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(44);
                    cell.setCellValue(rs.getString(45));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(45);
                    cell.setCellValue(rs.getDouble(46));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(46);
                    cell.setCellValue(rs.getDouble(47));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(47);
                    cell.setCellValue(rs.getString(48));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(48);
                    cell.setCellValue(rs.getString(49));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(49);
                    cell.setCellValue(rs.getString(50));
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
                Logger.getLogger(LogicaPenptetitla.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(LogicaPenptetitla.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
