package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.PessoaDAO;
import model.Pessoa;
import model.Usuario;

public class PostgresqlPessoaDB implements PessoaDAO {
	
	private Connection conn;

    public PostgresqlPessoaDB(Connection conn) {
        this.conn = conn;
    }
    
	@Override
	public List<Pessoa> buscaTodas() {
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();

	        Statement stmt = null;
	        ResultSet rs = null;

	        try {

	            stmt = conn.createStatement();
	            rs = stmt.executeQuery("select * from fornecedor ");

	            while (rs.next()) {
	            	Pessoa p = new Pessoa();
	                p.setId(rs.getInt("id"));
	                p.setNome(rs.getString("nome"));
	                p.setTelefone(rs.getString("telefone"));
	                p.setEmail(rs.getString("email"));
	                p.setEndereco(rs.getString("endereco"));
	                pessoas.add(p);
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

	        return pessoas;
	}

	@Override
	public List<Pessoa> buscaPorNome(String nome) {
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();

	        PreparedStatement pstmt = null;
	        ResultSet rs = null;

	        try {
	        	pstmt = conn.prepareStatement("select * from fornecedor where nome = ?");
				pstmt.setString(1, nome);
				rs = pstmt.executeQuery();
				
	            while (rs.next()) {
	            	Pessoa p = new Pessoa();
	                p.setId(rs.getInt("id"));
	                p.setNome(rs.getString("nome"));
	                p.setTelefone(rs.getString("telefone"));
	                p.setEmail(rs.getString("email"));
	                p.setEndereco(rs.getString("endereco"));
	                pessoas.add(p);
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

	        return pessoas;
	}
	
	@Override
	public Pessoa buscaPorId(int id) {
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();

	        PreparedStatement pstmt = null;
	        ResultSet rs = null;

	        try {

	        	pstmt = conn.prepareStatement("select * from fornecedor where id = ?");
				pstmt.setInt(1, id);
				rs = pstmt.executeQuery();
				
	            while (rs.next()) {
	            	Pessoa p = new Pessoa();
	                p.setId(rs.getInt("id"));
	                p.setNome(rs.getString("nome"));
	                p.setTelefone(rs.getString("telefone"));
	                p.setEmail(rs.getString("email"));
	                p.setEndereco(rs.getString("endereco"));
	                pessoas.add(p);
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

	        return pessoas.get(0);
	}
	@Override
	public void insere(Pessoa pessoa) {
		if (pessoa == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("insert into fornecedor (nome, telefone, email, endereco) values (?, ?, ?, ?)");

            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getTelefone());
            pstmt.setString(3, pessoa.getEmail());
            pstmt.setString(4, pessoa.getEndereco());

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
	public void remove(Pessoa pessoa) {
		 if (pessoa == null) {
	            return;
	        }

	        PreparedStatement pstmt = null;

	        try {
	            pstmt = conn.prepareStatement("delete from fornecedor where id = ?");
	            pstmt.setInt(1, pessoa.getId());
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
	public void altera(Pessoa pessoa) {
		if (pessoa == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("update fornecedor set nome = ?, telefone = ?, email = ?, endereco = ? where id = ? ");

            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getTelefone());
            pstmt.setString(3, pessoa.getEmail());
            pstmt.setString(4, pessoa.getEndereco());
            pstmt.setInt(5, pessoa.getId());

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
