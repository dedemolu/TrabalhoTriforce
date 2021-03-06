/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import br.com.Triforce.model.FuncionarioRegistro;

/**
 *
 * @author angelo
 */
public class Consultar_Funcionario extends Geral {

    /**
     * Creates new form Consultar_Produto
     */
    private FuncionarioTableModel model;
    private FuncionarioRegistro funReg;
    private FuncionarioTableBusca mod;
    public Consultar_Funcionario(FuncionarioRegistro funReg) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.funReg = funReg;
        model = new FuncionarioTableModel(funReg);
        tab_Funcionario.setModel(model);
        addWindowListener(new WindowAdapter (){
           @Override public void windowClosing(WindowEvent e){
               funReg.salvar();// serve para quando fechar a janela, salvar meu arquivo
           } 
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab_Funcionario = new javax.swing.JTable();
        btn_Novo = new javax.swing.JButton();
        btn_Consultar = new javax.swing.JButton();
        btn_Alterar = new javax.swing.JButton();
        btn_Excluir = new javax.swing.JButton();
        lbl_Funcionario = new javax.swing.JLabel();

        setTitle("Funcionários");

        tab_Funcionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "CPF", "Email", "Telefone", "Usuário"
            }
        ));
        jScrollPane1.setViewportView(tab_Funcionario);

        btn_Novo.setText("Novo");
        btn_Novo.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Novo.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Novo.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Novo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_NovoMouseClicked(evt);
            }
        });

        btn_Consultar.setText("Consultar Todos");
        btn_Consultar.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Consultar.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Consultar.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConsultarActionPerformed(evt);
            }
        });

        btn_Alterar.setText("Alterar");
        btn_Alterar.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Alterar.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Alterar.setPreferredSize(new java.awt.Dimension(80, 25));
        btn_Alterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_AlterarMouseClicked(evt);
            }
        });

        btn_Excluir.setText("Excluir");
        btn_Excluir.setMaximumSize(new java.awt.Dimension(80, 25));
        btn_Excluir.setMinimumSize(new java.awt.Dimension(80, 25));
        btn_Excluir.setPreferredSize(new java.awt.Dimension(80, 25));

        lbl_Funcionario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_Funcionario.setText("Funcionário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_Funcionario))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_Alterar, btn_Excluir, btn_Novo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Funcionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Novo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_NovoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NovoMouseClicked
        abreJanela(new Cadastrar_Funcionario(funReg), 0);
    }//GEN-LAST:event_btn_NovoMouseClicked

    private void btn_AlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_AlterarMouseClicked
        String consultarCodigo = JOptionPane.showInputDialog("Insira um codigo");
        if(consultarCodigo.length() > 0 ){
            mod = new FuncionarioTableBusca(funReg, Integer.parseInt(consultarCodigo));//traz o codigo pra Modificar apenas um 
            if(Integer.parseInt(consultarCodigo) <= funReg.retornaMap()){
            tab_Funcionario.setModel(mod);    
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro Codigo Inexistente");
            }
            
          
       }
    }//GEN-LAST:event_btn_AlterarMouseClicked

    private void btn_ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConsultarActionPerformed
        // TODO add your handling code here:
         model = new FuncionarioTableModel(funReg);
        tab_Funcionario.setModel(model);
    }//GEN-LAST:event_btn_ConsultarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Alterar;
    private javax.swing.JButton btn_Consultar;
    private javax.swing.JButton btn_Excluir;
    private javax.swing.JButton btn_Novo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Funcionario;
    private javax.swing.JTable tab_Funcionario;
    // End of variables declaration//GEN-END:variables
}
