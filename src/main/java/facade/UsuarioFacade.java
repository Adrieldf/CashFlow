/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.DAOFactory;
import dao.UsuarioDAO;
import database.PostgresqlDAOFactory;
import java.util.List;
import model.Usuario;

public class UsuarioFacade implements UsuarioDAO {
    
    @Override
    public List<Usuario> buscaTodos() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaTodos();
    }
    
    @Override
    public Usuario buscaPorLogin(String login) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        return usuarioDAO.buscaPorLogin(login);
    }
    
    @Override
    public void insere(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.insere(usuario);
    }
    
    @Override
    public void remove(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.remove(usuario);
    }
    
    @Override
    public void altera(Usuario usuario) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        UsuarioDAO usuarioDAO = fabrica.getUsuarioDAO();
        usuarioDAO.altera(usuario);
    }


}
