
package view;

import controller.Controller;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Menu extends javax.swing.JFrame {

//Construtor
    public Menu() {
        initComponents();
        control = new Controller(this);
        
    }
// -----------------------------------------------------------------------------

//Get and Set
    public JButton getBtEscolher() {
        return btEscolher;
    }

    public void setBtEscolher(JButton btEscolher) {
        this.btEscolher = btEscolher;
    }

    public ButtonGroup getBtMenu() {
        return btMenu;
    }

    public void setBtMenu(ButtonGroup btMenu) {
        this.btMenu = btMenu;
    }

    public JRadioButton getjAtualizar() {
        return jAtualizar;
    }

    public void setjAtualizar(JRadioButton jAtualizar) {
        this.jAtualizar = jAtualizar;
    }

    public JRadioButton getjComprar() {
        return jComprar;
    }

    public void setjComprar(JRadioButton jComprar) {
        this.jComprar = jComprar;
    }

    public JRadioButton getjDepositar() {
        return jDepositar;
    }

    public void setjDepositar(JRadioButton jDepositar) {
        this.jDepositar = jDepositar;
    }

    public JRadioButton getjExtrato() {
        return jExtrato;
    }

    public void setjExtrato(JRadioButton jExtrato) {
        this.jExtrato = jExtrato;
    }

    public JRadioButton getjSacar() {
        return jSacar;
    }

    public void setjSacar(JRadioButton jSacar) {
        this.jSacar = jSacar;
    }

    public JRadioButton getjSair() {
        return jSair;
    }

    public void setjSair(JRadioButton jSair) {
        this.jSair = jSair;
    }

    public JRadioButton getjSaldo() {
        return jSaldo;
    }

    public void setjSaldo(JRadioButton jSaldo) {
        this.jSaldo = jSaldo;
    }

    public JRadioButton getjVender() {
        return jVender;
    }

    public void setjVender(JRadioButton jVender) {
        this.jVender = jVender;
    }

    public JLabel getLblNaoEscolhido() {
        return lblNaoEscolhido;
    }

    public void setLblNaoEscolhido(JLabel lblNaoEscolhido) {
        this.lblNaoEscolhido = lblNaoEscolhido;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }
//------------------------------------------------------------------------------
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btMenu = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        jSaldo = new javax.swing.JRadioButton();
        jExtrato = new javax.swing.JRadioButton();
        jDepositar = new javax.swing.JRadioButton();
        jSacar = new javax.swing.JRadioButton();
        jComprar = new javax.swing.JRadioButton();
        jVender = new javax.swing.JRadioButton();
        jAtualizar = new javax.swing.JRadioButton();
        jSair = new javax.swing.JRadioButton();
        btEscolher = new javax.swing.JButton();
        lblNaoEscolhido = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Menu");

        btMenu.add(jSaldo);
        jSaldo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSaldo.setText("Consultar saldo");

        btMenu.add(jExtrato);
        jExtrato.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jExtrato.setText("Consultar extrato");

        btMenu.add(jDepositar);
        jDepositar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jDepositar.setText("Depositar");

        btMenu.add(jSacar);
        jSacar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSacar.setText("Sacar");

        btMenu.add(jComprar);
        jComprar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jComprar.setText("Comprar criptomoeda");

        btMenu.add(jVender);
        jVender.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jVender.setText("Vender criptomoeda");

        btMenu.add(jAtualizar);
        jAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jAtualizar.setText("Atualizar cotação");

        btMenu.add(jSair);
        jSair.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jSair.setText("Sair");

        btEscolher.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btEscolher.setText("Escolher");
        btEscolher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEscolherActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSaldo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jExtrato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDepositar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSacar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComprar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jVender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jAtualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(btEscolher))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNaoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSaldo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jExtrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDepositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComprar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jVender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jAtualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEscolher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNaoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Funcao
    private void btEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscolherActionPerformed
        lblNaoEscolhido.setText("");
        control.verificarEscolha();
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
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    private Controller control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEscolher;
    private javax.swing.ButtonGroup btMenu;
    private javax.swing.JRadioButton jAtualizar;
    private javax.swing.JRadioButton jComprar;
    private javax.swing.JRadioButton jDepositar;
    private javax.swing.JRadioButton jExtrato;
    private javax.swing.JRadioButton jSacar;
    private javax.swing.JRadioButton jSair;
    private javax.swing.JRadioButton jSaldo;
    private javax.swing.JRadioButton jVender;
    private javax.swing.JLabel lblNaoEscolhido;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
