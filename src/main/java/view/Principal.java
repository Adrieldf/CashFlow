package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import facade.Facade;
import model.Conta;
import model.Parcela;
import model.Renegociacao;
import utils.DateConverter;

import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;

public class Principal extends javax.swing.JFrame {

	private int idUsuario;

	ListaDeContas listaDeContas;
	CadastroCategoria cadastroCategoria;
	CadastroProduto cadastroProduto;
	CadastroPessoa cadastroPessoa;
	CadastroContaAReceber contaAReceber;
	CadastroConta contaAPagar;
	CadastroFornecedor cadastroFornecedor;
	Projecoes projecoes;
	private Facade facade = new Facade();

	public Principal(int idUsuario) {
		getContentPane().setPreferredSize(new Dimension(600, 400));
		setSize(new Dimension(265, 176));
		getContentPane().setSize(new Dimension(200, 200));
		getContentPane().setMinimumSize(new Dimension(200, 200));
		this.idUsuario = idUsuario;
		initComponents();

		listaDeContas = new ListaDeContas(idUsuario, this);
		cadastroCategoria = new CadastroCategoria(idUsuario, this);
		cadastroProduto = new CadastroProduto(idUsuario, this);
		cadastroPessoa = new CadastroPessoa(idUsuario, this);
		contaAReceber = new CadastroContaAReceber(idUsuario, this);
		contaAPagar = new CadastroConta(idUsuario, this);
		cadastroFornecedor = new CadastroFornecedor(idUsuario, this);
		projecoes = new Projecoes(idUsuario, this);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 12, 47, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 31, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				Double.MIN_VALUE };
		getContentPane().setLayout(gridBagLayout);

		btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				atualizaGrid();
			}
		});
		
		lblNewLabel = new JLabel("Contas pendentes ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 4;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		GridBagConstraints gbc_btnAtualizar = new GridBagConstraints();
		gbc_btnAtualizar.insets = new Insets(0, 0, 5, 5);
		gbc_btnAtualizar.gridx = 15;
		gbc_btnAtualizar.gridy = 1;
		getContentPane().add(btnAtualizar, gbc_btnAtualizar);

		gridContas = new JScrollPane();
		GridBagConstraints gbc_gridContas = new GridBagConstraints();
		gbc_gridContas.gridheight = 10;
		gbc_gridContas.gridwidth = 15;
		gbc_gridContas.insets = new Insets(0, 0, 5, 5);
		gbc_gridContas.fill = GridBagConstraints.BOTH;
		gbc_gridContas.gridx = 1;
		gbc_gridContas.gridy = 2;
		getContentPane().add(gridContas, gbc_gridContas);

		JButton btnSair = new JButton("Fechar");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		GridBagConstraints gbc_btnSair = new GridBagConstraints();
		gbc_btnSair.insets = new Insets(0, 0, 5, 5);
		gbc_btnSair.fill = GridBagConstraints.BOTH;
		gbc_btnSair.gridx = 15;
		gbc_btnSair.gridy = 12;
		getContentPane().add(btnSair, gbc_btnSair);

	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
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
		grid = new javax.swing.JTable();
		gridContas = new javax.swing.JScrollPane();

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

		pack();
		setLocationRelativeTo(null);

		grid.setModel(new DefaultTableModel(new Object[][] { { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null }, { null, null, null, null, null }, { null, null, null, null, null },
				{ null, null, null, null, null } },
				new String[] { "Tipo", "Conta", "Valor Total", "Valor Pago", "Data" }) {
			Class[] types = new Class[] { String.class, Integer.class, Double.class, Double.class, String.class };
			boolean[] canEdit = new boolean[] { false, false, false, false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});

		gridContas.setViewportView(grid);
	}// </editor-fold>//GEN-END:initComponents

	public void atualizaGrid() {

		DefaultTableModel tableModel = (DefaultTableModel) grid.getModel();
		tableModel.getDataVector().removeAllElements();
		tableModel.setRowCount(0);

		Calendar calendar = Calendar.getInstance();
		Date today = calendar.getTime();
		Date maxdate = calendar.getTime();
		calendar.setTime(maxdate);
		calendar.add(Calendar.DATE, 30);
		maxdate = calendar.getTime();

		List<Parcela> parcelas = facade.buscaParcelasDoUsuario(this.idUsuario);
		for (Parcela p : parcelas) {
			Date dataParcela = DateConverter.StringToDate(p.getData());
			double valorParcela = p.getValor();

			List<Renegociacao> renegociacoes = facade.buscaRenegociacaoPorParcela(p.getId(), p.getIdConta(),
					this.idUsuario);
			if (renegociacoes != null && renegociacoes.size() > 0) {
				for (Renegociacao r : renegociacoes) {
					if (r.isValida()) {
						valorParcela = r.getNovoValor();
						dataParcela = DateConverter.StringToDate(r.getNovaData());
						break;
					}
				}
			}
			/*if (dataParcela.after(maxdate) || (dataParcela.before(today) && p.getValorPago() >= valorParcela) || p.getValorPago() >= valorParcela) {
				continue;
			}*/
			//se estiver aparecendo registros que nao for para aparecer na tela principal testar o if acima com o continue daí (é para ser a logica inversa)
			if((dataParcela.before(today) && p.getValorPago() < valorParcela) || (dataParcela.before(maxdate) && p.getValorPago() < valorParcela)) {
				Conta c = facade.buscaConta(p.getIdConta(), this.idUsuario);
				
				SimpleDateFormat df = new SimpleDateFormat("dd/MM/yy");
				DecimalFormat nf = new DecimalFormat("#0,00");  //nao funcionou muito bem
				
				@SuppressWarnings("deprecation")
				Object[] linha = { c.getTipoString(), c.getId(), valorParcela, p.getValorPago(),
						df.format(dataParcela)};
			
				tableModel.addRow(linha);
			}
			
		}

		gridContas.setViewportView(grid);
		gridContas.updateUI();
		/*
		 * List<Conta> contas = facade.buscaTodasContas(this.idUsuario);
		 * 
		 * for (Conta c : contas) { double valorTotal = 0; double valorTotalPago = 0;
		 * Date proximaData = null;
		 * 
		 * List<Parcela> parcelas = facade.buscaParcelaPorConta(c.getId(),
		 * this.idUsuario); for (Parcela p : parcelas) { Date dataParcela =
		 * DateConverter.StringToDate(p.getData());
		 * System.out.println(dataParcela.toString() + p.getData().toString()); double
		 * valorParcela = p.getValor(); double valorPagoParcela = p.getValorPago();
		 * 
		 * List<Renegociacao> renegociacoes =
		 * facade.buscaRenegociacaoPorParcela(p.getId(), p.getIdConta(),
		 * this.idUsuario); if (renegociacoes != null && renegociacoes.size() > 0) { for
		 * (Renegociacao r : renegociacoes) { if (r.isValida()) { valorParcela =
		 * r.getNovoValor(); dataParcela = DateConverter.StringToDate(r.getNovaData());
		 * break; } } }
		 * 
		 * if (dataParcela == null || dataParcela.after(maxdate) ||
		 * (dataParcela.before(today) && p.getValorPago() >= p.getValor())) continue;
		 * 
		 * valorTotal += valorParcela; valorTotalPago += valorPagoParcela; if
		 * (proximaData == null || proximaData.before(dataParcela)) proximaData =
		 * dataParcela;
		 * 
		 * } if(valorTotalPago >= valorTotal) continue;
		 * 
		 * 
		 * // "Tipo", "Conta", "Valor Total", "Valor Restante", "Próxima Data" Object[]
		 * linha = { c.getTipoString(), c.getDescricao(), valorTotal, valorTotal -
		 * valorTotalPago, proximaData.toString()}; tableModel.addRow(linha); }
		 */
	}

	private void btnPessoaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnPessoaActionPerformed
		cadastroPessoa.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_btnPessoaActionPerformed

	private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnProdutoActionPerformed
		cadastroProduto.atualizaDados();
		cadastroProduto.preencheGrid();
		cadastroProduto.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_btnProdutoActionPerformed

	private void btnCategoriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCategoriaActionPerformed

		cadastroCategoria.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_btnCategoriaActionPerformed

	private void btnCadastarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCadastarActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_btnCadastarActionPerformed

	private void btnContasAPagarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnContasAPagarActionPerformed
		contaAPagar.atualizaDados();
		String msg = contaAPagar.getRequisitosParaCriarConta();
		if (msg != "") {
			JOptionPane.showMessageDialog(null, msg, "Aviso", JOptionPane.INFORMATION_MESSAGE);
		} else {
			contaAPagar.setVisible(true);
			this.setVisible(false);
		}
	}// GEN-LAST:event_btnContasAPagarActionPerformed

	private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnFornecedorActionPerformed
		cadastroFornecedor.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_btnFornecedorActionPerformed

	private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenu1ActionPerformed

	}// GEN-LAST:event_jMenu1ActionPerformed

	private void btnContasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnContasActionPerformed
		listaDeContas.atualizaDados();
		listaDeContas.setVisible(true);
		this.setVisible(false);
	}// GEN-LAST:event_btnContasActionPerformed

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
	private JScrollPane gridContas;
	private javax.swing.JTable grid;
	private JButton btnAtualizar;
	private JLabel lblNewLabel;
}
