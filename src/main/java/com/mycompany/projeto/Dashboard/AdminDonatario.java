/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.projeto.Dashboard;

/**
 *
 * @author Richard
 */
public class AdminDonatario extends javax.swing.JPanel {

    /**
     * Creates new form EstoqueAdmin
     */
    public AdminDonatario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelRadius1 = new com.mycompany.projeto.PanelCustom.PanelRadius();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("TELA DO DONATARIO");

        setBackground(new java.awt.Color(235, 235, 235));
        setPreferredSize(new java.awt.Dimension(880, 530));

        panelRadius1.setBackground(new java.awt.Color(255, 255, 255));
        panelRadius1.setRoundBottomLeft(40);
        panelRadius1.setRoundBottomRight(40);
        panelRadius1.setRoundTopLeft(40);
        panelRadius1.setRoundTopRight(40);

        jLabel2.setText("TELA ADMIN DONATARIO");

        javax.swing.GroupLayout panelRadius1Layout = new javax.swing.GroupLayout(panelRadius1);
        panelRadius1.setLayout(panelRadius1Layout);
        panelRadius1Layout.setHorizontalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        panelRadius1Layout.setVerticalGroup(
            panelRadius1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRadius1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(panelRadius1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private com.mycompany.projeto.PanelCustom.PanelRadius panelRadius1;
    // End of variables declaration//GEN-END:variables
}
