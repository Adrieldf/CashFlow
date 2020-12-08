package view;

//import controller.Controller;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import facade.Facade;
import model.Parcela;
import model.Renegociacao;
import utils.MathConverter;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Dimension;

public class RenegociarParcela extends javax.swing.JFrame {

	private int idUsuario;
	private int idConta;
	private int idParcela;
	private JFrame tela;
	private Facade facade = new Facade();
	Parcela parcela;
	
	public RenegociarParcela(int idUsuario, int idConta, int idParcela, JFrame tela) {
		getContentPane().setPreferredSize(new Dimension(600, 400));
		initComponents();
		this.idUsuario = idUsuario;
		this.idConta = idConta;
		this.idParcela = idParcela;
		this.tela = tela;
		
		lblIdConta.setText(Integer.toString(this.idConta));
		this.parcela = facade.buscaParcelaPorCodigo(this.idParcela, this.idConta, this.idUsuario);
		lblIdParcela.setText(Integer.toString(this.idParcela));
		lblValorParcela.setText(MathConverter.DoubleToString(this.parcela.getValor()));
		lblDataParcela.setText(this.parcela.getData());
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		buttonGroup1 = new javax.swing.ButtonGroup();
		buttonGroup2 = new javax.swing.ButtonGroup();
		buttonGroup3 = new javax.swing.ButtonGroup();
		buttonGroup4 = new javax.swing.ButtonGroup();
		buttonGroup5 = new javax.swing.ButtonGroup();
		btnVoltar = new javax.swing.JButton();
		btnVoltar.setBounds(429, 341, 100, 21);
		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(91, 50, 73, 13);
		lblIdConta = new javax.swing.JLabel();
		lblIdConta.setBounds(174, 50, 83, 13);
		jLabel6 = new javax.swing.JLabel();
		jLabel6.setBounds(91, 154, 75, 13);
		jLabel7 = new javax.swing.JLabel();
		jLabel7.setBounds(91, 187, 75, 13);
		txtNovoValor = new javax.swing.JTextField();
		txtNovoValor.setBounds(174, 151, 81, 19);
		txtNovaData = new javax.swing.JTextField();
		txtNovaData.setBounds(174, 184, 81, 19);
		btnSalvar = new javax.swing.JButton();
		btnSalvar.setBounds(106, 341, 100, 21);
		jMenuBar1 = new javax.swing.JMenuBar();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Renegocia\u00E7\u00E3o");

		btnVoltar.setText("Voltar");
		btnVoltar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNovo2ActionPerformed(evt);
			}
		});

		jLabel1.setText("Conta:");

		lblIdConta.setText("000001");

		jLabel6.setText("Novo valor:");

		jLabel7.setText("Nova data:");

		btnSalvar.setText("Salvar");
		btnSalvar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});
		setJMenuBar(jMenuBar1);
		
		JLabel jLabel5_1 = new JLabel();
		jLabel5_1.setBounds(91, 73, 73, 13);
		jLabel5_1.setText("Parcela:");
		
		lblIdParcela = new JLabel();
		lblIdParcela.setBounds(174, 73, 81, 13);
		lblIdParcela.setText("01");
		
		JLabel lblValor = new JLabel();
		lblValor.setBounds(91, 96, 73, 13);
		lblValor.setText("Valor:");
		
		JLabel lblData = new JLabel();
		lblData.setBounds(91, 119, 73, 13);
		lblData.setText("Data:");
		
		lblValorParcela = new JLabel();
		lblValorParcela.setBounds(174, 96, 178, 13);
		lblValorParcela.setText("01");
		
		lblDataParcela = new JLabel();
		lblDataParcela.setBounds(174, 119, 83, 13);
		lblDataParcela.setText("01");
		getContentPane().setLayout(null);
		getContentPane().add(jLabel1);
		getContentPane().add(lblIdConta);
		getContentPane().add(lblData);
		getContentPane().add(lblDataParcela);
		getContentPane().add(jLabel6);
		getContentPane().add(jLabel7);
		getContentPane().add(txtNovoValor);
		getContentPane().add(txtNovaData);
		getContentPane().add(jLabel5_1);
		getContentPane().add(lblValor);
		getContentPane().add(lblValorParcela);
		getContentPane().add(lblIdParcela);
		getContentPane().add(btnSalvar);
		getContentPane().add(btnVoltar);
		
		lblDescrio = new JLabel();
		lblDescrio.setText("Descri\u00E7\u00E3o:");
		lblDescrio.setBounds(91, 224, 75, 13);
		getContentPane().add(lblDescrio);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(174, 221, 352, 19);
		getContentPane().add(txtDescricao);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo2ActionPerformed
		this.tela.setVisible(true);
		dispose();
	}// GEN-LAST:event_btnNovo2ActionPerformed

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
		JOptionPane.showMessageDialog(null, "Renegociação salva com sucesso!", "Sucesso",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		Renegociacao r = new Renegociacao();
		r.setId(this.parcela.getId());
		r.setIdConta(this.parcela.getIdConta());
		r.setNovaData(txtNovaData.getText());
		r.setNovoValor(MathConverter.StringToDouble(txtNovoValor.getText()));
		r.setDescricao(txtDescricao.getText());
		r.setValida(true);
		r.setIdUsuario(this.parcela.getIdUsuario());
		
		this.parcela.setValor(MathConverter.StringToDouble(txtNovoValor.getText()));
		facade.alteraParcelas(this.parcela);
		facade.insereRenegociacao(r);
		((DetalheConta)this.tela).atualizaDados();
		this.tela.setVisible(true);
		dispose();
	}// GEN-LAST:event_jButton1ActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnVoltar;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.ButtonGroup buttonGroup3;
	private javax.swing.ButtonGroup buttonGroup4;
	private javax.swing.ButtonGroup buttonGroup5;
	private javax.swing.JButton btnSalvar;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel lblIdConta;
	private javax.swing.JLabel lblIdParcela;
	private javax.swing.JLabel lblValorParcela;
	private javax.swing.JLabel lblDataParcela;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JTextField txtNovoValor;
	private javax.swing.JTextField txtNovaData;
	private JLabel lblDescrio;
	private JTextField txtDescricao;
}
