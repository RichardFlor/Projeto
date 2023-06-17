package com.mycompany.projeto.Dashboard;

import com.mycompany.projeto.TableCustom.TableCustom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.projeto.JDBC.MySQL;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Richard
 */
public class AdminDoador extends javax.swing.JPanel {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AdminDoador() {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRadius1 = new com.mycompany.projeto.PanelCustom.PanelRadius();
        lblRemoverUsuario = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDoador = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblClose2 = new javax.swing.JLabel();
        txtNomeDoador = new javax.swing.JTextField();
        lblNomeProduto = new javax.swing.JLabel();
        txtIdDoador = new javax.swing.JTextField();
        txtEmailDoador = new javax.swing.JTextField();
        txtSenhaDoador = new javax.swing.JTextField();
        txtTelefoneDoador = new javax.swing.JTextField();
        txtCpfDoador = new javax.swing.JTextField();
        txtRuaDoador = new javax.swing.JTextField();
        txtBairroDoador = new javax.swing.JTextField();
        txtNumeroDoador = new javax.swing.JTextField();
        txtCepDoador = new javax.swing.JTextField();
        txtCidadeDoador = new javax.swing.JTextField();
        txtPerfilDoador = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 590));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setPreferredSize(new java.awt.Dimension(839, 487));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        lblRemoverUsuario.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblRemoverUsuario.setForeground(new java.awt.Color(25, 118, 211));
        lblRemoverUsuario.setText("Remover");
        lblRemoverUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRemoverUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRemoverUsuarioMouseClicked(evt);
            }
        });

        tableDoador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id do doador", "Nome", "Email", "Senha", "Telefone", "CPF", "Rua", "Bairro", "Número", "CEP", "Cidade", "Perfil"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDoador.setToolTipText("");
        tableDoador.setRowHeight(40);
        tableDoador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDoadorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDoador);
        if (tableDoador.getColumnModel().getColumnCount() > 0) {
            tableDoador.getColumnModel().getColumn(0).setPreferredWidth(80);
            tableDoador.getColumnModel().getColumn(1).setPreferredWidth(30);
            tableDoador.getColumnModel().getColumn(3).setHeaderValue("Senha");
            tableDoador.getColumnModel().getColumn(4).setHeaderValue("Telefone");
            tableDoador.getColumnModel().getColumn(5).setHeaderValue("CPF");
            tableDoador.getColumnModel().getColumn(6).setHeaderValue("Rua");
            tableDoador.getColumnModel().getColumn(7).setHeaderValue("Bairro");
            tableDoador.getColumnModel().getColumn(8).setHeaderValue("Número");
            tableDoador.getColumnModel().getColumn(9).setHeaderValue("CEP");
            tableDoador.getColumnModel().getColumn(10).setHeaderValue("Cidade");
            tableDoador.getColumnModel().getColumn(11).setHeaderValue("Perfil");
        }

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Richard\\Desktop\\images\\iconLupa.png")); // NOI18N

        txtPesquisa.setBackground(new java.awt.Color(235, 235, 235));
        txtPesquisa.setBorder(null);
        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
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

        txtNomeDoador.setBackground(new java.awt.Color(235, 235, 235));
        txtNomeDoador.setBorder(null);

        lblNomeProduto.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto.setText("Doador selecionado:");

        txtIdDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtIdDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtIdDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIdDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtEmailDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtEmailDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtEmailDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtEmailDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtSenhaDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtSenhaDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtSenhaDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtSenhaDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtSenhaDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtTelefoneDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefoneDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtTelefoneDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtTelefoneDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtTelefoneDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtCpfDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtCpfDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtCpfDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCpfDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCpfDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtRuaDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtRuaDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtRuaDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtRuaDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtRuaDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtBairroDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtBairroDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtBairroDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtBairroDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtBairroDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtNumeroDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtNumeroDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtNumeroDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNumeroDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtNumeroDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtCepDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtCepDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtCepDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCepDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCepDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtCidadeDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtCidadeDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtCidadeDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCidadeDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtCidadeDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        txtPerfilDoador.setForeground(new java.awt.Color(255, 255, 255));
        txtPerfilDoador.setBorder(new javax.swing.border.MatteBorder(null));
        txtPerfilDoador.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPerfilDoador.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtPerfilDoador.setSelectionColor(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(lblRemoverUsuario)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSenhaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRuaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairroDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCepDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidadeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPerfilDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelRadius1Layout.setVerticalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtIdDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSenhaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefoneDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCpfDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRuaDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairroDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNumeroDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCepDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidadeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPerfilDoador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txtNomeDoador, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblRemoverUsuario)
                .addGap(29, 29, 29))
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

    //Método para listar os dados do banco na tabela
    public void carregarTabela() {
        connection = MySQL.conector();

        DefaultTableModel modelo = (DefaultTableModel) tableDoador.getModel();
        modelo.setNumRows(0);

        tableDoador.getColumnModel().getColumn(0).setPreferredWidth(20);
        tableDoador.getColumnModel().getColumn(1).setPreferredWidth(20);
        tableDoador.getColumnModel().getColumn(2).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(3).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(4).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(5).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(6).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(7).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(8).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(9).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(10).setPreferredWidth(1);
        tableDoador.getColumnModel().getColumn(11).setPreferredWidth(1);

        try {

            pst = connection.prepareStatement("select * from tblUsuario where perfil='doador';");
            rs = pst.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    //Começa no dois por que nao quero trazer o campo idItem do mySql
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12)

                });
            }

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a Tabela de dados: " + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    //método para pesquisa avançada no banco com filtro
    private void pesquisarDoador() {
        String sql = "SELECT * FROM tblUsuario WHERE nome LIKE ? AND perfil = 'doador';";
        try {
            pst = connection.prepareStatement(sql);
            //Passando o conteudo da caixa de pesquisa para o ?
            //atenção ao "%" - continuação da String sql
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();

            //A linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            tableDoador.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    
//        //Método para preencher os campos do formulario com o conteudo da tabela
//    public void setarCampos() {
//        int setar = tableDoador.getSelectedRow();
//        txtIdDoador.setText(tableDoador.getModel().getValueAt(setar,0).toString());
//        txtNomeDoador.setText(tableDoador.getModel().getValueAt(setar,1).toString());
//        txtEmailDoador.setText(tableDoador.getModel().getValueAt(setar,2).toString());
//        txtSenhaDoador.setText(tableDoador.getModel().getValueAt(setar,3).toString());
//        txtTelefoneDoador.setText(tableDoador.getModel().getValueAt(setar,4).toString());
//        txtCpfDoador.setText(tableDoador.getModel().getValueAt(setar,5).toString());
//        txtRuaDoador.setText(tableDoador.getModel().getValueAt(setar,6).toString());
//        txtBairroDoador.setText(tableDoador.getModel().getValueAt(setar,7).toString());
//        txtNumeroDoador.setText(tableDoador.getModel().getValueAt(setar,8).toString());
//        txtCepDoador.setText(tableDoador.getModel().getValueAt(setar,9).toString());
//        txtCidadeDoador.setText(tableDoador.getModel().getValueAt(setar,10).toString());
//        txtPerfilDoador.setText(tableDoador.getModel().getValueAt(setar,11).toString());
//    }
    
    // Método para preencher os campos do formulário com o conteúdo da tabela
public void setarCampos() {
    int setar = tableDoador.getSelectedRow();
    
    txtIdDoador.setText(getValueFromTable(setar, 0));
    txtNomeDoador.setText(getValueFromTable(setar, 1));
    txtEmailDoador.setText(getValueFromTable(setar, 2));
    txtSenhaDoador.setText(getValueFromTable(setar, 3));
    txtTelefoneDoador.setText(getValueFromTable(setar, 4));
    txtCpfDoador.setText(getValueFromTable(setar, 5));
    txtRuaDoador.setText(getValueFromTable(setar, 6));
    txtBairroDoador.setText(getValueFromTable(setar, 7));
    txtNumeroDoador.setText(getValueFromTable(setar, 8));
    txtCepDoador.setText(getValueFromTable(setar, 9));
    txtCidadeDoador.setText(getValueFromTable(setar, 10));
    txtPerfilDoador.setText(getValueFromTable(setar, 11));
}

// Método auxiliar para obter o valor da tabela, tratando valores nulos
private String getValueFromTable(int row, int column) {
    Object value = tableDoador.getModel().getValueAt(row, column);
    return (value != null) ? value.toString() : "";
}
     //Metodo para deletar 
    private void deletar(){
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja remover este doador?","Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tblUsuario where idUsuario=?";
            try {
                pst = connection.prepareStatement(sql);
                pst.setString(1, txtIdDoador.getText());
                int apagado = pst.executeUpdate();
                if(apagado > 0 ){
                    JOptionPane.showMessageDialog(null,"Doador removido com sucesso");
                    txtIdDoador.setText(null);
                    txtNomeDoador.setText(null);
                    txtEmailDoador.setText(null);
                    txtSenhaDoador.setText(null);
                    txtTelefoneDoador.setText(null);
                    txtCpfDoador.setText(null);
                    txtRuaDoador.setText(null);
                    txtBairroDoador.setText(null);
                    txtNumeroDoador.setText(null);
                    txtCepDoador.setText(null);
                    txtCidadeDoador.setText(null);
                    txtPerfilDoador.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else {
        }
    }
    
    

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisarDoador();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void lblRemoverUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRemoverUsuarioMouseClicked
        deletar();
    }//GEN-LAST:event_lblRemoverUsuarioMouseClicked

    private void tableDoadorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDoadorMouseClicked
       setarCampos();
    }//GEN-LAST:event_tableDoadorMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblRemoverUsuario;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    private javax.swing.JTable tableDoador;
    private javax.swing.JTextField txtBairroDoador;
    private javax.swing.JTextField txtCepDoador;
    private javax.swing.JTextField txtCidadeDoador;
    private javax.swing.JTextField txtCpfDoador;
    private javax.swing.JTextField txtEmailDoador;
    private javax.swing.JTextField txtIdDoador;
    private javax.swing.JTextField txtNomeDoador;
    private javax.swing.JTextField txtNumeroDoador;
    private javax.swing.JTextField txtPerfilDoador;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtRuaDoador;
    private javax.swing.JTextField txtSenhaDoador;
    private javax.swing.JTextField txtTelefoneDoador;
    // End of variables declaration//GEN-END:variables
}
