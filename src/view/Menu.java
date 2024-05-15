
package view;

import controller.Controller;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import model.Investidor;
import model.Pessoa;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Menu extends javax.swing.JFrame {

//Construtor
    public Menu(Pessoa pessoa) {
        initComponents();
        lblNome.setText(pessoa.getNome());
        lblCpf.setText(pessoa.getCpf());
        control = new Controller(this, pessoa);
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

    public Controller getControl() {
        return control;
    }

    public void setControl(Controller control) {
        this.control = control;
    }

    public JRadioButton getjExcluir() {
        return jExcluir;
    }

    public void setjExcluir(JRadioButton jExcluir) {
        this.jExcluir = jExcluir;
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
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        jExcluir = new javax.swing.JRadioButton();

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
        jDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDepositarActionPerformed(evt);
            }
        });

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
        jAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAtualizarActionPerformed(evt);
            }
        });

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

        lblNome.setText("Nome");

        lblCpf.setText("CPF");

        btMenu.add(jExcluir);
        jExcluir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jExcluir.setText("Excluir conta");
        jExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(lblTitulo))
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
                            .addComponent(jSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblNaoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNome, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btEscolher)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExtrato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDepositar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSacar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComprar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jVender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSair)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEscolher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblNaoEscolhido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Funcao
    private void btEscolherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEscolherActionPerformed
        lblNaoEscolhido.setText("");
        control.verificarEscolha();
    }//GEN-LAST:event_btEscolherActionPerformed

    private void jExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jExcluirActionPerformed

    private void jDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDepositarActionPerformed
        
    }//GEN-LAST:event_jDepositarActionPerformed

    private void jAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAtualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAtualizarActionPerformed

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
    private javax.swing.JRadioButton jExcluir;
    private javax.swing.JRadioButton jExtrato;
    private javax.swing.JRadioButton jSacar;
    private javax.swing.JRadioButton jSair;
    private javax.swing.JRadioButton jSaldo;
    private javax.swing.JRadioButton jVender;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNaoEscolhido;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
