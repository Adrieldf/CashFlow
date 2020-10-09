/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.ContaDAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Conta;


public class PostgresqlContaDAO implements ContaDAO{
    
    private Connection conn;
    
    public PostgresqlContaDAO(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public Conta buscaConta(int numConta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Conta> buscaTodos() {
        List<Conta> listaContas = new ArrayList<Conta>();
        
        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt
                    .executeQuery("select * from conta");

            while (rs.next()) {
               

                //listaContas.add();
            }

        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                rs.close();
                stmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return listaContas;
    }

    @Override
    public List<Conta> buscaContaPorTipo(int tipo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insere(Conta conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Conta conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Conta conta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
