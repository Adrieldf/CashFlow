/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.RenegociacaoDAO;
import java.sql.Connection;
import java.util.List;
import model.Renegociacao;

public class PostgresqlRenegociacaoDAO implements RenegociacaoDAO {

    private Connection conn;

    public PostgresqlRenegociacaoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Renegociacao> buscaTodas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Renegociacao> buscaPorCodigo(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere(Renegociacao renegociacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Renegociacao renegociacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Renegociacao renegociacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
