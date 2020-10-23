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
import model.Categoria;
import model.Produto;

public class PostgresqlProdutoDB implements ProdutoDAO {

    private Connection conn;

    public PostgresqlProdutoDB(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Produto> buscaTodos() {
        List<Produto> produtos = new ArrayList<Produto>();

        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from produto");

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNomeProduto(rs.getString("nome"));
                p.setCategoria(rs.getInt("idCategoria"));
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
    public List<Produto> buscaPorCategoria(Categoria categoria) {
        List<Produto> produtos = new ArrayList<Produto>();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

            pstmt = conn.prepareStatement("select * from produto where \"idCategoria\" = ?");
            pstmt.setString(1, categoria.getNomeCategoria());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                Produto p = new Produto();
                p.setId(rs.getInt("id"));
                p.setNomeProduto(rs.getString("nome"));
                p.setCategoria(rs.getInt("idCategoria"));
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
	public Produto buscaPorId(int id) {
		 List<Produto> produtos = new ArrayList<Produto>();

	        PreparedStatement pstmt = null;
	        ResultSet rs = null;

	        try {

	        	pstmt = conn.prepareStatement("select * from produto where id = ?");
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
				
	            while (rs.next()) {
	            	 Produto p = new Produto();
	                 p.setId(rs.getInt("id"));
	                 p.setNomeProduto(rs.getString("nome"));
	                 p.setCategoria(rs.getInt("idCategoria"));
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

	        return produtos.get(0);
	}
    
    
    @Override
    public void insere(Produto produto) {
        if (produto == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("insert into produto (nome, \"idCategoria\") values (?,?)");

            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setInt(2, produto.getCategoria());

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
            pstmt = conn.prepareStatement("delete from produto where id = ? and \"idCategoria\" = ?");
            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setInt(2, produto.getCategoria());
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
            pstmt = conn.prepareStatement("update produto set nome = ?, \"idCategoria\" = ? where id = ? and \"idCategoria\" = ?");

            pstmt.setString(1, produto.getNomeProduto());
            pstmt.setInt(2, produto.getCategoria());
            pstmt.setString(3, produto.getNomeProduto());
            pstmt.setInt(4, produto.getCategoria());

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
