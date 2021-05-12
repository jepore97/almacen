/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import Modelos.Colores;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

/**
 *
 * @author H-P
 */
public class TableCellRendererColor extends DefaultTableCellRenderer{


    @Override
    public Component getTableCellRendererComponent(JTable table,
                                      Object value,
                                      boolean isSelected,
                                      boolean hasFocus,
                                      int row,
                                      int column){
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
        if(row%2==0){
        this.setBackground(Color.decode("#DBDADA"));
        }else{
            
        this.setBackground(Color.white);
        }        
        if(hasFocus){
        this.setBackground(Color.green);
        }
        return this;
    }
    
     public void pintarTabla(JTable Tabla ) {

        //Encabezado
        Colores colores=new Colores();
        JTableHeader th;
        th = Tabla.getTableHeader();
        Font fuente = new Font("Verdana", Font.BOLD, 25);
        th.setBackground(colores.getColorPrimarioLight());
        th.setForeground(Color.white);
        th.setFont(fuente);

        //color celdas
        for (int i = 0; i < Tabla.getColumnCount(); i++) {
            Tabla.getColumnModel().getColumn(i).setCellRenderer(this);
        }
    }
    
    
}
