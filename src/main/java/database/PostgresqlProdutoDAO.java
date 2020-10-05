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
                    .executeQuery("select produto, categoria from produto");

            while (rs.next()) {
                Produto p = new Produto();
                p.setNomeProduto(rs.getString("produto"));
                p.setCategoria(rs.getString("categoria"));
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

            pstmt = conn.prepareStatement("select produto, categoria from produto where categoria = ?");
            pstmt.setString(1, categoria);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setNomeProduto(rs.getString("produto"));
                p.setCategoria(rs.getString("categoria"));
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
        if (produto == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("insert into produto values (?,?)");

            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setString(2, produto.getCategoria());

            pstmt.executeUpdate();

        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void remove(Produto produto) {
        if (produto == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("delete from produto where produto = ? and categoria = ?");
            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setString(2, produto.getCategoria());
            pstmt.executeUpdate();
        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public void altera(Produto produto) {
        if (produto == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("update produto set produto = ?, categoria = ? where produto = ? and categoria = ?");

            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setString(2, produto.getCategoria());
            pstmt.setString(3, produto.getNomeProduto());
            pstmt.setString(4, produto.getCategoria());

            pstmt.executeUpdate();

        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}
