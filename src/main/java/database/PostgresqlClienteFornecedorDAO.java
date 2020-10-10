/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.ClienteFornecedorDAO;
import java.sql.Connection;
import java.util.List;
import model.ClienteFornecedor;

public class PostgresqlClienteFornecedorDAO implements ClienteFornecedorDAO {

    private Connection conn;

    public PostgresqlClienteFornecedorDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<ClienteFornecedor> buscaTodas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ClienteFornecedor> buscaPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere(ClienteFornecedor clienteFornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(ClienteFornecedor clienteFornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(ClienteFornecedor clienteFornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
