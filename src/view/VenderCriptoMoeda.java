
package view;

import controller.ControllerCompraDeCriptoMoedas;
import controller.ControllerVenderCriptoMoedas;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import model.Investidor;
import model.Pessoa;

/**
 *
 * @author ryuta
 */
public class VenderCriptoMoeda extends javax.swing.JFrame {

    /**
     * Creates new form VenderCriptoMoeda
     */
    public VenderCriptoMoeda(Investidor investidor, Pessoa pessoa, double bitcoin, double ethereum, double ripple) {
        initComponents();
        controll = new ControllerVenderCriptoMoedas(this, investidor, pessoa); 
        lblNome.setText(investidor.getNome());
        lblCpf.setText(investidor.getCpf());
        lblBitcoin.setText(String.format("%.2f", bitcoin));
        lblEthereum.setText(String.format("%.2f", ethereum));
        lblRipple.setText(String.format("%.2f", ripple));
    }

    public JRadioButton getBtBitcoin() {
        return btBitcoin;
    }

    public void setBtBitcoin(JRadioButton btBitcoin) {
        this.btBitcoin = btBitcoin;
    }

    public JButton getBtEscolher() {
        return btEscolher;
    }

    public void setBtEscolher(JButton btEscolher) {
        this.btEscolher = btEscolher;
    }

    public JRadioButton getBtEthereum() {
        return btEthereum;
    }

    public void setBtEthereum(JRadioButton btEthereum) {
        this.btEthereum = btEthereum;
    }

    public JRadioButton getBtRipple() {
        return btRipple;
    }

    public void setBtRipple(JRadioButton btRipple) {
        this.btRipple = btRipple;
    }

    public ButtonGroup getBtVenda() {
        return btVenda;
    }

    public void setBtVenda(ButtonGroup btVenda) {
        this.btVenda = btVenda;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getLblCpf() {
        return lblCpf;
    }

    public void setLblCpf(JLabel lblCpf) {
        this.lblCpf = lblCpf;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public ControllerVenderCriptoMoedas getControll() {
        return controll;
    }

    public void setControll(ControllerVenderCriptoMoedas controll) {
        this.controll = controll;
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

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btVenda = new javax.swing.ButtonGroup();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btBitcoin = new javax.swing.JRadioButton();
        btEthereum = new javax.swing.JRadioButton();
        btRipple = new javax.swing.JRadioButton();
        btEscolher = new javax.swing.JButton();
        lblBitcoin = new javax.swing.JLabel();
        lblEthereum = new javax.swing.JLabel();
        lblRipple = new javax.swing.JLabel();

        lblNome.setText("Nome");

        lblCpf.setText("CPF");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Venda");

        btVenda.add(btBitcoin);
        btBitcoin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btBitcoin.setText("Bitcoin");

        btVenda.add(btEthereum);
        btEthereum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btEthereum.setText("Ethereum");

        btVenda.add(btRipple);
        btRipple.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btRipple.setText("Ripple");

        btEscolher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEscolher.setText("Escolher");
        btEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEscolherActionPerformed(evt);
            }
        });

        lblBitcoin.setText("Valor da bitcoin");

        lblEthereum.setText("Valor do ethereum");

        lblRipple.setText("Valor do ripple");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btEscolher)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(150, 150, 150)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btRipple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblBitcoin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRipple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addGap(4, 4, 4)
                        .addComponent(lblCpf))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBitcoin)
                            .addComponent(lblBitcoin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btEthereum)
                            .addComponent(lblEthereum))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btRipple)
                            .addComponent(lblRipple))
                        .addGap(18, 18, 18)
                        .addComponent(btEscolher)))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscolherActionPerformed
        controll.verificarEscolha();
    }//GEN-LAST:event_btEscolherActionPerformed

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
//            java.util.logging.Logger.getLogger(VenderCriptoMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(VenderCriptoMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(VenderCriptoMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(VenderCriptoMoeda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new VenderCriptoMoeda().setVisible(true);
//            }
//        });
//    }
    ControllerVenderCriptoMoedas controll;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btBitcoin;
    private javax.swing.JButton btEscolher;
    private javax.swing.JRadioButton btEthereum;
    private javax.swing.JRadioButton btRipple;
    private javax.swing.ButtonGroup btVenda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBitcoin;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEthereum;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRipple;
    // End of variables declaration//GEN-END:variables
}
