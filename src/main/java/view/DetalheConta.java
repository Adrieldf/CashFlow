package view;

//import controller.Controller;
import facade.Facade;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Parcela;
import model.Renegociacao;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DetalheConta extends javax.swing.JFrame {

    private int idUsuario;
    private int idConta;
    private Facade facade = new Facade();
    private JFrame tela;

    public DetalheConta(int idUsuario, int idConta, JFrame tela) {
        initComponents();
        this.tela = tela;
        this.idUsuario = idUsuario;
        this.idConta = idConta;

        this.atualizaDados();
    }

    public void atualizaDados() {
        List<Parcela> listaParcelas = facade.buscaParcelasDaConta(idConta, idUsuario);
        List<Renegociacao> listaRenegociacao = facade.buscaRenegociacaoPorConta(idConta, idUsuario);

        DefaultTableModel linha = (DefaultTableModel) grid.getModel();
        linha.getDataVector().removeAllElements();
        linha.setRowCount(0);

        txt_idconta.setText(Integer.toString(idConta));

        boolean pago = false;
        boolean renegociado = false;
        Renegociacao renegociacao = null;
        for (Parcela parcela : listaParcelas) {
            pago = false;
            if (parcela.getValor() == parcela.getValorPago()) {
                pago = true;
            }
            renegociado = false;

            for (Renegociacao r : listaRenegociacao) {
                if (r.getId() == parcela.getId()) {
                    renegociado = true;
                    renegociacao = r;
                    break;
                }
            }

            Object[] dados = {parcela.getId(), renegociado ? renegociacao.getNovoValor() : parcela.getValor(), renegociado ? renegociacao.getNovaData() : parcela.getData(), pago, renegociado

            };
            linha.addRow(dados);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        btnNovo2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        grid = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txt_idconta = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRenegociar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Parcela", "Valor", "Data", "Efetuado", "Renegociado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(grid);

        jLabel1.setText("Conta:");

        txt_idconta.setText("000001");

        jButton1.setText("Efetuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnRenegociar.setText("Renegociar Parcela");
        btnRenegociar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRenegociarActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(61, 61, 61)
                        .addComponent(txt_idconta)
                        .addGap(33, 33, 33))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(btnRenegociar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(btnNovo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_idconta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo2)
                    .addComponent(jButton1)
                    .addComponent(btnRenegociar))
                .addGap(38, 38, 38))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int rowIndex = grid.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma parcela da lista para Efetuar!", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        Parcela parcela = facade.buscaParcelaPorCodigo(Integer.parseInt(grid.getValueAt(rowIndex, 0).toString()), this.idConta, this.idUsuario);
        parcela.setValorPago(parcela.getValor());
        facade.alteraParcelas(parcela);
        ((ListaDeContas)this.tela).atualizaDados();
        atualizaDados();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRenegociarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRenegociarActionPerformed
        int rowIndex = grid.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma parcela da lista para renegociar!", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        RenegociarParcela renegociarParcela = new RenegociarParcela(this.idUsuario, this.idConta, Integer.parseInt(grid.getValueAt(rowIndex, 0).toString()), this);
        renegociarParcela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRenegociarActionPerformed

    private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo2ActionPerformed
        this.tela.setVisible(true);
        dispose();
    }// GEN-LAST:event_btnNovo2ActionPerformed

    private void onClickBtnRenegociar() {
        int rowIndex = grid.getSelectedRow();
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Selecione uma parcela da lista para renegociar!", "Aviso",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        RenegociarParcela renegociarParcela = new RenegociarParcela(this.idUsuario, this.idConta,
                Integer.parseInt(grid.getValueAt(rowIndex, 0).toString()), this);
        renegociarParcela.setVisible(true);
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNovo2;
    private javax.swing.JButton btnRenegociar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTable grid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel txt_idconta;
    // End of variables declaration//GEN-END:variables
}
