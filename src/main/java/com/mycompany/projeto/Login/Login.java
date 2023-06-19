package com.mycompany.projeto.Login;

import com.mycompany.projeto.Dashboard.DashboardAdmin;
import com.mycompany.projeto.Dashboard.DashboardDoador;
import com.mycompany.projeto.Dashboard.DashboardDonatario;
import java.sql.*;
import javax.swing.JOptionPane;
import com.mycompany.projeto.JDBC.MySQL;
import com.mycompany.projeto.Register.Register;

public class Login extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    public static int IDUSUARIO;  

    //Método logar
    public void logar() {
        String sql = "select * from tblUsuario where email=? and senha=?";
        try {
            //as linhas a baixo preparam a consulta ao banco de dados
            //em função do que foi digitado nas caixas de texto.
            pst = connection.prepareStatement(sql);
            pst.setString(1, txtUsernameLogin.getText());
            //Modo mais seguro de capturar a senha
            String captura = new String(txtPasswordLogin.getPassword());
            pst.setString(2, captura);

            //Linha a baixo executa a query(consulta ao banco)
            rs = pst.executeQuery();

            //se existir usuário e senha correspondente
            if (rs.next()) {
                //A linha a baixo obtem o conteúdo do campo perfil da tabela Usuario
                String perfil = rs.getString(12);
                int idUsuario = rs.getInt(1);
                IDUSUARIO = idUsuario;
                //DonatarioPerfil.IDUARIO = idUsuario;
                //System.out.println(perfil);
                switch (perfil) {
                    case "admin":
                        DashboardAdmin dashboardAdmin = new DashboardAdmin();
                        dashboardAdmin.setVisible(true);
                        //Codigo abaixo mostra o nome do perfil logado
                        DashboardAdmin.lblNomeUsuario.setText(rs.getString(2));
                        //Ao chamar a tela Dashboard a tela de login automaticamente é fechada
                        this.dispose();
                        //Fechar conexão com o banco de dados
                        connection.close();
                        break;
                    case "donatario":
                        DashboardDonatario dashboardDonatario = new DashboardDonatario();
                        dashboardDonatario.setVisible(true);
                        //Codigo abaixo mostra o nome do perfil logado
                        DashboardDonatario.lblNomeUsuario.setText(rs.getString(2));
                        //Ao chamar a tela Dashboard a tela de login automaticamente é fechada
                        this.dispose();
                        //Fechar conexão com o banco de dados
                        connection.close();
                        break;
                    case "doador":
                        DashboardDoador dashboardDoador = new DashboardDoador();
                        dashboardDoador.setVisible(true);
                        //Codigo abaixo mostra o nome do perfil logado
                        dashboardDoador.lblNomeUsuario.setText(rs.getString(2));
                        //Ao chamar a tela Dashboard a tela de login automaticamente é fechada
                        this.dispose();
                        //Fechar conexão com o banco de dados
                        connection.close();
                        break;
                    default:
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário e/ou senha inválido(s)");
                Login login = new Login();
                login.setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public Login() {
        initComponents();
        connection = MySQL.conector();
        System.out.println(connection);
    }// FIM Construtor

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBackgroundIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtUsernameLogin = new javax.swing.JTextField();
        lblUnderscore = new javax.swing.JLabel();
        lblUserIcon = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPasswordLogin = new javax.swing.JPasswordField();
        lblUnderscore2 = new javax.swing.JLabel();
        lblDisableIcon = new javax.swing.JLabel();
        lblShowIcon = new javax.swing.JLabel();
        chkRemember = new javax.swing.JCheckBox();
        lblForgetPass = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnSingUp = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBackgroundIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\seeds.png")); // NOI18N
        jPanel1.add(lblBackgroundIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 420, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 440));

        jPanel2.setBackground(new java.awt.Color(25, 118, 211));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel2.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 29));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Login");
        jPanel2.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 420, 41));

        lblSubTitle.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblSubTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSubTitle.setText("Olá! vamos começar?");
        jPanel2.add(lblSubTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 420, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(199, 226, 255));
        lblEmail.setText("Email");
        jPanel2.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        txtUsernameLogin.setBackground(new java.awt.Color(25, 118, 211));
        txtUsernameLogin.setFont(txtUsernameLogin.getFont().deriveFont(txtUsernameLogin.getFont().getSize()+2f));
        txtUsernameLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameLogin.setBorder(null);
        txtUsernameLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameLoginActionPerformed(evt);
            }
        });
        jPanel2.add(txtUsernameLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 140, 240, 30));

        lblUnderscore.setForeground(new java.awt.Color(255, 255, 255));
        lblUnderscore.setText("_________________________________________");
        jPanel2.add(lblUnderscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 290, 39));

        lblUserIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUserIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\usericon.png")); // NOI18N
        jPanel2.add(lblUserIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 147, 40, 39));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(199, 226, 255));
        lblPassword.setText("Senha");
        jPanel2.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        txtPasswordLogin.setBackground(new java.awt.Color(25, 118, 211));
        txtPasswordLogin.setFont(txtPasswordLogin.getFont().deriveFont(txtPasswordLogin.getFont().getSize()+2f));
        txtPasswordLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordLogin.setBorder(null);
        txtPasswordLogin.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtPasswordLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 240, 30));

        lblUnderscore2.setForeground(new java.awt.Color(255, 255, 255));
        lblUnderscore2.setText("_________________________________________");
        jPanel2.add(lblUnderscore2, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 216, 290, 40));

        lblDisableIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDisableIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\eyeclose.png")); // NOI18N
        lblDisableIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDisableIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDisableIconMouseClicked(evt);
            }
        });
        jPanel2.add(lblDisableIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40));

        lblShowIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblShowIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\eyeopen.png")); // NOI18N
        lblShowIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblShowIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblShowIconMouseClicked(evt);
            }
        });
        jPanel2.add(lblShowIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 216, 40, 40));

        chkRemember.setBackground(new java.awt.Color(25, 118, 211));
        chkRemember.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        chkRemember.setForeground(new java.awt.Color(199, 226, 255));
        chkRemember.setText("Lembrar senha");
        jPanel2.add(chkRemember, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 261, -1, -1));

        lblForgetPass.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblForgetPass.setForeground(new java.awt.Color(199, 226, 255));
        lblForgetPass.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblForgetPass.setText("Esqueceu a senha?");
        lblForgetPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(lblForgetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 261, 121, 27));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(25, 118, 211));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel2.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 306, 341, 40));

        btnSingUp.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnSingUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSingUp.setText("Cadastrar-se");
        btnSingUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSingUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSingUpMouseClicked(evt);
            }
        });
        jPanel2.add(btnSingUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 357, 122, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(199, 226, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Não possui uma conta?");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 357, 213, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 420, 440));

        setSize(new java.awt.Dimension(916, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblDisableIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDisableIconMouseClicked
        txtPasswordLogin.setEchoChar((char) 0);
        lblDisableIcon.setVisible(false);
        lblDisableIcon.setEnabled(false);
        lblShowIcon.setEnabled(true);
        lblShowIcon.setEnabled(true);
    }//GEN-LAST:event_lblDisableIconMouseClicked

    private void lblShowIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowIconMouseClicked
        txtPasswordLogin.setEchoChar((char) 8226);
        lblDisableIcon.setVisible(true);
        lblDisableIcon.setEnabled(true);
        lblShowIcon.setEnabled(false);
        lblShowIcon.setEnabled(false);
    }//GEN-LAST:event_lblShowIconMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnSingUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSingUpMouseClicked
        // TODO add your handling code here:
        Register register = new Register();
        this.dispose();
        register.setVisible(true);
    }//GEN-LAST:event_btnSingUpMouseClicked

    private void txtUsernameLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameLoginActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUsernameLoginActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //status();
    }//GEN-LAST:event_formWindowActivated

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Chamando o método logar
        logar();
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel btnSingUp;
    private javax.swing.JCheckBox chkRemember;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBackgroundIcon;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblDisableIcon;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblForgetPass;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblShowIcon;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUnderscore;
    private javax.swing.JLabel lblUnderscore2;
    private javax.swing.JLabel lblUserIcon;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUsernameLogin;
    // End of variables declaration//GEN-END:variables
}
