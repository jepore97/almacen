/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author H-P
 */
public class JPanelUsuarios extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public JPanelUsuarios() {
        initComponents();
        init();
    }
    
    private void init(){
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOMBRES", "APELLIDOS", "CORREO", "CARGO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
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
        jScrollPane1.setViewportView(jTableUsuarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("USUARIOS");

        jButton1.setText("NUEVO");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("EDITAR");

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrameFormularioUsuario jFrameFormularioUsuario = new JFrameFormularioUsuario();
        jFrameFormularioUsuario.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableUsuarios;
    // End of variables declaration//GEN-END:variables
}