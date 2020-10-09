package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.UsuarioDAO;
import model.Usuario;

public class PostgresqlUsuarioDAO implements UsuarioDAO {

	private Connection conn;

    public PostgresqlUsuarioDAO(Connection conn) {
        this.conn = conn;
    }
    
	@Override
	public List<Usuario> buscaTodos() {
		List<Usuario> usuarios = new ArrayList<Usuario>();

        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery(
            		"select u.id as \"idUsuario\", u.\"idPessoa\", u.login, u.senha, p.* " + 
            		"from usuario as u " + 
            		"left outer join \"pessoaFornecedor\" as p on (u.\"idPessoa\" = p.id)");

            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("idUsuario"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setIdPessoa(rs.getInt("idPessoa"));
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

        Statement stmt = null;
        ResultSet rs = null;

        try {

            stmt = conn.createStatement();
            rs = stmt.executeQuery(
            		"select u.id as \"idUsuario\", u.\"idPessoa\", u.login, u.senha, p.* " + 
            		"from usuario as u " + 
            		"left outer join \"pessoaFornecedor\" as p on (u.\"idPessoa\" = p.id) " +
            		 "where u.login = ?");
            
           // stmt.setString(1, login);
            
            while (rs.next()) {
                Usuario u = new Usuario();
                u.setId(rs.getInt("idUsuario"));
                u.setLogin(rs.getString("login"));
                u.setSenha(rs.getString("senha"));
                u.setIdPessoa(rs.getInt("idPessoa"));
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

        return usuarios.get(0);
	}

	@Override
	public void insere(Usuario usuario) {
		  if (usuario == null) {
	            return;
	        }

	        PreparedStatement pstmt = null;

	        try {
	        	PostgresqlPessoaDAO pessoa = new PostgresqlPessoaDAO(this.conn);
	        	pessoa.insere(usuario);
	        	
	        	int idPessoa = 0;//pegar depois de inserir a pessoa
	        	
	        	usuario.setIdPessoa(idPessoa);
	            pstmt = conn.prepareStatement("insert into usuario (\"idPessoa\", login , senha ) values (?, ?, ?)");

	            pstmt.setInt(1, usuario.getIdPessoa());
	            pstmt.setString(2, usuario.getLogin());
	            pstmt.setString(3, usuario.getSenha());

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
		// TODO Auto-generated method stub

	}

}
