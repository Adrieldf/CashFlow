/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.ProdutoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

public class PostgresqlProdutoDAO implements ProdutoDAO {

    private Connection conn;

    public PostgresqlProdutoDAO(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Produto> buscaTodos() {
        List<Produto> produtos = new ArrayList<Produto>();

        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt
                    .executeQuery("select nome, categoria from produto");

            while (rs.next()) {
                Produto p = new Produto();
                p.setNomeProduto("nome");
                p.setCategoria("categoria");
                produtos.add(p);
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

        return produtos;
    }

    @Override
    public List<Produto> buscaPorCategoria(String categoria) {
        List<Produto> produtos = new ArrayList<Produto>();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            pstmt = conn.prepareStatement("select codigo, categoria from produto where categoria = ?");
            pstmt.setString(1, categoria);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setNomeProduto("nome");
                p.setCategoria("categoria");
                produtos.add(p);
            }

        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                rs.close();
                pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

        return produtos;
    }

    @Override
    public void insere(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void altera(Produto produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
