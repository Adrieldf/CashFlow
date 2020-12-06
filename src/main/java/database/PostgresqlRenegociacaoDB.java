/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import dao.RenegociacaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Parcela;
import model.Renegociacao;

public class PostgresqlRenegociacaoDB implements RenegociacaoDAO {

	private Connection conn;

	public PostgresqlRenegociacaoDB(Connection conn) {
		this.conn = conn;
	}

	@Override
	public Renegociacao buscaPorCodigo(int id, int idParcela, int idConta, int idUsuario) {
		List<Renegociacao> renegociacoes = new ArrayList<Renegociacao>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement(
					"select * from renegociacao where id = ? and \"idParcela\" = ? and \"idConta\" = ? and \"idUsuario\" = ?");
			pstmt.setInt(1, id);
			pstmt.setInt(2, idParcela);
			pstmt.setInt(3, idConta);
			pstmt.setInt(4, idUsuario);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Renegociacao r = new Renegociacao();
				r.setIdRenegociacao(rs.getInt("id"));
				r.setId(rs.getInt("idParcela"));
				r.setIdConta(rs.getInt("idConta"));
				r.setNovaData(rs.getString("data"));
				r.setNovoValor(rs.getDouble("valor"));
				r.setDescricao(rs.getString("descricao"));
				r.setValida(rs.getInt("valida") == 1 ? true : false);
				r.setIdUsuario(rs.getInt("idUsuario"));
				renegociacoes.add(r);
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

		return renegociacoes.get(0);
	}

	@Override
	public List<Renegociacao> buscaPorParcela(int idParcela, int idConta, int idUsuario) {
		List<Renegociacao> renegociacoes = new ArrayList<Renegociacao>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from renegociacao where \"idParcela\" = ? and \"idConta\" = ? and \"idUsuario\" = ?");

			pstmt.setInt(1, idParcela);
			pstmt.setInt(2, idConta);
			pstmt.setInt(3, idUsuario);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Renegociacao r = new Renegociacao();
				r.setIdRenegociacao(rs.getInt("id"));
				r.setId(rs.getInt("idParcela"));
				r.setIdConta(rs.getInt("idConta"));
				r.setNovaData(rs.getString("data"));
				r.setNovoValor(rs.getDouble("valor"));
				r.setDescricao(rs.getString("descricao"));
				r.setValida(rs.getInt("valida") == 1 ? true : false);
				r.setIdUsuario(rs.getInt("idUsuario"));
				renegociacoes.add(r);
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

		return renegociacoes;
	}

	@Override
	public List<Renegociacao> buscaPorConta(int idConta, int idUsuario) {
		List<Renegociacao> renegociacoes = new ArrayList<Renegociacao>();

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			pstmt = conn.prepareStatement("select * from renegociacao where \"idConta\" = ? and \"idUsuario\" = ?");

			pstmt.setInt(1, idConta);
			pstmt.setInt(2, idUsuario);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Renegociacao r = new Renegociacao();
				r.setIdRenegociacao(rs.getInt("id"));
				r.setId(rs.getInt("idParcela"));
				r.setIdConta(rs.getInt("idConta"));
				r.setNovaData(rs.getString("data"));
				r.setNovoValor(rs.getDouble("valor"));
				r.setDescricao(rs.getString("descricao"));
				r.setValida(rs.getInt("valida") == 1 ? true : false);
				renegociacoes.add(r);
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

		return renegociacoes;
	}

	@Override
	public void insere(Renegociacao renegociacao) {
		if (renegociacao == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(
					"insert into renegociacao (\"idParcela\", \"idConta\", data, valor, descricao, valida, \"idUsuario\") values (?, ?, ?, ?, ?, ?,?)");

			pstmt.setInt(1, renegociacao.getId());
			pstmt.setInt(2, renegociacao.getIdConta());
			pstmt.setString(3, renegociacao.getNovaData());
			pstmt.setDouble(4, renegociacao.getNovoValor());
			pstmt.setString(5, renegociacao.getDescricao());
			pstmt.setInt(6, renegociacao.isValida() ? 1 : 0);
			pstmt.setInt(7, renegociacao.getIdUsuario());

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
	public void remove(Renegociacao renegociacao) {
		if (renegociacao == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("delete from renegociacao where id = ? and \"idParcela\" = ? and \"idConta\" = ? and \"idUsuario\" = ?");
			pstmt.setInt(1, renegociacao.getIdRenegociacao());
			pstmt.setInt(2, renegociacao.getId());
			pstmt.setInt(3, renegociacao.getIdConta());
			pstmt.setInt(4, renegociacao.getIdUsuario());
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
	public void altera(Renegociacao renegociacao) {
		if (renegociacao == null) {
			return;
		}

		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement("update renegociacao set data = ?, valor = ?, descricao = ?, valida = ? where id = ? and \"idParcela\" = ? and \"idConta\" = ? and \"idUsuario\" = ?");

			
			
			pstmt.setString(1, renegociacao.getNovaData());
			pstmt.setDouble(2, renegociacao.getNovoValor());
			pstmt.setString(3, renegociacao.getDescricao());
			pstmt.setInt(4, renegociacao.isValida() ? 1 : 0);

			pstmt.setInt(5, renegociacao.getIdRenegociacao());
			pstmt.setInt(6, renegociacao.getId());
			pstmt.setInt(7, renegociacao.getIdConta());
			pstmt.setInt(8, renegociacao.getIdUsuario());

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
