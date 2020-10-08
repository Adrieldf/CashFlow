/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import model.Produto;
import view.*;

public class CadastroProdutoController {
    
    public void salvarProduto(String nomeProduto, String categoria) {
        Produto produto = new Produto(nomeProduto, categoria);
        produto.criarProduto();
    }
    
    public List<Produto> buscaProdutos()
    {
        Produto produto = new Produto();
        return produto.buscaProdutos();
    }
    
    public void chamarTela(){
        CadastroProduto produto = new CadastroProduto();
        produto.exibir();
    }
    
    public DefaultTableModel montaDados(JTable grid)
    {
        DefaultTableModel linha = (DefaultTableModel) grid.getModel();
        linha.getDataVector().removeAllElements();
        linha.setRowCount(0);
        
        List<Produto> listaProdutos = buscaProdutos();
         
        for (Produto produto : listaProdutos) {
            Object[] dados = {
                produto.getNomeProduto()
            };
            linha.addRow(dados);
        }
        
        return linha;
    }
    
    public JComboBox montaComboBox(JComboBox<String> combobox)
    {
        CadastroCategoriaController cadastro = new CadastroCategoriaController();
        List<Categoria> listaCategorias = cadastro.buscaCategorias();
        
        for (Categoria categoria : listaCategorias) {
            combobox.addItem(categoria.getNomeCategoria());
        }
        
        return combobox;
    }
    
}
