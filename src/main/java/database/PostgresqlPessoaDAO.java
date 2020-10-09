package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import dao.PessoaDAO;
import model.Pessoa;

public class PostgresqlPessoaDAO implements PessoaDAO {
	
	private Connection conn;

    public PostgresqlPessoaDAO(Connection conn) {
        this.conn = conn;
    }
    
	@Override
	public List<Pessoa> buscaTodas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pessoa> buscaPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insere(Pessoa pessoa) {
		if (pessoa == null) {
            return;
        }

        PreparedStatement pstmt = null;

        try {
            pstmt = conn.prepareStatement("insert into \"pessoaFornecedor\" (nome, telefone, email, endereco) values (?, ?, ?, ?)");

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
		// TODO Auto-generated method stub

	}

	@Override
	public void altera(Pessoa pessoa) {
		// TODO Auto-generated method stub

	}

}
