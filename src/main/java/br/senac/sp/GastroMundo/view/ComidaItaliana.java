/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senac.sp.GastroMundo.view;

/**
 *
 * @author henri
 */
public class ComidaItaliana extends javax.swing.JFrame {

    /**
     * Creates new form ComidaItaliana
     */
    public ComidaItaliana() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("      Pizza Marguerita");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 150, 220, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("             SPAGHETTI");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 410, 240, 20);

        jLabel4.setText("Descrics");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 520, 140, 16);

        jLabel5.setText("Descrics");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 250, 140, 16);

        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Spaghetti (1).jpg"))); // NOI18N
        jToggleButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jToggleButton3);
        jToggleButton3.setBounds(80, 410, 270, 240);

        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Pizza (1).jpg"))); // NOI18N
        jToggleButton4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jToggleButton4);
        jToggleButton4.setBounds(80, 140, 270, 240);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Cardapio Italia 75.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 750, 970);

        setSize(new java.awt.Dimension(771, 980));
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(ComidaItaliana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComidaItaliana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComidaItaliana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComidaItaliana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComidaItaliana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
