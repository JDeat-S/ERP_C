/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funciones;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author JDeat
 */
public class ColorRH extends DefaultTableCellRenderer {

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
        if (table.getValueAt(row, 20).toString().equals("BAJA")) {
            setBackground(RyB);
        } else if (table.getValueAt(row, 20).toString().equals("VIGENTE (TEMPORAL)")) {
            setBackground(Pen);
        } else if (table.getValueAt(row, 20).toString().equals("VIGENTE")) {
            setBackground(Color.yellow);
        } else if (table.getValueAt(row, 20).toString().equals("RECHAZADO")) {
            setBackground(RyB);
        } else if (table.getValueAt(row, 20).toString().equals("IMSS")) {
            setBackground(imss);
        } else if (table.getValueAt(row, 20).toString().equals("EN ESPERA")) {
            setBackground(EEs);
        } else if (table.getValueAt(row, 20).toString().equals("PENDIENTE")) {
            setBackground(Pen);
        } else if (table.getValueAt(row, 20).toString().equals("BOLETINADO")) {
            setBackground(RyB);
        }else if (table.getValueAt(row, 20).toString().equals("DEPURADO")) {
            setBackground(Dep);
        }else{
            setBackground(Color.CYAN);
        }

        return this;

    }
}
