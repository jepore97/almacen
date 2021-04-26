/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author H-P
 */
public class TableCellRendererColor extends DefaultTableCellRenderer{
private Component componente;

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
        
        return this;
    }
    
    
}
