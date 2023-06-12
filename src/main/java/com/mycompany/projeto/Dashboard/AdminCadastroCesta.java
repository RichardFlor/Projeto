package com.mycompany.projeto.Dashboard;

import com.mycompany.projeto.JDBC.MySQL;
import java.awt.BorderLayout;
import com.mycompany.projeto.Login.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class AdminCadastroCesta extends javax.swing.JFrame {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AdminCadastroCesta() {
        initComponents();
        connection = MySQL.conector();
    }


    //Método para Adcionar Usuários
    private void adicionarItem() {

        String sql = "insert into tblCesta(qntItens, idUsuario) values (?,?)";
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1, txtIdCesta.getText());
            pst.setString(2, txtIdUsuario.getText());
            

            //Validação dos campos obrigatórios
            if ((txtIdCesta.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");

            } else {
                //Linha a baixo atualiza a tabela Usuario com os dados do formulário
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Cesta destinada ao Donatario");

                    txtIdCesta.setText(null);
                    txtIdUsuario.setText(null);
                    
                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblClose = new javax.swing.JLabel();
        lblConfirmar = new javax.swing.JLabel();
        lblValidade = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        txtIdCesta = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblClose.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 51, 51));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblClose.setName(""); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 40, 29));

        lblConfirmar.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblConfirmar.setForeground(new java.awt.Color(25, 118, 211));
        lblConfirmar.setText("Confirmar");
        lblConfirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblConfirmarMouseClicked(evt);
            }
        });
        getContentPane().add(lblConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        lblValidade.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblValidade.setForeground(new java.awt.Color(25, 118, 211));
        lblValidade.setText("Nome donatario:*");
        getContentPane().add(lblValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 150, -1));

        lblNomeProduto.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto.setText("Quantidade de itens:*");
        getContentPane().add(lblNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 170, -1));

        txtIdCesta.setBackground(new java.awt.Color(235, 235, 235));
        txtIdCesta.setBorder(null);
        getContentPane().add(txtIdCesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 450, 30));

        txtIdUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtIdUsuario.setBorder(null);
        getContentPane().add(txtIdUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 180, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 360));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 360));

        setBounds(530, 200, 549, 357);
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
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblConfirmarMouseClicked
       adicionarItem();
    }//GEN-LAST:event_lblConfirmarMouseClicked

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
            java.util.logging.Logger.getLogger(AdminCadastroCesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminCadastroCesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminCadastroCesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminCadastroCesta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCadastroCesta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblConfirmar;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblValidade;
    private javax.swing.JTextField txtIdCesta;
    private javax.swing.JFormattedTextField txtIdUsuario;
    // End of variables declaration//GEN-END:variables
}
