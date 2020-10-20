/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;

public abstract class DAOFactory {

    protected static DAOFactory instancia;

    public static DAOFactory getInstancia() {
        return null;
    }

    protected Connection conn;

    public abstract void closeConnection();

    public abstract ProdutoDAO getProdutoDAO();

    public abstract ParcelaDAO getParcelaDAO();

    public abstract ContaDAO getContaDAO();

    public abstract CategoriaDAO getCategoriaDAO();

    public abstract UsuarioDAO getUsuarioDAO();
    
    public abstract RenegociacaoDAO getRenegociacaoDAO();
    
    public abstract PessoaDAO getPessoaDAO();

}
