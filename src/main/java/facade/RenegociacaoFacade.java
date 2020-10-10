/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.DAOFactory;
import dao.RenegociacaoDAO;
import database.PostgresqlDAOFactory;
import java.util.List;
import model.Renegociacao;

public class RenegociacaoFacade implements RenegociacaoDAO {

    @Override
    public List<Renegociacao> buscaTodas() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaTodas();
    }

    @Override
    public List<Renegociacao> buscaPorCodigo(int id) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        return renegociacaoDAO.buscaPorCodigo(id);
    }

    @Override
    public void insere(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.insere(renegociacao);
    }

    @Override
    public void remove(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.remove(renegociacao);
    }

    @Override
    public void altera(Renegociacao renegociacao) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        RenegociacaoDAO renegociacaoDAO = fabrica.getRenegociacaoDAO();
        renegociacaoDAO.altera(renegociacao);
    }

}
