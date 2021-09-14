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

    Color SAN = new Color(203, 132, 255);
    Color Evn = new Color(183, 244, 99);
    Color SVP = new Color(248, 193, 253);
    Color EstCDMX = new Color(20, 255, 206);
    Color LD = new Color(77, 255, 0);
    @Override

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (table.getValueAt(row, 0).toString().equals("SANTANDER CDMX")) {
            setBackground(SAN);
        } else if (table.getValueAt(row, 0).toString().equals("SANTANDER FORANEOS")) {
            setBackground(SAN);
        } else if (table.getValueAt(row, 0).toString().equals("EVENTOS")) {
            setBackground(Evn);
        } else if (table.getValueAt(row, 0).toString().equals("SERVICIOS VP")) {
            setBackground(SVP);
        } else if (table.getValueAt(row, 0).toString().equals("ESTACIONAMIENTOS FORANEOS")) {
            setBackground(EstCDMX);
        } else if (table.getValueAt(row, 0).toString().equals("ESTACIONAMIENTOS CDMX")) {
            setBackground(EstCDMX);
        } else if (table.getValueAt(row, 0).toString().equals("VARIADOS")) {
            setBackground(Color.YELLOW);
        } else {
            setBackground(Color.GRAY);
        }

        return this;

    }
}