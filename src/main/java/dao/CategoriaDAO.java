/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Categoria;

public interface CategoriaDAO {

    List<Categoria> buscaTodos();

    void insere(Categoria categoria);

    void remove(Categoria categoria);

}
