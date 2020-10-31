package view;

//import controller.Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import controller.ContaController;
import controller.ListaDeContasController;
import controller.TelaPrincipalController;
import facade.Facade;
import java.util.ArrayList;
import model.Categoria;
import model.Fornecedor;
import model.Produto;
import model.Conta;
import model.Parcela;

public class ListaDeContas extends javax.swing.JFrame {

    private int idUsuario;
    private List<Categoria> listaCategorias;
    private List<Produto> listaProdutos;
    private List<Fornecedor> listaFornecedor;
    private List<Conta> listaContasFiltro;
    private List<Conta> listaContas;
    private List<Parcela> listaParcelas;
    private Facade facade = new Facade();

    public ListaDeContasController contasController = new ListaDeContasController();

    public ListaDeContas() {
        initComponents();

        listaCategorias = facade.buscaTodasCategorias();
        listaProdutos = facade.buscaTodosProdutos();
        listaFornecedor = facade.buscaTodosFornecedor();
        listaContas = facade.buscaTodos(idUsuario);
        for (Conta conta : listaContas) {
            for (Parcela parcela : facade.buscaParcelaPorConta(conta.getId())) {
                listaParcelas.add(parcela);
            }
        }

        preencheComboboxCategoria();
        preencheComboboxFornecedor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnNovo2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        input_conta = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        combobox_tipo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        combobox_categoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combobox_produto = new javax.swing.JComboBox<>();
        checkbox_finalizada = new javax.swing.JCheckBox();
        checkbox_renegociada = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        combobox_fornecedor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        jCheckBox2.setSelected(true);
        jCheckBox2.setText("Contas já pagas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        btnNovo2.setText("Voltar");
        btnNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo2ActionPerformed(evt);
            }
        });

        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Tipo", "Conta", "Valor total", "Categoria", "Produto", "Efetuado", "Renegociado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(grid);

        jLabel6.setText("Conta:");

        input_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_contaActionPerformed(evt);
            }
        });

        jButton2.setText("Exibir todas contas");

        combobox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Pagar", "Receber" }));

        jLabel1.setText("Tipo:");

        combobox_categoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        combobox_categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_categoriaActionPerformed(evt);
            }
        });

        jLabel7.setText("Categoria:");

        jLabel2.setText("Produto:");

        combobox_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        combobox_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_produtoActionPerformed(evt);
            }
        });

        checkbox_finalizada.setText("Finalizada");
        checkbox_finalizada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_finalizadaActionPerformed(evt);
            }
        });

        checkbox_renegociada.setText("Renegociada");

        jLabel3.setText("Fornecedor:");

        combobox_fornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos" }));
        combobox_fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox_fornecedorActionPerformed(evt);
            }
        });

        jButton1.setText("Filtrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNovo2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(combobox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(checkbox_renegociada)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combobox_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkbox_finalizada)
                            .addComponent(combobox_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(checkbox_renegociada)
                                    .addComponent(checkbox_finalizada))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(combobox_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combobox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(input_conta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(combobox_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(combobox_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(42, 42, 42)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnNovo2)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencheComboboxCategoria() {
        for (Categoria categoria : listaCategorias) {
            combobox_categoria.addItem(categoria.getNomeCategoria());
        }
    }

    private void preencheComboboxFornecedor() {
        for (Fornecedor fornecedor : listaFornecedor) {
            combobox_fornecedor.addItem(fornecedor.getNome());
        }
    }

    private void preencheComboboxProduto() {
        combobox_produto.removeAllItems();

        String nomeCategoria = (String) combobox_categoria.getSelectedItem();

        combobox_produto.addItem("Todos");

        if (nomeCategoria.equals("Todos")) {
            return;
        }

        for (Categoria categoria : listaCategorias) {
            if (categoria.getNomeCategoria().equals(nomeCategoria)) {

                for (Produto produto : listaProdutos) {
                    if (produto.getIdCategoria() == categoria.getIdCategoria()) {
                        combobox_produto.addItem(produto.getNomeProduto());
                    }
                }
                break;
            }
        }

    }

    private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovo2ActionPerformed
        //Voltar
        Principal principal = new Principal(idUsuario);
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnNovo2ActionPerformed

    private void input_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_contaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_contaActionPerformed

    private void combobox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_categoriaActionPerformed
        preencheComboboxProduto();
    }//GEN-LAST:event_combobox_categoriaActionPerformed

    private void combobox_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_produtoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_produtoActionPerformed

    private void checkbox_finalizadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_finalizadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkbox_finalizadaActionPerformed

    private void combobox_fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox_fornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combobox_fornecedorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        List<Integer> listaIdProdutoFiltro = new ArrayList<Integer>();
        listaContasFiltro.clear();
        
        for (Categoria categoria : listaCategorias) {
            if (combobox_categoria.getSelectedItem().equals(categoria.getNomeCategoria())) {
                for (Produto produto : listaProdutos) {
                    if (combobox_categoria.getSelectedItem().equals(produto.getNomeProduto()) || combobox_categoria.getSelectedItem().equals("Todos")) {
                        listaIdProdutoFiltro.add(produto.getId());
                    }
                }
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JCheckBox checkbox_finalizada;
    private javax.swing.JCheckBox checkbox_renegociada;
    private javax.swing.JComboBox<String> combobox_categoria;
    private javax.swing.JComboBox<String> combobox_fornecedor;
    private javax.swing.JComboBox<String> combobox_produto;
    private javax.swing.JComboBox<String> combobox_tipo;
    private javax.swing.JTable grid;
    private javax.swing.JTextField input_conta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
