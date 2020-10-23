package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import model.Produto;
import model.Usuario;

public class PostgresqlUsuarioDB implements UsuarioDAO {

    private Connection conn;

    public PostgresqlUsuarioDB(Connection conn) {
        this.conn = conn;
    }

    @Override
    public List<Usuario> buscaTodos() {
        List<Usuario> usuarios = new ArrayList<Usuario>();

        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery("select * from usuario as u ");

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setTelefone(rs.getString("telefone"));
                u.setEmail(rs.getString("email"));
                u.setEndereco(rs.getString("endereco"));
                usuarios.add(u);
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

        return usuarios;
    }

    @Override
    public Usuario buscaPorLogin(String login) {
        List<Usuario> usuarios = new ArrayList<Usuario>();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {

        	pstmt = conn.prepareStatement("select * from usuario as u where u.login = ?");
            pstmt.setString(1, login);
            rs = pstmt.executeQuery();
            
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("id"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setNome(rs.getString("nome"));
                u.setTelefone(rs.getString("telefone"));
                u.setEmail(rs.getString("email"));
                u.setEndereco(rs.getString("endereco"));
                usuarios.add(u);
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

        return usuarios.get(0);
    }

    @Override
   	public Usuario buscaPorId(int id) {
   		 List<Usuario> usuarios = new ArrayList<Usuario>();

   	        PreparedStatement pstmt = null;
   	        ResultSet rs = null;

   	        try {

   	        	pstmt = conn.prepareStatement("select * from usuario where id = ?");
   				pstmt.setInt(1, id);
   				rs = pstmt.executeQuery();
   				
   	            while (rs.next()) {
   	            	Usuario u = new Usuario();
   	                u.setId(rs.getInt("id"));
   	                u.setLogin(rs.getString("login"));
   	                u.setSenha(rs.getString("senha"));
   	                u.setNome(rs.getString("nome"));
   	                u.setTelefone(rs.getString("telefone"));
   	                u.setEmail(rs.getString("email"));
   	                u.setEndereco(rs.getString("endereco"));
   	                usuarios.add(u);
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

   	        return usuarios.get(0);
   	}

    
    
    @Override
    public void insere(Usuario usuario) {
        if (usuario == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("insert into usuario (login, senha, nome, telefone, email, endereco) values (?, ?, ?, ?, ?, ?)");

            pstmt.setString(1, usuario.getLogin());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getNome());
            pstmt.setString(4, usuario.getTelefone());
            pstmt.setString(5, usuario.getEmail());
            pstmt.setString(6, usuario.getEndereco());

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
    public void remove(Usuario usuario) {
        if (usuario == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("delete from usuario where id = ?");
            pstmt.setInt(1, usuario.getId());
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
    public void altera(Usuario usuario) {
    	if (usuario == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("update usuario set login = ?, senha = ?, nome = ?, telefone = ?, email = ?, endereco = ? where id = ? ");

            pstmt.setString(1, usuario.getLogin());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getNome());
            pstmt.setString(4, usuario.getTelefone());
            pstmt.setString(5, usuario.getEmail());
            pstmt.setString(6, usuario.getEndereco());
            pstmt.setInt(7, usuario.getId());

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
