/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOFactory;
import dao.ProdutoDAO;
import database.PostgresqlDBFactory;
import database.PostgresqlProdutoDB;
import java.io.Serializable;
import java.util.List;

public class Produto implements Serializable {

    private static final long serialVersionUID = 38230695077030297L;
    private int id;
    private String nomeProduto;
    private int idCategoria;
    private int idUsuario;

    public Produto() {
    }

    public Produto(String nome, int idCategoria) {
        super();
        this.setNomeProduto(nome);
        this.setIdCategoria(idCategoria);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getIdCategoria() {
        return this.idCategoria;
    }

    public void setIdCategoria(int categoria) {
        this.idCategoria = categoria;
    }

}
