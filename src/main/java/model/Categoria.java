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
    
    private int idCategoria;
    private String nomeCategoria;
    private int idUsuario;

    public Categoria(int idCategoria, String nomeCategoria, int idUsuario) {
        this.setIdCategoria(idCategoria);
        this.setNomeCategoria(nomeCategoria);
        this.setIdUsuario(idUsuario);
    }
    
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



}
