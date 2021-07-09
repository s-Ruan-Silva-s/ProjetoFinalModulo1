package projetofinalmodulo1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * @author Ruan Silva
 */
public class Cadastros extends javax.swing.JFrame {

    public Cadastros() {
        initComponents();
    }
    public static ArrayList<Alunos> alunos = new ArrayList<>();
    public static ArrayList<Alunos> alunosAcimaDaMedia = new ArrayList<>();
    public static ArrayList<Alunos> alunosAbaixoDaMedia = new ArrayList<>();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nota1 = new javax.swing.JTextField();
        nota2 = new javax.swing.JTextField();
        nota3 = new javax.swing.JTextField();
        nota4 = new javax.swing.JTextField();
        pontoExtra = new javax.swing.JTextField();
        irParaPaginaInicial = new javax.swing.JButton();
        irParaPlanilha = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        limparDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("NOME");

        jLabel2.setText("Nota 1");

        jLabel3.setText("Ponto extra");

        jLabel4.setText("Nota 2");

        jLabel5.setText("Nota 3");

        jLabel6.setText("Nota 4");

        nota1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nota1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota1ActionPerformed(evt);
            }
        });

        nota2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nota3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        nota4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nota4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nota4ActionPerformed(evt);
            }
        });

        pontoExtra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pontoExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pontoExtraActionPerformed(evt);
            }
        });

        irParaPaginaInicial.setText("PÁGINA INICIAL");
        irParaPaginaInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irParaPaginaInicialActionPerformed(evt);
            }
        });

        irParaPlanilha.setText(" PLANILHA");
        irParaPlanilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                irParaPlanilhaActionPerformed(evt);
            }
        });

        cadastrar.setText("CADASTRAR");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        limparDados.setText("LIMPAR DADOS");
        limparDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 176, Short.MAX_VALUE)
                .addComponent(irParaPaginaInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(irParaPlanilha, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pontoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(limparDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nota4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pontoExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrar)
                    .addComponent(limparDados))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(irParaPlanilha)
                    .addComponent(irParaPaginaInicial)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    void limparDados(){
        nome.setText("");
        nota1.setText("");
        nota2.setText("");
        nota3.setText("");
        nota4.setText("");
        pontoExtra.setText("");
    }
    
    private void nota4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota4ActionPerformed

    }//GEN-LAST:event_nota4ActionPerformed

    private void irParaPaginaInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irParaPaginaInicialActionPerformed
        new PaginaInicial().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_irParaPaginaInicialActionPerformed

    private void irParaPlanilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_irParaPlanilhaActionPerformed
        Planilha planilha = new Planilha();
        planilha.setVisible(true);
        
        //i--ALIMENTA/ATUALIZA A PLANILHA--//
        planilha.atualizaPlanilha(alunos);
        planilha.atualizaPlanilhaAprovados(alunosAcimaDaMedia);
        planilha.atualizaPlanilhaReprovados(alunosAbaixoDaMedia);
        //f--ALIMENTA/ATUALIZA A PLANILHA--//
        
        this.dispose();
    }//GEN-LAST:event_irParaPlanilhaActionPerformed

    private void nota1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nota1ActionPerformed

    }//GEN-LAST:event_nota1ActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        //i--RECEBENDO OS DADOS DIGITADOS NO PROGRAMA--//
        String recebeNome = nome.getText();
        double recebeNota1 = Double.parseDouble(nota1.getText());
        double recebeNota2 = Double.parseDouble(nota2.getText());
        double recebeNota3 = Double.parseDouble(nota3.getText());
        double recebeNota4 = Double.parseDouble(nota4.getText());
        double recebePontoExtra = Double.parseDouble(pontoExtra.getText());
        if(recebePontoExtra<=0 || recebePontoExtra>2){
            recebePontoExtra = 0;
        }
        double media = (recebeNota1+recebeNota2+recebeNota3+recebeNota4)/4+recebePontoExtra;
        double notaMinima = 6;

        //f--RECEBENDO OS DADOS DIGITADOS NO PROGRAMA--//
        
        //i--ADICIONANDO OS DADOS NO ARRAYLIST--//
        
        if(recebeNome.equals("") || recebeNome.equals(" ")){
            JOptionPane.showMessageDialog(null, "Por favor, informe o nome do aluno");
        }else{
            alunos.add(new Alunos(recebeNome,recebeNota1,recebeNota2,
                              recebeNota3,recebeNota4,recebePontoExtra));
            JOptionPane.showMessageDialog(null, "Dados cadastrados ^-^");

            //i.1--SEPARANDO OS DADOS NO ARRAYLIST--//
            if(media>=notaMinima){
                alunosAcimaDaMedia.add(new Alunos(recebeNome,recebeNota1,recebeNota2,
                                    recebeNota3,recebeNota4,recebePontoExtra));
            }else if(media<notaMinima){
                alunosAbaixoDaMedia.add(new Alunos(recebeNome,recebeNota1,recebeNota2,
                                    recebeNota3,recebeNota4,recebePontoExtra));
            }
            limparDados();
            //f.1--SEPARANDO OS DADOS NO ARRAYLIST--//
               
        }
        //f--ADICIONANDO OS DADOS NO ARRAYLIST--//
        

    }//GEN-LAST:event_cadastrarActionPerformed

    private void limparDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparDadosActionPerformed
        limparDados();   
    }//GEN-LAST:event_limparDadosActionPerformed

    private void pontoExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pontoExtraActionPerformed
    }//GEN-LAST:event_pontoExtraActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton irParaPaginaInicial;
    private javax.swing.JButton irParaPlanilha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton limparDados;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nota1;
    private javax.swing.JTextField nota2;
    private javax.swing.JTextField nota3;
    private javax.swing.JTextField nota4;
    private javax.swing.JTextField pontoExtra;
    // End of variables declaration//GEN-END:variables
}
