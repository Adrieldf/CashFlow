package view;

//import controller.Controller;
import controller.TelaPrincipalController;
import facade.Facade;
import java.io.FileNotFoundException;
import java.io.IOException;
import static java.time.DayOfWeek.WEDNESDAY;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalAdjusters.next;

import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;
import static java.time.DayOfWeek.MONDAY;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Conta;
import model.Parcela;
import model.Produto;
import model.Fornecedor;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;

public class CadastroConta extends JFrame {

	private int idUsuario;
	private List<Categoria> listaCategorias;
	private List<Produto> listaProdutos;
	private List<Fornecedor> listaFornecedor;
	private Facade facade = new Facade();
	private JFrame tela;

	public CadastroConta(int idUsuario, JFrame tela) {
		initComponents();
		this.idUsuario = idUsuario;
		this.tela = tela;

		this.atualizaDados();
	}

	public void atualizaDados() {
		listaCategorias = facade.buscaTodasCategorias(this.idUsuario);
		listaProdutos = facade.buscaTodosProdutos(this.idUsuario);
		listaFornecedor = facade.buscaTodosFornecedor(this.idUsuario);

		preencheComboboxCategoria();
		preencheComboboxFornecedor();
		//preencheComboboxProduto();
	}
	public String getRequisitosParaCriarConta() {
		String msgText = "";
		if (listaCategorias == null || listaCategorias.size() <= 0)
			msgText += "Adicione pelo menos uma categoria.\n";
		if (listaFornecedor == null || listaFornecedor.size() <= 0)
			msgText += "Adicione pelo menos um fornecedor.\n";
		if (listaProdutos == null || listaProdutos.size() <= 0)
			msgText += "Adicione pelo menos um produto.\n";
		
		if(msgText.trim() != "") {
			msgText = "Antes de continuar: \n" + msgText;
		}
		return msgText;
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
		buttonGroup6 = new javax.swing.ButtonGroup();
		buttonGroup7 = new javax.swing.ButtonGroup();
		btnNovo2 = new javax.swing.JButton();
		btnNovo3 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		combobox_produto = new javax.swing.JComboBox<>();
		jLabel2 = new javax.swing.JLabel();
		input_valor = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		input_data = new javax.swing.JFormattedTextField();
		jLabel4 = new javax.swing.JLabel();
		input_parcelas = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		input_juros = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		grid = new javax.swing.JTable();
		btn_previsualizacao = new javax.swing.JButton();
		combobox_categoria = new javax.swing.JComboBox<>();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		combobox_fornecedor = new javax.swing.JComboBox<>();
		rdb_areceber = new javax.swing.JRadioButton();
		rdb_apagar = new javax.swing.JRadioButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		input_descricao = new javax.swing.JTextField();
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

		jLabel1.setText("Produto:");

		combobox_produto.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				combobox_produtoActionPerformed(evt);
			}
		});

		jLabel2.setText("Valor:");

		jLabel3.setText("Data:");

		input_data.setText("00/00/0000");
		input_data.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				input_dataActionPerformed(evt);
			}
		});

		jLabel4.setText("N\u00FAmero de parcelas:");

		input_parcelas.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				input_parcelasActionPerformed(evt);
			}
		});

		jLabel5.setText("Juros:");

		grid.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null }, { null, null }, { null, null }, { null, null },
				{ null, null }, { null, null }, { null, null } }, new String[] { "Data", "Valor" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.Float.class };
			boolean[] canEdit = new boolean[] { false, false };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(grid);

		btn_previsualizacao.setText("Pr\u00E9-visualiza\u00E7\u00E3o");
		btn_previsualizacao.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btn_previsualizacaoActionPerformed(evt);
			}
		});

		combobox_categoria.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				combobox_categoriaActionPerformed(evt);
			}
		});

		jLabel6.setText("Categoria:");

		jLabel7.setText("Forncedor:");

		buttonGroup2.add(rdb_areceber);
		rdb_areceber.setSelected(true);
		rdb_areceber.setText("Conta a receber");

		buttonGroup2.add(rdb_apagar);
		rdb_apagar.setText("Conta a pagar");

		jLabel8.setText("%");

		jLabel9.setText("Descri\u00E7\u00E3o:");
		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(55)
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addComponent(jLabel9)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(input_descricao, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
							.addGap(0, 297, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel7)
									.addGap(18)
									.addComponent(combobox_fornecedor, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel6)
									.addGap(18)
									.addComponent(combobox_categoria, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)
									.addGap(30)
									.addComponent(jLabel1)
									.addGap(18)
									.addComponent(combobox_produto, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addComponent(rdb_areceber)
									.addGap(18)
									.addComponent(rdb_apagar)))
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 213, GroupLayout.PREFERRED_SIZE)
							.addGap(69))
						.addGroup(layout.createSequentialGroup()
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
									.addGap(80)
									.addComponent(btnNovo3, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(jLabel4)
										.addComponent(jLabel5)
										.addComponent(jLabel2)
										.addComponent(jLabel3))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(layout.createParallelGroup(Alignment.LEADING)
										.addComponent(input_valor, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
										.addComponent(input_data, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
										.addComponent(input_parcelas, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
										.addGroup(layout.createSequentialGroup()
											.addComponent(input_juros, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(jLabel8)))
									.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
									.addComponent(btn_previsualizacao))
								.addGroup(layout.createSequentialGroup()
									.addGap(0, 404, Short.MAX_VALUE)
									.addComponent(btnNovo2, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
							.addGap(112))))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
					.addGroup(layout.createParallelGroup(Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
							.addGap(46)
							.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 204, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btn_previsualizacao))
						.addGroup(layout.createSequentialGroup()
							.addGap(49)
							.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(jLabel1)
									.addComponent(combobox_produto, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createParallelGroup(Alignment.BASELINE)
									.addComponent(jLabel6)
									.addComponent(combobox_categoria, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addGap(18)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel7)
								.addComponent(combobox_fornecedor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdb_areceber)
								.addComponent(rdb_apagar))
							.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(input_valor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(input_data, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(input_parcelas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(input_juros, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel8))
							.addGap(37)
							.addGroup(layout.createParallelGroup(Alignment.BASELINE)
								.addComponent(jLabel9)
								.addComponent(input_descricao, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(54)))
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNovo2)
						.addComponent(btnNovo3))
					.addGap(29))
		);
		getContentPane().setLayout(layout);

		pack();
		setLocationRelativeTo(null);
	}// </editor-fold>//GEN-END:initComponents

	private void preencheComboboxCategoria() {
		combobox_categoria.removeAllItems();
		for (Categoria categoria : listaCategorias) {
			combobox_categoria.addItem(categoria.getNomeCategoria());
		}
	}

	private void preencheComboboxFornecedor() {
		combobox_fornecedor.removeAllItems();
		for (Fornecedor fornecedor : listaFornecedor) {
			combobox_fornecedor.addItem(fornecedor.getNome());
		}
	}

	private void preencheComboboxProduto() {
		combobox_produto.removeAllItems();
		if(combobox_categoria.getSelectedItem() == null)
			return;
		String nomeCategoria = combobox_categoria.getSelectedItem().toString();

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

	private void btnNovo2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo2ActionPerformed
		// Voltar
		/*
		 * Principal principal = new Principal(idUsuario); principal.setVisible(true);
		 */
		this.tela.setVisible(true);
		dispose();
	}// GEN-LAST:event_btnNovo2ActionPerformed

	private void btnNovo3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnNovo3ActionPerformed
		Conta conta = new Conta();

		if (rdb_areceber.isSelected()) {
			conta.setTipo(2);
		} else {
			conta.setTipo(1);
		}

		conta.setIdUsuario(this.idUsuario);
		conta.setDescricao(input_descricao.getText());

		for (Categoria categoria : listaCategorias) {
			if (combobox_categoria.getSelectedItem().equals(categoria.getNomeCategoria())) {
				for (Produto produto : listaProdutos) {
					if (combobox_produto.getSelectedItem().equals(produto.getNomeProduto())) {
						conta.setIdProduto(produto.getId());
						break;
					}
				}
				break;
			}
		}

		for (Fornecedor fornecedor : listaFornecedor) {
			if (combobox_fornecedor.getSelectedItem().equals(fornecedor.getNome())) {
				conta.setIdFornecedor(fornecedor.getId());
			}
		}

		facade.insereConta(conta);
		int idConta = facade.buscaUltimoIdDaConta(this.idUsuario);

		List<Parcela> listaParcelas = montaParcelas();

		for (Parcela parcela : listaParcelas) {
			parcela.setIdConta(idConta);
			parcela.setIdUsuario(this.idUsuario);
			facade.insereParcelas(parcela);
		}
		JOptionPane.showMessageDialog(null, "Conta cadastrada com sucesso!", "Sucesso",
				JOptionPane.INFORMATION_MESSAGE);
		this.btnNovo2ActionPerformed(null);
	}// GEN-LAST:event_btnNovo3ActionPerformed

	private void combobox_produtoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_combobox_produtoActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_combobox_produtoActionPerformed

	private void input_dataActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_input_dataActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_input_dataActionPerformed

	private void input_parcelasActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_input_parcelasActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_input_parcelasActionPerformed

	public List<Parcela> montaParcelas() {
		int parcelas;
		double valor;
		double juros;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");

		LocalDate localDate = LocalDate.parse(input_data.getText(), formatter);

		List<Parcela> listaParcelas = new ArrayList<Parcela>();

		if (input_parcelas.getText() == null || input_parcelas.getText().length() == 0) {
			parcelas = 1;
		} else {
			parcelas = Integer.parseInt(input_parcelas.getText());
		}

		if (input_valor.getText() == null || input_valor.getText().length() == 0) {
			valor = 0;
		} else {
			valor = Double.parseDouble(input_valor.getText());
		}

		if (input_juros.getText() == null || input_juros.getText().length() == 0) {
			juros = 0;
		} else {
			valor = Double.parseDouble(input_valor.getText());
			juros = valor * (Float.parseFloat(input_juros.getText()) / 100);
		}

		double valorParcela = (valor + juros) / parcelas;

		for (int i = 1; i < parcelas + 1; i++) {

			Parcela parcela = new Parcela();
			parcela.setValor(valorParcela);
			parcela.setData(formatter.format(localDate));
			listaParcelas.add(parcela);

			localDate = proxData(localDate);
		}

		return listaParcelas;

	}

	private LocalDate proxData(LocalDate dataAtual) {
		LocalDate returnvalue = dataAtual.plusMonths(1);
		LocalDate proxSegunda = returnvalue.with(next(MONDAY));

		if (returnvalue.getDayOfWeek().equals("SATURDAY") || returnvalue.getDayOfWeek().equals("SUNDAY")) {
			return proxSegunda;
		} else {
			// System.out.println(returnvalue.getDayOfWeek());
			return returnvalue;
		}

	}

	private void btn_previsualizacaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btn_previsualizacaoActionPerformed

		List<Parcela> listaParcelas = montaParcelas();

		DefaultTableModel linha = (DefaultTableModel) grid.getModel();
		linha.getDataVector().removeAllElements();
		linha.setRowCount(0);

		for (Parcela parcela : listaParcelas) {
			Object[] dados = { parcela.getData(), parcela.getValor() };
			linha.addRow(dados);
		}

	}// GEN-LAST:event_btn_previsualizacaoActionPerformed

	private void combobox_categoriaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_combobox_categoriaActionPerformed
		preencheComboboxProduto();
	}// GEN-LAST:event_combobox_categoriaActionPerformed

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnNovo2;
	private javax.swing.JButton btnNovo3;
	private javax.swing.JButton btn_previsualizacao;
	private javax.swing.ButtonGroup buttonGroup1;
	private javax.swing.ButtonGroup buttonGroup2;
	private javax.swing.ButtonGroup buttonGroup3;
	private javax.swing.ButtonGroup buttonGroup4;
	private javax.swing.ButtonGroup buttonGroup5;
	private javax.swing.ButtonGroup buttonGroup6;
	private javax.swing.ButtonGroup buttonGroup7;
	private JComboBox<String> combobox_categoria;
	private javax.swing.JComboBox<String> combobox_fornecedor;
	private javax.swing.JComboBox<String> combobox_produto;
	private javax.swing.JTable grid;
	private javax.swing.JFormattedTextField input_data;
	private javax.swing.JTextField input_descricao;
	private javax.swing.JTextField input_juros;
	private javax.swing.JTextField input_parcelas;
	private javax.swing.JTextField input_valor;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JRadioButton rdb_apagar;
	private javax.swing.JRadioButton rdb_areceber;
}
