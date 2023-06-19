package com.mycompany.projeto.Dashboard;

import com.mycompany.projeto.JDBC.MySQL;
import com.mycompany.projeto.Login.Login;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Richard
 */
public class DonatarioPerfil extends javax.swing.JPanel {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DonatarioPerfil() {
        initComponents();
        formatarCampo();
        setarCampos();
    }

    private void formatarCampo() {
        try {
            MaskFormatter mask = new MaskFormatter("(##)#####-####");
            MaskFormatter mask1 = new MaskFormatter("###.###.###-##");
            MaskFormatter mask2 = new MaskFormatter("#####-###");
            mask.install(txtTelefoneUsuario);
            mask1.install(txtCpfUsuario);
            mask2.install(txtCepUsuario);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo", "ERRO", JOptionPane.ERROR);
        }
    }

    public void setarCampos() {
        String sql = "select * from tblUsuario where idUsuario=?";
        try {
            connection = MySQL.conector();
            //as linhas a baixo preparam a consulta ao banco de dados
            //em função do que foi digitado nas caixas de texto.
            pst = connection.prepareStatement(sql);
            pst.setInt(1, Login.IDUSUARIO);
            //Linha a baixo executa a query(consulta ao banco)
            rs = pst.executeQuery();
            if (rs.next()) {
                // Obter os valores dos campos do registro
                String idUsuario = rs.getString("idUsuario");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String senha = rs.getString("senha");
                String telefone = rs.getString("telefone");
                String cpf = rs.getString("cpf");
                String rua = rs.getString("rua");
                String bairro = rs.getString("bairro");
                String numero = rs.getString("numero");
                String cep = rs.getString("cep");
                String cidade = rs.getString("cidade");
                String perfil = rs.getString("perfil");

                // Definir os valores nos JTextFields correspondentes
                txtIdUsuario.setText(idUsuario);
                txtNomeUsuario.setText(nome);
                txtEmailUsuario.setText(email);
                txtSenhaUsuario.setText(senha);
                txtTelefoneUsuario.setText(telefone);
                txtCpfUsuario.setText(cpf);
                txtRuaUsuario.setText(rua);
                txtBairroUsuario.setText(bairro);
                txtNumCasaUsuario.setText(numero);
                txtCepUsuario.setText(cep);
                txtCidadeUsuario.setText(cidade);
                txtPerfilUsuario.setText(perfil);

                // Verificar se campo é nulo e definir "Editar" no campo correspondente
                if (telefone == null || cpf == null || rua == null || bairro == null || numero == null || cep == null || cidade == null) {
                    txtTelefoneUsuario.setText("");
                    txtCpfUsuario.setText("");
                    txtRuaUsuario.setText("");
                    txtBairroUsuario.setText("");
                    txtNumCasaUsuario.setText("");
                    txtCepUsuario.setText("");
                    txtCidadeUsuario.setText("");
                } else {
                    txtTelefoneUsuario.setText(telefone);
                    txtCpfUsuario.setText(cpf);
                    txtRuaUsuario.setText(rua);
                    txtBairroUsuario.setText(bairro);
                    txtNumCasaUsuario.setText(numero);
                    txtCepUsuario.setText(cep);
                    txtCidadeUsuario.setText(cidade);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();

        }
    }

    private void alterar() {
        String sql = "update tblUsuario set nome=?,email=?,senha=?,telefone=?,cpf=?,rua=?,bairro=?,numero=?,cep=?,cidade=? where idUsuario=?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, txtNomeUsuario.getText());
            pst.setString(2, txtEmailUsuario.getText());
            pst.setString(3, txtSenhaUsuario.getText());
            pst.setString(4, txtTelefoneUsuario.getText());
            pst.setString(5, txtCpfUsuario.getText());
            pst.setString(6, txtRuaUsuario.getText());
            pst.setString(7, txtBairroUsuario.getText());
            pst.setString(8, txtNumCasaUsuario.getText());
            pst.setString(9, txtCepUsuario.getText());
            pst.setString(10, txtCidadeUsuario.getText());
            pst.setString(11, txtIdUsuario.getText());

            if ((txtNomeUsuario.getText().isEmpty()) || (txtEmailUsuario.getText().isEmpty()) || (txtSenhaUsuario.getText().isEmpty())
                    || (txtTelefoneUsuario.getText().isEmpty()) || (txtCpfUsuario.getText().isEmpty()) || (txtRuaUsuario.getText().isEmpty())
                    || (txtBairroUsuario.getText().isEmpty()) || (txtNumCasaUsuario.getText().isEmpty()) || (txtCepUsuario.getText().isEmpty())
                    || (txtCidadeUsuario.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");

            } else {
                int alterado = pst.executeUpdate();
                if (alterado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRadius1 = new com.mycompany.projeto.PanelCustom.PanelRadius();
        txtPerfilUsuario = new javax.swing.JTextField();
        txtIdUsuario = new javax.swing.JTextField();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lblNomeProduto1 = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        lblNomeProduto2 = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JTextField();
        lblNomeProduto3 = new javax.swing.JLabel();
        lblNomeProduto4 = new javax.swing.JLabel();
        lblNomeProduto6 = new javax.swing.JLabel();
        txtRuaUsuario = new javax.swing.JTextField();
        lblNomeProduto7 = new javax.swing.JLabel();
        txtNumCasaUsuario = new javax.swing.JTextField();
        lblNomeProduto8 = new javax.swing.JLabel();
        txtBairroUsuario = new javax.swing.JTextField();
        lblNomeProduto9 = new javax.swing.JLabel();
        txtCidadeUsuario = new javax.swing.JTextField();
        lblNomeProduto11 = new javax.swing.JLabel();
        lblClose2 = new javax.swing.JLabel();
        lblAtualizar = new javax.swing.JLabel();
        lblNomeProduto5 = new javax.swing.JLabel();
        txtTelefoneUsuario = new javax.swing.JFormattedTextField();
        txtCpfUsuario = new javax.swing.JFormattedTextField();
        txtCepUsuario = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(235, 235, 235));
        setPreferredSize(new java.awt.Dimension(880, 530));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setPreferredSize(new java.awt.Dimension(839, 487));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        txtPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilUsuario.setBorder(null);
        txtPerfilUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPerfilUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPerfilUsuario.setFocusable(false);
        txtPerfilUsuario.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtIdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setBorder(null);
        txtIdUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setFocusable(false);
        txtIdUsuario.setSelectionColor(new java.awt.Color(255, 255, 255));

        lblNomeProduto.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto.setText("Nome:");

        txtNomeUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtNomeUsuario.setBorder(null);

        lblNomeProduto1.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto1.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto1.setText("Email:");

        txtEmailUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtEmailUsuario.setBorder(null);

        lblNomeProduto2.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto2.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto2.setText("Senha:");

        txtSenhaUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtSenhaUsuario.setBorder(null);

        lblNomeProduto3.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto3.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto3.setText("Telefone:");

        lblNomeProduto4.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto4.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto4.setText("CPF:");

        lblNomeProduto6.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto6.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto6.setText("Rua:");

        txtRuaUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtRuaUsuario.setBorder(null);

        lblNomeProduto7.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto7.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto7.setText("Numero:");

        txtNumCasaUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtNumCasaUsuario.setBorder(null);

        lblNomeProduto8.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto8.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto8.setText("Bairro:");

        txtBairroUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtBairroUsuario.setBorder(null);

        lblNomeProduto9.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto9.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto9.setText("Cidade:");

        txtCidadeUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtCidadeUsuario.setBorder(null);

        lblNomeProduto11.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto11.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto11.setText("CEP:");

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

        lblAtualizar.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblAtualizar.setForeground(new java.awt.Color(25, 118, 211));
        lblAtualizar.setText("Atualizar");
        lblAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtualizarMouseClicked(evt);
            }
        });

        lblNomeProduto5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblNomeProduto5.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto5.setText("Preencha seus dados para completar seu cadastro.");

        txtTelefoneUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtTelefoneUsuario.setBorder(null);

        txtCpfUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtCpfUsuario.setBorder(null);

        txtCepUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtCepUsuario.setBorder(null);

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(lblAtualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeProduto8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelRadius1Layout.createSequentialGroup()
                                        .addGap(282, 282, 282)
                                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNomeProduto9, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeProduto11, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblNomeProduto6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRuaUsuario)
                                    .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumCasaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNomeProduto7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNomeProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelRadius1Layout.createSequentialGroup()
                                    .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNomeProduto1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblNomeProduto2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNomeProduto3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeProduto4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                        .addComponent(txtPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))))
        );
        panelRadius1Layout.setVerticalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblNomeProduto5)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblNomeProduto))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNomeProduto1)
                                .addGap(2, 2, 2)
                                .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblNomeProduto2)
                                .addGap(2, 2, 2)
                                .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeProduto3)
                            .addComponent(lblNomeProduto4))
                        .addGap(8, 8, 8)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNomeProduto6)
                        .addGap(2, 2, 2)
                        .addComponent(txtRuaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblNomeProduto7)
                        .addGap(2, 2, 2)
                        .addComponent(txtNumCasaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblNomeProduto8)
                        .addGap(2, 2, 2)
                        .addComponent(txtBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblNomeProduto9)
                        .addGap(2, 2, 2)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblNomeProduto11)
                        .addGap(32, 32, 32)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(lblAtualizar)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void lblAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtualizarMouseClicked

        alterar();
        revalidate();
        repaint();

    }//GEN-LAST:event_lblAtualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAtualizar;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblNomeProduto1;
    private javax.swing.JLabel lblNomeProduto11;
    private javax.swing.JLabel lblNomeProduto2;
    private javax.swing.JLabel lblNomeProduto3;
    private javax.swing.JLabel lblNomeProduto4;
    private javax.swing.JLabel lblNomeProduto5;
    private javax.swing.JLabel lblNomeProduto6;
    private javax.swing.JLabel lblNomeProduto7;
    private javax.swing.JLabel lblNomeProduto8;
    private javax.swing.JLabel lblNomeProduto9;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    private javax.swing.JTextField txtBairroUsuario;
    private javax.swing.JFormattedTextField txtCepUsuario;
    private javax.swing.JTextField txtCidadeUsuario;
    private javax.swing.JFormattedTextField txtCpfUsuario;
    private javax.swing.JTextField txtEmailUsuario;
    private javax.swing.JTextField txtIdUsuario;
    private javax.swing.JTextField txtNomeUsuario;
    private javax.swing.JTextField txtNumCasaUsuario;
    public static javax.swing.JTextField txtPerfilUsuario;
    private javax.swing.JTextField txtRuaUsuario;
    private javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JFormattedTextField txtTelefoneUsuario;
    // End of variables declaration//GEN-END:variables
}
