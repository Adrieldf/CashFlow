/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.CategoriaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;

public class PostgresqlCategoriaDAO implements CategoriaDAO {
    
    private Connection conn;

    public PostgresqlCategoriaDAO(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public List<Categoria> buscaTodos() {
       List<Categoria> categoria = new ArrayList<Categoria>();

        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt
                    .executeQuery("select nome from categoria");

            while (rs.next()) {
                Categoria p = new Categoria(rs.getString("nome"));

                categoria.add(p);
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

        return categoria;
    }

    @Override
    public void insere(Categoria categoria) {
         if (categoria == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("insert into categoria (nome) values (?)");

            pstmt.setString(1, categoria.getNomeCategoria());

            pstmt.executeUpdate();

        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }}

    @Override
    public void remove(Categoria categoria) {
        if (categoria == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("delete from categoria where categoria = ?");
            pstmt.setString(1, categoria.getNomeCategoria());
            pstmt.executeUpdate();
        } catch (SQLException se) {
            System.out.println("Ocorreu um erro : " + se.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }}

    

}
