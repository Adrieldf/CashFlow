/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Categoria;
import model.Produto;

public interface ProdutoDAO {

    List<Produto> buscaTodos();

    List<Produto> buscaPorCategoria(Categoria categoria);
    
    Produto buscaPorId(int id);

    void insere(Produto produto);

    void remove(Produto produto);

    void altera(Produto produto);

}
