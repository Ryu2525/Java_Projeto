
package view;

import controller.ControllerLogin;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

/**
 *
 * @author Julian Ryu Takeda
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        control = new ControllerLogin(this);
    }

    public ControllerLogin getControl() {
        return control;
    }

    public void setControl(ControllerLogin control) {
        this.control = control;
    }

    public JLabel getUsuarioNaoExiste() {
        return UsuarioNaoExiste;
    }

    public void setUsuarioNaoExiste(JLabel UsuarioNaoExiste) {
        this.UsuarioNaoExiste = UsuarioNaoExiste;
    }

    public JButton getBtLogin() {
        return btLogin;
    }

    public void setBtLogin(JButton btLogin) {
        this.btLogin = btLogin;
    }

    public JMenuItem getIrCadastrar() {
        return irCadastrar;
    }

    public void setIrCadastrar(JMenuItem irCadastrar) {
        this.irCadastrar = irCadastrar;
    }

    public JMenu getjCadastrar() {
        return jCadastrar;
    }

    public void setjCadastrar(JMenu jCadastrar) {
        this.jCadastrar = jCadastrar;
    }

    public JMenuBar getjMenuBar1() {
        return jMenuBar1;
    }

    public void setjMenuBar1(JMenuBar jMenuBar1) {
        this.jMenuBar1 = jMenuBar1;
    }

    public JLabel getLblCpf() {
        return lblCpf;
    }

    public void setLblCpf(JLabel lblCpf) {
        this.lblCpf = lblCpf;
    }

    public JLabel getLblSenhaLogin() {
        return lblSenhaLogin;
    }

    public void setLblSenhaLogin(JLabel lblSenhaLogin) {
        this.lblSenhaLogin = lblSenhaLogin;
    }

    public JLabel getLblTitulo() {
        return lblTitulo;
    }

    public void setLblTitulo(JLabel lblTitulo) {
        this.lblTitulo = lblTitulo;
    }

    public JTextField getTxtCpfLogin() {
        return txtCpfLogin;
    }

    public void setTxtCpfLogin(JTextField txtCpfLogin) {
        this.txtCpfLogin = txtCpfLogin;
    }

    public JTextField getTxtSenha() {
        return txtSenha;
    }

    public void setTxtSenha(JTextField txtSenha) {
        this.txtSenha = txtSenha;
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblSenhaLogin = new javax.swing.JLabel();
        txtCpfLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        UsuarioNaoExiste = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastrar = new javax.swing.JMenu();
        irCadastrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Login");

        lblCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCpf.setText("CPF:");

        lblSenhaLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSenhaLogin.setText("Senha:");

        btLogin.setText("Login");
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        jCadastrar.setText("Cadastrar");

        irCadastrar.setText("Cadastro");
        jCadastrar.add(irCadastrar);

        jMenuBar1.add(jCadastrar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsuarioNaoExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblSenhaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCpfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtCpfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSenhaLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(UsuarioNaoExiste, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        control.LoginAluno();
    }//GEN-LAST:event_btLoginActionPerformed

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
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Login().setVisible(true);
//            }
//        });
//    }
    
    private ControllerLogin control;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UsuarioNaoExiste;
    private javax.swing.JButton btLogin;
    private javax.swing.JMenuItem irCadastrar;
    private javax.swing.JMenu jCadastrar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblSenhaLogin;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCpfLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
