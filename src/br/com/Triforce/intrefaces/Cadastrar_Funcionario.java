/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.Triforce.intrefaces;

import java.awt.Color;
import javax.swing.JOptionPane;

import br.com.Triforce.model.FuncionarioRegistro;

/**
 *
 * @author l147033
 */
public class Cadastrar_Funcionario extends Geral {

    /**
     * Creates new form Cadastrar_Funcionario
     */
    private FuncionarioRegistro funcReg;
   
    
    public Cadastrar_Funcionario(FuncionarioRegistro funcReg) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.funcReg = funcReg;
        
        txt_cod.setText(Integer.toString(funcReg.retornaMap()+ 1));
        txt_cod.setEditable(false);
        lbl_confirmar_nome.setVisible(false);
        lbl_confirmar_nome.setForeground(Color.red);
        lbl_confirmar_rg.setVisible(false);
        lbl_confirmar_rg.setForeground(Color.red);
        lbl_confirmar_endereco.setVisible(false);
        lbl_confirmar_endereco.setForeground(Color.red);
        lbl_confirmar_cpf.setVisible(false);
        lbl_confirmar_cpf.setForeground(Color.red);        
        lbl_confirmar_email.setVisible(false);
        lbl_confirmar_email.setForeground(Color.red);
        lbl_confirmar_telefone.setVisible(false);
        lbl_confirmar_telefone.setForeground(Color.red);
        lbl_confirmar_senha.setVisible(false);
        lbl_confirmar_senha.setForeground(Color.red);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_cpf = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_telefone = new javax.swing.JTextField();
        txt_senha = new javax.swing.JTextField();
        btn_gravar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_confirmar_nome = new javax.swing.JLabel();
        lbl_confirmar_cpf = new javax.swing.JLabel();
        lbl_confirmar_email = new javax.swing.JLabel();
        lbl_confirmar_senha = new javax.swing.JLabel();
        lbl_confirmar_telefone = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbl_rg = new javax.swing.JLabel();
        txt_rg = new javax.swing.JTextField();
        lbl_confirmar_rg = new javax.swing.JLabel();
        lbl_endereco = new javax.swing.JLabel();
        txt_endereco = new javax.swing.JTextField();
        lbl_confirmar_endereco = new javax.swing.JLabel();
        lbl_cod = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();

        setTitle("Cadastrar Funcionário");
        setForeground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(380, 420));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Funcionario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Nome*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel3.setText("CPF*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, -1));

        jLabel4.setText("Email*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel5.setText("Telefone*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, -1, -1));

        jLabel6.setText("Senha*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 360, -1));
        getContentPane().add(txt_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, -1));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 180, -1));
        getContentPane().add(txt_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 160, -1));
        getContentPane().add(txt_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 360, -1));

        btn_gravar.setText("Gravar");
        btn_gravar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_gravar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_gravar.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gravarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_gravar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        btn_voltar.setText("Voltar");
        btn_voltar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_voltar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_voltar.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        lbl_confirmar_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_nome.setText(" *");
        getContentPane().add(lbl_confirmar_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 24, -1));

        lbl_confirmar_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_cpf.setText(" *");
        getContentPane().add(lbl_confirmar_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 18, -1));

        lbl_confirmar_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_email.setText(" *");
        getContentPane().add(lbl_confirmar_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 22, -1));

        lbl_confirmar_senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_senha.setText(" *");
        getContentPane().add(lbl_confirmar_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 16, -1));

        lbl_confirmar_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_telefone.setText(" *");
        getContentPane().add(lbl_confirmar_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, 21, -1));

        jLabel7.setText("* campos obrigátorios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, -1));

        lbl_rg.setText("RG*");
        getContentPane().add(lbl_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        getContentPane().add(txt_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 170, -1));

        lbl_confirmar_rg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_rg.setText(" *");
        getContentPane().add(lbl_confirmar_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 18, -1));

        lbl_endereco.setText("Endereço*");
        getContentPane().add(lbl_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));
        getContentPane().add(txt_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 360, -1));

        lbl_confirmar_endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_endereco.setText(" *");
        getContentPane().add(lbl_confirmar_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 24, -1));

        lbl_cod.setText("Codigo");
        getContentPane().add(lbl_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));
        getContentPane().add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gravarActionPerformed
        // TODO add your handling code here:
          if (txt_nome.getText().length() > 0)
        {
            lbl_confirmar_nome.setVisible(false);
            
        }else
        {
            lbl_confirmar_nome.setVisible(true);
            
        }
        //cpf
        if(txt_cpf.getText().length() > 0 )
        {
            lbl_confirmar_cpf.setVisible(false);
        }else{
            lbl_confirmar_cpf.setVisible(true);
        }
        //email
        if(txt_email.getText().length() > 0 )
        {
            lbl_confirmar_email.setVisible(false);
        }else{
            lbl_confirmar_email.setVisible(true);
        }
       //telefone
        if(txt_telefone.getText().length()>0)
        {
            lbl_confirmar_telefone.setVisible(false);
        }else{
            lbl_confirmar_telefone.setVisible(true);
        }        
        //senha
        if(txt_senha.getText().length() > 0)
        {
            lbl_confirmar_senha.setVisible(false);
        }else{
            lbl_confirmar_senha.setVisible(true);
        }
            //rg
        if(txt_rg.getText().length() > 0)
        {
            lbl_confirmar_rg.setVisible(false);
        }else{
            lbl_confirmar_rg.setVisible(true);
        }
        
       //endereco
        if(txt_endereco.getText().length() > 0)
        {
            lbl_confirmar_endereco.setVisible(false);
        }else{
            lbl_confirmar_endereco.setVisible(true);
        }
        //// fim dos if encadeados 
        
        if(txt_nome.getText().length() > 0 
           && txt_cpf.getText().length()> 0
           && txt_rg.getText().length()> 0
           && txt_email.getText().length() > 0
           && txt_telefone.getText().length() > 0            
           && txt_senha.getText().length() > 0)          
        {
            funcReg.adicionaFunc(funcReg.retornaMap()+ 1, 
                                txt_nome.getText(), 
                                txt_rg.getText(),
                                txt_cpf.getText(),
                                txt_email.getText(),
                                txt_telefone.getText(),
                                txt_endereco.getText(), 
                                txt_email.getText(),
                                txt_senha.getText());
        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso"); 
        limptaTuto();
        }
        else{
       JOptionPane.showMessageDialog(null, "Favor inserir dados nos campos Obrigatórios" );
        }
    }//GEN-LAST:event_btn_gravarActionPerformed

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked
public void limptaTuto() {
        txt_nome.setText("");
        txt_telefone.setText("");
        txt_email.setText("");
        txt_cod.setText(Integer.toString(funcReg.retornaMap() + 1));
        txt_rg.setText("");
        txt_cpf.setText("");
        txt_endereco.setText("");
        txt_senha.setText("");
        
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_gravar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_confirmar_cpf;
    private javax.swing.JLabel lbl_confirmar_email;
    private javax.swing.JLabel lbl_confirmar_endereco;
    private javax.swing.JLabel lbl_confirmar_nome;
    private javax.swing.JLabel lbl_confirmar_rg;
    private javax.swing.JLabel lbl_confirmar_senha;
    private javax.swing.JLabel lbl_confirmar_telefone;
    private javax.swing.JLabel lbl_endereco;
    private javax.swing.JLabel lbl_rg;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_senha;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}