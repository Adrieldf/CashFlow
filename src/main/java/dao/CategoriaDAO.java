/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Categoria;
import model.Conta;

public interface CategoriaDAO {

    List<Categoria> buscaTodos(int idUsuario);
    
    Categoria buscaPorId(int id, int idUsuario);

    void insere(Categoria categoria);

    void remove(Categoria categoria);
    
    void altera(Categoria categoria);

}
