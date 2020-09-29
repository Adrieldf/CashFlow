/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import model.Produto;

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
    
}
