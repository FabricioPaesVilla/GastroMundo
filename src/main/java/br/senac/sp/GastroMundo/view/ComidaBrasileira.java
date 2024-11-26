/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.senac.sp.GastroMundo.view;

import javax.swing.ImageIcon;
import java.awt.Image;


/**
 *
 * @author henri
 */
public class ComidaBrasileira extends javax.swing.JFrame {

    /**
     * Creates new form ComidaBrasileira
     */
    public ComidaBrasileira() {
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
        jlbFeijoada = new javax.swing.JLabel();
        btnFeijoada = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText(" Descrição com ingredientes e preço");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 640, 260, 50);

        jlbFeijoada.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbFeijoada.setText("               FEIJOADA");
        getContentPane().add(jlbFeijoada);
        jlbFeijoada.setBounds(60, 190, 240, 25);

        btnFeijoada.setBackground(new java.awt.Color(102, 102, 102));
        btnFeijoada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/feijoada.jpg"))); // NOI18N
        btnFeijoada.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnFeijoada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeijoadaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFeijoada);
        btnFeijoada.setBounds(50, 190, 260, 200);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("         Arroz Carreteiro");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 470, 230, 25);

        jLabel4.setText("Descrição com ingredientes e preço");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(320, 310, 260, 50);

        jToggleButton2.setBackground(new java.awt.Color(102, 102, 102));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/Arroz Carreteiro.jpg"))); // NOI18N
        jToggleButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jToggleButton2);
        jToggleButton2.setBounds(50, 460, 260, 240);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/META-INF/CardapioBrasil 75.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 756, 970);

        setSize(new java.awt.Dimension(771, 980));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFeijoadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeijoadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFeijoadaActionPerformed

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
            java.util.logging.Logger.getLogger(ComidaBrasileira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComidaBrasileira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComidaBrasileira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComidaBrasileira.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComidaBrasileira().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnFeijoada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel jlbFeijoada;
    // End of variables declaration//GEN-END:variables
}
