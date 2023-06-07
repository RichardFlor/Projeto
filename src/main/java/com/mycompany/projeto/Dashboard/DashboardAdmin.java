package com.mycompany.projeto.Dashboard;


import java.awt.BorderLayout;
import com.mycompany.projeto.Login.Login;

public class DashboardAdmin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public DashboardAdmin() {
        initComponents();

        //Codigo para mostrar a tela de estoque para o admin
        AdminEstoque estoque = new AdminEstoque();
        estoque.setSize(880, 590);
        estoque.setLocation(0, 0);

        content.removeAll();
        content.add(estoque, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        lblAdministrador = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        lblIconEstoque = new javax.swing.JLabel();
        lblIconDoador = new javax.swing.JLabel();
        lblIconDonatario = new javax.swing.JLabel();
        lblIconCesta = new javax.swing.JLabel();
        btnDonatario = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        btnEstoque = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        btnDoadores = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
        btnCesta = new com.mycompany.projeto.ButtonCustom.ButtonRadius();
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblBemVindo.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        lblBemVindo.setForeground(new java.awt.Color(242, 242, 242));
        lblBemVindo.setText("Bem Vindo ");
        jPanel1.add(lblBemVindo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 80, 20));

        lblAdministrador.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblAdministrador.setForeground(new java.awt.Color(242, 242, 242));
        lblAdministrador.setText("Administrador");
        jPanel1.add(lblAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel3.setForeground(new java.awt.Color(242, 242, 242));
        jLabel3.setText("_________________________");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, 20));

        lblNomeUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(242, 242, 242));
        lblNomeUsuario.setText("nome");
        jPanel1.add(lblNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        lblIconEstoque.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconEstoque.png")); // NOI18N
        jPanel1.add(lblIconEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, 30));

        lblIconDoador.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconDoador.png")); // NOI18N
        jPanel1.add(lblIconDoador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        lblIconDonatario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconDonatario.png")); // NOI18N
        jPanel1.add(lblIconDonatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        lblIconCesta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconDonatario.png")); // NOI18N
        jPanel1.add(lblIconCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        btnDonatario.setBackground(new java.awt.Color(25, 118, 211));
        btnDonatario.setBorder(null);
        btnDonatario.setForeground(new java.awt.Color(242, 242, 242));
        btnDonatario.setText("DONATARIOS");
        btnDonatario.setToolTipText("");
        btnDonatario.setAutoscrolls(true);
        btnDonatario.setBorderColor(new java.awt.Color(25, 118, 211));
        btnDonatario.setColor(new java.awt.Color(25, 118, 211));
        btnDonatario.setColorClick(new java.awt.Color(0, 51, 153));
        btnDonatario.setColorOver(new java.awt.Color(0, 51, 153));
        btnDonatario.setFocusable(false);
        btnDonatario.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnDonatario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDonatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonatarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnDonatario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 240, 100));

        btnEstoque.setBackground(new java.awt.Color(25, 118, 211));
        btnEstoque.setBorder(null);
        btnEstoque.setForeground(new java.awt.Color(242, 242, 242));
        btnEstoque.setText("ESTOQUE");
        btnEstoque.setAutoscrolls(true);
        btnEstoque.setBorderColor(new java.awt.Color(25, 118, 211));
        btnEstoque.setColor(new java.awt.Color(25, 118, 211));
        btnEstoque.setColorClick(new java.awt.Color(0, 51, 153));
        btnEstoque.setColorOver(new java.awt.Color(0, 51, 153));
        btnEstoque.setFocusable(false);
        btnEstoque.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnEstoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 240, 100));

        btnDoadores.setBackground(new java.awt.Color(25, 118, 211));
        btnDoadores.setBorder(null);
        btnDoadores.setForeground(new java.awt.Color(242, 242, 242));
        btnDoadores.setText("DOADORES");
        btnDoadores.setAutoscrolls(true);
        btnDoadores.setBorderColor(new java.awt.Color(25, 118, 211));
        btnDoadores.setColor(new java.awt.Color(25, 118, 211));
        btnDoadores.setColorClick(new java.awt.Color(0, 51, 153));
        btnDoadores.setColorOver(new java.awt.Color(0, 51, 153));
        btnDoadores.setFocusable(false);
        btnDoadores.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnDoadores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoadoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnDoadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 240, 100));

        btnCesta.setBackground(new java.awt.Color(25, 118, 211));
        btnCesta.setBorder(null);
        btnCesta.setForeground(new java.awt.Color(242, 242, 242));
        btnCesta.setText("CESTAS");
        btnCesta.setToolTipText("");
        btnCesta.setAutoscrolls(true);
        btnCesta.setBorderColor(new java.awt.Color(25, 118, 211));
        btnCesta.setColor(new java.awt.Color(25, 118, 211));
        btnCesta.setColorClick(new java.awt.Color(0, 51, 153));
        btnCesta.setColorOver(new java.awt.Color(0, 51, 153));
        btnCesta.setFocusable(false);
        btnCesta.setFont(new java.awt.Font("Sitka Small", 0, 14)); // NOI18N
        btnCesta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCesta.setMaximumSize(new java.awt.Dimension(98, 18));
        btnCesta.setMinimumSize(new java.awt.Dimension(98, 18));
        jPanel1.add(btnCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 240, 110));

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

        setSize(new java.awt.Dimension(1119, 589));
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

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        //Codigo para mostrar a tela de estoque para o admin
        AdminEstoque estoque = new AdminEstoque();
        estoque.setSize(880, 590);
        estoque.setLocation(0, 0);

        content.removeAll();
        content.add(estoque, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnDoadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoadoresActionPerformed
        //Codigo para mostrar a tela de doador para o admin
        AdminDoador doador = new AdminDoador();
        doador.setSize(880, 590);
        doador.setLocation(0, 0);

        content.removeAll();
        content.add(doador, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnDoadoresActionPerformed

    private void btnDonatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonatarioActionPerformed
        //Codigo para mostrar a tela de donatario para o admin
        AdminDonatario donatario = new AdminDonatario();
        donatario.setSize(880, 590);
        donatario.setLocation(0, 0);

        content.removeAll();
        content.add(donatario, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btnDonatarioActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnCesta;
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnDoadores;
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnDonatario;
    private com.mycompany.projeto.ButtonCustom.ButtonRadius btnEstoque;
    private javax.swing.JPanel content;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAdministrador;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblIconCesta;
    private javax.swing.JLabel lblIconDoador;
    private javax.swing.JLabel lblIconDonatario;
    private javax.swing.JLabel lblIconEstoque;
    public static javax.swing.JLabel lblNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
