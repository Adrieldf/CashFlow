/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.CategoriaDAO;
import dao.DAOFactory;
import database.PostgresqlDAOFactory;
import java.util.List;
import model.Categoria;


public class CategoriaFacade implements CategoriaDAO{
    
    @Override
    public List<Categoria> buscaTodos() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        return categoriaDAO.buscaTodos();
    }
    
    @Override
    public void insere(Categoria categoria) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.insere(categoria);
    }
    
    @Override
    public void remove(Categoria categoria)
    {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        CategoriaDAO categoriaDAO = fabrica.getCategoriaDAO();
        categoriaDAO.remove(categoria);
    }
    
}
