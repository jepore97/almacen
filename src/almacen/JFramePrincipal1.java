package almacen;

import Modelos.Colores;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import static javax.accessibility.AccessibleState.ICONIFIED;
import javax.swing.JLabel;


public class JFramePrincipal1 extends javax.swing.JFrame {

    JPanelUsuarios jPanelUsuarios;
    jPanelFactura jPanelFactura;
    Colores colores;
    int LayoutX=0;
    
    int LayoutY=0;

    public JFramePrincipal1() {
        colores = new Colores();
        initComponents();
        init();
    }
    
    private void init(){
                tamañoPantalla();

        jPanelUsuarios = new JPanelUsuarios();
        jPanelFactura=new jPanelFactura();
        //jPanelUsuarios.setVisible(false);
        addComponentsToContentPane();
    }
    
    private void tamañoPantalla() {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int ancho = (int) (d.getWidth() * 0.5);
        int alto = (int) (d.getHeight() * 0.5);
        setSize(ancho, alto);
        setLocationRelativeTo(null);
    }

    
    private void addComponentsToContentPane() {
        barraSuperior.setBackground(colores.getColorPrimario());
        panelMenu.setBackground(colores.getColorPrimario());
        jButtonFactura.setBackground(colores.getColorPrimarioOscuro());
        jButtonUsuarios.setBackground(colores.getColorPrimarioOscuro());
        
        panelContenido.setSize(getSize().width,getSize().height);
        //jPanelUsuarios.setSize(jPanel2.getSize().width-jPanelMenu.getSize().width,jPanel2.getSize().height);
        //jPanelFactura.setSize(jPanel2.getSize().width-jPanelMenu.getSize().width,jPanel2.getSize().height);
        
        panelContenido.add(jPanelUsuarios);
        panelContenido.add(jPanelFactura);
        panelContenido.add(jPanelUsuarios);
        
        
        
        //jButtonUsuarios.setBackground(Color.decode("#3399FF"));
        jPanelUsuarios.setVisible(false);
        jPanelFactura.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelBarra = new javax.swing.JPanel();
        barraSuperior = new javax.swing.JPanel();
        btnMin = new javax.swing.JLabel();
        btnRes = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        panelContenerdor = new javax.swing.JPanel();
        panelContenido = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jButtonFactura = new javax.swing.JButton();
        jButtonUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALMACÉN");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setFocusCycleRoot(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanelBarra.setBackground(new java.awt.Color(0, 51, 255));
        jPanelBarra.setToolTipText("");
        jPanelBarra.setAutoscrolls(true);
        jPanelBarra.setFocusCycleRoot(true);
        jPanelBarra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBarraMouseDragged(evt);
            }
        });
        jPanelBarra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBarraMousePressed(evt);
            }
        });
        jPanelBarra.setLayout(new java.awt.BorderLayout());

        barraSuperior.setBackground(new java.awt.Color(51, 51, 255));

        btnMin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/minimazar.png"))); // NOI18N
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });

        btnRes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/res.png"))); // NOI18N
        btnRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResMouseClicked(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addContainerGap(1157, Short.MAX_VALUE)
                .addComponent(btnMin)
                .addGap(26, 26, 26)
                .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addGroup(barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelBarra.add(barraSuperior, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanelBarra, java.awt.BorderLayout.PAGE_START);

        panelContenerdor.setBackground(new java.awt.Color(153, 255, 153));
        panelContenerdor.setLayout(new java.awt.BorderLayout());

        panelContenido.setBackground(new java.awt.Color(255, 255, 255));
        panelContenido.setLayout(new java.awt.BorderLayout());
        panelContenerdor.add(panelContenido, java.awt.BorderLayout.CENTER);

        panelMenu.setBackground(new java.awt.Color(51, 51, 255));
        panelMenu.setMaximumSize(null);
        panelMenu.setRequestFocusEnabled(false);
        panelMenu.setVerifyInputWhenFocusTarget(false);
        panelMenu.setLayout(new java.awt.GridLayout(6, 1));

        jButtonFactura.setBackground(new java.awt.Color(255, 0, 102));
        jButtonFactura.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonFactura.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Factura1.png"))); // NOI18N
        jButtonFactura.setText("FACTURA");
        jButtonFactura.setToolTipText("");
        jButtonFactura.setBorderPainted(false);
        jButtonFactura.setFocusable(false);
        jButtonFactura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonFactura.setPreferredSize(new java.awt.Dimension(150, 87));
        jButtonFactura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFacturaActionPerformed(evt);
            }
        });
        panelMenu.add(jButtonFactura);

        jButtonUsuarios.setBackground(new java.awt.Color(255, 0, 102));
        jButtonUsuarios.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jButtonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Usuarios1.png"))); // NOI18N
        jButtonUsuarios.setText("USUARIOS");
        jButtonUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.lightGray, null));
        jButtonUsuarios.setBorderPainted(false);
        jButtonUsuarios.setFocusable(false);
        jButtonUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonUsuarios.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuariosActionPerformed(evt);
            }
        });
        panelMenu.add(jButtonUsuarios);

        panelContenerdor.add(panelMenu, java.awt.BorderLayout.LINE_START);

        jPanel1.add(panelContenerdor, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuariosActionPerformed
        jPanelUsuarios.setVisible(true);
        panelContenido.remove(jPanelFactura);
        jButtonFactura.setBackground(colores.getColorPrimarioOscuro());
        jButtonUsuarios.setBackground(Color.white);
        jPanelFactura.setVisible(false);
    }//GEN-LAST:event_jButtonUsuariosActionPerformed

    private void jButtonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFacturaActionPerformed
       
        jPanelUsuarios.setVisible(false);
        jButtonUsuarios.setBackground(colores.getColorPrimarioOscuro());
        jButtonFactura.setBackground(Color.white);
        jPanelFactura.setVisible(true);
    }//GEN-LAST:event_jButtonFacturaActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void jPanelBarraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraMousePressed
        // TODO add your handling code here:
                if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            LayoutX = evt.getX();
            LayoutY = evt.getY();
        }
    }//GEN-LAST:event_jPanelBarraMousePressed

    private void jPanelBarraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBarraMouseDragged
        // TODO add your handling code here:
        this.setLocation(evt.getXOnScreen() - LayoutX, evt.getYOnScreen() - LayoutY);
    }//GEN-LAST:event_jPanelBarraMouseDragged

    private void btnResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResMouseClicked
        // TODO add your handling code here:
        if (evt.getButton() == java.awt.event.MouseEvent.BUTTON1) {
            
              if(getExtendedState() == this.MAXIMIZED_BOTH){
            setExtendedState(this.NORMAL);
        }else{
            setExtendedState(this.MAXIMIZED_BOTH);
        }
        }
    }//GEN-LAST:event_btnResMouseClicked

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        // TODO add your handling code here:
        setExtendedState(this.ICONIFIED);
    }//GEN-LAST:event_btnMinMouseClicked

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
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel btnRes;
    private javax.swing.JButton jButtonFactura;
    private javax.swing.JButton jButtonUsuarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelBarra;
    private javax.swing.JPanel panelContenerdor;
    private javax.swing.JPanel panelContenido;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
