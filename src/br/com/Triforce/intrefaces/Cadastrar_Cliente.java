/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Triforce.intrefaces;

import java.awt.Color;
import javax.swing.JOptionPane;
import br.com.Triforce.model.ClienteRegistro;


/**
 *
 * @author l147033
 */

public class Cadastrar_Cliente extends Geral {

    /**
     * Creates new form Cadastrar_Cliente
     */
    private ClienteRegistro cliReg;
 
    public Cadastrar_Cliente(ClienteRegistro cliReg) {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_cod.setText(Integer.toString(cliReg.retornaMap()+ 1) );
        txt_cod.setEditable(false);
        
        this.cliReg = cliReg;
        lbl_confirmar_nome.setVisible(false);
        lbl_confirmar_nome.setForeground(Color.red);
        lbl_confirmar_cpf.setVisible(false);
        lbl_confirmar_cpf.setForeground(Color.red);
        lbl_confirmar_rg.setVisible(false);
        lbl_confirmar_rg.setForeground(Color.red);
        lbl_confirmar_telefone.setVisible(false);
        lbl_confirmar_telefone.setForeground(Color.red);
        lbl_confirmar_email.setVisible(false);
        lbl_confirmar_email.setForeground(Color.red);
        lbl_confirmar_endereco.setVisible(false);
        lbl_confirmar_endereco.setForeground(Color.red);
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
        txt_telefone = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_endereco = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();
        lbl_confirmar_nome = new javax.swing.JLabel();
        lbl_confirmar_cpf = new javax.swing.JLabel();
        lbl_confirmar_telefone = new javax.swing.JLabel();
        lbl_confirmar_email = new javax.swing.JLabel();
        lbl_confirmar_endereco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_rg = new javax.swing.JTextField();
        lbl_confirmar_rg = new javax.swing.JLabel();
        lbl_cod = new javax.swing.JLabel();
        txt_cod = new javax.swing.JTextField();

        setTitle("Cadastrar Cliente");
        setMinimumSize(new java.awt.Dimension(380, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Cadastrar Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Nome*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("CPF*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setText("Telefone*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        jLabel5.setText("E-mail*");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jLabel6.setText("Endereço*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));
        getContentPane().add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 350, -1));
        getContentPane().add(txt_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));
        getContentPane().add(txt_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 120, -1));
        getContentPane().add(txt_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 210, -1));
        getContentPane().add(txt_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 350, -1));

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_cadastrar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_cadastrar.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cadastrarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 110, -1));

        btn_voltar.setText("Voltar");
        btn_voltar.setMaximumSize(new java.awt.Dimension(80, 30));
        btn_voltar.setMinimumSize(new java.awt.Dimension(80, 30));
        btn_voltar.setPreferredSize(new java.awt.Dimension(80, 30));
        btn_voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_voltarMouseClicked(evt);
            }
        });
        getContentPane().add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 110, -1));

        lbl_confirmar_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_nome.setText(" *");
        getContentPane().add(lbl_confirmar_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 20, 20));

        lbl_confirmar_cpf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_cpf.setText(" *");
        lbl_confirmar_cpf.setName("lbl_confirmar_cpf"); // NOI18N
        getContentPane().add(lbl_confirmar_cpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 20, -1));

        lbl_confirmar_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_telefone.setText(" *");
        lbl_confirmar_telefone.setName("lbl_confirmar_telefone"); // NOI18N
        getContentPane().add(lbl_confirmar_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 20, -1));

        lbl_confirmar_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_email.setText(" *");
        lbl_confirmar_email.setName("lbl_confirmar_email"); // NOI18N
        getContentPane().add(lbl_confirmar_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 20, -1));

        lbl_confirmar_endereco.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_endereco.setText(" *");
        lbl_confirmar_endereco.setName("lbl_confirmar_endereco"); // NOI18N
        getContentPane().add(lbl_confirmar_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 20, -1));

        jLabel7.setText("* campos obrigátorios");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        jLabel8.setText("RG*");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));
        getContentPane().add(txt_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, -1));

        lbl_confirmar_rg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_confirmar_rg.setText(" *");
        lbl_confirmar_rg.setName("lbl_confirmar_cpf"); // NOI18N
        getContentPane().add(lbl_confirmar_rg, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 20, -1));

        lbl_cod.setText("Codigo");
        getContentPane().add(lbl_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));
        getContentPane().add(txt_cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_voltarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btn_voltarMouseClicked

    private void btn_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cadastrarMouseClicked
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
       //telefone
        if(txt_telefone.getText().length()>0)
        {
            lbl_confirmar_telefone.setVisible(false);
        }else{
            lbl_confirmar_telefone.setVisible(true);
        }
        //email
        if(txt_email.getText().length() > 0 )
        {
            lbl_confirmar_email.setVisible(false);
        }else{
            lbl_confirmar_email.setVisible(true);
        }
        //endereço
        if(txt_endereco.getText().length() > 0)
        {
            lbl_confirmar_endereco.setVisible(false);
        }else{
            lbl_confirmar_endereco.setVisible(true);
        }
        //rg
        if(txt_rg.getText().length() > 0)
        {
            lbl_confirmar_rg.setVisible(false);
        }else{
            lbl_confirmar_rg.setVisible(true);
        }
        //// fim dos if encadeados 
        
        if(txt_nome.getText().length() > 0 
           && txt_cpf.getText().length()> 0 
           && txt_telefone.getText().length() > 0 
           && txt_email.getText().length() > 0 
           && txt_endereco.getText().length() > 0 
           && txt_rg.getText().length() > 0) 
        {
            cliReg.adicionaCli(cliReg.retornaMap() + 1, 
                                txt_nome.getText(), 
                                txt_rg.getText(),
                                txt_cpf.getText(),
                                txt_email.getText(),
                                txt_telefone.getText(),
                                txt_endereco.getText());
        JOptionPane.showMessageDialog(null, "Dados cadastrados com Sucesso"); 
        limptaTuto();
        }
        else{
       JOptionPane.showMessageDialog(null, "Favor inserir dados nos campos obrigatórios" );
        }
    }//GEN-LAST:event_btn_cadastrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public void limptaTuto() {
        txt_nome.setText("");
        txt_telefone.setText("");
        txt_email.setText("");
        txt_cod.setText(Integer.toString(cliReg.retornaMap() + 1));
        txt_rg.setText("");
        txt_cpf.setText("");
        txt_endereco.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbl_cod;
    private javax.swing.JLabel lbl_confirmar_cpf;
    private javax.swing.JLabel lbl_confirmar_email;
    private javax.swing.JLabel lbl_confirmar_endereco;
    private javax.swing.JLabel lbl_confirmar_nome;
    private javax.swing.JLabel lbl_confirmar_rg;
    private javax.swing.JLabel lbl_confirmar_telefone;
    private javax.swing.JTextField txt_cod;
    private javax.swing.JTextField txt_cpf;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_endereco;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_rg;
    private javax.swing.JTextField txt_telefone;
    // End of variables declaration//GEN-END:variables
}