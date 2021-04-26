package almacen;

public class JFramePrincipal1 extends javax.swing.JFrame {

    JPanelUsuarios jPanelUsuarios;
    
    public JFramePrincipal1() {
        initComponents();
        init();
    }
    
    private void init(){
        jPanelUsuarios = new JPanelUsuarios();
        //jPanelUsuarios.setVisible(false);
        setLocationRelativeTo(null);
        addComponentsToContentPane();
    }
    
    private void addComponentsToContentPane() {
        jPanel.add(jPanelUsuarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMenu = new javax.swing.JPanel();
        jButtonFactura = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();
        jPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALMACÉN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(255, 255, 255));
        jPanelMenu.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonFactura.setBackground(new java.awt.Color(255, 255, 255));
        jButtonFactura.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Factura1.png"))); // NOI18N
        jButtonFactura.setText("FACTURA");
        jButtonFactura.setToolTipText("");
        jButtonFactura.setBorderPainted(false);
        jButtonFactura.setFocusable(false);
        jButtonFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturaActionPerformed(evt);
            }
        });

        jButtonUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUsuarios.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios1.png"))); // NOI18N
        jButtonUsuarios.setText("USUARIOS");
        jButtonUsuarios.setBorderPainted(false);
        jButtonUsuarios.setFocusable(false);
        jButtonUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButtonUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(jButtonFactura)
                .addGap(6, 6, 6)
                .addComponent(jButtonUsuarios))
        );

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 83, 490));

        java.awt.GridBagLayout jPanelLayout = new java.awt.GridBagLayout();
        jPanelLayout.columnWidths = new int[] {0};
        jPanelLayout.rowHeights = new int[] {0};
        jPanel.setLayout(jPanelLayout);
        getContentPane().add(jPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 600, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        jPanelUsuarios.setVisible(true);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturaActionPerformed
        jPanelUsuarios.setVisible(false);
    }//GEN-LAST:event_jButtonFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFactura;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
}