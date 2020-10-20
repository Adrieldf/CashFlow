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

    private String nomeProduto;
    private String categoria;

    public Produto() {
    }

    public Produto(String nome, String categoria) {
        super();
        nomeProduto = nome;
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
