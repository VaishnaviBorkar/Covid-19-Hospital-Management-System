/*
1.spashcreen using thread clases
 */
package mgmtsys.gui;
import java.awt.*;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class SplashScreen extends javax.swing.JFrame {
 private SplashScreenThread spt;
 
    public SplashScreen() {
        initComponents();
        spt=new SplashScreenThread();
        spt.start();
        
    }
    class SplashScreenThread  extends Thread
    {
        
        public void run()
        {
            UIManager.put("jProgressBar2.setBackground",Color.blue);
            try {
            for(int i=0;i<=100;i++)
            {
                   Thread.sleep(150);
             
                jProgressBar2.setValue(i);
            }
             SplashScreen.this.dispose();
            Login lg=new Login();
            lg.setVisible(true);
            lg.show();
        }   catch (InterruptedException ie) {
            JOptionPane.showMessageDialog(SplashScreen.this,"interupted");
               }
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        splashscreenImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COVID-19 Hospital Mannagement System");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 100));

        jProgressBar2.setBackground(new java.awt.Color(0, 0, 153));
        jProgressBar2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jProgressBar2.setForeground(new java.awt.Color(255, 255, 255));
        jProgressBar2.setBorderPainted(false);
        jProgressBar2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jProgressBar2.setOpaque(true);
        jProgressBar2.setStringPainted(true);
        getContentPane().add(jProgressBar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 990, 25));

        splashscreenImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/mgmsys1.jpg"))); // NOI18N
        getContentPane().add(splashscreenImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1010, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JLabel splashscreenImage;
    // End of variables declaration//GEN-END:variables
}
