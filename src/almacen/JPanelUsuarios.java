/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author H-P
 */
public class JPanelUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    
    TableCellRendererColor tbc =new TableCellRendererColor();
    public JPanelUsuarios() {
        initComponents();
        init();
    }
    
    private void init(){
        tbc.pintarTabla(jTableUsuarios);
        DefaultTableModel modelo = (DefaultTableModel) jTableUsuarios.getModel(); 
        Object [] fila = new Object[4]; 
        
        fila[0] = "YURI MARCELA"; 
        fila[1] = "CAICEDO MARÍN"; 
        fila[2] = "yurimarin@gmail.com"; 
        fila[3] = "SECRETARIA"; 
 
        modelo.addRow(fila); 
        
        fila[0] = "ANDRES FELIPE"; 
        fila[1] = "CAICEDO MARÍN"; 
        fila[2] = "andres.caicedo@gmail.com"; 
        fila[3] = "COMERCIANTE"; 
        
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        modelo.addRow(fila);
        
        
        
        jTableUsuarios.setModel(modelo); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        GridBagConstraints gridBagConstraints;

        jPanel1 = new JPanel();
        jButton1 = new JButton();
        jPanel4 = new JPanel();
        jLabel1 = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        jTableUsuarios = new JTable();
        jPanel3 = new JPanel();
        jButton2 = new JButton();
        jButton3 = new JButton();

        setBackground(new Color(51, 0, 51));
        setAutoscrolls(true);
        setInheritsPopupMenu(true);
        setLayout(new BorderLayout());

        jPanel1.setBackground(new Color(255, 255, 255));

        jButton1.setBackground(new Color(255, 153, 51));
        jButton1.setIcon(new ImageIcon(getClass().getResource("/imagenes/1486485588-add-create-new-math-sign-cross-plus_81186.png"))); // NOI18N
        jButton1.setText("NUEVO");
        jButton1.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new Color(255, 255, 255));
        jPanel4.setLayout(new GridBagLayout());

        jLabel1.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USUARIOS");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(39, 27, 32, 27);
        jPanel4.add(jLabel1, gridBagConstraints);

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel4, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 1235, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        add(jPanel1, BorderLayout.PAGE_START);

        jPanel2.setBackground(new Color(255, 255, 255));
        jPanel2.setLayout(new BorderLayout());

        jTableUsuarios.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRES", "APELLIDOS", "CORREO", "CARGO"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableUsuarios.setPreferredSize(null);
        jTableUsuarios.setRowHeight(28);
        jScrollPane1.setViewportView(jTableUsuarios);

        jPanel2.add(jScrollPane1, BorderLayout.CENTER);

        add(jPanel2, BorderLayout.CENTER);

        jPanel3.setBackground(new Color(255, 255, 255));

        jButton2.setBackground(new Color(255, 153, 51));
        jButton2.setText("EDITAR");
        jButton2.setPreferredSize(new Dimension(89, 40));

        jButton3.setBackground(new Color(255, 153, 51));
        jButton3.setText("ELIMINAR");
        jButton3.setPreferredSize(new Dimension(105, 41));
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(199, 199, 199))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        add(jPanel3, BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrameFormularioUsuario jFrameFormularioUsuario = new JFrameFormularioUsuario();
        jFrameFormularioUsuario.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.out.println(jTableUsuarios.getSelectedRow());
        if(jTableUsuarios.getSelectedRow()<0){            
            JOptionPane.showMessageDialog(null, "Debes seleccionar una fila de la tabla");
        } else {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?");
            if(JOptionPane.OK_OPTION == confirmar) {
                DefaultTableModel model = (DefaultTableModel) jTableUsuarios.getModel();
                model.removeRow(jTableUsuarios.getSelectedRow());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    JButton jButton1;
    JButton jButton2;
    JButton jButton3;
    JLabel jLabel1;
    JPanel jPanel1;
    JPanel jPanel2;
    JPanel jPanel3;
    JPanel jPanel4;
    JScrollPane jScrollPane1;
    JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}
