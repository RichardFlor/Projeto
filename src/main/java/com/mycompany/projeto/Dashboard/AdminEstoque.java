package com.mycompany.projeto.Dashboard;

import com.mycompany.projeto.TableCustom.TableCustom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mycompany.projeto.JDBC.MySQL;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Richard
 */
public class AdminEstoque extends javax.swing.JPanel {

    Connection connection = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public AdminEstoque() {
        initComponents();
        TableCustom.apply(jScrollPane1, TableCustom.TableType.DEFAULT);
        formatarCampo();
        carregarTabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelRadius1 = new com.mycompany.projeto.PanelCustom.PanelRadius();
        lblEditarItem = new javax.swing.JLabel();
        lblCadastrarItem = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEstoque = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        lblClose2 = new javax.swing.JLabel();
        lblNomeProduto = new javax.swing.JLabel();
        txtNomeProduto = new javax.swing.JTextField();
        lblValidade = new javax.swing.JLabel();
        txtValidade = new javax.swing.JFormattedTextField();
        txtIdProduto = new javax.swing.JTextField();
        lblDeletarItem = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(880, 530));

        jPanel1.setBackground(new java.awt.Color(235, 235, 235));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 590));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setPreferredSize(new java.awt.Dimension(839, 487));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        lblEditarItem.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblEditarItem.setForeground(new java.awt.Color(25, 118, 211));
        lblEditarItem.setText("Editar item");
        lblEditarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEditarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditarItemMouseClicked(evt);
            }
        });

        lblCadastrarItem.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblCadastrarItem.setForeground(new java.awt.Color(25, 118, 211));
        lblCadastrarItem.setText("Cadastrar item");
        lblCadastrarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCadastrarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCadastrarItemMouseClicked(evt);
            }
        });

        tableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo do item", "Nome", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableEstoque.setToolTipText("");
        tableEstoque.setRowHeight(40);
        tableEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEstoque);
        if (tableEstoque.getColumnModel().getColumnCount() > 0) {
            tableEstoque.getColumnModel().getColumn(1).setPreferredWidth(80);
            tableEstoque.getColumnModel().getColumn(2).setPreferredWidth(30);
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

        lblNomeProduto.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblNomeProduto.setForeground(new java.awt.Color(25, 118, 211));
        lblNomeProduto.setText("Nome do produto:*");

        txtNomeProduto.setBackground(new java.awt.Color(235, 235, 235));
        txtNomeProduto.setBorder(null);

        lblValidade.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblValidade.setForeground(new java.awt.Color(25, 118, 211));
        lblValidade.setText("Data de Validade:*");

        txtValidade.setBackground(new java.awt.Color(235, 235, 235));
        txtValidade.setBorder(null);

        txtIdProduto.setForeground(new java.awt.Color(255, 255, 255));
        txtIdProduto.setText(" ");
        txtIdProduto.setBorder(null);
        txtIdProduto.setCaretColor(new java.awt.Color(255, 255, 255));
        txtIdProduto.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtIdProduto.setFocusable(false);
        txtIdProduto.setSelectionColor(new java.awt.Color(255, 255, 255));

        lblDeletarItem.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N
        lblDeletarItem.setForeground(new java.awt.Color(25, 118, 211));
        lblDeletarItem.setText("Deletar item");
        lblDeletarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeletarItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeletarItemMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblClose2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(panelRadius1Layout.createSequentialGroup()
                        .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRadius1Layout.createSequentialGroup()
                                .addComponent(lblNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(19, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRadius1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblCadastrarItem)
                .addGap(34, 34, 34)
                .addComponent(lblEditarItem)
                .addGap(34, 34, 34)
                .addComponent(lblDeletarItem)
                .addGap(236, 236, 236))
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
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeProduto)
                    .addComponent(txtIdProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(txtNomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblValidade)
                .addGap(2, 2, 2)
                .addComponent(txtValidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCadastrarItem)
                    .addComponent(lblEditarItem)
                    .addComponent(lblDeletarItem))
                .addGap(20, 20, 20))
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

    
    //Método para formatar o campo de texto data 
    private void formatarCampo() {
        try {
            MaskFormatter mask = new MaskFormatter("##/##/####");
            mask.install(txtValidade);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao formatar campo", "ERRO", JOptionPane.ERROR);

        }
    }

    //Método para listar os dados do banco na tabela
    public void carregarTabela() {
        connection = MySQL.conector();

        DefaultTableModel modelo = (DefaultTableModel) tableEstoque.getModel();
        modelo.setNumRows(0);

        tableEstoque.getColumnModel().getColumn(0).setPreferredWidth(80);
        tableEstoque.getColumnModel().getColumn(1).setPreferredWidth(20);
        tableEstoque.getColumnModel().getColumn(2).setPreferredWidth(10);

        try {

            pst = connection.prepareStatement("select * from tblItem;");
            rs = pst.executeQuery();

            while (rs.next()) {
                modelo.addRow(new Object[]{
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3)
                // rs.getString(3)

                });
            }

        } catch (Exception ErroSql) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar a Tabela de dados: " + ErroSql, "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }

    //método para pesquisa avançada no banco com filtro
    private void pesquisarItem() {
        String sql = "select idItem as 'Codigo do item',nomeItem as 'Nome', validade as 'Validade' from tblItem where nomeItem like ?";
        try {
            pst = connection.prepareStatement(sql);
            //Passando o conteudo da caixa de pesquisa para o ?
            //atenção ao "%" - continuação da String sql
            pst.setString(1, txtPesquisa.getText() + "%");
            rs = pst.executeQuery();

            //A linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
            tableEstoque.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Método para Adcionar Item
    private void adicionarItem() {

        String sql = "insert into tblItem(nomeItem,validade) values(?,?)";
        try {
            pst = connection.prepareStatement(sql);

            pst.setString(1, txtNomeProduto.getText());
            pst.setString(2, txtValidade.getText());

            //Validação dos campos obrigatórios
            if ((txtNomeProduto.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos obrigatórios");

            } else {
                //Linha a baixo atualiza a tabela Usuario com os dados do formulário
                int adicionado = pst.executeUpdate();
                if (adicionado > 0) {
                    JOptionPane.showMessageDialog(null, "Item inserido com sucesso");

                    txtNomeProduto.setText(null);
                    txtValidade.setText(null);

                }
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }

    //Método para preencher os campos do formulario com o conteudo da tabela
    public void setarCampos() {
        int setar = tableEstoque.getSelectedRow();
        txtIdProduto.setText(tableEstoque.getModel().getValueAt(setar,0).toString());
        txtNomeProduto.setText(tableEstoque.getModel().getValueAt(setar, 1).toString());
        txtValidade.setText(tableEstoque.getModel().getValueAt(setar, 2).toString());

        //Linha abaixo desabilita o botao adicionar
        //lblCadastrarItem.setEnabled(false);
    }

    //Método para alterar dados do Estoque
    private void alterar() {
        String sql = "update tblItem set nomeItem=?,validade=? where idItem=?";

        try {
            pst = connection.prepareStatement(sql);
            pst.setString(1, txtNomeProduto.getText());
            pst.setString(2, txtValidade.getText());
            pst.setString(3, txtIdProduto.getText());

            if ((txtNomeProduto.getText().isEmpty()) || (txtValidade.getText().isEmpty())) {
                JOptionPane.showMessageDialog(null, "Preencha os campos obrigatórios");

            } else {
                int alterado = pst.executeUpdate();
                if (alterado > 0) {
                    JOptionPane.showMessageDialog(null, "Dados do item alterados com sucesso");
                    txtNomeProduto.setText(null);
                    txtValidade.setText(null);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    //Metodo para deletar 
    private void deletar(){
        int confirma = JOptionPane.showConfirmDialog(null, "Deseja remover este item?","Atenção", JOptionPane.YES_NO_OPTION);
        if (confirma == JOptionPane.YES_OPTION) {
            String sql = "delete from tblItem where idItem=?";
            try {
                pst = connection.prepareStatement(sql);
                pst.setString(1, txtIdProduto.getText());
                int apagado = pst.executeUpdate();
                if(apagado > 0 ){
                    JOptionPane.showMessageDialog(null,"Item removido com sucesso");
                    txtIdProduto.setText(null);
                    txtNomeProduto.setText(null);
                    txtValidade.setText(null);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
        } else {
        }
    }
    
    private void lblCadastrarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCadastrarItemMouseClicked
        //new AdminCadastroEstoque().setVisible(true);
        adicionarItem();
    }//GEN-LAST:event_lblCadastrarItemMouseClicked

    private void lblClose2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClose2MouseClicked
        //Botao fechar
        System.exit(0);
    }//GEN-LAST:event_lblClose2MouseClicked

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased
        pesquisarItem();
    }//GEN-LAST:event_txtPesquisaKeyReleased

    //Evento que sera usado para setar os campos da tabela quando clicar
    private void tableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEstoqueMouseClicked
        //Chamando o método para setar os campos 
        setarCampos();
    }//GEN-LAST:event_tableEstoqueMouseClicked

    private void lblEditarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditarItemMouseClicked
       alterar();
    }//GEN-LAST:event_lblEditarItemMouseClicked

    private void lblDeletarItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeletarItemMouseClicked
        deletar();
    }//GEN-LAST:event_lblDeletarItemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCadastrarItem;
    private javax.swing.JLabel lblClose2;
    private javax.swing.JLabel lblDeletarItem;
    private javax.swing.JLabel lblEditarItem;
    private javax.swing.JLabel lblNomeProduto;
    private javax.swing.JLabel lblValidade;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    private javax.swing.JTable tableEstoque;
    private javax.swing.JTextField txtIdProduto;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtValidade;
    // End of variables declaration//GEN-END:variables
}
