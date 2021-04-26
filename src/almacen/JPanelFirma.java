package almacen;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

public class JPanelFirma extends javax.swing.JPanel {
    BufferedImage image;
    Graphics2D g2d;
    
    public JPanelFirma() {
        initComponents();
        init();
    }
    
    private void init() {
        image = new BufferedImage(315, 80, BufferedImage.TRANSLUCENT);
        setBackground(Color.WHITE);
        g2d = image.createGraphics();
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2));
        MouseAdapter mouseHandler = new MouseAdapter() {
            private Point curPoint = new Point();
            @Override
            public void mousePressed(MouseEvent me) {
                curPoint.setLocation(me.getPoint());
            }

            @Override
            public void mouseDragged(MouseEvent me) {
                g2d.drawLine(curPoint.x, curPoint.y, me.getX(), me.getY());
                curPoint.setLocation(me.getPoint());
                repaint();
            }
        };
        addMouseListener(mouseHandler);
        addMouseMotionListener(mouseHandler);
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponents(grphcs);
        grphcs.drawImage(image, 0, 0, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(315, 80));
        setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 313, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
