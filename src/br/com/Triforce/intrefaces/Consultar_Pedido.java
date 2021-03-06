/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import br.com.Triforce.model.CodigoExcluidoRegistro;
import br.com.Triforce.model.FornecedorRegistro;
import br.com.Triforce.model.Pedido;
import br.com.Triforce.model.PedidoRegistro;
import br.com.Triforce.model.ProdutoEstoque;
import javax.swing.JOptionPane;

/**
 *
 * @author angelo
 */
public class Consultar_Pedido extends Geral {

    /**
     * Creates new form Consultar_Produto
     */
    private PedidoTableModel model;
    private ProdutoEstoque prod;
    private FornecedorRegistro forn;
    private PedidoRegistro reg;
    private CodigoExcluidoRegistro ex;
    public Consultar_Pedido(ProdutoEstoque prod,FornecedorRegistro forn,PedidoRegistro reg,CodigoExcluidoRegistro ex) {
        initComponents();
        this.prod = prod;
        this.forn = forn;
        this.reg = reg;
        this.ex = ex;
        model = new PedidoTableModel(reg);
        jTable1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Novo = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        lbl_Produto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_Baixar = new javax.swing.JButton();

        setTitle("Pedidos");
        setMinimumSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Novo.setText("Novo");
        btn_Novo.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NovoMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 123, -1));

        btn_Consultar.setText("Consultar");
        btn_Consultar.setPreferredSize(new java.awt.Dimension(80, 25));
        getContentPane().add(btn_Consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 39, 123, -1));

        btn_Alterar.setText("Alterar");
        btn_Alterar.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AlterarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_Alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 39, 123, -1));

        btn_Excluir.setText("Excluir");
        btn_Excluir.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 39, 123, -1));

        lbl_Produto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Produto.setText("Pedido");
        getContentPane().add(lbl_Produto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Fornecedor", "Data Lcto", "Data Prevista", "Baixado"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 757, 230));

        btn_Baixar.setText("Baixar");
        btn_Baixar.setPreferredSize(new java.awt.Dimension(80, 25));
        getContentPane().add(btn_Baixar, new org.netbeans.lib.awtextra.AbsoluteConstraints(526, 39, 123, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NovoMouseClicked
        abreJanela(new Cadastrar_Pedido(prod,forn,reg,ex), 0);
    }//GEN-LAST:event_btn_NovoMouseClicked

    private void btn_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AlterarMouseClicked
        abreJanela(new Cadastrar_Pedido(prod,forn,reg,ex), 1);
    }//GEN-LAST:event_btn_AlterarMouseClicked

    private void btn_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ExcluirActionPerformed
        // TODO add your handling code here:
        int linha = jTable1.getSelectedRow();
        int codigo = model.getCodigo(linha);
        ex.setPed(codigo, ex.getPed(1) + 1);
        reg.removeMap(codigo);
        
        JOptionPane.showMessageDialog(rootPane, "Produto: " + codigo + "Excluido com sucesso");
    }//GEN-LAST:event_btn_ExcluirActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Baixar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_Produto;
    // End of variables declaration//GEN-END:variables
}
