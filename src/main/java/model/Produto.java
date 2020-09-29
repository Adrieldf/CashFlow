/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dao.DAOFactory;
import dao.ProdutoDAO;
import database.PostgresqlDAOFactory;
import database.PostgresqlProdutoDAO;
import java.io.Serializable;
import java.util.List;

public class Produto implements Serializable
{
    private String nomeProduto;
    private String categoria;
    
    public Produto(){}
    
    public Produto(String nome, String categoria)
    {
        super();
        nomeProduto = nome;
        categoria = categoria;
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
    
    public void criarProduto() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.insere(this);

    }

    public List<Produto> buscaProdutos() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();

        return produtoDAO.buscaTodos();
    }
}
