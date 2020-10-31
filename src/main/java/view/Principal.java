package view;

public class Principal extends javax.swing.JFrame {
    
    private int idUsuario;

    ListaDeContas listaDeContas = new ListaDeContas();
    CadastroCategoria cadastroCategoria = new CadastroCategoria(idUsuario);
    CadastroProduto cadastroProduto = new CadastroProduto(idUsuario);
    CadastroPessoa cadastroPessoa = new CadastroPessoa(idUsuario);
    CadastroContaAReceber contaAReceber = new CadastroContaAReceber(idUsuario);
    CadastroConta contaAPagar = new CadastroConta(idUsuario);
    CadastroFornecedor cadastroFornecedor = new CadastroFornecedor(idUsuario);
    
    public Principal(int idUsuario) {
        initComponents();
        this.idUsuario = idUsuario;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadastar = new javax.swing.JMenu();
        btnCategoria = new javax.swing.JMenuItem();
        btnProduto = new javax.swing.JMenuItem();
        btnPessoa = new javax.swing.JMenuItem();
        btnFornecedor = new javax.swing.JMenuItem();
        btnContasAPagar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        btnContas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastar.setText("Cadastros");
        btnCadastar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastarActionPerformed(evt);
            }
        });

        btnCategoria.setText("Categoria");
        btnCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoriaActionPerformed(evt);
            }
        });
        btnCadastar.add(btnCategoria);

        btnProduto.setText("Produto");
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });
        btnCadastar.add(btnProduto);

        btnPessoa.setText("Pessoa");
        btnPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoaActionPerformed(evt);
            }
        });
        btnCadastar.add(btnPessoa);

        btnFornecedor.setText("Fornecedor");
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });
        btnCadastar.add(btnFornecedor);

        btnContasAPagar.setText("Conta");
        btnContasAPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasAPagarActionPerformed(evt);
            }
        });
        btnCadastar.add(btnContasAPagar);

        jMenuBar1.add(btnCadastar);

        jMenu1.setText("Informações");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        btnContas.setText("Contas");
        btnContas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContasActionPerformed(evt);
            }
        });
        jMenu1.add(btnContas);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
            
    
    private void btnPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaActionPerformed
        cadastroPessoa.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnPessoaActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        cadastroProduto.preencheGrid();
        cadastroProduto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed

        cadastroCategoria.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastarActionPerformed

    private void btnContasAPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasAPagarActionPerformed
        contaAPagar.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContasAPagarActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void btnContasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContasActionPerformed
        listaDeContas.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnContasActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        cadastroFornecedor.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnFornecedorActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCadastar;
    private javax.swing.JMenuItem btnCategoria;
    private javax.swing.JMenuItem btnContas;
    private javax.swing.JMenuItem btnContasAPagar;
    private javax.swing.JMenuItem btnFornecedor;
    private javax.swing.JMenuItem btnPessoa;
    private javax.swing.JMenuItem btnProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
