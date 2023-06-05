package com.mycompany.projeto.Dashboard;

import java.awt.BorderLayout;
import com.mycompany.projeto.Login.Login;

public class DashboardDoador extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public DashboardDoador() {
        initComponents();
        //Codigo para mostrar a tela de itens para o doador
        DoadorItens itens = new DoadorItens();
        itens.setSize(880, 530);
        itens.setLocation(0, 0);

        content.removeAll();
        content.add(itens, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblTypeUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnMeuPerfil = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        btnItens = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        txtPesquisa = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblClose2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
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

        jLabel2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 242, 242));
        jLabel2.setText("Doador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(242, 242, 242));
        jLabel4.setText("Bem Vindo ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 20));

        lblTypeUser.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTypeUser.setForeground(new java.awt.Color(242, 242, 242));
        lblTypeUser.setText("nome");
        jPanel1.add(lblTypeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconPerfil.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconEstoque.png")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

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

        btnItens.setBackground(new java.awt.Color(25, 118, 211));
        btnItens.setBorder(null);
        btnItens.setForeground(new java.awt.Color(242, 242, 242));
        btnItens.setText("ITENS");
        btnItens.setBorderColor(new java.awt.Color(25, 118, 211));
        btnItens.setBorderPainted(false);
        btnItens.setColor(new java.awt.Color(25, 118, 211));
        btnItens.setColorClick(new java.awt.Color(0, 51, 153));
        btnItens.setColorOver(new java.awt.Color(0, 51, 153));
        btnItens.setFocusable(false);
        btnItens.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnItens.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnItens.setMaximumSize(new java.awt.Dimension(566, 512));
        btnItens.setMinimumSize(new java.awt.Dimension(566, 512));
        btnItens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItensActionPerformed(evt);
            }
        });
        jPanel1.add(btnItens, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 590));

        txtPesquisa.setBackground(new java.awt.Color(235, 235, 235));
        txtPesquisa.setText(" ");
        txtPesquisa.setBorder(null);
        txtPesquisa.setDisabledTextColor(new java.awt.Color(208, 211, 210));
        getContentPane().add(txtPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 270, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconLupa.png")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 30));

        lblClose.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblClose.setForeground(new java.awt.Color(25, 118, 211));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("Seeds");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setName(""); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 10, 90, 29));

        lblClose2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblClose2.setForeground(new java.awt.Color(255, 255, 255));
        lblClose2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconSair.png")); // NOI18N
        lblClose2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose2.setName(""); // NOI18N
        lblClose2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClose2MouseClicked(evt);
            }
        });
        getContentPane().add(lblClose2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 40, 29));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFocusable(false);
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 880, 60));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );

        getContentPane().add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 880, 530));

        setSize(new java.awt.Dimension(1117, 588));
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

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        Login login = new Login();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void btnMeuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeuPerfilActionPerformed
        //Codigo para mostrar a tela de perfil para o doador
        DoadorPerfil perfil = new DoadorPerfil();
        perfil.setSize(880, 530);
        perfil.setLocation(0, 0);

        content.removeAll();
        content.add(perfil, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnMeuPerfilActionPerformed

    private void btnItensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItensActionPerformed
        //Codigo para mostrar a tela de itens para o doador
        DoadorItens itens = new DoadorItens();
        itens.setSize(880, 530);
        itens.setLocation(0, 0);

        content.removeAll();
        content.add(itens, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnItensActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardDoador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new DashboardDoador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnItens;
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnMeuPerfil;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblClose2;
    public static javax.swing.JLabel lblTypeUser;
    private javax.swing.JTextField txtPesquisa;
    // End of variables declaration//GEN-END:variables
}