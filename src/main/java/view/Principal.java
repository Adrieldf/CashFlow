package view;

import controller.*;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        btnCadastar = new javax.swing.JMenu();
        btnCategoria = new javax.swing.JMenuItem();
        btnProduto = new javax.swing.JMenuItem();
        btnPessoa = new javax.swing.JMenuItem();
        btnContasAReceber = new javax.swing.JMenuItem();
        btnContasAPagar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

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

        btnContasAReceber.setText("Contas a recerber");
        btnCadastar.add(btnContasAReceber);

        btnContasAPagar.setText("Conta a pagar");
        btnCadastar.add(btnContasAPagar);

        jMenuBar1.add(btnCadastar);

        jMenu1.setText("Informações");
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

    public void exibir()
    {
        setVisible(true);
    }
            
    
    private void btnPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoaActionPerformed
        CadastroPessoaController pessoa = new CadastroPessoaController();
        pessoa.chamarTela();
        dispose();
    }//GEN-LAST:event_btnPessoaActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        CadastroProdutoController produto = new CadastroProdutoController();
        produto.chamarTela();
        dispose();
    }//GEN-LAST:event_btnProdutoActionPerformed

    private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoriaActionPerformed
        CadastroCategoriaController categoria = new CadastroCategoriaController();
        categoria.chamarTela();
        dispose();
    }//GEN-LAST:event_btnCategoriaActionPerformed

    private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastarActionPerformed

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
    private javax.swing.JMenuItem btnContasAPagar;
    private javax.swing.JMenuItem btnContasAReceber;
    private javax.swing.JMenuItem btnPessoa;
    private javax.swing.JMenuItem btnProduto;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
