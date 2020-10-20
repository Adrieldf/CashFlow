/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.CategoriaDAO;
import dao.DAOFactory;
import database.PostgresqlCategoriaDB;
import database.PostgresqlDBFactory;
import java.util.List;

public class Categoria {

    private String nomeCategoria;

    public Categoria(String nome) {
        super();
        nomeCategoria = nome;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

}
