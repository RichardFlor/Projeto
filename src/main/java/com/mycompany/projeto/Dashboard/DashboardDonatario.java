package com.mycompany.projeto.Dashboard;


import java.awt.BorderLayout;
import com.mycompany.projeto.Login.Login;

public class DashboardDonatario extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public DashboardDonatario() {
        initComponents();

        //Codigo para mostrar a tela de estoque para o admin
        Doacoes solicitacao = new Doacoes();
        solicitacao.setSize(880, 590);
        solicitacao.setLocation(0, 0);

        content.removeAll();
        content.add(solicitacao, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblDonatario = new javax.swing.JLabel();
        lblBemVindo = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblIconPerfil = new javax.swing.JLabel();
        lblSolicitacao = new javax.swing.JLabel();
        btnMeuPerfil = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        btnSolicitacao = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(25, 118, 211));
        jPanel1.setMinimumSize(new java.awt.Dimension(166, 296));
        jPanel1.setPreferredSize(new java.awt.Dimension(166, 296));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("_________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        lblDonatario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDonatario.setForeground(new java.awt.Color(242, 242, 242));
        lblDonatario.setText("Donatário");
        jPanel1.add(lblDonatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 90, -1));

        lblBemVindo.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(242, 242, 242));
        lblBemVindo.setText("Bem Vindo ");
        jPanel1.add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 20));

        lblNomeUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(242, 242, 242));
        lblNomeUsuario.setText("nome");
        jPanel1.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lblIconPerfil.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconPerfil.png")); // NOI18N
        jPanel1.add(lblIconPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        lblSolicitacao.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconEstoque.png")); // NOI18N
        jPanel1.add(lblSolicitacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        btnMeuPerfil.setBackground(new java.awt.Color(25, 118, 211));
        btnMeuPerfil.setBorder(null);
        btnMeuPerfil.setForeground(new java.awt.Color(242, 242, 242));
        btnMeuPerfil.setText("MEU PERFIL");
        btnMeuPerfil.setBorderColor(new java.awt.Color(25, 118, 211));
        btnMeuPerfil.setColor(new java.awt.Color(25, 118, 211));
        btnMeuPerfil.setColorClick(new java.awt.Color(0, 51, 153));
        btnMeuPerfil.setColorOver(new java.awt.Color(0, 51, 153));
        btnMeuPerfil.setFocusable(false);
        btnMeuPerfil.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnMeuPerfil.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMeuPerfil.setMaximumSize(new java.awt.Dimension(566, 512));
        btnMeuPerfil.setMinimumSize(new java.awt.Dimension(566, 512));
        btnMeuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeuPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(btnMeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 100));

        btnSolicitacao.setBackground(new java.awt.Color(25, 118, 211));
        btnSolicitacao.setBorder(null);
        btnSolicitacao.setForeground(new java.awt.Color(242, 242, 242));
        btnSolicitacao.setText("SOLICITAÇÃO");
        btnSolicitacao.setBorderColor(new java.awt.Color(25, 118, 211));
        btnSolicitacao.setColor(new java.awt.Color(25, 118, 211));
        btnSolicitacao.setColorClick(new java.awt.Color(0, 51, 153));
        btnSolicitacao.setColorOver(new java.awt.Color(0, 51, 153));
        btnSolicitacao.setFocusable(false);
        btnSolicitacao.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnSolicitacao.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSolicitacao.setMaximumSize(new java.awt.Dimension(566, 512));
        btnSolicitacao.setMinimumSize(new java.awt.Dimension(566, 512));
        btnSolicitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitacaoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 590));

        content.setPreferredSize(new java.awt.Dimension(880, 590));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 880, 590));

        setSize(new java.awt.Dimension(1120, 590));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnSolicitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitacaoActionPerformed
        //Codigo para mostrar a tela de solicitaçoes para o donatario
        Doacoes solicitacao = new Doacoes();
        solicitacao.setSize(880, 590);
        solicitacao.setLocation(0, 0);

        content.removeAll();
        content.add(solicitacao, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnSolicitacaoActionPerformed

    private void btnMeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuPerfilActionPerformed
        //Codigo para mostrar a tela de perfil para o donatario
        DonatarioPerfil perfil = new DonatarioPerfil();
        perfil.setSize(880, 590);
        perfil.setLocation(0, 0);

        content.removeAll();
        content.add(perfil, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnMeuPerfilActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardDonatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardDonatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardDonatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardDonatario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardDonatario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnMeuPerfil;
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnSolicitacao;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblDonatario;
    private javax.swing.JLabel lblIconPerfil;
    public static javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblSolicitacao;
    // End of variables declaration//GEN-END:variables
}
