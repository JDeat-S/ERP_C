package Nomina.Listas.LSIMSS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class L17_1 {

    XSSFWorkbook libro = new XSSFWorkbook();
    XSSFSheet spreadsheet = libro.createSheet("Listas de asistencia");
    XSSFRow row = spreadsheet.createRow((short) 0);
    XSSFCell cell = (XSSFCell) row.createCell((short) 0);

    // <editor-fold defaultstate="collapsed" desc="Solo 17 listas">
    public void LIS(ItemsL IL, L17 L017) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://192.168.1.170:3306/confort2022",
                    "Servidor",
                    "Confort1022"
            );

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

            int PL = (IL.getUNumR() - IL.getNDLista()) + 1;
            Statement sLM14 = connect.createStatement();
            ResultSet LM14 = sLM14.executeQuery("SELECT * FROM `nomina.listas." + IL.getLDAzona() + ".simss` WHERE `NDL` BETWEEN '"
                    + PL + "' AND '" + IL.getUNumR() + "' LIMIT 14");

            while (LM14.next()) {

                row = spreadsheet.createRow((short) 286);
                cell = (XSSFCell) row.createCell((short) 0);
                cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                286, //first row (0-based)
                                286, //last row (0-based)
                                0, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(287);
                cell = row.createCell(2);
                cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                287, //first row (0-based)
                                287, //last row (0-based)
                                2, //first column (0-based)
                                7 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(288);
                row.setHeight((short) 400);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getString("Quincena") + " " + LM14.getString("y 1/16"));
                cell.setCellStyle(Contenido);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                288, //first row (0-based)
                                288, //last row (0-based)
                                0, //first column (0-based)
                                2 //last column (0-based)
                        )
                );
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                288, //first row (0-based)
                                288, //last row (0-based)
                                4, //first column (0-based)
                                6 //last column (0-based)
                        )
                );
                cell = row.createCell(4);
                cell.setCellStyle(Contenido);

                cell = row.createCell(5);
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellStyle(Contenido);
                //cell = row.createCell(7);
                //cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue(LM14.getString("Zona"));
                spreadsheet.setColumnWidth(8, 4250);
                cell.setCellStyle(Contenido);

                cell = row.createCell(9);
                spreadsheet.setColumnWidth(9, 1400);
                cell.setCellValue(LM14.getInt("NDL"));
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(290);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                290, //first row (0-based)
                                290, //last row (0-based)
                                0, //first column (0-based)
                                1 //last column (0-based)
                        )
                );
                row.setHeight((short) 500);
                cell = row.createCell(0);
                spreadsheet.setColumnWidth(0, 750);
                cell.setCellValue("Fecha");
                cell.setCellStyle(Contenido);

                spreadsheet.setColumnWidth(1, 2940);
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);

                cell = row.createCell(2);
                spreadsheet.setColumnWidth(2, 8000);
                cell.setCellValue("Nombre completo");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                290, //last row (0-based)
                                290, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cell = row.createCell(3);
                cell.setCellValue("Entrada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Salida");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                spreadsheet.setColumnWidth(5, 5000);
                cell.setCellValue("Firma");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                spreadsheet.setColumnWidth(6, 5000);
                cell.setCellValue("Lugar");

                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                spreadsheet.setColumnWidth(7, 1800);
                cell.setCellValue("Doble");

                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                spreadsheet.setColumnWidth(8, 5650);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                290, //last row (0-based)
                                290, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(291);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellStyle(Stilodd);
                cell.setCellValue(LM14.getInt("dd 1/16"));
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 1/16"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                291, //last row (0-based)
                                291, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(292);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 2/17"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 2/17"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                292, //last row (0-based)
                                292, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(293);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 3/18"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 3/18"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                293, //last row (0-based)
                                293, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(294);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 4/19"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 4/19"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                294, //last row (0-based)
                                294, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(295);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 5/20"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 5/20"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                295, //first row (0-based)
                                295, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(296);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 6/21"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 6/21"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                296, //first row (0-based)
                                296, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(297);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 7/22"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 7/22"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                297, //first row (0-based)
                                297, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(298);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 8/23"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 8/23"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                298,
                                298,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(299);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 9/24"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 9/24"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                299,
                                299,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(300);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 10/25"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 10/25"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                300,
                                300,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(301);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 11/26"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 11/26"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                301,
                                301,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(302);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 12/27"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 12/27"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                302,
                                302,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(303);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 13/28"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 13/28"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                303,
                                303,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(304);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 14/29"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 14/29"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                304,
                                304,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(305);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getInt("dd 15/30"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 15/30"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                305,
                                305,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(306);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM14.getString("dd 31"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM14.getString("EEEE 31"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                306,
                                306,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
            }

            Statement sLM15 = connect.createStatement();
            ResultSet LM15 = sLM15.executeQuery("SELECT * FROM `nomina.listas." + IL.getLDAzona() + ".simss` WHERE `NDL` BETWEEN '"
                    + PL + "' AND '" + IL.getUNumR() + "' LIMIT 15");

            while (LM15.next()) {

                cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                308, //first row (0-based)
                                308, //last row (0-based)
                                0, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(309);
                cell = row.createCell(2);
                cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                309, //first row (0-based)
                                309, //last row (0-based)
                                2, //first column (0-based)
                                7 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(310);
                row.setHeight((short) 400);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getString("Quincena") + " " + LM15.getString("y 1/16"));
                cell.setCellStyle(Contenido);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                310, //first row (0-based)
                                310, //last row (0-based)
                                0, //first column (0-based)
                                2 //last column (0-based)
                        )
                );
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                310, //first row (0-based)
                                310, //last row (0-based)
                                4, //first column (0-based)
                                6 //last column (0-based)
                        )
                );
                cell = row.createCell(4);
                cell.setCellStyle(Contenido);

                cell = row.createCell(5);
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellStyle(Contenido);
                //cell = row.createCell(7);
                //cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue(LM15.getString("Zona"));
                spreadsheet.setColumnWidth(8, 4250);
                cell.setCellStyle(Contenido);

                cell = row.createCell(9);
                spreadsheet.setColumnWidth(9, 1400);
                cell.setCellValue(LM15.getInt("NDL"));
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(312);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                312, //first row (0-based)
                                312, //last row (0-based)
                                0, //first column (0-based)
                                1 //last column (0-based)
                        )
                );
                row.setHeight((short) 500);
                cell = row.createCell(0);
                spreadsheet.setColumnWidth(0, 750);
                cell.setCellValue("Fecha");
                cell.setCellStyle(Contenido);

                spreadsheet.setColumnWidth(1, 3160);
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);

                cell = row.createCell(2);
                spreadsheet.setColumnWidth(2, 8000);
                cell.setCellValue("Nombre completo");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                312, //last row (0-based)
                                312, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cell = row.createCell(3);
                cell.setCellValue("Entrada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Salida");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                spreadsheet.setColumnWidth(5, 5000);
                cell.setCellValue("Firma");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                spreadsheet.setColumnWidth(6, 5000);
                cell.setCellValue("Lugar");

                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                spreadsheet.setColumnWidth(7, 1800);
                cell.setCellValue("Doble");

                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                spreadsheet.setColumnWidth(8, 5650);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                312, //last row (0-based)
                                312, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(313);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellStyle(Stilodd);
                cell.setCellValue(LM15.getInt("dd 1/16"));
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 1/16"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                313, //last row (0-based)
                                313, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(314);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 2/17"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 2/17"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                314, //last row (0-based)
                                314, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(315);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 3/18"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 3/18"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                315, //last row (0-based)
                                315, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(316);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 4/19"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 4/19"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                316, //last row (0-based)
                                316, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(317);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 5/20"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 5/20"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                317, //first row (0-based)
                                317, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(318);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 6/21"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 6/21"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                318, //first row (0-based)
                                318, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(319);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 7/22"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 7/22"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                319, //first row (0-based)
                                319, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(320);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 8/23"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 8/23"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                320,
                                320,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(321);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 9/24"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 9/24"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                321,
                                321,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(322);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 10/25"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 10/25"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                322,
                                322,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(323);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 11/26"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 11/26"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                323,
                                323,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(324);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 12/27"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 12/27"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                324,
                                324,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(325);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 13/28"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 13/28"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                325,
                                325,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(326);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 14/29"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 14/29"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                326,
                                326,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(327);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getInt("dd 15/30"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 15/30"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                327,
                                327,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(328);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM15.getString("dd 31"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM15.getString("EEEE 31"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                328,
                                328,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
            }

            Statement sLM16 = connect.createStatement();
            ResultSet LM16 = sLM16.executeQuery("SELECT * FROM `nomina.listas." + IL.getLDAzona() + ".simss` WHERE `NDL` BETWEEN '"
                    + PL + "' AND '" + IL.getUNumR() + "' LIMIT 16");

            while (LM16.next()) {

                row = spreadsheet.createRow((short) 330);
                cell = (XSSFCell) row.createCell((short) 0);
                cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                330, //first row (0-based)
                                330, //last row (0-based)
                                0, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(331);
                cell = row.createCell(2);
                cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                331, //first row (0-based)
                                331, //last row (0-based)
                                2, //first column (0-based)
                                7 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(332);
                row.setHeight((short) 400);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getString("Quincena") + " " + LM16.getString("y 1/16"));
                cell.setCellStyle(Contenido);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                332, //first row (0-based)
                                332, //last row (0-based)
                                0, //first column (0-based)
                                2 //last column (0-based)
                        )
                );
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                332, //first row (0-based)
                                332, //last row (0-based)
                                4, //first column (0-based)
                                6 //last column (0-based)
                        )
                );
                cell = row.createCell(4);
                cell.setCellStyle(Contenido);

                cell = row.createCell(5);
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellStyle(Contenido);
                //cell = row.createCell(7);
                //cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue(LM16.getString("Zona"));
                spreadsheet.setColumnWidth(8, 4250);
                cell.setCellStyle(Contenido);

                cell = row.createCell(9);
                spreadsheet.setColumnWidth(9, 1400);
                cell.setCellValue(LM16.getInt("NDL"));
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(334);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                334, //first row (0-based)
                                334, //last row (0-based)
                                0, //first column (0-based)
                                1 //last column (0-based)
                        )
                );
                row.setHeight((short) 500);
                cell = row.createCell(0);
                spreadsheet.setColumnWidth(0, 750);
                cell.setCellValue("Fecha");
                cell.setCellStyle(Contenido);

                spreadsheet.setColumnWidth(1, 3380);
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);

                cell = row.createCell(2);
                spreadsheet.setColumnWidth(2, 8000);
                cell.setCellValue("Nombre completo");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                334, //last row (0-based)
                                334, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cell = row.createCell(3);
                cell.setCellValue("Entrada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Salida");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                spreadsheet.setColumnWidth(5, 5000);
                cell.setCellValue("Firma");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                spreadsheet.setColumnWidth(6, 5000);
                cell.setCellValue("Lugar");

                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                spreadsheet.setColumnWidth(7, 1800);
                cell.setCellValue("Doble");

                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                spreadsheet.setColumnWidth(8, 5650);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                334, //last row (0-based)
                                334, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(335);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellStyle(Stilodd);
                cell.setCellValue(LM16.getInt("dd 1/16"));
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 1/16"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                335, //last row (0-based)
                                335, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(336);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 2/17"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 2/17"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                336, //last row (0-based)
                                336, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(337);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 3/18"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 3/18"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                337, //last row (0-based)
                                337, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(338);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 4/19"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 4/19"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                338, //last row (0-based)
                                338, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(339);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 5/20"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 5/20"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                339, //first row (0-based)
                                339, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(340);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 6/21"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 6/21"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                340, //first row (0-based)
                                340, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(341);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 7/22"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 7/22"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                341, //first row (0-based)
                                341, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(342);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 8/23"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 8/23"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                342,
                                342,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(343);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 9/24"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 9/24"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                343,
                                343,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(344);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 10/25"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 10/25"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                344,
                                344,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(345);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 11/26"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 11/26"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                345,
                                345,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(346);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 12/27"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 12/27"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                346,
                                346,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(347);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 13/28"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 13/28"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                347,
                                347,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(348);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 14/29"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 14/29"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                348,
                                348,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(349);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getInt("dd 15/30"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 15/30"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                349,
                                349,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(350);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM16.getString("dd 31"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM16.getString("EEEE 31"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                350,
                                350,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
            }
            Statement sLM17 = connect.createStatement();
            ResultSet LM17 = sLM17.executeQuery("SELECT * FROM `nomina.listas." + IL.getLDAzona() + ".simss` WHERE `NDL` BETWEEN '"
                    + PL + "' AND '" + IL.getUNumR() + "' LIMIT 17");

            while (LM17.next()) {

                row = spreadsheet.createRow((short) 352);
                cell = (XSSFCell) row.createCell((short) 0);
                cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                352, //first row (0-based)
                                352, //last row (0-based)
                                0, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(353);
                cell = row.createCell(2);
                cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                353, //first row (0-based)
                                353, //last row (0-based)
                                2, //first column (0-based)
                                7 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(354);
                row.setHeight((short) 400);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getString("Quincena") + " " + LM17.getString("y 1/16"));
                cell.setCellStyle(Contenido);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                354, //first row (0-based)
                                354, //last row (0-based)
                                0, //first column (0-based)
                                2 //last column (0-based)
                        )
                );
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                354, //first row (0-based)
                                354, //last row (0-based)
                                4, //first column (0-based)
                                6 //last column (0-based)
                        )
                );
                cell = row.createCell(4);
                cell.setCellStyle(Contenido);

                cell = row.createCell(5);
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellStyle(Contenido);
                //cell = row.createCell(7);
                //cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue(LM17.getString("Zona"));
                spreadsheet.setColumnWidth(8, 4250);
                cell.setCellStyle(Contenido);

                cell = row.createCell(9);
                spreadsheet.setColumnWidth(9, 1400);
                cell.setCellValue(LM17.getInt("NDL"));
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(356);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                356, //first row (0-based)
                                356, //last row (0-based)
                                0, //first column (0-based)
                                1 //last column (0-based)
                        )
                );
                row.setHeight((short) 500);
                cell = row.createCell(0);
                spreadsheet.setColumnWidth(0, 750);
                cell.setCellValue("Fecha");
                cell.setCellStyle(Contenido);

                spreadsheet.setColumnWidth(1, 3600);
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);

                cell = row.createCell(2);
                spreadsheet.setColumnWidth(2, 8000);
                cell.setCellValue("Nombre completo");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                356, //last row (0-based)
                                356, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cell = row.createCell(3);
                cell.setCellValue("Entrada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Salida");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                spreadsheet.setColumnWidth(5, 5000);
                cell.setCellValue("Firma");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                spreadsheet.setColumnWidth(6, 5000);
                cell.setCellValue("Lugar");

                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                spreadsheet.setColumnWidth(7, 1800);
                cell.setCellValue("Doble");

                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                spreadsheet.setColumnWidth(8, 5650);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                356, //last row (0-based)
                                356, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(357);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellStyle(Stilodd);
                cell.setCellValue(LM17.getInt("dd 1/16"));
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 1/16"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                357, //last row (0-based)
                                357, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(358);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 2/17"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 2/17"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                358, //last row (0-based)
                                358, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(359);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 3/18"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 3/18"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                359, //last row (0-based)
                                359, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(360);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 4/19"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 4/19"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                360, //last row (0-based)
                                360, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(361);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 5/20"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 5/20"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                361, //first row (0-based)
                                361, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(362);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 6/21"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 6/21"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                362, //first row (0-based)
                                362, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(363);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 7/22"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 7/22"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                363, //first row (0-based)
                                363, //first row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(364);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 8/23"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 8/23"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                364,
                                364,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(365);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 9/24"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 9/24"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                365,
                                365,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(366);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 10/25"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 10/25"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                366,
                                366,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(367);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 11/26"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 11/26"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                367,
                                367,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(368);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 12/27"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 12/27"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                368,
                                368,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(369);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 13/28"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 13/28"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                369,
                                369,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(370);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 14/29"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 14/29"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                370,
                                370,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(371);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getInt("dd 15/30"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 15/30"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                371,
                                371,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);

                row = spreadsheet.createRow(372);
                row.setHeight((short) 600);
                cell = row.createCell(0);
                cell.setCellValue(LM17.getString("dd 31"));
                cell.setCellStyle(Stilodd);
                cell = row.createCell(1);
                cell.setCellValue(LM17.getString("EEEE 31"));
                cell.setCellStyle(StiloEEEE);
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
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                372,
                                372,
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );
                cell = row.createCell(8);
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
            }
            L017.setRow(row);
            L017.setCell(cell);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(L16_1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

//</editor-fold>
}
