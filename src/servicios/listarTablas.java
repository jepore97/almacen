/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import Modelos.Usuario;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author H-P
 */
public class listarTablas {
    
    
    
    public void tablaUsuario(ArrayList<Usuario> usuarios,JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel(); 
        
        Object [] fila = new Object[5]; 
        
        for (int i = 0;i<usuarios.size(); i++) {
            fila[0] =usuarios.get(i).getCdgoUsuario();
            fila[1] =usuarios.get(i).getNombres(); 
        fila[2] = usuarios.get(i).getApellidos(); 
        fila[3] = usuarios.get(i).getCorreo(); 
        fila[4] = usuarios.get(i).getCargo(); 
 
        modelo.addRow(fila); 
        }
        tabla.setModel(modelo); 
        tabla.doLayout();
    
    }
    
}
