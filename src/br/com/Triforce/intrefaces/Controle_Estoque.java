/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.Triforce.intrefaces;

import br.com.Triforce.model.ProdutoEstoque;

/**
 *
 * @author l147033
 */
public class Controle_Estoque extends Geral {

    /**
     * Creates new form Consultar_Estoque
     */
    private ProdutoEstoque prod;
    public Controle_Estoque(ProdutoEstoque prod) {
        initComponents();
        this.prod = prod;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btn_consultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab_estoque = new javax.swing.JTable();
        btn_Voltar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btn_confirmar = new javax.swing.JButton();
        rad_adicionar = new javax.swing.JRadioButton();
        rad_remover = new javax.swing.JRadioButton();
        lbl_Produto = new javax.swing.JLabel();
        lbl_Qtd = new javax.swing.JLabel();
        txt_Qtd = new javax.swing.JTextField();

        setTitle("Controle de Estoque");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Controle Estoque");

        btn_consultar.setText("Consultar");
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_consultarMouseClicked(evt);
            }
        });

        tab_estoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Volume", "Autor", "Data_Lançamento", "Categoria", "Preço", "Saldo", "Quantidade"
            }
        ));
        jScrollPane1.setViewportView(tab_estoque);

        btn_Voltar.setText("Voltar");
        btn_Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_VoltarMouseClicked(evt);
            }
        });

        btn_confirmar.setText("Confirmar");

        buttonGroup1.add(rad_adicionar);
        rad_adicionar.setText("Adicionar");

        buttonGroup1.add(rad_remover);
        rad_remover.setText("Remover");

        lbl_Produto.setText("Produto:");

        lbl_Qtd.setText("Qtd:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rad_adicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rad_remover)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_Produto)
                                    .addComponent(lbl_Qtd))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_Qtd, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                    .addComponent(jTextField1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_Voltar, btn_confirmar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_consultar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Produto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Qtd)
                    .addComponent(txt_Qtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rad_adicionar)
                    .addComponent(rad_remover)
                    .addComponent(btn_Voltar)
                    .addComponent(btn_confirmar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_VoltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_VoltarMouseClicked

    private void btn_consultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseClicked
        abreJanela(new Consultar_Produto(prod), 0);
    }//GEN-LAST:event_btn_consultarMouseClicked

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_consultar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_Produto;
    private javax.swing.JLabel lbl_Qtd;
    private javax.swing.JRadioButton rad_adicionar;
    private javax.swing.JRadioButton rad_remover;
    private javax.swing.JTable tab_estoque;
    private javax.swing.JTextField txt_Qtd;
    // End of variables declaration//GEN-END:variables
}
