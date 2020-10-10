/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.DAOFactory;
import dao.ProdutoDAO;
import database.PostgresqlDAOFactory;
import java.util.List;
import model.Categoria;
import model.Produto;

public class ProdutoFacade implements ProdutoDAO {

    @Override
    public List<Produto> buscaTodos() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaTodos();
    }

    @Override
    public List<Produto> buscaPorCategoria(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        return produtoDAO.buscaPorCategoria(categoria);
    }

    @Override
    public void insere(Produto produto) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.insere(produto);
    }

    @Override
    public void altera(Produto produto) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.altera(produto);
    }

    @Override
    public void remove(Produto produto) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ProdutoDAO produtoDAO = fabrica.getProdutoDAO();
        produtoDAO.remove(produto);
    }

}
