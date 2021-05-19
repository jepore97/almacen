package almacen;

import Modelos.Colores;
import Modelos.Usuario;
import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicios.*;

public class JFrameFormularioUsuario extends javax.swing.JFrame {

    JPanelFirma jPanelFirma;
    Colores colores;
    String name, lastName, identification, email, grade, position,id;
    ServicioUsuarios servicios = new ServicioUsuarios();
    boolean resPost;
    JPanelUsuarios jPanelU;

    listarTablas listTabla;
    ArrayList<Usuario> usuarios;

    public JFrameFormularioUsuario() {

        colores = new Colores();
        initComponents();
        init();
    }

    private void init() {
        jPanelU = new JPanelUsuarios();
        listTabla = new listarTablas();
        jPanel1.setBackground(colores.getColorPrimarioLight());
        jButtonGuardar.setBackground(colores.getColorAcentuacion());
        jButtonEditar.setBackground(colores.getColorAcentuacion());
        jPanelFirma = new JPanelFirma();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2;
        jPanelFormulario.add(jPanelFirma, c);
        setLocationRelativeTo(null);
    }
    
       public void cargarDatos(int idUsuario, String nombres,String apellidos,String correos,String cedula,String cargo,String grado){
        id=Integer.toString(idUsuario);
           jTextFieldNombres.setText(nombres);
         jTextFieldApellidos.setText(apellidos);
        jTextFieldCedula.setText(cedula);
        jTextFieldCorreo.setText(correos);
        jTextFieldGrado.setText(grado);
        jTextFieldCargo.setText(cargo);
        jButtonGuardar.setVisible(false);
        this.setVisible(true);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanelFormulario = new javax.swing.JPanel();
        jLabelNombres = new javax.swing.JLabel();
        jTextFieldNombres = new javax.swing.JTextField();
        jLabelApellidos = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jTextFieldCorreo = new javax.swing.JTextField();
        jLabelCargo = new javax.swing.JLabel();
        jTextFieldCargo = new javax.swing.JTextField();
        jLabelGrado = new javax.swing.JLabel();
        jTextFieldGrado = new javax.swing.JTextField();
        jLabelFirma = new javax.swing.JLabel();
        jLabelHuellas = new javax.swing.JLabel();
        jPanelHuellas = new javax.swing.JPanel();
        jLabelHuella3 = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelRequerido = new javax.swing.JLabel();
        jButtonEditar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();

        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelFormulario.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.darkGray));
        jPanelFormulario.setOpaque(false);
        jPanelFormulario.setPreferredSize(new java.awt.Dimension(315, 450));
        jPanelFormulario.setRequestFocusEnabled(false);
        jPanelFormulario.setLayout(new java.awt.GridBagLayout());

        jLabelNombres.setBackground(new java.awt.Color(255, 255, 255));
        jLabelNombres.setText("NOMBRES*");
        jLabelNombres.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPanelFormulario.add(jLabelNombres, gridBagConstraints);

        jTextFieldNombres.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldNombres.setPreferredSize(new java.awt.Dimension(227, 30));
        jTextFieldNombres.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 15, 0, 0);
        jPanelFormulario.add(jTextFieldNombres, gridBagConstraints);

        jLabelApellidos.setBackground(new java.awt.Color(255, 255, 255));
        jLabelApellidos.setText("APELLIDOS*");
        jLabelApellidos.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 0, 0, 0);
        jPanelFormulario.add(jLabelApellidos, gridBagConstraints);

        jTextFieldApellidos.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldApellidos.setPreferredSize(new java.awt.Dimension(227, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 15, 0, 0);
        jPanelFormulario.add(jTextFieldApellidos, gridBagConstraints);

        jLabelCedula.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCedula.setText("CÉDULA*");
        jLabelCedula.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanelFormulario.add(jLabelCedula, gridBagConstraints);

        jTextFieldCedula.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldCedula.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 15, 0, 0);
        jPanelFormulario.add(jTextFieldCedula, gridBagConstraints);

        jLabelCorreo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCorreo.setText("CORREO*");
        jLabelCorreo.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        jPanelFormulario.add(jLabelCorreo, gridBagConstraints);

        jTextFieldCorreo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 15, 0, 0);
        jPanelFormulario.add(jTextFieldCorreo, gridBagConstraints);

        jLabelCargo.setBackground(new java.awt.Color(255, 255, 255));
        jLabelCargo.setText("CARGO*");
        jLabelCargo.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelFormulario.add(jLabelCargo, gridBagConstraints);

        jTextFieldCargo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCargo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldCargo.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 15, 0, 0);
        jPanelFormulario.add(jTextFieldCargo, gridBagConstraints);

        jLabelGrado.setBackground(new java.awt.Color(255, 255, 255));
        jLabelGrado.setText("GRADO*");
        jLabelGrado.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.ipady = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelFormulario.add(jLabelGrado, gridBagConstraints);

        jTextFieldGrado.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldGrado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldGrado.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 227;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 15, 0, 0);
        jPanelFormulario.add(jTextFieldGrado, gridBagConstraints);

        jLabelFirma.setBackground(new java.awt.Color(255, 255, 255));
        jLabelFirma.setText("FIRMA*");
        jLabelFirma.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        jPanelFormulario.add(jLabelFirma, gridBagConstraints);

        jLabelHuellas.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHuellas.setText("HUELLAS");
        jLabelHuellas.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 0, 0, 0);
        jPanelFormulario.add(jLabelHuellas, gridBagConstraints);

        jPanelHuellas.setOpaque(false);
        jPanelHuellas.setPreferredSize(new java.awt.Dimension(315, 100));
        jPanelHuellas.setLayout(new java.awt.GridBagLayout());

        jLabelHuella3.setBackground(new java.awt.Color(255, 255, 255));
        jLabelHuella3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelHuella3.setPreferredSize(new java.awt.Dimension(100, 100));
        jPanelHuellas.add(jLabelHuella3, new java.awt.GridBagConstraints());

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 288;
        gridBagConstraints.ipady = 96;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 33, 0, 0);
        jPanelFormulario.add(jPanelHuellas, gridBagConstraints);

        jButtonGuardar.setText("GUARDAR");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 0, 39, 0);
        jPanelFormulario.add(jButtonGuardar, gridBagConstraints);

        jLabelRequerido.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRequerido.setText("Campos requeridos (*)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelFormulario.add(jLabelRequerido, gridBagConstraints);

        jButtonEditar.setText("Editar");
        jButtonEditar.setMinimumSize(new java.awt.Dimension(100, 29));
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.ipadx = 241;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(46, 0, 39, 0);
        jPanelFormulario.add(jButtonEditar, gridBagConstraints);

        jPanel2.setOpaque(false);

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO USUARIO");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(192, 192, 192))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanelFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        name = jTextFieldNombres.getText();
        lastName = jTextFieldApellidos.getText();
        identification = jTextFieldCedula.getText();
        email = jTextFieldCorreo.getText();
        grade = jTextFieldGrado.getText();
        position = jTextFieldCargo.getText();

        if (jTextFieldNombres.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campos vacios");
        } else {
            if (jTextFieldApellidos.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Campos vacios");
            } else {
                if (jTextFieldCedula.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Campos vacios");
                } else {
                    if (jTextFieldCorreo.getText().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Campos vacios");
                    } else {
                        if (jTextFieldGrado.getText().isEmpty()) {
                            JOptionPane.showMessageDialog(null, "Campos vacios");
                        } else {
                            if (jTextFieldCargo.getText().isEmpty()) {
                                JOptionPane.showMessageDialog(null, "Campos vacios");
                            } else {
                                resPost = servicios.uploadToServer(name, lastName, identification, email, grade, position);
                                if (resPost) {
                                    usuarios = servicios.getUsuarios();

                                    listTabla.tablaUsuario(usuarios, jPanelU.jTableUsuarios);
                                    jPanelU.repaint();
                                    jPanelU.validate();
                                    jPanelU.doLayout();
                                    dispose();
                                }
                            }
                        }
                    }
                }
            }
        }


    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Editar");
        name = jTextFieldNombres.getText();
        lastName = jTextFieldApellidos.getText();
        identification = jTextFieldCedula.getText();
        email = jTextFieldCorreo.getText();
        grade = jTextFieldGrado.getText();
        position = jTextFieldCargo.getText();
        
        resPost = servicios.updateUsuario(id,name, lastName, identification, email, grade, position);
                                if (resPost) {
                                    usuarios = servicios.getUsuarios();

                                    listTabla.tablaUsuario(usuarios, jPanelU.jTableUsuarios);
                                    jPanelU.repaint();
                                    jPanelU.validate();
                                    jPanelU.doLayout();
                                    dispose();
                                }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameFormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameFormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameFormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameFormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameFormularioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFirma;
    private javax.swing.JLabel jLabelGrado;
    private javax.swing.JLabel jLabelHuella3;
    private javax.swing.JLabel jLabelHuellas;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelRequerido;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JPanel jPanelHuellas;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldGrado;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
