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
                cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
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
                rowConf.setHeight((short) 500);
                XSSFCell cellConf;
                cellConf = rowConf.createCell(2);
                cellConf.setCellValue("CONFORT SERVICE PRESTIGE");
                cellConf.setCellStyle(style2);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                2, //first column (0-based)
                                7 //last column (0-based)
                        )
                );
//quincena etc mañana
                XSSFRow rowSinestilo = spreadsheet.createRow(4);
                rowSinestilo.setHeight((short) 500);
                XSSFCell cellSinestilo;
                cellSinestilo = rowSinestilo.createCell(0);
                cellSinestilo.setCellValue("Fecha");
                cellSinestilo.setCellStyle(style2);
                cellSinestilo = rowSinestilo.createCell(1);
                cellSinestilo.setCellValue("Nombre completo");
                cellSinestilo.setCellStyle(style2);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                4, //first row (0-based)
                                4, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                5, //first row (0-based)
                                5, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                6, //first row (0-based)
                                6, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                7, //first row (0-based)
                                7, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                8, //first row (0-based)
                                8, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                9, //first row (0-based)
                                9, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                10, //first row (0-based)
                                10, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                11, //first row (0-based)
                                11, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                12, //first row (0-based)
                                12, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                13, //first row (0-based)
                                13, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                14, //first row (0-based)
                                14, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                15, //first row (0-based)
                                15, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                16, //first row (0-based)
                                16, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                17, //first row (0-based)
                                17, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                18, //first row (0-based)
                                18, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                19, //first row (0-based)
                                19, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cellSinestilo = rowSinestilo.createCell(4);
                cellSinestilo.setCellValue("Entrada");
                cellSinestilo.setCellStyle(style2);
                cellSinestilo = rowSinestilo.createCell(5);
                cellSinestilo.setCellValue("Salida");
                cellSinestilo.setCellStyle(style2);
                cellSinestilo = rowSinestilo.createCell(6);
                cellSinestilo.setCellValue("Firma");
                cellSinestilo.setCellStyle(style2);
                cellSinestilo = rowSinestilo.createCell(7);
                cellSinestilo.setCellValue("Lugar");
                cellSinestilo.setCellStyle(style2);
                cellSinestilo = rowSinestilo.createCell(8);
                cellSinestilo.setCellValue("Doble");
                cellSinestilo.setCellStyle(style2);
                cellSinestilo = rowSinestilo.createCell(9);
                cellSinestilo.setCellValue("Observaciones");
                cellSinestilo.setCellStyle(style2);

                //  int i = 2;
                while (resultSet.next()) {
                    rowSinestilo = spreadsheet.createRow(2);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Quincena"));
                    cellSinestilo.setCellStyle(style2);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    2, //first row (0-based)
                                    2, //last row (0-based)
                                    0, //first column (0-based)
                                    2 //last column (0-based)
                            )
                    );
                    cellSinestilo = rowSinestilo.createCell(3);
                    cellSinestilo.setCellValue("Servicio");
                    cellSinestilo.setCellStyle(style2);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    2, //first row (0-based)
                                    2, //last row (0-based)
                                    4, //first column (0-based)
                                    6 //last column (0-based)
                            )
                    );
                    XSSFCellStyle style3 = libro.createCellStyle();
                    style3.setAlignment(XSSFCellStyle.ALIGN_RIGHT);
                    style3.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);
                    cellSinestilo = rowSinestilo.createCell(8);
                    cellSinestilo.setCellValue(resultSet.getString("Zona"));
                    cellSinestilo.setCellStyle(style3);
                    cellSinestilo = rowSinestilo.createCell(9);
                    cellSinestilo.setCellValue(resultSet.getString("NDL"));
                    cellSinestilo.setCellStyle(style3);
                    rowSinestilo = spreadsheet.createRow(5);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 1/16"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(6);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 2/17"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(7);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 3/18"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(8);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 4/19"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(9);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 5/20"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(10);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 6/21"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(11);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 7/22"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(12);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 8/23"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(13);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 9/24"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(14);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 10/25"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(15);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 11/26"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(16);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 12/27"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(17);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 13/28"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(18);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 14/29"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(19);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 15/30"));
                    cellSinestilo.setCellStyle(style2);
                    rowSinestilo = spreadsheet.createRow(20);
                    rowSinestilo.setHeight((short) 500);
                    cellSinestilo = rowSinestilo.createCell(0);
                    cellSinestilo.setCellValue(resultSet.getString("Dia 31"));
                    cellSinestilo.setCellStyle(style2);
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
