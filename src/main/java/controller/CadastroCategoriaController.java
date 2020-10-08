/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import view.CadastroCategoria;

public class CadastroCategoriaController {

    public void salvarCategotegoria(String nomeCategoria) {
        Categoria categoria = new Categoria(nomeCategoria);
        categoria.criarCategoria();
    }
    
    public List<Categoria> buscaCategorias()
    {
        Categoria categoria = new Categoria("");
        return categoria.buscaCategorias();
    }
    
    public void chamarTela(){
        CadastroCategoria categoria = new CadastroCategoria();
        categoria.exibir();
    }
    
    public DefaultTableModel montaDados(JTable grid)
    {
        DefaultTableModel linha = (DefaultTableModel) grid.getModel();
        linha.getDataVector().removeAllElements();
        linha.setRowCount(0);
        
         List<Categoria> listaCategorias = buscaCategorias();
         
        for (Categoria categoria : listaCategorias) {
            Object[] dados = {
                categoria.getNomeCategoria()
            };
            linha.addRow(dados);
        }
        
        return linha;
    }


}
