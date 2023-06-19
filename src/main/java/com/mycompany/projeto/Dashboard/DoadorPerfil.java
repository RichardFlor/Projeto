package com.mycompany.projeto.Dashboard;

import com.mycompany.projeto.JDBC.MySQL;
import com.mycompany.projeto.Login.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;


public class DoadorPerfil extends javax.swing.JPanel {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public DoadorPerfil() {
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
    
    
    //Método logar
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

                // Verificar se campo é nulo e definir "" no campo correspondente
                if ( telefone==null||cpf==null|| rua==null || bairro==null|| numero==null|| cep==null|| cidade==null) {
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

    //Método para alterar dados do Estoque
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
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCpfUsuario5 = new javax.swing.JTextField();
        lblNomeProduto10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelRadius1 = new com.mycompany.projeto.PanelCustom.PanelRadius();
        lblAtualizar = new javax.swing.JLabel();
        lblClose2 = new javax.swing.JLabel();
        lblNomeUsuario = new javax.swing.JLabel();
        txtNomeUsuario = new javax.swing.JTextField();
        lblEmailUsuario = new javax.swing.JLabel();
        txtEmailUsuario = new javax.swing.JTextField();
        lblSenhaUsuario = new javax.swing.JLabel();
        txtSenhaUsuario = new javax.swing.JTextField();
        lblTelefoneUsuario = new javax.swing.JLabel();
        lblCpfUsuario = new javax.swing.JLabel();
        lblNomeProduto5 = new javax.swing.JLabel();
        txtIdUsuario = new javax.swing.JTextField();
        lblRuaUsuario = new javax.swing.JLabel();
        txtRuaUsuario = new javax.swing.JTextField();
        lblNumCasaUsuario = new javax.swing.JLabel();
        txtNumCasaUsuario = new javax.swing.JTextField();
        lblBairroUsuario = new javax.swing.JLabel();
        txtBairroUsuario = new javax.swing.JTextField();
        lblCidadeUsuario = new javax.swing.JLabel();
        txtCidadeUsuario = new javax.swing.JTextField();
        lblCepUsuario = new javax.swing.JLabel();
        txtPerfilUsuario = new javax.swing.JTextField();
        txtTelefoneUsuario = new javax.swing.JFormattedTextField();
        txtCpfUsuario = new javax.swing.JFormattedTextField();
        txtCepUsuario = new javax.swing.JFormattedTextField();

        txtCpfUsuario5.setBackground(new java.awt.Color(235, 235, 235));
        txtCpfUsuario5.setBorder(null);

        lblNomeProduto10.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto10.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto10.setText("Cidade");

        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 590));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setPreferredSize(new java.awt.Dimension(839, 487));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        lblAtualizar.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblAtualizar.setForeground(new java.awt.Color(25, 118, 211));
        lblAtualizar.setText("Atualizar");
        lblAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAtualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtualizarMouseClicked(evt);
            }
        });

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

        lblNomeUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeUsuario.setText("Nome:");

        txtNomeUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtNomeUsuario.setBorder(null);

        lblEmailUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblEmailUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblEmailUsuario.setText("Email:");

        txtEmailUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtEmailUsuario.setBorder(null);

        lblSenhaUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblSenhaUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblSenhaUsuario.setText("Senha:");

        txtSenhaUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtSenhaUsuario.setBorder(null);

        lblTelefoneUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblTelefoneUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblTelefoneUsuario.setText("Telefone:");

        lblCpfUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblCpfUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblCpfUsuario.setText("CPF:");

        lblNomeProduto5.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        lblNomeProduto5.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto5.setText("Preencha seus dados para completar seu cadastro.");

        txtIdUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setBorder(null);
        txtIdUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIdUsuario.setFocusable(false);
        txtIdUsuario.setSelectionColor(new java.awt.Color(255, 255, 255));

        lblRuaUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblRuaUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblRuaUsuario.setText("Rua:");

        txtRuaUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtRuaUsuario.setBorder(null);

        lblNumCasaUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNumCasaUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblNumCasaUsuario.setText("Numero:");

        txtNumCasaUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtNumCasaUsuario.setBorder(null);

        lblBairroUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblBairroUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblBairroUsuario.setText("Bairro:");

        txtBairroUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtBairroUsuario.setBorder(null);

        lblCidadeUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblCidadeUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblCidadeUsuario.setText("Cidade:");

        txtCidadeUsuario.setBackground(new java.awt.Color(235, 235, 235));
        txtCidadeUsuario.setBorder(null);

        lblCepUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblCepUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblCepUsuario.setText("CEP:");

        txtPerfilUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilUsuario.setBorder(null);
        txtPerfilUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPerfilUsuario.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPerfilUsuario.setFocusable(false);
        txtPerfilUsuario.setSelectionColor(new java.awt.Color(255, 255, 255));

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
                .addGap(380, 380, 380)
                .addComponent(lblAtualizar)
                .addGap(0, 390, Short.MAX_VALUE))
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblNomeProduto5, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelRadius1Layout.createSequentialGroup()
                                    .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblEmailUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblRuaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRuaUsuario)
                            .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumCasaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNumCasaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))))))
        );
        panelRadius1Layout.setVerticalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(lblNomeProduto5))
                            .addComponent(txtIdUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(lblNomeUsuario)
                        .addGap(2, 2, 2))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(txtPerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)))
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelRadius1Layout.createSequentialGroup()
                                        .addComponent(txtNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblEmailUsuario)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtEmailUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelRadius1Layout.createSequentialGroup()
                                        .addComponent(lblSenhaUsuario)
                                        .addGap(2, 2, 2)
                                        .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(lblTelefoneUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTelefoneUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCpfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblCpfUsuario)
                                .addGap(32, 32, 32)))
                        .addComponent(lblRuaUsuario)
                        .addGap(2, 2, 2)
                        .addComponent(txtRuaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblNumCasaUsuario)
                        .addGap(2, 2, 2)
                        .addComponent(txtNumCasaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblBairroUsuario)
                                .addGap(2, 2, 2)
                                .addComponent(txtBairroUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblCidadeUsuario)
                                .addGap(2, 2, 2)
                                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCidadeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCepUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(lblAtualizar)
                        .addGap(29, 29, 29))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(lblCepUsuario)
                        .addGap(138, 138, 138))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void lblAtualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtualizarMouseClicked
        alterar();
    }//GEN-LAST:event_lblAtualizarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAtualizar;
    private javax.swing.JLabel lblBairroUsuario;
    private javax.swing.JLabel lblCepUsuario;
    private javax.swing.JLabel lblCidadeUsuario;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblCpfUsuario;
    private javax.swing.JLabel lblEmailUsuario;
    private javax.swing.JLabel lblNomeProduto10;
    private javax.swing.JLabel lblNomeProduto5;
    private javax.swing.JLabel lblNomeUsuario;
    private javax.swing.JLabel lblNumCasaUsuario;
    private javax.swing.JLabel lblRuaUsuario;
    private javax.swing.JLabel lblSenhaUsuario;
    private javax.swing.JLabel lblTelefoneUsuario;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    public static javax.swing.JTextField txtBairroUsuario;
    private javax.swing.JFormattedTextField txtCepUsuario;
    public static javax.swing.JTextField txtCidadeUsuario;
    private javax.swing.JFormattedTextField txtCpfUsuario;
    private javax.swing.JTextField txtCpfUsuario5;
    public static javax.swing.JTextField txtEmailUsuario;
    public static javax.swing.JTextField txtIdUsuario;
    public static javax.swing.JTextField txtNomeUsuario;
    public static javax.swing.JTextField txtNumCasaUsuario;
    public static javax.swing.JTextField txtPerfilUsuario;
    public static javax.swing.JTextField txtRuaUsuario;
    public static javax.swing.JTextField txtSenhaUsuario;
    private javax.swing.JFormattedTextField txtTelefoneUsuario;
    // End of variables declaration//GEN-END:variables
}
