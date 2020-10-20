/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.ParcelaDAO;
import java.sql.Connection;
import java.util.List;
import model.Parcela;

public class PostgresqlParcelaDB implements ParcelaDAO{
    
    private Connection conn;
    
    public PostgresqlParcelaDB(Connection conn) {
        this.conn = conn;
    }

    @Override
    public Parcela buscaPorParcela(int parcela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Parcela> buscaParcelasDaConta(int numeroConta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere(Parcela parcela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Parcela parcela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Parcela parcela) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Parcela> buscaTodasParcelas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
