/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastroclientes;

import dao.IClienteDAO;
import dao.ClienteMapDAO;
import domain.Cliente;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class TelaPrincipal extends javax.swing.JFrame {
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    private IClienteDAO clienteDAO = new ClienteMapDAO();

      
    public TelaPrincipal() {
        initComponents();
        initCustomComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lblCpf = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        lblEnd = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtEnd = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNome.setText("Nome:");

        lblCpf.setText("CPF:");

        lblTel.setText("Telefone:");

        lblEnd.setText("Endereço:");

        txtTel.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtTelInputMethodTextChanged(evt);
            }
        });
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });
        txtTel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtTelPropertyChange(evt);
            }
        });

        lblCidade.setText("Cidade:");

        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaClientes);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        MenuSair.setText("Sair");
        MenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(MenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addGap(18, 18, 18)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEnd)
                                    .addComponent(lblTel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCpf)
                                .addGap(18, 18, 18)
                                .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnSalvar)
                        .addGap(86, 86, 86)
                        .addComponent(btnLimpar)
                        .addGap(92, 92, 92)
                        .addComponent(btnAlterar)
                        .addGap(104, 104, 104)
                        .addComponent(btnExcluir)))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEnd)
                            .addComponent(txtEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCidade))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvar)
                            .addComponent(btnLimpar)
                            .addComponent(btnAlterar)
                            .addComponent(btnExcluir))))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void MenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSairActionPerformed
             int result = JOptionPane.showConfirmDialog(this,"Deseja sair da aplicação?", "Sair",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
 
    }//GEN-LAST:event_MenuSairActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
   
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
   
    }//GEN-LAST:event_txtTelActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
                                        
    String nome = txtNome.getText();  
    String cpf = txtCpf.getText();
    String end = txtEnd.getText();
    String cidade = txtCidade.getText();
    String tel = txtTel.getText();
   
   
    if (!isCamposValido(nome, cpf, end, cidade, tel)) {
        JOptionPane.showMessageDialog(null, "Dados Incorretos", "Att", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
  
    Cliente cliente = new Cliente(nome, cpf, tel, end, cidade);
    Boolean isCadastrado = this.clienteDAO.cadastrar(cliente);
   
    if (isCadastrado) {
        modelo.addRow(new Object[]{cliente.getNome(), cliente.getCpf(), cliente.getEnd(), cliente.getCidade(), cliente.getTel()});
        btnLimpar();  // Limpa os campos após adicionar o cliente
    } else {
        JOptionPane.showMessageDialog(null, "Cliente já se encontra cadastrado", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
    txtNome.setText("");  
    txtCpf.setText(String.valueOf("")); 
    txtEnd.setText("");  
    txtCidade.setText("");  
    txtTel.setText("");  
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        String nome = txtNome.getText();  
        String cpf = txtCpf.getText();
        String end = txtEnd.getText();
        String cidade = txtCidade.getText();
        String tel = txtTel.getText(); 
        
       
        if (!isCamposValido(nome, cpf, end, cidade, tel)) {
        JOptionPane.showMessageDialog(null, "Dados Incorretos", "Att", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
        
    Cliente cliente = new Cliente(nome, cpf,  tel, end, cidade);
    boolean isAlterado = this.clienteDAO.alterar(cliente);

    if (isAlterado) {
        int linhaSelecionada = tabelaClientes.getSelectedRow();
       modelo.setValueAt(cliente.getNome(), linhaSelecionada, 0);
       modelo.setValueAt(cliente.getCidade(), linhaSelecionada, 2);
       modelo.setValueAt(cliente.getEnd(), linhaSelecionada, 3);
       modelo.setValueAt(cliente.getTel(), linhaSelecionada, 4);
        JOptionPane.showMessageDialog(null, "Dados Atualizados", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
        btnLimpar();
    } else {
        JOptionPane.showMessageDialog(null, "Erro ao alterar o cliente, o CPF não pode ser alterado", "ATENÇÃO", JOptionPane.INFORMATION_MESSAGE);
    }

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void tabelaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaClientesMouseClicked
          int linhaSelecionada = tabelaClientes.getSelectedRow();
        Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
        
        Cliente cliente  = this.clienteDAO.consultar(cpf);
  
        txtNome.setText(cliente.getNome());
        txtCpf.setText(String.valueOf(cliente.getCpf()));
        txtCidade.setText(cliente.getCidade());
        txtEnd.setText(cliente.getEnd());
        txtTel.setText(String.valueOf(cliente.getTel()));
        
        
        
        
    }//GEN-LAST:event_tabelaClientesMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
          int linhaSelecionada = tabelaClientes.getSelectedRow();
          
           if (linhaSelecionada >= 0) {
            int result = JOptionPane.showConfirmDialog(this,"Deseja realmente excluir este cliente?", "CUIDADO",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE);
        
            if(result == JOptionPane.YES_OPTION){

                Long cpf = (Long) tabelaClientes.getValueAt(linhaSelecionada, 1);
                this.clienteDAO.excluir(cpf);
                modelo.removeRow(linhaSelecionada);

                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso", "Sucesso",JOptionPane.INFORMATION_MESSAGE);
                btnLimpar();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum cliente selecionado.", "ERRO",JOptionPane.INFORMATION_MESSAGE);
        }
      
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void txtTelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtTelPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelPropertyChange

    private void txtTelInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtTelInputMethodTextChanged
      
    }//GEN-LAST:event_txtTelInputMethodTextChanged

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuSair;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEnd;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTable tabelaClientes;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtEnd;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

   
    
    private void initCustomComponents() {
      modelo.addColumn("Nome");
      modelo.addColumn("CPF");
     modelo.addColumn("Endereço");
      modelo.addColumn("Cidade");
      modelo.addColumn("TEL");
     tabelaClientes.setModel(modelo);
    }

    private void btnLimpar() {
       txtNome.setText("");  
       txtCpf.setText("");
       txtEnd.setText("");  
       txtCidade.setText("");  
       txtTel.setText(""); 
    }
    

    private boolean isCamposValido(String ...campos ){
        for(String campo : campos){
            if(campo == null || "".equals(campo)){
                return false;
            }
        }
         return true;
         
      }
}
