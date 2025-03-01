package view;

import facade.Facade;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import model.Fornecedor;

public class CadastroFornecedor extends JFrame {

    private int idUsuario;
    public Facade facade = new Facade();
    private JFrame tela;

    public CadastroFornecedor(int idUsuario, JFrame tela) {
        initComponents();
        this.idUsuario = idUsuario;
        this.tela = tela;

        DefaultTableModel linha = (DefaultTableModel) grid.getModel();
        linha.getDataVector().removeAllElements();
        linha.setRowCount(0);

        List<Fornecedor> listaFornecedor = this.facade.buscaTodosFornecedor(idUsuario);

        for (Fornecedor fornecedor : listaFornecedor) {
            Object[] dados = {
                fornecedor.getNome(),
                fornecedor.getTelefone(),
                fornecedor.getEmail(),
                fornecedor.getEndereco()
            };
            linha.addRow(dados);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNovo2 = new javax.swing.JButton();
        btnNovo3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        input_telefone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        input_fornecedor = new javax.swing.JTextField();
        input_email = new javax.swing.JTextField();
        input_endereco = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        btnNovo2.setText("Voltar");
        btnNovo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo2ActionPerformed(evt);
            }
        });

        btnNovo3.setText("Salvar");
        btnNovo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovo3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Telefone:");

        input_telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_telefoneActionPerformed(evt);
            }
        });

        jLabel2.setText("Fornecedor:");

        jLabel3.setText("Email:");

        jLabel4.setText("Endereço:");

        input_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_emailActionPerformed(evt);
            }
        });

        grid.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fornecedor", "Telefone", "Email", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(grid);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(btnNovo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
                .addComponent(btnNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(input_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(input_email)
                            .addComponent(input_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(input_fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(input_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(input_endereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo2)
                    .addComponent(btnNovo3))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo2ActionPerformed
        // Voltar
        /*
		 * Principal principal = new Principal(idUsuario); principal.setVisible(true);
         */
        this.tela.setVisible(true);
        dispose();
    }// GEN-LAST:event_btnNovo2ActionPerformed

    private void btnNovo3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo3ActionPerformed
        Fornecedor fornecedor = new Fornecedor(input_fornecedor.getText(), input_telefone.getText(),
                input_email.getText(), input_endereco.getText(), idUsuario);
        facade.insereFornecedor(fornecedor);

        DefaultTableModel linha = (DefaultTableModel) grid.getModel();

        Object[] dados = {
            input_fornecedor.getText(),
            input_telefone.getText(),
            input_email.getText(),
            input_endereco.getText()
        };
        linha.addRow(dados);

        input_fornecedor.setText("");
        input_telefone.setText("");
        input_email.setText("");
        input_endereco.setText("");

        JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!", "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
        this.tela.setVisible(true);
        dispose();
    }// GEN-LAST:event_btnNovo3ActionPerformed

    private void input_telefoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_input_telefoneActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_input_telefoneActionPerformed

    private void input_emailActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_input_emailActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_input_emailActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo2;
    private javax.swing.JButton btnNovo3;
    private javax.swing.JTable grid;
    private javax.swing.JTextField input_email;
    private javax.swing.JTextField input_endereco;
    private javax.swing.JTextField input_fornecedor;
    private javax.swing.JTextField input_telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
