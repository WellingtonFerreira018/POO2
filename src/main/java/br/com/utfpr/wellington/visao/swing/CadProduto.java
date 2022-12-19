/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.utfpr.wellington.visao.swing;

import br.com.utfpr.wellington.modelo.dao.generic.GenericDAO;
import br.com.utfpr.wellington.modelo.dao.generic.GenericDAOimpl;
import br.com.utfpr.wellington.modelo.rn.ComidasRN;
import br.com.utfpr.wellington.modelo.rn.EstoqueRN;
import br.com.utfpr.wellington.modelo.vo.Bebidas;
import br.com.utfpr.wellington.modelo.vo.Comidas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ferre
 */
public class CadProduto extends javax.swing.JPanel {

    /**
     * Creates new form CadProduto
     */
    public CadProduto() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nomeC = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        valorC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cadasC = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tipoC = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ingreC = new javax.swing.JTextField();
        a = new javax.swing.JLabel();
        nomeB = new javax.swing.JTextField();
        valorB = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        tipoB = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        validade = new javax.swing.JTextField();
        nomeb1 = new javax.swing.JLabel();
        cadasB = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro de Produtos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 768, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Comidas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        nomeC.setBackground(new java.awt.Color(255, 255, 255));
        nomeC.setForeground(new java.awt.Color(0, 0, 0));
        nomeC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeCActionPerformed(evt);
            }
        });
        jPanel1.add(nomeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 140, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ingredientes:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, 30));

        valorC.setBackground(new java.awt.Color(255, 255, 255));
        valorC.setForeground(new java.awt.Color(0, 0, 0));
        valorC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorCActionPerformed(evt);
            }
        });
        jPanel1.add(valorC, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 140, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bebidas");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, 30));

        jPanel2.setPreferredSize(new java.awt.Dimension(0, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 723, -1));

        cadasC.setBackground(new java.awt.Color(0, 255, 0));
        cadasC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadasC.setForeground(new java.awt.Color(255, 255, 255));
        cadasC.setText("Cadastrar");
        cadasC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasCActionPerformed(evt);
            }
        });
        jPanel1.add(cadasC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 714, 43));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Valor:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, 20));

        tipoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Lanche ", "Pizza", "Pastel" }));
        jPanel1.add(tipoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 130, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Tipo:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 110, -1, 30));

        ingreC.setBackground(new java.awt.Color(255, 255, 255));
        ingreC.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ingreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 510, 30));

        a.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(0, 0, 0));
        a.setText("Nome:");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, 30));

        nomeB.setBackground(new java.awt.Color(255, 255, 255));
        nomeB.setForeground(new java.awt.Color(0, 0, 0));
        nomeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeBActionPerformed(evt);
            }
        });
        jPanel1.add(nomeB, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, 140, 30));

        valorB.setBackground(new java.awt.Color(255, 255, 255));
        valorB.setForeground(new java.awt.Color(0, 0, 0));
        valorB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorBActionPerformed(evt);
            }
        });
        jPanel1.add(valorB, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 140, 30));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Valor:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, -1, 30));

        tipoB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Suco", "Cerveja", "Refrigerante" }));
        jPanel1.add(tipoB, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, 130, 30));

        jLabel15.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Tipo:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, 40));

        validade.setBackground(new java.awt.Color(255, 255, 255));
        validade.setForeground(new java.awt.Color(0, 0, 0));
        validade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadeActionPerformed(evt);
            }
        });
        jPanel1.add(validade, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 140, 30));

        nomeb1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nomeb1.setForeground(new java.awt.Color(0, 0, 0));
        nomeb1.setText("Validade:");
        jPanel1.add(nomeb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, 30));

        cadasB.setBackground(new java.awt.Color(0, 255, 0));
        cadasB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadasB.setForeground(new java.awt.Color(255, 255, 255));
        cadasB.setText("Cadastrar");
        cadasB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadasBActionPerformed(evt);
            }
        });
        jPanel1.add(cadasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 714, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nomeCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeCActionPerformed

    private void cadasCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasCActionPerformed
        
        Comidas comidas = new Comidas();
        
        try {
            comidas.setNome(nomeC.getText());
            comidas.setPreco(Float.parseFloat(valorC.getText()));
            switch (tipoC.getSelectedIndex()) {
                case 1:
                    comidas.setTipo("Lanche");
                    break;
                case 2:
                    comidas.setTipo("Pizza");
                    break;
                case 3:
                    comidas.setTipo("Pastel");
                    break;
                default:
                    break;
            }
            List<String> ingredientes = new ArrayList<>();
            ingredientes.add(ingreC.getText());
            
            comidas.setIngredientes(ingredientes);
            
            ComidasRN comidasRN = new ComidasRN();
            comidasRN.salvar(comidas);
            JOptionPane.showMessageDialog(null,"O cadastro foi realizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Preencha as Informações do Cadastro Corretamente");
        }
        
    }//GEN-LAST:event_cadasCActionPerformed

    private void valorCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorCActionPerformed

    private void nomeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeBActionPerformed

    private void valorBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorBActionPerformed

    private void validadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_validadeActionPerformed

    private void cadasBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadasBActionPerformed
        
        Bebidas bebidas = new Bebidas();
        
        try {
            bebidas.setNome(nomeB.getText());
            bebidas.setPreco(Float.parseFloat(valorB.getText()));
            switch (tipoB.getSelectedIndex()) {
                case 1:
                    bebidas.setTipo("Suco");
                    break;
                case 2:
                    bebidas.setTipo("Cerveja");
                    break;
                case 3:
                    bebidas.setTipo("Refrigerante");
                    break;
                default:
                    break;
            }
            bebidas.setValidade(validade.getText());
            
            GenericDAO<Bebidas> genericDAO = new GenericDAOimpl<Bebidas>(){};
            genericDAO.Cadastrar(bebidas);
            JOptionPane.showMessageDialog(null,"O cadastro foi realizado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Preencha as Informações do Cadastro Corretamente");
        }
    }//GEN-LAST:event_cadasBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JButton cadasB;
    private javax.swing.JButton cadasC;
    private javax.swing.JTextField ingreC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nomeB;
    private javax.swing.JTextField nomeC;
    private javax.swing.JLabel nomeb1;
    private javax.swing.JComboBox<String> tipoB;
    private javax.swing.JComboBox<String> tipoC;
    private javax.swing.JTextField validade;
    private javax.swing.JTextField valorB;
    private javax.swing.JTextField valorC;
    // End of variables declaration//GEN-END:variables
}
