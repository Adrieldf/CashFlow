/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.FornecedorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Fornecedor;
import model.Usuario;

public class PostgresqlFornecedorDB implements FornecedorDAO{
    
    private Connection conn;

    public PostgresqlFornecedorDB(Connection conn) {
        this.conn = conn;
    }
    
    @Override
    public List<Fornecedor> buscaTodos(int idUsuario) {
    	  List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

          PreparedStatement pstmt = null;
          ResultSet rs = null;

          try {

        		pstmt = conn.prepareStatement("select * from fornecedor where \"idUsuario\" = ?");
                pstmt.setInt(1, idUsuario);
                rs = pstmt.executeQuery();
                
              while (rs.next()) {
            	  fornecedores.add(new Fornecedor(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("email"), rs.getString("endereco"), rs.getInt("idUsuario")));
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

          return fornecedores;
    }

    @Override
    public Fornecedor buscaFornecedor(String nomeFornecedor, int idUsuario) {
    	  List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

          PreparedStatement pstmt = null;
          ResultSet rs = null;

          try {

        		pstmt = conn.prepareStatement("select * from fornecedor where \"idUsuario\" = ? and nome = ?");
                pstmt.setInt(1, idUsuario);
                pstmt.setString(2, nomeFornecedor);
                rs = pstmt.executeQuery();
                
              while (rs.next()) {
            	  fornecedores.add(new Fornecedor(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("email"), rs.getString("endereco"), rs.getInt("idUsuario")));
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

          return fornecedores.get(0);
    }
    
    @Override
	public Fornecedor buscaFornecedorPorId(int id, int idUsuario) {
    	List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

      		pstmt = conn.prepareStatement("select * from fornecedor where \"idUsuario\" = ? and id = ?");
              pstmt.setInt(1, idUsuario);
              pstmt.setInt(2, id);
              rs = pstmt.executeQuery();
              
            while (rs.next()) {
          	  fornecedores.add(new Fornecedor(rs.getInt("id"), rs.getString("nome"), rs.getString("telefone"), rs.getString("email"), rs.getString("endereco"), rs.getInt("idUsuario")));
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

        return fornecedores.get(0);
	}
    
    @Override
    public void insere(Fornecedor fornecedor) {
    	 if (fornecedor == null) {
             return;
         }

         PreparedStatement pstmt = null;

         try {
             pstmt = conn.prepareStatement("insert into fornecedor (nome, telefone, email, endereco, \"idUsuario\") values (?, ?, ?, ?, ?)");

             pstmt.setString(1, fornecedor.getNome());
             pstmt.setString(2, fornecedor.getTelefone());
             pstmt.setString(3, fornecedor.getEmail());
             pstmt.setString(4, fornecedor.getEndereco());
             pstmt.setInt(5, fornecedor.getIdUsuario());

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
    public void remove(Fornecedor fornecedor) {
    	if (fornecedor == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("delete from fornecedor where id = ? and \"idUsuario\" = ?");
            pstmt.setInt(1, fornecedor.getId());
            pstmt.setInt(2, fornecedor.getIdUsuario());
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
    public void altera(Fornecedor fornecedor) {
    	if (fornecedor == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("update fornecedor set nome = ?, telefone = ?, email = ?, endereco = ? where id = ? and \"idUsuario\" = ?");

            pstmt.setString(1, fornecedor.getNome());
            pstmt.setString(2, fornecedor.getTelefone());
            pstmt.setString(3, fornecedor.getEmail());
            pstmt.setString(4, fornecedor.getEndereco());
            pstmt.setInt(5, fornecedor.getId());
            pstmt.setInt(6, fornecedor.getIdUsuario());

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
