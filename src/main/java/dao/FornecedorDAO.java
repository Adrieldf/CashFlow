/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Fornecedor;

public interface FornecedorDAO {

    List<Fornecedor> buscaTodos(int idUsuario);
    
    Fornecedor buscaFornecedor(String nomeFornecedor, int idUsuario);
    
    Fornecedor buscaFornecedorPorId(int id, int idUsuario);
    
    void insere(Fornecedor fornecedor);

    void remove(Fornecedor fornecedor);

    void altera(Fornecedor fornecedor);
    
}
