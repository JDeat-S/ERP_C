/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XLSX;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatabase {

    public static void main(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
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
            ResultSet resultSet = statement.executeQuery("SELECT `id_bd`, `Entra imss`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `empleados`");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("employe db");

                XSSFRow row = spreadsheet.createRow(1);
                XSSFCell cell;
                cell = row.createCell(1);
                cell.setCellValue("EMP ID");
                cell = row.createCell(2);
                cell.setCellValue("EMP NAME");
                cell = row.createCell(3);
                cell.setCellValue("DEG");
                cell = row.createCell(4);
                cell.setCellValue("SALARY");
                cell = row.createCell(5);
                cell.setCellValue("DEPT");
                int i = 2;

                while (resultSet.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getInt("id_bd"));
                    cell = row.createCell(2);
                    cell.setCellValue(resultSet.getString("Entra imss"));
                    cell = row.createCell(3);
                    cell.setCellValue(resultSet.getString("Apellido P"));
                    cell = row.createCell(4);
                    cell.setCellValue(resultSet.getString("Apellido M"));
                    cell = row.createCell(5);
                    cell.setCellValue(resultSet.getString("Nombre(s)"));
                    i++;
                }
                libro.write(archivo);
            }
            Desktop.getDesktop().open(archivoXLS);
        } catch (IOException | NumberFormatException e) {
            throw e;
        }
    }

}
