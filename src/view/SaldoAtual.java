
package view;

import javax.swing.JLabel;
import javax.swing.JPanel;
import model.Investidor;

/**
 *
 * @author ryuta
 */
public class SaldoAtual extends javax.swing.JFrame {

    
    public SaldoAtual(Investidor investidor) {
        initComponents();
        lblNome.setText(investidor.getNome());
        lblCpf.setText(investidor.getCpf());
        double valor = investidor.getCarteira().getMoeda().get(0).getValor();
        lblReal.setText(String.valueOf(valor));
        double valor2 = investidor.getCarteira().getMoeda().get(1).getValor();
        lblBit.setText(String.valueOf(valor2));
        double valor3 = investidor.getCarteira().getMoeda().get(2).getValor();
        lblEthereum.setText(String.valueOf(valor3));
        double valor4 = investidor.getCarteira().getMoeda().get(3).getValor();
        lblRipple.setText(String.valueOf(valor4));
    }

    public JLabel getCpf() {
        return Cpf;
    }

    public void setCpf(JLabel Cpf) {
        this.Cpf = Cpf;
    }

    public JLabel getNome() {
        return Nome;
    }

    public void setNome(JLabel Nome) {
        this.Nome = Nome;
    }

    public JLabel getBitcoin() {
        return bitcoin;
    }

    public void setBitcoin(JLabel bitcoin) {
        this.bitcoin = bitcoin;
    }

    public JLabel getEthereum() {
        return ethereum;
    }

    public void setEthereum(JLabel ethereum) {
        this.ethereum = ethereum;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getLblBit() {
        return lblBit;
    }

    public void setLblBit(JLabel lblBit) {
        this.lblBit = lblBit;
    }

    public JLabel getLblCpf() {
        return lblCpf;
    }

    public void setLblCpf(JLabel lblCpf) {
        this.lblCpf = lblCpf;
    }

    public JLabel getLblEthereum() {
        return lblEthereum;
    }

    public void setLblEthereum(JLabel lblEthereum) {
        this.lblEthereum = lblEthereum;
    }

    public JLabel getLblNome() {
        return lblNome;
    }

    public void setLblNome(JLabel lblNome) {
        this.lblNome = lblNome;
    }

    public JLabel getLblReal() {
        return lblReal;
    }

    public void setLblReal(JLabel lblReal) {
        this.lblReal = lblReal;
    }

    public JLabel getLblRipple() {
        return lblRipple;
    }

    public void setLblRipple(JLabel lblRipple) {
        this.lblRipple = lblRipple;
    }

    public JLabel getReal() {
        return real;
    }

    public void setReal(JLabel real) {
        this.real = real;
    }

    public JLabel getRipple() {
        return ripple;
    }

    public void setRipple(JLabel ripple) {
        this.ripple = ripple;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Nome = new javax.swing.JLabel();
        Cpf = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        real = new javax.swing.JLabel();
        bitcoin = new javax.swing.JLabel();
        ethereum = new javax.swing.JLabel();
        ripple = new javax.swing.JLabel();
        lblReal = new javax.swing.JLabel();
        lblBit = new javax.swing.JLabel();
        lblEthereum = new javax.swing.JLabel();
        lblRipple = new javax.swing.JLabel();

        Nome.setText("Nome:");

        Cpf.setText("CPF:");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        real.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        real.setText("Reais:");

        bitcoin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bitcoin.setText("Bitcoin:");

        ethereum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ethereum.setText("Ethereum:");

        ripple.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ripple.setText("Ripple:");

        lblReal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblBit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblEthereum.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        lblRipple.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(real, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bitcoin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ethereum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ripple, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReal, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBit, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEthereum, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRipple, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(real)
                    .addComponent(lblReal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bitcoin)
                    .addComponent(lblBit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ethereum)
                    .addComponent(lblEthereum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ripple)
                    .addComponent(lblRipple))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
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
//            java.util.logging.Logger.getLogger(SaldoAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(SaldoAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(SaldoAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(SaldoAtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new SaldoAtual().setVisible(true);
//            }
//        });
//    }
    private Investidor investidor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cpf;
    private javax.swing.JLabel Nome;
    private javax.swing.JLabel bitcoin;
    private javax.swing.JLabel ethereum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBit;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEthereum;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblReal;
    private javax.swing.JLabel lblRipple;
    private javax.swing.JLabel real;
    private javax.swing.JLabel ripple;
    // End of variables declaration//GEN-END:variables
}
