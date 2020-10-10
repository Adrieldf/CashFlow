/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import dao.DAOFactory;
import database.PostgresqlDAOFactory;
import java.util.List;
import model.ClienteFornecedor;
import dao.ClienteFornecedorDAO;

public class ClienteFornecedorFacade implements ClienteFornecedorDAO {

    @Override
    public List<ClienteFornecedor> buscaTodas() {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        return clienteFornecedorDAO.buscaTodas();
    }

    @Override
    public List<ClienteFornecedor> buscaPorNome(String nome) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        return clienteFornecedorDAO.buscaPorNome(nome);
    }

    @Override
    public void insere(ClienteFornecedor clienteFornecedor) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        clienteFornecedorDAO.insere(clienteFornecedor);
    }

    @Override
    public void remove(ClienteFornecedor clienteFornecedor) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        clienteFornecedorDAO.altera(clienteFornecedor);
    }

    @Override
    public void altera(ClienteFornecedor clienteFornecedor) {
        DAOFactory fabrica = PostgresqlDAOFactory.getInstancia();
        ClienteFornecedorDAO clienteFornecedorDAO = fabrica.getClienteFornecedorDAO();
        clienteFornecedorDAO.remove(clienteFornecedor);
    }

}
