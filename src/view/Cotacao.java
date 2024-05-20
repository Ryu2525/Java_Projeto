/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCotacao;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import model.Investidor;

/**
 *
 * @author ryuta
 */
public class Cotacao extends javax.swing.JFrame {

    Random gerador = new Random();
    ArrayList<Double> cotacao = new ArrayList<>();
    
    public Cotacao(Investidor investidor ) {
        initComponents();
        
        cotacao.add(0.05);
        cotacao.add(0.04);
        cotacao.add(0.03);
        cotacao.add(0.02);
        cotacao.add(0.01);
        cotacao.add(0.00);
        cotacao.add(-0.01);
        cotacao.add(-0.02);
        cotacao.add(-0.03);
        cotacao.add(-0.04);
        cotacao.add(-0.05);
        
        int num = gerador.nextInt(11);
        double numero = cotacao.get(num);
        
        controll = new ControllerCotacao(this, investidor, numero);
    }

    public ControllerCotacao getControll() {
        return controll;
    }

    public void setControll(ControllerCotacao controll) {
        this.controll = controll;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLblBitcoin() {
        return lblBitcoin;
    }

    public void setLblBitcoin(JLabel lblBitcoin) {
        this.lblBitcoin = lblBitcoin;
    }

    public JLabel getLblEthereum() {
        return lblEthereum;
    }

    public void setLblEthereum(JLabel lblEthereum) {
        this.lblEthereum = lblEthereum;
    }

    public JLabel getLblRipple() {
        return lblRipple;
    }

    public void setLblRipple(JLabel lblRipple) {
        this.lblRipple = lblRipple;
    }

    public JLabel getLblValorBitcoin() {
        return lblValorBitcoin;
    }

    public void setLblValorBitcoin(JLabel lblValorBitcoin) {
        this.lblValorBitcoin = lblValorBitcoin;
    }

    public JLabel getLblValorEthereum() {
        return lblValorEthereum;
    }

    public void setLblValorEthereum(JLabel lblValorEthereum) {
        this.lblValorEthereum = lblValorEthereum;
    }

    public JLabel getLblValorRipple() {
        return lblValorRipple;
    }

    public void setLblValorRipple(JLabel lblValorRipple) {
        this.lblValorRipple = lblValorRipple;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblBitcoin = new javax.swing.JLabel();
        lblEthereum = new javax.swing.JLabel();
        lblRipple = new javax.swing.JLabel();
        lblValorBitcoin = new javax.swing.JLabel();
        lblValorRipple = new javax.swing.JLabel();
        lblValorEthereum = new javax.swing.JLabel();
        btNovaCotacao = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Valores das moedas com cotação");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblBitcoin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblBitcoin.setText("Bitcoin");

        lblEthereum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEthereum.setText("Ethereum");

        lblRipple.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRipple.setText("Ripple");

        lblValorBitcoin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorBitcoin.setText("Valor");

        lblValorRipple.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorRipple.setText("Valor");

        lblValorEthereum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblValorEthereum.setText("Valor");

        btNovaCotacao.setText("Nova Cotacao");
        btNovaCotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNovaCotacaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblRipple, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblValorBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorRipple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValorEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(87, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btNovaCotacao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(lblValorBitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(lblValorEthereum, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRipple, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(lblValorRipple, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addComponent(btNovaCotacao)
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNovaCotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNovaCotacaoActionPerformed
        controll.valoresCotacoa();
    }//GEN-LAST:event_btNovaCotacaoActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Cotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Cotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Cotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Cotacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Cotacao().setVisible(true);
//            }
//        });
//    }
    ControllerCotacao controll;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btNovaCotacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBitcoin;
    private javax.swing.JLabel lblEthereum;
    private javax.swing.JLabel lblRipple;
    private javax.swing.JLabel lblValorBitcoin;
    private javax.swing.JLabel lblValorEthereum;
    private javax.swing.JLabel lblValorRipple;
    // End of variables declaration//GEN-END:variables
}