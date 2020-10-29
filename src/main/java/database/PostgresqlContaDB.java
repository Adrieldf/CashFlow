/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.ContaDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Conta;

public class PostgresqlContaDB implements ContaDAO {

	private Connection conn;

	public PostgresqlContaDB(Connection conn) {
		this.conn = conn;
	}

	@Override
	public Conta buscaConta(int id, int idUsuario) {
		List<Conta> contas = new ArrayList<Conta>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from conta where id = ? and \"idUsuario\" = ?");
			pstmt.setInt(1, id);
			pstmt.setInt(2, idUsuario);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Conta c = new Conta();
				c.setId(rs.getInt("id"));
				c.setIdFornecedor(rs.getInt("idFornecedor"));
				c.setIdUsuario(rs.getInt("idUsuario"));
				c.setTipo(rs.getInt("tipo"));
				c.setDescricao(rs.getString("descricao"));
				c.setIdProduto(rs.getInt("idProduto"));
				contas.add(c);
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

		return contas.get(0);
	}

	@Override
	public List<Conta> buscaTodos(int idUsuario) {
		List<Conta> contas = new ArrayList<Conta>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from conta where \"idUsuario\" = ?");
			pstmt.setInt(1, idUsuario);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Conta c = new Conta();
				c.setId(rs.getInt("id"));
				c.setIdFornecedor(rs.getInt("idFornecedor"));
				c.setIdUsuario(rs.getInt("idUsuario"));
				c.setTipo(rs.getInt("tipo"));
				c.setDescricao(rs.getString("descricao"));
				c.setIdProduto(rs.getInt("idProduto"));
				contas.add(c);
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

		return contas;
	}

	@Override
	public List<Conta> buscaContaPorTipo(int tipo, int idUsuario) {
		List<Conta> contas = new ArrayList<Conta>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from conta where tipo = ? and \"idUsuario\" = ?");
			pstmt.setInt(1, tipo);
			pstmt.setInt(2, idUsuario);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Conta c = new Conta();
				c.setId(rs.getInt("id"));
				c.setIdFornecedor(rs.getInt("idFornecedor"));
				c.setIdUsuario(rs.getInt("idUsuario"));
				c.setTipo(rs.getInt("tipo"));
				c.setDescricao(rs.getString("descricao"));
				c.setIdProduto(rs.getInt("idProduto"));
				contas.add(c);
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

		return contas;
	}

	@Override
	public void insere(Conta conta) {
		if (conta == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(
					"insert into conta (\"idFornecedor\", \"idUsuario\", tipo, descricao, \"idProduto\") values (?, ?, ?, ?)");

			pstmt.setInt(1, conta.getIdFornecedor());
			pstmt.setInt(2, conta.getIdUsuario());
			pstmt.setInt(3, conta.getTipo());
			pstmt.setString(4, conta.getDescricao());
			pstmt.setInt(5, conta.getIdProduto());

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
	public void remove(Conta conta) {
		if (conta == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("delete from conta where id = ?");
			pstmt.setInt(1, conta.getId());
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
	public void altera(Conta conta) {
		if (conta == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(
					"update conta set \"idFornecedor\" = ?, tipo = ?, descricao = ?, \"idProduto\" = ? where id = ? and \"idUsuario\" = ?");

			pstmt.setInt(1, conta.getIdFornecedor());
			pstmt.setInt(2, conta.getTipo());
			pstmt.setString(3, conta.getDescricao());
			pstmt.setInt(4, conta.getIdProduto());
			pstmt.setInt(5, conta.getId());
			pstmt.setInt(6, conta.getIdUsuario());

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
