/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XLSX;

import Admin.Listas;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;

import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PrintArea {

    public static void main(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Lista de"));
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

            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `nomina.listas.norte` WHERE 1");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {

                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Lista de ");

                XSSFRow row = spreadsheet.createRow((short) 0);
                row.setHeight((short) 500);
                XSSFCell cell = (XSSFCell) row.createCell((short) 0);

                XSSFCellStyle style2 = libro.createCellStyle();
                style2.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                style2.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
                cell.setCellValue("Lista de asistencia");
                cell.setCellStyle(style2);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                0, //first row (0-based)
                                0, //last row (0-based)
                                0, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                
                XSSFRow rowConf = spreadsheet.createRow(1);
                XSSFCell cellConf;
                cellConf = rowConf.createCell(3);
                cellConf.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V");
                cellConf.setCellStyle(style2);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                3, //first column (0-based)
                                5 //last column (0-based)
                        )
                );

                XSSFRow rowSinestilo = spreadsheet.createRow(3);
                XSSFCell cellSinestilo;
                cellSinestilo = rowSinestilo.createCell(1);
                cellSinestilo.setCellValue("Fecha");
                cellSinestilo = rowSinestilo.createCell(2);
                cellSinestilo.setCellValue("Apellido P");
                cellSinestilo = rowSinestilo.createCell(3);
                cellSinestilo.setCellValue("Apellido M");
                cellSinestilo = rowSinestilo.createCell(4);
                cellSinestilo.setCellValue("Nombre(s)");
                cellSinestilo = rowSinestilo.createCell(5);
                cellSinestilo.setCellValue("Entrada");
                cellSinestilo = rowSinestilo.createCell(6);
                cellSinestilo.setCellValue("Salida");
                cellSinestilo = rowSinestilo.createCell(7);
                cellSinestilo.setCellValue("Firma");

                int i = 2;

                while (resultSet.next()) {
                    rowSinestilo = spreadsheet.createRow(i);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 1/16"));
                    rowSinestilo = spreadsheet.createRow(3);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 2/17"));
                    rowSinestilo = spreadsheet.createRow(4);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 3/18"));
                    rowSinestilo = spreadsheet.createRow(5);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 4/19"));
                    rowSinestilo = spreadsheet.createRow(6);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 5/20"));
                    rowSinestilo = spreadsheet.createRow(7);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 6/21"));
                    rowSinestilo = spreadsheet.createRow(8);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 7/22"));
                    rowSinestilo = spreadsheet.createRow(9);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 8/23"));
                    rowSinestilo = spreadsheet.createRow(10);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 9/24"));
                    rowSinestilo = spreadsheet.createRow(11);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 10/25"));
                    rowSinestilo = spreadsheet.createRow(12);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 11/26"));
                    rowSinestilo = spreadsheet.createRow(13);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 12/27"));
                    rowSinestilo = spreadsheet.createRow(14);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 13/28"));
                    rowSinestilo = spreadsheet.createRow(15);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 14/29"));
                    rowSinestilo = spreadsheet.createRow(15);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 15/30"));
                    rowSinestilo = spreadsheet.createRow(16);
                    cellSinestilo = rowSinestilo.createCell(1);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 31"));
                    /*row = spreadsheet.createRow(17);
                    cell = row.createCell(i);
                    cell.setCellValue(resultSet.getString("Apellido M"));
                    cell = row.createCell(5);
                    cell.setCellValue(resultSet.getString("Nombre(s)"));
                    i++;*/
                }
                libro.write(archivo);
            }
            Desktop.getDesktop().open(archivoXLS);
        } catch (IOException | NumberFormatException e) {
            try {
                throw e;
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(Listas.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
