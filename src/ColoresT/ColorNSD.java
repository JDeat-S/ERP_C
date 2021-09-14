/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColoresT;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author CONFORT
 */
public class ColorNSD extends DefaultTableCellRenderer {

    Color RyB = new Color(255, 175, 175);
    Color imss = new Color(203, 0, 255);
    Color Pen = new Color(146, 199, 255);
    Color EEs = new Color(152, 244, 147);
    Color Dep = new Color(153, 51, 255);
    @Override

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (table.getValueAt(row, 11).toString().equals("SANTANDER CDMX")) {
            setBackground(SAN);
        } else if (table.getValueAt(row, 11).toString().equals("SANTANDER FORANEOS")) {
            setBackground(SAN);
        } else if (table.getValueAt(row, 11).toString().equals("EVENTOS")) {
            setBackground(Evn);
        } else if (table.getValueAt(row, 11).toString().equals("SERVICIOS VP")) {
            setBackground(SVP);
        } else if (table.getValueAt(row, 11).toString().equals("ESTACIONAMIENTOS FORANEOS")) {
            setBackground(EstCDMX);
        } else if (table.getValueAt(row, 11).toString().equals("ESTACIONAMIENTOS CDMX")) {
            setBackground(EstCDMX);
        } else if (table.getValueAt(row, 11).toString().equals("NO APLICA")) {
            setBackground(LD);
        } else {
            setBackground(Color.GRAY);
        }

        return this;

    }
}