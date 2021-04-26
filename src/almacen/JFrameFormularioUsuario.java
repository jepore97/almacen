package almacen;

import java.awt.GridBagConstraints;

public class JFrameFormularioUsuario extends javax.swing.JFrame {
    
    JPanelFirma jPanelFirma;
    
    public JFrameFormularioUsuario() {
        initComponents();        
        init();
    }
    
    private void init() {
        jPanelFirma = new JPanelFirma();
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2;
        jPanelFormulario.add(jPanelFirma, c);
        setLocationRelativeTo(null);
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelRequerido = new javax.swing.JLabel();
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

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitulo.setText("REGISTRO USUARIO");
        jLabelTitulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanel1.add(jLabelTitulo, gridBagConstraints);

        jLabelRequerido.setForeground(new java.awt.Color(102, 102, 102));
        jLabelRequerido.setText("Campos requeridos (*)");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        jPanel1.add(jLabelRequerido, gridBagConstraints);

        jPanelFormulario.setOpaque(false);
        jPanelFormulario.setPreferredSize(new java.awt.Dimension(315, 300));
        jPanelFormulario.setRequestFocusEnabled(false);
        jPanelFormulario.setLayout(new java.awt.GridBagLayout());

        jLabelNombres.setText("NOMBRES*");
        jLabelNombres.setOpaque(true);
        jLabelNombres.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jLabelNombres, gridBagConstraints);

        jTextFieldNombres.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldNombres.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldNombres.setPreferredSize(new java.awt.Dimension(227, 20));
        jTextFieldNombres.setRequestFocusEnabled(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jTextFieldNombres, gridBagConstraints);

        jLabelApellidos.setText("APELLIDOS*");
        jLabelApellidos.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jLabelApellidos, gridBagConstraints);

        jTextFieldApellidos.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldApellidos.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldApellidos.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jTextFieldApellidos, gridBagConstraints);

        jLabelCedula.setText("CÉDULA*");
        jLabelCedula.setOpaque(true);
        jLabelCedula.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jLabelCedula, gridBagConstraints);

        jTextFieldCedula.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldCedula.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jTextFieldCedula, gridBagConstraints);

        jLabelCorreo.setText("CORREO*");
        jLabelCorreo.setOpaque(true);
        jLabelCorreo.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jLabelCorreo, gridBagConstraints);

        jTextFieldCorreo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldCorreo.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jTextFieldCorreo, gridBagConstraints);

        jLabelCargo.setText("CARGO*");
        jLabelCargo.setOpaque(true);
        jLabelCargo.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jLabelCargo, gridBagConstraints);

        jTextFieldCargo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCargo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldCargo.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jTextFieldCargo, gridBagConstraints);

        jLabelGrado.setText("GRADO*");
        jLabelGrado.setOpaque(true);
        jLabelGrado.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanelFormulario.add(jLabelGrado, gridBagConstraints);

        jTextFieldGrado.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldGrado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jTextFieldGrado.setPreferredSize(new java.awt.Dimension(227, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 15, 0);
        jPanelFormulario.add(jTextFieldGrado, gridBagConstraints);

        jLabelFirma.setText("FIRMA*");
        jLabelFirma.setOpaque(true);
        jLabelFirma.setPreferredSize(new java.awt.Dimension(85, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 10, 0);
        jPanelFormulario.add(jLabelFirma, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanel1.add(jPanelFormulario, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel jLabelApellidos;
    private javax.swing.JLabel jLabelCargo;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelFirma;
    private javax.swing.JLabel jLabelGrado;
    private javax.swing.JLabel jLabelNombres;
    private javax.swing.JLabel jLabelRequerido;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFormulario;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldCargo;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldGrado;
    private javax.swing.JTextField jTextFieldNombres;
    // End of variables declaration//GEN-END:variables
}
